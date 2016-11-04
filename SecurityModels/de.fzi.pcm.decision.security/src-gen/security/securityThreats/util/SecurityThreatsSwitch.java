/**
 */
package security.securityThreats.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import security.Catalog;

import security.securityThreats.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see security.securityThreats.SecurityThreatsPackage
 * @generated
 */
public class SecurityThreatsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecurityThreatsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityThreatsSwitch() {
		if (modelPackage == null) {
			modelPackage = SecurityThreatsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SecurityThreatsPackage.THREAT_CATALOG: {
				ThreatCatalog threatCatalog = (ThreatCatalog)theEObject;
				T result = caseThreatCatalog(threatCatalog);
				if (result == null) result = caseCatalog(threatCatalog);
				if (result == null) result = caseIdentifier(threatCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityThreatsPackage.ATTACKER_CLASS: {
				AttackerClass attackerClass = (AttackerClass)theEObject;
				T result = caseAttackerClass(attackerClass);
				if (result == null) result = caseIdentifier(attackerClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityThreatsPackage.ATTACK: {
				Attack attack = (Attack)theEObject;
				T result = caseAttack(attack);
				if (result == null) result = caseIdentifier(attack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityThreatsPackage.COMPONENT_ATTACK: {
				ComponentAttack componentAttack = (ComponentAttack)theEObject;
				T result = caseComponentAttack(componentAttack);
				if (result == null) result = caseAttack(componentAttack);
				if (result == null) result = caseIdentifier(componentAttack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityThreatsPackage.SYSTEM_ATTACK: {
				SystemAttack systemAttack = (SystemAttack)theEObject;
				T result = caseSystemAttack(systemAttack);
				if (result == null) result = caseAttack(systemAttack);
				if (result == null) result = caseIdentifier(systemAttack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityThreatsPackage.RESOURCE_ATTACK: {
				ResourceAttack resourceAttack = (ResourceAttack)theEObject;
				T result = caseResourceAttack(resourceAttack);
				if (result == null) result = caseAttack(resourceAttack);
				if (result == null) result = caseIdentifier(resourceAttack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityThreatsPackage.ALLOCATION_ATTACK: {
				AllocationAttack allocationAttack = (AllocationAttack)theEObject;
				T result = caseAllocationAttack(allocationAttack);
				if (result == null) result = caseAttack(allocationAttack);
				if (result == null) result = caseIdentifier(allocationAttack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityThreatsPackage.USAGE_ATTACK: {
				UsageAttack usageAttack = (UsageAttack)theEObject;
				T result = caseUsageAttack(usageAttack);
				if (result == null) result = caseAttack(usageAttack);
				if (result == null) result = caseIdentifier(usageAttack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threat Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threat Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreatCatalog(ThreatCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attacker Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attacker Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttackerClass(AttackerClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttack(Attack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Attack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentAttack(ComponentAttack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Attack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemAttack(SystemAttack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Attack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceAttack(ResourceAttack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation Attack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationAttack(AllocationAttack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Attack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageAttack(UsageAttack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalog(Catalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SecurityThreatsSwitch
