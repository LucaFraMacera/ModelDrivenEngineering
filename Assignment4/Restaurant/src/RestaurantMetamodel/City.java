/**
 */
package RestaurantMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.City#getCap <em>Cap</em>}</li>
 *   <li>{@link RestaurantMetamodel.City#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getCity()
 * @model
 * @generated
 */
public interface City extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap</em>' attribute.
	 * @see #setCap(String)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getCity_Cap()
	 * @model required="true"
	 * @generated
	 */
	String getCap();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.City#getCap <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap</em>' attribute.
	 * @see #getCap()
	 * @generated
	 */
	void setCap(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(Region)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getCity_Region()
	 * @model required="true"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.City#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

} // City
