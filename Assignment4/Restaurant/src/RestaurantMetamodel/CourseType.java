/**
 */
package RestaurantMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Course Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getCourseType()
 * @model
 * @generated
 */
public enum CourseType implements Enumerator {
	/**
	 * The '<em><b>Fried</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIED_VALUE
	 * @generated
	 * @ordered
	 */
	FRIED(0, "Fried", "Fried"),

	/**
	 * The '<em><b>Pizza</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIZZA_VALUE
	 * @generated
	 * @ordered
	 */
	PIZZA(1, "Pizza", "Pizza"),

	/**
	 * The '<em><b>Main Dish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAIN_DISH_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN_DISH(2, "MainDish", "MainDish"),

	/**
	 * The '<em><b>Nigiri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIGIRI_VALUE
	 * @generated
	 * @ordered
	 */
	NIGIRI(3, "Nigiri", "Nigiri"),

	/**
	 * The '<em><b>Dessert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESSERT_VALUE
	 * @generated
	 * @ordered
	 */
	DESSERT(4, "Dessert", "Dessert"),

	/**
	 * The '<em><b>Appetizer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPETIZER_VALUE
	 * @generated
	 * @ordered
	 */
	APPETIZER(5, "Appetizer", "Appetizer");

	/**
	 * The '<em><b>Fried</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIED
	 * @model name="Fried"
	 * @generated
	 * @ordered
	 */
	public static final int FRIED_VALUE = 0;

	/**
	 * The '<em><b>Pizza</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIZZA
	 * @model name="Pizza"
	 * @generated
	 * @ordered
	 */
	public static final int PIZZA_VALUE = 1;

	/**
	 * The '<em><b>Main Dish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAIN_DISH
	 * @model name="MainDish"
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_DISH_VALUE = 2;

	/**
	 * The '<em><b>Nigiri</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIGIRI
	 * @model name="Nigiri"
	 * @generated
	 * @ordered
	 */
	public static final int NIGIRI_VALUE = 3;

	/**
	 * The '<em><b>Dessert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESSERT
	 * @model name="Dessert"
	 * @generated
	 * @ordered
	 */
	public static final int DESSERT_VALUE = 4;

	/**
	 * The '<em><b>Appetizer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPETIZER
	 * @model name="Appetizer"
	 * @generated
	 * @ordered
	 */
	public static final int APPETIZER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Course Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CourseType[] VALUES_ARRAY =
		new CourseType[] {
			FRIED,
			PIZZA,
			MAIN_DISH,
			NIGIRI,
			DESSERT,
			APPETIZER,
		};

	/**
	 * A public read-only list of all the '<em><b>Course Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CourseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Course Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseType get(int value) {
		switch (value) {
			case FRIED_VALUE: return FRIED;
			case PIZZA_VALUE: return PIZZA;
			case MAIN_DISH_VALUE: return MAIN_DISH;
			case NIGIRI_VALUE: return NIGIRI;
			case DESSERT_VALUE: return DESSERT;
			case APPETIZER_VALUE: return APPETIZER;
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
	private CourseType(int value, String name, String literal) {
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
	
} //CourseType
