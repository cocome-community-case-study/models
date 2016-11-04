/**
 */
package security.securityPatterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;

import security.securityPatterns.ComponentRole;
import security.securityPatterns.SecurityPatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.impl.ComponentRoleImpl#getBasicComponent <em>Basic Component</em>}</li>
 *   <li>{@link security.securityPatterns.impl.ComponentRoleImpl#getOperationInterface <em>Operation Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentRoleImpl extends RoleImpl implements ComponentRole {
	/**
	 * The cached value of the '{@link #getBasicComponent() <em>Basic Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicComponent> basicComponent;

	/**
	 * The cached value of the '{@link #getOperationInterface() <em>Operation Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationInterface> operationInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPatternsPackage.Literals.COMPONENT_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasicComponent> getBasicComponent() {
		if (basicComponent == null) {
			basicComponent = new EObjectResolvingEList<BasicComponent>(BasicComponent.class, this, SecurityPatternsPackage.COMPONENT_ROLE__BASIC_COMPONENT);
		}
		return basicComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationInterface> getOperationInterface() {
		if (operationInterface == null) {
			operationInterface = new EObjectResolvingEList<OperationInterface>(OperationInterface.class, this, SecurityPatternsPackage.COMPONENT_ROLE__OPERATION_INTERFACE);
		}
		return operationInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPatternsPackage.COMPONENT_ROLE__BASIC_COMPONENT:
				return getBasicComponent();
			case SecurityPatternsPackage.COMPONENT_ROLE__OPERATION_INTERFACE:
				return getOperationInterface();
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
			case SecurityPatternsPackage.COMPONENT_ROLE__BASIC_COMPONENT:
				getBasicComponent().clear();
				getBasicComponent().addAll((Collection<? extends BasicComponent>)newValue);
				return;
			case SecurityPatternsPackage.COMPONENT_ROLE__OPERATION_INTERFACE:
				getOperationInterface().clear();
				getOperationInterface().addAll((Collection<? extends OperationInterface>)newValue);
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
			case SecurityPatternsPackage.COMPONENT_ROLE__BASIC_COMPONENT:
				getBasicComponent().clear();
				return;
			case SecurityPatternsPackage.COMPONENT_ROLE__OPERATION_INTERFACE:
				getOperationInterface().clear();
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
			case SecurityPatternsPackage.COMPONENT_ROLE__BASIC_COMPONENT:
				return basicComponent != null && !basicComponent.isEmpty();
			case SecurityPatternsPackage.COMPONENT_ROLE__OPERATION_INTERFACE:
				return operationInterface != null && !operationInterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentRoleImpl
