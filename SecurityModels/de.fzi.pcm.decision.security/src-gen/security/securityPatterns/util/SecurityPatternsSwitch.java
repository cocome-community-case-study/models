/**
 */
package security.securityPatterns.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import security.Catalog;

import security.securityPatterns.*;

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
 * @see security.securityPatterns.SecurityPatternsPackage
 * @generated
 */
public class SecurityPatternsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecurityPatternsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPatternsSwitch() {
		if (modelPackage == null) {
			modelPackage = SecurityPatternsPackage.eINSTANCE;
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
			case SecurityPatternsPackage.PATTERN_CATALOG: {
				PatternCatalog patternCatalog = (PatternCatalog)theEObject;
				T result = casePatternCatalog(patternCatalog);
				if (result == null) result = caseCatalog(patternCatalog);
				if (result == null) result = caseIdentifier(patternCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPatternsPackage.SECURITY_PATTERN: {
				SecurityPattern securityPattern = (SecurityPattern)theEObject;
				T result = caseSecurityPattern(securityPattern);
				if (result == null) result = caseIdentifier(securityPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPatternsPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseIdentifier(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPatternsPackage.COMPONENT_ROLE: {
				ComponentRole componentRole = (ComponentRole)theEObject;
				T result = caseComponentRole(componentRole);
				if (result == null) result = caseRole(componentRole);
				if (result == null) result = caseIdentifier(componentRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPatternsPackage.PROVIDED_INTERFACE_ROLE: {
				ProvidedInterfaceRole providedInterfaceRole = (ProvidedInterfaceRole)theEObject;
				T result = caseProvidedInterfaceRole(providedInterfaceRole);
				if (result == null) result = caseRole(providedInterfaceRole);
				if (result == null) result = caseIdentifier(providedInterfaceRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPatternsPackage.ASSEMBLY_ROLE: {
				AssemblyRole assemblyRole = (AssemblyRole)theEObject;
				T result = caseAssemblyRole(assemblyRole);
				if (result == null) result = caseRole(assemblyRole);
				if (result == null) result = caseIdentifier(assemblyRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPatternsPackage.SYSTEM_ROLE: {
				SystemRole systemRole = (SystemRole)theEObject;
				T result = caseSystemRole(systemRole);
				if (result == null) result = caseRole(systemRole);
				if (result == null) result = caseIdentifier(systemRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPatternsPackage.CONTAINER_ROLE: {
				ContainerRole containerRole = (ContainerRole)theEObject;
				T result = caseContainerRole(containerRole);
				if (result == null) result = caseRole(containerRole);
				if (result == null) result = caseIdentifier(containerRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPatternsPackage.ENVIRONMENT_ROLE: {
				EnvironmentRole environmentRole = (EnvironmentRole)theEObject;
				T result = caseEnvironmentRole(environmentRole);
				if (result == null) result = caseRole(environmentRole);
				if (result == null) result = caseIdentifier(environmentRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPatternsPackage.USAGE_ROLE: {
				UsageRole usageRole = (UsageRole)theEObject;
				T result = caseUsageRole(usageRole);
				if (result == null) result = caseRole(usageRole);
				if (result == null) result = caseIdentifier(usageRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPatternsPackage.ALLOCATION_ROLE: {
				AllocationRole allocationRole = (AllocationRole)theEObject;
				T result = caseAllocationRole(allocationRole);
				if (result == null) result = caseRole(allocationRole);
				if (result == null) result = caseIdentifier(allocationRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternCatalog(PatternCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityPattern(SecurityPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRole(ComponentRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Interface Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Interface Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedInterfaceRole(ProvidedInterfaceRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyRole(AssemblyRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemRole(SystemRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerRole(ContainerRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentRole(EnvironmentRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageRole(UsageRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationRole(AllocationRole object) {
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

} //SecurityPatternsSwitch
