/**
 */
package security.securityPatterns;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import security.securityPrerequisites.Prerequisite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.SecurityPattern#getName <em>Name</em>}</li>
 *   <li>{@link security.securityPatterns.SecurityPattern#getDescription <em>Description</em>}</li>
 *   <li>{@link security.securityPatterns.SecurityPattern#getStakeholder <em>Stakeholder</em>}</li>
 *   <li>{@link security.securityPatterns.SecurityPattern#getStatus <em>Status</em>}</li>
 *   <li>{@link security.securityPatterns.SecurityPattern#getRoles <em>Roles</em>}</li>
 *   <li>{@link security.securityPatterns.SecurityPattern#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link security.securityPatterns.SecurityPattern#getSubSecurityPatterns <em>Sub Security Patterns</em>}</li>
 * </ul>
 *
 * @see security.securityPatterns.SecurityPatternsPackage#getSecurityPattern()
 * @model
 * @generated
 */
public interface SecurityPattern extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see security.securityPatterns.SecurityPatternsPackage#getSecurityPattern_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link security.securityPatterns.SecurityPattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see security.securityPatterns.SecurityPatternsPackage#getSecurityPattern_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link security.securityPatterns.SecurityPattern#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Stakeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stakeholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stakeholder</em>' attribute.
	 * @see #setStakeholder(String)
	 * @see security.securityPatterns.SecurityPatternsPackage#getSecurityPattern_Stakeholder()
	 * @model required="true"
	 * @generated
	 */
	String getStakeholder();

	/**
	 * Sets the value of the '{@link security.securityPatterns.SecurityPattern#getStakeholder <em>Stakeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stakeholder</em>' attribute.
	 * @see #getStakeholder()
	 * @generated
	 */
	void setStakeholder(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link security.securityPatterns.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see security.securityPatterns.Status
	 * @see #setStatus(Status)
	 * @see security.securityPatterns.SecurityPatternsPackage#getSecurityPattern_Status()
	 * @model required="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link security.securityPatterns.SecurityPattern#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see security.securityPatterns.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link security.securityPatterns.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see security.securityPatterns.SecurityPatternsPackage#getSecurityPattern_Roles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Prerequisites</b></em>' reference list.
	 * The list contents are of type {@link security.securityPrerequisites.Prerequisite}.
	 * It is bidirectional and its opposite is '{@link security.securityPrerequisites.Prerequisite#getSecurityPatterns <em>Security Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prerequisites</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisites</em>' reference list.
	 * @see security.securityPatterns.SecurityPatternsPackage#getSecurityPattern_Prerequisites()
	 * @see security.securityPrerequisites.Prerequisite#getSecurityPatterns
	 * @model opposite="securityPatterns"
	 * @generated
	 */
	EList<Prerequisite> getPrerequisites();

	/**
	 * Returns the value of the '<em><b>Sub Security Patterns</b></em>' reference list.
	 * The list contents are of type {@link security.securityPatterns.SecurityPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Security Patterns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Security Patterns</em>' reference list.
	 * @see security.securityPatterns.SecurityPatternsPackage#getSecurityPattern_SubSecurityPatterns()
	 * @model required="true"
	 * @generated
	 */
	EList<SecurityPattern> getSubSecurityPatterns();

} // SecurityPattern
