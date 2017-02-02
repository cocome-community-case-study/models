/**
 */
package pcmprivacy.compositionprivacy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;

import pcmprivacy.compositionprivacy.AssemblyConnectorPrivacy;
import pcmprivacy.compositionprivacy.CompositionprivacyPackage;
import pcmprivacy.compositionprivacy.DataPrivacyLvl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Connector Privacy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmprivacy.compositionprivacy.impl.AssemblyConnectorPrivacyImpl#getPrivacyLevel <em>Privacy Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorPrivacyImpl extends AssemblyConnectorImpl implements AssemblyConnectorPrivacy {
	/**
	 * The default value of the '{@link #getPrivacyLevel() <em>Privacy Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyLevel()
	 * @generated
	 * @ordered
	 */
	protected static final DataPrivacyLvl PRIVACY_LEVEL_EDEFAULT = DataPrivacyLvl.PERSONAL;

	/**
	 * The cached value of the '{@link #getPrivacyLevel() <em>Privacy Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyLevel()
	 * @generated
	 * @ordered
	 */
	protected DataPrivacyLvl privacyLevel = PRIVACY_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorPrivacyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionprivacyPackage.Literals.ASSEMBLY_CONNECTOR_PRIVACY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPrivacyLvl getPrivacyLevel() {
		return privacyLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivacyLevel(DataPrivacyLvl newPrivacyLevel) {
		DataPrivacyLvl oldPrivacyLevel = privacyLevel;
		privacyLevel = newPrivacyLevel == null ? PRIVACY_LEVEL_EDEFAULT : newPrivacyLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionprivacyPackage.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL, oldPrivacyLevel, privacyLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionprivacyPackage.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL:
				return getPrivacyLevel();
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
			case CompositionprivacyPackage.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL:
				setPrivacyLevel((DataPrivacyLvl)newValue);
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
			case CompositionprivacyPackage.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL:
				setPrivacyLevel(PRIVACY_LEVEL_EDEFAULT);
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
			case CompositionprivacyPackage.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL:
				return privacyLevel != PRIVACY_LEVEL_EDEFAULT;
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
		result.append(" (PrivacyLevel: ");
		result.append(privacyLevel);
		result.append(')');
		return result.toString();
	}

} //AssemblyConnectorPrivacyImpl
