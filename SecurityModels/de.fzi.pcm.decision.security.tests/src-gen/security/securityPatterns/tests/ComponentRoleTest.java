/**
 */
package security.securityPatterns.tests;

import junit.textui.TestRunner;

import security.securityPatterns.ComponentRole;
import security.securityPatterns.SecurityPatternsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentRoleTest extends RoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentRoleTest.class);
	}

	/**
	 * Constructs a new Component Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Component Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComponentRole getFixture() {
		return (ComponentRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityPatternsFactory.eINSTANCE.createComponentRole());
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

} //ComponentRoleTest
