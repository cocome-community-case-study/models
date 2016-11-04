/**
 */
package security.securityThreats.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Security Violation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see security.securityThreats.enums.EnumsPackage#getSecurityViolation()
 * @model
 * @generated
 */
public enum SecurityViolation implements Enumerator {
	/**
	 * The '<em><b>UNDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "UNDEFINED", "UNDEFINED"),

	/**
	 * The '<em><b>CONFIDENTIALITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIDENTIALITY(1, "CONFIDENTIALITY", "CONFIDENTIALITY"),

	/**
	 * The '<em><b>INTEGRITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRITY_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRITY(2, "INTEGRITY", "INTEGRITY"),

	/**
	 * The '<em><b>AVAILABILITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILABILITY(3, "AVAILABILITY", "AVAILABILITY"),

	/**
	 * The '<em><b>AUTHENTICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATION_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHENTICATION(4, "AUTHENTICATION", "AUTHENTICATION"),

	/**
	 * The '<em><b>NONREPUDIATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONREPUDIATION_VALUE
	 * @generated
	 * @ordered
	 */
	NONREPUDIATION(5, "NONREPUDIATION", "NONREPUDIATION");

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>CONFIDENTIALITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFIDENTIALITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFIDENTIALITY_VALUE = 1;

	/**
	 * The '<em><b>INTEGRITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTEGRITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGRITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRITY_VALUE = 2;

	/**
	 * The '<em><b>AVAILABILITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AVAILABILITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVAILABILITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVAILABILITY_VALUE = 3;

	/**
	 * The '<em><b>AUTHENTICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTHENTICATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTHENTICATION_VALUE = 4;

	/**
	 * The '<em><b>NONREPUDIATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONREPUDIATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONREPUDIATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONREPUDIATION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Security Violation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SecurityViolation[] VALUES_ARRAY =
		new SecurityViolation[] {
			UNDEFINED,
			CONFIDENTIALITY,
			INTEGRITY,
			AVAILABILITY,
			AUTHENTICATION,
			NONREPUDIATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Security Violation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SecurityViolation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Security Violation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityViolation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityViolation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Violation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityViolation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityViolation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Violation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityViolation get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case CONFIDENTIALITY_VALUE: return CONFIDENTIALITY;
			case INTEGRITY_VALUE: return INTEGRITY;
			case AVAILABILITY_VALUE: return AVAILABILITY;
			case AUTHENTICATION_VALUE: return AUTHENTICATION;
			case NONREPUDIATION_VALUE: return NONREPUDIATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SecurityViolation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SecurityViolation
