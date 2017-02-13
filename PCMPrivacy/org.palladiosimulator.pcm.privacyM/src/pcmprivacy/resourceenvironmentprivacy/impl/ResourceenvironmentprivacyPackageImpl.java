/**
 */
package pcmprivacy.resourceenvironmentprivacy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import pcmprivacy.compositionprivacy.CompositionprivacyPackage;

import pcmprivacy.compositionprivacy.impl.CompositionprivacyPackageImpl;

import pcmprivacy.resourceenvironmentprivacy.ResourceContainerPrivacy;
import pcmprivacy.resourceenvironmentprivacy.ResourceenvironmentprivacyFactory;
import pcmprivacy.resourceenvironmentprivacy.ResourceenvironmentprivacyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceenvironmentprivacyPackageImpl extends EPackageImpl implements ResourceenvironmentprivacyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceContainerPrivacyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pcmprivacy.resourceenvironmentprivacy.ResourceenvironmentprivacyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourceenvironmentprivacyPackageImpl() {
		super(eNS_URI, ResourceenvironmentprivacyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ResourceenvironmentprivacyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourceenvironmentprivacyPackage init() {
		if (isInited) return (ResourceenvironmentprivacyPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentprivacyPackage.eNS_URI);

		// Obtain or create and register package
		ResourceenvironmentprivacyPackageImpl theResourceenvironmentprivacyPackage = (ResourceenvironmentprivacyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResourceenvironmentprivacyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResourceenvironmentprivacyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CompositionprivacyPackageImpl theCompositionprivacyPackage = (CompositionprivacyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompositionprivacyPackage.eNS_URI) instanceof CompositionprivacyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompositionprivacyPackage.eNS_URI) : CompositionprivacyPackage.eINSTANCE);

		// Create package meta-data objects
		theResourceenvironmentprivacyPackage.createPackageContents();
		theCompositionprivacyPackage.createPackageContents();

		// Initialize created meta-data
		theResourceenvironmentprivacyPackage.initializePackageContents();
		theCompositionprivacyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourceenvironmentprivacyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourceenvironmentprivacyPackage.eNS_URI, theResourceenvironmentprivacyPackage);
		return theResourceenvironmentprivacyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceContainerPrivacy() {
		return resourceContainerPrivacyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceContainerPrivacy_Geolocation() {
		return (EAttribute)resourceContainerPrivacyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceenvironmentprivacyFactory getResourceenvironmentprivacyFactory() {
		return (ResourceenvironmentprivacyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourceContainerPrivacyEClass = createEClass(RESOURCE_CONTAINER_PRIVACY);
		createEAttribute(resourceContainerPrivacyEClass, RESOURCE_CONTAINER_PRIVACY__GEOLOCATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resourceContainerPrivacyEClass.getESuperTypes().add(theResourceenvironmentPackage.getResourceContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(resourceContainerPrivacyEClass, ResourceContainerPrivacy.class, "ResourceContainerPrivacy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceContainerPrivacy_Geolocation(), ecorePackage.getEInt(), "Geolocation", "0", 1, 1, ResourceContainerPrivacy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ResourceenvironmentprivacyPackageImpl
