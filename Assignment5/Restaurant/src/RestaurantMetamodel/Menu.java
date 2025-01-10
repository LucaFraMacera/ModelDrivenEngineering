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
 *   <li>{@link RestaurantMetamodel.Menu#getNumberOfCourses <em>Number Of Courses</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Number Of Courses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Courses</em>' attribute.
	 * @see #setNumberOfCourses(int)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getMenu_NumberOfCourses()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getNumberOfCourses();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Menu#getNumberOfCourses <em>Number Of Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Courses</em>' attribute.
	 * @see #getNumberOfCourses()
	 * @generated
	 */
	void setNumberOfCourses(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" courseTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='courses-&gt;select(c | c.type = courseType)-&gt;size() &gt; 0'"
	 * @generated
	 */
	boolean hasCourseType(CourseType courseType);

} // Menu
