/**
 */
package security.securityPatterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import security.impl.CatalogImpl;

import security.securityPatterns.PatternCatalog;
import security.securityPatterns.SecurityPattern;
import security.securityPatterns.SecurityPatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.impl.PatternCatalogImpl#getSecurityPatterns <em>Security Patterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternCatalogImpl extends CatalogImpl implements PatternCatalog {
	/**
	 * The cached value of the '{@link #getSecurityPatterns() <em>Security Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityPattern> securityPatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPatternsPackage.Literals.PATTERN_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityPattern> getSecurityPatterns() {
		if (securityPatterns == null) {
			securityPatterns = new EObjectContainmentEList<SecurityPattern>(SecurityPattern.class, this, SecurityPatternsPackage.PATTERN_CATALOG__SECURITY_PATTERNS);
		}
		return securityPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPatternsPackage.PATTERN_CATALOG__SECURITY_PATTERNS:
				return ((InternalEList<?>)getSecurityPatterns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPatternsPackage.PATTERN_CATALOG__SECURITY_PATTERNS:
				return getSecurityPatterns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecurityPatternsPackage.PATTERN_CATALOG__SECURITY_PATTERNS:
				getSecurityPatterns().clear();
				getSecurityPatterns().addAll((Collection<? extends SecurityPattern>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SecurityPatternsPackage.PATTERN_CATALOG__SECURITY_PATTERNS:
				getSecurityPatterns().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SecurityPatternsPackage.PATTERN_CATALOG__SECURITY_PATTERNS:
				return securityPatterns != null && !securityPatterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PatternCatalogImpl
