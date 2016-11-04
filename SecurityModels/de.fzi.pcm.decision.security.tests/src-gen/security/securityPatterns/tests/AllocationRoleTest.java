/**
 */
package security.securityPatterns.tests;

import junit.textui.TestRunner;

import security.securityPatterns.AllocationRole;
import security.securityPatterns.SecurityPatternsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Allocation Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocationRoleTest extends RoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllocationRoleTest.class);
	}

	/**
	 * Constructs a new Allocation Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Allocation Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AllocationRole getFixture() {
		return (AllocationRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityPatternsFactory.eINSTANCE.createAllocationRole());
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

} //AllocationRoleTest
