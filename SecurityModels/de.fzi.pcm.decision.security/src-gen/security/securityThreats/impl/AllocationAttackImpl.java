/**
 */
package security.securityThreats.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;

import security.securityThreats.AllocationAttack;
import security.securityThreats.SecurityThreatsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Attack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.impl.AllocationAttackImpl#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link security.securityThreats.impl.AllocationAttackImpl#getAllocationContext <em>Allocation Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationAttackImpl extends AttackImpl implements AllocationAttack {
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
	 * The cached value of the '{@link #getAllocationContext() <em>Allocation Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationContext()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationContext> allocationContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationAttackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityThreatsPackage.Literals.ALLOCATION_ATTACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Allocation> getAllocation() {
		if (allocation == null) {
			allocation = new EObjectResolvingEList<Allocation>(Allocation.class, this, SecurityThreatsPackage.ALLOCATION_ATTACK__ALLOCATION);
		}
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationContext> getAllocationContext() {
		if (allocationContext == null) {
			allocationContext = new EObjectResolvingEList<AllocationContext>(AllocationContext.class, this, SecurityThreatsPackage.ALLOCATION_ATTACK__ALLOCATION_CONTEXT);
		}
		return allocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityThreatsPackage.ALLOCATION_ATTACK__ALLOCATION:
				return getAllocation();
			case SecurityThreatsPackage.ALLOCATION_ATTACK__ALLOCATION_CONTEXT:
				return getAllocationContext();
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
			case SecurityThreatsPackage.ALLOCATION_ATTACK__ALLOCATION:
				getAllocation().clear();
				getAllocation().addAll((Collection<? extends Allocation>)newValue);
				return;
			case SecurityThreatsPackage.ALLOCATION_ATTACK__ALLOCATION_CONTEXT:
				getAllocationContext().clear();
				getAllocationContext().addAll((Collection<? extends AllocationContext>)newValue);
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
			case SecurityThreatsPackage.ALLOCATION_ATTACK__ALLOCATION:
				getAllocation().clear();
				return;
			case SecurityThreatsPackage.ALLOCATION_ATTACK__ALLOCATION_CONTEXT:
				getAllocationContext().clear();
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
			case SecurityThreatsPackage.ALLOCATION_ATTACK__ALLOCATION:
				return allocation != null && !allocation.isEmpty();
			case SecurityThreatsPackage.ALLOCATION_ATTACK__ALLOCATION_CONTEXT:
				return allocationContext != null && !allocationContext.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllocationAttackImpl
