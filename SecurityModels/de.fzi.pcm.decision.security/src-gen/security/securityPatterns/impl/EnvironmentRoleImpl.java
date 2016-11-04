/**
 */
package security.securityPatterns.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

import security.securityPatterns.EnvironmentRole;
import security.securityPatterns.SecurityPatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.impl.EnvironmentRoleImpl#getResourceEnvironment <em>Resource Environment</em>}</li>
 *   <li>{@link security.securityPatterns.impl.EnvironmentRoleImpl#getLinkingResource <em>Linking Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentRoleImpl extends RoleImpl implements EnvironmentRole {
	/**
	 * The cached value of the '{@link #getResourceEnvironment() <em>Resource Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceEnvironment()
	 * @generated
	 * @ordered
	 */
	protected ResourceEnvironment resourceEnvironment;

	/**
	 * The cached value of the '{@link #getLinkingResource() <em>Linking Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkingResource()
	 * @generated
	 * @ordered
	 */
	protected LinkingResource linkingResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPatternsPackage.Literals.ENVIRONMENT_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvironment getResourceEnvironment() {
		if (resourceEnvironment != null && ((EObject)resourceEnvironment).eIsProxy()) {
			InternalEObject oldResourceEnvironment = (InternalEObject)resourceEnvironment;
			resourceEnvironment = (ResourceEnvironment)eResolveProxy(oldResourceEnvironment);
			if (resourceEnvironment != oldResourceEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPatternsPackage.ENVIRONMENT_ROLE__RESOURCE_ENVIRONMENT, oldResourceEnvironment, resourceEnvironment));
			}
		}
		return resourceEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvironment basicGetResourceEnvironment() {
		return resourceEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEnvironment(ResourceEnvironment newResourceEnvironment) {
		ResourceEnvironment oldResourceEnvironment = resourceEnvironment;
		resourceEnvironment = newResourceEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPatternsPackage.ENVIRONMENT_ROLE__RESOURCE_ENVIRONMENT, oldResourceEnvironment, resourceEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkingResource getLinkingResource() {
		if (linkingResource != null && ((EObject)linkingResource).eIsProxy()) {
			InternalEObject oldLinkingResource = (InternalEObject)linkingResource;
			linkingResource = (LinkingResource)eResolveProxy(oldLinkingResource);
			if (linkingResource != oldLinkingResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPatternsPackage.ENVIRONMENT_ROLE__LINKING_RESOURCE, oldLinkingResource, linkingResource));
			}
		}
		return linkingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkingResource basicGetLinkingResource() {
		return linkingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkingResource(LinkingResource newLinkingResource) {
		LinkingResource oldLinkingResource = linkingResource;
		linkingResource = newLinkingResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPatternsPackage.ENVIRONMENT_ROLE__LINKING_RESOURCE, oldLinkingResource, linkingResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPatternsPackage.ENVIRONMENT_ROLE__RESOURCE_ENVIRONMENT:
				if (resolve) return getResourceEnvironment();
				return basicGetResourceEnvironment();
			case SecurityPatternsPackage.ENVIRONMENT_ROLE__LINKING_RESOURCE:
				if (resolve) return getLinkingResource();
				return basicGetLinkingResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecurityPatternsPackage.ENVIRONMENT_ROLE__RESOURCE_ENVIRONMENT:
				setResourceEnvironment((ResourceEnvironment)newValue);
				return;
			case SecurityPatternsPackage.ENVIRONMENT_ROLE__LINKING_RESOURCE:
				setLinkingResource((LinkingResource)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SecurityPatternsPackage.ENVIRONMENT_ROLE__RESOURCE_ENVIRONMENT:
				setResourceEnvironment((ResourceEnvironment)null);
				return;
			case SecurityPatternsPackage.ENVIRONMENT_ROLE__LINKING_RESOURCE:
				setLinkingResource((LinkingResource)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SecurityPatternsPackage.ENVIRONMENT_ROLE__RESOURCE_ENVIRONMENT:
				return resourceEnvironment != null;
			case SecurityPatternsPackage.ENVIRONMENT_ROLE__LINKING_RESOURCE:
				return linkingResource != null;
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentRoleImpl
