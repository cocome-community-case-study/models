/**
 */
package security.securityPatterns.provider;


import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import security.provider.SecurityEditPlugin;

import security.securityPatterns.SecurityPattern;
import security.securityPatterns.SecurityPatternsFactory;
import security.securityPatterns.SecurityPatternsPackage;

/**
 * This is the item provider adapter for a {@link security.securityPatterns.SecurityPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPatternItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPatternItemProvider(AdapterFactory adapterFactory) {
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
			addStakeholderPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addPrerequisitesPropertyDescriptor(object);
			addSubSecurityPatternsPropertyDescriptor(object);
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
				 getString("_UI_SecurityPattern_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecurityPattern_name_feature", "_UI_SecurityPattern_type"),
				 SecurityPatternsPackage.Literals.SECURITY_PATTERN__NAME,
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
				 getString("_UI_SecurityPattern_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecurityPattern_description_feature", "_UI_SecurityPattern_type"),
				 SecurityPatternsPackage.Literals.SECURITY_PATTERN__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stakeholder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStakeholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecurityPattern_stakeholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecurityPattern_stakeholder_feature", "_UI_SecurityPattern_type"),
				 SecurityPatternsPackage.Literals.SECURITY_PATTERN__STAKEHOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecurityPattern_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecurityPattern_status_feature", "_UI_SecurityPattern_type"),
				 SecurityPatternsPackage.Literals.SECURITY_PATTERN__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_SecurityPattern_prerequisites_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecurityPattern_prerequisites_feature", "_UI_SecurityPattern_type"),
				 SecurityPatternsPackage.Literals.SECURITY_PATTERN__PREREQUISITES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Security Patterns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubSecurityPatternsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecurityPattern_subSecurityPatterns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecurityPattern_subSecurityPatterns_feature", "_UI_SecurityPattern_type"),
				 SecurityPatternsPackage.Literals.SECURITY_PATTERN__SUB_SECURITY_PATTERNS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(SecurityPatternsPackage.Literals.SECURITY_PATTERN__ROLES);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SecurityPattern)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SecurityPattern_type") :
			getString("_UI_SecurityPattern_type") + " " + label;
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

		switch (notification.getFeatureID(SecurityPattern.class)) {
			case SecurityPatternsPackage.SECURITY_PATTERN__NAME:
			case SecurityPatternsPackage.SECURITY_PATTERN__DESCRIPTION:
			case SecurityPatternsPackage.SECURITY_PATTERN__STAKEHOLDER:
			case SecurityPatternsPackage.SECURITY_PATTERN__STATUS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SecurityPatternsPackage.SECURITY_PATTERN__ROLES:
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
				(SecurityPatternsPackage.Literals.SECURITY_PATTERN__ROLES,
				 SecurityPatternsFactory.eINSTANCE.createComponentRole()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityPatternsPackage.Literals.SECURITY_PATTERN__ROLES,
				 SecurityPatternsFactory.eINSTANCE.createProvidedInterfaceRole()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityPatternsPackage.Literals.SECURITY_PATTERN__ROLES,
				 SecurityPatternsFactory.eINSTANCE.createAssemblyRole()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityPatternsPackage.Literals.SECURITY_PATTERN__ROLES,
				 SecurityPatternsFactory.eINSTANCE.createSystemRole()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityPatternsPackage.Literals.SECURITY_PATTERN__ROLES,
				 SecurityPatternsFactory.eINSTANCE.createContainerRole()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityPatternsPackage.Literals.SECURITY_PATTERN__ROLES,
				 SecurityPatternsFactory.eINSTANCE.createEnvironmentRole()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityPatternsPackage.Literals.SECURITY_PATTERN__ROLES,
				 SecurityPatternsFactory.eINSTANCE.createUsageRole()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityPatternsPackage.Literals.SECURITY_PATTERN__ROLES,
				 SecurityPatternsFactory.eINSTANCE.createAllocationRole()));
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
