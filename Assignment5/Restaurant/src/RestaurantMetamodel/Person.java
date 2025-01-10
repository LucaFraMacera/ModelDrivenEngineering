/**
 */
package RestaurantMetamodel;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.Person#getSurname <em>Surname</em>}</li>
 *   <li>{@link RestaurantMetamodel.Person#getFiscalCode <em>Fiscal Code</em>}</li>
 *   <li>{@link RestaurantMetamodel.Person#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link RestaurantMetamodel.Person#getGender <em>Gender</em>}</li>
 *   <li>{@link RestaurantMetamodel.Person#getBirthPlace <em>Birth Place</em>}</li>
 * </ul>
 *
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getPerson_Surname()
	 * @model required="true"
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Person#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Fiscal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiscal Code</em>' attribute.
	 * @see #setFiscalCode(String)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getPerson_FiscalCode()
	 * @model required="true"
	 * @generated
	 */
	String getFiscalCode();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Person#getFiscalCode <em>Fiscal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiscal Code</em>' attribute.
	 * @see #getFiscalCode()
	 * @generated
	 */
	void setFiscalCode(String value);

	/**
	 * Returns the value of the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Date</em>' attribute.
	 * @see #setBirthDate(Date)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getPerson_BirthDate()
	 * @model required="true"
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Person#getBirthDate <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' attribute.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(Date value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link RestaurantMetamodel.Gender}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see RestaurantMetamodel.Gender
	 * @see #setGender(Gender)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getPerson_Gender()
	 * @model required="true"
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Person#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see RestaurantMetamodel.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Returns the value of the '<em><b>Birth Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Place</em>' reference.
	 * @see #setBirthPlace(City)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getPerson_BirthPlace()
	 * @model required="true"
	 * @generated
	 */
	City getBirthPlace();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Person#getBirthPlace <em>Birth Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Place</em>' reference.
	 * @see #getBirthPlace()
	 * @generated
	 */
	void setBirthPlace(City value);

} // Person
