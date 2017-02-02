/**
 */
package pcmprivacy.resourceenvironmentprivacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Environment Privacy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmprivacy.resourceenvironmentprivacy.ResourceEnvironmentPrivacy#getGeolocation <em>Geolocation</em>}</li>
 * </ul>
 *
 * @see pcmprivacy.resourceenvironmentprivacy.ResourceenvironmentprivacyPackage#getResourceEnvironmentPrivacy()
 * @model
 * @generated
 */
public interface ResourceEnvironmentPrivacy extends EObject, ResourceEnvironment {
	/**
	 * Returns the value of the '<em><b>Geolocation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geolocation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geolocation</em>' attribute list.
	 * @see pcmprivacy.resourceenvironmentprivacy.ResourceenvironmentprivacyPackage#getResourceEnvironmentPrivacy_Geolocation()
	 * @model default="0" unique="false" ordered="false"
	 * @generated
	 */
	EList<Integer> getGeolocation();

} // ResourceEnvironmentPrivacy
