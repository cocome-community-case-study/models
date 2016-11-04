/**
 */
package security.securityThreats.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

import security.securityThreats.SecurityThreatsPackage;
import security.securityThreats.SystemAttack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Attack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.impl.SystemAttackImpl#getOperationProvidedRole <em>Operation Provided Role</em>}</li>
 *   <li>{@link security.securityThreats.impl.SystemAttackImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemAttackImpl extends AttackImpl implements SystemAttack {
	/**
	 * The cached value of the '{@link #getOperationProvidedRole() <em>Operation Provided Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationProvidedRole> operationProvidedRole;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected org.palladiosimulator.pcm.system.System system;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemAttackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityThreatsPackage.Literals.SYSTEM_ATTACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationProvidedRole> getOperationProvidedRole() {
		if (operationProvidedRole == null) {
			operationProvidedRole = new EObjectResolvingEList<OperationProvidedRole>(OperationProvidedRole.class, this, SecurityThreatsPackage.SYSTEM_ATTACK__OPERATION_PROVIDED_ROLE);
		}
		return operationProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.pcm.system.System getSystem() {
		if (system != null && ((EObject)system).eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (org.palladiosimulator.pcm.system.System)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityThreatsPackage.SYSTEM_ATTACK__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.pcm.system.System basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(org.palladiosimulator.pcm.system.System newSystem) {
		org.palladiosimulator.pcm.system.System oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.SYSTEM_ATTACK__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityThreatsPackage.SYSTEM_ATTACK__OPERATION_PROVIDED_ROLE:
				return getOperationProvidedRole();
			case SecurityThreatsPackage.SYSTEM_ATTACK__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
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
			case SecurityThreatsPackage.SYSTEM_ATTACK__OPERATION_PROVIDED_ROLE:
				getOperationProvidedRole().clear();
				getOperationProvidedRole().addAll((Collection<? extends OperationProvidedRole>)newValue);
				return;
			case SecurityThreatsPackage.SYSTEM_ATTACK__SYSTEM:
				setSystem((org.palladiosimulator.pcm.system.System)newValue);
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
			case SecurityThreatsPackage.SYSTEM_ATTACK__OPERATION_PROVIDED_ROLE:
				getOperationProvidedRole().clear();
				return;
			case SecurityThreatsPackage.SYSTEM_ATTACK__SYSTEM:
				setSystem((org.palladiosimulator.pcm.system.System)null);
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
			case SecurityThreatsPackage.SYSTEM_ATTACK__OPERATION_PROVIDED_ROLE:
				return operationProvidedRole != null && !operationProvidedRole.isEmpty();
			case SecurityThreatsPackage.SYSTEM_ATTACK__SYSTEM:
				return system != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemAttackImpl
