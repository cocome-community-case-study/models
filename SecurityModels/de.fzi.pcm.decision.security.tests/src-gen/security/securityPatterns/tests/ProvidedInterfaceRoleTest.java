/**
 */
package security.securityPatterns.tests;

import junit.textui.TestRunner;

import security.securityPatterns.ProvidedInterfaceRole;
import security.securityPatterns.SecurityPatternsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Provided Interface Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProvidedInterfaceRoleTest extends RoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProvidedInterfaceRoleTest.class);
	}

	/**
	 * Constructs a new Provided Interface Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedInterfaceRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Provided Interface Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProvidedInterfaceRole getFixture() {
		return (ProvidedInterfaceRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityPatternsFactory.eINSTANCE.createProvidedInterfaceRole());
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

} //ProvidedInterfaceRoleTest
