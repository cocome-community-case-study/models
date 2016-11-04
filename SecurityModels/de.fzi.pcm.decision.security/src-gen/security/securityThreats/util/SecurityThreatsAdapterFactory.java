/**
 */
package security.securityThreats.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import security.Catalog;

import security.securityThreats.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see security.securityThreats.SecurityThreatsPackage
 * @generated
 */
public class SecurityThreatsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecurityThreatsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityThreatsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SecurityThreatsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityThreatsSwitch<Adapter> modelSwitch =
		new SecurityThreatsSwitch<Adapter>() {
			@Override
			public Adapter caseThreatCatalog(ThreatCatalog object) {
				return createThreatCatalogAdapter();
			}
			@Override
			public Adapter caseAttackerClass(AttackerClass object) {
				return createAttackerClassAdapter();
			}
			@Override
			public Adapter caseAttack(Attack object) {
				return createAttackAdapter();
			}
			@Override
			public Adapter caseComponentAttack(ComponentAttack object) {
				return createComponentAttackAdapter();
			}
			@Override
			public Adapter caseSystemAttack(SystemAttack object) {
				return createSystemAttackAdapter();
			}
			@Override
			public Adapter caseResourceAttack(ResourceAttack object) {
				return createResourceAttackAdapter();
			}
			@Override
			public Adapter caseAllocationAttack(AllocationAttack object) {
				return createAllocationAttackAdapter();
			}
			@Override
			public Adapter caseUsageAttack(UsageAttack object) {
				return createUsageAttackAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseCatalog(Catalog object) {
				return createCatalogAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link security.securityThreats.ThreatCatalog <em>Threat Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityThreats.ThreatCatalog
	 * @generated
	 */
	public Adapter createThreatCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityThreats.AttackerClass <em>Attacker Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityThreats.AttackerClass
	 * @generated
	 */
	public Adapter createAttackerClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityThreats.Attack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityThreats.Attack
	 * @generated
	 */
	public Adapter createAttackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityThreats.ComponentAttack <em>Component Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityThreats.ComponentAttack
	 * @generated
	 */
	public Adapter createComponentAttackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityThreats.SystemAttack <em>System Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityThreats.SystemAttack
	 * @generated
	 */
	public Adapter createSystemAttackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityThreats.ResourceAttack <em>Resource Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityThreats.ResourceAttack
	 * @generated
	 */
	public Adapter createResourceAttackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityThreats.AllocationAttack <em>Allocation Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityThreats.AllocationAttack
	 * @generated
	 */
	public Adapter createAllocationAttackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityThreats.UsageAttack <em>Usage Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityThreats.UsageAttack
	 * @generated
	 */
	public Adapter createUsageAttackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.Catalog
	 * @generated
	 */
	public Adapter createCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SecurityThreatsAdapterFactory
