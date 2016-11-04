/**
 */
package security.securityThreats.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import security.securityThreats.Attack;
import security.securityThreats.SecurityThreatsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attack</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttackTest extends TestCase {

	/**
	 * The fixture for this Attack test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attack fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttackTest.class);
	}

	/**
	 * Constructs a new Attack test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Attack test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Attack fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Attack test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attack getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityThreatsFactory.eINSTANCE.createAttack());
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

} //AttackTest
