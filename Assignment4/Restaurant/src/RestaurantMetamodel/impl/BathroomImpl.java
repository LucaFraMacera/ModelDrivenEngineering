/**
 */
package RestaurantMetamodel.impl;

import RestaurantMetamodel.Bathroom;
import RestaurantMetamodel.Gender;
import RestaurantMetamodel.RestaurantMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bathroom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.impl.BathroomImpl#getNumberOfToilets <em>Number Of Toilets</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.BathroomImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.BathroomImpl#isIsAccessible <em>Is Accessible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BathroomImpl extends RestaurantAreaImpl implements Bathroom {
	/**
	 * The default value of the '{@link #getNumberOfToilets() <em>Number Of Toilets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfToilets()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_TOILETS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfToilets() <em>Number Of Toilets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfToilets()
	 * @generated
	 * @ordered
	 */
	protected int numberOfToilets = NUMBER_OF_TOILETS_EDEFAULT;

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
	 * The default value of the '{@link #isIsAccessible() <em>Is Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAccessible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACCESSIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAccessible() <em>Is Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAccessible()
	 * @generated
	 * @ordered
	 */
	protected boolean isAccessible = IS_ACCESSIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BathroomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestaurantMetamodelPackage.Literals.BATHROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfToilets() {
		return numberOfToilets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfToilets(int newNumberOfToilets) {
		int oldNumberOfToilets = numberOfToilets;
		numberOfToilets = newNumberOfToilets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.BATHROOM__NUMBER_OF_TOILETS, oldNumberOfToilets, numberOfToilets));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.BATHROOM__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAccessible() {
		return isAccessible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAccessible(boolean newIsAccessible) {
		boolean oldIsAccessible = isAccessible;
		isAccessible = newIsAccessible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.BATHROOM__IS_ACCESSIBLE, oldIsAccessible, isAccessible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestaurantMetamodelPackage.BATHROOM__NUMBER_OF_TOILETS:
				return getNumberOfToilets();
			case RestaurantMetamodelPackage.BATHROOM__GENDER:
				return getGender();
			case RestaurantMetamodelPackage.BATHROOM__IS_ACCESSIBLE:
				return isIsAccessible();
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
			case RestaurantMetamodelPackage.BATHROOM__NUMBER_OF_TOILETS:
				setNumberOfToilets((Integer)newValue);
				return;
			case RestaurantMetamodelPackage.BATHROOM__GENDER:
				setGender((Gender)newValue);
				return;
			case RestaurantMetamodelPackage.BATHROOM__IS_ACCESSIBLE:
				setIsAccessible((Boolean)newValue);
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
			case RestaurantMetamodelPackage.BATHROOM__NUMBER_OF_TOILETS:
				setNumberOfToilets(NUMBER_OF_TOILETS_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.BATHROOM__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.BATHROOM__IS_ACCESSIBLE:
				setIsAccessible(IS_ACCESSIBLE_EDEFAULT);
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
			case RestaurantMetamodelPackage.BATHROOM__NUMBER_OF_TOILETS:
				return numberOfToilets != NUMBER_OF_TOILETS_EDEFAULT;
			case RestaurantMetamodelPackage.BATHROOM__GENDER:
				return gender != GENDER_EDEFAULT;
			case RestaurantMetamodelPackage.BATHROOM__IS_ACCESSIBLE:
				return isAccessible != IS_ACCESSIBLE_EDEFAULT;
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
		result.append(" (numberOfToilets: ");
		result.append(numberOfToilets);
		result.append(", gender: ");
		result.append(gender);
		result.append(", isAccessible: ");
		result.append(isAccessible);
		result.append(')');
		return result.toString();
	}

} //BathroomImpl
