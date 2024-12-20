/**
 */
package RestaurantMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kitchen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.Kitchen#getNumberOfStoves <em>Number Of Stoves</em>}</li>
 * </ul>
 *
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getKitchen()
 * @model
 * @generated
 */
public interface Kitchen extends RestaurantArea {
	/**
	 * Returns the value of the '<em><b>Number Of Stoves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Stoves</em>' attribute.
	 * @see #setNumberOfStoves(int)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getKitchen_NumberOfStoves()
	 * @model
	 * @generated
	 */
	int getNumberOfStoves();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Kitchen#getNumberOfStoves <em>Number Of Stoves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Stoves</em>' attribute.
	 * @see #getNumberOfStoves()
	 * @generated
	 */
	void setNumberOfStoves(int value);

} // Kitchen
