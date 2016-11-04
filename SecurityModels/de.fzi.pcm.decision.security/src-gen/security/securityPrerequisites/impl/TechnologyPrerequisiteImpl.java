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

import security.securityPrerequisites.Prerequisite;
import security.securityPrerequisites.SecurityPrerequisitesPackage;
import security.securityPrerequisites.TechnologyPrerequisite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityPrerequisites.impl.TechnologyPrerequisiteImpl#getDepends <em>Depends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechnologyPrerequisiteImpl extends PrerequisiteImpl implements TechnologyPrerequisite {
	/**
	 * The cached value of the '{@link #getDepends() <em>Depends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends()
	 * @generated
	 * @ordered
	 */
	protected EList<Prerequisite> depends;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologyPrerequisiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPrerequisitesPackage.Literals.TECHNOLOGY_PREREQUISITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prerequisite> getDepends() {
		if (depends == null) {
			depends = new EObjectWithInverseResolvingEList.ManyInverse<Prerequisite>(Prerequisite.class, this, SecurityPrerequisitesPackage.TECHNOLOGY_PREREQUISITE__DEPENDS, SecurityPrerequisitesPackage.PREREQUISITE__TECHNOLOGY);
		}
		return depends;
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
			case SecurityPrerequisitesPackage.TECHNOLOGY_PREREQUISITE__DEPENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDepends()).basicAdd(otherEnd, msgs);
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
			case SecurityPrerequisitesPackage.TECHNOLOGY_PREREQUISITE__DEPENDS:
				return ((InternalEList<?>)getDepends()).basicRemove(otherEnd, msgs);
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
			case SecurityPrerequisitesPackage.TECHNOLOGY_PREREQUISITE__DEPENDS:
				return getDepends();
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
			case SecurityPrerequisitesPackage.TECHNOLOGY_PREREQUISITE__DEPENDS:
				getDepends().clear();
				getDepends().addAll((Collection<? extends Prerequisite>)newValue);
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
			case SecurityPrerequisitesPackage.TECHNOLOGY_PREREQUISITE__DEPENDS:
				getDepends().clear();
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
			case SecurityPrerequisitesPackage.TECHNOLOGY_PREREQUISITE__DEPENDS:
				return depends != null && !depends.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TechnologyPrerequisiteImpl
