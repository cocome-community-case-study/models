/**
 */
package pcmprivacy.compositionprivacy.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.Connector;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import pcmprivacy.compositionprivacy.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pcmprivacy.compositionprivacy.CompositionprivacyPackage
 * @generated
 */
public class CompositionprivacyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CompositionprivacyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionprivacyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CompositionprivacyPackage.eINSTANCE;
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
	protected CompositionprivacySwitch<Adapter> modelSwitch =
		new CompositionprivacySwitch<Adapter>() {
			@Override
			public Adapter caseAssemblyConnectorPrivacy(AssemblyConnectorPrivacy object) {
				return createAssemblyConnectorPrivacyAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseAssemblyConnector(AssemblyConnector object) {
				return createAssemblyConnectorAdapter();
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
	 * Creates a new adapter for an object of class '{@link pcmprivacy.compositionprivacy.AssemblyConnectorPrivacy <em>Assembly Connector Privacy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcmprivacy.compositionprivacy.AssemblyConnectorPrivacy
	 * @generated
	 */
	public Adapter createAssemblyConnectorPrivacyAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.entity.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.entity.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.composition.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.composition.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.composition.AssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.composition.AssemblyConnector
	 * @generated
	 */
	public Adapter createAssemblyConnectorAdapter() {
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

} //CompositionprivacyAdapterFactory
