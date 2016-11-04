/**
 */
package security.securityPatterns;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.AllocationRole#getAllocationContext <em>Allocation Context</em>}</li>
 *   <li>{@link security.securityPatterns.AllocationRole#getAllocation <em>Allocation</em>}</li>
 * </ul>
 *
 * @see security.securityPatterns.SecurityPatternsPackage#getAllocationRole()
 * @model
 * @generated
 */
public interface AllocationRole extends Role {
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
	 * @see security.securityPatterns.SecurityPatternsPackage#getAllocationRole_AllocationContext()
	 * @model required="true"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContext();

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
	 * @see security.securityPatterns.SecurityPatternsPackage#getAllocationRole_Allocation()
	 * @model required="true"
	 * @generated
	 */
	EList<Allocation> getAllocation();

} // AllocationRole
