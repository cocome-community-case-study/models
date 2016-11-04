/**
 */
package security.securityThreats.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.repository.BasicComponent;

import security.securityThreats.ComponentAttack;
import security.securityThreats.SecurityThreatsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Attack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.impl.ComponentAttackImpl#getBasicComponent <em>Basic Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentAttackImpl extends AttackImpl implements ComponentAttack {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentAttackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityThreatsPackage.Literals.COMPONENT_ATTACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasicComponent> getBasicComponent() {
		if (basicComponent == null) {
			basicComponent = new EObjectResolvingEList<BasicComponent>(BasicComponent.class, this, SecurityThreatsPackage.COMPONENT_ATTACK__BASIC_COMPONENT);
		}
		return basicComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityThreatsPackage.COMPONENT_ATTACK__BASIC_COMPONENT:
				return getBasicComponent();
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
			case SecurityThreatsPackage.COMPONENT_ATTACK__BASIC_COMPONENT:
				getBasicComponent().clear();
				getBasicComponent().addAll((Collection<? extends BasicComponent>)newValue);
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
			case SecurityThreatsPackage.COMPONENT_ATTACK__BASIC_COMPONENT:
				getBasicComponent().clear();
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
			case SecurityThreatsPackage.COMPONENT_ATTACK__BASIC_COMPONENT:
				return basicComponent != null && !basicComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentAttackImpl
