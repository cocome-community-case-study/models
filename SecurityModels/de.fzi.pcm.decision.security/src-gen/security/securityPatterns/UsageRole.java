/**
 */
package security.securityPatterns;

import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.pcm.usagemodel.Workload;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.UsageRole#getUsageScenario <em>Usage Scenario</em>}</li>
 *   <li>{@link security.securityPatterns.UsageRole#getWorkload <em>Workload</em>}</li>
 * </ul>
 *
 * @see security.securityPatterns.SecurityPatternsPackage#getUsageRole()
 * @model
 * @generated
 */
public interface UsageRole extends Role {
	/**
	 * Returns the value of the '<em><b>Usage Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Scenario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Scenario</em>' reference.
	 * @see #setUsageScenario(UsageScenario)
	 * @see security.securityPatterns.SecurityPatternsPackage#getUsageRole_UsageScenario()
	 * @model required="true"
	 * @generated
	 */
	UsageScenario getUsageScenario();

	/**
	 * Sets the value of the '{@link security.securityPatterns.UsageRole#getUsageScenario <em>Usage Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Scenario</em>' reference.
	 * @see #getUsageScenario()
	 * @generated
	 */
	void setUsageScenario(UsageScenario value);

	/**
	 * Returns the value of the '<em><b>Workload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload</em>' reference.
	 * @see #setWorkload(Workload)
	 * @see security.securityPatterns.SecurityPatternsPackage#getUsageRole_Workload()
	 * @model required="true"
	 * @generated
	 */
	Workload getWorkload();

	/**
	 * Sets the value of the '{@link security.securityPatterns.UsageRole#getWorkload <em>Workload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workload</em>' reference.
	 * @see #getWorkload()
	 * @generated
	 */
	void setWorkload(Workload value);

} // UsageRole
