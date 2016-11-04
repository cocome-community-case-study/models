/**
 */
package security.securityPrerequisites.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import security.securityPrerequisites.ResourcePrerequisite;
import security.securityPrerequisites.SecurityPrerequisitesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityPrerequisites.impl.ResourcePrerequisiteImpl#getRelates <em>Relates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourcePrerequisiteImpl extends PrerequisiteImpl implements ResourcePrerequisite {
	/**
	 * The cached value of the '{@link #getRelates() <em>Relates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelates()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceContainer> relates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcePrerequisiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPrerequisitesPackage.Literals.RESOURCE_PREREQUISITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceContainer> getRelates() {
		if (relates == null) {
			relates = new EObjectResolvingEList<ResourceContainer>(ResourceContainer.class, this, SecurityPrerequisitesPackage.RESOURCE_PREREQUISITE__RELATES);
		}
		return relates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPrerequisitesPackage.RESOURCE_PREREQUISITE__RELATES:
				return getRelates();
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
			case SecurityPrerequisitesPackage.RESOURCE_PREREQUISITE__RELATES:
				getRelates().clear();
				getRelates().addAll((Collection<? extends ResourceContainer>)newValue);
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
			case SecurityPrerequisitesPackage.RESOURCE_PREREQUISITE__RELATES:
				getRelates().clear();
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
			case SecurityPrerequisitesPackage.RESOURCE_PREREQUISITE__RELATES:
				return relates != null && !relates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourcePrerequisiteImpl
