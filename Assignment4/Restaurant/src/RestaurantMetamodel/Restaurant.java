/**
 */
package RestaurantMetamodel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link RestaurantMetamodel.Restaurant#getNumberOfEmployes <em>Number Of Employes</em>}</li>
 *   <li>{@link RestaurantMetamodel.Restaurant#getTotalArea <em>Total Area</em>}</li>
 * </ul>
 *
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRestaurant()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MustBeOwned'"
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

	/**
	 * Returns the value of the '<em><b>Number Of Employes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Employes</em>' attribute.
	 * @see #setNumberOfEmployes(int)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRestaurant_NumberOfEmployes()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getNumberOfEmployes();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Restaurant#getNumberOfEmployes <em>Number Of Employes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Employes</em>' attribute.
	 * @see #getNumberOfEmployes()
	 * @generated
	 */
	void setNumberOfEmployes(int value);

	/**
	 * Returns the value of the '<em><b>Total Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Area</em>' attribute.
	 * @see #setTotalArea(float)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRestaurant_TotalArea()
	 * @model required="true" derived="true"
	 * @generated
	 */
	float getTotalArea();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Restaurant#getTotalArea <em>Total Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Area</em>' attribute.
	 * @see #getTotalArea()
	 * @generated
	 */
	void setTotalArea(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='rooms-&gt;selectByType(Bathroom)-&gt;select(b | b.isAccessible)-&gt;size() &gt; 0'"
	 * @generated
	 */
	boolean hasAccessibleToilets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\towners-&gt;size() &gt; 0'"
	 * @generated
	 */
	boolean MustBeOwned(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Restaurant
