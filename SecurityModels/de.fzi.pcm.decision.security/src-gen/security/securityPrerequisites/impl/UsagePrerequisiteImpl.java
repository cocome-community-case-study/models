/**
 */
package security.securityPrerequisites.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.usagemodel.UsageScenario;

import security.securityPrerequisites.SecurityPrerequisitesPackage;
import security.securityPrerequisites.UsagePrerequisite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityPrerequisites.impl.UsagePrerequisiteImpl#getRelates <em>Relates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsagePrerequisiteImpl extends PrerequisiteImpl implements UsagePrerequisite {
	/**
	 * The cached value of the '{@link #getRelates() <em>Relates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelates()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageScenario> relates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsagePrerequisiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPrerequisitesPackage.Literals.USAGE_PREREQUISITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageScenario> getRelates() {
		if (relates == null) {
			relates = new EObjectResolvingEList<UsageScenario>(UsageScenario.class, this, SecurityPrerequisitesPackage.USAGE_PREREQUISITE__RELATES);
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
			case SecurityPrerequisitesPackage.USAGE_PREREQUISITE__RELATES:
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
			case SecurityPrerequisitesPackage.USAGE_PREREQUISITE__RELATES:
				getRelates().clear();
				getRelates().addAll((Collection<? extends UsageScenario>)newValue);
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
			case SecurityPrerequisitesPackage.USAGE_PREREQUISITE__RELATES:
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
			case SecurityPrerequisitesPackage.USAGE_PREREQUISITE__RELATES:
				return relates != null && !relates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UsagePrerequisiteImpl
