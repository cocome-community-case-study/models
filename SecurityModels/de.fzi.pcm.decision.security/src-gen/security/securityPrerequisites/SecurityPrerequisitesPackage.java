/**
 */
package security.securityPrerequisites;

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
 * @see security.securityPrerequisites.SecurityPrerequisitesFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityPrerequisitesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "securityPrerequisites";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fzi.de/pcm/security/securityPrerequisites";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "securityPrerequisites";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPrerequisitesPackage eINSTANCE = security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl.init();

	/**
	 * The meta object id for the '{@link security.securityPrerequisites.impl.PrerequisiteCatalogImpl <em>Prerequisite Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPrerequisites.impl.PrerequisiteCatalogImpl
	 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getPrerequisiteCatalog()
	 * @generated
	 */
	int PREREQUISITE_CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_CATALOG__ID = SecurityPackage.CATALOG__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_CATALOG__NAME = SecurityPackage.CATALOG__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_CATALOG__DESCRIPTION = SecurityPackage.CATALOG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_CATALOG__TIME_STAMP = SecurityPackage.CATALOG__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_CATALOG__CREATED_BY = SecurityPackage.CATALOG__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_CATALOG__PREREQUISITES = SecurityPackage.CATALOG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerequisite Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_CATALOG_FEATURE_COUNT = SecurityPackage.CATALOG_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link security.securityPrerequisites.impl.PrerequisiteImpl <em>Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPrerequisites.impl.PrerequisiteImpl
	 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getPrerequisite()
	 * @generated
	 */
	int PREREQUISITE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__STATUS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State Positive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__STATE_POSITIVE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Security Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__SECURITY_PATTERNS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__ATTACKS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__MATCHES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__TECHNOLOGY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__TIME_STAMP = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Prerequisite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link security.securityPrerequisites.impl.SecurityPrerequisiteImpl <em>Security Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPrerequisites.impl.SecurityPrerequisiteImpl
	 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getSecurityPrerequisite()
	 * @generated
	 */
	int SECURITY_PREREQUISITE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PREREQUISITE__ID = PREREQUISITE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PREREQUISITE__NAME = PREREQUISITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PREREQUISITE__DESCRIPTION = PREREQUISITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PREREQUISITE__STATUS = PREREQUISITE__STATUS;

	/**
	 * The feature id for the '<em><b>State Positive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PREREQUISITE__STATE_POSITIVE = PREREQUISITE__STATE_POSITIVE;

	/**
	 * The feature id for the '<em><b>Security Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PREREQUISITE__SECURITY_PATTERNS = PREREQUISITE__SECURITY_PATTERNS;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PREREQUISITE__ATTACKS = PREREQUISITE__ATTACKS;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PREREQUISITE__MATCHES = PREREQUISITE__MATCHES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PREREQUISITE__TECHNOLOGY = PREREQUISITE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PREREQUISITE__TIME_STAMP = PREREQUISITE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Relates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PREREQUISITE__RELATES = PREREQUISITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Prerequisite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PREREQUISITE_FEATURE_COUNT = PREREQUISITE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link security.securityPrerequisites.impl.ComponentPrerequisiteImpl <em>Component Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPrerequisites.impl.ComponentPrerequisiteImpl
	 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getComponentPrerequisite()
	 * @generated
	 */
	int COMPONENT_PREREQUISITE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PREREQUISITE__ID = PREREQUISITE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PREREQUISITE__NAME = PREREQUISITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PREREQUISITE__DESCRIPTION = PREREQUISITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PREREQUISITE__STATUS = PREREQUISITE__STATUS;

	/**
	 * The feature id for the '<em><b>State Positive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PREREQUISITE__STATE_POSITIVE = PREREQUISITE__STATE_POSITIVE;

	/**
	 * The feature id for the '<em><b>Security Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PREREQUISITE__SECURITY_PATTERNS = PREREQUISITE__SECURITY_PATTERNS;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PREREQUISITE__ATTACKS = PREREQUISITE__ATTACKS;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PREREQUISITE__MATCHES = PREREQUISITE__MATCHES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PREREQUISITE__TECHNOLOGY = PREREQUISITE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PREREQUISITE__TIME_STAMP = PREREQUISITE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Relates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PREREQUISITE__RELATES = PREREQUISITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Prerequisite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PREREQUISITE_FEATURE_COUNT = PREREQUISITE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link security.securityPrerequisites.impl.SystemPrerequisiteImpl <em>System Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPrerequisites.impl.SystemPrerequisiteImpl
	 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getSystemPrerequisite()
	 * @generated
	 */
	int SYSTEM_PREREQUISITE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PREREQUISITE__ID = PREREQUISITE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PREREQUISITE__NAME = PREREQUISITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PREREQUISITE__DESCRIPTION = PREREQUISITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PREREQUISITE__STATUS = PREREQUISITE__STATUS;

	/**
	 * The feature id for the '<em><b>State Positive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PREREQUISITE__STATE_POSITIVE = PREREQUISITE__STATE_POSITIVE;

	/**
	 * The feature id for the '<em><b>Security Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PREREQUISITE__SECURITY_PATTERNS = PREREQUISITE__SECURITY_PATTERNS;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PREREQUISITE__ATTACKS = PREREQUISITE__ATTACKS;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PREREQUISITE__MATCHES = PREREQUISITE__MATCHES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PREREQUISITE__TECHNOLOGY = PREREQUISITE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PREREQUISITE__TIME_STAMP = PREREQUISITE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Relates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PREREQUISITE__RELATES = PREREQUISITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Prerequisite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PREREQUISITE_FEATURE_COUNT = PREREQUISITE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link security.securityPrerequisites.impl.ResourcePrerequisiteImpl <em>Resource Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPrerequisites.impl.ResourcePrerequisiteImpl
	 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getResourcePrerequisite()
	 * @generated
	 */
	int RESOURCE_PREREQUISITE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PREREQUISITE__ID = PREREQUISITE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PREREQUISITE__NAME = PREREQUISITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PREREQUISITE__DESCRIPTION = PREREQUISITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PREREQUISITE__STATUS = PREREQUISITE__STATUS;

	/**
	 * The feature id for the '<em><b>State Positive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PREREQUISITE__STATE_POSITIVE = PREREQUISITE__STATE_POSITIVE;

	/**
	 * The feature id for the '<em><b>Security Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PREREQUISITE__SECURITY_PATTERNS = PREREQUISITE__SECURITY_PATTERNS;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PREREQUISITE__ATTACKS = PREREQUISITE__ATTACKS;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PREREQUISITE__MATCHES = PREREQUISITE__MATCHES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PREREQUISITE__TECHNOLOGY = PREREQUISITE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PREREQUISITE__TIME_STAMP = PREREQUISITE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Relates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PREREQUISITE__RELATES = PREREQUISITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Prerequisite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PREREQUISITE_FEATURE_COUNT = PREREQUISITE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link security.securityPrerequisites.impl.UsagePrerequisiteImpl <em>Usage Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPrerequisites.impl.UsagePrerequisiteImpl
	 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getUsagePrerequisite()
	 * @generated
	 */
	int USAGE_PREREQUISITE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_PREREQUISITE__ID = PREREQUISITE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_PREREQUISITE__NAME = PREREQUISITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_PREREQUISITE__DESCRIPTION = PREREQUISITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_PREREQUISITE__STATUS = PREREQUISITE__STATUS;

	/**
	 * The feature id for the '<em><b>State Positive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_PREREQUISITE__STATE_POSITIVE = PREREQUISITE__STATE_POSITIVE;

	/**
	 * The feature id for the '<em><b>Security Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_PREREQUISITE__SECURITY_PATTERNS = PREREQUISITE__SECURITY_PATTERNS;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_PREREQUISITE__ATTACKS = PREREQUISITE__ATTACKS;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_PREREQUISITE__MATCHES = PREREQUISITE__MATCHES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_PREREQUISITE__TECHNOLOGY = PREREQUISITE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_PREREQUISITE__TIME_STAMP = PREREQUISITE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Relates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_PREREQUISITE__RELATES = PREREQUISITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Usage Prerequisite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_PREREQUISITE_FEATURE_COUNT = PREREQUISITE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link security.securityPrerequisites.impl.BusinessPrerequisiteImpl <em>Business Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPrerequisites.impl.BusinessPrerequisiteImpl
	 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getBusinessPrerequisite()
	 * @generated
	 */
	int BUSINESS_PREREQUISITE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PREREQUISITE__ID = PREREQUISITE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PREREQUISITE__NAME = PREREQUISITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PREREQUISITE__DESCRIPTION = PREREQUISITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PREREQUISITE__STATUS = PREREQUISITE__STATUS;

	/**
	 * The feature id for the '<em><b>State Positive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PREREQUISITE__STATE_POSITIVE = PREREQUISITE__STATE_POSITIVE;

	/**
	 * The feature id for the '<em><b>Security Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PREREQUISITE__SECURITY_PATTERNS = PREREQUISITE__SECURITY_PATTERNS;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PREREQUISITE__ATTACKS = PREREQUISITE__ATTACKS;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PREREQUISITE__MATCHES = PREREQUISITE__MATCHES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PREREQUISITE__TECHNOLOGY = PREREQUISITE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PREREQUISITE__TIME_STAMP = PREREQUISITE__TIME_STAMP;

	/**
	 * The number of structural features of the '<em>Business Prerequisite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PREREQUISITE_FEATURE_COUNT = PREREQUISITE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link security.securityPrerequisites.impl.ConfigurationPrerequisiteImpl <em>Configuration Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPrerequisites.impl.ConfigurationPrerequisiteImpl
	 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getConfigurationPrerequisite()
	 * @generated
	 */
	int CONFIGURATION_PREREQUISITE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PREREQUISITE__ID = PREREQUISITE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PREREQUISITE__NAME = PREREQUISITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PREREQUISITE__DESCRIPTION = PREREQUISITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PREREQUISITE__STATUS = PREREQUISITE__STATUS;

	/**
	 * The feature id for the '<em><b>State Positive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PREREQUISITE__STATE_POSITIVE = PREREQUISITE__STATE_POSITIVE;

	/**
	 * The feature id for the '<em><b>Security Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PREREQUISITE__SECURITY_PATTERNS = PREREQUISITE__SECURITY_PATTERNS;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PREREQUISITE__ATTACKS = PREREQUISITE__ATTACKS;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PREREQUISITE__MATCHES = PREREQUISITE__MATCHES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PREREQUISITE__TECHNOLOGY = PREREQUISITE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PREREQUISITE__TIME_STAMP = PREREQUISITE__TIME_STAMP;

	/**
	 * The number of structural features of the '<em>Configuration Prerequisite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PREREQUISITE_FEATURE_COUNT = PREREQUISITE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link security.securityPrerequisites.impl.AttackerPrerequisiteImpl <em>Attacker Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPrerequisites.impl.AttackerPrerequisiteImpl
	 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getAttackerPrerequisite()
	 * @generated
	 */
	int ATTACKER_PREREQUISITE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_PREREQUISITE__ID = PREREQUISITE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_PREREQUISITE__NAME = PREREQUISITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_PREREQUISITE__DESCRIPTION = PREREQUISITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_PREREQUISITE__STATUS = PREREQUISITE__STATUS;

	/**
	 * The feature id for the '<em><b>State Positive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_PREREQUISITE__STATE_POSITIVE = PREREQUISITE__STATE_POSITIVE;

	/**
	 * The feature id for the '<em><b>Security Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_PREREQUISITE__SECURITY_PATTERNS = PREREQUISITE__SECURITY_PATTERNS;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_PREREQUISITE__ATTACKS = PREREQUISITE__ATTACKS;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_PREREQUISITE__MATCHES = PREREQUISITE__MATCHES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_PREREQUISITE__TECHNOLOGY = PREREQUISITE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_PREREQUISITE__TIME_STAMP = PREREQUISITE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Relates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_PREREQUISITE__RELATES = PREREQUISITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attacker Prerequisite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_PREREQUISITE_FEATURE_COUNT = PREREQUISITE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link security.securityPrerequisites.impl.TechnologyPrerequisiteImpl <em>Technology Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPrerequisites.impl.TechnologyPrerequisiteImpl
	 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getTechnologyPrerequisite()
	 * @generated
	 */
	int TECHNOLOGY_PREREQUISITE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_PREREQUISITE__ID = PREREQUISITE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_PREREQUISITE__NAME = PREREQUISITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_PREREQUISITE__DESCRIPTION = PREREQUISITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_PREREQUISITE__STATUS = PREREQUISITE__STATUS;

	/**
	 * The feature id for the '<em><b>State Positive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_PREREQUISITE__STATE_POSITIVE = PREREQUISITE__STATE_POSITIVE;

	/**
	 * The feature id for the '<em><b>Security Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_PREREQUISITE__SECURITY_PATTERNS = PREREQUISITE__SECURITY_PATTERNS;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_PREREQUISITE__ATTACKS = PREREQUISITE__ATTACKS;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_PREREQUISITE__MATCHES = PREREQUISITE__MATCHES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_PREREQUISITE__TECHNOLOGY = PREREQUISITE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_PREREQUISITE__TIME_STAMP = PREREQUISITE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_PREREQUISITE__DEPENDS = PREREQUISITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Technology Prerequisite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_PREREQUISITE_FEATURE_COUNT = PREREQUISITE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link security.securityPrerequisites.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityPrerequisites.Status
	 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 11;


	/**
	 * Returns the meta object for class '{@link security.securityPrerequisites.PrerequisiteCatalog <em>Prerequisite Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisite Catalog</em>'.
	 * @see security.securityPrerequisites.PrerequisiteCatalog
	 * @generated
	 */
	EClass getPrerequisiteCatalog();

	/**
	 * Returns the meta object for the containment reference list '{@link security.securityPrerequisites.PrerequisiteCatalog#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prerequisites</em>'.
	 * @see security.securityPrerequisites.PrerequisiteCatalog#getPrerequisites()
	 * @see #getPrerequisiteCatalog()
	 * @generated
	 */
	EReference getPrerequisiteCatalog_Prerequisites();

	/**
	 * Returns the meta object for class '{@link security.securityPrerequisites.Prerequisite <em>Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisite</em>'.
	 * @see security.securityPrerequisites.Prerequisite
	 * @generated
	 */
	EClass getPrerequisite();

	/**
	 * Returns the meta object for the attribute '{@link security.securityPrerequisites.Prerequisite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security.securityPrerequisites.Prerequisite#getName()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EAttribute getPrerequisite_Name();

	/**
	 * Returns the meta object for the attribute '{@link security.securityPrerequisites.Prerequisite#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see security.securityPrerequisites.Prerequisite#getDescription()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EAttribute getPrerequisite_Description();

	/**
	 * Returns the meta object for the attribute '{@link security.securityPrerequisites.Prerequisite#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see security.securityPrerequisites.Prerequisite#getStatus()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EAttribute getPrerequisite_Status();

	/**
	 * Returns the meta object for the attribute '{@link security.securityPrerequisites.Prerequisite#isStatePositive <em>State Positive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Positive</em>'.
	 * @see security.securityPrerequisites.Prerequisite#isStatePositive()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EAttribute getPrerequisite_StatePositive();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPrerequisites.Prerequisite#getSecurityPatterns <em>Security Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Patterns</em>'.
	 * @see security.securityPrerequisites.Prerequisite#getSecurityPatterns()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EReference getPrerequisite_SecurityPatterns();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPrerequisites.Prerequisite#getAttacks <em>Attacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attacks</em>'.
	 * @see security.securityPrerequisites.Prerequisite#getAttacks()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EReference getPrerequisite_Attacks();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPrerequisites.Prerequisite#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matches</em>'.
	 * @see security.securityPrerequisites.Prerequisite#getMatches()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EReference getPrerequisite_Matches();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPrerequisites.Prerequisite#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Technology</em>'.
	 * @see security.securityPrerequisites.Prerequisite#getTechnology()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EReference getPrerequisite_Technology();

	/**
	 * Returns the meta object for the attribute '{@link security.securityPrerequisites.Prerequisite#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see security.securityPrerequisites.Prerequisite#getTimeStamp()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EAttribute getPrerequisite_TimeStamp();

	/**
	 * Returns the meta object for class '{@link security.securityPrerequisites.SecurityPrerequisite <em>Security Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Prerequisite</em>'.
	 * @see security.securityPrerequisites.SecurityPrerequisite
	 * @generated
	 */
	EClass getSecurityPrerequisite();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPrerequisites.SecurityPrerequisite#getRelates <em>Relates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relates</em>'.
	 * @see security.securityPrerequisites.SecurityPrerequisite#getRelates()
	 * @see #getSecurityPrerequisite()
	 * @generated
	 */
	EReference getSecurityPrerequisite_Relates();

	/**
	 * Returns the meta object for class '{@link security.securityPrerequisites.ComponentPrerequisite <em>Component Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Prerequisite</em>'.
	 * @see security.securityPrerequisites.ComponentPrerequisite
	 * @generated
	 */
	EClass getComponentPrerequisite();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPrerequisites.ComponentPrerequisite#getRelates <em>Relates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relates</em>'.
	 * @see security.securityPrerequisites.ComponentPrerequisite#getRelates()
	 * @see #getComponentPrerequisite()
	 * @generated
	 */
	EReference getComponentPrerequisite_Relates();

	/**
	 * Returns the meta object for class '{@link security.securityPrerequisites.SystemPrerequisite <em>System Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Prerequisite</em>'.
	 * @see security.securityPrerequisites.SystemPrerequisite
	 * @generated
	 */
	EClass getSystemPrerequisite();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPrerequisites.SystemPrerequisite#getRelates <em>Relates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relates</em>'.
	 * @see security.securityPrerequisites.SystemPrerequisite#getRelates()
	 * @see #getSystemPrerequisite()
	 * @generated
	 */
	EReference getSystemPrerequisite_Relates();

	/**
	 * Returns the meta object for class '{@link security.securityPrerequisites.ResourcePrerequisite <em>Resource Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Prerequisite</em>'.
	 * @see security.securityPrerequisites.ResourcePrerequisite
	 * @generated
	 */
	EClass getResourcePrerequisite();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPrerequisites.ResourcePrerequisite#getRelates <em>Relates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relates</em>'.
	 * @see security.securityPrerequisites.ResourcePrerequisite#getRelates()
	 * @see #getResourcePrerequisite()
	 * @generated
	 */
	EReference getResourcePrerequisite_Relates();

	/**
	 * Returns the meta object for class '{@link security.securityPrerequisites.UsagePrerequisite <em>Usage Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Prerequisite</em>'.
	 * @see security.securityPrerequisites.UsagePrerequisite
	 * @generated
	 */
	EClass getUsagePrerequisite();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPrerequisites.UsagePrerequisite#getRelates <em>Relates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relates</em>'.
	 * @see security.securityPrerequisites.UsagePrerequisite#getRelates()
	 * @see #getUsagePrerequisite()
	 * @generated
	 */
	EReference getUsagePrerequisite_Relates();

	/**
	 * Returns the meta object for class '{@link security.securityPrerequisites.BusinessPrerequisite <em>Business Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Prerequisite</em>'.
	 * @see security.securityPrerequisites.BusinessPrerequisite
	 * @generated
	 */
	EClass getBusinessPrerequisite();

	/**
	 * Returns the meta object for class '{@link security.securityPrerequisites.ConfigurationPrerequisite <em>Configuration Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Prerequisite</em>'.
	 * @see security.securityPrerequisites.ConfigurationPrerequisite
	 * @generated
	 */
	EClass getConfigurationPrerequisite();

	/**
	 * Returns the meta object for class '{@link security.securityPrerequisites.AttackerPrerequisite <em>Attacker Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attacker Prerequisite</em>'.
	 * @see security.securityPrerequisites.AttackerPrerequisite
	 * @generated
	 */
	EClass getAttackerPrerequisite();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPrerequisites.AttackerPrerequisite#getRelates <em>Relates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relates</em>'.
	 * @see security.securityPrerequisites.AttackerPrerequisite#getRelates()
	 * @see #getAttackerPrerequisite()
	 * @generated
	 */
	EReference getAttackerPrerequisite_Relates();

	/**
	 * Returns the meta object for class '{@link security.securityPrerequisites.TechnologyPrerequisite <em>Technology Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Prerequisite</em>'.
	 * @see security.securityPrerequisites.TechnologyPrerequisite
	 * @generated
	 */
	EClass getTechnologyPrerequisite();

	/**
	 * Returns the meta object for the reference list '{@link security.securityPrerequisites.TechnologyPrerequisite#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends</em>'.
	 * @see security.securityPrerequisites.TechnologyPrerequisite#getDepends()
	 * @see #getTechnologyPrerequisite()
	 * @generated
	 */
	EReference getTechnologyPrerequisite_Depends();

	/**
	 * Returns the meta object for enum '{@link security.securityPrerequisites.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see security.securityPrerequisites.Status
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
	SecurityPrerequisitesFactory getSecurityPrerequisitesFactory();

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
		 * The meta object literal for the '{@link security.securityPrerequisites.impl.PrerequisiteCatalogImpl <em>Prerequisite Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPrerequisites.impl.PrerequisiteCatalogImpl
		 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getPrerequisiteCatalog()
		 * @generated
		 */
		EClass PREREQUISITE_CATALOG = eINSTANCE.getPrerequisiteCatalog();

		/**
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREREQUISITE_CATALOG__PREREQUISITES = eINSTANCE.getPrerequisiteCatalog_Prerequisites();

		/**
		 * The meta object literal for the '{@link security.securityPrerequisites.impl.PrerequisiteImpl <em>Prerequisite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPrerequisites.impl.PrerequisiteImpl
		 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getPrerequisite()
		 * @generated
		 */
		EClass PREREQUISITE = eINSTANCE.getPrerequisite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITE__NAME = eINSTANCE.getPrerequisite_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITE__DESCRIPTION = eINSTANCE.getPrerequisite_Description();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITE__STATUS = eINSTANCE.getPrerequisite_Status();

		/**
		 * The meta object literal for the '<em><b>State Positive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITE__STATE_POSITIVE = eINSTANCE.getPrerequisite_StatePositive();

		/**
		 * The meta object literal for the '<em><b>Security Patterns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREREQUISITE__SECURITY_PATTERNS = eINSTANCE.getPrerequisite_SecurityPatterns();

		/**
		 * The meta object literal for the '<em><b>Attacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREREQUISITE__ATTACKS = eINSTANCE.getPrerequisite_Attacks();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREREQUISITE__MATCHES = eINSTANCE.getPrerequisite_Matches();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREREQUISITE__TECHNOLOGY = eINSTANCE.getPrerequisite_Technology();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITE__TIME_STAMP = eINSTANCE.getPrerequisite_TimeStamp();

		/**
		 * The meta object literal for the '{@link security.securityPrerequisites.impl.SecurityPrerequisiteImpl <em>Security Prerequisite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPrerequisites.impl.SecurityPrerequisiteImpl
		 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getSecurityPrerequisite()
		 * @generated
		 */
		EClass SECURITY_PREREQUISITE = eINSTANCE.getSecurityPrerequisite();

		/**
		 * The meta object literal for the '<em><b>Relates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_PREREQUISITE__RELATES = eINSTANCE.getSecurityPrerequisite_Relates();

		/**
		 * The meta object literal for the '{@link security.securityPrerequisites.impl.ComponentPrerequisiteImpl <em>Component Prerequisite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPrerequisites.impl.ComponentPrerequisiteImpl
		 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getComponentPrerequisite()
		 * @generated
		 */
		EClass COMPONENT_PREREQUISITE = eINSTANCE.getComponentPrerequisite();

		/**
		 * The meta object literal for the '<em><b>Relates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PREREQUISITE__RELATES = eINSTANCE.getComponentPrerequisite_Relates();

		/**
		 * The meta object literal for the '{@link security.securityPrerequisites.impl.SystemPrerequisiteImpl <em>System Prerequisite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPrerequisites.impl.SystemPrerequisiteImpl
		 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getSystemPrerequisite()
		 * @generated
		 */
		EClass SYSTEM_PREREQUISITE = eINSTANCE.getSystemPrerequisite();

		/**
		 * The meta object literal for the '<em><b>Relates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_PREREQUISITE__RELATES = eINSTANCE.getSystemPrerequisite_Relates();

		/**
		 * The meta object literal for the '{@link security.securityPrerequisites.impl.ResourcePrerequisiteImpl <em>Resource Prerequisite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPrerequisites.impl.ResourcePrerequisiteImpl
		 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getResourcePrerequisite()
		 * @generated
		 */
		EClass RESOURCE_PREREQUISITE = eINSTANCE.getResourcePrerequisite();

		/**
		 * The meta object literal for the '<em><b>Relates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PREREQUISITE__RELATES = eINSTANCE.getResourcePrerequisite_Relates();

		/**
		 * The meta object literal for the '{@link security.securityPrerequisites.impl.UsagePrerequisiteImpl <em>Usage Prerequisite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPrerequisites.impl.UsagePrerequisiteImpl
		 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getUsagePrerequisite()
		 * @generated
		 */
		EClass USAGE_PREREQUISITE = eINSTANCE.getUsagePrerequisite();

		/**
		 * The meta object literal for the '<em><b>Relates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_PREREQUISITE__RELATES = eINSTANCE.getUsagePrerequisite_Relates();

		/**
		 * The meta object literal for the '{@link security.securityPrerequisites.impl.BusinessPrerequisiteImpl <em>Business Prerequisite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPrerequisites.impl.BusinessPrerequisiteImpl
		 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getBusinessPrerequisite()
		 * @generated
		 */
		EClass BUSINESS_PREREQUISITE = eINSTANCE.getBusinessPrerequisite();

		/**
		 * The meta object literal for the '{@link security.securityPrerequisites.impl.ConfigurationPrerequisiteImpl <em>Configuration Prerequisite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPrerequisites.impl.ConfigurationPrerequisiteImpl
		 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getConfigurationPrerequisite()
		 * @generated
		 */
		EClass CONFIGURATION_PREREQUISITE = eINSTANCE.getConfigurationPrerequisite();

		/**
		 * The meta object literal for the '{@link security.securityPrerequisites.impl.AttackerPrerequisiteImpl <em>Attacker Prerequisite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPrerequisites.impl.AttackerPrerequisiteImpl
		 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getAttackerPrerequisite()
		 * @generated
		 */
		EClass ATTACKER_PREREQUISITE = eINSTANCE.getAttackerPrerequisite();

		/**
		 * The meta object literal for the '<em><b>Relates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER_PREREQUISITE__RELATES = eINSTANCE.getAttackerPrerequisite_Relates();

		/**
		 * The meta object literal for the '{@link security.securityPrerequisites.impl.TechnologyPrerequisiteImpl <em>Technology Prerequisite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPrerequisites.impl.TechnologyPrerequisiteImpl
		 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getTechnologyPrerequisite()
		 * @generated
		 */
		EClass TECHNOLOGY_PREREQUISITE = eINSTANCE.getTechnologyPrerequisite();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_PREREQUISITE__DEPENDS = eINSTANCE.getTechnologyPrerequisite_Depends();

		/**
		 * The meta object literal for the '{@link security.securityPrerequisites.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityPrerequisites.Status
		 * @see security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

	}

} //SecurityPrerequisitesPackage
