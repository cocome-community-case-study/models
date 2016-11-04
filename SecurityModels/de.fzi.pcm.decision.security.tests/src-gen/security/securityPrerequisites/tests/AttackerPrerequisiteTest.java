/**
 */
package security.securityPrerequisites.tests;

import junit.textui.TestRunner;

import security.securityPrerequisites.AttackerPrerequisite;
import security.securityPrerequisites.SecurityPrerequisitesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attacker Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttackerPrerequisiteTest extends PrerequisiteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttackerPrerequisiteTest.class);
	}

	/**
	 * Constructs a new Attacker Prerequisite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerPrerequisiteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attacker Prerequisite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttackerPrerequisite getFixture() {
		return (AttackerPrerequisite)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityPrerequisitesFactory.eINSTANCE.createAttackerPrerequisite());
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

} //AttackerPrerequisiteTest
