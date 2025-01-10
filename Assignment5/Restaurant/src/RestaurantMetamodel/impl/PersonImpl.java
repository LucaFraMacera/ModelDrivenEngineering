/**
 */
package RestaurantMetamodel.impl;

import RestaurantMetamodel.City;
import RestaurantMetamodel.Gender;
import RestaurantMetamodel.Person;
import RestaurantMetamodel.RestaurantMetamodelPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.impl.PersonImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.PersonImpl#getFiscalCode <em>Fiscal Code</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.PersonImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.PersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.PersonImpl#getBirthPlace <em>Birth Place</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersonImpl extends DiagramElementImpl implements Person {
	/**
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected String surname = SURNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiscalCode() <em>Fiscal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String FISCAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiscalCode() <em>Fiscal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalCode()
	 * @generated
	 * @ordered
	 */
	protected String fiscalCode = FISCAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate = BIRTH_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final Gender GENDER_EDEFAULT = Gender.MALE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Gender gender = GENDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBirthPlace() <em>Birth Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthPlace()
	 * @generated
	 * @ordered
	 */
	protected City birthPlace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestaurantMetamodelPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurname(String newSurname) {
		String oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.PERSON__SURNAME, oldSurname, surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFiscalCode() {
		return fiscalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFiscalCode(String newFiscalCode) {
		String oldFiscalCode = fiscalCode;
		fiscalCode = newFiscalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.PERSON__FISCAL_CODE, oldFiscalCode, fiscalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirthDate(Date newBirthDate) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.PERSON__BIRTH_DATE, oldBirthDate, birthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(Gender newGender) {
		Gender oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.PERSON__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public City getBirthPlace() {
		if (birthPlace != null && birthPlace.eIsProxy()) {
			InternalEObject oldBirthPlace = (InternalEObject)birthPlace;
			birthPlace = (City)eResolveProxy(oldBirthPlace);
			if (birthPlace != oldBirthPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestaurantMetamodelPackage.PERSON__BIRTH_PLACE, oldBirthPlace, birthPlace));
			}
		}
		return birthPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City basicGetBirthPlace() {
		return birthPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirthPlace(City newBirthPlace) {
		City oldBirthPlace = birthPlace;
		birthPlace = newBirthPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.PERSON__BIRTH_PLACE, oldBirthPlace, birthPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestaurantMetamodelPackage.PERSON__SURNAME:
				return getSurname();
			case RestaurantMetamodelPackage.PERSON__FISCAL_CODE:
				return getFiscalCode();
			case RestaurantMetamodelPackage.PERSON__BIRTH_DATE:
				return getBirthDate();
			case RestaurantMetamodelPackage.PERSON__GENDER:
				return getGender();
			case RestaurantMetamodelPackage.PERSON__BIRTH_PLACE:
				if (resolve) return getBirthPlace();
				return basicGetBirthPlace();
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
			case RestaurantMetamodelPackage.PERSON__SURNAME:
				setSurname((String)newValue);
				return;
			case RestaurantMetamodelPackage.PERSON__FISCAL_CODE:
				setFiscalCode((String)newValue);
				return;
			case RestaurantMetamodelPackage.PERSON__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case RestaurantMetamodelPackage.PERSON__GENDER:
				setGender((Gender)newValue);
				return;
			case RestaurantMetamodelPackage.PERSON__BIRTH_PLACE:
				setBirthPlace((City)newValue);
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
			case RestaurantMetamodelPackage.PERSON__SURNAME:
				setSurname(SURNAME_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.PERSON__FISCAL_CODE:
				setFiscalCode(FISCAL_CODE_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.PERSON__BIRTH_DATE:
				setBirthDate(BIRTH_DATE_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.PERSON__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.PERSON__BIRTH_PLACE:
				setBirthPlace((City)null);
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
			case RestaurantMetamodelPackage.PERSON__SURNAME:
				return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
			case RestaurantMetamodelPackage.PERSON__FISCAL_CODE:
				return FISCAL_CODE_EDEFAULT == null ? fiscalCode != null : !FISCAL_CODE_EDEFAULT.equals(fiscalCode);
			case RestaurantMetamodelPackage.PERSON__BIRTH_DATE:
				return BIRTH_DATE_EDEFAULT == null ? birthDate != null : !BIRTH_DATE_EDEFAULT.equals(birthDate);
			case RestaurantMetamodelPackage.PERSON__GENDER:
				return gender != GENDER_EDEFAULT;
			case RestaurantMetamodelPackage.PERSON__BIRTH_PLACE:
				return birthPlace != null;
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
		result.append(" (surname: ");
		result.append(surname);
		result.append(", fiscalCode: ");
		result.append(fiscalCode);
		result.append(", birthDate: ");
		result.append(birthDate);
		result.append(", gender: ");
		result.append(gender);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
