/**
 */
package security.securityThreats;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.AllocationAttack#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link security.securityThreats.AllocationAttack#getAllocationContext <em>Allocation Context</em>}</li>
 * </ul>
 *
 * @see security.securityThreats.SecurityThreatsPackage#getAllocationAttack()
 * @model
 * @generated
 */
public interface AllocationAttack extends Attack {
	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.allocation.Allocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' reference list.
	 * @see security.securityThreats.SecurityThreatsPackage#getAllocationAttack_Allocation()
	 * @model
	 * @generated
	 */
	EList<Allocation> getAllocation();

	/**
	 * Returns the value of the '<em><b>Allocation Context</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.allocation.AllocationContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Context</em>' reference list.
	 * @see security.securityThreats.SecurityThreatsPackage#getAllocationAttack_AllocationContext()
	 * @model
	 * @generated
	 */
	EList<AllocationContext> getAllocationContext();

} // AllocationAttack
