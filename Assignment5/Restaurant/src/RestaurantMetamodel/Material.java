/**
 */
package RestaurantMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Material</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getMaterial()
 * @model
 * @generated
 */
public enum Material implements Enumerator {
	/**
	 * The '<em><b>Wood</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WOOD_VALUE
	 * @generated
	 * @ordered
	 */
	WOOD(0, "Wood", "Wood"),

	/**
	 * The '<em><b>Plastic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLASTIC_VALUE
	 * @generated
	 * @ordered
	 */
	PLASTIC(1, "Plastic", "Plastic"),

	/**
	 * The '<em><b>Glass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLASS_VALUE
	 * @generated
	 * @ordered
	 */
	GLASS(2, "Glass", "Glass"),

	/**
	 * The '<em><b>Plexiglass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLEXIGLASS_VALUE
	 * @generated
	 * @ordered
	 */
	PLEXIGLASS(3, "Plexiglass", "Plexiglass"),

	/**
	 * The '<em><b>Aluminium</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALUMINIUM_VALUE
	 * @generated
	 * @ordered
	 */
	ALUMINIUM(4, "Aluminium", "Aluminium");

	/**
	 * The '<em><b>Wood</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WOOD
	 * @model name="Wood"
	 * @generated
	 * @ordered
	 */
	public static final int WOOD_VALUE = 0;

	/**
	 * The '<em><b>Plastic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLASTIC
	 * @model name="Plastic"
	 * @generated
	 * @ordered
	 */
	public static final int PLASTIC_VALUE = 1;

	/**
	 * The '<em><b>Glass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLASS
	 * @model name="Glass"
	 * @generated
	 * @ordered
	 */
	public static final int GLASS_VALUE = 2;

	/**
	 * The '<em><b>Plexiglass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLEXIGLASS
	 * @model name="Plexiglass"
	 * @generated
	 * @ordered
	 */
	public static final int PLEXIGLASS_VALUE = 3;

	/**
	 * The '<em><b>Aluminium</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALUMINIUM
	 * @model name="Aluminium"
	 * @generated
	 * @ordered
	 */
	public static final int ALUMINIUM_VALUE = 4;

	/**
	 * An array of all the '<em><b>Material</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Material[] VALUES_ARRAY =
		new Material[] {
			WOOD,
			PLASTIC,
			GLASS,
			PLEXIGLASS,
			ALUMINIUM,
		};

	/**
	 * A public read-only list of all the '<em><b>Material</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Material> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Material</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Material get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Material result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Material</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Material getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Material result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Material</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Material get(int value) {
		switch (value) {
			case WOOD_VALUE: return WOOD;
			case PLASTIC_VALUE: return PLASTIC;
			case GLASS_VALUE: return GLASS;
			case PLEXIGLASS_VALUE: return PLEXIGLASS;
			case ALUMINIUM_VALUE: return ALUMINIUM;
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
	private Material(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //Material
