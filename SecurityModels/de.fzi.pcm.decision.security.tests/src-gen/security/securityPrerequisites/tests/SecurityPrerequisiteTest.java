/**
 */
package security.securityPrerequisites.tests;

import junit.textui.TestRunner;

import security.securityPrerequisites.SecurityPrerequisite;
import security.securityPrerequisites.SecurityPrerequisitesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Security Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPrerequisiteTest extends PrerequisiteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecurityPrerequisiteTest.class);
	}

	/**
	 * Constructs a new Security Prerequisite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPrerequisiteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Security Prerequisite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SecurityPrerequisite getFixture() {
		return (SecurityPrerequisite)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityPrerequisitesFactory.eINSTANCE.createSecurityPrerequisite());
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

} //SecurityPrerequisiteTest
