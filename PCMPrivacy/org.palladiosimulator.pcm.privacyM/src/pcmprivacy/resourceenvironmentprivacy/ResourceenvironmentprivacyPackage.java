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
	 * The meta object id for the '{@link pcmprivacy.resourceenvironmentprivacy.impl.ResourceEnvironmentPrivacyImpl <em>Resource Environment Privacy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmprivacy.resourceenvironmentprivacy.impl.ResourceEnvironmentPrivacyImpl
	 * @see pcmprivacy.resourceenvironmentprivacy.impl.ResourceenvironmentprivacyPackageImpl#getResourceEnvironmentPrivacy()
	 * @generated
	 */
	int RESOURCE_ENVIRONMENT_PRIVACY = 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT_PRIVACY__ENTITY_NAME = ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Linking Resources Resource Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT_PRIVACY__LINKING_RESOURCES_RESOURCE_ENVIRONMENT = ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Resource Container Resource Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT_PRIVACY__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT = ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Geolocation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT_PRIVACY__GEOLOCATION = ResourceenvironmentPackage.RESOURCE_ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Environment Privacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT_PRIVACY_FEATURE_COUNT = ResourceenvironmentPackage.RESOURCE_ENVIRONMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Environment Privacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//TODO
	int RESOURCE_ENVIRONMENT_PRIVACY_OPERATION_COUNT = 0; //ResourceenvironmentPackage.RESOURCE_ENVIRONMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pcmprivacy.resourceenvironmentprivacy.ResourceEnvironmentPrivacy <em>Resource Environment Privacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Environment Privacy</em>'.
	 * @see pcmprivacy.resourceenvironmentprivacy.ResourceEnvironmentPrivacy
	 * @generated
	 */
	EClass getResourceEnvironmentPrivacy();

	/**
	 * Returns the meta object for the attribute list '{@link pcmprivacy.resourceenvironmentprivacy.ResourceEnvironmentPrivacy#getGeolocation <em>Geolocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Geolocation</em>'.
	 * @see pcmprivacy.resourceenvironmentprivacy.ResourceEnvironmentPrivacy#getGeolocation()
	 * @see #getResourceEnvironmentPrivacy()
	 * @generated
	 */
	EAttribute getResourceEnvironmentPrivacy_Geolocation();

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
		 * The meta object literal for the '{@link pcmprivacy.resourceenvironmentprivacy.impl.ResourceEnvironmentPrivacyImpl <em>Resource Environment Privacy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmprivacy.resourceenvironmentprivacy.impl.ResourceEnvironmentPrivacyImpl
		 * @see pcmprivacy.resourceenvironmentprivacy.impl.ResourceenvironmentprivacyPackageImpl#getResourceEnvironmentPrivacy()
		 * @generated
		 */
		EClass RESOURCE_ENVIRONMENT_PRIVACY = eINSTANCE.getResourceEnvironmentPrivacy();

		/**
		 * The meta object literal for the '<em><b>Geolocation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ENVIRONMENT_PRIVACY__GEOLOCATION = eINSTANCE.getResourceEnvironmentPrivacy_Geolocation();

	}

} //ResourceenvironmentprivacyPackage
