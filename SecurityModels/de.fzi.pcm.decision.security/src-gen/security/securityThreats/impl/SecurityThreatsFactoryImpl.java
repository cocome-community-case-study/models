/**
 */
package security.securityThreats.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import security.securityThreats.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityThreatsFactoryImpl extends EFactoryImpl implements SecurityThreatsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecurityThreatsFactory init() {
		try {
			SecurityThreatsFactory theSecurityThreatsFactory = (SecurityThreatsFactory)EPackage.Registry.INSTANCE.getEFactory(SecurityThreatsPackage.eNS_URI);
			if (theSecurityThreatsFactory != null) {
				return theSecurityThreatsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecurityThreatsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityThreatsFactoryImpl() {
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
			case SecurityThreatsPackage.THREAT_CATALOG: return createThreatCatalog();
			case SecurityThreatsPackage.ATTACKER_CLASS: return createAttackerClass();
			case SecurityThreatsPackage.ATTACK: return createAttack();
			case SecurityThreatsPackage.COMPONENT_ATTACK: return createComponentAttack();
			case SecurityThreatsPackage.SYSTEM_ATTACK: return createSystemAttack();
			case SecurityThreatsPackage.RESOURCE_ATTACK: return createResourceAttack();
			case SecurityThreatsPackage.ALLOCATION_ATTACK: return createAllocationAttack();
			case SecurityThreatsPackage.USAGE_ATTACK: return createUsageAttack();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatCatalog createThreatCatalog() {
		ThreatCatalogImpl threatCatalog = new ThreatCatalogImpl();
		return threatCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerClass createAttackerClass() {
		AttackerClassImpl attackerClass = new AttackerClassImpl();
		return attackerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attack createAttack() {
		AttackImpl attack = new AttackImpl();
		return attack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentAttack createComponentAttack() {
		ComponentAttackImpl componentAttack = new ComponentAttackImpl();
		return componentAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAttack createSystemAttack() {
		SystemAttackImpl systemAttack = new SystemAttackImpl();
		return systemAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAttack createResourceAttack() {
		ResourceAttackImpl resourceAttack = new ResourceAttackImpl();
		return resourceAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationAttack createAllocationAttack() {
		AllocationAttackImpl allocationAttack = new AllocationAttackImpl();
		return allocationAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageAttack createUsageAttack() {
		UsageAttackImpl usageAttack = new UsageAttackImpl();
		return usageAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityThreatsPackage getSecurityThreatsPackage() {
		return (SecurityThreatsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecurityThreatsPackage getPackage() {
		return SecurityThreatsPackage.eINSTANCE;
	}

} //SecurityThreatsFactoryImpl
