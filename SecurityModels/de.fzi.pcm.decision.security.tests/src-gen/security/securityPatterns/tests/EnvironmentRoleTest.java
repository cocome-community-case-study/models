/**
 */
package security.securityPatterns.tests;

import junit.textui.TestRunner;

import security.securityPatterns.EnvironmentRole;
import security.securityPatterns.SecurityPatternsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Environment Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnvironmentRoleTest extends RoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnvironmentRoleTest.class);
	}

	/**
	 * Constructs a new Environment Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Environment Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnvironmentRole getFixture() {
		return (EnvironmentRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityPatternsFactory.eINSTANCE.createEnvironmentRole());
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

} //EnvironmentRoleTest
