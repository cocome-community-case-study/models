/**
 */
package security.securityPrerequisites.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import security.securityPrerequisites.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPrerequisitesFactoryImpl extends EFactoryImpl implements SecurityPrerequisitesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecurityPrerequisitesFactory init() {
		try {
			SecurityPrerequisitesFactory theSecurityPrerequisitesFactory = (SecurityPrerequisitesFactory)EPackage.Registry.INSTANCE.getEFactory(SecurityPrerequisitesPackage.eNS_URI);
			if (theSecurityPrerequisitesFactory != null) {
				return theSecurityPrerequisitesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecurityPrerequisitesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPrerequisitesFactoryImpl() {
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
			case SecurityPrerequisitesPackage.PREREQUISITE_CATALOG: return createPrerequisiteCatalog();
			case SecurityPrerequisitesPackage.PREREQUISITE: return createPrerequisite();
			case SecurityPrerequisitesPackage.SECURITY_PREREQUISITE: return createSecurityPrerequisite();
			case SecurityPrerequisitesPackage.COMPONENT_PREREQUISITE: return createComponentPrerequisite();
			case SecurityPrerequisitesPackage.SYSTEM_PREREQUISITE: return createSystemPrerequisite();
			case SecurityPrerequisitesPackage.RESOURCE_PREREQUISITE: return createResourcePrerequisite();
			case SecurityPrerequisitesPackage.USAGE_PREREQUISITE: return createUsagePrerequisite();
			case SecurityPrerequisitesPackage.BUSINESS_PREREQUISITE: return createBusinessPrerequisite();
			case SecurityPrerequisitesPackage.CONFIGURATION_PREREQUISITE: return createConfigurationPrerequisite();
			case SecurityPrerequisitesPackage.ATTACKER_PREREQUISITE: return createAttackerPrerequisite();
			case SecurityPrerequisitesPackage.TECHNOLOGY_PREREQUISITE: return createTechnologyPrerequisite();
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
			case SecurityPrerequisitesPackage.STATUS:
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
			case SecurityPrerequisitesPackage.STATUS:
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
	public PrerequisiteCatalog createPrerequisiteCatalog() {
		PrerequisiteCatalogImpl prerequisiteCatalog = new PrerequisiteCatalogImpl();
		return prerequisiteCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prerequisite createPrerequisite() {
		PrerequisiteImpl prerequisite = new PrerequisiteImpl();
		return prerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPrerequisite createSecurityPrerequisite() {
		SecurityPrerequisiteImpl securityPrerequisite = new SecurityPrerequisiteImpl();
		return securityPrerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPrerequisite createComponentPrerequisite() {
		ComponentPrerequisiteImpl componentPrerequisite = new ComponentPrerequisiteImpl();
		return componentPrerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemPrerequisite createSystemPrerequisite() {
		SystemPrerequisiteImpl systemPrerequisite = new SystemPrerequisiteImpl();
		return systemPrerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePrerequisite createResourcePrerequisite() {
		ResourcePrerequisiteImpl resourcePrerequisite = new ResourcePrerequisiteImpl();
		return resourcePrerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsagePrerequisite createUsagePrerequisite() {
		UsagePrerequisiteImpl usagePrerequisite = new UsagePrerequisiteImpl();
		return usagePrerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessPrerequisite createBusinessPrerequisite() {
		BusinessPrerequisiteImpl businessPrerequisite = new BusinessPrerequisiteImpl();
		return businessPrerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPrerequisite createConfigurationPrerequisite() {
		ConfigurationPrerequisiteImpl configurationPrerequisite = new ConfigurationPrerequisiteImpl();
		return configurationPrerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerPrerequisite createAttackerPrerequisite() {
		AttackerPrerequisiteImpl attackerPrerequisite = new AttackerPrerequisiteImpl();
		return attackerPrerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologyPrerequisite createTechnologyPrerequisite() {
		TechnologyPrerequisiteImpl technologyPrerequisite = new TechnologyPrerequisiteImpl();
		return technologyPrerequisite;
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
	public SecurityPrerequisitesPackage getSecurityPrerequisitesPackage() {
		return (SecurityPrerequisitesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecurityPrerequisitesPackage getPackage() {
		return SecurityPrerequisitesPackage.eINSTANCE;
	}

} //SecurityPrerequisitesFactoryImpl
