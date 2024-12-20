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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getDiningRoom_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

} // DiningRoom
