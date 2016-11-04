/**
 */
package security.securityPrerequisites.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import org.palladiosimulator.pcm.system.SystemPackage;

import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

import security.SecurityPackage;

import security.impl.SecurityPackageImpl;

import security.securityPatterns.SecurityPatternsPackage;

import security.securityPatterns.impl.SecurityPatternsPackageImpl;

import security.securityPrerequisites.AttackerPrerequisite;
import security.securityPrerequisites.BusinessPrerequisite;
import security.securityPrerequisites.ComponentPrerequisite;
import security.securityPrerequisites.ConfigurationPrerequisite;
import security.securityPrerequisites.Prerequisite;
import security.securityPrerequisites.PrerequisiteCatalog;
import security.securityPrerequisites.ResourcePrerequisite;
import security.securityPrerequisites.SecurityPrerequisite;
import security.securityPrerequisites.SecurityPrerequisitesFactory;
import security.securityPrerequisites.SecurityPrerequisitesPackage;
import security.securityPrerequisites.Status;
import security.securityPrerequisites.SystemPrerequisite;
import security.securityPrerequisites.TechnologyPrerequisite;
import security.securityPrerequisites.UsagePrerequisite;

import security.securityThreats.SecurityThreatsPackage;

import security.securityThreats.enums.EnumsPackage;

import security.securityThreats.enums.impl.EnumsPackageImpl;

