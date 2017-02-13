/**
 */
package pcmprivacy.resourceenvironmentprivacy;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Container Privacy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML-like&nbsp;container&nbsp;of&nbsp;a&nbsp;number&nbsp;of&nbsp;processing&nbsp;resources (e.g. hardware server). Extended for Privacy with geolocation flag.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmprivacy.resourceenvironmentprivacy.ResourceContainerPrivacy#getGeolocation <em>Geolocation</em>}</li>
 * </ul>
 *
 * @see pcmprivacy.resourceenvironmentprivacy.ResourceenvironmentprivacyPackage#getResourceContainerPrivacy()
 * @model
 * @generated
 */
public interface ResourceContainerPrivacy extends EObject, ResourceContainer {
	/**
	 * Returns the value of the '<em><b>Geolocation</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 *     Specifies the the geolocation.
	 * </p>
	 * <p>
	 *     Item is the ISO country code. A number between 0 and 999.<br />
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geolocation</em>' attribute.
	 * @see #setGeolocation(int)
	 * @see pcmprivacy.resourceenvironmentprivacy.ResourceenvironmentprivacyPackage#getResourceContainerPrivacy_Geolocation()
	 * @model default="0" required="true" ordered="false"
	 * @generated
	 */
	int getGeolocation();

	/**
	 * Sets the value of the '{@link pcmprivacy.resourceenvironmentprivacy.ResourceContainerPrivacy#getGeolocation <em>Geolocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geolocation</em>' attribute.
	 * @see #getGeolocation()
	 * @generated
	 */
	void setGeolocation(int value);

} // ResourceContainerPrivacy
