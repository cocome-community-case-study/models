/**
 */
package security.securityThreats;

import de.uka.ipd.sdq.identifier.Identifier;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import security.securityPrerequisites.Prerequisite;

import security.securityThreats.enums.Activity;
import security.securityThreats.enums.SecurityViolation;
import security.securityThreats.enums.Stealth;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.Attack#getName <em>Name</em>}</li>
 *   <li>{@link security.securityThreats.Attack#getDescription <em>Description</em>}</li>
 *   <li>{@link security.securityThreats.Attack#getActivity <em>Activity</em>}</li>
 *   <li>{@link security.securityThreats.Attack#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link security.securityThreats.Attack#getSubAttacks <em>Sub Attacks</em>}</li>
 *   <li>{@link security.securityThreats.Attack#getAttacker <em>Attacker</em>}</li>
 *   <li>{@link security.securityThreats.Attack#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link security.securityThreats.Attack#getStealth <em>Stealth</em>}</li>
 *   <li>{@link security.securityThreats.Attack#getSecurityViolations <em>Security Violations</em>}</li>
 * </ul>
 *
 * @see security.securityThreats.SecurityThreatsPackage#getAttack()
 * @model
 * @generated
 */
public interface Attack extends EObject, Identifier {
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
	 * @see security.securityThreats.SecurityThreatsPackage#getAttack_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link security.securityThreats.Attack#getName <em>Name</em>}' attribute.
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
	 * @see security.securityThreats.SecurityThreatsPackage#getAttack_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link security.securityThreats.Attack#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' attribute.
	 * The literals are from the enumeration {@link security.securityThreats.enums.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' attribute.
	 * @see security.securityThreats.enums.Activity
	 * @see #setActivity(Activity)
	 * @see security.securityThreats.SecurityThreatsPackage#getAttack_Activity()
	 * @model required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link security.securityThreats.Attack#getActivity <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' attribute.
	 * @see security.securityThreats.enums.Activity
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

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
	 * @see security.securityThreats.SecurityThreatsPackage#getAttack_TimeStamp()
	 * @model required="true"
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '{@link security.securityThreats.Attack#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Sub Attacks</b></em>' reference list.
	 * The list contents are of type {@link security.securityThreats.Attack}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Attacks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Attacks</em>' reference list.
	 * @see security.securityThreats.SecurityThreatsPackage#getAttack_SubAttacks()
	 * @model
	 * @generated
	 */
	EList<Attack> getSubAttacks();

	/**
	 * Returns the value of the '<em><b>Attacker</b></em>' reference list.
	 * The list contents are of type {@link security.securityThreats.AttackerClass}.
	 * It is bidirectional and its opposite is '{@link security.securityThreats.AttackerClass#getAttackCapabilities <em>Attack Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker</em>' reference list.
	 * @see security.securityThreats.SecurityThreatsPackage#getAttack_Attacker()
	 * @see security.securityThreats.AttackerClass#getAttackCapabilities
	 * @model opposite="attackCapabilities" required="true"
	 * @generated
	 */
	EList<AttackerClass> getAttacker();

	/**
	 * Returns the value of the '<em><b>Prerequisites</b></em>' reference list.
	 * The list contents are of type {@link security.securityPrerequisites.Prerequisite}.
	 * It is bidirectional and its opposite is '{@link security.securityPrerequisites.Prerequisite#getAttacks <em>Attacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prerequisites</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisites</em>' reference list.
	 * @see security.securityThreats.SecurityThreatsPackage#getAttack_Prerequisites()
	 * @see security.securityPrerequisites.Prerequisite#getAttacks
	 * @model opposite="attacks"
	 * @generated
	 */
	EList<Prerequisite> getPrerequisites();

	/**
	 * Returns the value of the '<em><b>Stealth</b></em>' attribute.
	 * The literals are from the enumeration {@link security.securityThreats.enums.Stealth}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stealth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stealth</em>' attribute.
	 * @see security.securityThreats.enums.Stealth
	 * @see #setStealth(Stealth)
	 * @see security.securityThreats.SecurityThreatsPackage#getAttack_Stealth()
	 * @model required="true"
	 * @generated
	 */
	Stealth getStealth();

	/**
	 * Sets the value of the '{@link security.securityThreats.Attack#getStealth <em>Stealth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stealth</em>' attribute.
	 * @see security.securityThreats.enums.Stealth
	 * @see #getStealth()
	 * @generated
	 */
	void setStealth(Stealth value);

	/**
	 * Returns the value of the '<em><b>Security Violations</b></em>' attribute list.
	 * The list contents are of type {@link security.securityThreats.enums.SecurityViolation}.
	 * The literals are from the enumeration {@link security.securityThreats.enums.SecurityViolation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Violations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Violations</em>' attribute list.
	 * @see security.securityThreats.enums.SecurityViolation
	 * @see security.securityThreats.SecurityThreatsPackage#getAttack_SecurityViolations()
	 * @model required="true"
	 * @generated
	 */
	EList<SecurityViolation> getSecurityViolations();

} // Attack
