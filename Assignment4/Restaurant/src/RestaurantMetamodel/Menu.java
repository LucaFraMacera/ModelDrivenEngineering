/**
 */
package RestaurantMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.Menu#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link RestaurantMetamodel.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getMenu_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // Menu
