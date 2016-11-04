/**
 */
package security.securityPatterns;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.EnvironmentRole#getResourceEnvironment <em>Resource Environment</em>}</li>
 *   <li>{@link security.securityPatterns.EnvironmentRole#getLinkingResource <em>Linking Resource</em>}</li>
 * </ul>
 *
 * @see security.securityPatterns.SecurityPatternsPackage#getEnvironmentRole()
 * @model
 * @generated
 */
public interface EnvironmentRole extends Role {
	/**
	 * Returns the value of the '<em><b>Resource Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Environment</em>' reference.
	 * @see #setResourceEnvironment(ResourceEnvironment)
	 * @see security.securityPatterns.SecurityPatternsPackage#getEnvironmentRole_ResourceEnvironment()
	 * @model required="true"
	 * @generated
	 */
	ResourceEnvironment getResourceEnvironment();

	/**
	 * Sets the value of the '{@link security.securityPatterns.EnvironmentRole#getResourceEnvironment <em>Resource Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Environment</em>' reference.
	 * @see #getResourceEnvironment()
	 * @generated
	 */
	void setResourceEnvironment(ResourceEnvironment value);

	/**
	 * Returns the value of the '<em><b>Linking Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linking Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linking Resource</em>' reference.
	 * @see #setLinkingResource(LinkingResource)
	 * @see security.securityPatterns.SecurityPatternsPackage#getEnvironmentRole_LinkingResource()
	 * @model required="true"
	 * @generated
	 */
	LinkingResource getLinkingResource();

	/**
	 * Sets the value of the '{@link security.securityPatterns.EnvironmentRole#getLinkingResource <em>Linking Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linking Resource</em>' reference.
	 * @see #getLinkingResource()
	 * @generated
	 */
	void setLinkingResource(LinkingResource value);

} // EnvironmentRole
