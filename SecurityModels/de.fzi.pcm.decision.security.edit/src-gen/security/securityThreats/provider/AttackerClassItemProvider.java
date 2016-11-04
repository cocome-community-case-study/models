/**
 */
package security.securityThreats.provider;


import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import security.provider.SecurityEditPlugin;

import security.securityThreats.AttackerClass;
import security.securityThreats.SecurityThreatsPackage;

/**
 * This is the item provider adapter for a {@link security.securityThreats.AttackerClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttackerClassItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerClassItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addPositionPropertyDescriptor(object);
			addIntentionPropertyDescriptor(object);
			addAttackCapabilitiesPropertyDescriptor(object);
			addPrerequisitesPropertyDescriptor(object);
			addActivityPropertyDescriptor(object);
			addFocusPropertyDescriptor(object);
			addMotivationPropertyDescriptor(object);
			addTimeConstraintsPropertyDescriptor(object);
			addStealthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttackerClass_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttackerClass_name_feature", "_UI_AttackerClass_type"),
				 SecurityThreatsPackage.Literals.ATTACKER_CLASS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttackerClass_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttackerClass_description_feature", "_UI_AttackerClass_type"),
				 SecurityThreatsPackage.Literals.ATTACKER_CLASS__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttackerClass_position_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttackerClass_position_feature", "_UI_AttackerClass_type"),
				 SecurityThreatsPackage.Literals.ATTACKER_CLASS__POSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Intention feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntentionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttackerClass_intention_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttackerClass_intention_feature", "_UI_AttackerClass_type"),
				 SecurityThreatsPackage.Literals.ATTACKER_CLASS__INTENTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attack Capabilities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttackCapabilitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttackerClass_attackCapabilities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttackerClass_attackCapabilities_feature", "_UI_AttackerClass_type"),
				 SecurityThreatsPackage.Literals.ATTACKER_CLASS__ATTACK_CAPABILITIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prerequisites feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrerequisitesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttackerClass_prerequisites_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttackerClass_prerequisites_feature", "_UI_AttackerClass_type"),
				 SecurityThreatsPackage.Literals.ATTACKER_CLASS__PREREQUISITES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttackerClass_activity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttackerClass_activity_feature", "_UI_AttackerClass_type"),
				 SecurityThreatsPackage.Literals.ATTACKER_CLASS__ACTIVITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Focus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFocusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttackerClass_focus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttackerClass_focus_feature", "_UI_AttackerClass_type"),
				 SecurityThreatsPackage.Literals.ATTACKER_CLASS__FOCUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Motivation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMotivationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttackerClass_motivation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttackerClass_motivation_feature", "_UI_AttackerClass_type"),
				 SecurityThreatsPackage.Literals.ATTACKER_CLASS__MOTIVATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Constraints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeConstraintsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttackerClass_timeConstraints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttackerClass_timeConstraints_feature", "_UI_AttackerClass_type"),
				 SecurityThreatsPackage.Literals.ATTACKER_CLASS__TIME_CONSTRAINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stealth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStealthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttackerClass_stealth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttackerClass_stealth_feature", "_UI_AttackerClass_type"),
				 SecurityThreatsPackage.Literals.ATTACKER_CLASS__STEALTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AttackerClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AttackerClass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AttackerClass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AttackerClass_type") :
			getString("_UI_AttackerClass_type") + " " + label;
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

		switch (notification.getFeatureID(AttackerClass.class)) {
			case SecurityThreatsPackage.ATTACKER_CLASS__NAME:
			case SecurityThreatsPackage.ATTACKER_CLASS__DESCRIPTION:
			case SecurityThreatsPackage.ATTACKER_CLASS__POSITION:
			case SecurityThreatsPackage.ATTACKER_CLASS__INTENTION:
			case SecurityThreatsPackage.ATTACKER_CLASS__ACTIVITY:
			case SecurityThreatsPackage.ATTACKER_CLASS__FOCUS:
			case SecurityThreatsPackage.ATTACKER_CLASS__MOTIVATION:
			case SecurityThreatsPackage.ATTACKER_CLASS__TIME_CONSTRAINTS:
			case SecurityThreatsPackage.ATTACKER_CLASS__STEALTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
