/**
 */
package security.securityThreats.tests;

import junit.textui.TestRunner;

import security.securityThreats.ResourceAttack;
import security.securityThreats.SecurityThreatsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Attack</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceAttackTest extends AttackTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceAttackTest.class);
	}

	/**
	 * Constructs a new Resource Attack test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAttackTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Attack test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceAttack getFixture() {
		return (ResourceAttack)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityThreatsFactory.eINSTANCE.createResourceAttack());
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

} //ResourceAttackTest
