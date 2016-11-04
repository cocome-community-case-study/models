/**
 */
package security.securityThreats.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import security.provider.CatalogItemProvider;
import security.provider.SecurityEditPlugin;

import security.securityThreats.SecurityThreatsFactory;
import security.securityThreats.SecurityThreatsPackage;
import security.securityThreats.ThreatCatalog;

/**
 * This is the item provider adapter for a {@link security.securityThreats.ThreatCatalog} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreatCatalogItemProvider extends CatalogItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatCatalogItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SecurityThreatsPackage.Literals.THREAT_CATALOG__ATTACKERS);
			childrenFeatures.add(SecurityThreatsPackage.Literals.THREAT_CATALOG__ATTACK_TYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ThreatCatalog.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ThreatCatalog"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ThreatCatalog)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ThreatCatalog_type") :
			getString("_UI_ThreatCatalog_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ThreatCatalog.class)) {
			case SecurityThreatsPackage.THREAT_CATALOG__ATTACKERS:
			case SecurityThreatsPackage.THREAT_CATALOG__ATTACK_TYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SecurityThreatsPackage.Literals.THREAT_CATALOG__ATTACKERS,
				 SecurityThreatsFactory.eINSTANCE.createAttackerClass()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityThreatsPackage.Literals.THREAT_CATALOG__ATTACK_TYPES,
				 SecurityThreatsFactory.eINSTANCE.createAttack()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityThreatsPackage.Literals.THREAT_CATALOG__ATTACK_TYPES,
				 SecurityThreatsFactory.eINSTANCE.createComponentAttack()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityThreatsPackage.Literals.THREAT_CATALOG__ATTACK_TYPES,
				 SecurityThreatsFactory.eINSTANCE.createSystemAttack()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityThreatsPackage.Literals.THREAT_CATALOG__ATTACK_TYPES,
				 SecurityThreatsFactory.eINSTANCE.createResourceAttack()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityThreatsPackage.Literals.THREAT_CATALOG__ATTACK_TYPES,
				 SecurityThreatsFactory.eINSTANCE.createAllocationAttack()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityThreatsPackage.Literals.THREAT_CATALOG__ATTACK_TYPES,
				 SecurityThreatsFactory.eINSTANCE.createUsageAttack()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SecurityEditPlugin.INSTANCE;
	}

}
