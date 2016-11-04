/**
 */
package security.securityPrerequisites.tests;

import junit.textui.TestRunner;

import security.securityPrerequisites.ConfigurationPrerequisite;
import security.securityPrerequisites.SecurityPrerequisitesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Configuration Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationPrerequisiteTest extends PrerequisiteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfigurationPrerequisiteTest.class);
	}

	/**
	 * Constructs a new Configuration Prerequisite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPrerequisiteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Configuration Prerequisite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConfigurationPrerequisite getFixture() {
		return (ConfigurationPrerequisite)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityPrerequisitesFactory.eINSTANCE.createConfigurationPrerequisite());
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

} //ConfigurationPrerequisiteTest
