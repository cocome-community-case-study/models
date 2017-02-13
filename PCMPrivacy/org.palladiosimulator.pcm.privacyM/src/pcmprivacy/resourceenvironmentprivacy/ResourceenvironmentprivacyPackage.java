/**
 */
package pcmprivacy.resourceenvironmentprivacy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

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
 * <!-- begin-model-doc -->
 * Package of entities representing the execution environment of a component based software system. Extended for privacy
 * <!-- end-model-doc -->
 * @see pcmprivacy.resourceenvironmentprivacy.ResourceenvironmentprivacyFactory
 * @model kind="package"
 * @generated
 */
public interface ResourceenvironmentprivacyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resourceenvironmentprivacy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/ResourceEnvironment/5.1/Privacy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resourceenvironmentprivacy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceenvironmentprivacyPackage eINSTANCE = pcmprivacy.resourceenvironmentprivacy.impl.ResourceenvironmentprivacyPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcmprivacy.resourceenvironmentprivacy.impl.ResourceContainerPrivacyImpl <em>Resource Container Privacy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmprivacy.resourceenvironmentprivacy.impl.ResourceContainerPrivacyImpl
	 * @see pcmprivacy.resourceenvironmentprivacy.impl.ResourceenvironmentprivacyPackageImpl#getResourceContainerPrivacy()
	 * @generated
	 */
	int RESOURCE_CONTAINER_PRIVACY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_PRIVACY__ID = ResourceenvironmentPackage.RESOURCE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_PRIVACY__ENTITY_NAME = ResourceenvironmentPackage.RESOURCE_CONTAINER__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Active Resource Specifications Resource Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_PRIVACY__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER = ResourceenvironmentPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Resource Environment Resource Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_PRIVACY__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER = ResourceenvironmentPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Nested Resource Containers Resource Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_PRIVACY__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER = ResourceenvironmentPackage.RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Parent Resource Container Resource Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_PRIVACY__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER = ResourceenvironmentPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Hdd Resource Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_PRIVACY__HDD_RESOURCE_SPECIFICATIONS = ResourceenvironmentPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS;

	/**
	 * The feature id for the '<em><b>Geolocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_PRIVACY__GEOLOCATION = ResourceenvironmentPackage.RESOURCE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Container Privacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_PRIVACY_FEATURE_COUNT = ResourceenvironmentPackage.RESOURCE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Container Privacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_PRIVACY_OPERATION_COUNT = 0; //ResourceenvironmentPackage.RESOURCE_CONTAINER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pcmprivacy.resourceenvironmentprivacy.ResourceContainerPrivacy <em>Resource Container Privacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Container Privacy</em>'.
	 * @see pcmprivacy.resourceenvironmentprivacy.ResourceContainerPrivacy
	 * @generated
	 */
	EClass getResourceContainerPrivacy();

	/**
	 * Returns the meta object for the attribute '{@link pcmprivacy.resourceenvironmentprivacy.ResourceContainerPrivacy#getGeolocation <em>Geolocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geolocation</em>'.
	 * @see pcmprivacy.resourceenvironmentprivacy.ResourceContainerPrivacy#getGeolocation()
	 * @see #getResourceContainerPrivacy()
	 * @generated
	 */
	EAttribute getResourceContainerPrivacy_Geolocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourceenvironmentprivacyFactory getResourceenvironmentprivacyFactory();

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
		 * The meta object literal for the '{@link pcmprivacy.resourceenvironmentprivacy.impl.ResourceContainerPrivacyImpl <em>Resource Container Privacy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmprivacy.resourceenvironmentprivacy.impl.ResourceContainerPrivacyImpl
		 * @see pcmprivacy.resourceenvironmentprivacy.impl.ResourceenvironmentprivacyPackageImpl#getResourceContainerPrivacy()
		 * @generated
		 */
		EClass RESOURCE_CONTAINER_PRIVACY = eINSTANCE.getResourceContainerPrivacy();

		/**
		 * The meta object literal for the '<em><b>Geolocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTAINER_PRIVACY__GEOLOCATION = eINSTANCE.getResourceContainerPrivacy_Geolocation();

	}

} //ResourceenvironmentprivacyPackage
