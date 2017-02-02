/**
 */
package pcmprivacy.resourceenvironmentprivacy.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import pcmprivacy.compositionprivacy.tests.CompositionprivacyTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Privacy</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrivacyAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new PrivacyAllTests("Privacy Tests");
		suite.addTest(CompositionprivacyTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyAllTests(String name) {
		super(name);
	}

} //PrivacyAllTests
