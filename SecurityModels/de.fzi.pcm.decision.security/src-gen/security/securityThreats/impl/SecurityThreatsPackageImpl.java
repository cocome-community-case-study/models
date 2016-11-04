/**
 */
package security.securityThreats.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.allocation.AllocationPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import org.palladiosimulator.pcm.system.SystemPackage;

import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

import security.SecurityPackage;

import security.impl.SecurityPackageImpl;

import security.securityPatterns.SecurityPatternsPackage;

import security.securityPatterns.impl.SecurityPatternsPackageImpl;

import security.securityPrerequisites.SecurityPrerequisitesPackage;

import security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl;

import security.securityThreats.AllocationAttack;
import security.securityThreats.Attack;
import security.securityThreats.AttackerClass;
import security.securityThreats.ComponentAttack;
import security.securityThreats.ResourceAttack;
import security.securityThreats.SecurityThreatsFactory;
import security.securityThreats.SecurityThreatsPackage;
import security.securityThreats.SystemAttack;
import security.securityThreats.ThreatCatalog;
import security.securityThreats.UsageAttack;

import security.securityThreats.enums.EnumsPackage;

import security.securityThreats.enums.impl.EnumsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityThreatsPackageImpl extends EPackageImpl implements SecurityThreatsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackerClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentAttackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemAttackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceAttackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationAttackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageAttackEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see security.securityThreats.SecurityThreatsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecurityThreatsPackageImpl() {
		super(eNS_URI, SecurityThreatsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SecurityThreatsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecurityThreatsPackage init() {
		if (isInited) return (SecurityThreatsPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityThreatsPackage.eNS_URI);

		// Obtain or create and register package
		SecurityThreatsPackageImpl theSecurityThreatsPackage = (SecurityThreatsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SecurityThreatsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SecurityThreatsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) : SecurityPackage.eINSTANCE);
		SecurityPatternsPackageImpl theSecurityPatternsPackage = (SecurityPatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPatternsPackage.eNS_URI) instanceof SecurityPatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPatternsPackage.eNS_URI) : SecurityPatternsPackage.eINSTANCE);
		SecurityPrerequisitesPackageImpl theSecurityPrerequisitesPackage = (SecurityPrerequisitesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPrerequisitesPackage.eNS_URI) instanceof SecurityPrerequisitesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPrerequisitesPackage.eNS_URI) : SecurityPrerequisitesPackage.eINSTANCE);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) : EnumsPackage.eINSTANCE);

		// Create package meta-data objects
		theSecurityThreatsPackage.createPackageContents();
		theSecurityPackage.createPackageContents();
		theSecurityPatternsPackage.createPackageContents();
		theSecurityPrerequisitesPackage.createPackageContents();
		theEnumsPackage.createPackageContents();

		// Initialize created meta-data
		theSecurityThreatsPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();
		theSecurityPatternsPackage.initializePackageContents();
		theSecurityPrerequisitesPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecurityThreatsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecurityThreatsPackage.eNS_URI, theSecurityThreatsPackage);
		return theSecurityThreatsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreatCatalog() {
		return threatCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreatCatalog_Attackers() {
		return (EReference)threatCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreatCatalog_AttackTypes() {
		return (EReference)threatCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttackerClass() {
		return attackerClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackerClass_Name() {
		return (EAttribute)attackerClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackerClass_Description() {
		return (EAttribute)attackerClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackerClass_Position() {
		return (EAttribute)attackerClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackerClass_Intention() {
		return (EAttribute)attackerClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackerClass_AttackCapabilities() {
		return (EReference)attackerClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackerClass_Prerequisites() {
		return (EReference)attackerClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackerClass_Activity() {
		return (EAttribute)attackerClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackerClass_Focus() {
		return (EAttribute)attackerClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackerClass_Motivation() {
		return (EAttribute)attackerClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackerClass_TimeConstraints() {
		return (EAttribute)attackerClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackerClass_Stealth() {
		return (EAttribute)attackerClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttack() {
		return attackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttack_Name() {
		return (EAttribute)attackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttack_Description() {
		return (EAttribute)attackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttack_Activity() {
		return (EAttribute)attackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttack_TimeStamp() {
		return (EAttribute)attackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttack_SubAttacks() {
		return (EReference)attackEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttack_Attacker() {
		return (EReference)attackEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttack_Prerequisites() {
		return (EReference)attackEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttack_Stealth() {
		return (EAttribute)attackEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttack_SecurityViolations() {
		return (EAttribute)attackEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentAttack() {
		return componentAttackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentAttack_BasicComponent() {
		return (EReference)componentAttackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemAttack() {
		return systemAttackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAttack_OperationProvidedRole() {
		return (EReference)systemAttackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAttack_System() {
		return (EReference)systemAttackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceAttack() {
		return resourceAttackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAttack_ResourceContainer() {
		return (EReference)resourceAttackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAttack_LinkingResource() {
		return (EReference)resourceAttackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationAttack() {
		return allocationAttackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationAttack_Allocation() {
		return (EReference)allocationAttackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationAttack_AllocationContext() {
		return (EReference)allocationAttackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsageAttack() {
		return usageAttackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsageAttack_UsageScenario() {
		return (EReference)usageAttackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsageAttack_ScenarioBehaviour() {
		return (EReference)usageAttackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityThreatsFactory getSecurityThreatsFactory() {
		return (SecurityThreatsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		threatCatalogEClass = createEClass(THREAT_CATALOG);
		createEReference(threatCatalogEClass, THREAT_CATALOG__ATTACKERS);
		createEReference(threatCatalogEClass, THREAT_CATALOG__ATTACK_TYPES);

		attackerClassEClass = createEClass(ATTACKER_CLASS);
		createEAttribute(attackerClassEClass, ATTACKER_CLASS__NAME);
		createEAttribute(attackerClassEClass, ATTACKER_CLASS__DESCRIPTION);
		createEAttribute(attackerClassEClass, ATTACKER_CLASS__POSITION);
		createEAttribute(attackerClassEClass, ATTACKER_CLASS__INTENTION);
		createEReference(attackerClassEClass, ATTACKER_CLASS__ATTACK_CAPABILITIES);
		createEReference(attackerClassEClass, ATTACKER_CLASS__PREREQUISITES);
		createEAttribute(attackerClassEClass, ATTACKER_CLASS__ACTIVITY);
		createEAttribute(attackerClassEClass, ATTACKER_CLASS__FOCUS);
		createEAttribute(attackerClassEClass, ATTACKER_CLASS__MOTIVATION);
		createEAttribute(attackerClassEClass, ATTACKER_CLASS__TIME_CONSTRAINTS);
		createEAttribute(attackerClassEClass, ATTACKER_CLASS__STEALTH);

		attackEClass = createEClass(ATTACK);
		createEAttribute(attackEClass, ATTACK__NAME);
		createEAttribute(attackEClass, ATTACK__DESCRIPTION);
		createEAttribute(attackEClass, ATTACK__ACTIVITY);
		createEAttribute(attackEClass, ATTACK__TIME_STAMP);
		createEReference(attackEClass, ATTACK__SUB_ATTACKS);
		createEReference(attackEClass, ATTACK__ATTACKER);
		createEReference(attackEClass, ATTACK__PREREQUISITES);
		createEAttribute(attackEClass, ATTACK__STEALTH);
		createEAttribute(attackEClass, ATTACK__SECURITY_VIOLATIONS);

		componentAttackEClass = createEClass(COMPONENT_ATTACK);
		createEReference(componentAttackEClass, COMPONENT_ATTACK__BASIC_COMPONENT);

		systemAttackEClass = createEClass(SYSTEM_ATTACK);
		createEReference(systemAttackEClass, SYSTEM_ATTACK__OPERATION_PROVIDED_ROLE);
		createEReference(systemAttackEClass, SYSTEM_ATTACK__SYSTEM);

		resourceAttackEClass = createEClass(RESOURCE_ATTACK);
		createEReference(resourceAttackEClass, RESOURCE_ATTACK__RESOURCE_CONTAINER);
		createEReference(resourceAttackEClass, RESOURCE_ATTACK__LINKING_RESOURCE);

		allocationAttackEClass = createEClass(ALLOCATION_ATTACK);
		createEReference(allocationAttackEClass, ALLOCATION_ATTACK__ALLOCATION);
		createEReference(allocationAttackEClass, ALLOCATION_ATTACK__ALLOCATION_CONTEXT);

		usageAttackEClass = createEClass(USAGE_ATTACK);
		createEReference(usageAttackEClass, USAGE_ATTACK__USAGE_SCENARIO);
		createEReference(usageAttackEClass, USAGE_ATTACK__SCENARIO_BEHAVIOUR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EnumsPackage theEnumsPackage = (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);
		SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		SecurityPrerequisitesPackage theSecurityPrerequisitesPackage = (SecurityPrerequisitesPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPrerequisitesPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		AllocationPackage theAllocationPackage = (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);
		UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theEnumsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		threatCatalogEClass.getESuperTypes().add(theSecurityPackage.getCatalog());
		attackerClassEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		attackEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		componentAttackEClass.getESuperTypes().add(this.getAttack());
		systemAttackEClass.getESuperTypes().add(this.getAttack());
		resourceAttackEClass.getESuperTypes().add(this.getAttack());
		allocationAttackEClass.getESuperTypes().add(this.getAttack());
		usageAttackEClass.getESuperTypes().add(this.getAttack());

		// Initialize classes and features; add operations and parameters
		initEClass(threatCatalogEClass, ThreatCatalog.class, "ThreatCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreatCatalog_Attackers(), this.getAttackerClass(), null, "attackers", null, 0, -1, ThreatCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatCatalog_AttackTypes(), this.getAttack(), null, "attackTypes", null, 0, -1, ThreatCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attackerClassEClass, AttackerClass.class, "AttackerClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttackerClass_Name(), ecorePackage.getEString(), "name", null, 1, 1, AttackerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackerClass_Description(), ecorePackage.getEString(), "description", null, 1, 1, AttackerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackerClass_Position(), theEnumsPackage.getPosition(), "position", null, 1, 1, AttackerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackerClass_Intention(), theEnumsPackage.getIntention(), "intention", null, 1, 1, AttackerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttackerClass_AttackCapabilities(), this.getAttack(), this.getAttack_Attacker(), "attackCapabilities", null, 1, -1, AttackerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttackerClass_Prerequisites(), theSecurityPrerequisitesPackage.getAttackerPrerequisite(), theSecurityPrerequisitesPackage.getAttackerPrerequisite_Relates(), "prerequisites", null, 1, -1, AttackerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackerClass_Activity(), theEnumsPackage.getActivity(), "activity", null, 1, 1, AttackerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackerClass_Focus(), theEnumsPackage.getFocus(), "focus", null, 1, 1, AttackerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackerClass_Motivation(), theEnumsPackage.getMotivation(), "motivation", null, 1, 1, AttackerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackerClass_TimeConstraints(), theEnumsPackage.getTimeConstraints(), "timeConstraints", null, 1, 1, AttackerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackerClass_Stealth(), theEnumsPackage.getStealth(), "stealth", null, 1, 1, AttackerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attackEClass, Attack.class, "Attack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttack_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttack_Description(), ecorePackage.getEString(), "description", null, 1, 1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttack_Activity(), theEnumsPackage.getActivity(), "activity", null, 1, 1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttack_TimeStamp(), ecorePackage.getEDate(), "timeStamp", null, 1, 1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttack_SubAttacks(), this.getAttack(), null, "subAttacks", null, 0, -1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttack_Attacker(), this.getAttackerClass(), this.getAttackerClass_AttackCapabilities(), "attacker", null, 1, -1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttack_Prerequisites(), theSecurityPrerequisitesPackage.getPrerequisite(), theSecurityPrerequisitesPackage.getPrerequisite_Attacks(), "prerequisites", null, 0, -1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttack_Stealth(), theEnumsPackage.getStealth(), "stealth", null, 1, 1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttack_SecurityViolations(), theEnumsPackage.getSecurityViolation(), "securityViolations", null, 1, -1, Attack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentAttackEClass, ComponentAttack.class, "ComponentAttack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentAttack_BasicComponent(), theRepositoryPackage.getBasicComponent(), null, "basicComponent", null, 1, -1, ComponentAttack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemAttackEClass, SystemAttack.class, "SystemAttack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemAttack_OperationProvidedRole(), theRepositoryPackage.getOperationProvidedRole(), null, "operationProvidedRole", null, 0, -1, SystemAttack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAttack_System(), theSystemPackage.getSystem(), null, "system", null, 1, 1, SystemAttack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceAttackEClass, ResourceAttack.class, "ResourceAttack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceAttack_ResourceContainer(), theResourceenvironmentPackage.getResourceContainer(), null, "resourceContainer", null, 0, -1, ResourceAttack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceAttack_LinkingResource(), theResourceenvironmentPackage.getLinkingResource(), null, "linkingResource", null, 0, -1, ResourceAttack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationAttackEClass, AllocationAttack.class, "AllocationAttack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationAttack_Allocation(), theAllocationPackage.getAllocation(), null, "allocation", null, 0, -1, AllocationAttack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationAttack_AllocationContext(), theAllocationPackage.getAllocationContext(), null, "allocationContext", null, 0, -1, AllocationAttack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usageAttackEClass, UsageAttack.class, "UsageAttack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsageAttack_UsageScenario(), theUsagemodelPackage.getUsageScenario(), null, "usageScenario", null, 0, -1, UsageAttack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsageAttack_ScenarioBehaviour(), theUsagemodelPackage.getScenarioBehaviour(), null, "scenarioBehaviour", null, 0, -1, UsageAttack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SecurityThreatsPackageImpl
