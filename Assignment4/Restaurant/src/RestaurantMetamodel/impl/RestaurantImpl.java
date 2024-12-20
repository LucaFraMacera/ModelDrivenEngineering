/**
 */
package RestaurantMetamodel.impl;

import RestaurantMetamodel.Bathroom;
import RestaurantMetamodel.City;
import RestaurantMetamodel.Employee;
import RestaurantMetamodel.Menu;
import RestaurantMetamodel.Owner;
import RestaurantMetamodel.Restaurant;
import RestaurantMetamodel.RestaurantArea;
import RestaurantMetamodel.RestaurantMetamodelPackage;

import RestaurantMetamodel.RestaurantMetamodelTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSelectByTypeOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

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
 *   <li>{@link RestaurantMetamodel.impl.RestaurantImpl#getNumberOfEmployes <em>Number Of Employes</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.RestaurantImpl#getTotalArea <em>Total Area</em>}</li>
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
	 * The default value of the '{@link #getNumberOfEmployes() <em>Number Of Employes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfEmployes()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_EMPLOYES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfEmployes() <em>Number Of Employes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfEmployes()
	 * @generated
	 * @ordered
	 */
	protected int numberOfEmployes = NUMBER_OF_EMPLOYES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalArea() <em>Total Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalArea()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_AREA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalArea() <em>Total Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalArea()
	 * @generated
	 * @ordered
	 */
	protected float totalArea = TOTAL_AREA_EDEFAULT;

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
	public int getNumberOfEmployes() {
		return numberOfEmployes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfEmployes(int newNumberOfEmployes) {
		int oldNumberOfEmployes = numberOfEmployes;
		numberOfEmployes = newNumberOfEmployes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.RESTAURANT__NUMBER_OF_EMPLOYES, oldNumberOfEmployes, numberOfEmployes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTotalArea() {
		return totalArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalArea(float newTotalArea) {
		float oldTotalArea = totalArea;
		totalArea = newTotalArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.RESTAURANT__TOTAL_AREA, oldTotalArea, totalArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasAccessibleToilets() {
		/**
		 *
		 * rooms->selectByType(Bathroom)
		 * ->select(b | b.isAccessible)
		 * ->size() > 0
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_RestaurantMetamodel_c_c_Bathroom_0 = idResolver.getClass(RestaurantMetamodelTables.CLSSid_Bathroom, null);
		final /*@NonInvalid*/ List<RestaurantArea> rooms = this.getRooms();
		final /*@NonInvalid*/ OrderedSetValue BOXED_rooms = idResolver.createOrderedSetOfAll(RestaurantMetamodelTables.ORD_CLSSid_RestaurantArea, rooms);
		final /*@NonInvalid*/ OrderedSetValue selectByType = (OrderedSetValue)CollectionSelectByTypeOperation.INSTANCE.evaluate(executor, BOXED_rooms, TYP_RestaurantMetamodel_c_c_Bathroom_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(RestaurantMetamodelTables.ORD_CLSSid_Bathroom);
		Iterator<Object> ITERATOR_b = selectByType.iterator();
		/*@NonInvalid*/ OrderedSetValue select;
		while (true) {
			if (!ITERATOR_b.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Bathroom b = (Bathroom)ITERATOR_b.next();
			/**
			 * b.isAccessible
			 */
			final /*@NonInvalid*/ boolean isAccessible = b.isIsAccessible();
			//
			if (isAccessible) {
				accumulator.add(b);
			}
		}
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
		final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, RestaurantMetamodelTables.INT_0).booleanValue();
		return gt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean MustBeOwned(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Restaurant::MustBeOwned";
		try {
			/**
			 *
			 * inv MustBeOwned:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = owners->size() > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RestaurantMetamodelPackage.Literals.RESTAURANT___MUST_BE_OWNED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RestaurantMetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Owner> owners = this.getOwners();
				final /*@NonInvalid*/ OrderedSetValue BOXED_owners = idResolver.createOrderedSetOfAll(RestaurantMetamodelTables.ORD_CLSSid_Owner, owners);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_owners);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, RestaurantMetamodelTables.INT_0).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, RestaurantMetamodelTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
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
			case RestaurantMetamodelPackage.RESTAURANT__NUMBER_OF_EMPLOYES:
				return getNumberOfEmployes();
			case RestaurantMetamodelPackage.RESTAURANT__TOTAL_AREA:
				return getTotalArea();
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
			case RestaurantMetamodelPackage.RESTAURANT__NUMBER_OF_EMPLOYES:
				setNumberOfEmployes((Integer)newValue);
				return;
			case RestaurantMetamodelPackage.RESTAURANT__TOTAL_AREA:
				setTotalArea((Float)newValue);
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
			case RestaurantMetamodelPackage.RESTAURANT__NUMBER_OF_EMPLOYES:
				setNumberOfEmployes(NUMBER_OF_EMPLOYES_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.RESTAURANT__TOTAL_AREA:
				setTotalArea(TOTAL_AREA_EDEFAULT);
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
			case RestaurantMetamodelPackage.RESTAURANT__NUMBER_OF_EMPLOYES:
				return numberOfEmployes != NUMBER_OF_EMPLOYES_EDEFAULT;
			case RestaurantMetamodelPackage.RESTAURANT__TOTAL_AREA:
				return totalArea != TOTAL_AREA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RestaurantMetamodelPackage.RESTAURANT___HAS_ACCESSIBLE_TOILETS:
				return hasAccessibleToilets();
			case RestaurantMetamodelPackage.RESTAURANT___MUST_BE_OWNED__DIAGNOSTICCHAIN_MAP:
				return MustBeOwned((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", numberOfEmployes: ");
		result.append(numberOfEmployes);
		result.append(", totalArea: ");
		result.append(totalArea);
		result.append(')');
		return result.toString();
	}

} //RestaurantImpl
