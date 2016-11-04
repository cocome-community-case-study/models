/**
 */
package security.securityPatterns.tests;

import junit.textui.TestRunner;

import security.securityPatterns.PatternCatalog;
import security.securityPatterns.SecurityPatternsFactory;

import security.tests.CatalogTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pattern Catalog</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternCatalogTest extends CatalogTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PatternCatalogTest.class);
	}

	/**
	 * Constructs a new Pattern Catalog test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternCatalogTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pattern Catalog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PatternCatalog getFixture() {
		return (PatternCatalog)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityPatternsFactory.eINSTANCE.createPatternCatalog());
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

} //PatternCatalogTest
