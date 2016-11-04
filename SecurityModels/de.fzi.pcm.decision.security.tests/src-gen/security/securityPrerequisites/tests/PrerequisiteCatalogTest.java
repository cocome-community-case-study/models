/**
 */
package security.securityPrerequisites.tests;

import junit.textui.TestRunner;

import security.securityPrerequisites.PrerequisiteCatalog;
import security.securityPrerequisites.SecurityPrerequisitesFactory;

import security.tests.CatalogTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prerequisite Catalog</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrerequisiteCatalogTest extends CatalogTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrerequisiteCatalogTest.class);
	}

	/**
	 * Constructs a new Prerequisite Catalog test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrerequisiteCatalogTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Prerequisite Catalog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrerequisiteCatalog getFixture() {
		return (PrerequisiteCatalog)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityPrerequisitesFactory.eINSTANCE.createPrerequisiteCatalog());
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

} //PrerequisiteCatalogTest
