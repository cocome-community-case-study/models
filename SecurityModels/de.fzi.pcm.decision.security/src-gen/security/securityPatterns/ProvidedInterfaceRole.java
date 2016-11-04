/**
 */
package security.securityPatterns;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Interface Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.ProvidedInterfaceRole#getOperationProvidedRole <em>Operation Provided Role</em>}</li>
 * </ul>
 *
 * @see security.securityPatterns.SecurityPatternsPackage#getProvidedInterfaceRole()
 * @model
 * @generated
 */
public interface ProvidedInterfaceRole extends Role {
	/**
	 * Returns the value of the '<em><b>Operation Provided Role</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.OperationProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Provided Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Provided Role</em>' reference list.
	 * @see security.securityPatterns.SecurityPatternsPackage#getProvidedInterfaceRole_OperationProvidedRole()
	 * @model required="true"
	 * @generated
	 */
	EList<OperationProvidedRole> getOperationProvidedRole();

} // ProvidedInterfaceRole
