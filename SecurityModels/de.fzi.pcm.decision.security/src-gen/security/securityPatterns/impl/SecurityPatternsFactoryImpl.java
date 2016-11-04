/**
 */
package security.securityPatterns.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import security.securityPatterns.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPatternsFactoryImpl extends EFactoryImpl implements SecurityPatternsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecurityPatternsFactory init() {
		try {
			SecurityPatternsFactory theSecurityPatternsFactory = (SecurityPatternsFactory)EPackage.Registry.INSTANCE.getEFactory(SecurityPatternsPackage.eNS_URI);
			if (theSecurityPatternsFactory != null) {
				return theSecurityPatternsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecurityPatternsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPatternsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SecurityPatternsPackage.PATTERN_CATALOG: return createPatternCatalog();
			case SecurityPatternsPackage.SECURITY_PATTERN: return createSecurityPattern();
			case SecurityPatternsPackage.COMPONENT_ROLE: return createComponentRole();
			case SecurityPatternsPackage.PROVIDED_INTERFACE_ROLE: return createProvidedInterfaceRole();
			case SecurityPatternsPackage.ASSEMBLY_ROLE: return createAssemblyRole();
			case SecurityPatternsPackage.SYSTEM_ROLE: return createSystemRole();
			case SecurityPatternsPackage.CONTAINER_ROLE: return createContainerRole();
			case SecurityPatternsPackage.ENVIRONMENT_ROLE: return createEnvironmentRole();
			case SecurityPatternsPackage.USAGE_ROLE: return createUsageRole();
			case SecurityPatternsPackage.ALLOCATION_ROLE: return createAllocationRole();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SecurityPatternsPackage.STATUS:
				return createStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SecurityPatternsPackage.STATUS:
				return convertStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternCatalog createPatternCatalog() {
		PatternCatalogImpl patternCatalog = new PatternCatalogImpl();
		return patternCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPattern createSecurityPattern() {
		SecurityPatternImpl securityPattern = new SecurityPatternImpl();
		return securityPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRole createComponentRole() {
		ComponentRoleImpl componentRole = new ComponentRoleImpl();
		return componentRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedInterfaceRole createProvidedInterfaceRole() {
		ProvidedInterfaceRoleImpl providedInterfaceRole = new ProvidedInterfaceRoleImpl();
		return providedInterfaceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyRole createAssemblyRole() {
		AssemblyRoleImpl assemblyRole = new AssemblyRoleImpl();
		return assemblyRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRole createSystemRole() {
		SystemRoleImpl systemRole = new SystemRoleImpl();
		return systemRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRole createContainerRole() {
		ContainerRoleImpl containerRole = new ContainerRoleImpl();
		return containerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentRole createEnvironmentRole() {
		EnvironmentRoleImpl environmentRole = new EnvironmentRoleImpl();
		return environmentRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageRole createUsageRole() {
		UsageRoleImpl usageRole = new UsageRoleImpl();
		return usageRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationRole createAllocationRole() {
		AllocationRoleImpl allocationRole = new AllocationRoleImpl();
		return allocationRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPatternsPackage getSecurityPatternsPackage() {
		return (SecurityPatternsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecurityPatternsPackage getPackage() {
		return SecurityPatternsPackage.eINSTANCE;
	}

} //SecurityPatternsFactoryImpl
