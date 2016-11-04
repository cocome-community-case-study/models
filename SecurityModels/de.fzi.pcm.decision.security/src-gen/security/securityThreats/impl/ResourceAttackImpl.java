/**
 */
package security.securityThreats.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import security.securityThreats.ResourceAttack;
import security.securityThreats.SecurityThreatsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Attack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.impl.ResourceAttackImpl#getResourceContainer <em>Resource Container</em>}</li>
 *   <li>{@link security.securityThreats.impl.ResourceAttackImpl#getLinkingResource <em>Linking Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceAttackImpl extends AttackImpl implements ResourceAttack {
	/**
	 * The cached value of the '{@link #getResourceContainer() <em>Resource Container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceContainer> resourceContainer;

	/**
	 * The cached value of the '{@link #getLinkingResource() <em>Linking Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkingResource()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkingResource> linkingResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAttackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityThreatsPackage.Literals.RESOURCE_ATTACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceContainer> getResourceContainer() {
		if (resourceContainer == null) {
			resourceContainer = new EObjectResolvingEList<ResourceContainer>(ResourceContainer.class, this, SecurityThreatsPackage.RESOURCE_ATTACK__RESOURCE_CONTAINER);
		}
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkingResource> getLinkingResource() {
		if (linkingResource == null) {
			linkingResource = new EObjectResolvingEList<LinkingResource>(LinkingResource.class, this, SecurityThreatsPackage.RESOURCE_ATTACK__LINKING_RESOURCE);
		}
		return linkingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityThreatsPackage.RESOURCE_ATTACK__RESOURCE_CONTAINER:
				return getResourceContainer();
			case SecurityThreatsPackage.RESOURCE_ATTACK__LINKING_RESOURCE:
				return getLinkingResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecurityThreatsPackage.RESOURCE_ATTACK__RESOURCE_CONTAINER:
				getResourceContainer().clear();
				getResourceContainer().addAll((Collection<? extends ResourceContainer>)newValue);
				return;
			case SecurityThreatsPackage.RESOURCE_ATTACK__LINKING_RESOURCE:
				getLinkingResource().clear();
				getLinkingResource().addAll((Collection<? extends LinkingResource>)newValue);
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
			case SecurityThreatsPackage.RESOURCE_ATTACK__RESOURCE_CONTAINER:
				getResourceContainer().clear();
				return;
			case SecurityThreatsPackage.RESOURCE_ATTACK__LINKING_RESOURCE:
				getLinkingResource().clear();
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
			case SecurityThreatsPackage.RESOURCE_ATTACK__RESOURCE_CONTAINER:
				return resourceContainer != null && !resourceContainer.isEmpty();
			case SecurityThreatsPackage.RESOURCE_ATTACK__LINKING_RESOURCE:
				return linkingResource != null && !linkingResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceAttackImpl
