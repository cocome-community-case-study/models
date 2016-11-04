/**
 */
package security.securityPatterns;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see security.securityPatterns.SecurityPatternsFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityPatternsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "securityPatterns";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fzi.de/pcm/security/securityPatterns";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "securityPatterns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPatternsPackage eINSTANCE = security.securityPatterns.impl.SecurityPatternsPackageImpl.init();

	/**
	 * The meta object id for the '{@link security.securityPatterns.impl.PatternCatalogImpl <em>Pattern Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPatterns.impl.PatternCatalogImpl
	 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getPatternCatalog()
	 * @generated
	 */
	int PATTERN_CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CATALOG__ID = SecurityPackage.CATALOG__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CATALOG__NAME = SecurityPackage.CATALOG__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CATALOG__DESCRIPTION = SecurityPackage.CATALOG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CATALOG__TIME_STAMP = SecurityPackage.CATALOG__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CATALOG__CREATED_BY = SecurityPackage.CATALOG__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Security Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CATALOG__SECURITY_PATTERNS = SecurityPackage.CATALOG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CATALOG_FEATURE_COUNT = SecurityPackage.CATALOG_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link security.securityPatterns.impl.SecurityPatternImpl <em>Security Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPatterns.impl.SecurityPatternImpl
	 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getSecurityPattern()
	 * @generated
	 */
	int SECURITY_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PATTERN__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PATTERN__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PATTERN__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stakeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PATTERN__STAKEHOLDER = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PATTERN__STATUS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PATTERN__ROLES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PATTERN__PREREQUISITES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Security Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PATTERN__SUB_SECURITY_PATTERNS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Security Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PATTERN_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link security.securityPatterns.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPatterns.impl.RoleImpl
	 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link security.securityPatterns.impl.ComponentRoleImpl <em>Component Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPatterns.impl.ComponentRoleImpl
	 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getComponentRole()
	 * @generated
	 */
	int COMPONENT_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ROLE__ID = ROLE__ID;

	/**
	 * The feature id for the '<em><b>Basic Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ROLE__BASIC_COMPONENT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ROLE__OPERATION_INTERFACE = ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link security.securityPatterns.impl.ProvidedInterfaceRoleImpl <em>Provided Interface Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPatterns.impl.ProvidedInterfaceRoleImpl
	 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getProvidedInterfaceRole()
	 * @generated
	 */
	int PROVIDED_INTERFACE_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_ROLE__ID = ROLE__ID;

	/**
	 * The feature id for the '<em><b>Operation Provided Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_ROLE__OPERATION_PROVIDED_ROLE = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provided Interface Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link security.securityPatterns.impl.AssemblyRoleImpl <em>Assembly Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPatterns.impl.AssemblyRoleImpl
	 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getAssemblyRole()
	 * @generated
	 */
	int ASSEMBLY_ROLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_ROLE__ID = ROLE__ID;

	/**
	 * The feature id for the '<em><b>Assembly Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_ROLE__ASSEMBLY_CONTEXT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assembly Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link security.securityPatterns.impl.SystemRoleImpl <em>System Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPatterns.impl.SystemRoleImpl
	 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getSystemRole()
	 * @generated
	 */
	int SYSTEM_ROLE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ROLE__ID = ROLE__ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ROLE__SYSTEM = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link security.securityPatterns.impl.ContainerRoleImpl <em>Container Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPatterns.impl.ContainerRoleImpl
	 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getContainerRole()
	 * @generated
	 */
	int CONTAINER_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROLE__ID = ROLE__ID;

	/**
	 * The feature id for the '<em><b>Resource Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROLE__RESOURCE_CONTAINER = ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processing Resource Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROLE__PROCESSING_RESOURCE_SPECIFICATION = ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link security.securityPatterns.impl.EnvironmentRoleImpl <em>Environment Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPatterns.impl.EnvironmentRoleImpl
	 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getEnvironmentRole()
	 * @generated
	 */
	int ENVIRONMENT_ROLE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ROLE__ID = ROLE__ID;

	/**
	 * The feature id for the '<em><b>Resource Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ROLE__RESOURCE_ENVIRONMENT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linking Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ROLE__LINKING_RESOURCE = ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Environment Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link security.securityPatterns.impl.UsageRoleImpl <em>Usage Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPatterns.impl.UsageRoleImpl
	 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getUsageRole()
	 * @generated
	 */
	int USAGE_ROLE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ROLE__ID = ROLE__ID;

	/**
	 * The feature id for the '<em><b>Usage Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ROLE__USAGE_SCENARIO = ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ROLE__WORKLOAD = ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Usage Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link security.securityPatterns.impl.AllocationRoleImpl <em>Allocation Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPatterns.impl.AllocationRoleImpl
	 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getAllocationRole()
	 * @generated
	 */
	int ALLOCATION_ROLE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ROLE__ID = ROLE__ID;

	/**
	 * The feature id for the '<em><b>Allocation Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ROLE__ALLOCATION_CONTEXT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ROLE__ALLOCATION = ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Allocation Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link security.securityPatterns.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPatterns.Status
	 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 11;


	/**
	 * Returns the meta object for class '{@link security.securityPatterns.PatternCatalog <em>Pattern Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Catalog</em>'.
	 * @see security.securityPatterns.PatternCatalog
	 * @generated
	 */
	EClass getPatternCatalog();

	/**
	 * Returns the meta object for the containment reference list '{@link security.securityPatterns.PatternCatalog#getSecurityPatterns <em>Security Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Patterns</em>'.
	 * @see security.securityPatterns.PatternCatalog#getSecurityPatterns()
	 * @see #getPatternCatalog()
	 * @generated
	 */
	EReference getPatternCatalog_SecurityPatterns();

	/**
	 * Returns the meta object for class '{@link security.securityPatterns.SecurityPattern <em>Security Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Pattern</em>'.
	 * @see security.securityPatterns.SecurityPattern
	 * @generated
	 */
	EClass getSecurityPattern();

	/**
	 * Returns the meta object for the attribute '{@link security.securityPatterns.SecurityPattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security.securityPatterns.SecurityPattern#getName()
	 * @see #getSecurityPattern()
	 * @generated
	 */
	EAttribute getSecurityPattern_Name();

	/**
	 * Returns the meta object for the attribute '{@link security.securityPatterns.SecurityPattern#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see security.securityPatterns.SecurityPattern#getDescription()
	 * @see #getSecurityPattern()
	 * @generated
	 */
	EAttribute getSecurityPattern_Description();

	/**
	 * Returns the meta object for the attribute '{@link security.securityPatterns.SecurityPattern#getStakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stakeholder</em>'.
	 * @see security.securityPatterns.SecurityPattern#getStakeholder()
	 * @see #getSecurityPattern()
	 * @generated
	 */
	EAttribute getSecurityPattern_Stakeholder();

	/**
	 * Returns the meta object for the attribute '{@link security.securityPatterns.SecurityPattern#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see security.securityPatterns.SecurityPattern#getStatus()
	 * @see #getSecurityPattern()
	 * @generated
	 */
	EAttribute getSecurityPattern_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link security.securityPatterns.SecurityPattern#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see security.securityPatterns.SecurityPattern#getRoles()
	 * @see #getSecurityPattern()
	 * @generated
	 */
	EReference getSecurityPattern_Roles();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPatterns.SecurityPattern#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prerequisites</em>'.
	 * @see security.securityPatterns.SecurityPattern#getPrerequisites()
	 * @see #getSecurityPattern()
	 * @generated
	 */
	EReference getSecurityPattern_Prerequisites();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPatterns.SecurityPattern#getSubSecurityPatterns <em>Sub Security Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Security Patterns</em>'.
	 * @see security.securityPatterns.SecurityPattern#getSubSecurityPatterns()
	 * @see #getSecurityPattern()
	 * @generated
	 */
	EReference getSecurityPattern_SubSecurityPatterns();

	/**
	 * Returns the meta object for class '{@link security.securityPatterns.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see security.securityPatterns.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link security.securityPatterns.ComponentRole <em>Component Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Role</em>'.
	 * @see security.securityPatterns.ComponentRole
	 * @generated
	 */
	EClass getComponentRole();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPatterns.ComponentRole#getBasicComponent <em>Basic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Basic Component</em>'.
	 * @see security.securityPatterns.ComponentRole#getBasicComponent()
	 * @see #getComponentRole()
	 * @generated
	 */
	EReference getComponentRole_BasicComponent();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPatterns.ComponentRole#getOperationInterface <em>Operation Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operation Interface</em>'.
	 * @see security.securityPatterns.ComponentRole#getOperationInterface()
	 * @see #getComponentRole()
	 * @generated
	 */
	EReference getComponentRole_OperationInterface();

	/**
	 * Returns the meta object for class '{@link security.securityPatterns.ProvidedInterfaceRole <em>Provided Interface Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Interface Role</em>'.
	 * @see security.securityPatterns.ProvidedInterfaceRole
	 * @generated
	 */
	EClass getProvidedInterfaceRole();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPatterns.ProvidedInterfaceRole#getOperationProvidedRole <em>Operation Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operation Provided Role</em>'.
	 * @see security.securityPatterns.ProvidedInterfaceRole#getOperationProvidedRole()
	 * @see #getProvidedInterfaceRole()
	 * @generated
	 */
	EReference getProvidedInterfaceRole_OperationProvidedRole();

	/**
	 * Returns the meta object for class '{@link security.securityPatterns.AssemblyRole <em>Assembly Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Role</em>'.
	 * @see security.securityPatterns.AssemblyRole
	 * @generated
	 */
	EClass getAssemblyRole();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPatterns.AssemblyRole#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assembly Context</em>'.
	 * @see security.securityPatterns.AssemblyRole#getAssemblyContext()
	 * @see #getAssemblyRole()
	 * @generated
	 */
	EReference getAssemblyRole_AssemblyContext();

	/**
	 * Returns the meta object for class '{@link security.securityPatterns.SystemRole <em>System Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Role</em>'.
	 * @see security.securityPatterns.SystemRole
	 * @generated
	 */
	EClass getSystemRole();

	/**
	 * Returns the meta object for the reference '{@link security.securityPatterns.SystemRole#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see security.securityPatterns.SystemRole#getSystem()
	 * @see #getSystemRole()
	 * @generated
	 */
	EReference getSystemRole_System();

	/**
	 * Returns the meta object for class '{@link security.securityPatterns.ContainerRole <em>Container Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Role</em>'.
	 * @see security.securityPatterns.ContainerRole
	 * @generated
	 */
	EClass getContainerRole();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPatterns.ContainerRole#getResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Container</em>'.
	 * @see security.securityPatterns.ContainerRole#getResourceContainer()
	 * @see #getContainerRole()
	 * @generated
	 */
	EReference getContainerRole_ResourceContainer();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPatterns.ContainerRole#getProcessingResourceSpecification <em>Processing Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processing Resource Specification</em>'.
	 * @see security.securityPatterns.ContainerRole#getProcessingResourceSpecification()
	 * @see #getContainerRole()
	 * @generated
	 */
	EReference getContainerRole_ProcessingResourceSpecification();

	/**
	 * Returns the meta object for class '{@link security.securityPatterns.EnvironmentRole <em>Environment Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Role</em>'.
	 * @see security.securityPatterns.EnvironmentRole
	 * @generated
	 */
	EClass getEnvironmentRole();

	/**
	 * Returns the meta object for the reference '{@link security.securityPatterns.EnvironmentRole#getResourceEnvironment <em>Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Environment</em>'.
	 * @see security.securityPatterns.EnvironmentRole#getResourceEnvironment()
	 * @see #getEnvironmentRole()
	 * @generated
	 */
	EReference getEnvironmentRole_ResourceEnvironment();

	/**
	 * Returns the meta object for the reference '{@link security.securityPatterns.EnvironmentRole#getLinkingResource <em>Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linking Resource</em>'.
	 * @see security.securityPatterns.EnvironmentRole#getLinkingResource()
	 * @see #getEnvironmentRole()
	 * @generated
	 */
	EReference getEnvironmentRole_LinkingResource();

	/**
	 * Returns the meta object for class '{@link security.securityPatterns.UsageRole <em>Usage Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Role</em>'.
	 * @see security.securityPatterns.UsageRole
	 * @generated
	 */
	EClass getUsageRole();

	/**
	 * Returns the meta object for the reference '{@link security.securityPatterns.UsageRole#getUsageScenario <em>Usage Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usage Scenario</em>'.
	 * @see security.securityPatterns.UsageRole#getUsageScenario()
	 * @see #getUsageRole()
	 * @generated
	 */
	EReference getUsageRole_UsageScenario();

	/**
	 * Returns the meta object for the reference '{@link security.securityPatterns.UsageRole#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workload</em>'.
	 * @see security.securityPatterns.UsageRole#getWorkload()
	 * @see #getUsageRole()
	 * @generated
	 */
	EReference getUsageRole_Workload();

	/**
	 * Returns the meta object for class '{@link security.securityPatterns.AllocationRole <em>Allocation Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Role</em>'.
	 * @see security.securityPatterns.AllocationRole
	 * @generated
	 */
	EClass getAllocationRole();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPatterns.AllocationRole#getAllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocation Context</em>'.
	 * @see security.securityPatterns.AllocationRole#getAllocationContext()
	 * @see #getAllocationRole()
	 * @generated
	 */
	EReference getAllocationRole_AllocationContext();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPatterns.AllocationRole#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocation</em>'.
	 * @see security.securityPatterns.AllocationRole#getAllocation()
	 * @see #getAllocationRole()
	 * @generated
	 */
	EReference getAllocationRole_Allocation();

	/**
	 * Returns the meta object for enum '{@link security.securityPatterns.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see security.securityPatterns.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecurityPatternsFactory getSecurityPatternsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link security.securityPatterns.impl.PatternCatalogImpl <em>Pattern Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPatterns.impl.PatternCatalogImpl
		 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getPatternCatalog()
		 * @generated
		 */
		EClass PATTERN_CATALOG = eINSTANCE.getPatternCatalog();

		/**
		 * The meta object literal for the '<em><b>Security Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_CATALOG__SECURITY_PATTERNS = eINSTANCE.getPatternCatalog_SecurityPatterns();

		/**
		 * The meta object literal for the '{@link security.securityPatterns.impl.SecurityPatternImpl <em>Security Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPatterns.impl.SecurityPatternImpl
		 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getSecurityPattern()
		 * @generated
		 */
		EClass SECURITY_PATTERN = eINSTANCE.getSecurityPattern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_PATTERN__NAME = eINSTANCE.getSecurityPattern_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_PATTERN__DESCRIPTION = eINSTANCE.getSecurityPattern_Description();

		/**
		 * The meta object literal for the '<em><b>Stakeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_PATTERN__STAKEHOLDER = eINSTANCE.getSecurityPattern_Stakeholder();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_PATTERN__STATUS = eINSTANCE.getSecurityPattern_Status();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_PATTERN__ROLES = eINSTANCE.getSecurityPattern_Roles();

		/**
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_PATTERN__PREREQUISITES = eINSTANCE.getSecurityPattern_Prerequisites();

		/**
		 * The meta object literal for the '<em><b>Sub Security Patterns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_PATTERN__SUB_SECURITY_PATTERNS = eINSTANCE.getSecurityPattern_SubSecurityPatterns();

		/**
		 * The meta object literal for the '{@link security.securityPatterns.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPatterns.impl.RoleImpl
		 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link security.securityPatterns.impl.ComponentRoleImpl <em>Component Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPatterns.impl.ComponentRoleImpl
		 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getComponentRole()
		 * @generated
		 */
		EClass COMPONENT_ROLE = eINSTANCE.getComponentRole();

		/**
		 * The meta object literal for the '<em><b>Basic Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ROLE__BASIC_COMPONENT = eINSTANCE.getComponentRole_BasicComponent();

		/**
		 * The meta object literal for the '<em><b>Operation Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ROLE__OPERATION_INTERFACE = eINSTANCE.getComponentRole_OperationInterface();

		/**
		 * The meta object literal for the '{@link security.securityPatterns.impl.ProvidedInterfaceRoleImpl <em>Provided Interface Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPatterns.impl.ProvidedInterfaceRoleImpl
		 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getProvidedInterfaceRole()
		 * @generated
		 */
		EClass PROVIDED_INTERFACE_ROLE = eINSTANCE.getProvidedInterfaceRole();

		/**
		 * The meta object literal for the '<em><b>Operation Provided Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_INTERFACE_ROLE__OPERATION_PROVIDED_ROLE = eINSTANCE.getProvidedInterfaceRole_OperationProvidedRole();

		/**
		 * The meta object literal for the '{@link security.securityPatterns.impl.AssemblyRoleImpl <em>Assembly Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPatterns.impl.AssemblyRoleImpl
		 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getAssemblyRole()
		 * @generated
		 */
		EClass ASSEMBLY_ROLE = eINSTANCE.getAssemblyRole();

		/**
		 * The meta object literal for the '<em><b>Assembly Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_ROLE__ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyRole_AssemblyContext();

		/**
		 * The meta object literal for the '{@link security.securityPatterns.impl.SystemRoleImpl <em>System Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPatterns.impl.SystemRoleImpl
		 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getSystemRole()
		 * @generated
		 */
		EClass SYSTEM_ROLE = eINSTANCE.getSystemRole();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ROLE__SYSTEM = eINSTANCE.getSystemRole_System();

		/**
		 * The meta object literal for the '{@link security.securityPatterns.impl.ContainerRoleImpl <em>Container Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPatterns.impl.ContainerRoleImpl
		 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getContainerRole()
		 * @generated
		 */
		EClass CONTAINER_ROLE = eINSTANCE.getContainerRole();

		/**
		 * The meta object literal for the '<em><b>Resource Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROLE__RESOURCE_CONTAINER = eINSTANCE.getContainerRole_ResourceContainer();

		/**
		 * The meta object literal for the '<em><b>Processing Resource Specification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROLE__PROCESSING_RESOURCE_SPECIFICATION = eINSTANCE.getContainerRole_ProcessingResourceSpecification();

		/**
		 * The meta object literal for the '{@link security.securityPatterns.impl.EnvironmentRoleImpl <em>Environment Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPatterns.impl.EnvironmentRoleImpl
		 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getEnvironmentRole()
		 * @generated
		 */
		EClass ENVIRONMENT_ROLE = eINSTANCE.getEnvironmentRole();

		/**
		 * The meta object literal for the '<em><b>Resource Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_ROLE__RESOURCE_ENVIRONMENT = eINSTANCE.getEnvironmentRole_ResourceEnvironment();

		/**
		 * The meta object literal for the '<em><b>Linking Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_ROLE__LINKING_RESOURCE = eINSTANCE.getEnvironmentRole_LinkingResource();

		/**
		 * The meta object literal for the '{@link security.securityPatterns.impl.UsageRoleImpl <em>Usage Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPatterns.impl.UsageRoleImpl
		 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getUsageRole()
		 * @generated
		 */
		EClass USAGE_ROLE = eINSTANCE.getUsageRole();

		/**
		 * The meta object literal for the '<em><b>Usage Scenario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_ROLE__USAGE_SCENARIO = eINSTANCE.getUsageRole_UsageScenario();

		/**
		 * The meta object literal for the '<em><b>Workload</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_ROLE__WORKLOAD = eINSTANCE.getUsageRole_Workload();

		/**
		 * The meta object literal for the '{@link security.securityPatterns.impl.AllocationRoleImpl <em>Allocation Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPatterns.impl.AllocationRoleImpl
		 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getAllocationRole()
		 * @generated
		 */
		EClass ALLOCATION_ROLE = eINSTANCE.getAllocationRole();

		/**
		 * The meta object literal for the '<em><b>Allocation Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_ROLE__ALLOCATION_CONTEXT = eINSTANCE.getAllocationRole_AllocationContext();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_ROLE__ALLOCATION = eINSTANCE.getAllocationRole_Allocation();

		/**
		 * The meta object literal for the '{@link security.securityPatterns.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPatterns.Status
		 * @see security.securityPatterns.impl.SecurityPatternsPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

	}

} //SecurityPatternsPackage
