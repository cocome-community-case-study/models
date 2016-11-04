/**
 */
package security.securityPrerequisites;

import org.eclipse.emf.common.util.EList;

import security.securityPatterns.SecurityPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPrerequisites.SecurityPrerequisite#getRelates <em>Relates</em>}</li>
 * </ul>
 *
 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getSecurityPrerequisite()
 * @model
 * @generated
 */
public interface SecurityPrerequisite extends Prerequisite {
	/**
	 * Returns the value of the '<em><b>Relates</b></em>' reference list.
	 * The list contents are of type {@link security.securityPatterns.SecurityPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates</em>' reference list.
	 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getSecurityPrerequisite_Relates()
	 * @model required="true"
	 * @generated
	 */
	EList<SecurityPattern> getRelates();

} // SecurityPrerequisite
