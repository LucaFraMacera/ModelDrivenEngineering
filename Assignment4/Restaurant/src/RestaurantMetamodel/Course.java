/**
 */
package RestaurantMetamodel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.Course#getPrice <em>Price</em>}</li>
 *   <li>{@link RestaurantMetamodel.Course#getType <em>Type</em>}</li>
 *   <li>{@link RestaurantMetamodel.Course#getNumberOfPieces <em>Number Of Pieces</em>}</li>
 * </ul>
 *
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonNegativeNumberOfPieces'"
 * @generated
 */
public interface Course extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getCourse_Price()
	 * @model required="true"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Course#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link RestaurantMetamodel.CourseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see RestaurantMetamodel.CourseType
	 * @see #setType(CourseType)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getCourse_Type()
	 * @model required="true"
	 * @generated
	 */
	CourseType getType();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Course#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see RestaurantMetamodel.CourseType
	 * @see #getType()
	 * @generated
	 */
	void setType(CourseType value);

	/**
	 * Returns the value of the '<em><b>Number Of Pieces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Pieces</em>' attribute.
	 * @see #setNumberOfPieces(int)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getCourse_NumberOfPieces()
	 * @model required="true"
	 * @generated
	 */
	int getNumberOfPieces();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Course#getNumberOfPieces <em>Number Of Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Pieces</em>' attribute.
	 * @see #getNumberOfPieces()
	 * @generated
	 */
	void setNumberOfPieces(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tnumberOfPieces &gt; 0'"
	 * @generated
	 */
	boolean NonNegativeNumberOfPieces(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Course
