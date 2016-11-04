/**
 */
package security.securityPrerequisites.tests;

import junit.textui.TestRunner;

import security.securityPrerequisites.SecurityPrerequisitesFactory;
import security.securityPrerequisites.UsagePrerequisite;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Usage Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsagePrerequisiteTest extends PrerequisiteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsagePrerequisiteTest.class);
	}

	/**
	 * Constructs a new Usage Prerequisite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsagePrerequisiteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Usage Prerequisite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UsagePrerequisite getFixture() {
		return (UsagePrerequisite)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityPrerequisitesFactory.eINSTANCE.createUsagePrerequisite());
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

} //UsagePrerequisiteTest
