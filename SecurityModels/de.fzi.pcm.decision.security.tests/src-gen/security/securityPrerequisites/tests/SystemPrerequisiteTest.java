/**
 */
package security.securityPrerequisites.tests;

import junit.textui.TestRunner;

import security.securityPrerequisites.SecurityPrerequisitesFactory;
import security.securityPrerequisites.SystemPrerequisite;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemPrerequisiteTest extends PrerequisiteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemPrerequisiteTest.class);
	}

	/**
	 * Constructs a new System Prerequisite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemPrerequisiteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System Prerequisite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemPrerequisite getFixture() {
		return (SystemPrerequisite)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityPrerequisitesFactory.eINSTANCE.createSystemPrerequisite());
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

} //SystemPrerequisiteTest
