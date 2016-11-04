/**
 */
package security.securityThreats;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see security.securityThreats.SecurityThreatsFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityThreatsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "securityThreats";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fzi.de/pcm/security/securityThreats";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "securityThreats";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityThreatsPackage eINSTANCE = security.securityThreats.impl.SecurityThreatsPackageImpl.init();

	/**
	 * The meta object id for the '{@link security.securityThreats.impl.ThreatCatalogImpl <em>Threat Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityThreats.impl.ThreatCatalogImpl
	 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getThreatCatalog()
	 * @generated
	 */
	int THREAT_CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATALOG__ID = SecurityPackage.CATALOG__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATALOG__NAME = SecurityPackage.CATALOG__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATALOG__DESCRIPTION = SecurityPackage.CATALOG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATALOG__TIME_STAMP = SecurityPackage.CATALOG__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATALOG__CREATED_BY = SecurityPackage.CATALOG__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Attackers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATALOG__ATTACKERS = SecurityPackage.CATALOG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attack Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATALOG__ATTACK_TYPES = SecurityPackage.CATALOG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Threat Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATALOG_FEATURE_COUNT = SecurityPackage.CATALOG_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link security.securityThreats.impl.AttackerClassImpl <em>Attacker Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityThreats.impl.AttackerClassImpl
	 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getAttackerClass()
	 * @generated
	 */
	int ATTACKER_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_CLASS__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_CLASS__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_CLASS__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_CLASS__POSITION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Intention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_CLASS__INTENTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attack Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_CLASS__ATTACK_CAPABILITIES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_CLASS__PREREQUISITES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_CLASS__ACTIVITY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_CLASS__FOCUS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Motivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_CLASS__MOTIVATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Time Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_CLASS__TIME_CONSTRAINTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Stealth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_CLASS__STEALTH = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Attacker Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_CLASS_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link security.securityThreats.impl.AttackImpl <em>Attack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityThreats.impl.AttackImpl
	 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getAttack()
	 * @generated
	 */
	int ATTACK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__ACTIVITY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__TIME_STAMP = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__SUB_ATTACKS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attacker</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__ATTACKER = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__PREREQUISITES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Stealth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__STEALTH = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Security Violations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__SECURITY_VIOLATIONS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link security.securityThreats.impl.ComponentAttackImpl <em>Component Attack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityThreats.impl.ComponentAttackImpl
	 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getComponentAttack()
	 * @generated
	 */
	int COMPONENT_ATTACK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ATTACK__ID = ATTACK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ATTACK__NAME = ATTACK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ATTACK__DESCRIPTION = ATTACK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ATTACK__ACTIVITY = ATTACK__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ATTACK__TIME_STAMP = ATTACK__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Sub Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ATTACK__SUB_ATTACKS = ATTACK__SUB_ATTACKS;

	/**
	 * The feature id for the '<em><b>Attacker</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ATTACK__ATTACKER = ATTACK__ATTACKER;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ATTACK__PREREQUISITES = ATTACK__PREREQUISITES;

	/**
	 * The feature id for the '<em><b>Stealth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ATTACK__STEALTH = ATTACK__STEALTH;

	/**
	 * The feature id for the '<em><b>Security Violations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ATTACK__SECURITY_VIOLATIONS = ATTACK__SECURITY_VIOLATIONS;

	/**
	 * The feature id for the '<em><b>Basic Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ATTACK__BASIC_COMPONENT = ATTACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ATTACK_FEATURE_COUNT = ATTACK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link security.securityThreats.impl.SystemAttackImpl <em>System Attack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityThreats.impl.SystemAttackImpl
	 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getSystemAttack()
	 * @generated
	 */
	int SYSTEM_ATTACK = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ATTACK__ID = ATTACK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ATTACK__NAME = ATTACK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ATTACK__DESCRIPTION = ATTACK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ATTACK__ACTIVITY = ATTACK__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ATTACK__TIME_STAMP = ATTACK__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Sub Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ATTACK__SUB_ATTACKS = ATTACK__SUB_ATTACKS;

	/**
	 * The feature id for the '<em><b>Attacker</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ATTACK__ATTACKER = ATTACK__ATTACKER;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ATTACK__PREREQUISITES = ATTACK__PREREQUISITES;

	/**
	 * The feature id for the '<em><b>Stealth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ATTACK__STEALTH = ATTACK__STEALTH;

	/**
	 * The feature id for the '<em><b>Security Violations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ATTACK__SECURITY_VIOLATIONS = ATTACK__SECURITY_VIOLATIONS;

	/**
	 * The feature id for the '<em><b>Operation Provided Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ATTACK__OPERATION_PROVIDED_ROLE = ATTACK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ATTACK__SYSTEM = ATTACK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ATTACK_FEATURE_COUNT = ATTACK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link security.securityThreats.impl.ResourceAttackImpl <em>Resource Attack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityThreats.impl.ResourceAttackImpl
	 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getResourceAttack()
	 * @generated
	 */
	int RESOURCE_ATTACK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTACK__ID = ATTACK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTACK__NAME = ATTACK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTACK__DESCRIPTION = ATTACK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTACK__ACTIVITY = ATTACK__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTACK__TIME_STAMP = ATTACK__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Sub Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTACK__SUB_ATTACKS = ATTACK__SUB_ATTACKS;

	/**
	 * The feature id for the '<em><b>Attacker</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTACK__ATTACKER = ATTACK__ATTACKER;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTACK__PREREQUISITES = ATTACK__PREREQUISITES;

	/**
	 * The feature id for the '<em><b>Stealth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTACK__STEALTH = ATTACK__STEALTH;

	/**
	 * The feature id for the '<em><b>Security Violations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTACK__SECURITY_VIOLATIONS = ATTACK__SECURITY_VIOLATIONS;

	/**
	 * The feature id for the '<em><b>Resource Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTACK__RESOURCE_CONTAINER = ATTACK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linking Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTACK__LINKING_RESOURCE = ATTACK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTACK_FEATURE_COUNT = ATTACK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link security.securityThreats.impl.AllocationAttackImpl <em>Allocation Attack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityThreats.impl.AllocationAttackImpl
	 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getAllocationAttack()
	 * @generated
	 */
	int ALLOCATION_ATTACK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ATTACK__ID = ATTACK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ATTACK__NAME = ATTACK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ATTACK__DESCRIPTION = ATTACK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ATTACK__ACTIVITY = ATTACK__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ATTACK__TIME_STAMP = ATTACK__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Sub Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ATTACK__SUB_ATTACKS = ATTACK__SUB_ATTACKS;

	/**
	 * The feature id for the '<em><b>Attacker</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ATTACK__ATTACKER = ATTACK__ATTACKER;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ATTACK__PREREQUISITES = ATTACK__PREREQUISITES;

	/**
	 * The feature id for the '<em><b>Stealth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ATTACK__STEALTH = ATTACK__STEALTH;

	/**
	 * The feature id for the '<em><b>Security Violations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ATTACK__SECURITY_VIOLATIONS = ATTACK__SECURITY_VIOLATIONS;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ATTACK__ALLOCATION = ATTACK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocation Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ATTACK__ALLOCATION_CONTEXT = ATTACK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Allocation Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_ATTACK_FEATURE_COUNT = ATTACK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link security.securityThreats.impl.UsageAttackImpl <em>Usage Attack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.securityThreats.impl.UsageAttackImpl
	 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getUsageAttack()
	 * @generated
	 */
	int USAGE_ATTACK = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ATTACK__ID = ATTACK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ATTACK__NAME = ATTACK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ATTACK__DESCRIPTION = ATTACK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ATTACK__ACTIVITY = ATTACK__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ATTACK__TIME_STAMP = ATTACK__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Sub Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ATTACK__SUB_ATTACKS = ATTACK__SUB_ATTACKS;

	/**
	 * The feature id for the '<em><b>Attacker</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ATTACK__ATTACKER = ATTACK__ATTACKER;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ATTACK__PREREQUISITES = ATTACK__PREREQUISITES;

	/**
	 * The feature id for the '<em><b>Stealth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ATTACK__STEALTH = ATTACK__STEALTH;

	/**
	 * The feature id for the '<em><b>Security Violations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ATTACK__SECURITY_VIOLATIONS = ATTACK__SECURITY_VIOLATIONS;

	/**
	 * The feature id for the '<em><b>Usage Scenario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ATTACK__USAGE_SCENARIO = ATTACK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scenario Behaviour</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ATTACK__SCENARIO_BEHAVIOUR = ATTACK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Usage Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_ATTACK_FEATURE_COUNT = ATTACK_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link security.securityThreats.ThreatCatalog <em>Threat Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat Catalog</em>'.
	 * @see security.securityThreats.ThreatCatalog
	 * @generated
	 */
	EClass getThreatCatalog();

	/**
	 * Returns the meta object for the containment reference list '{@link security.securityThreats.ThreatCatalog#getAttackers <em>Attackers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attackers</em>'.
	 * @see security.securityThreats.ThreatCatalog#getAttackers()
	 * @see #getThreatCatalog()
	 * @generated
	 */
	EReference getThreatCatalog_Attackers();

	/**
	 * Returns the meta object for the containment reference list '{@link security.securityThreats.ThreatCatalog#getAttackTypes <em>Attack Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attack Types</em>'.
	 * @see security.securityThreats.ThreatCatalog#getAttackTypes()
	 * @see #getThreatCatalog()
	 * @generated
	 */
	EReference getThreatCatalog_AttackTypes();

	/**
	 * Returns the meta object for class '{@link security.securityThreats.AttackerClass <em>Attacker Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attacker Class</em>'.
	 * @see security.securityThreats.AttackerClass
	 * @generated
	 */
	EClass getAttackerClass();

	/**
	 * Returns the meta object for the attribute '{@link security.securityThreats.AttackerClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security.securityThreats.AttackerClass#getName()
	 * @see #getAttackerClass()
	 * @generated
	 */
	EAttribute getAttackerClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link security.securityThreats.AttackerClass#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see security.securityThreats.AttackerClass#getDescription()
	 * @see #getAttackerClass()
	 * @generated
	 */
	EAttribute getAttackerClass_Description();

	/**
	 * Returns the meta object for the attribute '{@link security.securityThreats.AttackerClass#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see security.securityThreats.AttackerClass#getPosition()
	 * @see #getAttackerClass()
	 * @generated
	 */
	EAttribute getAttackerClass_Position();

	/**
	 * Returns the meta object for the attribute '{@link security.securityThreats.AttackerClass#getIntention <em>Intention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intention</em>'.
	 * @see security.securityThreats.AttackerClass#getIntention()
	 * @see #getAttackerClass()
	 * @generated
	 */
	EAttribute getAttackerClass_Intention();

	/**
	 * Returns the meta object for the reference list '{@link security.securityThreats.AttackerClass#getAttackCapabilities <em>Attack Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attack Capabilities</em>'.
	 * @see security.securityThreats.AttackerClass#getAttackCapabilities()
	 * @see #getAttackerClass()
	 * @generated
	 */
	EReference getAttackerClass_AttackCapabilities();

	/**
	 * Returns the meta object for the reference list '{@link security.securityThreats.AttackerClass#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prerequisites</em>'.
	 * @see security.securityThreats.AttackerClass#getPrerequisites()
	 * @see #getAttackerClass()
	 * @generated
	 */
	EReference getAttackerClass_Prerequisites();

	/**
	 * Returns the meta object for the attribute '{@link security.securityThreats.AttackerClass#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity</em>'.
	 * @see security.securityThreats.AttackerClass#getActivity()
	 * @see #getAttackerClass()
	 * @generated
	 */
	EAttribute getAttackerClass_Activity();

	/**
	 * Returns the meta object for the attribute '{@link security.securityThreats.AttackerClass#getFocus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focus</em>'.
	 * @see security.securityThreats.AttackerClass#getFocus()
	 * @see #getAttackerClass()
	 * @generated
	 */
	EAttribute getAttackerClass_Focus();

	/**
	 * Returns the meta object for the attribute '{@link security.securityThreats.AttackerClass#getMotivation <em>Motivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motivation</em>'.
	 * @see security.securityThreats.AttackerClass#getMotivation()
	 * @see #getAttackerClass()
	 * @generated
	 */
	EAttribute getAttackerClass_Motivation();

	/**
	 * Returns the meta object for the attribute '{@link security.securityThreats.AttackerClass#getTimeConstraints <em>Time Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Constraints</em>'.
	 * @see security.securityThreats.AttackerClass#getTimeConstraints()
	 * @see #getAttackerClass()
	 * @generated
	 */
	EAttribute getAttackerClass_TimeConstraints();

	/**
	 * Returns the meta object for the attribute '{@link security.securityThreats.AttackerClass#getStealth <em>Stealth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stealth</em>'.
	 * @see security.securityThreats.AttackerClass#getStealth()
	 * @see #getAttackerClass()
	 * @generated
	 */
	EAttribute getAttackerClass_Stealth();

	/**
	 * Returns the meta object for class '{@link security.securityThreats.Attack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack</em>'.
	 * @see security.securityThreats.Attack
	 * @generated
	 */
	EClass getAttack();

	/**
	 * Returns the meta object for the attribute '{@link security.securityThreats.Attack#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see security.securityThreats.Attack#getName()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_Name();

	/**
	 * Returns the meta object for the attribute '{@link security.securityThreats.Attack#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see security.securityThreats.Attack#getDescription()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_Description();

	/**
	 * Returns the meta object for the attribute '{@link security.securityThreats.Attack#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity</em>'.
	 * @see security.securityThreats.Attack#getActivity()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_Activity();

	/**
	 * Returns the meta object for the attribute '{@link security.securityThreats.Attack#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see security.securityThreats.Attack#getTimeStamp()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_TimeStamp();

	/**
	 * Returns the meta object for the reference list '{@link security.securityThreats.Attack#getSubAttacks <em>Sub Attacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Attacks</em>'.
	 * @see security.securityThreats.Attack#getSubAttacks()
	 * @see #getAttack()
	 * @generated
	 */
	EReference getAttack_SubAttacks();

	/**
	 * Returns the meta object for the reference list '{@link security.securityThreats.Attack#getAttacker <em>Attacker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attacker</em>'.
	 * @see security.securityThreats.Attack#getAttacker()
	 * @see #getAttack()
	 * @generated
	 */
	EReference getAttack_Attacker();

	/**
	 * Returns the meta object for the reference list '{@link security.securityThreats.Attack#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prerequisites</em>'.
	 * @see security.securityThreats.Attack#getPrerequisites()
	 * @see #getAttack()
	 * @generated
	 */
	EReference getAttack_Prerequisites();

	/**
	 * Returns the meta object for the attribute '{@link security.securityThreats.Attack#getStealth <em>Stealth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stealth</em>'.
	 * @see security.securityThreats.Attack#getStealth()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_Stealth();

	/**
	 * Returns the meta object for the attribute list '{@link security.securityThreats.Attack#getSecurityViolations <em>Security Violations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Security Violations</em>'.
	 * @see security.securityThreats.Attack#getSecurityViolations()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_SecurityViolations();

	/**
	 * Returns the meta object for class '{@link security.securityThreats.ComponentAttack <em>Component Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Attack</em>'.
	 * @see security.securityThreats.ComponentAttack
	 * @generated
	 */
	EClass getComponentAttack();

	/**
	 * Returns the meta object for the reference list '{@link security.securityThreats.ComponentAttack#getBasicComponent <em>Basic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Basic Component</em>'.
	 * @see security.securityThreats.ComponentAttack#getBasicComponent()
	 * @see #getComponentAttack()
	 * @generated
	 */
	EReference getComponentAttack_BasicComponent();

	/**
	 * Returns the meta object for class '{@link security.securityThreats.SystemAttack <em>System Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Attack</em>'.
	 * @see security.securityThreats.SystemAttack
	 * @generated
	 */
	EClass getSystemAttack();

	/**
	 * Returns the meta object for the reference list '{@link security.securityThreats.SystemAttack#getOperationProvidedRole <em>Operation Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operation Provided Role</em>'.
	 * @see security.securityThreats.SystemAttack#getOperationProvidedRole()
	 * @see #getSystemAttack()
	 * @generated
	 */
	EReference getSystemAttack_OperationProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link security.securityThreats.SystemAttack#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see security.securityThreats.SystemAttack#getSystem()
	 * @see #getSystemAttack()
	 * @generated
	 */
	EReference getSystemAttack_System();

	/**
	 * Returns the meta object for class '{@link security.securityThreats.ResourceAttack <em>Resource Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Attack</em>'.
	 * @see security.securityThreats.ResourceAttack
	 * @generated
	 */
	EClass getResourceAttack();

	/**
	 * Returns the meta object for the reference list '{@link security.securityThreats.ResourceAttack#getResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Container</em>'.
	 * @see security.securityThreats.ResourceAttack#getResourceContainer()
	 * @see #getResourceAttack()
	 * @generated
	 */
	EReference getResourceAttack_ResourceContainer();

	/**
	 * Returns the meta object for the reference list '{@link security.securityThreats.ResourceAttack#getLinkingResource <em>Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linking Resource</em>'.
	 * @see security.securityThreats.ResourceAttack#getLinkingResource()
	 * @see #getResourceAttack()
	 * @generated
	 */
	EReference getResourceAttack_LinkingResource();

	/**
	 * Returns the meta object for class '{@link security.securityThreats.AllocationAttack <em>Allocation Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Attack</em>'.
	 * @see security.securityThreats.AllocationAttack
	 * @generated
	 */
	EClass getAllocationAttack();

	/**
	 * Returns the meta object for the reference list '{@link security.securityThreats.AllocationAttack#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocation</em>'.
	 * @see security.securityThreats.AllocationAttack#getAllocation()
	 * @see #getAllocationAttack()
	 * @generated
	 */
	EReference getAllocationAttack_Allocation();

	/**
	 * Returns the meta object for the reference list '{@link security.securityThreats.AllocationAttack#getAllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocation Context</em>'.
	 * @see security.securityThreats.AllocationAttack#getAllocationContext()
	 * @see #getAllocationAttack()
	 * @generated
	 */
	EReference getAllocationAttack_AllocationContext();

	/**
	 * Returns the meta object for class '{@link security.securityThreats.UsageAttack <em>Usage Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Attack</em>'.
	 * @see security.securityThreats.UsageAttack
	 * @generated
	 */
	EClass getUsageAttack();

	/**
	 * Returns the meta object for the reference list '{@link security.securityThreats.UsageAttack#getUsageScenario <em>Usage Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usage Scenario</em>'.
	 * @see security.securityThreats.UsageAttack#getUsageScenario()
	 * @see #getUsageAttack()
	 * @generated
	 */
	EReference getUsageAttack_UsageScenario();

	/**
	 * Returns the meta object for the reference list '{@link security.securityThreats.UsageAttack#getScenarioBehaviour <em>Scenario Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario Behaviour</em>'.
	 * @see security.securityThreats.UsageAttack#getScenarioBehaviour()
	 * @see #getUsageAttack()
	 * @generated
	 */
	EReference getUsageAttack_ScenarioBehaviour();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecurityThreatsFactory getSecurityThreatsFactory();

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
		 * The meta object literal for the '{@link security.securityThreats.impl.ThreatCatalogImpl <em>Threat Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityThreats.impl.ThreatCatalogImpl
		 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getThreatCatalog()
		 * @generated
		 */
		EClass THREAT_CATALOG = eINSTANCE.getThreatCatalog();

		/**
		 * The meta object literal for the '<em><b>Attackers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_CATALOG__ATTACKERS = eINSTANCE.getThreatCatalog_Attackers();

		/**
		 * The meta object literal for the '<em><b>Attack Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_CATALOG__ATTACK_TYPES = eINSTANCE.getThreatCatalog_AttackTypes();

		/**
		 * The meta object literal for the '{@link security.securityThreats.impl.AttackerClassImpl <em>Attacker Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityThreats.impl.AttackerClassImpl
		 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getAttackerClass()
		 * @generated
		 */
		EClass ATTACKER_CLASS = eINSTANCE.getAttackerClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKER_CLASS__NAME = eINSTANCE.getAttackerClass_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKER_CLASS__DESCRIPTION = eINSTANCE.getAttackerClass_Description();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKER_CLASS__POSITION = eINSTANCE.getAttackerClass_Position();

		/**
		 * The meta object literal for the '<em><b>Intention</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKER_CLASS__INTENTION = eINSTANCE.getAttackerClass_Intention();

		/**
		 * The meta object literal for the '<em><b>Attack Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER_CLASS__ATTACK_CAPABILITIES = eINSTANCE.getAttackerClass_AttackCapabilities();

		/**
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER_CLASS__PREREQUISITES = eINSTANCE.getAttackerClass_Prerequisites();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKER_CLASS__ACTIVITY = eINSTANCE.getAttackerClass_Activity();

		/**
		 * The meta object literal for the '<em><b>Focus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKER_CLASS__FOCUS = eINSTANCE.getAttackerClass_Focus();

		/**
		 * The meta object literal for the '<em><b>Motivation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKER_CLASS__MOTIVATION = eINSTANCE.getAttackerClass_Motivation();

		/**
		 * The meta object literal for the '<em><b>Time Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKER_CLASS__TIME_CONSTRAINTS = eINSTANCE.getAttackerClass_TimeConstraints();

		/**
		 * The meta object literal for the '<em><b>Stealth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKER_CLASS__STEALTH = eINSTANCE.getAttackerClass_Stealth();

		/**
		 * The meta object literal for the '{@link security.securityThreats.impl.AttackImpl <em>Attack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityThreats.impl.AttackImpl
		 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getAttack()
		 * @generated
		 */
		EClass ATTACK = eINSTANCE.getAttack();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__NAME = eINSTANCE.getAttack_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__DESCRIPTION = eINSTANCE.getAttack_Description();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__ACTIVITY = eINSTANCE.getAttack_Activity();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__TIME_STAMP = eINSTANCE.getAttack_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Sub Attacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK__SUB_ATTACKS = eINSTANCE.getAttack_SubAttacks();

		/**
		 * The meta object literal for the '<em><b>Attacker</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK__ATTACKER = eINSTANCE.getAttack_Attacker();

		/**
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK__PREREQUISITES = eINSTANCE.getAttack_Prerequisites();

		/**
		 * The meta object literal for the '<em><b>Stealth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__STEALTH = eINSTANCE.getAttack_Stealth();

		/**
		 * The meta object literal for the '<em><b>Security Violations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__SECURITY_VIOLATIONS = eINSTANCE.getAttack_SecurityViolations();

		/**
		 * The meta object literal for the '{@link security.securityThreats.impl.ComponentAttackImpl <em>Component Attack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityThreats.impl.ComponentAttackImpl
		 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getComponentAttack()
		 * @generated
		 */
		EClass COMPONENT_ATTACK = eINSTANCE.getComponentAttack();

		/**
		 * The meta object literal for the '<em><b>Basic Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ATTACK__BASIC_COMPONENT = eINSTANCE.getComponentAttack_BasicComponent();

		/**
		 * The meta object literal for the '{@link security.securityThreats.impl.SystemAttackImpl <em>System Attack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityThreats.impl.SystemAttackImpl
		 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getSystemAttack()
		 * @generated
		 */
		EClass SYSTEM_ATTACK = eINSTANCE.getSystemAttack();

		/**
		 * The meta object literal for the '<em><b>Operation Provided Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ATTACK__OPERATION_PROVIDED_ROLE = eINSTANCE.getSystemAttack_OperationProvidedRole();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ATTACK__SYSTEM = eINSTANCE.getSystemAttack_System();

		/**
		 * The meta object literal for the '{@link security.securityThreats.impl.ResourceAttackImpl <em>Resource Attack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityThreats.impl.ResourceAttackImpl
		 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getResourceAttack()
		 * @generated
		 */
		EClass RESOURCE_ATTACK = eINSTANCE.getResourceAttack();

		/**
		 * The meta object literal for the '<em><b>Resource Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ATTACK__RESOURCE_CONTAINER = eINSTANCE.getResourceAttack_ResourceContainer();

		/**
		 * The meta object literal for the '<em><b>Linking Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ATTACK__LINKING_RESOURCE = eINSTANCE.getResourceAttack_LinkingResource();

		/**
		 * The meta object literal for the '{@link security.securityThreats.impl.AllocationAttackImpl <em>Allocation Attack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityThreats.impl.AllocationAttackImpl
		 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getAllocationAttack()
		 * @generated
		 */
		EClass ALLOCATION_ATTACK = eINSTANCE.getAllocationAttack();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_ATTACK__ALLOCATION = eINSTANCE.getAllocationAttack_Allocation();

		/**
		 * The meta object literal for the '<em><b>Allocation Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_ATTACK__ALLOCATION_CONTEXT = eINSTANCE.getAllocationAttack_AllocationContext();

		/**
		 * The meta object literal for the '{@link security.securityThreats.impl.UsageAttackImpl <em>Usage Attack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.securityThreats.impl.UsageAttackImpl
		 * @see security.securityThreats.impl.SecurityThreatsPackageImpl#getUsageAttack()
		 * @generated
		 */
		EClass USAGE_ATTACK = eINSTANCE.getUsageAttack();

		/**
		 * The meta object literal for the '<em><b>Usage Scenario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_ATTACK__USAGE_SCENARIO = eINSTANCE.getUsageAttack_UsageScenario();

		/**
		 * The meta object literal for the '<em><b>Scenario Behaviour</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_ATTACK__SCENARIO_BEHAVIOUR = eINSTANCE.getUsageAttack_ScenarioBehaviour();

	}

} //SecurityThreatsPackage
