/**
 */
package RestaurantMetamodel.impl;

import RestaurantMetamodel.City;
import RestaurantMetamodel.Employee;
import RestaurantMetamodel.Menu;
import RestaurantMetamodel.Owner;
import RestaurantMetamodel.Restaurant;
import RestaurantMetamodel.RestaurantArea;
import RestaurantMetamodel.RestaurantMetamodelPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.impl.RestaurantImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.RestaurantImpl#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.RestaurantImpl#getCity <em>City</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.RestaurantImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.RestaurantImpl#getOwners <em>Owners</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.RestaurantImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.RestaurantImpl#getMenus <em>Menus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestaurantImpl extends DiagramElementImpl implements Restaurant {
	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected String telephone = TELEPHONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected City city;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<RestaurantArea> rooms;

	/**
	 * The cached value of the '{@link #getOwners() <em>Owners</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwners()
	 * @generated
	 * @ordered
	 */
	protected EList<Owner> owners;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employees;

	/**
	 * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> menus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestaurantMetamodelPackage.Literals.RESTAURANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.RESTAURANT__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTelephone() {
		return telephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelephone(String newTelephone) {
		String oldTelephone = telephone;
		telephone = newTelephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.RESTAURANT__TELEPHONE, oldTelephone, telephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public City getCity() {
		if (city != null && city.eIsProxy()) {
			InternalEObject oldCity = (InternalEObject)city;
			city = (City)eResolveProxy(oldCity);
			if (city != oldCity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestaurantMetamodelPackage.RESTAURANT__CITY, oldCity, city));
			}
		}
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City basicGetCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(City newCity) {
		City oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.RESTAURANT__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestaurantArea> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<RestaurantArea>(RestaurantArea.class, this, RestaurantMetamodelPackage.RESTAURANT__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Owner> getOwners() {
		if (owners == null) {
			owners = new EObjectContainmentEList<Owner>(Owner.class, this, RestaurantMetamodelPackage.RESTAURANT__OWNERS);
		}
		return owners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectContainmentEList<Employee>(Employee.class, this, RestaurantMetamodelPackage.RESTAURANT__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Menu> getMenus() {
		if (menus == null) {
			menus = new EObjectContainmentEList<Menu>(Menu.class, this, RestaurantMetamodelPackage.RESTAURANT__MENUS);
		}
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestaurantMetamodelPackage.RESTAURANT__ROOMS:
				return ((InternalEList<?>)getRooms()).basicRemove(otherEnd, msgs);
			case RestaurantMetamodelPackage.RESTAURANT__OWNERS:
				return ((InternalEList<?>)getOwners()).basicRemove(otherEnd, msgs);
			case RestaurantMetamodelPackage.RESTAURANT__EMPLOYEES:
				return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
			case RestaurantMetamodelPackage.RESTAURANT__MENUS:
				return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestaurantMetamodelPackage.RESTAURANT__STREET:
				return getStreet();
			case RestaurantMetamodelPackage.RESTAURANT__TELEPHONE:
				return getTelephone();
			case RestaurantMetamodelPackage.RESTAURANT__CITY:
				if (resolve) return getCity();
				return basicGetCity();
			case RestaurantMetamodelPackage.RESTAURANT__ROOMS:
				return getRooms();
			case RestaurantMetamodelPackage.RESTAURANT__OWNERS:
				return getOwners();
			case RestaurantMetamodelPackage.RESTAURANT__EMPLOYEES:
				return getEmployees();
			case RestaurantMetamodelPackage.RESTAURANT__MENUS:
				return getMenus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestaurantMetamodelPackage.RESTAURANT__STREET:
				setStreet((String)newValue);
				return;
			case RestaurantMetamodelPackage.RESTAURANT__TELEPHONE:
				setTelephone((String)newValue);
				return;
			case RestaurantMetamodelPackage.RESTAURANT__CITY:
				setCity((City)newValue);
				return;
			case RestaurantMetamodelPackage.RESTAURANT__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends RestaurantArea>)newValue);
				return;
			case RestaurantMetamodelPackage.RESTAURANT__OWNERS:
				getOwners().clear();
				getOwners().addAll((Collection<? extends Owner>)newValue);
				return;
			case RestaurantMetamodelPackage.RESTAURANT__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case RestaurantMetamodelPackage.RESTAURANT__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends Menu>)newValue);
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
			case RestaurantMetamodelPackage.RESTAURANT__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.RESTAURANT__TELEPHONE:
				setTelephone(TELEPHONE_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.RESTAURANT__CITY:
				setCity((City)null);
				return;
			case RestaurantMetamodelPackage.RESTAURANT__ROOMS:
				getRooms().clear();
				return;
			case RestaurantMetamodelPackage.RESTAURANT__OWNERS:
				getOwners().clear();
				return;
			case RestaurantMetamodelPackage.RESTAURANT__EMPLOYEES:
				getEmployees().clear();
				return;
			case RestaurantMetamodelPackage.RESTAURANT__MENUS:
				getMenus().clear();
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
			case RestaurantMetamodelPackage.RESTAURANT__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case RestaurantMetamodelPackage.RESTAURANT__TELEPHONE:
				return TELEPHONE_EDEFAULT == null ? telephone != null : !TELEPHONE_EDEFAULT.equals(telephone);
			case RestaurantMetamodelPackage.RESTAURANT__CITY:
				return city != null;
			case RestaurantMetamodelPackage.RESTAURANT__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case RestaurantMetamodelPackage.RESTAURANT__OWNERS:
				return owners != null && !owners.isEmpty();
			case RestaurantMetamodelPackage.RESTAURANT__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case RestaurantMetamodelPackage.RESTAURANT__MENUS:
				return menus != null && !menus.isEmpty();
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
		result.append(" (street: ");
		result.append(street);
		result.append(", telephone: ");
		result.append(telephone);
		result.append(')');
		return result.toString();
	}

} //RestaurantImpl
