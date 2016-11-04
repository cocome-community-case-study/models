/**
 */
package security.securityPrerequisites;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPrerequisites.ResourcePrerequisite#getRelates <em>Relates</em>}</li>
 * </ul>
 *
 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getResourcePrerequisite()
 * @model
 * @generated
 */
public interface ResourcePrerequisite extends Prerequisite {
	/**
	 * Returns the value of the '<em><b>Relates</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.resourceenvironment.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates</em>' reference list.
	 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getResourcePrerequisite_Relates()
	 * @model required="true"
	 * @generated
	 */
	EList<ResourceContainer> getRelates();

} // ResourcePrerequisite
