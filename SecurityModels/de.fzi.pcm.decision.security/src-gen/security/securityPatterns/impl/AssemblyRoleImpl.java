/**
 */
package security.securityPatterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import security.securityPatterns.AssemblyRole;
import security.securityPatterns.SecurityPatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.impl.AssemblyRoleImpl#getAssemblyContext <em>Assembly Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyRoleImpl extends RoleImpl implements AssemblyRole {
	/**
	 * The cached value of the '{@link #getAssemblyContext() <em>Assembly Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyContext> assemblyContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPatternsPackage.Literals.ASSEMBLY_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyContext> getAssemblyContext() {
		if (assemblyContext == null) {
			assemblyContext = new EObjectResolvingEList<AssemblyContext>(AssemblyContext.class, this, SecurityPatternsPackage.ASSEMBLY_ROLE__ASSEMBLY_CONTEXT);
		}
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPatternsPackage.ASSEMBLY_ROLE__ASSEMBLY_CONTEXT:
				return getAssemblyContext();
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
			case SecurityPatternsPackage.ASSEMBLY_ROLE__ASSEMBLY_CONTEXT:
				getAssemblyContext().clear();
				getAssemblyContext().addAll((Collection<? extends AssemblyContext>)newValue);
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
			case SecurityPatternsPackage.ASSEMBLY_ROLE__ASSEMBLY_CONTEXT:
				getAssemblyContext().clear();
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
			case SecurityPatternsPackage.ASSEMBLY_ROLE__ASSEMBLY_CONTEXT:
				return assemblyContext != null && !assemblyContext.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssemblyRoleImpl
