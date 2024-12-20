/**
 */
package RestaurantMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bathroom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.Bathroom#getNumberOfToilets <em>Number Of Toilets</em>}</li>
 *   <li>{@link RestaurantMetamodel.Bathroom#getGender <em>Gender</em>}</li>
 *   <li>{@link RestaurantMetamodel.Bathroom#isIsAccessible <em>Is Accessible</em>}</li>
 * </ul>
 *
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getBathroom()
 * @model
 * @generated
 */
public interface Bathroom extends RestaurantArea {
	/**
	 * Returns the value of the '<em><b>Number Of Toilets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Toilets</em>' attribute.
	 * @see #setNumberOfToilets(int)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getBathroom_NumberOfToilets()
	 * @model required="true"
	 * @generated
	 */
	int getNumberOfToilets();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Bathroom#getNumberOfToilets <em>Number Of Toilets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Toilets</em>' attribute.
	 * @see #getNumberOfToilets()
	 * @generated
	 */
	void setNumberOfToilets(int value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link RestaurantMetamodel.Gender}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see RestaurantMetamodel.Gender
	 * @see #setGender(Gender)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getBathroom_Gender()
	 * @model required="true"
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Bathroom#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see RestaurantMetamodel.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Returns the value of the '<em><b>Is Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Accessible</em>' attribute.
	 * @see #setIsAccessible(boolean)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getBathroom_IsAccessible()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsAccessible();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Bathroom#isIsAccessible <em>Is Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Accessible</em>' attribute.
	 * @see #isIsAccessible()
	 * @generated
	 */
	void setIsAccessible(boolean value);

} // Bathroom
