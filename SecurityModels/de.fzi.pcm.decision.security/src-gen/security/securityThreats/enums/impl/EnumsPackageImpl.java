/**
 */
package security.securityThreats.enums.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import security.SecurityPackage;

import security.impl.SecurityPackageImpl;

import security.securityPatterns.SecurityPatternsPackage;

import security.securityPatterns.impl.SecurityPatternsPackageImpl;

import security.securityPrerequisites.SecurityPrerequisitesPackage;

import security.securityPrerequisites.impl.SecurityPrerequisitesPackageImpl;

import security.securityThreats.SecurityThreatsPackage;

import security.securityThreats.enums.Activity;
import security.securityThreats.enums.EnumsFactory;
import security.securityThreats.enums.EnumsPackage;
import security.securityThreats.enums.Focus;
import security.securityThreats.enums.Intention;
import security.securityThreats.enums.Motivation;
import security.securityThreats.enums.Position;
import security.securityThreats.enums.SecurityViolation;
import security.securityThreats.enums.Stealth;
import security.securityThreats.enums.TimeConstraints;

import security.securityThreats.impl.SecurityThreatsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumsPackageImpl extends EPackageImpl implements EnumsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intentionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum focusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum motivationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeConstraintsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stealthEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityViolationEEnum = null;

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
	 * @see security.securityThreats.enums.EnumsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumsPackageImpl() {
		super(eNS_URI, EnumsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnumsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumsPackage init() {
		if (isInited) return (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Obtain or create and register package
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EnumsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI) : SecurityPackage.eINSTANCE);
		SecurityPatternsPackageImpl theSecurityPatternsPackage = (SecurityPatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPatternsPackage.eNS_URI) instanceof SecurityPatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPatternsPackage.eNS_URI) : SecurityPatternsPackage.eINSTANCE);
		SecurityPrerequisitesPackageImpl theSecurityPrerequisitesPackage = (SecurityPrerequisitesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityPrerequisitesPackage.eNS_URI) instanceof SecurityPrerequisitesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityPrerequisitesPackage.eNS_URI) : SecurityPrerequisitesPackage.eINSTANCE);
		SecurityThreatsPackageImpl theSecurityThreatsPackage = (SecurityThreatsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecurityThreatsPackage.eNS_URI) instanceof SecurityThreatsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecurityThreatsPackage.eNS_URI) : SecurityThreatsPackage.eINSTANCE);

		// Create package meta-data objects
		theEnumsPackage.createPackageContents();
		theSecurityPackage.createPackageContents();
		theSecurityPatternsPackage.createPackageContents();
		theSecurityPrerequisitesPackage.createPackageContents();
		theSecurityThreatsPackage.createPackageContents();

		// Initialize created meta-data
		theEnumsPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();
		theSecurityPatternsPackage.initializePackageContents();
		theSecurityPrerequisitesPackage.initializePackageContents();
		theSecurityThreatsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumsPackage.eNS_URI, theEnumsPackage);
		return theEnumsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActivity() {
		return activityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPosition() {
		return positionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntention() {
		return intentionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFocus() {
		return focusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMotivation() {
		return motivationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeConstraints() {
		return timeConstraintsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStealth() {
		return stealthEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecurityViolation() {
		return securityViolationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumsFactory getEnumsFactory() {
		return (EnumsFactory)getEFactoryInstance();
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

		// Create enums
		activityEEnum = createEEnum(ACTIVITY);
		positionEEnum = createEEnum(POSITION);
		intentionEEnum = createEEnum(INTENTION);
		focusEEnum = createEEnum(FOCUS);
		motivationEEnum = createEEnum(MOTIVATION);
		timeConstraintsEEnum = createEEnum(TIME_CONSTRAINTS);
		stealthEEnum = createEEnum(STEALTH);
		securityViolationEEnum = createEEnum(SECURITY_VIOLATION);
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

		// Initialize enums and add enum literals
		initEEnum(activityEEnum, Activity.class, "Activity");
		addEEnumLiteral(activityEEnum, Activity.ACTIVE);
		addEEnumLiteral(activityEEnum, Activity.PASSIVE);

		initEEnum(positionEEnum, Position.class, "Position");
		addEEnumLiteral(positionEEnum, Position.INTERNAL);
		addEEnumLiteral(positionEEnum, Position.EXTERNAL);

		initEEnum(intentionEEnum, Intention.class, "Intention");
		addEEnumLiteral(intentionEEnum, Intention.MALICIOUS);
		addEEnumLiteral(intentionEEnum, Intention.NONMALICIOUS);

		initEEnum(focusEEnum, Focus.class, "Focus");
		addEEnumLiteral(focusEEnum, Focus.UNDEFINED);
		addEEnumLiteral(focusEEnum, Focus.DIRECTED);
		addEEnumLiteral(focusEEnum, Focus.RANDOM);

		initEEnum(motivationEEnum, Motivation.class, "Motivation");
		addEEnumLiteral(motivationEEnum, Motivation.UNDEFINED);
		addEEnumLiteral(motivationEEnum, Motivation.PERSONAL);
		addEEnumLiteral(motivationEEnum, Motivation.FINANCIAL);
		addEEnumLiteral(motivationEEnum, Motivation.POLITICAL);

		initEEnum(timeConstraintsEEnum, TimeConstraints.class, "TimeConstraints");
		addEEnumLiteral(timeConstraintsEEnum, TimeConstraints.UNDEFINED);
		addEEnumLiteral(timeConstraintsEEnum, TimeConstraints.NONE);
		addEEnumLiteral(timeConstraintsEEnum, TimeConstraints.SOFT);
		addEEnumLiteral(timeConstraintsEEnum, TimeConstraints.HARD);

		initEEnum(stealthEEnum, Stealth.class, "Stealth");
		addEEnumLiteral(stealthEEnum, Stealth.NONSTEALTHY);
		addEEnumLiteral(stealthEEnum, Stealth.STEALTHY);

		initEEnum(securityViolationEEnum, SecurityViolation.class, "SecurityViolation");
		addEEnumLiteral(securityViolationEEnum, SecurityViolation.UNDEFINED);
		addEEnumLiteral(securityViolationEEnum, SecurityViolation.CONFIDENTIALITY);
		addEEnumLiteral(securityViolationEEnum, SecurityViolation.INTEGRITY);
		addEEnumLiteral(securityViolationEEnum, SecurityViolation.AVAILABILITY);
		addEEnumLiteral(securityViolationEEnum, SecurityViolation.AUTHENTICATION);
		addEEnumLiteral(securityViolationEEnum, SecurityViolation.NONREPUDIATION);
	}

} //EnumsPackageImpl
