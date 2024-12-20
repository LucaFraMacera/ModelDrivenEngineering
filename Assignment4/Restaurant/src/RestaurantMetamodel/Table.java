/**
 */
package RestaurantMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.Table#getNumber <em>Number</em>}</li>
 *   <li>{@link RestaurantMetamodel.Table#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link RestaurantMetamodel.Table#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getTable_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Table#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Seats</em>' attribute.
	 * @see #setNumberOfSeats(int)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getTable_NumberOfSeats()
	 * @model required="true"
	 * @generated
	 */
	int getNumberOfSeats();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Table#getNumberOfSeats <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Seats</em>' attribute.
	 * @see #getNumberOfSeats()
	 * @generated
	 */
	void setNumberOfSeats(int value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' attribute.
	 * The literals are from the enumeration {@link RestaurantMetamodel.Material}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' attribute.
	 * @see RestaurantMetamodel.Material
	 * @see #setMaterial(Material)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getTable_Material()
	 * @model required="true"
	 * @generated
	 */
	Material getMaterial();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Table#getMaterial <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' attribute.
	 * @see RestaurantMetamodel.Material
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(Material value);

} // Table
