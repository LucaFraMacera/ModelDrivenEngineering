/**
 */
package RestaurantMetamodel.impl;

import RestaurantMetamodel.RestaurantArea;
import RestaurantMetamodel.RestaurantMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restaurant Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.impl.RestaurantAreaImpl#getName <em>Name</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.RestaurantAreaImpl#getPerimeter <em>Perimeter</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.RestaurantAreaImpl#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestaurantAreaImpl extends MinimalEObjectImpl.Container implements RestaurantArea {
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
	 * The default value of the '{@link #getPerimeter() <em>Perimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerimeter()
	 * @generated
	 * @ordered
	 */
	protected static final float PERIMETER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPerimeter() <em>Perimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerimeter()
	 * @generated
	 * @ordered
	 */
	protected float perimeter = PERIMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final float AREA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected float area = AREA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestaurantMetamodelPackage.Literals.RESTAURANT_AREA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.RESTAURANT_AREA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPerimeter() {
		return perimeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerimeter(float newPerimeter) {
		float oldPerimeter = perimeter;
		perimeter = newPerimeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.RESTAURANT_AREA__PERIMETER, oldPerimeter, perimeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArea(float newArea) {
		float oldArea = area;
		area = newArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.RESTAURANT_AREA__AREA, oldArea, area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestaurantMetamodelPackage.RESTAURANT_AREA__NAME:
				return getName();
			case RestaurantMetamodelPackage.RESTAURANT_AREA__PERIMETER:
				return getPerimeter();
			case RestaurantMetamodelPackage.RESTAURANT_AREA__AREA:
				return getArea();
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
			case RestaurantMetamodelPackage.RESTAURANT_AREA__NAME:
				setName((String)newValue);
				return;
			case RestaurantMetamodelPackage.RESTAURANT_AREA__PERIMETER:
				setPerimeter((Float)newValue);
				return;
			case RestaurantMetamodelPackage.RESTAURANT_AREA__AREA:
				setArea((Float)newValue);
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
			case RestaurantMetamodelPackage.RESTAURANT_AREA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.RESTAURANT_AREA__PERIMETER:
				setPerimeter(PERIMETER_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.RESTAURANT_AREA__AREA:
				setArea(AREA_EDEFAULT);
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
			case RestaurantMetamodelPackage.RESTAURANT_AREA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestaurantMetamodelPackage.RESTAURANT_AREA__PERIMETER:
				return perimeter != PERIMETER_EDEFAULT;
			case RestaurantMetamodelPackage.RESTAURANT_AREA__AREA:
				return area != AREA_EDEFAULT;
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
		result.append(", perimeter: ");
		result.append(perimeter);
		result.append(", area: ");
		result.append(area);
		result.append(')');
		return result.toString();
	}

} //RestaurantAreaImpl
