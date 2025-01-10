/**
 */
package RestaurantMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restaurant Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.RestaurantArea#getPerimeter <em>Perimeter</em>}</li>
 *   <li>{@link RestaurantMetamodel.RestaurantArea#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRestaurantArea()
 * @model
 * @generated
 */
public interface RestaurantArea extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Perimeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perimeter</em>' attribute.
	 * @see #setPerimeter(float)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRestaurantArea_Perimeter()
	 * @model required="true"
	 * @generated
	 */
	float getPerimeter();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.RestaurantArea#getPerimeter <em>Perimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perimeter</em>' attribute.
	 * @see #getPerimeter()
	 * @generated
	 */
	void setPerimeter(float value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see #setArea(float)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getRestaurantArea_Area()
	 * @model required="true"
	 * @generated
	 */
	float getArea();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.RestaurantArea#getArea <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' attribute.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(float value);

} // RestaurantArea
