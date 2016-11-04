/**
 */
package security.securityPatterns.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import security.Catalog;

import security.securityPatterns.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see security.securityPatterns.SecurityPatternsPackage
 * @generated
 */
public class SecurityPatternsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecurityPatternsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPatternsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SecurityPatternsPackage.eINSTANCE;
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
	protected SecurityPatternsSwitch<Adapter> modelSwitch =
		new SecurityPatternsSwitch<Adapter>() {
			@Override
			public Adapter casePatternCatalog(PatternCatalog object) {
				return createPatternCatalogAdapter();
			}
			@Override
			public Adapter caseSecurityPattern(SecurityPattern object) {
				return createSecurityPatternAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseComponentRole(ComponentRole object) {
				return createComponentRoleAdapter();
			}
			@Override
			public Adapter caseProvidedInterfaceRole(ProvidedInterfaceRole object) {
				return createProvidedInterfaceRoleAdapter();
			}
			@Override
			public Adapter caseAssemblyRole(AssemblyRole object) {
				return createAssemblyRoleAdapter();
			}
			@Override
			public Adapter caseSystemRole(SystemRole object) {
				return createSystemRoleAdapter();
			}
			@Override
			public Adapter caseContainerRole(ContainerRole object) {
				return createContainerRoleAdapter();
			}
			@Override
			public Adapter caseEnvironmentRole(EnvironmentRole object) {
				return createEnvironmentRoleAdapter();
			}
			@Override
			public Adapter caseUsageRole(UsageRole object) {
				return createUsageRoleAdapter();
			}
			@Override
			public Adapter caseAllocationRole(AllocationRole object) {
				return createAllocationRoleAdapter();
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
	 * Creates a new adapter for an object of class '{@link security.securityPatterns.PatternCatalog <em>Pattern Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPatterns.PatternCatalog
	 * @generated
	 */
	public Adapter createPatternCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPatterns.SecurityPattern <em>Security Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPatterns.SecurityPattern
	 * @generated
	 */
	public Adapter createSecurityPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPatterns.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPatterns.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPatterns.ComponentRole <em>Component Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPatterns.ComponentRole
	 * @generated
	 */
	public Adapter createComponentRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPatterns.ProvidedInterfaceRole <em>Provided Interface Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPatterns.ProvidedInterfaceRole
	 * @generated
	 */
	public Adapter createProvidedInterfaceRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPatterns.AssemblyRole <em>Assembly Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPatterns.AssemblyRole
	 * @generated
	 */
	public Adapter createAssemblyRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPatterns.SystemRole <em>System Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPatterns.SystemRole
	 * @generated
	 */
	public Adapter createSystemRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPatterns.ContainerRole <em>Container Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPatterns.ContainerRole
	 * @generated
	 */
	public Adapter createContainerRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPatterns.EnvironmentRole <em>Environment Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPatterns.EnvironmentRole
	 * @generated
	 */
	public Adapter createEnvironmentRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPatterns.UsageRole <em>Usage Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPatterns.UsageRole
	 * @generated
	 */
	public Adapter createUsageRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPatterns.AllocationRole <em>Allocation Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPatterns.AllocationRole
	 * @generated
	 */
	public Adapter createAllocationRoleAdapter() {
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

} //SecurityPatternsAdapterFactory
