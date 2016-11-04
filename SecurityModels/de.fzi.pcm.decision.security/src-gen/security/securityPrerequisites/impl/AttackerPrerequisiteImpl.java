/**
 */
package security.securityPrerequisites.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import security.securityPrerequisites.AttackerPrerequisite;
import security.securityPrerequisites.SecurityPrerequisitesPackage;

import security.securityThreats.AttackerClass;
import security.securityThreats.SecurityThreatsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attacker Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityPrerequisites.impl.AttackerPrerequisiteImpl#getRelates <em>Relates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackerPrerequisiteImpl extends PrerequisiteImpl implements AttackerPrerequisite {
	/**
	 * The cached value of the '{@link #getRelates() <em>Relates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelates()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackerClass> relates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerPrerequisiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPrerequisitesPackage.Literals.ATTACKER_PREREQUISITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttackerClass> getRelates() {
		if (relates == null) {
			relates = new EObjectWithInverseResolvingEList.ManyInverse<AttackerClass>(AttackerClass.class, this, SecurityPrerequisitesPackage.ATTACKER_PREREQUISITE__RELATES, SecurityThreatsPackage.ATTACKER_CLASS__PREREQUISITES);
		}
		return relates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPrerequisitesPackage.ATTACKER_PREREQUISITE__RELATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPrerequisitesPackage.ATTACKER_PREREQUISITE__RELATES:
				return ((InternalEList<?>)getRelates()).basicRemove(otherEnd, msgs);
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
			case SecurityPrerequisitesPackage.ATTACKER_PREREQUISITE__RELATES:
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
			case SecurityPrerequisitesPackage.ATTACKER_PREREQUISITE__RELATES:
				getRelates().clear();
				getRelates().addAll((Collection<? extends AttackerClass>)newValue);
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
			case SecurityPrerequisitesPackage.ATTACKER_PREREQUISITE__RELATES:
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
			case SecurityPrerequisitesPackage.ATTACKER_PREREQUISITE__RELATES:
				return relates != null && !relates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttackerPrerequisiteImpl
