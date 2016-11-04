/**
 */
package security.securityPatterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;

import security.securityPatterns.AllocationRole;
import security.securityPatterns.SecurityPatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.impl.AllocationRoleImpl#getAllocationContext <em>Allocation Context</em>}</li>
 *   <li>{@link security.securityPatterns.impl.AllocationRoleImpl#getAllocation <em>Allocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationRoleImpl extends RoleImpl implements AllocationRole {
	/**
	 * The cached value of the '{@link #getAllocationContext() <em>Allocation Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationContext()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationContext> allocationContext;

	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Allocation> allocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPatternsPackage.Literals.ALLOCATION_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationContext> getAllocationContext() {
		if (allocationContext == null) {
			allocationContext = new EObjectResolvingEList<AllocationContext>(AllocationContext.class, this, SecurityPatternsPackage.ALLOCATION_ROLE__ALLOCATION_CONTEXT);
		}
		return allocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Allocation> getAllocation() {
		if (allocation == null) {
			allocation = new EObjectResolvingEList<Allocation>(Allocation.class, this, SecurityPatternsPackage.ALLOCATION_ROLE__ALLOCATION);
		}
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPatternsPackage.ALLOCATION_ROLE__ALLOCATION_CONTEXT:
				return getAllocationContext();
			case SecurityPatternsPackage.ALLOCATION_ROLE__ALLOCATION:
				return getAllocation();
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
			case SecurityPatternsPackage.ALLOCATION_ROLE__ALLOCATION_CONTEXT:
				getAllocationContext().clear();
				getAllocationContext().addAll((Collection<? extends AllocationContext>)newValue);
				return;
			case SecurityPatternsPackage.ALLOCATION_ROLE__ALLOCATION:
				getAllocation().clear();
				getAllocation().addAll((Collection<? extends Allocation>)newValue);
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
			case SecurityPatternsPackage.ALLOCATION_ROLE__ALLOCATION_CONTEXT:
				getAllocationContext().clear();
				return;
			case SecurityPatternsPackage.ALLOCATION_ROLE__ALLOCATION:
				getAllocation().clear();
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
			case SecurityPatternsPackage.ALLOCATION_ROLE__ALLOCATION_CONTEXT:
				return allocationContext != null && !allocationContext.isEmpty();
			case SecurityPatternsPackage.ALLOCATION_ROLE__ALLOCATION:
				return allocation != null && !allocation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllocationRoleImpl
