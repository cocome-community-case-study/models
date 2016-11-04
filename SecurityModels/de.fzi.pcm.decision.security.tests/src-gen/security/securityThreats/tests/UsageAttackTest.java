/**
 */
package security.securityThreats.tests;

import junit.textui.TestRunner;

import security.securityThreats.SecurityThreatsFactory;
import security.securityThreats.UsageAttack;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Usage Attack</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsageAttackTest extends AttackTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsageAttackTest.class);
	}

	/**
	 * Constructs a new Usage Attack test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageAttackTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Usage Attack test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UsageAttack getFixture() {
		return (UsageAttack)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityThreatsFactory.eINSTANCE.createUsageAttack());
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

} //UsageAttackTest
