/**
 */
package security.securityPatterns;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.AssemblyRole#getAssemblyContext <em>Assembly Context</em>}</li>
 * </ul>
 *
 * @see security.securityPatterns.SecurityPatternsPackage#getAssemblyRole()
 * @model
 * @generated
 */
public interface AssemblyRole extends Role {
	/**
	 * Returns the value of the '<em><b>Assembly Context</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.core.composition.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context</em>' reference list.
	 * @see security.securityPatterns.SecurityPatternsPackage#getAssemblyRole_AssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	EList<AssemblyContext> getAssemblyContext();

} // AssemblyRole
