/**
 */
package security.securityPrerequisites;

import org.eclipse.emf.common.util.EList;

import security.Catalog;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerequisite Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPrerequisites.PrerequisiteCatalog#getPrerequisites <em>Prerequisites</em>}</li>
 * </ul>
 *
 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getPrerequisiteCatalog()
 * @model
 * @generated
 */
public interface PrerequisiteCatalog extends Catalog {
	/**
	 * Returns the value of the '<em><b>Prerequisites</b></em>' containment reference list.
	 * The list contents are of type {@link security.securityPrerequisites.Prerequisite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prerequisites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisites</em>' containment reference list.
	 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getPrerequisiteCatalog_Prerequisites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Prerequisite> getPrerequisites();

} // PrerequisiteCatalog
