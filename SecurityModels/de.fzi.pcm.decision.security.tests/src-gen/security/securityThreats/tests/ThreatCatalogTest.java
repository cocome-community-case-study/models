/**
 */
package security.securityThreats.tests;

import junit.textui.TestRunner;

import security.securityThreats.SecurityThreatsFactory;
import security.securityThreats.ThreatCatalog;

import security.tests.CatalogTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Threat Catalog</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreatCatalogTest extends CatalogTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ThreatCatalogTest.class);
	}

	/**
	 * Constructs a new Threat Catalog test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatCatalogTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Threat Catalog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ThreatCatalog getFixture() {
		return (ThreatCatalog)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityThreatsFactory.eINSTANCE.createThreatCatalog());
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

} //ThreatCatalogTest
