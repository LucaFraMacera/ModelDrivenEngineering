/**
 */
package RestaurantMetamodel.impl;

import RestaurantMetamodel.City;
import RestaurantMetamodel.Region;
import RestaurantMetamodel.RestaurantMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.impl.CityImpl#getName <em>Name</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.CityImpl#getCap <em>Cap</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.CityImpl#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CityImpl extends MinimalEObjectImpl.Container implements City {
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
	 * The default value of the '{@link #getCap() <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap()
	 * @generated
	 * @ordered
	 */
	protected static final String CAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCap() <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap()
	 * @generated
	 * @ordered
	 */
	protected String cap = CAP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected Region region;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestaurantMetamodelPackage.Literals.CITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.CITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCap() {
		return cap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCap(String newCap) {
		String oldCap = cap;
		cap = newCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.CITY__CAP, oldCap, cap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region getRegion() {
		if (region != null && region.eIsProxy()) {
			InternalEObject oldRegion = (InternalEObject)region;
			region = (Region)eResolveProxy(oldRegion);
			if (region != oldRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestaurantMetamodelPackage.CITY__REGION, oldRegion, region));
			}
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(Region newRegion) {
		Region oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.CITY__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestaurantMetamodelPackage.CITY__NAME:
				return getName();
			case RestaurantMetamodelPackage.CITY__CAP:
				return getCap();
			case RestaurantMetamodelPackage.CITY__REGION:
				if (resolve) return getRegion();
				return basicGetRegion();
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
			case RestaurantMetamodelPackage.CITY__NAME:
				setName((String)newValue);
				return;
			case RestaurantMetamodelPackage.CITY__CAP:
				setCap((String)newValue);
				return;
			case RestaurantMetamodelPackage.CITY__REGION:
				setRegion((Region)newValue);
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
			case RestaurantMetamodelPackage.CITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.CITY__CAP:
				setCap(CAP_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.CITY__REGION:
				setRegion((Region)null);
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
			case RestaurantMetamodelPackage.CITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestaurantMetamodelPackage.CITY__CAP:
				return CAP_EDEFAULT == null ? cap != null : !CAP_EDEFAULT.equals(cap);
			case RestaurantMetamodelPackage.CITY__REGION:
				return region != null;
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
		result.append(", cap: ");
		result.append(cap);
		result.append(')');
		return result.toString();
	}

} //CityImpl