import security.securityThreats.impl.SecurityThreatsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPrerequisitesPackageImpl extends EPackageImpl implements SecurityPrerequisitesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisiteCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityPrerequisiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPrerequisiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemPrerequisiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePrerequisiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usagePrerequisiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessPrerequisiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPrerequisiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackerPrerequisiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyPrerequisiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

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
	 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecurityPrerequisitesPackageImpl() {
		super(eNS_URI, SecurityPrerequisitesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SecurityPrerequisitesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecurityPrerequisitesPackage init() {
		if (isInited) return (SecurityPrerequisitesPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPrerequisitesPackage.eNS_URI);

		// Obtain or create and register package
		SecurityPrerequisitesPackageImpl theSecurityPrerequisitesPackage = (SecurityPrerequisitesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SecurityPrerequisitesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SecurityPrerequisitesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) : SecurityPackage.eINSTANCE);
		SecurityPatternsPackageImpl theSecurityPatternsPackage = (SecurityPatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPatternsPackage.eNS_URI) instanceof SecurityPatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPatternsPackage.eNS_URI) : SecurityPatternsPackage.eINSTANCE);
		SecurityThreatsPackageImpl theSecurityThreatsPackage = (SecurityThreatsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityThreatsPackage.eNS_URI) instanceof SecurityThreatsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityThreatsPackage.eNS_URI) : SecurityThreatsPackage.eINSTANCE);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) : EnumsPackage.eINSTANCE);

		// Create package meta-data objects
		theSecurityPrerequisitesPackage.createPackageContents();
		theSecurityPackage.createPackageContents();
		theSecurityPatternsPackage.createPackageContents();
		theSecurityThreatsPackage.createPackageContents();
		theEnumsPackage.createPackageContents();

		// Initialize created meta-data
		theSecurityPrerequisitesPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();
		theSecurityPatternsPackage.initializePackageContents();
		theSecurityThreatsPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecurityPrerequisitesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecurityPrerequisitesPackage.eNS_URI, theSecurityPrerequisitesPackage);
		return theSecurityPrerequisitesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrerequisiteCatalog() {
		return prerequisiteCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrerequisiteCatalog_Prerequisites() {
		return (EReference)prerequisiteCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrerequisite() {
		return prerequisiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrerequisite_Name() {
		return (EAttribute)prerequisiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrerequisite_Description() {
		return (EAttribute)prerequisiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrerequisite_Status() {
		return (EAttribute)prerequisiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrerequisite_StatePositive() {
		return (EAttribute)prerequisiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrerequisite_SecurityPatterns() {
		return (EReference)prerequisiteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrerequisite_Attacks() {
		return (EReference)prerequisiteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrerequisite_Matches() {
		return (EReference)prerequisiteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrerequisite_Technology() {
		return (EReference)prerequisiteEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrerequisite_TimeStamp() {
		return (EAttribute)prerequisiteEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityPrerequisite() {
		return securityPrerequisiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityPrerequisite_Relates() {
		return (EReference)securityPrerequisiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentPrerequisite() {
		return componentPrerequisiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPrerequisite_Relates() {
		return (EReference)componentPrerequisiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemPrerequisite() {
		return systemPrerequisiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemPrerequisite_Relates() {
		return (EReference)systemPrerequisiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcePrerequisite() {
		return resourcePrerequisiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcePrerequisite_Relates() {
		return (EReference)resourcePrerequisiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsagePrerequisite() {
		return usagePrerequisiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsagePrerequisite_Relates() {
		return (EReference)usagePrerequisiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessPrerequisite() {
		return businessPrerequisiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationPrerequisite() {
		return configurationPrerequisiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttackerPrerequisite() {
		return attackerPrerequisiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttackerPrerequisite_Relates() {
		return (EReference)attackerPrerequisiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnologyPrerequisite() {
		return technologyPrerequisiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnologyPrerequisite_Depends() {
		return (EReference)technologyPrerequisiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPrerequisitesFactory getSecurityPrerequisitesFactory() {
		return (SecurityPrerequisitesFactory)getEFactoryInstance();
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
		prerequisiteCatalogEClass = createEClass(PREREQUISITE_CATALOG);
		createEReference(prerequisiteCatalogEClass, PREREQUISITE_CATALOG__PREREQUISITES);

		prerequisiteEClass = createEClass(PREREQUISITE);
		createEAttribute(prerequisiteEClass, PREREQUISITE__NAME);
		createEAttribute(prerequisiteEClass, PREREQUISITE__DESCRIPTION);
		createEAttribute(prerequisiteEClass, PREREQUISITE__STATUS);
		createEAttribute(prerequisiteEClass, PREREQUISITE__STATE_POSITIVE);
		createEReference(prerequisiteEClass, PREREQUISITE__SECURITY_PATTERNS);
		createEReference(prerequisiteEClass, PREREQUISITE__ATTACKS);
		createEReference(prerequisiteEClass, PREREQUISITE__MATCHES);
		createEReference(prerequisiteEClass, PREREQUISITE__TECHNOLOGY);
		createEAttribute(prerequisiteEClass, PREREQUISITE__TIME_STAMP);

		securityPrerequisiteEClass = createEClass(SECURITY_PREREQUISITE);
		createEReference(securityPrerequisiteEClass, SECURITY_PREREQUISITE__RELATES);

		componentPrerequisiteEClass = createEClass(COMPONENT_PREREQUISITE);
		createEReference(componentPrerequisiteEClass, COMPONENT_PREREQUISITE__RELATES);

		systemPrerequisiteEClass = createEClass(SYSTEM_PREREQUISITE);
		createEReference(systemPrerequisiteEClass, SYSTEM_PREREQUISITE__RELATES);

		resourcePrerequisiteEClass = createEClass(RESOURCE_PREREQUISITE);
		createEReference(resourcePrerequisiteEClass, RESOURCE_PREREQUISITE__RELATES);

		usagePrerequisiteEClass = createEClass(USAGE_PREREQUISITE);
		createEReference(usagePrerequisiteEClass, USAGE_PREREQUISITE__RELATES);

		businessPrerequisiteEClass = createEClass(BUSINESS_PREREQUISITE);

		configurationPrerequisiteEClass = createEClass(CONFIGURATION_PREREQUISITE);

		attackerPrerequisiteEClass = createEClass(ATTACKER_PREREQUISITE);
		createEReference(attackerPrerequisiteEClass, ATTACKER_PREREQUISITE__RELATES);

		technologyPrerequisiteEClass = createEClass(TECHNOLOGY_PREREQUISITE);
		createEReference(technologyPrerequisiteEClass, TECHNOLOGY_PREREQUISITE__DEPENDS);

		// Create enums
		statusEEnum = createEEnum(STATUS);
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
		SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		SecurityPatternsPackage theSecurityPatternsPackage = (SecurityPatternsPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPatternsPackage.eNS_URI);
		SecurityThreatsPackage theSecurityThreatsPackage = (SecurityThreatsPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityThreatsPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		prerequisiteCatalogEClass.getESuperTypes().add(theSecurityPackage.getCatalog());
		prerequisiteEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		securityPrerequisiteEClass.getESuperTypes().add(this.getPrerequisite());
		componentPrerequisiteEClass.getESuperTypes().add(this.getPrerequisite());
		systemPrerequisiteEClass.getESuperTypes().add(this.getPrerequisite());
		resourcePrerequisiteEClass.getESuperTypes().add(this.getPrerequisite());
		usagePrerequisiteEClass.getESuperTypes().add(this.getPrerequisite());
		businessPrerequisiteEClass.getESuperTypes().add(this.getPrerequisite());
		configurationPrerequisiteEClass.getESuperTypes().add(this.getPrerequisite());
		attackerPrerequisiteEClass.getESuperTypes().add(this.getPrerequisite());
		technologyPrerequisiteEClass.getESuperTypes().add(this.getPrerequisite());

		// Initialize classes and features; add operations and parameters
		initEClass(prerequisiteCatalogEClass, PrerequisiteCatalog.class, "PrerequisiteCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrerequisiteCatalog_Prerequisites(), this.getPrerequisite(), null, "prerequisites", null, 0, -1, PrerequisiteCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prerequisiteEClass, Prerequisite.class, "Prerequisite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrerequisite_Name(), ecorePackage.getEString(), "name", null, 1, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrerequisite_Description(), ecorePackage.getEString(), "description", null, 1, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrerequisite_Status(), this.getStatus(), "status", null, 1, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrerequisite_StatePositive(), ecorePackage.getEBoolean(), "statePositive", "true", 1, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrerequisite_SecurityPatterns(), theSecurityPatternsPackage.getSecurityPattern(), theSecurityPatternsPackage.getSecurityPattern_Prerequisites(), "securityPatterns", null, 0, -1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrerequisite_Attacks(), theSecurityThreatsPackage.getAttack(), theSecurityThreatsPackage.getAttack_Prerequisites(), "attacks", null, 0, -1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrerequisite_Matches(), this.getPrerequisite(), null, "matches", null, 0, -1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrerequisite_Technology(), this.getTechnologyPrerequisite(), this.getTechnologyPrerequisite_Depends(), "technology", null, 0, -1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrerequisite_TimeStamp(), ecorePackage.getEDate(), "timeStamp", null, 1, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityPrerequisiteEClass, SecurityPrerequisite.class, "SecurityPrerequisite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityPrerequisite_Relates(), theSecurityPatternsPackage.getSecurityPattern(), null, "relates", null, 1, -1, SecurityPrerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentPrerequisiteEClass, ComponentPrerequisite.class, "ComponentPrerequisite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPrerequisite_Relates(), theRepositoryPackage.getBasicComponent(), null, "relates", null, 1, -1, ComponentPrerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemPrerequisiteEClass, SystemPrerequisite.class, "SystemPrerequisite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemPrerequisite_Relates(), theSystemPackage.getSystem(), null, "relates", null, 1, -1, SystemPrerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcePrerequisiteEClass, ResourcePrerequisite.class, "ResourcePrerequisite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcePrerequisite_Relates(), theResourceenvironmentPackage.getResourceContainer(), null, "relates", null, 1, -1, ResourcePrerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usagePrerequisiteEClass, UsagePrerequisite.class, "UsagePrerequisite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsagePrerequisite_Relates(), theUsagemodelPackage.getUsageScenario(), null, "relates", null, 1, -1, UsagePrerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessPrerequisiteEClass, BusinessPrerequisite.class, "BusinessPrerequisite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationPrerequisiteEClass, ConfigurationPrerequisite.class, "ConfigurationPrerequisite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attackerPrerequisiteEClass, AttackerPrerequisite.class, "AttackerPrerequisite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttackerPrerequisite_Relates(), theSecurityThreatsPackage.getAttackerClass(), theSecurityThreatsPackage.getAttackerClass_Prerequisites(), "relates", null, 1, -1, AttackerPrerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologyPrerequisiteEClass, TechnologyPrerequisite.class, "TechnologyPrerequisite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnologyPrerequisite_Depends(), this.getPrerequisite(), this.getPrerequisite_Technology(), "depends", null, 1, -1, TechnologyPrerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.VALID);
		addEEnumLiteral(statusEEnum, Status.INVALID);
		addEEnumLiteral(statusEEnum, Status.DEPRECATED);
	}

} //SecurityPrerequisitesPackageImpl
