/**
 */
package pcmprivacy.resourceenvironmentprivacy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.resourceenvironment.impl.ResourceContainerImpl;

import pcmprivacy.resourceenvironmentprivacy.ResourceContainerPrivacy;
import pcmprivacy.resourceenvironmentprivacy.ResourceenvironmentprivacyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Container Privacy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmprivacy.resourceenvironmentprivacy.impl.ResourceContainerPrivacyImpl#getGeolocation <em>Geolocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceContainerPrivacyImpl extends ResourceContainerImpl implements ResourceContainerPrivacy {
	/**
	 * The default value of the '{@link #getGeolocation() <em>Geolocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeolocation()
	 * @generated
	 * @ordered
	 */
	protected static final int GEOLOCATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGeolocation() <em>Geolocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeolocation()
	 * @generated
	 * @ordered
	 */
	protected int geolocation = GEOLOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceContainerPrivacyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceenvironmentprivacyPackage.Literals.RESOURCE_CONTAINER_PRIVACY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGeolocation() {
		return geolocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeolocation(int newGeolocation) {
		int oldGeolocation = geolocation;
		geolocation = newGeolocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceenvironmentprivacyPackage.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION, oldGeolocation, geolocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourceenvironmentprivacyPackage.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION:
				return getGeolocation();
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
			case ResourceenvironmentprivacyPackage.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION:
				setGeolocation((Integer)newValue);
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
			case ResourceenvironmentprivacyPackage.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION:
				setGeolocation(GEOLOCATION_EDEFAULT);
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
			case ResourceenvironmentprivacyPackage.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION:
				return geolocation != GEOLOCATION_EDEFAULT;
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

} //ResourceContainerPrivacyImpl
