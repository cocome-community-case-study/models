/**
 */
package security.securityThreats;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.SystemAttack#getOperationProvidedRole <em>Operation Provided Role</em>}</li>
 *   <li>{@link security.securityThreats.SystemAttack#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see security.securityThreats.SecurityThreatsPackage#getSystemAttack()
 * @model
 * @generated
 */
public interface SystemAttack extends Attack {
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
	 * @see security.securityThreats.SecurityThreatsPackage#getSystemAttack_OperationProvidedRole()
	 * @model
	 * @generated
	 */
	EList<OperationProvidedRole> getOperationProvidedRole();

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(org.palladiosimulator.pcm.system.System)
	 * @see security.securityThreats.SecurityThreatsPackage#getSystemAttack_System()
	 * @model required="true"
	 * @generated
	 */
	org.palladiosimulator.pcm.system.System getSystem();

	/**
	 * Sets the value of the '{@link security.securityThreats.SystemAttack#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(org.palladiosimulator.pcm.system.System value);

} // SystemAttack
