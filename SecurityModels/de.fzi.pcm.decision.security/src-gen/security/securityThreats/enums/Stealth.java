/**
 */
package security.securityThreats.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stealth</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see security.securityThreats.enums.EnumsPackage#getStealth()
 * @model
 * @generated
 */
public enum Stealth implements Enumerator {
	/**
	 * The '<em><b>NONSTEALTHY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONSTEALTHY_VALUE
	 * @generated
	 * @ordered
	 */
	NONSTEALTHY(0, "NONSTEALTHY", "NONSTEALTHY"),

	/**
	 * The '<em><b>STEALTHY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEALTHY_VALUE
	 * @generated
	 * @ordered
	 */
	STEALTHY(1, "STEALTHY", "STEALTHY");

	/**
	 * The '<em><b>NONSTEALTHY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONSTEALTHY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONSTEALTHY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONSTEALTHY_VALUE = 0;

	/**
	 * The '<em><b>STEALTHY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STEALTHY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEALTHY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STEALTHY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Stealth</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Stealth[] VALUES_ARRAY =
		new Stealth[] {
			NONSTEALTHY,
			STEALTHY,
		};

	/**
	 * A public read-only list of all the '<em><b>Stealth</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Stealth> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Stealth</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Stealth get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Stealth result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stealth</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Stealth getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Stealth result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stealth</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Stealth get(int value) {
		switch (value) {
			case NONSTEALTHY_VALUE: return NONSTEALTHY;
			case STEALTHY_VALUE: return STEALTHY;
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
	private Stealth(int value, String name, String literal) {
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
	
} //Stealth
