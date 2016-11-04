/**
 */
package security.securityPatterns;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.securityPatterns.ContainerRole#getResourceContainer <em>Resource Container</em>}</li>
 *   <li>{@link security.securityPatterns.ContainerRole#getProcessingResourceSpecification <em>Processing Resource Specification</em>}</li>
 * </ul>
 *
 * @see security.securityPatterns.SecurityPatternsPackage#getContainerRole()
 * @model
 * @generated
 */
public interface ContainerRole extends Role {
	/**
	 * Returns the value of the '<em><b>Resource Container</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.resourceenvironment.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Container</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container</em>' reference list.
	 * @see security.securityPatterns.SecurityPatternsPackage#getContainerRole_ResourceContainer()
	 * @model required="true"
	 * @generated
	 */
	EList<ResourceContainer> getResourceContainer();

	/**
	 * Returns the value of the '<em><b>Processing Resource Specification</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Resource Specification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Resource Specification</em>' reference list.
	 * @see security.securityPatterns.SecurityPatternsPackage#getContainerRole_ProcessingResourceSpecification()
	 * @model
	 * @generated
	 */
	EList<ProcessingResourceSpecification> getProcessingResourceSpecification();

} // ContainerRole
