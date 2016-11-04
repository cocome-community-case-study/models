/**
 */
package security.securityPrerequisites.tests;

import junit.textui.TestRunner;

import security.securityPrerequisites.SecurityPrerequisitesFactory;
import security.securityPrerequisites.TechnologyPrerequisite;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Technology Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnologyPrerequisiteTest extends PrerequisiteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TechnologyPrerequisiteTest.class);
	}

	/**
	 * Constructs a new Technology Prerequisite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologyPrerequisiteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Technology Prerequisite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TechnologyPrerequisite getFixture() {
		return (TechnologyPrerequisite)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityPrerequisitesFactory.eINSTANCE.createTechnologyPrerequisite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TechnologyPrerequisiteTest
