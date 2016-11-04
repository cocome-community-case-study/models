/**
 */
package security.securityThreats.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import security.securityPrerequisites.Prerequisite;
import security.securityPrerequisites.SecurityPrerequisitesPackage;

import security.securityThreats.Attack;
import security.securityThreats.AttackerClass;
import security.securityThreats.SecurityThreatsPackage;

import security.securityThreats.enums.Activity;
import security.securityThreats.enums.SecurityViolation;
import security.securityThreats.enums.Stealth;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityThreats.impl.AttackImpl#getName <em>Name</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackImpl#getSubAttacks <em>Sub Attacks</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackImpl#getAttacker <em>Attacker</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackImpl#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackImpl#getStealth <em>Stealth</em>}</li>
 *   <li>{@link security.securityThreats.impl.AttackImpl#getSecurityViolations <em>Security Violations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackImpl extends IdentifierImpl implements Attack {
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
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected Date timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubAttacks() <em>Sub Attacks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubAttacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Attack> subAttacks;

	/**
	 * The cached value of the '{@link #getAttacker() <em>Attacker</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttacker()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackerClass> attacker;

	/**
	 * The cached value of the '{@link #getPrerequisites() <em>Prerequisites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrerequisites()
	 * @generated
	 * @ordered
	 */
	protected EList<Prerequisite> prerequisites;

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
	 * The cached value of the '{@link #getSecurityViolations() <em>Security Violations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityViolations()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityViolation> securityViolations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityThreatsPackage.Literals.ATTACK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.ATTACK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.ATTACK__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.ATTACK__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(Date newTimeStamp) {
		Date oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.ATTACK__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attack> getSubAttacks() {
		if (subAttacks == null) {
			subAttacks = new EObjectResolvingEList<Attack>(Attack.class, this, SecurityThreatsPackage.ATTACK__SUB_ATTACKS);
		}
		return subAttacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttackerClass> getAttacker() {
		if (attacker == null) {
			attacker = new EObjectWithInverseResolvingEList.ManyInverse<AttackerClass>(AttackerClass.class, this, SecurityThreatsPackage.ATTACK__ATTACKER, SecurityThreatsPackage.ATTACKER_CLASS__ATTACK_CAPABILITIES);
		}
		return attacker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prerequisite> getPrerequisites() {
		if (prerequisites == null) {
			prerequisites = new EObjectWithInverseResolvingEList.ManyInverse<Prerequisite>(Prerequisite.class, this, SecurityThreatsPackage.ATTACK__PREREQUISITES, SecurityPrerequisitesPackage.PREREQUISITE__ATTACKS);
		}
		return prerequisites;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityThreatsPackage.ATTACK__STEALTH, oldStealth, stealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityViolation> getSecurityViolations() {
		if (securityViolations == null) {
			securityViolations = new EDataTypeUniqueEList<SecurityViolation>(SecurityViolation.class, this, SecurityThreatsPackage.ATTACK__SECURITY_VIOLATIONS);
		}
		return securityViolations;
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
			case SecurityThreatsPackage.ATTACK__ATTACKER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttacker()).basicAdd(otherEnd, msgs);
			case SecurityThreatsPackage.ATTACK__PREREQUISITES:
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
			case SecurityThreatsPackage.ATTACK__ATTACKER:
				return ((InternalEList<?>)getAttacker()).basicRemove(otherEnd, msgs);
			case SecurityThreatsPackage.ATTACK__PREREQUISITES:
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
			case SecurityThreatsPackage.ATTACK__NAME:
				return getName();
			case SecurityThreatsPackage.ATTACK__DESCRIPTION:
				return getDescription();
			case SecurityThreatsPackage.ATTACK__ACTIVITY:
				return getActivity();
			case SecurityThreatsPackage.ATTACK__TIME_STAMP:
				return getTimeStamp();
			case SecurityThreatsPackage.ATTACK__SUB_ATTACKS:
				return getSubAttacks();
			case SecurityThreatsPackage.ATTACK__ATTACKER:
				return getAttacker();
			case SecurityThreatsPackage.ATTACK__PREREQUISITES:
				return getPrerequisites();
			case SecurityThreatsPackage.ATTACK__STEALTH:
				return getStealth();
			case SecurityThreatsPackage.ATTACK__SECURITY_VIOLATIONS:
				return getSecurityViolations();
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
			case SecurityThreatsPackage.ATTACK__NAME:
				setName((String)newValue);
				return;
			case SecurityThreatsPackage.ATTACK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SecurityThreatsPackage.ATTACK__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case SecurityThreatsPackage.ATTACK__TIME_STAMP:
				setTimeStamp((Date)newValue);
				return;
			case SecurityThreatsPackage.ATTACK__SUB_ATTACKS:
				getSubAttacks().clear();
				getSubAttacks().addAll((Collection<? extends Attack>)newValue);
				return;
			case SecurityThreatsPackage.ATTACK__ATTACKER:
				getAttacker().clear();
				getAttacker().addAll((Collection<? extends AttackerClass>)newValue);
				return;
			case SecurityThreatsPackage.ATTACK__PREREQUISITES:
				getPrerequisites().clear();
				getPrerequisites().addAll((Collection<? extends Prerequisite>)newValue);
				return;
			case SecurityThreatsPackage.ATTACK__STEALTH:
				setStealth((Stealth)newValue);
				return;
			case SecurityThreatsPackage.ATTACK__SECURITY_VIOLATIONS:
				getSecurityViolations().clear();
				getSecurityViolations().addAll((Collection<? extends SecurityViolation>)newValue);
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
			case SecurityThreatsPackage.ATTACK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecurityThreatsPackage.ATTACK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SecurityThreatsPackage.ATTACK__ACTIVITY:
				setActivity(ACTIVITY_EDEFAULT);
				return;
			case SecurityThreatsPackage.ATTACK__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case SecurityThreatsPackage.ATTACK__SUB_ATTACKS:
				getSubAttacks().clear();
				return;
			case SecurityThreatsPackage.ATTACK__ATTACKER:
				getAttacker().clear();
				return;
			case SecurityThreatsPackage.ATTACK__PREREQUISITES:
				getPrerequisites().clear();
				return;
			case SecurityThreatsPackage.ATTACK__STEALTH:
				setStealth(STEALTH_EDEFAULT);
				return;
			case SecurityThreatsPackage.ATTACK__SECURITY_VIOLATIONS:
				getSecurityViolations().clear();
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
			case SecurityThreatsPackage.ATTACK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecurityThreatsPackage.ATTACK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SecurityThreatsPackage.ATTACK__ACTIVITY:
				return activity != ACTIVITY_EDEFAULT;
			case SecurityThreatsPackage.ATTACK__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case SecurityThreatsPackage.ATTACK__SUB_ATTACKS:
				return subAttacks != null && !subAttacks.isEmpty();
			case SecurityThreatsPackage.ATTACK__ATTACKER:
				return attacker != null && !attacker.isEmpty();
			case SecurityThreatsPackage.ATTACK__PREREQUISITES:
				return prerequisites != null && !prerequisites.isEmpty();
			case SecurityThreatsPackage.ATTACK__STEALTH:
				return stealth != STEALTH_EDEFAULT;
			case SecurityThreatsPackage.ATTACK__SECURITY_VIOLATIONS:
				return securityViolations != null && !securityViolations.isEmpty();
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
		result.append(", activity: ");
		result.append(activity);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(", stealth: ");
		result.append(stealth);
		result.append(", securityViolations: ");
		result.append(securityViolations);
		result.append(')');
		return result.toString();
	}

} //AttackImpl
