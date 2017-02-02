/**
 */
package pcmprivacy.compositionprivacy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import pcmprivacy.compositionprivacy.AssemblyConnectorPrivacy;
import pcmprivacy.compositionprivacy.CompositionprivacyFactory;
import pcmprivacy.compositionprivacy.CompositionprivacyPackage;
import pcmprivacy.compositionprivacy.DataPrivacyLvl;

import pcmprivacy.resourceenvironmentprivacy.ResourceenvironmentprivacyPackage;

import pcmprivacy.resourceenvironmentprivacy.impl.ResourceenvironmentprivacyPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositionprivacyPackageImpl extends EPackageImpl implements CompositionprivacyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyConnectorPrivacyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataPrivacyLvlEEnum = null;

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
	 * @see pcmprivacy.compositionprivacy.CompositionprivacyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompositionprivacyPackageImpl() {
		super(eNS_URI, CompositionprivacyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CompositionprivacyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CompositionprivacyPackage init() {
		if (isInited) return (CompositionprivacyPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionprivacyPackage.eNS_URI);

		// Obtain or create and register package
		CompositionprivacyPackageImpl theCompositionprivacyPackage = (CompositionprivacyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CompositionprivacyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CompositionprivacyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ResourceenvironmentprivacyPackageImpl theResourceenvironmentprivacyPackage = (ResourceenvironmentprivacyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentprivacyPackage.eNS_URI) instanceof ResourceenvironmentprivacyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentprivacyPackage.eNS_URI) : ResourceenvironmentprivacyPackage.eINSTANCE);

		// Create package meta-data objects
		theCompositionprivacyPackage.createPackageContents();
		theResourceenvironmentprivacyPackage.createPackageContents();

		// Initialize created meta-data
		theCompositionprivacyPackage.initializePackageContents();
		theResourceenvironmentprivacyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCompositionprivacyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CompositionprivacyPackage.eNS_URI, theCompositionprivacyPackage);
		return theCompositionprivacyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyConnectorPrivacy() {
		return assemblyConnectorPrivacyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssemblyConnectorPrivacy_PrivacyLevel() {
		return (EAttribute)assemblyConnectorPrivacyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataPrivacyLvl() {
		return dataPrivacyLvlEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionprivacyFactory getCompositionprivacyFactory() {
		return (CompositionprivacyFactory)getEFactoryInstance();
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
		assemblyConnectorPrivacyEClass = createEClass(ASSEMBLY_CONNECTOR_PRIVACY);
		createEAttribute(assemblyConnectorPrivacyEClass, ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL);

		// Create enums
		dataPrivacyLvlEEnum = createEEnum(DATA_PRIVACY_LVL);
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
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assemblyConnectorPrivacyEClass.getESuperTypes().add(theCompositionPackage.getAssemblyConnector());

		// Initialize classes, features, and operations; add parameters
		initEClass(assemblyConnectorPrivacyEClass, AssemblyConnectorPrivacy.class, "AssemblyConnectorPrivacy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssemblyConnectorPrivacy_PrivacyLevel(), this.getDataPrivacyLvl(), "PrivacyLevel", "Personal", 0, 1, AssemblyConnectorPrivacy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataPrivacyLvlEEnum, DataPrivacyLvl.class, "DataPrivacyLvl");
		addEEnumLiteral(dataPrivacyLvlEEnum, DataPrivacyLvl.PERSONAL);
		addEEnumLiteral(dataPrivacyLvlEEnum, DataPrivacyLvl.DEPERSONALIZED);
		addEEnumLiteral(dataPrivacyLvlEEnum, DataPrivacyLvl.ANONYMIZED);

		// Create resource
		createResource(eNS_URI);
	}

} //CompositionprivacyPackageImpl
