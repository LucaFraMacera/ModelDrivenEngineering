/**
 */
package RestaurantMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dining Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.DiningRoom#getTables <em>Tables</em>}</li>
 *   <li>{@link RestaurantMetamodel.DiningRoom#getNumberOfTables <em>Number Of Tables</em>}</li>
 * </ul>
 *
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getDiningRoom()
 * @model
 * @generated
 */
public interface DiningRoom extends RestaurantArea {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link RestaurantMetamodel.Table}.
	 * It is bidirectional and its opposite is '{@link RestaurantMetamodel.Table#getDiningRoom <em>Dining Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getDiningRoom_Tables()
	 * @see RestaurantMetamodel.Table#getDiningRoom
	 * @model opposite="diningRoom" containment="true"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Number Of Tables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Tables</em>' attribute.
	 * @see #setNumberOfTables(int)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getDiningRoom_NumberOfTables()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getNumberOfTables();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.DiningRoom#getNumberOfTables <em>Number Of Tables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Tables</em>' attribute.
	 * @see #getNumberOfTables()
	 * @generated
	 */
	void setNumberOfTables(int value);

} // DiningRoom
