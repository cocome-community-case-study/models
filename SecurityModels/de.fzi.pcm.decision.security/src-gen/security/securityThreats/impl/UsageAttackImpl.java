/**
 */
package security.securityThreats.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;

import security.securityThreats.SecurityThreatsPackage;
import security.securityThreats.UsageAttack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Attack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.impl.UsageAttackImpl#getUsageScenario <em>Usage Scenario</em>}</li>
 *   <li>{@link security.securityThreats.impl.UsageAttackImpl#getScenarioBehaviour <em>Scenario Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageAttackImpl extends AttackImpl implements UsageAttack {
	/**
	 * The cached value of the '{@link #getUsageScenario() <em>Usage Scenario</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageScenario()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageScenario> usageScenario;

	/**
	 * The cached value of the '{@link #getScenarioBehaviour() <em>Scenario Behaviour</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioBehaviour()
	 * @generated
	 * @ordered
	 */
	protected EList<ScenarioBehaviour> scenarioBehaviour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageAttackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityThreatsPackage.Literals.USAGE_ATTACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageScenario> getUsageScenario() {
		if (usageScenario == null) {
			usageScenario = new EObjectResolvingEList<UsageScenario>(UsageScenario.class, this, SecurityThreatsPackage.USAGE_ATTACK__USAGE_SCENARIO);
		}
		return usageScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScenarioBehaviour> getScenarioBehaviour() {
		if (scenarioBehaviour == null) {
			scenarioBehaviour = new EObjectResolvingEList<ScenarioBehaviour>(ScenarioBehaviour.class, this, SecurityThreatsPackage.USAGE_ATTACK__SCENARIO_BEHAVIOUR);
		}
		return scenarioBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityThreatsPackage.USAGE_ATTACK__USAGE_SCENARIO:
				return getUsageScenario();
			case SecurityThreatsPackage.USAGE_ATTACK__SCENARIO_BEHAVIOUR:
				return getScenarioBehaviour();
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
			case SecurityThreatsPackage.USAGE_ATTACK__USAGE_SCENARIO:
				getUsageScenario().clear();
				getUsageScenario().addAll((Collection<? extends UsageScenario>)newValue);
				return;
			case SecurityThreatsPackage.USAGE_ATTACK__SCENARIO_BEHAVIOUR:
				getScenarioBehaviour().clear();
				getScenarioBehaviour().addAll((Collection<? extends ScenarioBehaviour>)newValue);
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
			case SecurityThreatsPackage.USAGE_ATTACK__USAGE_SCENARIO:
				getUsageScenario().clear();
				return;
			case SecurityThreatsPackage.USAGE_ATTACK__SCENARIO_BEHAVIOUR:
				getScenarioBehaviour().clear();
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
			case SecurityThreatsPackage.USAGE_ATTACK__USAGE_SCENARIO:
				return usageScenario != null && !usageScenario.isEmpty();
			case SecurityThreatsPackage.USAGE_ATTACK__SCENARIO_BEHAVIOUR:
				return scenarioBehaviour != null && !scenarioBehaviour.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UsageAttackImpl
