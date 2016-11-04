/**
 */
package security.securityPrerequisites.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import security.Catalog;

import security.securityPrerequisites.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see security.securityPrerequisites.SecurityPrerequisitesPackage
 * @generated
 */
public class SecurityPrerequisitesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecurityPrerequisitesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPrerequisitesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SecurityPrerequisitesPackage.eINSTANCE;
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
	protected SecurityPrerequisitesSwitch<Adapter> modelSwitch =
		new SecurityPrerequisitesSwitch<Adapter>() {
			@Override
			public Adapter casePrerequisiteCatalog(PrerequisiteCatalog object) {
				return createPrerequisiteCatalogAdapter();
			}
			@Override
			public Adapter casePrerequisite(Prerequisite object) {
				return createPrerequisiteAdapter();
			}
			@Override
			public Adapter caseSecurityPrerequisite(SecurityPrerequisite object) {
				return createSecurityPrerequisiteAdapter();
			}
			@Override
			public Adapter caseComponentPrerequisite(ComponentPrerequisite object) {
				return createComponentPrerequisiteAdapter();
			}
			@Override
			public Adapter caseSystemPrerequisite(SystemPrerequisite object) {
				return createSystemPrerequisiteAdapter();
			}
			@Override
			public Adapter caseResourcePrerequisite(ResourcePrerequisite object) {
				return createResourcePrerequisiteAdapter();
			}
			@Override
			public Adapter caseUsagePrerequisite(UsagePrerequisite object) {
				return createUsagePrerequisiteAdapter();
			}
			@Override
			public Adapter caseBusinessPrerequisite(BusinessPrerequisite object) {
				return createBusinessPrerequisiteAdapter();
			}
			@Override
			public Adapter caseConfigurationPrerequisite(ConfigurationPrerequisite object) {
				return createConfigurationPrerequisiteAdapter();
			}
			@Override
			public Adapter caseAttackerPrerequisite(AttackerPrerequisite object) {
				return createAttackerPrerequisiteAdapter();
			}
			@Override
			public Adapter caseTechnologyPrerequisite(TechnologyPrerequisite object) {
				return createTechnologyPrerequisiteAdapter();
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
	 * Creates a new adapter for an object of class '{@link security.securityPrerequisites.PrerequisiteCatalog <em>Prerequisite Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPrerequisites.PrerequisiteCatalog
	 * @generated
	 */
	public Adapter createPrerequisiteCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPrerequisites.Prerequisite <em>Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPrerequisites.Prerequisite
	 * @generated
	 */
	public Adapter createPrerequisiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPrerequisites.SecurityPrerequisite <em>Security Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPrerequisites.SecurityPrerequisite
	 * @generated
	 */
	public Adapter createSecurityPrerequisiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPrerequisites.ComponentPrerequisite <em>Component Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPrerequisites.ComponentPrerequisite
	 * @generated
	 */
	public Adapter createComponentPrerequisiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPrerequisites.SystemPrerequisite <em>System Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPrerequisites.SystemPrerequisite
	 * @generated
	 */
	public Adapter createSystemPrerequisiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPrerequisites.ResourcePrerequisite <em>Resource Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPrerequisites.ResourcePrerequisite
	 * @generated
	 */
	public Adapter createResourcePrerequisiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPrerequisites.UsagePrerequisite <em>Usage Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPrerequisites.UsagePrerequisite
	 * @generated
	 */
	public Adapter createUsagePrerequisiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPrerequisites.BusinessPrerequisite <em>Business Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPrerequisites.BusinessPrerequisite
	 * @generated
	 */
	public Adapter createBusinessPrerequisiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPrerequisites.ConfigurationPrerequisite <em>Configuration Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPrerequisites.ConfigurationPrerequisite
	 * @generated
	 */
	public Adapter createConfigurationPrerequisiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPrerequisites.AttackerPrerequisite <em>Attacker Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPrerequisites.AttackerPrerequisite
	 * @generated
	 */
	public Adapter createAttackerPrerequisiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link security.securityPrerequisites.TechnologyPrerequisite <em>Technology Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see security.securityPrerequisites.TechnologyPrerequisite
	 * @generated
	 */
	public Adapter createTechnologyPrerequisiteAdapter() {
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

} //SecurityPrerequisitesAdapterFactory
