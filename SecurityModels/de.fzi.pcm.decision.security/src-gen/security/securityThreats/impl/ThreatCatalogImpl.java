/**
 */
package security.securityThreats.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import security.impl.CatalogImpl;

import security.securityThreats.Attack;
import security.securityThreats.AttackerClass;
import security.securityThreats.SecurityThreatsPackage;
import security.securityThreats.ThreatCatalog;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.impl.ThreatCatalogImpl#getAttackers <em>Attackers</em>}</li>
 *   <li>{@link security.securityThreats.impl.ThreatCatalogImpl#getAttackTypes <em>Attack Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatCatalogImpl extends CatalogImpl implements ThreatCatalog {
	/**
	 * The cached value of the '{@link #getAttackers() <em>Attackers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackers()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackerClass> attackers;

	/**
	 * The cached value of the '{@link #getAttackTypes() <em>Attack Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attack> attackTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityThreatsPackage.Literals.THREAT_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttackerClass> getAttackers() {
		if (attackers == null) {
			attackers = new EObjectContainmentEList<AttackerClass>(AttackerClass.class, this, SecurityThreatsPackage.THREAT_CATALOG__ATTACKERS);
		}
		return attackers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attack> getAttackTypes() {
		if (attackTypes == null) {
			attackTypes = new EObjectContainmentEList<Attack>(Attack.class, this, SecurityThreatsPackage.THREAT_CATALOG__ATTACK_TYPES);
		}
		return attackTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityThreatsPackage.THREAT_CATALOG__ATTACKERS:
				return ((InternalEList<?>)getAttackers()).basicRemove(otherEnd, msgs);
			case SecurityThreatsPackage.THREAT_CATALOG__ATTACK_TYPES:
				return ((InternalEList<?>)getAttackTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityThreatsPackage.THREAT_CATALOG__ATTACKERS:
				return getAttackers();
			case SecurityThreatsPackage.THREAT_CATALOG__ATTACK_TYPES:
				return getAttackTypes();
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
			case SecurityThreatsPackage.THREAT_CATALOG__ATTACKERS:
				getAttackers().clear();
				getAttackers().addAll((Collection<? extends AttackerClass>)newValue);
				return;
			case SecurityThreatsPackage.THREAT_CATALOG__ATTACK_TYPES:
				getAttackTypes().clear();
				getAttackTypes().addAll((Collection<? extends Attack>)newValue);
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
			case SecurityThreatsPackage.THREAT_CATALOG__ATTACKERS:
				getAttackers().clear();
				return;
			case SecurityThreatsPackage.THREAT_CATALOG__ATTACK_TYPES:
				getAttackTypes().clear();
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
			case SecurityThreatsPackage.THREAT_CATALOG__ATTACKERS:
				return attackers != null && !attackers.isEmpty();
			case SecurityThreatsPackage.THREAT_CATALOG__ATTACK_TYPES:
				return attackTypes != null && !attackTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ThreatCatalogImpl
