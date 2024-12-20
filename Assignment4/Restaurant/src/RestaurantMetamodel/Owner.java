/**
 */
package RestaurantMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.Owner#getVat <em>Vat</em>}</li>
 * </ul>
 *
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getOwner()
 * @model
 * @generated
 */
public interface Owner extends Person {
	/**
	 * Returns the value of the '<em><b>Vat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vat</em>' attribute.
	 * @see #setVat(String)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getOwner_Vat()
	 * @model required="true"
	 * @generated
	 */
	String getVat();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Owner#getVat <em>Vat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vat</em>' attribute.
	 * @see #getVat()
	 * @generated
	 */
	void setVat(String value);

} // Owner
