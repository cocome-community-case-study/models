/**
 */
package security.securityThreats;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import security.securityPrerequisites.AttackerPrerequisite;

import security.securityThreats.enums.Activity;
import security.securityThreats.enums.Focus;
import security.securityThreats.enums.Intention;
import security.securityThreats.enums.Motivation;
import security.securityThreats.enums.Position;
import security.securityThreats.enums.Stealth;
import security.securityThreats.enums.TimeConstraints;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attacker Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.AttackerClass#getName <em>Name</em>}</li>
 *   <li>{@link security.securityThreats.AttackerClass#getDescription <em>Description</em>}</li>
 *   <li>{@link security.securityThreats.AttackerClass#getPosition <em>Position</em>}</li>
 *   <li>{@link security.securityThreats.AttackerClass#getIntention <em>Intention</em>}</li>
 *   <li>{@link security.securityThreats.AttackerClass#getAttackCapabilities <em>Attack Capabilities</em>}</li>
 *   <li>{@link security.securityThreats.AttackerClass#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link security.securityThreats.AttackerClass#getActivity <em>Activity</em>}</li>
 *   <li>{@link security.securityThreats.AttackerClass#getFocus <em>Focus</em>}</li>
 *   <li>{@link security.securityThreats.AttackerClass#getMotivation <em>Motivation</em>}</li>
 *   <li>{@link security.securityThreats.AttackerClass#getTimeConstraints <em>Time Constraints</em>}</li>
 *   <li>{@link security.securityThreats.AttackerClass#getStealth <em>Stealth</em>}</li>
 * </ul>
 *
 * @see security.securityThreats.SecurityThreatsPackage#getAttackerClass()
 * @model
 * @generated
 */
public interface AttackerClass extends EObject, Identifier {
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
	 * @see security.securityThreats.SecurityThreatsPackage#getAttackerClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link security.securityThreats.AttackerClass#getName <em>Name</em>}' attribute.
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
	 * @see security.securityThreats.SecurityThreatsPackage#getAttackerClass_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link security.securityThreats.AttackerClass#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link security.securityThreats.enums.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see security.securityThreats.enums.Position
	 * @see #setPosition(Position)
	 * @see security.securityThreats.SecurityThreatsPackage#getAttackerClass_Position()
	 * @model required="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link security.securityThreats.AttackerClass#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see security.securityThreats.enums.Position
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Intention</b></em>' attribute.
	 * The literals are from the enumeration {@link security.securityThreats.enums.Intention}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intention</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intention</em>' attribute.
	 * @see security.securityThreats.enums.Intention
	 * @see #setIntention(Intention)
	 * @see security.securityThreats.SecurityThreatsPackage#getAttackerClass_Intention()
	 * @model required="true"
	 * @generated
	 */
	Intention getIntention();

	/**
	 * Sets the value of the '{@link security.securityThreats.AttackerClass#getIntention <em>Intention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intention</em>' attribute.
	 * @see security.securityThreats.enums.Intention
	 * @see #getIntention()
	 * @generated
	 */
	void setIntention(Intention value);

	/**
	 * Returns the value of the '<em><b>Attack Capabilities</b></em>' reference list.
	 * The list contents are of type {@link security.securityThreats.Attack}.
	 * It is bidirectional and its opposite is '{@link security.securityThreats.Attack#getAttacker <em>Attacker</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attack Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack Capabilities</em>' reference list.
	 * @see security.securityThreats.SecurityThreatsPackage#getAttackerClass_AttackCapabilities()
	 * @see security.securityThreats.Attack#getAttacker
	 * @model opposite="attacker" required="true"
	 * @generated
	 */
	EList<Attack> getAttackCapabilities();

	/**
	 * Returns the value of the '<em><b>Prerequisites</b></em>' reference list.
	 * The list contents are of type {@link security.securityPrerequisites.AttackerPrerequisite}.
	 * It is bidirectional and its opposite is '{@link security.securityPrerequisites.AttackerPrerequisite#getRelates <em>Relates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prerequisites</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisites</em>' reference list.
	 * @see security.securityThreats.SecurityThreatsPackage#getAttackerClass_Prerequisites()
	 * @see security.securityPrerequisites.AttackerPrerequisite#getRelates
	 * @model opposite="relates" required="true"
	 * @generated
	 */
	EList<AttackerPrerequisite> getPrerequisites();

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
	 * @see security.securityThreats.SecurityThreatsPackage#getAttackerClass_Activity()
	 * @model required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link security.securityThreats.AttackerClass#getActivity <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' attribute.
	 * @see security.securityThreats.enums.Activity
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' attribute.
	 * The literals are from the enumeration {@link security.securityThreats.enums.Focus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' attribute.
	 * @see security.securityThreats.enums.Focus
	 * @see #setFocus(Focus)
	 * @see security.securityThreats.SecurityThreatsPackage#getAttackerClass_Focus()
	 * @model required="true"
	 * @generated
	 */
	Focus getFocus();

	/**
	 * Sets the value of the '{@link security.securityThreats.AttackerClass#getFocus <em>Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' attribute.
	 * @see security.securityThreats.enums.Focus
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(Focus value);

	/**
	 * Returns the value of the '<em><b>Motivation</b></em>' attribute.
	 * The literals are from the enumeration {@link security.securityThreats.enums.Motivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motivation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motivation</em>' attribute.
	 * @see security.securityThreats.enums.Motivation
	 * @see #setMotivation(Motivation)
	 * @see security.securityThreats.SecurityThreatsPackage#getAttackerClass_Motivation()
	 * @model required="true"
	 * @generated
	 */
	Motivation getMotivation();

	/**
	 * Sets the value of the '{@link security.securityThreats.AttackerClass#getMotivation <em>Motivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motivation</em>' attribute.
	 * @see security.securityThreats.enums.Motivation
	 * @see #getMotivation()
	 * @generated
	 */
	void setMotivation(Motivation value);

	/**
	 * Returns the value of the '<em><b>Time Constraints</b></em>' attribute.
	 * The literals are from the enumeration {@link security.securityThreats.enums.TimeConstraints}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Constraints</em>' attribute.
	 * @see security.securityThreats.enums.TimeConstraints
	 * @see #setTimeConstraints(TimeConstraints)
	 * @see security.securityThreats.SecurityThreatsPackage#getAttackerClass_TimeConstraints()
	 * @model required="true"
	 * @generated
	 */
	TimeConstraints getTimeConstraints();

	/**
	 * Sets the value of the '{@link security.securityThreats.AttackerClass#getTimeConstraints <em>Time Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Constraints</em>' attribute.
	 * @see security.securityThreats.enums.TimeConstraints
	 * @see #getTimeConstraints()
	 * @generated
	 */
	void setTimeConstraints(TimeConstraints value);

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
	 * @see security.securityThreats.SecurityThreatsPackage#getAttackerClass_Stealth()
	 * @model required="true"
	 * @generated
	 */
	Stealth getStealth();

	/**
	 * Sets the value of the '{@link security.securityThreats.AttackerClass#getStealth <em>Stealth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stealth</em>' attribute.
	 * @see security.securityThreats.enums.Stealth
	 * @see #getStealth()
	 * @generated
	 */
	void setStealth(Stealth value);

} // AttackerClass
