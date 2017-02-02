/**
 */
package pcmprivacy.compositionprivacy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pcmprivacy.compositionprivacy.CompositionprivacyFactory
 * @model kind="package"
 * @generated
 */
public interface CompositionprivacyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compositionprivacy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/Core/Composition/5.1/Privacy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compositionprivacy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompositionprivacyPackage eINSTANCE = pcmprivacy.compositionprivacy.impl.CompositionprivacyPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcmprivacy.compositionprivacy.impl.AssemblyConnectorPrivacyImpl <em>Assembly Connector Privacy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmprivacy.compositionprivacy.impl.AssemblyConnectorPrivacyImpl
	 * @see pcmprivacy.compositionprivacy.impl.CompositionprivacyPackageImpl#getAssemblyConnectorPrivacy()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR_PRIVACY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_PRIVACY__ID = CompositionPackage.ASSEMBLY_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_PRIVACY__ENTITY_NAME = CompositionPackage.ASSEMBLY_CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Structure Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_PRIVACY__PARENT_STRUCTURE_CONNECTOR = CompositionPackage.ASSEMBLY_CONNECTOR__PARENT_STRUCTURE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Requiring Assembly Context Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_PRIVACY__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR = CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Providing Assembly Context Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_PRIVACY__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR = CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Provided Role Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_PRIVACY__PROVIDED_ROLE_ASSEMBLY_CONNECTOR = CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Required Role Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_PRIVACY__REQUIRED_ROLE_ASSEMBLY_CONNECTOR = CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Privacy Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL = CompositionPackage.ASSEMBLY_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assembly Connector Privacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_PRIVACY_FEATURE_COUNT = CompositionPackage.ASSEMBLY_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Assembly Connectors Referenced Provided Roles And Child Context Must Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_PRIVACY___ASSEMBLY_CONNECTORS_REFERENCED_PROVIDED_ROLES_AND_CHILD_CONTEXT_MUST_MATCH__DIAGNOSTICCHAIN_MAP = 0;//CompositionPackage.ASSEMBLY_CONNECTOR___ASSEMBLY_CONNECTORS_REFERENCED_PROVIDED_ROLES_AND_CHILD_CONTEXT_MUST_MATCH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Assembly Connectors Referenced Required Role And Child Context Must Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_PRIVACY___ASSEMBLY_CONNECTORS_REFERENCED_REQUIRED_ROLE_AND_CHILD_CONTEXT_MUST_MATCH__DIAGNOSTICCHAIN_MAP = 0;//CompositionPackage.ASSEMBLY_CONNECTOR___ASSEMBLY_CONNECTORS_REFERENCED_REQUIRED_ROLE_AND_CHILD_CONTEXT_MUST_MATCH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Assembly Connectors Referenced Interfaces Must Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_PRIVACY___ASSEMBLY_CONNECTORS_REFERENCED_INTERFACES_MUST_MATCH__DIAGNOSTICCHAIN_MAP = 0;//CompositionPackage.ASSEMBLY_CONNECTOR___ASSEMBLY_CONNECTORS_REFERENCED_INTERFACES_MUST_MATCH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Assembly Connector Privacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_PRIVACY_OPERATION_COUNT = 0;// CompositionPackage.ASSEMBLY_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmprivacy.compositionprivacy.DataPrivacyLvl <em>Data Privacy Lvl</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmprivacy.compositionprivacy.DataPrivacyLvl
	 * @see pcmprivacy.compositionprivacy.impl.CompositionprivacyPackageImpl#getDataPrivacyLvl()
	 * @generated
	 */
	int DATA_PRIVACY_LVL = 1;


	/**
	 * Returns the meta object for class '{@link pcmprivacy.compositionprivacy.AssemblyConnectorPrivacy <em>Assembly Connector Privacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Connector Privacy</em>'.
	 * @see pcmprivacy.compositionprivacy.AssemblyConnectorPrivacy
	 * @generated
	 */
	EClass getAssemblyConnectorPrivacy();

	/**
	 * Returns the meta object for the attribute '{@link pcmprivacy.compositionprivacy.AssemblyConnectorPrivacy#getPrivacyLevel <em>Privacy Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Privacy Level</em>'.
	 * @see pcmprivacy.compositionprivacy.AssemblyConnectorPrivacy#getPrivacyLevel()
	 * @see #getAssemblyConnectorPrivacy()
	 * @generated
	 */
	EAttribute getAssemblyConnectorPrivacy_PrivacyLevel();

	/**
	 * Returns the meta object for enum '{@link pcmprivacy.compositionprivacy.DataPrivacyLvl <em>Data Privacy Lvl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Privacy Lvl</em>'.
	 * @see pcmprivacy.compositionprivacy.DataPrivacyLvl
	 * @generated
	 */
	EEnum getDataPrivacyLvl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompositionprivacyFactory getCompositionprivacyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pcmprivacy.compositionprivacy.impl.AssemblyConnectorPrivacyImpl <em>Assembly Connector Privacy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmprivacy.compositionprivacy.impl.AssemblyConnectorPrivacyImpl
		 * @see pcmprivacy.compositionprivacy.impl.CompositionprivacyPackageImpl#getAssemblyConnectorPrivacy()
		 * @generated
		 */
		EClass ASSEMBLY_CONNECTOR_PRIVACY = eINSTANCE.getAssemblyConnectorPrivacy();

		/**
		 * The meta object literal for the '<em><b>Privacy Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL = eINSTANCE.getAssemblyConnectorPrivacy_PrivacyLevel();

		/**
		 * The meta object literal for the '{@link pcmprivacy.compositionprivacy.DataPrivacyLvl <em>Data Privacy Lvl</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmprivacy.compositionprivacy.DataPrivacyLvl
		 * @see pcmprivacy.compositionprivacy.impl.CompositionprivacyPackageImpl#getDataPrivacyLvl()
		 * @generated
		 */
		EEnum DATA_PRIVACY_LVL = eINSTANCE.getDataPrivacyLvl();

	}

} //CompositionprivacyPackage
