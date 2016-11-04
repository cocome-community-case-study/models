/**
 */
package security.securityPrerequisites;

import de.uka.ipd.sdq.identifier.Identifier;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import security.securityPatterns.SecurityPattern;

import security.securityThreats.Attack;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPrerequisites.Prerequisite#getName <em>Name</em>}</li>
 *   <li>{@link security.securityPrerequisites.Prerequisite#getDescription <em>Description</em>}</li>
 *   <li>{@link security.securityPrerequisites.Prerequisite#getStatus <em>Status</em>}</li>
 *   <li>{@link security.securityPrerequisites.Prerequisite#isStatePositive <em>State Positive</em>}</li>
 *   <li>{@link security.securityPrerequisites.Prerequisite#getSecurityPatterns <em>Security Patterns</em>}</li>
 *   <li>{@link security.securityPrerequisites.Prerequisite#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link security.securityPrerequisites.Prerequisite#getMatches <em>Matches</em>}</li>
 *   <li>{@link security.securityPrerequisites.Prerequisite#getTechnology <em>Technology</em>}</li>
 *   <li>{@link security.securityPrerequisites.Prerequisite#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 *
 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getPrerequisite()
 * @model
 * @generated
 */
public interface Prerequisite extends EObject, Identifier {
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
	 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getPrerequisite_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link security.securityPrerequisites.Prerequisite#getName <em>Name</em>}' attribute.
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
	 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getPrerequisite_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link security.securityPrerequisites.Prerequisite#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link security.securityPrerequisites.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see security.securityPrerequisites.Status
	 * @see #setStatus(Status)
	 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getPrerequisite_Status()
	 * @model required="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link security.securityPrerequisites.Prerequisite#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see security.securityPrerequisites.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>State Positive</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Positive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Positive</em>' attribute.
	 * @see #setStatePositive(boolean)
	 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getPrerequisite_StatePositive()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isStatePositive();

	/**
	 * Sets the value of the '{@link security.securityPrerequisites.Prerequisite#isStatePositive <em>State Positive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Positive</em>' attribute.
	 * @see #isStatePositive()
	 * @generated
	 */
	void setStatePositive(boolean value);

	/**
	 * Returns the value of the '<em><b>Security Patterns</b></em>' reference list.
	 * The list contents are of type {@link security.securityPatterns.SecurityPattern}.
	 * It is bidirectional and its opposite is '{@link security.securityPatterns.SecurityPattern#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Patterns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Patterns</em>' reference list.
	 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getPrerequisite_SecurityPatterns()
	 * @see security.securityPatterns.SecurityPattern#getPrerequisites
	 * @model opposite="prerequisites"
	 * @generated
	 */
	EList<SecurityPattern> getSecurityPatterns();

	/**
	 * Returns the value of the '<em><b>Attacks</b></em>' reference list.
	 * The list contents are of type {@link security.securityThreats.Attack}.
	 * It is bidirectional and its opposite is '{@link security.securityThreats.Attack#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacks</em>' reference list.
	 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getPrerequisite_Attacks()
	 * @see security.securityThreats.Attack#getPrerequisites
	 * @model opposite="prerequisites"
	 * @generated
	 */
	EList<Attack> getAttacks();

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' reference list.
	 * The list contents are of type {@link security.securityPrerequisites.Prerequisite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' reference list.
	 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getPrerequisite_Matches()
	 * @model
	 * @generated
	 */
	EList<Prerequisite> getMatches();

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' reference list.
	 * The list contents are of type {@link security.securityPrerequisites.TechnologyPrerequisite}.
	 * It is bidirectional and its opposite is '{@link security.securityPrerequisites.TechnologyPrerequisite#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' reference list.
	 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getPrerequisite_Technology()
	 * @see security.securityPrerequisites.TechnologyPrerequisite#getDepends
	 * @model opposite="depends"
	 * @generated
	 */
	EList<TechnologyPrerequisite> getTechnology();

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(Date)
	 * @see security.securityPrerequisites.SecurityPrerequisitesPackage#getPrerequisite_TimeStamp()
	 * @model required="true"
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '{@link security.securityPrerequisites.Prerequisite#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(Date value);

} // Prerequisite
