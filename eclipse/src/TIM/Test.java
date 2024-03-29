/**
 */
package TIM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TIM.Test#getUpstreamTraceLinks <em>Upstream Trace Links</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getTest()
 * @model annotation="gmf.node label.pattern='{0}, Progress: {1}' color='0,0,125'"
 * @generated
 */
public interface Test extends Artifact {
	/**
	 * Returns the value of the '<em><b>Upstream Trace Links</b></em>' reference list.
	 * The list contents are of type {@link TIM.Verify}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstream Trace Links</em>' reference list.
	 * @see TIM.TIMPackage#getTest_UpstreamTraceLinks()
	 * @model
	 * @generated
	 */
	EList<Verify> getUpstreamTraceLinks();

} // Test
