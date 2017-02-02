/**
 */
package pcmprivacy.resourceenvironmentprivacy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcmprivacy.resourceenvironmentprivacy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceenvironmentprivacyFactoryImpl extends EFactoryImpl implements ResourceenvironmentprivacyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceenvironmentprivacyFactory init() {
		try {
			ResourceenvironmentprivacyFactory theResourceenvironmentprivacyFactory = (ResourceenvironmentprivacyFactory)EPackage.Registry.INSTANCE.getEFactory(ResourceenvironmentprivacyPackage.eNS_URI);
			if (theResourceenvironmentprivacyFactory != null) {
				return theResourceenvironmentprivacyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourceenvironmentprivacyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceenvironmentprivacyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ResourceenvironmentprivacyPackage.RESOURCE_ENVIRONMENT_PRIVACY: return createResourceEnvironmentPrivacy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvironmentPrivacy createResourceEnvironmentPrivacy() {
		ResourceEnvironmentPrivacyImpl resourceEnvironmentPrivacy = new ResourceEnvironmentPrivacyImpl();
		return resourceEnvironmentPrivacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceenvironmentprivacyPackage getResourceenvironmentprivacyPackage() {
		return (ResourceenvironmentprivacyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourceenvironmentprivacyPackage getPackage() {
		return ResourceenvironmentprivacyPackage.eINSTANCE;
	}

} //ResourceenvironmentprivacyFactoryImpl
