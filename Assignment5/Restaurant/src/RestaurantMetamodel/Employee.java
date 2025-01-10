/**
 */
package RestaurantMetamodel;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.Employee#getContractExpirationDate <em>Contract Expiration Date</em>}</li>
 *   <li>{@link RestaurantMetamodel.Employee#getContractSignDate <em>Contract Sign Date</em>}</li>
 *   <li>{@link RestaurantMetamodel.Employee#getSalary <em>Salary</em>}</li>
 *   <li>{@link RestaurantMetamodel.Employee#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends Person {
	/**
	 * Returns the value of the '<em><b>Contract Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract Expiration Date</em>' attribute.
	 * @see #setContractExpirationDate(Date)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getEmployee_ContractExpirationDate()
	 * @model required="true"
	 * @generated
	 */
	Date getContractExpirationDate();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Employee#getContractExpirationDate <em>Contract Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract Expiration Date</em>' attribute.
	 * @see #getContractExpirationDate()
	 * @generated
	 */
	void setContractExpirationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Contract Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract Sign Date</em>' attribute.
	 * @see #setContractSignDate(Date)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getEmployee_ContractSignDate()
	 * @model required="true"
	 * @generated
	 */
	Date getContractSignDate();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Employee#getContractSignDate <em>Contract Sign Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract Sign Date</em>' attribute.
	 * @see #getContractSignDate()
	 * @generated
	 */
	void setContractSignDate(Date value);

	/**
	 * Returns the value of the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary</em>' attribute.
	 * @see #setSalary(float)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getEmployee_Salary()
	 * @model required="true"
	 * @generated
	 */
	float getSalary();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Employee#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #getSalary()
	 * @generated
	 */
	void setSalary(float value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link RestaurantMetamodel.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see RestaurantMetamodel.Role
	 * @see #setRole(Role)
	 * @see RestaurantMetamodel.RestaurantMetamodelPackage#getEmployee_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link RestaurantMetamodel.Employee#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see RestaurantMetamodel.Role
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // Employee
