/**
 */
package security.securityPatterns.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import security.securityPatterns.ContainerRole;
import security.securityPatterns.SecurityPatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.impl.ContainerRoleImpl#getResourceContainer <em>Resource Container</em>}</li>
 *   <li>{@link security.securityPatterns.impl.ContainerRoleImpl#getProcessingResourceSpecification <em>Processing Resource Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerRoleImpl extends RoleImpl implements ContainerRole {
	/**
	 * The cached value of the '{@link #getResourceContainer() <em>Resource Container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceContainer> resourceContainer;

	/**
	 * The cached value of the '{@link #getProcessingResourceSpecification() <em>Processing Resource Specification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingResourceSpecification> processingResourceSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPatternsPackage.Literals.CONTAINER_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceContainer> getResourceContainer() {
		if (resourceContainer == null) {
			resourceContainer = new EObjectResolvingEList<ResourceContainer>(ResourceContainer.class, this, SecurityPatternsPackage.CONTAINER_ROLE__RESOURCE_CONTAINER);
		}
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessingResourceSpecification> getProcessingResourceSpecification() {
		if (processingResourceSpecification == null) {
			processingResourceSpecification = new EObjectResolvingEList<ProcessingResourceSpecification>(ProcessingResourceSpecification.class, this, SecurityPatternsPackage.CONTAINER_ROLE__PROCESSING_RESOURCE_SPECIFICATION);
		}
		return processingResourceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPatternsPackage.CONTAINER_ROLE__RESOURCE_CONTAINER:
				return getResourceContainer();
			case SecurityPatternsPackage.CONTAINER_ROLE__PROCESSING_RESOURCE_SPECIFICATION:
				return getProcessingResourceSpecification();
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
			case SecurityPatternsPackage.CONTAINER_ROLE__RESOURCE_CONTAINER:
				getResourceContainer().clear();
				getResourceContainer().addAll((Collection<? extends ResourceContainer>)newValue);
				return;
			case SecurityPatternsPackage.CONTAINER_ROLE__PROCESSING_RESOURCE_SPECIFICATION:
				getProcessingResourceSpecification().clear();
				getProcessingResourceSpecification().addAll((Collection<? extends ProcessingResourceSpecification>)newValue);
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
			case SecurityPatternsPackage.CONTAINER_ROLE__RESOURCE_CONTAINER:
				getResourceContainer().clear();
				return;
			case SecurityPatternsPackage.CONTAINER_ROLE__PROCESSING_RESOURCE_SPECIFICATION:
				getProcessingResourceSpecification().clear();
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
			case SecurityPatternsPackage.CONTAINER_ROLE__RESOURCE_CONTAINER:
				return resourceContainer != null && !resourceContainer.isEmpty();
			case SecurityPatternsPackage.CONTAINER_ROLE__PROCESSING_RESOURCE_SPECIFICATION:
				return processingResourceSpecification != null && !processingResourceSpecification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerRoleImpl
