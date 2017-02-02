/**
 */
package pcmprivacy.resourceenvironmentprivacy.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.palladiosimulator.pcm.resourceenvironment.impl.ResourceEnvironmentImpl;

import pcmprivacy.resourceenvironmentprivacy.ResourceEnvironmentPrivacy;
import pcmprivacy.resourceenvironmentprivacy.ResourceenvironmentprivacyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Environment Privacy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmprivacy.resourceenvironmentprivacy.impl.ResourceEnvironmentPrivacyImpl#getGeolocation <em>Geolocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceEnvironmentPrivacyImpl extends ResourceEnvironmentImpl implements ResourceEnvironmentPrivacy {
	/**
	 * The cached value of the '{@link #getGeolocation() <em>Geolocation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeolocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> geolocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceEnvironmentPrivacyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceenvironmentprivacyPackage.Literals.RESOURCE_ENVIRONMENT_PRIVACY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getGeolocation() {
		if (geolocation == null) {
			geolocation = new EDataTypeEList<Integer>(Integer.class, this, ResourceenvironmentprivacyPackage.RESOURCE_ENVIRONMENT_PRIVACY__GEOLOCATION);
		}
		return geolocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourceenvironmentprivacyPackage.RESOURCE_ENVIRONMENT_PRIVACY__GEOLOCATION:
				return getGeolocation();
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
			case ResourceenvironmentprivacyPackage.RESOURCE_ENVIRONMENT_PRIVACY__GEOLOCATION:
				getGeolocation().clear();
				getGeolocation().addAll((Collection<? extends Integer>)newValue);
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
			case ResourceenvironmentprivacyPackage.RESOURCE_ENVIRONMENT_PRIVACY__GEOLOCATION:
				getGeolocation().clear();
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
			case ResourceenvironmentprivacyPackage.RESOURCE_ENVIRONMENT_PRIVACY__GEOLOCATION:
				return geolocation != null && !geolocation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Geolocation: ");
		result.append(geolocation);
		result.append(')');
		return result.toString();
	}

} //ResourceEnvironmentPrivacyImpl
