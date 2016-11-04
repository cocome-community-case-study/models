/**
 */
package security.securityThreats;

import org.eclipse.emf.common.util.EList;

import security.Catalog;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.ThreatCatalog#getAttackers <em>Attackers</em>}</li>
 *   <li>{@link security.securityThreats.ThreatCatalog#getAttackTypes <em>Attack Types</em>}</li>
 * </ul>
 *
 * @see security.securityThreats.SecurityThreatsPackage#getThreatCatalog()
 * @model
 * @generated
 */
public interface ThreatCatalog extends Catalog {
	/**
	 * Returns the value of the '<em><b>Attackers</b></em>' containment reference list.
	 * The list contents are of type {@link security.securityThreats.AttackerClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attackers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attackers</em>' containment reference list.
	 * @see security.securityThreats.SecurityThreatsPackage#getThreatCatalog_Attackers()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttackerClass> getAttackers();

	/**
	 * Returns the value of the '<em><b>Attack Types</b></em>' containment reference list.
	 * The list contents are of type {@link security.securityThreats.Attack}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attack Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack Types</em>' containment reference list.
	 * @see security.securityThreats.SecurityThreatsPackage#getThreatCatalog_AttackTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attack> getAttackTypes();

} // ThreatCatalog
