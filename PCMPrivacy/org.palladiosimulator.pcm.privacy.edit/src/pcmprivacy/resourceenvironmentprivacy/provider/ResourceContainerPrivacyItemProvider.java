/**
 */
package pcmprivacy.resourceenvironmentprivacy.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import org.palladiosimulator.pcm.resourceenvironment.provider.ResourceContainerItemProvider;

import pcmprivacy.resourceenvironmentprivacy.ResourceContainerPrivacy;
import pcmprivacy.resourceenvironmentprivacy.ResourceenvironmentprivacyFactory;
import pcmprivacy.resourceenvironmentprivacy.ResourceenvironmentprivacyPackage;

/**
 * This is the item provider adapter for a {@link pcmprivacy.resourceenvironmentprivacy.ResourceContainerPrivacy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceContainerPrivacyItemProvider extends ResourceContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainerPrivacyItemProvider(AdapterFactory adapterFactory) {
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

			addGeolocationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Geolocation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeolocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceContainerPrivacy_Geolocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceContainerPrivacy_Geolocation_feature", "_UI_ResourceContainerPrivacy_type"),
				 ResourceenvironmentprivacyPackage.Literals.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ResourceContainerPrivacy.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResourceContainerPrivacy"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResourceContainerPrivacy)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ResourceContainerPrivacy_type") :
			getString("_UI_ResourceContainerPrivacy_type") + " " + label;
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

		switch (notification.getFeatureID(ResourceContainerPrivacy.class)) {
			case ResourceenvironmentprivacyPackage.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION:
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

		newChildDescriptors.add
			(createChildParameter
				(ResourceenvironmentPackage.Literals.RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER,
				 ResourceenvironmentprivacyFactory.eINSTANCE.createResourceContainerPrivacy()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PcmprivacyEditPlugin.INSTANCE;
	}

}
