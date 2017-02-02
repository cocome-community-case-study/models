/**
 */
package pcmprivacy.compositionprivacy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcmprivacy.compositionprivacy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositionprivacyFactoryImpl extends EFactoryImpl implements CompositionprivacyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompositionprivacyFactory init() {
		try {
			CompositionprivacyFactory theCompositionprivacyFactory = (CompositionprivacyFactory)EPackage.Registry.INSTANCE.getEFactory(CompositionprivacyPackage.eNS_URI);
			if (theCompositionprivacyFactory != null) {
				return theCompositionprivacyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompositionprivacyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionprivacyFactoryImpl() {
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
			case CompositionprivacyPackage.ASSEMBLY_CONNECTOR_PRIVACY: return createAssemblyConnectorPrivacy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CompositionprivacyPackage.DATA_PRIVACY_LVL:
				return createDataPrivacyLvlFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CompositionprivacyPackage.DATA_PRIVACY_LVL:
				return convertDataPrivacyLvlToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnectorPrivacy createAssemblyConnectorPrivacy() {
		AssemblyConnectorPrivacyImpl assemblyConnectorPrivacy = new AssemblyConnectorPrivacyImpl();
		return assemblyConnectorPrivacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPrivacyLvl createDataPrivacyLvlFromString(EDataType eDataType, String initialValue) {
		DataPrivacyLvl result = DataPrivacyLvl.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataPrivacyLvlToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionprivacyPackage getCompositionprivacyPackage() {
		return (CompositionprivacyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompositionprivacyPackage getPackage() {
		return CompositionprivacyPackage.eINSTANCE;
	}

} //CompositionprivacyFactoryImpl
