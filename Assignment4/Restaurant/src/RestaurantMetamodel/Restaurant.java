/**
 */
package RestaurantMetamodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.Restaurant#getStreet <em>Street</em>}</li>
 *   <li>{@link RestaurantMetamodel.Restaurant#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link RestaurantMetamodel.Restaurant#getCity <em>City</em>}</li>
 *   <li>{@link RestaurantMetamodel.Restaurant#getRooms <em>Rooms</em>}</li>
 *   <li>{@link RestaurantMetamodel.Restaurant#getOwners <em>Owners</em>}</li>
 *   <li>{@link RestaurantMetamodel.Restaurant#getEmployees <em>Employees</em>}</li>
 *   <li>{@link RestaurantMetamodel.Restaurant#getMenus <em>Menus</em>}</li>
 * </ul>
 *
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRestaurant()
 * @model
 * @generated
 */
public interface Restaurant extends DiagramElement {

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRestaurant_Street()
	 * @model required="true"
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Restaurant#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone</em>' attribute.
	 * @see #setTelephone(String)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRestaurant_Telephone()
	 * @model required="true"
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Restaurant#getTelephone <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone</em>' attribute.
	 * @see #getTelephone()
	 * @generated
	 */
	void setTelephone(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' reference.
	 * @see #setCity(City)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRestaurant_City()
	 * @model required="true"
	 * @generated
	 */
	City getCity();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Restaurant#getCity <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(City value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link RestaurantMetamodel.RestaurantArea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRestaurant_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<RestaurantArea> getRooms();

	/**
	 * Returns the value of the '<em><b>Owners</b></em>' containment reference list.
	 * The list contents are of type {@link RestaurantMetamodel.Owner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owners</em>' containment reference list.
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRestaurant_Owners()
	 * @model containment="true"
	 * @generated
	 */
	EList<Owner> getOwners();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link RestaurantMetamodel.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRestaurant_Employees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
	 * The list contents are of type {@link RestaurantMetamodel.Menu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus</em>' containment reference list.
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRestaurant_Menus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenus();
} // Restaurant
