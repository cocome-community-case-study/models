/**
 */
package pcmprivacy.resourceenvironmentprivacy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pcmprivacy.resourceenvironmentprivacy.ResourceenvironmentprivacyPackage
 * @generated
 */
public interface ResourceenvironmentprivacyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceenvironmentprivacyFactory eINSTANCE = pcmprivacy.resourceenvironmentprivacy.impl.ResourceenvironmentprivacyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Container Privacy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Container Privacy</em>'.
	 * @generated
	 */
	ResourceContainerPrivacy createResourceContainerPrivacy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourceenvironmentprivacyPackage getResourceenvironmentprivacyPackage();

} //ResourceenvironmentprivacyFactory
