/**
 */
package security.securityPatterns.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.allocation.AllocationPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import org.palladiosimulator.pcm.system.SystemPackage;

import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

import security.SecurityPackage;

import security.impl.SecurityPackageImpl;

import security.securityPatterns.AllocationRole;
import security.securityPatterns.AssemblyRole;
import security.securityPatterns.ComponentRole;
import security.securityPatterns.ContainerRole;
import security.securityPatterns.EnvironmentRole;
import security.securityPatterns.PatternCatalog;
import security.securityPatterns.ProvidedInterfaceRole;
import security.securityPatterns.Role;
import security.securityPatterns.SecurityPattern;
import security.securityPatterns.SecurityPatternsFactory;
import security.securityPatterns.SecurityPatternsPackage;
import security.securityPatterns.Status;
import security.securityPatterns.SystemRole;
import security.securityPatterns.UsageRole;

import security.securityPrerequisites.SecurityPrerequisitesPackage;

import security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl;

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
public class SecurityPatternsPackageImpl extends EPackageImpl implements SecurityPatternsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedInterfaceRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationRoleEClass = null;

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
	 * @see security.securityPatterns.SecurityPatternsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecurityPatternsPackageImpl() {
		super(eNS_URI, SecurityPatternsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SecurityPatternsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecurityPatternsPackage init() {
		if (isInited) return (SecurityPatternsPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPatternsPackage.eNS_URI);

		// Obtain or create and register package
		SecurityPatternsPackageImpl theSecurityPatternsPackage = (SecurityPatternsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SecurityPatternsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SecurityPatternsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) : SecurityPackage.eINSTANCE);
		SecurityPrerequisitesPackageImpl theSecurityPrerequisitesPackage = (SecurityPrerequisitesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPrerequisitesPackage.eNS_URI) instanceof SecurityPrerequisitesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPrerequisitesPackage.eNS_URI) : SecurityPrerequisitesPackage.eINSTANCE);
		SecurityThreatsPackageImpl theSecurityThreatsPackage = (SecurityThreatsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityThreatsPackage.eNS_URI) instanceof SecurityThreatsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityThreatsPackage.eNS_URI) : SecurityThreatsPackage.eINSTANCE);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) : EnumsPackage.eINSTANCE);

		// Create package meta-data objects
		theSecurityPatternsPackage.createPackageContents();
		theSecurityPackage.createPackageContents();
		theSecurityPrerequisitesPackage.createPackageContents();
		theSecurityThreatsPackage.createPackageContents();
		theEnumsPackage.createPackageContents();

		// Initialize created meta-data
		theSecurityPatternsPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();
		theSecurityPrerequisitesPackage.initializePackageContents();
		theSecurityThreatsPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecurityPatternsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecurityPatternsPackage.eNS_URI, theSecurityPatternsPackage);
		return theSecurityPatternsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternCatalog() {
		return patternCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternCatalog_SecurityPatterns() {
		return (EReference)patternCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityPattern() {
		return securityPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityPattern_Name() {
		return (EAttribute)securityPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityPattern_Description() {
		return (EAttribute)securityPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityPattern_Stakeholder() {
		return (EAttribute)securityPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityPattern_Status() {
		return (EAttribute)securityPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityPattern_Roles() {
		return (EReference)securityPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityPattern_Prerequisites() {
		return (EReference)securityPatternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityPattern_SubSecurityPatterns() {
		return (EReference)securityPatternEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentRole() {
		return componentRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentRole_BasicComponent() {
		return (EReference)componentRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentRole_OperationInterface() {
		return (EReference)componentRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedInterfaceRole() {
		return providedInterfaceRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedInterfaceRole_OperationProvidedRole() {
		return (EReference)providedInterfaceRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyRole() {
		return assemblyRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyRole_AssemblyContext() {
		return (EReference)assemblyRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemRole() {
		return systemRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemRole_System() {
		return (EReference)systemRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerRole() {
		return containerRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerRole_ResourceContainer() {
		return (EReference)containerRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerRole_ProcessingResourceSpecification() {
		return (EReference)containerRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentRole() {
		return environmentRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentRole_ResourceEnvironment() {
		return (EReference)environmentRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentRole_LinkingResource() {
		return (EReference)environmentRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsageRole() {
		return usageRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsageRole_UsageScenario() {
		return (EReference)usageRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsageRole_Workload() {
		return (EReference)usageRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationRole() {
		return allocationRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationRole_AllocationContext() {
		return (EReference)allocationRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationRole_Allocation() {
		return (EReference)allocationRoleEClass.getEStructuralFeatures().get(1);
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
	public SecurityPatternsFactory getSecurityPatternsFactory() {
		return (SecurityPatternsFactory)getEFactoryInstance();
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
		patternCatalogEClass = createEClass(PATTERN_CATALOG);
		createEReference(patternCatalogEClass, PATTERN_CATALOG__SECURITY_PATTERNS);

		securityPatternEClass = createEClass(SECURITY_PATTERN);
		createEAttribute(securityPatternEClass, SECURITY_PATTERN__NAME);
		createEAttribute(securityPatternEClass, SECURITY_PATTERN__DESCRIPTION);
		createEAttribute(securityPatternEClass, SECURITY_PATTERN__STAKEHOLDER);
		createEAttribute(securityPatternEClass, SECURITY_PATTERN__STATUS);
		createEReference(securityPatternEClass, SECURITY_PATTERN__ROLES);
		createEReference(securityPatternEClass, SECURITY_PATTERN__PREREQUISITES);
		createEReference(securityPatternEClass, SECURITY_PATTERN__SUB_SECURITY_PATTERNS);

		roleEClass = createEClass(ROLE);

		componentRoleEClass = createEClass(COMPONENT_ROLE);
		createEReference(componentRoleEClass, COMPONENT_ROLE__BASIC_COMPONENT);
		createEReference(componentRoleEClass, COMPONENT_ROLE__OPERATION_INTERFACE);

		providedInterfaceRoleEClass = createEClass(PROVIDED_INTERFACE_ROLE);
		createEReference(providedInterfaceRoleEClass, PROVIDED_INTERFACE_ROLE__OPERATION_PROVIDED_ROLE);

		assemblyRoleEClass = createEClass(ASSEMBLY_ROLE);
		createEReference(assemblyRoleEClass, ASSEMBLY_ROLE__ASSEMBLY_CONTEXT);

		systemRoleEClass = createEClass(SYSTEM_ROLE);
		createEReference(systemRoleEClass, SYSTEM_ROLE__SYSTEM);

		containerRoleEClass = createEClass(CONTAINER_ROLE);
		createEReference(containerRoleEClass, CONTAINER_ROLE__RESOURCE_CONTAINER);
		createEReference(containerRoleEClass, CONTAINER_ROLE__PROCESSING_RESOURCE_SPECIFICATION);

		environmentRoleEClass = createEClass(ENVIRONMENT_ROLE);
		createEReference(environmentRoleEClass, ENVIRONMENT_ROLE__RESOURCE_ENVIRONMENT);
		createEReference(environmentRoleEClass, ENVIRONMENT_ROLE__LINKING_RESOURCE);

		usageRoleEClass = createEClass(USAGE_ROLE);
		createEReference(usageRoleEClass, USAGE_ROLE__USAGE_SCENARIO);
		createEReference(usageRoleEClass, USAGE_ROLE__WORKLOAD);

		allocationRoleEClass = createEClass(ALLOCATION_ROLE);
		createEReference(allocationRoleEClass, ALLOCATION_ROLE__ALLOCATION_CONTEXT);
		createEReference(allocationRoleEClass, ALLOCATION_ROLE__ALLOCATION);

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
		SecurityPrerequisitesPackage theSecurityPrerequisitesPackage = (SecurityPrerequisitesPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPrerequisitesPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);
		AllocationPackage theAllocationPackage = (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		patternCatalogEClass.getESuperTypes().add(theSecurityPackage.getCatalog());
		securityPatternEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		roleEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		componentRoleEClass.getESuperTypes().add(this.getRole());
		providedInterfaceRoleEClass.getESuperTypes().add(this.getRole());
		assemblyRoleEClass.getESuperTypes().add(this.getRole());
		systemRoleEClass.getESuperTypes().add(this.getRole());
		containerRoleEClass.getESuperTypes().add(this.getRole());
		environmentRoleEClass.getESuperTypes().add(this.getRole());
		usageRoleEClass.getESuperTypes().add(this.getRole());
		allocationRoleEClass.getESuperTypes().add(this.getRole());

		// Initialize classes and features; add operations and parameters
		initEClass(patternCatalogEClass, PatternCatalog.class, "PatternCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternCatalog_SecurityPatterns(), this.getSecurityPattern(), null, "securityPatterns", null, 0, -1, PatternCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityPatternEClass, SecurityPattern.class, "SecurityPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityPattern_Name(), ecorePackage.getEString(), "name", null, 1, 1, SecurityPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityPattern_Description(), ecorePackage.getEString(), "description", null, 1, 1, SecurityPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityPattern_Stakeholder(), ecorePackage.getEString(), "stakeholder", null, 1, 1, SecurityPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityPattern_Status(), this.getStatus(), "status", null, 1, 1, SecurityPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityPattern_Roles(), this.getRole(), null, "roles", null, 1, -1, SecurityPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityPattern_Prerequisites(), theSecurityPrerequisitesPackage.getPrerequisite(), theSecurityPrerequisitesPackage.getPrerequisite_SecurityPatterns(), "prerequisites", null, 0, -1, SecurityPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityPattern_SubSecurityPatterns(), this.getSecurityPattern(), null, "subSecurityPatterns", null, 1, -1, SecurityPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentRoleEClass, ComponentRole.class, "ComponentRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentRole_BasicComponent(), theRepositoryPackage.getBasicComponent(), null, "basicComponent", null, 1, -1, ComponentRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentRole_OperationInterface(), theRepositoryPackage.getOperationInterface(), null, "operationInterface", null, 1, -1, ComponentRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedInterfaceRoleEClass, ProvidedInterfaceRole.class, "ProvidedInterfaceRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedInterfaceRole_OperationProvidedRole(), theRepositoryPackage.getOperationProvidedRole(), null, "operationProvidedRole", null, 1, -1, ProvidedInterfaceRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyRoleEClass, AssemblyRole.class, "AssemblyRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyRole_AssemblyContext(), theCompositionPackage.getAssemblyContext(), null, "assemblyContext", null, 1, -1, AssemblyRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemRoleEClass, SystemRole.class, "SystemRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemRole_System(), theSystemPackage.getSystem(), null, "system", null, 1, 1, SystemRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerRoleEClass, ContainerRole.class, "ContainerRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerRole_ResourceContainer(), theResourceenvironmentPackage.getResourceContainer(), null, "resourceContainer", null, 1, -1, ContainerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerRole_ProcessingResourceSpecification(), theResourceenvironmentPackage.getProcessingResourceSpecification(), null, "processingResourceSpecification", null, 0, -1, ContainerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentRoleEClass, EnvironmentRole.class, "EnvironmentRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironmentRole_ResourceEnvironment(), theResourceenvironmentPackage.getResourceEnvironment(), null, "resourceEnvironment", null, 1, 1, EnvironmentRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironmentRole_LinkingResource(), theResourceenvironmentPackage.getLinkingResource(), null, "linkingResource", null, 1, 1, EnvironmentRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usageRoleEClass, UsageRole.class, "UsageRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsageRole_UsageScenario(), theUsagemodelPackage.getUsageScenario(), null, "usageScenario", null, 1, 1, UsageRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsageRole_Workload(), theUsagemodelPackage.getWorkload(), null, "workload", null, 1, 1, UsageRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationRoleEClass, AllocationRole.class, "AllocationRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationRole_AllocationContext(), theAllocationPackage.getAllocationContext(), null, "allocationContext", null, 1, -1, AllocationRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationRole_Allocation(), theAllocationPackage.getAllocation(), null, "allocation", null, 1, -1, AllocationRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.VALID);
		addEEnumLiteral(statusEEnum, Status.INVALID);
	}

} //SecurityPatternsPackageImpl
