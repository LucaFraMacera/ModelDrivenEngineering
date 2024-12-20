/**
 */
package RestaurantMetamodel.impl;

import RestaurantMetamodel.Course;
import RestaurantMetamodel.CourseType;
import RestaurantMetamodel.Menu;
import RestaurantMetamodel.RestaurantMetamodelPackage;

import RestaurantMetamodel.RestaurantMetamodelTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.impl.MenuImpl#getName <em>Name</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.MenuImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link RestaurantMetamodel.impl.MenuImpl#getNumberOfCourses <em>Number Of Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MenuImpl extends MinimalEObjectImpl.Container implements Menu {
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
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The default value of the '{@link #getNumberOfCourses() <em>Number Of Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCourses()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_COURSES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfCourses() <em>Number Of Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCourses()
	 * @generated
	 * @ordered
	 */
	protected int numberOfCourses = NUMBER_OF_COURSES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestaurantMetamodelPackage.Literals.MENU;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.MENU__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<Course>(Course.class, this, RestaurantMetamodelPackage.MENU__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfCourses() {
		return numberOfCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfCourses(int newNumberOfCourses) {
		int oldNumberOfCourses = numberOfCourses;
		numberOfCourses = newNumberOfCourses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.MENU__NUMBER_OF_COURSES, oldNumberOfCourses, numberOfCourses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasCourseType(final CourseType courseType) {
		/**
		 *
		 * courses->select(c | (c.type = courseType))
		 * ->size() > 0
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Course> courses = this.getCourses();
		final /*@NonInvalid*/ OrderedSetValue BOXED_courses = idResolver.createOrderedSetOfAll(RestaurantMetamodelTables.ORD_CLSSid_Course, courses);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(RestaurantMetamodelTables.ORD_CLSSid_Course);
		Iterator<Object> ITERATOR_c = BOXED_courses.iterator();
		/*@NonInvalid*/ OrderedSetValue select;
		while (true) {
			if (!ITERATOR_c.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Course c = (Course)ITERATOR_c.next();
			/**
			 * c.type = courseType
			 */
			final /*@NonInvalid*/ CourseType type = c.getType();
			final /*@NonInvalid*/ boolean eq = type.equals(courseType);
			//
			if (eq) {
				accumulator.add(c);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestaurantMetamodelPackage.MENU__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
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
			case RestaurantMetamodelPackage.MENU__NAME:
				return getName();
			case RestaurantMetamodelPackage.MENU__COURSES:
				return getCourses();
			case RestaurantMetamodelPackage.MENU__NUMBER_OF_COURSES:
				return getNumberOfCourses();
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
			case RestaurantMetamodelPackage.MENU__NAME:
				setName((String)newValue);
				return;
			case RestaurantMetamodelPackage.MENU__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case RestaurantMetamodelPackage.MENU__NUMBER_OF_COURSES:
				setNumberOfCourses((Integer)newValue);
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
			case RestaurantMetamodelPackage.MENU__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RestaurantMetamodelPackage.MENU__COURSES:
				getCourses().clear();
				return;
			case RestaurantMetamodelPackage.MENU__NUMBER_OF_COURSES:
				setNumberOfCourses(NUMBER_OF_COURSES_EDEFAULT);
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
			case RestaurantMetamodelPackage.MENU__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestaurantMetamodelPackage.MENU__COURSES:
				return courses != null && !courses.isEmpty();
			case RestaurantMetamodelPackage.MENU__NUMBER_OF_COURSES:
				return numberOfCourses != NUMBER_OF_COURSES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RestaurantMetamodelPackage.MENU___HAS_COURSE_TYPE__COURSETYPE:
				return hasCourseType((CourseType)arguments.get(0));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", numberOfCourses: ");
		result.append(numberOfCourses);
		result.append(')');
		return result.toString();
	}

} //MenuImpl
