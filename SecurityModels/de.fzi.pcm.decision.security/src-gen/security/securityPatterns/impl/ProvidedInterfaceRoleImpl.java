/**
 */
package security.securityPatterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

import security.securityPatterns.ProvidedInterfaceRole;
import security.securityPatterns.SecurityPatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Interface Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.impl.ProvidedInterfaceRoleImpl#getOperationProvidedRole <em>Operation Provided Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedInterfaceRoleImpl extends RoleImpl implements ProvidedInterfaceRole {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedInterfaceRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPatternsPackage.Literals.PROVIDED_INTERFACE_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationProvidedRole> getOperationProvidedRole() {
		if (operationProvidedRole == null) {
			operationProvidedRole = new EObjectResolvingEList<OperationProvidedRole>(OperationProvidedRole.class, this, SecurityPatternsPackage.PROVIDED_INTERFACE_ROLE__OPERATION_PROVIDED_ROLE);
		}
		return operationProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPatternsPackage.PROVIDED_INTERFACE_ROLE__OPERATION_PROVIDED_ROLE:
				return getOperationProvidedRole();
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
			case SecurityPatternsPackage.PROVIDED_INTERFACE_ROLE__OPERATION_PROVIDED_ROLE:
				getOperationProvidedRole().clear();
				getOperationProvidedRole().addAll((Collection<? extends OperationProvidedRole>)newValue);
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
			case SecurityPatternsPackage.PROVIDED_INTERFACE_ROLE__OPERATION_PROVIDED_ROLE:
				getOperationProvidedRole().clear();
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
			case SecurityPatternsPackage.PROVIDED_INTERFACE_ROLE__OPERATION_PROVIDED_ROLE:
				return operationProvidedRole != null && !operationProvidedRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvidedInterfaceRoleImpl
