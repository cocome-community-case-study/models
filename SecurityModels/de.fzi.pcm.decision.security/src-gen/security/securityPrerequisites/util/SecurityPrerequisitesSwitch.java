/**
 */
package security.securityPrerequisites.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import security.Catalog;

import security.securityPrerequisites.*;

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
 * @see security.securityPrerequisites.SecurityPrerequisitesPackage
 * @generated
 */
public class SecurityPrerequisitesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecurityPrerequisitesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPrerequisitesSwitch() {
		if (modelPackage == null) {
			modelPackage = SecurityPrerequisitesPackage.eINSTANCE;
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
			case SecurityPrerequisitesPackage.PREREQUISITE_CATALOG: {
				PrerequisiteCatalog prerequisiteCatalog = (PrerequisiteCatalog)theEObject;
				T result = casePrerequisiteCatalog(prerequisiteCatalog);
				if (result == null) result = caseCatalog(prerequisiteCatalog);
				if (result == null) result = caseIdentifier(prerequisiteCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPrerequisitesPackage.PREREQUISITE: {
				Prerequisite prerequisite = (Prerequisite)theEObject;
				T result = casePrerequisite(prerequisite);
				if (result == null) result = caseIdentifier(prerequisite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPrerequisitesPackage.SECURITY_PREREQUISITE: {
				SecurityPrerequisite securityPrerequisite = (SecurityPrerequisite)theEObject;
				T result = caseSecurityPrerequisite(securityPrerequisite);
				if (result == null) result = casePrerequisite(securityPrerequisite);
				if (result == null) result = caseIdentifier(securityPrerequisite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPrerequisitesPackage.COMPONENT_PREREQUISITE: {
				ComponentPrerequisite componentPrerequisite = (ComponentPrerequisite)theEObject;
				T result = caseComponentPrerequisite(componentPrerequisite);
				if (result == null) result = casePrerequisite(componentPrerequisite);
				if (result == null) result = caseIdentifier(componentPrerequisite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPrerequisitesPackage.SYSTEM_PREREQUISITE: {
				SystemPrerequisite systemPrerequisite = (SystemPrerequisite)theEObject;
				T result = caseSystemPrerequisite(systemPrerequisite);
				if (result == null) result = casePrerequisite(systemPrerequisite);
				if (result == null) result = caseIdentifier(systemPrerequisite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPrerequisitesPackage.RESOURCE_PREREQUISITE: {
				ResourcePrerequisite resourcePrerequisite = (ResourcePrerequisite)theEObject;
				T result = caseResourcePrerequisite(resourcePrerequisite);
				if (result == null) result = casePrerequisite(resourcePrerequisite);
				if (result == null) result = caseIdentifier(resourcePrerequisite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPrerequisitesPackage.USAGE_PREREQUISITE: {
				UsagePrerequisite usagePrerequisite = (UsagePrerequisite)theEObject;
				T result = caseUsagePrerequisite(usagePrerequisite);
				if (result == null) result = casePrerequisite(usagePrerequisite);
				if (result == null) result = caseIdentifier(usagePrerequisite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPrerequisitesPackage.BUSINESS_PREREQUISITE: {
				BusinessPrerequisite businessPrerequisite = (BusinessPrerequisite)theEObject;
				T result = caseBusinessPrerequisite(businessPrerequisite);
				if (result == null) result = casePrerequisite(businessPrerequisite);
				if (result == null) result = caseIdentifier(businessPrerequisite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPrerequisitesPackage.CONFIGURATION_PREREQUISITE: {
				ConfigurationPrerequisite configurationPrerequisite = (ConfigurationPrerequisite)theEObject;
				T result = caseConfigurationPrerequisite(configurationPrerequisite);
				if (result == null) result = casePrerequisite(configurationPrerequisite);
				if (result == null) result = caseIdentifier(configurationPrerequisite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPrerequisitesPackage.ATTACKER_PREREQUISITE: {
				AttackerPrerequisite attackerPrerequisite = (AttackerPrerequisite)theEObject;
				T result = caseAttackerPrerequisite(attackerPrerequisite);
				if (result == null) result = casePrerequisite(attackerPrerequisite);
				if (result == null) result = caseIdentifier(attackerPrerequisite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPrerequisitesPackage.TECHNOLOGY_PREREQUISITE: {
				TechnologyPrerequisite technologyPrerequisite = (TechnologyPrerequisite)theEObject;
				T result = caseTechnologyPrerequisite(technologyPrerequisite);
				if (result == null) result = casePrerequisite(technologyPrerequisite);
				if (result == null) result = caseIdentifier(technologyPrerequisite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerequisite Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerequisite Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrerequisiteCatalog(PrerequisiteCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerequisite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrerequisite(Prerequisite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Prerequisite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityPrerequisite(SecurityPrerequisite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Prerequisite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentPrerequisite(ComponentPrerequisite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Prerequisite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemPrerequisite(SystemPrerequisite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Prerequisite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcePrerequisite(ResourcePrerequisite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Prerequisite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsagePrerequisite(UsagePrerequisite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Prerequisite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessPrerequisite(BusinessPrerequisite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Prerequisite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationPrerequisite(ConfigurationPrerequisite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attacker Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attacker Prerequisite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttackerPrerequisite(AttackerPrerequisite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Prerequisite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologyPrerequisite(TechnologyPrerequisite object) {
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

} //SecurityPrerequisitesSwitch
