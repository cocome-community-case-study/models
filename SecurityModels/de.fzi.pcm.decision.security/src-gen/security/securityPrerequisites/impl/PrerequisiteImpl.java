/**
 */
package security.securityPrerequisites.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import security.securityPatterns.SecurityPattern;
import security.securityPatterns.SecurityPatternsPackage;

import security.securityPrerequisites.Prerequisite;
import security.securityPrerequisites.SecurityPrerequisitesPackage;
import security.securityPrerequisites.Status;
import security.securityPrerequisites.TechnologyPrerequisite;

import security.securityThreats.Attack;
import security.securityThreats.SecurityThreatsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityPrerequisites.impl.PrerequisiteImpl#getName <em>Name</em>}</li>
 *   <li>{@link security.securityPrerequisites.impl.PrerequisiteImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link security.securityPrerequisites.impl.PrerequisiteImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link security.securityPrerequisites.impl.PrerequisiteImpl#isStatePositive <em>State Positive</em>}</li>
 *   <li>{@link security.securityPrerequisites.impl.PrerequisiteImpl#getSecurityPatterns <em>Security Patterns</em>}</li>
 *   <li>{@link security.securityPrerequisites.impl.PrerequisiteImpl#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link security.securityPrerequisites.impl.PrerequisiteImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link security.securityPrerequisites.impl.PrerequisiteImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link security.securityPrerequisites.impl.PrerequisiteImpl#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrerequisiteImpl extends IdentifierImpl implements Prerequisite {
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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.VALID;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatePositive() <em>State Positive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatePositive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATE_POSITIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isStatePositive() <em>State Positive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatePositive()
	 * @generated
	 * @ordered
	 */
	protected boolean statePositive = STATE_POSITIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecurityPatterns() <em>Security Patterns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityPattern> securityPatterns;

	/**
	 * The cached value of the '{@link #getAttacks() <em>Attacks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Attack> attacks;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Prerequisite> matches;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected EList<TechnologyPrerequisite> technology;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrerequisiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPrerequisitesPackage.Literals.PREREQUISITE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPrerequisitesPackage.PREREQUISITE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPrerequisitesPackage.PREREQUISITE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPrerequisitesPackage.PREREQUISITE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatePositive() {
		return statePositive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatePositive(boolean newStatePositive) {
		boolean oldStatePositive = statePositive;
		statePositive = newStatePositive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPrerequisitesPackage.PREREQUISITE__STATE_POSITIVE, oldStatePositive, statePositive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityPattern> getSecurityPatterns() {
		if (securityPatterns == null) {
			securityPatterns = new EObjectWithInverseResolvingEList.ManyInverse<SecurityPattern>(SecurityPattern.class, this, SecurityPrerequisitesPackage.PREREQUISITE__SECURITY_PATTERNS, SecurityPatternsPackage.SECURITY_PATTERN__PREREQUISITES);
		}
		return securityPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attack> getAttacks() {
		if (attacks == null) {
			attacks = new EObjectWithInverseResolvingEList.ManyInverse<Attack>(Attack.class, this, SecurityPrerequisitesPackage.PREREQUISITE__ATTACKS, SecurityThreatsPackage.ATTACK__PREREQUISITES);
		}
		return attacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prerequisite> getMatches() {
		if (matches == null) {
			matches = new EObjectResolvingEList<Prerequisite>(Prerequisite.class, this, SecurityPrerequisitesPackage.PREREQUISITE__MATCHES);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TechnologyPrerequisite> getTechnology() {
		if (technology == null) {
			technology = new EObjectWithInverseResolvingEList.ManyInverse<TechnologyPrerequisite>(TechnologyPrerequisite.class, this, SecurityPrerequisitesPackage.PREREQUISITE__TECHNOLOGY, SecurityPrerequisitesPackage.TECHNOLOGY_PREREQUISITE__DEPENDS);
		}
		return technology;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPrerequisitesPackage.PREREQUISITE__TIME_STAMP, oldTimeStamp, timeStamp));
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
			case SecurityPrerequisitesPackage.PREREQUISITE__SECURITY_PATTERNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecurityPatterns()).basicAdd(otherEnd, msgs);
			case SecurityPrerequisitesPackage.PREREQUISITE__ATTACKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttacks()).basicAdd(otherEnd, msgs);
			case SecurityPrerequisitesPackage.PREREQUISITE__TECHNOLOGY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTechnology()).basicAdd(otherEnd, msgs);
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
			case SecurityPrerequisitesPackage.PREREQUISITE__SECURITY_PATTERNS:
				return ((InternalEList<?>)getSecurityPatterns()).basicRemove(otherEnd, msgs);
			case SecurityPrerequisitesPackage.PREREQUISITE__ATTACKS:
				return ((InternalEList<?>)getAttacks()).basicRemove(otherEnd, msgs);
			case SecurityPrerequisitesPackage.PREREQUISITE__TECHNOLOGY:
				return ((InternalEList<?>)getTechnology()).basicRemove(otherEnd, msgs);
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
			case SecurityPrerequisitesPackage.PREREQUISITE__NAME:
				return getName();
			case SecurityPrerequisitesPackage.PREREQUISITE__DESCRIPTION:
				return getDescription();
			case SecurityPrerequisitesPackage.PREREQUISITE__STATUS:
				return getStatus();
			case SecurityPrerequisitesPackage.PREREQUISITE__STATE_POSITIVE:
				return isStatePositive();
			case SecurityPrerequisitesPackage.PREREQUISITE__SECURITY_PATTERNS:
				return getSecurityPatterns();
			case SecurityPrerequisitesPackage.PREREQUISITE__ATTACKS:
				return getAttacks();
			case SecurityPrerequisitesPackage.PREREQUISITE__MATCHES:
				return getMatches();
			case SecurityPrerequisitesPackage.PREREQUISITE__TECHNOLOGY:
				return getTechnology();
			case SecurityPrerequisitesPackage.PREREQUISITE__TIME_STAMP:
				return getTimeStamp();
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
			case SecurityPrerequisitesPackage.PREREQUISITE__NAME:
				setName((String)newValue);
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__STATUS:
				setStatus((Status)newValue);
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__STATE_POSITIVE:
				setStatePositive((Boolean)newValue);
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__SECURITY_PATTERNS:
				getSecurityPatterns().clear();
				getSecurityPatterns().addAll((Collection<? extends SecurityPattern>)newValue);
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__ATTACKS:
				getAttacks().clear();
				getAttacks().addAll((Collection<? extends Attack>)newValue);
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Prerequisite>)newValue);
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__TECHNOLOGY:
				getTechnology().clear();
				getTechnology().addAll((Collection<? extends TechnologyPrerequisite>)newValue);
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__TIME_STAMP:
				setTimeStamp((Date)newValue);
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
			case SecurityPrerequisitesPackage.PREREQUISITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__STATE_POSITIVE:
				setStatePositive(STATE_POSITIVE_EDEFAULT);
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__SECURITY_PATTERNS:
				getSecurityPatterns().clear();
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__ATTACKS:
				getAttacks().clear();
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__MATCHES:
				getMatches().clear();
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__TECHNOLOGY:
				getTechnology().clear();
				return;
			case SecurityPrerequisitesPackage.PREREQUISITE__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
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
			case SecurityPrerequisitesPackage.PREREQUISITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecurityPrerequisitesPackage.PREREQUISITE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SecurityPrerequisitesPackage.PREREQUISITE__STATUS:
				return status != STATUS_EDEFAULT;
			case SecurityPrerequisitesPackage.PREREQUISITE__STATE_POSITIVE:
				return statePositive != STATE_POSITIVE_EDEFAULT;
			case SecurityPrerequisitesPackage.PREREQUISITE__SECURITY_PATTERNS:
				return securityPatterns != null && !securityPatterns.isEmpty();
			case SecurityPrerequisitesPackage.PREREQUISITE__ATTACKS:
				return attacks != null && !attacks.isEmpty();
			case SecurityPrerequisitesPackage.PREREQUISITE__MATCHES:
				return matches != null && !matches.isEmpty();
			case SecurityPrerequisitesPackage.PREREQUISITE__TECHNOLOGY:
				return technology != null && !technology.isEmpty();
			case SecurityPrerequisitesPackage.PREREQUISITE__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
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
		result.append(", status: ");
		result.append(status);
		result.append(", statePositive: ");
		result.append(statePositive);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(')');
		return result.toString();
	}

} //PrerequisiteImpl
