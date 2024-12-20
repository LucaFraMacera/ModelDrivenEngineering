/**
 */
package RestaurantMetamodel.impl;

import RestaurantMetamodel.Employee;
import RestaurantMetamodel.RestaurantMetamodelPackage;
import RestaurantMetamodel.Role;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.impl.EmployeeImpl#getContractExpirationDate <em>Contract Expiration Date</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.EmployeeImpl#getContractSignDate <em>Contract Sign Date</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.EmployeeImpl#getSalary <em>Salary</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.EmployeeImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends PersonImpl implements Employee {
	/**
	 * The default value of the '{@link #getContractExpirationDate() <em>Contract Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CONTRACT_EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContractExpirationDate() <em>Contract Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected Date contractExpirationDate = CONTRACT_EXPIRATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContractSignDate() <em>Contract Sign Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractSignDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CONTRACT_SIGN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContractSignDate() <em>Contract Sign Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractSignDate()
	 * @generated
	 * @ordered
	 */
	protected Date contractSignDate = CONTRACT_SIGN_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected static final float SALARY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected float salary = SALARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Role ROLE_EDEFAULT = Role.CHEF;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role = ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestaurantMetamodelPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getContractExpirationDate() {
		return contractExpirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContractExpirationDate(Date newContractExpirationDate) {
		Date oldContractExpirationDate = contractExpirationDate;
		contractExpirationDate = newContractExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.EMPLOYEE__CONTRACT_EXPIRATION_DATE, oldContractExpirationDate, contractExpirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getContractSignDate() {
		return contractSignDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContractSignDate(Date newContractSignDate) {
		Date oldContractSignDate = contractSignDate;
		contractSignDate = newContractSignDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.EMPLOYEE__CONTRACT_SIGN_DATE, oldContractSignDate, contractSignDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getSalary() {
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalary(float newSalary) {
		float oldSalary = salary;
		salary = newSalary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.EMPLOYEE__SALARY, oldSalary, salary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.EMPLOYEE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestaurantMetamodelPackage.EMPLOYEE__CONTRACT_EXPIRATION_DATE:
				return getContractExpirationDate();
			case RestaurantMetamodelPackage.EMPLOYEE__CONTRACT_SIGN_DATE:
				return getContractSignDate();
			case RestaurantMetamodelPackage.EMPLOYEE__SALARY:
				return getSalary();
			case RestaurantMetamodelPackage.EMPLOYEE__ROLE:
				return getRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestaurantMetamodelPackage.EMPLOYEE__CONTRACT_EXPIRATION_DATE:
				setContractExpirationDate((Date)newValue);
				return;
			case RestaurantMetamodelPackage.EMPLOYEE__CONTRACT_SIGN_DATE:
				setContractSignDate((Date)newValue);
				return;
			case RestaurantMetamodelPackage.EMPLOYEE__SALARY:
				setSalary((Float)newValue);
				return;
			case RestaurantMetamodelPackage.EMPLOYEE__ROLE:
				setRole((Role)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RestaurantMetamodelPackage.EMPLOYEE__CONTRACT_EXPIRATION_DATE:
				setContractExpirationDate(CONTRACT_EXPIRATION_DATE_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.EMPLOYEE__CONTRACT_SIGN_DATE:
				setContractSignDate(CONTRACT_SIGN_DATE_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.EMPLOYEE__SALARY:
				setSalary(SALARY_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.EMPLOYEE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RestaurantMetamodelPackage.EMPLOYEE__CONTRACT_EXPIRATION_DATE:
				return CONTRACT_EXPIRATION_DATE_EDEFAULT == null ? contractExpirationDate != null : !CONTRACT_EXPIRATION_DATE_EDEFAULT.equals(contractExpirationDate);
			case RestaurantMetamodelPackage.EMPLOYEE__CONTRACT_SIGN_DATE:
				return CONTRACT_SIGN_DATE_EDEFAULT == null ? contractSignDate != null : !CONTRACT_SIGN_DATE_EDEFAULT.equals(contractSignDate);
			case RestaurantMetamodelPackage.EMPLOYEE__SALARY:
				return salary != SALARY_EDEFAULT;
			case RestaurantMetamodelPackage.EMPLOYEE__ROLE:
				return role != ROLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (contractExpirationDate: ");
		result.append(contractExpirationDate);
		result.append(", contractSignDate: ");
		result.append(contractSignDate);
		result.append(", salary: ");
		result.append(salary);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
