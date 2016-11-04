/**
 */
package security.securityPatterns;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.ComponentRole#getBasicComponent <em>Basic Component</em>}</li>
 *   <li>{@link security.securityPatterns.ComponentRole#getOperationInterface <em>Operation Interface</em>}</li>
 * </ul>
 *
 * @see security.securityPatterns.SecurityPatternsPackage#getComponentRole()
 * @model
 * @generated
 */
public interface ComponentRole extends Role {
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
	 * @see security.securityPatterns.SecurityPatternsPackage#getComponentRole_BasicComponent()
	 * @model required="true"
	 * @generated
	 */
	EList<BasicComponent> getBasicComponent();

	/**
	 * Returns the value of the '<em><b>Operation Interface</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.OperationInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Interface</em>' reference list.
	 * @see security.securityPatterns.SecurityPatternsPackage#getComponentRole_OperationInterface()
	 * @model required="true"
	 * @generated
	 */
	EList<OperationInterface> getOperationInterface();

} // ComponentRole
