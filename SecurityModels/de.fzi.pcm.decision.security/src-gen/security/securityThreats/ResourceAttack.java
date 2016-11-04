/**
 */
package security.securityThreats;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.ResourceAttack#getResourceContainer <em>Resource Container</em>}</li>
 *   <li>{@link security.securityThreats.ResourceAttack#getLinkingResource <em>Linking Resource</em>}</li>
 * </ul>
 *
 * @see security.securityThreats.SecurityThreatsPackage#getResourceAttack()
 * @model
 * @generated
 */
public interface ResourceAttack extends Attack {
	/**
	 * Returns the value of the '<em><b>Resource Container</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.resourceenvironment.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Container</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container</em>' reference list.
	 * @see security.securityThreats.SecurityThreatsPackage#getResourceAttack_ResourceContainer()
	 * @model
	 * @generated
	 */
	EList<ResourceContainer> getResourceContainer();

	/**
	 * Returns the value of the '<em><b>Linking Resource</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.resourceenvironment.LinkingResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linking Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linking Resource</em>' reference list.
	 * @see security.securityThreats.SecurityThreatsPackage#getResourceAttack_LinkingResource()
	 * @model
	 * @generated
	 */
	EList<LinkingResource> getLinkingResource();

} // ResourceAttack
