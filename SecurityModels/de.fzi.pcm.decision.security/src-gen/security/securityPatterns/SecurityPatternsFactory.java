/**
 */
package security.securityPatterns;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see security.securityPatterns.SecurityPatternsPackage
 * @generated
 */
public interface SecurityPatternsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPatternsFactory eINSTANCE = security.securityPatterns.impl.SecurityPatternsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pattern Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Catalog</em>'.
	 * @generated
	 */
	PatternCatalog createPatternCatalog();

	/**
	 * Returns a new object of class '<em>Security Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Pattern</em>'.
	 * @generated
	 */
	SecurityPattern createSecurityPattern();

	/**
	 * Returns a new object of class '<em>Component Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Role</em>'.
	 * @generated
	 */
	ComponentRole createComponentRole();

	/**
	 * Returns a new object of class '<em>Provided Interface Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Interface Role</em>'.
	 * @generated
	 */
	ProvidedInterfaceRole createProvidedInterfaceRole();

	/**
	 * Returns a new object of class '<em>Assembly Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Role</em>'.
	 * @generated
	 */
	AssemblyRole createAssemblyRole();

	/**
	 * Returns a new object of class '<em>System Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Role</em>'.
	 * @generated
	 */
	SystemRole createSystemRole();

	/**
	 * Returns a new object of class '<em>Container Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Role</em>'.
	 * @generated
	 */
	ContainerRole createContainerRole();

	/**
	 * Returns a new object of class '<em>Environment Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Role</em>'.
	 * @generated
	 */
	EnvironmentRole createEnvironmentRole();

	/**
	 * Returns a new object of class '<em>Usage Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Role</em>'.
	 * @generated
	 */
	UsageRole createUsageRole();

	/**
	 * Returns a new object of class '<em>Allocation Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation Role</em>'.
	 * @generated
	 */
	AllocationRole createAllocationRole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecurityPatternsPackage getSecurityPatternsPackage();

} //SecurityPatternsFactory
