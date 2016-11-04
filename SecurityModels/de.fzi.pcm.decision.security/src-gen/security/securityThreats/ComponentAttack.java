/**
 */
package security.securityThreats;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.BasicComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.ComponentAttack#getBasicComponent <em>Basic Component</em>}</li>
 * </ul>
 *
 * @see security.securityThreats.SecurityThreatsPackage#getComponentAttack()
 * @model
 * @generated
 */
public interface ComponentAttack extends Attack {
	/**
	 * Returns the value of the '<em><b>Basic Component</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.BasicComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Component</em>' reference list.
	 * @see security.securityThreats.SecurityThreatsPackage#getComponentAttack_BasicComponent()
	 * @model required="true"
	 * @generated
	 */
	EList<BasicComponent> getBasicComponent();

} // ComponentAttack
