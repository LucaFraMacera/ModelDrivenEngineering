/**
 */
package RestaurantMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRole()
 * @model
 * @generated
 */
public enum Role implements Enumerator {
	/**
	 * The '<em><b>Chef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEF_VALUE
	 * @generated
	 * @ordered
	 */
	CHEF(0, "Chef", "Chef"),

	/**
	 * The '<em><b>Sous Chef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUS_CHEF_VALUE
	 * @generated
	 * @ordered
	 */
	SOUS_CHEF(1, "SousChef", "SousChef"),

	/**
	 * The '<em><b>Waiter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAITER_VALUE
	 * @generated
	 * @ordered
	 */
	WAITER(2, "Waiter", "Waiter"),

	/**
	 * The '<em><b>Cashier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASHIER_VALUE
	 * @generated
	 * @ordered
	 */
	CASHIER(3, "Cashier", "Cashier"),

	/**
	 * The '<em><b>Head Waiter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_WAITER_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_WAITER(4, "HeadWaiter", "HeadWaiter"),

	/**
	 * The '<em><b>Head Chef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_CHEF_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_CHEF(5, "HeadChef", "HeadChef");

	/**
	 * The '<em><b>Chef</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEF
	 * @model name="Chef"
	 * @generated
	 * @ordered
	 */
	public static final int CHEF_VALUE = 0;

	/**
	 * The '<em><b>Sous Chef</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUS_CHEF
	 * @model name="SousChef"
	 * @generated
	 * @ordered
	 */
	public static final int SOUS_CHEF_VALUE = 1;

	/**
	 * The '<em><b>Waiter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAITER
	 * @model name="Waiter"
	 * @generated
	 * @ordered
	 */
	public static final int WAITER_VALUE = 2;

	/**
	 * The '<em><b>Cashier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASHIER
	 * @model name="Cashier"
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_VALUE = 3;

	/**
	 * The '<em><b>Head Waiter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_WAITER
	 * @model name="HeadWaiter"
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_WAITER_VALUE = 4;

	/**
	 * The '<em><b>Head Chef</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_CHEF
	 * @model name="HeadChef"
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_CHEF_VALUE = 5;

	/**
	 * An array of all the '<em><b>Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Role[] VALUES_ARRAY =
		new Role[] {
			CHEF,
			SOUS_CHEF,
			WAITER,
			CASHIER,
			HEAD_WAITER,
			HEAD_CHEF,
		};

	/**
	 * A public read-only list of all the '<em><b>Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Role> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Role result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Role result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role get(int value) {
		switch (value) {
			case CHEF_VALUE: return CHEF;
			case SOUS_CHEF_VALUE: return SOUS_CHEF;
			case WAITER_VALUE: return WAITER;
			case CASHIER_VALUE: return CASHIER;
			case HEAD_WAITER_VALUE: return HEAD_WAITER;
			case HEAD_CHEF_VALUE: return HEAD_CHEF;
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
	private Role(int value, String name, String literal) {
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
	
} //Role
