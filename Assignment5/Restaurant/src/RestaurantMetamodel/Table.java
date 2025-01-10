/**
 */
package RestaurantMetamodel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link RestaurantMetamodel.Table#getDiningRoom <em>Dining Room</em>}</li>
 * </ul>
 *
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueTableNumber'"
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

	/**
	 * Returns the value of the '<em><b>Dining Room</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link RestaurantMetamodel.DiningRoom#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dining Room</em>' container reference.
	 * @see #setDiningRoom(DiningRoom)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getTable_DiningRoom()
	 * @see RestaurantMetamodel.DiningRoom#getTables
	 * @model opposite="tables" transient="false"
	 * @generated
	 */
	DiningRoom getDiningRoom();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Table#getDiningRoom <em>Dining Room</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dining Room</em>' container reference.
	 * @see #getDiningRoom()
	 * @generated
	 */
	void setDiningRoom(DiningRoom value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tdiningRoom.tables-&gt;select(t | t.number=number)-&gt;size() &lt;= 1'"
	 * @generated
	 */
	boolean UniqueTableNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Table
