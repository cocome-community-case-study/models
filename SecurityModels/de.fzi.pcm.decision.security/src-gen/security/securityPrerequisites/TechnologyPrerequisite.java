/**
 */
package security.securityPrerequisites;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPrerequisites.TechnologyPrerequisite#getDepends <em>Depends</em>}</li>
 * </ul>
 *
 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getTechnologyPrerequisite()
 * @model
 * @generated
 */
public interface TechnologyPrerequisite extends Prerequisite {
	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference list.
	 * The list contents are of type {@link security.securityPrerequisites.Prerequisite}.
	 * It is bidirectional and its opposite is '{@link security.securityPrerequisites.Prerequisite#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference list.
	 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getTechnologyPrerequisite_Depends()
	 * @see security.securityPrerequisites.Prerequisite#getTechnology
	 * @model opposite="technology" required="true"
	 * @generated
	 */
	EList<Prerequisite> getDepends();

} // TechnologyPrerequisite
