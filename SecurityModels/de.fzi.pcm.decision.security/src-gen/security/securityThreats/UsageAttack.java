/**
 */
package security.securityThreats;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.UsageAttack#getUsageScenario <em>Usage Scenario</em>}</li>
 *   <li>{@link security.securityThreats.UsageAttack#getScenarioBehaviour <em>Scenario Behaviour</em>}</li>
 * </ul>
 *
 * @see security.securityThreats.SecurityThreatsPackage#getUsageAttack()
 * @model
 * @generated
 */
public interface UsageAttack extends Attack {
	/**
	 * Returns the value of the '<em><b>Usage Scenario</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.usagemodel.UsageScenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Scenario</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Scenario</em>' reference list.
	 * @see security.securityThreats.SecurityThreatsPackage#getUsageAttack_UsageScenario()
	 * @model
	 * @generated
	 */
	EList<UsageScenario> getUsageScenario();

	/**
	 * Returns the value of the '<em><b>Scenario Behaviour</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Behaviour</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Behaviour</em>' reference list.
	 * @see security.securityThreats.SecurityThreatsPackage#getUsageAttack_ScenarioBehaviour()
	 * @model
	 * @generated
	 */
	EList<ScenarioBehaviour> getScenarioBehaviour();

} // UsageAttack
