/**
 */
package pcmprivacy.compositionprivacy;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Connector Privacy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmprivacy.compositionprivacy.AssemblyConnectorPrivacy#getPrivacyLevel <em>Privacy Level</em>}</li>
 * </ul>
 *
 * @see pcmprivacy.compositionprivacy.CompositionprivacyPackage#getAssemblyConnectorPrivacy()
 * @model
 * @generated
 */
public interface AssemblyConnectorPrivacy extends EObject, AssemblyConnector {
	/**
	 * Returns the value of the '<em><b>Privacy Level</b></em>' attribute.
	 * The default value is <code>"Personal"</code>.
	 * The literals are from the enumeration {@link pcmprivacy.compositionprivacy.DataPrivacyLvl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Privacy Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privacy Level</em>' attribute.
	 * @see pcmprivacy.compositionprivacy.DataPrivacyLvl
	 * @see #setPrivacyLevel(DataPrivacyLvl)
	 * @see pcmprivacy.compositionprivacy.CompositionprivacyPackage#getAssemblyConnectorPrivacy_PrivacyLevel()
	 * @model default="Personal" unique="false" ordered="false"
	 * @generated
	 */
	DataPrivacyLvl getPrivacyLevel();

	/**
	 * Sets the value of the '{@link pcmprivacy.compositionprivacy.AssemblyConnectorPrivacy#getPrivacyLevel <em>Privacy Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privacy Level</em>' attribute.
	 * @see pcmprivacy.compositionprivacy.DataPrivacyLvl
	 * @see #getPrivacyLevel()
	 * @generated
	 */
	void setPrivacyLevel(DataPrivacyLvl value);

} // AssemblyConnectorPrivacy
