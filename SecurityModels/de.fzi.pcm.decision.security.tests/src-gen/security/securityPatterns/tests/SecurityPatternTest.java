/**
 */
package security.securityPatterns.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import security.securityPatterns.SecurityPattern;
import security.securityPatterns.SecurityPatternsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Security Pattern</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPatternTest extends TestCase {

	/**
	 * The fixture for this Security Pattern test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityPattern fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecurityPatternTest.class);
	}

	/**
	 * Constructs a new Security Pattern test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPatternTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Security Pattern test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SecurityPattern fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Security Pattern test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityPattern getFixture() {
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
		setFixture(SecurityPatternsFactory.eINSTANCE.createSecurityPattern());
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

} //SecurityPatternTest
