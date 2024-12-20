/**
 */
package RestaurantMetamodel.impl;

import RestaurantMetamodel.Course;
import RestaurantMetamodel.CourseType;
import RestaurantMetamodel.RestaurantMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.CourseImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.CourseImpl#getType <em>Type</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.CourseImpl#getNumberOfPieces <em>Number Of Pieces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CourseType TYPE_EDEFAULT = CourseType.FRIED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CourseType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfPieces() <em>Number Of Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPieces()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_PIECES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfPieces() <em>Number Of Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPieces()
	 * @generated
	 * @ordered
	 */
	protected int numberOfPieces = NUMBER_OF_PIECES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestaurantMetamodelPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.COURSE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(CourseType newType) {
		CourseType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.COURSE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfPieces() {
		return numberOfPieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfPieces(int newNumberOfPieces) {
		int oldNumberOfPieces = numberOfPieces;
		numberOfPieces = newNumberOfPieces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.COURSE__NUMBER_OF_PIECES, oldNumberOfPieces, numberOfPieces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestaurantMetamodelPackage.COURSE__NAME:
				return getName();
			case RestaurantMetamodelPackage.COURSE__PRICE:
				return getPrice();
			case RestaurantMetamodelPackage.COURSE__TYPE:
				return getType();
			case RestaurantMetamodelPackage.COURSE__NUMBER_OF_PIECES:
				return getNumberOfPieces();
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
			case RestaurantMetamodelPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case RestaurantMetamodelPackage.COURSE__PRICE:
				setPrice((Float)newValue);
				return;
			case RestaurantMetamodelPackage.COURSE__TYPE:
				setType((CourseType)newValue);
				return;
			case RestaurantMetamodelPackage.COURSE__NUMBER_OF_PIECES:
				setNumberOfPieces((Integer)newValue);
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
			case RestaurantMetamodelPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.COURSE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.COURSE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.COURSE__NUMBER_OF_PIECES:
				setNumberOfPieces(NUMBER_OF_PIECES_EDEFAULT);
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
			case RestaurantMetamodelPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestaurantMetamodelPackage.COURSE__PRICE:
				return price != PRICE_EDEFAULT;
			case RestaurantMetamodelPackage.COURSE__TYPE:
				return type != TYPE_EDEFAULT;
			case RestaurantMetamodelPackage.COURSE__NUMBER_OF_PIECES:
				return numberOfPieces != NUMBER_OF_PIECES_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", price: ");
		result.append(price);
		result.append(", type: ");
		result.append(type);
		result.append(", numberOfPieces: ");
		result.append(numberOfPieces);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
