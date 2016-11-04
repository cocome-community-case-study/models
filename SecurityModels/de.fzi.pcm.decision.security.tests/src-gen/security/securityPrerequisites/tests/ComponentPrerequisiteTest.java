/**
 */
package security.securityPrerequisites.tests;

import junit.textui.TestRunner;

import security.securityPrerequisites.ComponentPrerequisite;
import security.securityPrerequisites.SecurityPrerequisitesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentPrerequisiteTest extends PrerequisiteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentPrerequisiteTest.class);
	}

	/**
	 * Constructs a new Component Prerequisite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPrerequisiteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Component Prerequisite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComponentPrerequisite getFixture() {
		return (ComponentPrerequisite)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityPrerequisitesFactory.eINSTANCE.createComponentPrerequisite());
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

} //ComponentPrerequisiteTest
