/**
 */
package security.securityThreats.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import security.securityPrerequisites.AttackerPrerequisite;
import security.securityPrerequisites.SecurityPrerequisitesPackage;

import security.securityThreats.Attack;
import security.securityThreats.AttackerClass;
import security.securityThreats.SecurityThreatsPackage;

import security.securityThreats.enums.Activity;
import security.securityThreats.enums.Focus;
import security.securityThreats.enums.Intention;
import security.securityThreats.enums.Motivation;
import security.securityThreats.enums.Position;
import security.securityThreats.enums.Stealth;
import security.securityThreats.enums.TimeConstraints;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attacker Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.impl.AttackerClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackerClassImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackerClassImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackerClassImpl#getIntention <em>Intention</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackerClassImpl#getAttackCapabilities <em>Attack Capabilities</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackerClassImpl#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackerClassImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackerClassImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackerClassImpl#getMotivation <em>Motivation</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackerClassImpl#getTimeConstraints <em>Time Constraints</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackerClassImpl#getStealth <em>Stealth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackerClassImpl extends IdentifierImpl implements AttackerClass {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Position POSITION_EDEFAULT = Position.INTERNAL;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntention() <em>Intention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntention()
	 * @generated
	 * @ordered
	 */
	protected static final Intention INTENTION_EDEFAULT = Intention.MALICIOUS;

	/**
	 * The cached value of the '{@link #getIntention() <em>Intention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntention()
	 * @generated
	 * @ordered
	 */
	protected Intention intention = INTENTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttackCapabilities() <em>Attack Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Attack> attackCapabilities;

	/**
	 * The cached value of the '{@link #getPrerequisites() <em>Prerequisites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrerequisites()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackerPrerequisite> prerequisites;

	/**
	 * The default value of the '{@link #getActivity() <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected static final Activity ACTIVITY_EDEFAULT = Activity.ACTIVE;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity = ACTIVITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFocus() <em>Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected static final Focus FOCUS_EDEFAULT = Focus.UNDEFINED;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected Focus focus = FOCUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotivation() <em>Motivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotivation()
	 * @generated
	 * @ordered
	 */
	protected static final Motivation MOTIVATION_EDEFAULT = Motivation.UNDEFINED;

	/**
	 * The cached value of the '{@link #getMotivation() <em>Motivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotivation()
	 * @generated
	 * @ordered
	 */
	protected Motivation motivation = MOTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeConstraints() <em>Time Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final TimeConstraints TIME_CONSTRAINTS_EDEFAULT = TimeConstraints.UNDEFINED;

	/**
	 * The cached value of the '{@link #getTimeConstraints() <em>Time Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConstraints()
	 * @generated
	 * @ordered
	 */
	protected TimeConstraints timeConstraints = TIME_CONSTRAINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStealth() <em>Stealth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStealth()
	 * @generated
	 * @ordered
	 */
	protected static final Stealth STEALTH_EDEFAULT = Stealth.NONSTEALTHY;

	/**
	 * The cached value of the '{@link #getStealth() <em>Stealth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStealth()
	 * @generated
	 * @ordered
	 */
	protected Stealth stealth = STEALTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityThreatsPackage.Literals.ATTACKER_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.ATTACKER_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.ATTACKER_CLASS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		Position oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.ATTACKER_CLASS__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intention getIntention() {
		return intention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntention(Intention newIntention) {
		Intention oldIntention = intention;
		intention = newIntention == null ? INTENTION_EDEFAULT : newIntention;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.ATTACKER_CLASS__INTENTION, oldIntention, intention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attack> getAttackCapabilities() {
		if (attackCapabilities == null) {
			attackCapabilities = new EObjectWithInverseResolvingEList.ManyInverse<Attack>(Attack.class, this, SecurityThreatsPackage.ATTACKER_CLASS__ATTACK_CAPABILITIES, SecurityThreatsPackage.ATTACK__ATTACKER);
		}
		return attackCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttackerPrerequisite> getPrerequisites() {
		if (prerequisites == null) {
			prerequisites = new EObjectWithInverseResolvingEList.ManyInverse<AttackerPrerequisite>(AttackerPrerequisite.class, this, SecurityThreatsPackage.ATTACKER_CLASS__PREREQUISITES, SecurityPrerequisitesPackage.ATTACKER_PREREQUISITE__RELATES);
		}
		return prerequisites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		Activity oldActivity = activity;
		activity = newActivity == null ? ACTIVITY_EDEFAULT : newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.ATTACKER_CLASS__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Focus getFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocus(Focus newFocus) {
		Focus oldFocus = focus;
		focus = newFocus == null ? FOCUS_EDEFAULT : newFocus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.ATTACKER_CLASS__FOCUS, oldFocus, focus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motivation getMotivation() {
		return motivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotivation(Motivation newMotivation) {
		Motivation oldMotivation = motivation;
		motivation = newMotivation == null ? MOTIVATION_EDEFAULT : newMotivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.ATTACKER_CLASS__MOTIVATION, oldMotivation, motivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConstraints getTimeConstraints() {
		return timeConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeConstraints(TimeConstraints newTimeConstraints) {
		TimeConstraints oldTimeConstraints = timeConstraints;
		timeConstraints = newTimeConstraints == null ? TIME_CONSTRAINTS_EDEFAULT : newTimeConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.ATTACKER_CLASS__TIME_CONSTRAINTS, oldTimeConstraints, timeConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stealth getStealth() {
		return stealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStealth(Stealth newStealth) {
		Stealth oldStealth = stealth;
		stealth = newStealth == null ? STEALTH_EDEFAULT : newStealth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.ATTACKER_CLASS__STEALTH, oldStealth, stealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityThreatsPackage.ATTACKER_CLASS__ATTACK_CAPABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttackCapabilities()).basicAdd(otherEnd, msgs);
			case SecurityThreatsPackage.ATTACKER_CLASS__PREREQUISITES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrerequisites()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityThreatsPackage.ATTACKER_CLASS__ATTACK_CAPABILITIES:
				return ((InternalEList<?>)getAttackCapabilities()).basicRemove(otherEnd, msgs);
			case SecurityThreatsPackage.ATTACKER_CLASS__PREREQUISITES:
				return ((InternalEList<?>)getPrerequisites()).basicRemove(otherEnd, msgs);
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
			case SecurityThreatsPackage.ATTACKER_CLASS__NAME:
				return getName();
			case SecurityThreatsPackage.ATTACKER_CLASS__DESCRIPTION:
				return getDescription();
			case SecurityThreatsPackage.ATTACKER_CLASS__POSITION:
				return getPosition();
			case SecurityThreatsPackage.ATTACKER_CLASS__INTENTION:
				return getIntention();
			case SecurityThreatsPackage.ATTACKER_CLASS__ATTACK_CAPABILITIES:
				return getAttackCapabilities();
			case SecurityThreatsPackage.ATTACKER_CLASS__PREREQUISITES:
				return getPrerequisites();
			case SecurityThreatsPackage.ATTACKER_CLASS__ACTIVITY:
				return getActivity();
			case SecurityThreatsPackage.ATTACKER_CLASS__FOCUS:
				return getFocus();
			case SecurityThreatsPackage.ATTACKER_CLASS__MOTIVATION:
				return getMotivation();
			case SecurityThreatsPackage.ATTACKER_CLASS__TIME_CONSTRAINTS:
				return getTimeConstraints();
			case SecurityThreatsPackage.ATTACKER_CLASS__STEALTH:
				return getStealth();
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
			case SecurityThreatsPackage.ATTACKER_CLASS__NAME:
				setName((String)newValue);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__POSITION:
				setPosition((Position)newValue);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__INTENTION:
				setIntention((Intention)newValue);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__ATTACK_CAPABILITIES:
				getAttackCapabilities().clear();
				getAttackCapabilities().addAll((Collection<? extends Attack>)newValue);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__PREREQUISITES:
				getPrerequisites().clear();
				getPrerequisites().addAll((Collection<? extends AttackerPrerequisite>)newValue);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__FOCUS:
				setFocus((Focus)newValue);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__MOTIVATION:
				setMotivation((Motivation)newValue);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__TIME_CONSTRAINTS:
				setTimeConstraints((TimeConstraints)newValue);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__STEALTH:
				setStealth((Stealth)newValue);
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
			case SecurityThreatsPackage.ATTACKER_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__INTENTION:
				setIntention(INTENTION_EDEFAULT);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__ATTACK_CAPABILITIES:
				getAttackCapabilities().clear();
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__PREREQUISITES:
				getPrerequisites().clear();
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__ACTIVITY:
				setActivity(ACTIVITY_EDEFAULT);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__FOCUS:
				setFocus(FOCUS_EDEFAULT);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__MOTIVATION:
				setMotivation(MOTIVATION_EDEFAULT);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__TIME_CONSTRAINTS:
				setTimeConstraints(TIME_CONSTRAINTS_EDEFAULT);
				return;
			case SecurityThreatsPackage.ATTACKER_CLASS__STEALTH:
				setStealth(STEALTH_EDEFAULT);
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
			case SecurityThreatsPackage.ATTACKER_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecurityThreatsPackage.ATTACKER_CLASS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SecurityThreatsPackage.ATTACKER_CLASS__POSITION:
				return position != POSITION_EDEFAULT;
			case SecurityThreatsPackage.ATTACKER_CLASS__INTENTION:
				return intention != INTENTION_EDEFAULT;
			case SecurityThreatsPackage.ATTACKER_CLASS__ATTACK_CAPABILITIES:
				return attackCapabilities != null && !attackCapabilities.isEmpty();
			case SecurityThreatsPackage.ATTACKER_CLASS__PREREQUISITES:
				return prerequisites != null && !prerequisites.isEmpty();
			case SecurityThreatsPackage.ATTACKER_CLASS__ACTIVITY:
				return activity != ACTIVITY_EDEFAULT;
			case SecurityThreatsPackage.ATTACKER_CLASS__FOCUS:
				return focus != FOCUS_EDEFAULT;
			case SecurityThreatsPackage.ATTACKER_CLASS__MOTIVATION:
				return motivation != MOTIVATION_EDEFAULT;
			case SecurityThreatsPackage.ATTACKER_CLASS__TIME_CONSTRAINTS:
				return timeConstraints != TIME_CONSTRAINTS_EDEFAULT;
			case SecurityThreatsPackage.ATTACKER_CLASS__STEALTH:
				return stealth != STEALTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", position: ");
		result.append(position);
		result.append(", intention: ");
		result.append(intention);
		result.append(", activity: ");
		result.append(activity);
		result.append(", focus: ");
		result.append(focus);
		result.append(", motivation: ");
		result.append(motivation);
		result.append(", timeConstraints: ");
		result.append(timeConstraints);
		result.append(", stealth: ");
		result.append(stealth);
		result.append(')');
		return result.toString();
	}

} //AttackerClassImpl
