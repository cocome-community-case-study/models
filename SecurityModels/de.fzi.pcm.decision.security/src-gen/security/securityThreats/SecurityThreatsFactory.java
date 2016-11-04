/**
 */
package security.securityThreats;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see security.securityThreats.SecurityThreatsPackage
 * @generated
 */
public interface SecurityThreatsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityThreatsFactory eINSTANCE = security.securityThreats.impl.SecurityThreatsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Threat Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threat Catalog</em>'.
	 * @generated
	 */
	ThreatCatalog createThreatCatalog();

	/**
	 * Returns a new object of class '<em>Attacker Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attacker Class</em>'.
	 * @generated
	 */
	AttackerClass createAttackerClass();

	/**
	 * Returns a new object of class '<em>Attack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attack</em>'.
	 * @generated
	 */
	Attack createAttack();

	/**
	 * Returns a new object of class '<em>Component Attack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Attack</em>'.
	 * @generated
	 */
	ComponentAttack createComponentAttack();

	/**
	 * Returns a new object of class '<em>System Attack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Attack</em>'.
	 * @generated
	 */
	SystemAttack createSystemAttack();

	/**
	 * Returns a new object of class '<em>Resource Attack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Attack</em>'.
	 * @generated
	 */
	ResourceAttack createResourceAttack();

	/**
	 * Returns a new object of class '<em>Allocation Attack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation Attack</em>'.
	 * @generated
	 */
	AllocationAttack createAllocationAttack();

	/**
	 * Returns a new object of class '<em>Usage Attack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Attack</em>'.
	 * @generated
	 */
	UsageAttack createUsageAttack();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecurityThreatsPackage getSecurityThreatsPackage();

} //SecurityThreatsFactory
