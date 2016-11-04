/**
 */
package security.securityPatterns;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.SystemRole#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see security.securityPatterns.SecurityPatternsPackage#getSystemRole()
 * @model
 * @generated
 */
public interface SystemRole extends Role {
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
	 * @see security.securityPatterns.SecurityPatternsPackage#getSystemRole_System()
	 * @model required="true"
	 * @generated
	 */
	org.palladiosimulator.pcm.system.System getSystem();

	/**
	 * Sets the value of the '{@link security.securityPatterns.SystemRole#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(org.palladiosimulator.pcm.system.System value);

} // SystemRole
