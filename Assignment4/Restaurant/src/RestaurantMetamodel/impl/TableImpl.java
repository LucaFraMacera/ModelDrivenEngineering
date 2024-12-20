/**
 */
package RestaurantMetamodel.impl;

import RestaurantMetamodel.DiningRoom;
import RestaurantMetamodel.Material;
import RestaurantMetamodel.RestaurantMetamodelPackage;
import RestaurantMetamodel.RestaurantMetamodelTables;
import RestaurantMetamodel.Table;

import java.lang.reflect.InvocationTargetException;
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.impl.TableImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.TableImpl#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.TableImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.TableImpl#getDiningRoom <em>Dining Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSeats() <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeats()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSeats() <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeats()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSeats = NUMBER_OF_SEATS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaterial() <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final Material MATERIAL_EDEFAULT = Material.WOOD;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected Material material = MATERIAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestaurantMetamodelPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.TABLE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfSeats(int newNumberOfSeats) {
		int oldNumberOfSeats = numberOfSeats;
		numberOfSeats = newNumberOfSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.TABLE__NUMBER_OF_SEATS, oldNumberOfSeats, numberOfSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Material getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaterial(Material newMaterial) {
		Material oldMaterial = material;
		material = newMaterial == null ? MATERIAL_EDEFAULT : newMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.TABLE__MATERIAL, oldMaterial, material));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiningRoom getDiningRoom() {
		if (eContainerFeatureID() != RestaurantMetamodelPackage.TABLE__DINING_ROOM) return null;
		return (DiningRoom)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiningRoom(DiningRoom newDiningRoom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiningRoom, RestaurantMetamodelPackage.TABLE__DINING_ROOM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiningRoom(DiningRoom newDiningRoom) {
		if (newDiningRoom != eInternalContainer() || (eContainerFeatureID() != RestaurantMetamodelPackage.TABLE__DINING_ROOM && newDiningRoom != null)) {
			if (EcoreUtil.isAncestor(this, newDiningRoom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiningRoom != null)
				msgs = ((InternalEObject)newDiningRoom).eInverseAdd(this, RestaurantMetamodelPackage.DINING_ROOM__TABLES, DiningRoom.class, msgs);
			msgs = basicSetDiningRoom(newDiningRoom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.TABLE__DINING_ROOM, newDiningRoom, newDiningRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean UniqueTableNumber(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Table::UniqueTableNumber";
		try {
			/**
			 *
			 * inv UniqueTableNumber:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = diningRoom.tables->select(t |
			 *           (t.number = number
			 *           ))
			 *         ->size() <= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RestaurantMetamodelPackage.Literals.TABLE___UNIQUE_TABLE_NUMBER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RestaurantMetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ DiningRoom diningRoom = this.getDiningRoom();
					if (diningRoom == null) {
						throw new InvalidValueException("Null source for \'\'https://restaurant/RM\'::DiningRoom::tables\'");
					}
					final /*@Thrown*/ List<Table> tables = diningRoom.getTables();
					final /*@Thrown*/ OrderedSetValue BOXED_tables = idResolver.createOrderedSetOfAll(RestaurantMetamodelTables.ORD_CLSSid_Table, tables);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(RestaurantMetamodelTables.ORD_CLSSid_Table);
					Iterator<Object> ITERATOR_t = BOXED_tables.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_t.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Table t = (Table)ITERATOR_t.next();
						/**
						 * t.number = number
						 */
						final /*@NonInvalid*/ int number = t.getNumber();
						final /*@NonInvalid*/ int number_0 = this.getNumber();
						final /*@NonInvalid*/ boolean eq = number == number_0;
						//
						if (eq) {
							accumulator.add(t);
						}
					}
					final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@Thrown*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, RestaurantMetamodelTables.INT_1).booleanValue();
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, RestaurantMetamodelTables.INT_0).booleanValue();
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestaurantMetamodelPackage.TABLE__DINING_ROOM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiningRoom((DiningRoom)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestaurantMetamodelPackage.TABLE__DINING_ROOM:
				return basicSetDiningRoom(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RestaurantMetamodelPackage.TABLE__DINING_ROOM:
				return eInternalContainer().eInverseRemove(this, RestaurantMetamodelPackage.DINING_ROOM__TABLES, DiningRoom.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestaurantMetamodelPackage.TABLE__NUMBER:
				return getNumber();
			case RestaurantMetamodelPackage.TABLE__NUMBER_OF_SEATS:
				return getNumberOfSeats();
			case RestaurantMetamodelPackage.TABLE__MATERIAL:
				return getMaterial();
			case RestaurantMetamodelPackage.TABLE__DINING_ROOM:
				return getDiningRoom();
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
			case RestaurantMetamodelPackage.TABLE__NUMBER:
				setNumber((Integer)newValue);
				return;
			case RestaurantMetamodelPackage.TABLE__NUMBER_OF_SEATS:
				setNumberOfSeats((Integer)newValue);
				return;
			case RestaurantMetamodelPackage.TABLE__MATERIAL:
				setMaterial((Material)newValue);
				return;
			case RestaurantMetamodelPackage.TABLE__DINING_ROOM:
				setDiningRoom((DiningRoom)newValue);
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
			case RestaurantMetamodelPackage.TABLE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.TABLE__NUMBER_OF_SEATS:
				setNumberOfSeats(NUMBER_OF_SEATS_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.TABLE__MATERIAL:
				setMaterial(MATERIAL_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.TABLE__DINING_ROOM:
				setDiningRoom((DiningRoom)null);
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
			case RestaurantMetamodelPackage.TABLE__NUMBER:
				return number != NUMBER_EDEFAULT;
			case RestaurantMetamodelPackage.TABLE__NUMBER_OF_SEATS:
				return numberOfSeats != NUMBER_OF_SEATS_EDEFAULT;
			case RestaurantMetamodelPackage.TABLE__MATERIAL:
				return material != MATERIAL_EDEFAULT;
			case RestaurantMetamodelPackage.TABLE__DINING_ROOM:
				return getDiningRoom() != null;
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
			case RestaurantMetamodelPackage.TABLE___UNIQUE_TABLE_NUMBER__DIAGNOSTICCHAIN_MAP:
				return UniqueTableNumber((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (number: ");
		result.append(number);
		result.append(", numberOfSeats: ");
		result.append(numberOfSeats);
		result.append(", material: ");
		result.append(material);
		result.append(')');
		return result.toString();
	}

} //TableImpl
