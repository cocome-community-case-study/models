/**
 */
package security.securityPatterns.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.pcm.usagemodel.Workload;

import security.securityPatterns.SecurityPatternsPackage;
import security.securityPatterns.UsageRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.impl.UsageRoleImpl#getUsageScenario <em>Usage Scenario</em>}</li>
 *   <li>{@link security.securityPatterns.impl.UsageRoleImpl#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageRoleImpl extends RoleImpl implements UsageRole {
	/**
	 * The cached value of the '{@link #getUsageScenario() <em>Usage Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageScenario()
	 * @generated
	 * @ordered
	 */
	protected UsageScenario usageScenario;

	/**
	 * The cached value of the '{@link #getWorkload() <em>Workload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkload()
	 * @generated
	 * @ordered
	 */
	protected Workload workload;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPatternsPackage.Literals.USAGE_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageScenario getUsageScenario() {
		if (usageScenario != null && ((EObject)usageScenario).eIsProxy()) {
			InternalEObject oldUsageScenario = (InternalEObject)usageScenario;
			usageScenario = (UsageScenario)eResolveProxy(oldUsageScenario);
			if (usageScenario != oldUsageScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPatternsPackage.USAGE_ROLE__USAGE_SCENARIO, oldUsageScenario, usageScenario));
			}
		}
		return usageScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageScenario basicGetUsageScenario() {
		return usageScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageScenario(UsageScenario newUsageScenario) {
		UsageScenario oldUsageScenario = usageScenario;
		usageScenario = newUsageScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPatternsPackage.USAGE_ROLE__USAGE_SCENARIO, oldUsageScenario, usageScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workload getWorkload() {
		if (workload != null && ((EObject)workload).eIsProxy()) {
			InternalEObject oldWorkload = (InternalEObject)workload;
			workload = (Workload)eResolveProxy(oldWorkload);
			if (workload != oldWorkload) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPatternsPackage.USAGE_ROLE__WORKLOAD, oldWorkload, workload));
			}
		}
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workload basicGetWorkload() {
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkload(Workload newWorkload) {
		Workload oldWorkload = workload;
		workload = newWorkload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPatternsPackage.USAGE_ROLE__WORKLOAD, oldWorkload, workload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPatternsPackage.USAGE_ROLE__USAGE_SCENARIO:
				if (resolve) return getUsageScenario();
				return basicGetUsageScenario();
			case SecurityPatternsPackage.USAGE_ROLE__WORKLOAD:
				if (resolve) return getWorkload();
				return basicGetWorkload();
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
			case SecurityPatternsPackage.USAGE_ROLE__USAGE_SCENARIO:
				setUsageScenario((UsageScenario)newValue);
				return;
			case SecurityPatternsPackage.USAGE_ROLE__WORKLOAD:
				setWorkload((Workload)newValue);
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
			case SecurityPatternsPackage.USAGE_ROLE__USAGE_SCENARIO:
				setUsageScenario((UsageScenario)null);
				return;
			case SecurityPatternsPackage.USAGE_ROLE__WORKLOAD:
				setWorkload((Workload)null);
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
			case SecurityPatternsPackage.USAGE_ROLE__USAGE_SCENARIO:
				return usageScenario != null;
			case SecurityPatternsPackage.USAGE_ROLE__WORKLOAD:
				return workload != null;
		}
		return super.eIsSet(featureID);
	}

} //UsageRoleImpl
