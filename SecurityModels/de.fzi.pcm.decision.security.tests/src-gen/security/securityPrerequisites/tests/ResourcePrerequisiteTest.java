/**
 */
package security.securityPrerequisites.tests;

import junit.textui.TestRunner;

import security.securityPrerequisites.ResourcePrerequisite;
import security.securityPrerequisites.SecurityPrerequisitesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcePrerequisiteTest extends PrerequisiteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourcePrerequisiteTest.class);
	}

	/**
	 * Constructs a new Resource Prerequisite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePrerequisiteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Prerequisite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourcePrerequisite getFixture() {
		return (ResourcePrerequisite)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityPrerequisitesFactory.eINSTANCE.createResourcePrerequisite());
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

} //ResourcePrerequisiteTest
