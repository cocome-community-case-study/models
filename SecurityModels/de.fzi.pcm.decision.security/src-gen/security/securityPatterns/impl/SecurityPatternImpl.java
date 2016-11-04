/**
 */
package security.securityPatterns.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import security.securityPatterns.Role;
import security.securityPatterns.SecurityPattern;
import security.securityPatterns.SecurityPatternsPackage;
import security.securityPatterns.Status;

import security.securityPrerequisites.Prerequisite;
import security.securityPrerequisites.SecurityPrerequisitesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.impl.SecurityPatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link security.securityPatterns.impl.SecurityPatternImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link security.securityPatterns.impl.SecurityPatternImpl#getStakeholder <em>Stakeholder</em>}</li>
 *   <li>{@link security.securityPatterns.impl.SecurityPatternImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link security.securityPatterns.impl.SecurityPatternImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link security.securityPatterns.impl.SecurityPatternImpl#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link security.securityPatterns.impl.SecurityPatternImpl#getSubSecurityPatterns <em>Sub Security Patterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityPatternImpl extends IdentifierImpl implements SecurityPattern {
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
	 * The default value of the '{@link #getStakeholder() <em>Stakeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholder()
	 * @generated
	 * @ordered
	 */
	protected static final String STAKEHOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStakeholder() <em>Stakeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholder()
	 * @generated
	 * @ordered
	 */
	protected String stakeholder = STAKEHOLDER_EDEFAULT;

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
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

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
	 * The cached value of the '{@link #getSubSecurityPatterns() <em>Sub Security Patterns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSecurityPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityPattern> subSecurityPatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPatternsPackage.Literals.SECURITY_PATTERN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPatternsPackage.SECURITY_PATTERN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPatternsPackage.SECURITY_PATTERN__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStakeholder() {
		return stakeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStakeholder(String newStakeholder) {
		String oldStakeholder = stakeholder;
		stakeholder = newStakeholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPatternsPackage.SECURITY_PATTERN__STAKEHOLDER, oldStakeholder, stakeholder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPatternsPackage.SECURITY_PATTERN__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, SecurityPatternsPackage.SECURITY_PATTERN__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prerequisite> getPrerequisites() {
		if (prerequisites == null) {
			prerequisites = new EObjectWithInverseResolvingEList.ManyInverse<Prerequisite>(Prerequisite.class, this, SecurityPatternsPackage.SECURITY_PATTERN__PREREQUISITES, SecurityPrerequisitesPackage.PREREQUISITE__SECURITY_PATTERNS);
		}
		return prerequisites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityPattern> getSubSecurityPatterns() {
		if (subSecurityPatterns == null) {
			subSecurityPatterns = new EObjectResolvingEList<SecurityPattern>(SecurityPattern.class, this, SecurityPatternsPackage.SECURITY_PATTERN__SUB_SECURITY_PATTERNS);
		}
		return subSecurityPatterns;
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
			case SecurityPatternsPackage.SECURITY_PATTERN__PREREQUISITES:
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
			case SecurityPatternsPackage.SECURITY_PATTERN__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case SecurityPatternsPackage.SECURITY_PATTERN__PREREQUISITES:
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
			case SecurityPatternsPackage.SECURITY_PATTERN__NAME:
				return getName();
			case SecurityPatternsPackage.SECURITY_PATTERN__DESCRIPTION:
				return getDescription();
			case SecurityPatternsPackage.SECURITY_PATTERN__STAKEHOLDER:
				return getStakeholder();
			case SecurityPatternsPackage.SECURITY_PATTERN__STATUS:
				return getStatus();
			case SecurityPatternsPackage.SECURITY_PATTERN__ROLES:
				return getRoles();
			case SecurityPatternsPackage.SECURITY_PATTERN__PREREQUISITES:
				return getPrerequisites();
			case SecurityPatternsPackage.SECURITY_PATTERN__SUB_SECURITY_PATTERNS:
				return getSubSecurityPatterns();
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
			case SecurityPatternsPackage.SECURITY_PATTERN__NAME:
				setName((String)newValue);
				return;
			case SecurityPatternsPackage.SECURITY_PATTERN__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SecurityPatternsPackage.SECURITY_PATTERN__STAKEHOLDER:
				setStakeholder((String)newValue);
				return;
			case SecurityPatternsPackage.SECURITY_PATTERN__STATUS:
				setStatus((Status)newValue);
				return;
			case SecurityPatternsPackage.SECURITY_PATTERN__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case SecurityPatternsPackage.SECURITY_PATTERN__PREREQUISITES:
				getPrerequisites().clear();
				getPrerequisites().addAll((Collection<? extends Prerequisite>)newValue);
				return;
			case SecurityPatternsPackage.SECURITY_PATTERN__SUB_SECURITY_PATTERNS:
				getSubSecurityPatterns().clear();
				getSubSecurityPatterns().addAll((Collection<? extends SecurityPattern>)newValue);
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
			case SecurityPatternsPackage.SECURITY_PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecurityPatternsPackage.SECURITY_PATTERN__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SecurityPatternsPackage.SECURITY_PATTERN__STAKEHOLDER:
				setStakeholder(STAKEHOLDER_EDEFAULT);
				return;
			case SecurityPatternsPackage.SECURITY_PATTERN__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case SecurityPatternsPackage.SECURITY_PATTERN__ROLES:
				getRoles().clear();
				return;
			case SecurityPatternsPackage.SECURITY_PATTERN__PREREQUISITES:
				getPrerequisites().clear();
				return;
			case SecurityPatternsPackage.SECURITY_PATTERN__SUB_SECURITY_PATTERNS:
				getSubSecurityPatterns().clear();
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
			case SecurityPatternsPackage.SECURITY_PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecurityPatternsPackage.SECURITY_PATTERN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SecurityPatternsPackage.SECURITY_PATTERN__STAKEHOLDER:
				return STAKEHOLDER_EDEFAULT == null ? stakeholder != null : !STAKEHOLDER_EDEFAULT.equals(stakeholder);
			case SecurityPatternsPackage.SECURITY_PATTERN__STATUS:
				return status != STATUS_EDEFAULT;
			case SecurityPatternsPackage.SECURITY_PATTERN__ROLES:
				return roles != null && !roles.isEmpty();
			case SecurityPatternsPackage.SECURITY_PATTERN__PREREQUISITES:
				return prerequisites != null && !prerequisites.isEmpty();
			case SecurityPatternsPackage.SECURITY_PATTERN__SUB_SECURITY_PATTERNS:
				return subSecurityPatterns != null && !subSecurityPatterns.isEmpty();
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
		result.append(", stakeholder: ");
		result.append(stakeholder);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //SecurityPatternImpl
