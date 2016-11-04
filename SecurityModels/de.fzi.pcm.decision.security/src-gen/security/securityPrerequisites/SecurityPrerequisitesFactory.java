/**
 */
package security.securityPrerequisites;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see security.securityPrerequisites.SecurityPrerequisitesPackage
 * @generated
 */
public interface SecurityPrerequisitesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPrerequisitesFactory eINSTANCE = security.securityPrerequisites.impl.SecurityPrerequisitesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Prerequisite Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerequisite Catalog</em>'.
	 * @generated
	 */
	PrerequisiteCatalog createPrerequisiteCatalog();

	/**
	 * Returns a new object of class '<em>Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerequisite</em>'.
	 * @generated
	 */
	Prerequisite createPrerequisite();

	/**
	 * Returns a new object of class '<em>Security Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Prerequisite</em>'.
	 * @generated
	 */
	SecurityPrerequisite createSecurityPrerequisite();

	/**
	 * Returns a new object of class '<em>Component Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Prerequisite</em>'.
	 * @generated
	 */
	ComponentPrerequisite createComponentPrerequisite();

	/**
	 * Returns a new object of class '<em>System Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Prerequisite</em>'.
	 * @generated
	 */
	SystemPrerequisite createSystemPrerequisite();

	/**
	 * Returns a new object of class '<em>Resource Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Prerequisite</em>'.
	 * @generated
	 */
	ResourcePrerequisite createResourcePrerequisite();

	/**
	 * Returns a new object of class '<em>Usage Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Prerequisite</em>'.
	 * @generated
	 */
	UsagePrerequisite createUsagePrerequisite();

	/**
	 * Returns a new object of class '<em>Business Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Prerequisite</em>'.
	 * @generated
	 */
	BusinessPrerequisite createBusinessPrerequisite();

	/**
	 * Returns a new object of class '<em>Configuration Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Prerequisite</em>'.
	 * @generated
	 */
	ConfigurationPrerequisite createConfigurationPrerequisite();

	/**
	 * Returns a new object of class '<em>Attacker Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attacker Prerequisite</em>'.
	 * @generated
	 */
	AttackerPrerequisite createAttackerPrerequisite();

	/**
	 * Returns a new object of class '<em>Technology Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Technology Prerequisite</em>'.
	 * @generated
	 */
	TechnologyPrerequisite createTechnologyPrerequisite();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecurityPrerequisitesPackage getSecurityPrerequisitesPackage();

} //SecurityPrerequisitesFactory
