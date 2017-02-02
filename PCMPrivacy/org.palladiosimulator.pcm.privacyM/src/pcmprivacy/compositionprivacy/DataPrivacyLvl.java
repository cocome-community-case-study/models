/**
 */
package pcmprivacy.compositionprivacy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Privacy Lvl</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pcmprivacy.compositionprivacy.CompositionprivacyPackage#getDataPrivacyLvl()
 * @model
 * @generated
 */
public enum DataPrivacyLvl implements Enumerator {
	/**
	 * The '<em><b>Personal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_VALUE
	 * @generated
	 * @ordered
	 */
	PERSONAL(0, "Personal", "Personal"),

	/**
	 * The '<em><b>Depersonalized</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPERSONALIZED_VALUE
	 * @generated
	 * @ordered
	 */
	DEPERSONALIZED(10, "Depersonalized", "Depersonalized"),

	/**
	 * The '<em><b>Anonymized</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANONYMIZED_VALUE
	 * @generated
	 * @ordered
	 */
	ANONYMIZED(20, "Anonymized", "Anonymized");

	/**
	 * The '<em><b>Personal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Personal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERSONAL
	 * @model name="Personal"
	 * @generated
	 * @ordered
	 */
	public static final int PERSONAL_VALUE = 0;

	/**
	 * The '<em><b>Depersonalized</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Depersonalized</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPERSONALIZED
	 * @model name="Depersonalized"
	 * @generated
	 * @ordered
	 */
	public static final int DEPERSONALIZED_VALUE = 10;

	/**
	 * The '<em><b>Anonymized</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Anonymized</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANONYMIZED
	 * @model name="Anonymized"
	 * @generated
	 * @ordered
	 */
	public static final int ANONYMIZED_VALUE = 20;

	/**
	 * An array of all the '<em><b>Data Privacy Lvl</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataPrivacyLvl[] VALUES_ARRAY =
		new DataPrivacyLvl[] {
			PERSONAL,
			DEPERSONALIZED,
			ANONYMIZED,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Privacy Lvl</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataPrivacyLvl> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Privacy Lvl</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataPrivacyLvl get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataPrivacyLvl result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Privacy Lvl</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataPrivacyLvl getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataPrivacyLvl result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Privacy Lvl</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataPrivacyLvl get(int value) {
		switch (value) {
			case PERSONAL_VALUE: return PERSONAL;
			case DEPERSONALIZED_VALUE: return DEPERSONALIZED;
			case ANONYMIZED_VALUE: return ANONYMIZED;
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
	private DataPrivacyLvl(int value, String name, String literal) {
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
	
} //DataPrivacyLvl
