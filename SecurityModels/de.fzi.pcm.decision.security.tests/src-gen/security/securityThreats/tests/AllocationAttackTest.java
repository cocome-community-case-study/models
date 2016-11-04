/**
 */
package security.securityThreats.tests;

import junit.textui.TestRunner;

import security.securityThreats.AllocationAttack;
import security.securityThreats.SecurityThreatsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Allocation Attack</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocationAttackTest extends AttackTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllocationAttackTest.class);
	}

	/**
	 * Constructs a new Allocation Attack test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationAttackTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Allocation Attack test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AllocationAttack getFixture() {
		return (AllocationAttack)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityThreatsFactory.eINSTANCE.createAllocationAttack());
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

} //AllocationAttackTest
