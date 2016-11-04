/**
 */
package security.securityPatterns;

import org.eclipse.emf.common.util.EList;

import security.Catalog;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.PatternCatalog#getSecurityPatterns <em>Security Patterns</em>}</li>
 * </ul>
 *
 * @see security.securityPatterns.SecurityPatternsPackage#getPatternCatalog()
 * @model
 * @generated
 */
public interface PatternCatalog extends Catalog {
	/**
	 * Returns the value of the '<em><b>Security Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link security.securityPatterns.SecurityPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Patterns</em>' containment reference list.
	 * @see security.securityPatterns.SecurityPatternsPackage#getPatternCatalog_SecurityPatterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityPattern> getSecurityPatterns();

} // PatternCatalog
