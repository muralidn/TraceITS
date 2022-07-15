package eclipse;

import java.sql.*;
import java.util.HashMap;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.time.LocalDateTime;

public class TracConnector {
	Connection dbConnection = null;

	public int trac_Connect(String tracProjectRoot) {
		try {
			Path tracRoot = Paths.get(tracProjectRoot).resolve("db").normalize();
			Class.forName("org.sqlite.JDBC");

			dbConnection = DriverManager.getConnection("jdbc:sqlite:" + tracRoot.toString());
			dbConnection.setAutoCommit(false);

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			return -1;
		}
		System.out.println("Trac Connection Successful");
		return 0;
	}

	public HashMap<Integer, Ticket> queryTickets(HashMap<Integer, Ticket> tickets, boolean updateValues,
			boolean filterClosed) {
		Statement stmt = null;
		try {
			stmt = dbConnection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * from ticket inner join ticket_custom WHERE\r\n"
					+ "ticket.id = ticket_custom.ticket\r\n" + "order by ticket asc");

			while (rs.next()) {

				if (rs.getString("status").equals("closed") == false) {
					Ticket temp = new Ticket();
					int ticketIDInt = rs.getInt("id");

					if (tickets.containsKey(ticketIDInt) == false || (updateValues)) {

						temp.id = rs.getInt("id");
						temp.description = rs.getString("description");
						temp.summary = rs.getString("summary");
						temp.version = rs.getString("version");

						int i = 0;
						while (i < 3) {

							String fieldType = rs.getString("name");
							if (fieldType.equals("actual_loe_tb"))
								temp.actualLOEHrs = rs.getFloat("value");
							else if (fieldType.equals("feedback_radio"))
								temp.timFeedback = rs.getString("value");
							else if (fieldType.equals("merge_rationale_ta"))
								temp.mergeRationale = rs.getString("value");
							else if (fieldType.equals("planned_loe_tb"))
								temp.plannedLOEHrs = rs.getFloat("value");
							else
								System.out.println("UNKNOWN FIELD!!");

							rs.next();
							i++;
						}

						if (tickets.containsKey(ticketIDInt)) {
							if (updateValues)
								tickets.replace(ticketIDInt, temp);
						} else
							tickets.put(ticketIDInt, temp);
					}
				}
			}
			rs.close();

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			return null;
		}
		return tickets;

	}

	public Ticket CreateNewTicket(String version) {
		String sql = "INSERT INTO ticket(type,time,changetime,version, status,summary,description) VALUES (?,?,?,?,?,?,?)";
		Ticket newTicket = new Ticket();

		try {

			newTicket.summary = "Autogenerated Ticket from GTM";
			newTicket.description = "This CR has been automatically generated from the GTM on " + LocalDateTime.now();
			newTicket.version = version;

			long epoch = System.currentTimeMillis() * 1000;
			PreparedStatement pstmt = dbConnection.prepareStatement(sql);
			pstmt.setString(1, "defect");
			pstmt.setLong(2, epoch);
			pstmt.setLong(3, epoch);
			pstmt.setString(4, newTicket.version);
			pstmt.setString(5, "new");
			pstmt.setString(6, newTicket.summary);
			pstmt.setString(7, newTicket.description);

			int rowsInserted = pstmt.executeUpdate();
			if (rowsInserted == 1) {
				Statement stmt = dbConnection.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * from ticket WHERE ticket.time = " + epoch);

				while (rs.next()) {
					newTicket.id = rs.getInt("id");
					break;
				}

				sql = "INSERT INTO ticket_custom(ticket,name,value) VALUES (?,?,?),(?,?,?),(?,?,?),(?,?,?)";
				pstmt = dbConnection.prepareStatement(sql);
				pstmt.setInt(1, newTicket.id);
				pstmt.setString(2, "feedback_radio");
				pstmt.setString(3, "NO");
				pstmt.setInt(4, newTicket.id);
				pstmt.setString(5, "merge_rationale_ta");
				pstmt.setString(6, "");
				pstmt.setInt(7, newTicket.id);
				pstmt.setString(8, "planned_loe_tb");
				pstmt.setString(9, "");
				pstmt.setInt(10, newTicket.id);
				pstmt.setString(11, "actual_loe_tb");
				pstmt.setString(12, "");

				rowsInserted = pstmt.executeUpdate();
				if (rowsInserted == 4) {
					System.out.println("Successfully created new ticket!!");
				} else {
					System.out.println("ERROR!");
				}

				rs.close();
				dbConnection.commit();
			}

			else {
				System.out.println("ERROR!");

			}
			pstmt.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			newTicket = null;
		}

		return newTicket;
	}
}
