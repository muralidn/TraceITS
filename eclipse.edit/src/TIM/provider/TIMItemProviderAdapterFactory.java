/**
 */
package TIM.provider;

import TIM.util.TIMAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TIMItemProviderAdapterFactory extends TIMAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIMItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link TIM.GlobalTraceModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalTraceModelItemProvider globalTraceModelItemProvider;

	/**
	 * This creates an adapter for a {@link TIM.GlobalTraceModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGlobalTraceModelAdapter() {
		if (globalTraceModelItemProvider == null) {
			globalTraceModelItemProvider = new GlobalTraceModelItemProvider(this);
		}

		return globalTraceModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link TIM.GTMController} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GTMControllerItemProvider gtmControllerItemProvider;

	/**
	 * This creates an adapter for a {@link TIM.GTMController}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGTMControllerAdapter() {
		if (gtmControllerItemProvider == null) {
			gtmControllerItemProvider = new GTMControllerItemProvider(this);
		}

		return gtmControllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link TIM.LTMController} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LTMControllerItemProvider ltmControllerItemProvider;

	/**
	 * This creates an adapter for a {@link TIM.LTMController}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLTMControllerAdapter() {
		if (ltmControllerItemProvider == null) {
			ltmControllerItemProvider = new LTMControllerItemProvider(this);
		}

		return ltmControllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link TIM.GTMVersion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GTMVersionItemProvider gtmVersionItemProvider;

	/**
	 * This creates an adapter for a {@link TIM.GTMVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGTMVersionAdapter() {
		if (gtmVersionItemProvider == null) {
			gtmVersionItemProvider = new GTMVersionItemProvider(this);
		}

		return gtmVersionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link TIM.Change_Request_Ticket} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Change_Request_TicketItemProvider change_Request_TicketItemProvider;

	/**
	 * This creates an adapter for a {@link TIM.Change_Request_Ticket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChange_Request_TicketAdapter() {
		if (change_Request_TicketItemProvider == null) {
			change_Request_TicketItemProvider = new Change_Request_TicketItemProvider(this);
		}

		return change_Request_TicketItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link TIM.Derive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeriveItemProvider deriveItemProvider;

	/**
	 * This creates an adapter for a {@link TIM.Derive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeriveAdapter() {
		if (deriveItemProvider == null) {
			deriveItemProvider = new DeriveItemProvider(this);
		}

		return deriveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link TIM.Implement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementItemProvider implementItemProvider;

	/**
	 * This creates an adapter for a {@link TIM.Implement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImplementAdapter() {
		if (implementItemProvider == null) {
			implementItemProvider = new ImplementItemProvider(this);
		}

		return implementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link TIM.Verify} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerifyItemProvider verifyItemProvider;

	/**
	 * This creates an adapter for a {@link TIM.Verify}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVerifyAdapter() {
		if (verifyItemProvider == null) {
			verifyItemProvider = new VerifyItemProvider(this);
		}

		return verifyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link TIM.SystemRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemRequirementItemProvider systemRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link TIM.SystemRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemRequirementAdapter() {
		if (systemRequirementItemProvider == null) {
			systemRequirementItemProvider = new SystemRequirementItemProvider(this);
		}

		return systemRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link TIM.FunctionalRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalRequirementItemProvider functionalRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link TIM.FunctionalRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionalRequirementAdapter() {
		if (functionalRequirementItemProvider == null) {
			functionalRequirementItemProvider = new FunctionalRequirementItemProvider(this);
		}

		return functionalRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link TIM.Model} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelItemProvider modelItemProvider;

	/**
	 * This creates an adapter for a {@link TIM.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelAdapter() {
		if (modelItemProvider == null) {
			modelItemProvider = new ModelItemProvider(this);
		}

		return modelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link TIM.Test} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestItemProvider testItemProvider;

	/**
	 * This creates an adapter for a {@link TIM.Test}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestAdapter() {
		if (testItemProvider == null) {
			testItemProvider = new TestItemProvider(this);
		}

		return testItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (globalTraceModelItemProvider != null) globalTraceModelItemProvider.dispose();
		if (gtmControllerItemProvider != null) gtmControllerItemProvider.dispose();
		if (ltmControllerItemProvider != null) ltmControllerItemProvider.dispose();
		if (gtmVersionItemProvider != null) gtmVersionItemProvider.dispose();
		if (change_Request_TicketItemProvider != null) change_Request_TicketItemProvider.dispose();
		if (deriveItemProvider != null) deriveItemProvider.dispose();
		if (implementItemProvider != null) implementItemProvider.dispose();
		if (verifyItemProvider != null) verifyItemProvider.dispose();
		if (systemRequirementItemProvider != null) systemRequirementItemProvider.dispose();
		if (functionalRequirementItemProvider != null) functionalRequirementItemProvider.dispose();
		if (modelItemProvider != null) modelItemProvider.dispose();
		if (testItemProvider != null) testItemProvider.dispose();
	}

}