/**
 */
package security.securityThreats.tests;

import junit.textui.TestRunner;

import security.securityThreats.SecurityThreatsFactory;
import security.securityThreats.SystemAttack;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Attack</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemAttackTest extends AttackTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemAttackTest.class);
	}

	/**
	 * Constructs a new System Attack test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAttackTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System Attack test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemAttack getFixture() {
		return (SystemAttack)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityThreatsFactory.eINSTANCE.createSystemAttack());
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

} //SystemAttackTest
