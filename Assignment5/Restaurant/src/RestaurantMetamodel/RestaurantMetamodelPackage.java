/**
 */
package RestaurantMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RestaurantMetamodel.RestaurantMetamodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface RestaurantMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RestaurantMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://restaurant/RM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestaurantMetamodelPackage eINSTANCE = RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.NamedElement
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.DiagramElementImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.RestaurantImpl <em>Restaurant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.RestaurantImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getRestaurant()
	 * @generated
	 */
	int RESTAURANT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__STREET = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__TELEPHONE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__CITY = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__ROOMS = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__OWNERS = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__EMPLOYEES = DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__MENUS = DIAGRAM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Number Of Employes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__NUMBER_OF_EMPLOYES = DIAGRAM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Total Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__TOTAL_AREA = DIAGRAM_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Has Accessible Toilets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT___HAS_ACCESSIBLE_TOILETS = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT___MUST_BE_OWNED__DIAGNOSTICCHAIN_MAP = DIAGRAM_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.CityImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__CAP = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__REGION = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.RegionImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.DiagramImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.PersonImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SURNAME = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fiscal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FISCAL_CODE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_DATE = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Birth Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_PLACE = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.OwnerImpl <em>Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.OwnerImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getOwner()
	 * @generated
	 */
	int OWNER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__SURNAME = PERSON__SURNAME;

	/**
	 * The feature id for the '<em><b>Fiscal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__FISCAL_CODE = PERSON__FISCAL_CODE;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__BIRTH_DATE = PERSON__BIRTH_DATE;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__GENDER = PERSON__GENDER;

	/**
	 * The feature id for the '<em><b>Birth Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__BIRTH_PLACE = PERSON__BIRTH_PLACE;

	/**
	 * The feature id for the '<em><b>Vat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__VAT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.EmployeeImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SURNAME = PERSON__SURNAME;

	/**
	 * The feature id for the '<em><b>Fiscal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__FISCAL_CODE = PERSON__FISCAL_CODE;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__BIRTH_DATE = PERSON__BIRTH_DATE;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__GENDER = PERSON__GENDER;

	/**
	 * The feature id for the '<em><b>Birth Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__BIRTH_PLACE = PERSON__BIRTH_PLACE;

	/**
	 * The feature id for the '<em><b>Contract Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__CONTRACT_EXPIRATION_DATE = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contract Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__CONTRACT_SIGN_DATE = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SALARY = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ROLE = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.MenuImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__COURSES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Courses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NUMBER_OF_COURSES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Course Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU___HAS_COURSE_TYPE__COURSETYPE = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.CourseImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__PRICE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Pieces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NUMBER_OF_PIECES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Non Negative Number Of Pieces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE___NON_NEGATIVE_NUMBER_OF_PIECES__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.RestaurantAreaImpl <em>Restaurant Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.RestaurantAreaImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getRestaurantArea()
	 * @generated
	 */
	int RESTAURANT_AREA = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_AREA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Perimeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_AREA__PERIMETER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_AREA__AREA = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Restaurant Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_AREA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Restaurant Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_AREA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.DiningRoomImpl <em>Dining Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.DiningRoomImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getDiningRoom()
	 * @generated
	 */
	int DINING_ROOM = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_ROOM__NAME = RESTAURANT_AREA__NAME;

	/**
	 * The feature id for the '<em><b>Perimeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_ROOM__PERIMETER = RESTAURANT_AREA__PERIMETER;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_ROOM__AREA = RESTAURANT_AREA__AREA;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_ROOM__TABLES = RESTAURANT_AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Tables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_ROOM__NUMBER_OF_TABLES = RESTAURANT_AREA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dining Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_ROOM_FEATURE_COUNT = RESTAURANT_AREA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dining Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_ROOM_OPERATION_COUNT = RESTAURANT_AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.TableImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 12;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Number Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NUMBER_OF_SEATS = 1;

	/**
	 * The feature id for the '<em><b>Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MATERIAL = 2;

	/**
	 * The feature id for the '<em><b>Dining Room</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DINING_ROOM = 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Unique Table Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___UNIQUE_TABLE_NUMBER__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.KitchenImpl <em>Kitchen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.KitchenImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getKitchen()
	 * @generated
	 */
	int KITCHEN = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__NAME = RESTAURANT_AREA__NAME;

	/**
	 * The feature id for the '<em><b>Perimeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__PERIMETER = RESTAURANT_AREA__PERIMETER;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__AREA = RESTAURANT_AREA__AREA;

	/**
	 * The feature id for the '<em><b>Number Of Stoves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__NUMBER_OF_STOVES = RESTAURANT_AREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kitchen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_FEATURE_COUNT = RESTAURANT_AREA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Kitchen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_OPERATION_COUNT = RESTAURANT_AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.impl.BathroomImpl <em>Bathroom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.impl.BathroomImpl
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getBathroom()
	 * @generated
	 */
	int BATHROOM = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHROOM__NAME = RESTAURANT_AREA__NAME;

	/**
	 * The feature id for the '<em><b>Perimeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHROOM__PERIMETER = RESTAURANT_AREA__PERIMETER;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHROOM__AREA = RESTAURANT_AREA__AREA;

	/**
	 * The feature id for the '<em><b>Number Of Toilets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHROOM__NUMBER_OF_TOILETS = RESTAURANT_AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHROOM__GENDER = RESTAURANT_AREA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHROOM__IS_ACCESSIBLE = RESTAURANT_AREA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bathroom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHROOM_FEATURE_COUNT = RESTAURANT_AREA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bathroom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHROOM_OPERATION_COUNT = RESTAURANT_AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.Gender
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 16;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.Role
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 17;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.CourseType <em>Course Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.CourseType
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getCourseType()
	 * @generated
	 */
	int COURSE_TYPE = 18;

	/**
	 * The meta object id for the '{@link RestaurantMetamodel.Material <em>Material</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.Material
	 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getMaterial()
	 * @generated
	 */
	int MATERIAL = 19;


	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.Restaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restaurant</em>'.
	 * @see RestaurantMetamodel.Restaurant
	 * @generated
	 */
	EClass getRestaurant();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Restaurant#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see RestaurantMetamodel.Restaurant#getStreet()
	 * @see #getRestaurant()
	 * @generated
	 */
	EAttribute getRestaurant_Street();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Restaurant#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see RestaurantMetamodel.Restaurant#getTelephone()
	 * @see #getRestaurant()
	 * @generated
	 */
	EAttribute getRestaurant_Telephone();

	/**
	 * Returns the meta object for the reference '{@link RestaurantMetamodel.Restaurant#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City</em>'.
	 * @see RestaurantMetamodel.Restaurant#getCity()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_City();

	/**
	 * Returns the meta object for the containment reference list '{@link RestaurantMetamodel.Restaurant#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see RestaurantMetamodel.Restaurant#getRooms()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_Rooms();

	/**
	 * Returns the meta object for the containment reference list '{@link RestaurantMetamodel.Restaurant#getOwners <em>Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owners</em>'.
	 * @see RestaurantMetamodel.Restaurant#getOwners()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_Owners();

	/**
	 * Returns the meta object for the containment reference list '{@link RestaurantMetamodel.Restaurant#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see RestaurantMetamodel.Restaurant#getEmployees()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_Employees();

	/**
	 * Returns the meta object for the containment reference list '{@link RestaurantMetamodel.Restaurant#getMenus <em>Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menus</em>'.
	 * @see RestaurantMetamodel.Restaurant#getMenus()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_Menus();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Restaurant#getNumberOfEmployes <em>Number Of Employes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Employes</em>'.
	 * @see RestaurantMetamodel.Restaurant#getNumberOfEmployes()
	 * @see #getRestaurant()
	 * @generated
	 */
	EAttribute getRestaurant_NumberOfEmployes();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Restaurant#getTotalArea <em>Total Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Area</em>'.
	 * @see RestaurantMetamodel.Restaurant#getTotalArea()
	 * @see #getRestaurant()
	 * @generated
	 */
	EAttribute getRestaurant_TotalArea();

	/**
	 * Returns the meta object for the '{@link RestaurantMetamodel.Restaurant#hasAccessibleToilets() <em>Has Accessible Toilets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Accessible Toilets</em>' operation.
	 * @see RestaurantMetamodel.Restaurant#hasAccessibleToilets()
	 * @generated
	 */
	EOperation getRestaurant__HasAccessibleToilets();

	/**
	 * Returns the meta object for the '{@link RestaurantMetamodel.Restaurant#MustBeOwned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Be Owned</em>' operation.
	 * @see RestaurantMetamodel.Restaurant#MustBeOwned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRestaurant__MustBeOwned__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see RestaurantMetamodel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RestaurantMetamodel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see RestaurantMetamodel.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.City#getCap <em>Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cap</em>'.
	 * @see RestaurantMetamodel.City#getCap()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Cap();

	/**
	 * Returns the meta object for the reference '{@link RestaurantMetamodel.City#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see RestaurantMetamodel.City#getRegion()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Region();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see RestaurantMetamodel.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see RestaurantMetamodel.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link RestaurantMetamodel.Diagram#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see RestaurantMetamodel.Diagram#getElements()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Elements();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RestaurantMetamodel.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see RestaurantMetamodel.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Person#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see RestaurantMetamodel.Person#getSurname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Surname();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Person#getFiscalCode <em>Fiscal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fiscal Code</em>'.
	 * @see RestaurantMetamodel.Person#getFiscalCode()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FiscalCode();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Person#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see RestaurantMetamodel.Person#getBirthDate()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BirthDate();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Person#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see RestaurantMetamodel.Person#getGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for the reference '{@link RestaurantMetamodel.Person#getBirthPlace <em>Birth Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Birth Place</em>'.
	 * @see RestaurantMetamodel.Person#getBirthPlace()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_BirthPlace();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.Owner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owner</em>'.
	 * @see RestaurantMetamodel.Owner
	 * @generated
	 */
	EClass getOwner();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Owner#getVat <em>Vat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vat</em>'.
	 * @see RestaurantMetamodel.Owner#getVat()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Vat();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see RestaurantMetamodel.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Employee#getContractExpirationDate <em>Contract Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract Expiration Date</em>'.
	 * @see RestaurantMetamodel.Employee#getContractExpirationDate()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_ContractExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Employee#getContractSignDate <em>Contract Sign Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract Sign Date</em>'.
	 * @see RestaurantMetamodel.Employee#getContractSignDate()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_ContractSignDate();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Employee#getSalary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary</em>'.
	 * @see RestaurantMetamodel.Employee#getSalary()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Salary();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Employee#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see RestaurantMetamodel.Employee#getRole()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Role();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see RestaurantMetamodel.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link RestaurantMetamodel.Menu#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see RestaurantMetamodel.Menu#getCourses()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Courses();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Menu#getNumberOfCourses <em>Number Of Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Courses</em>'.
	 * @see RestaurantMetamodel.Menu#getNumberOfCourses()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_NumberOfCourses();

	/**
	 * Returns the meta object for the '{@link RestaurantMetamodel.Menu#hasCourseType(RestaurantMetamodel.CourseType) <em>Has Course Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Course Type</em>' operation.
	 * @see RestaurantMetamodel.Menu#hasCourseType(RestaurantMetamodel.CourseType)
	 * @generated
	 */
	EOperation getMenu__HasCourseType__CourseType();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see RestaurantMetamodel.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Course#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see RestaurantMetamodel.Course#getPrice()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Price();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Course#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see RestaurantMetamodel.Course#getType()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Type();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Course#getNumberOfPieces <em>Number Of Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Pieces</em>'.
	 * @see RestaurantMetamodel.Course#getNumberOfPieces()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_NumberOfPieces();

	/**
	 * Returns the meta object for the '{@link RestaurantMetamodel.Course#NonNegativeNumberOfPieces(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Negative Number Of Pieces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Negative Number Of Pieces</em>' operation.
	 * @see RestaurantMetamodel.Course#NonNegativeNumberOfPieces(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCourse__NonNegativeNumberOfPieces__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.RestaurantArea <em>Restaurant Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restaurant Area</em>'.
	 * @see RestaurantMetamodel.RestaurantArea
	 * @generated
	 */
	EClass getRestaurantArea();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.RestaurantArea#getPerimeter <em>Perimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perimeter</em>'.
	 * @see RestaurantMetamodel.RestaurantArea#getPerimeter()
	 * @see #getRestaurantArea()
	 * @generated
	 */
	EAttribute getRestaurantArea_Perimeter();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.RestaurantArea#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see RestaurantMetamodel.RestaurantArea#getArea()
	 * @see #getRestaurantArea()
	 * @generated
	 */
	EAttribute getRestaurantArea_Area();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.DiningRoom <em>Dining Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dining Room</em>'.
	 * @see RestaurantMetamodel.DiningRoom
	 * @generated
	 */
	EClass getDiningRoom();

	/**
	 * Returns the meta object for the containment reference list '{@link RestaurantMetamodel.DiningRoom#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see RestaurantMetamodel.DiningRoom#getTables()
	 * @see #getDiningRoom()
	 * @generated
	 */
	EReference getDiningRoom_Tables();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.DiningRoom#getNumberOfTables <em>Number Of Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Tables</em>'.
	 * @see RestaurantMetamodel.DiningRoom#getNumberOfTables()
	 * @see #getDiningRoom()
	 * @generated
	 */
	EAttribute getDiningRoom_NumberOfTables();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see RestaurantMetamodel.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Table#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see RestaurantMetamodel.Table#getNumber()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Number();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Table#getNumberOfSeats <em>Number Of Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Seats</em>'.
	 * @see RestaurantMetamodel.Table#getNumberOfSeats()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_NumberOfSeats();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Table#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material</em>'.
	 * @see RestaurantMetamodel.Table#getMaterial()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Material();

	/**
	 * Returns the meta object for the container reference '{@link RestaurantMetamodel.Table#getDiningRoom <em>Dining Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dining Room</em>'.
	 * @see RestaurantMetamodel.Table#getDiningRoom()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_DiningRoom();

	/**
	 * Returns the meta object for the '{@link RestaurantMetamodel.Table#UniqueTableNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Table Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Table Number</em>' operation.
	 * @see RestaurantMetamodel.Table#UniqueTableNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTable__UniqueTableNumber__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.Kitchen <em>Kitchen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kitchen</em>'.
	 * @see RestaurantMetamodel.Kitchen
	 * @generated
	 */
	EClass getKitchen();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Kitchen#getNumberOfStoves <em>Number Of Stoves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Stoves</em>'.
	 * @see RestaurantMetamodel.Kitchen#getNumberOfStoves()
	 * @see #getKitchen()
	 * @generated
	 */
	EAttribute getKitchen_NumberOfStoves();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.Bathroom <em>Bathroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bathroom</em>'.
	 * @see RestaurantMetamodel.Bathroom
	 * @generated
	 */
	EClass getBathroom();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Bathroom#getNumberOfToilets <em>Number Of Toilets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Toilets</em>'.
	 * @see RestaurantMetamodel.Bathroom#getNumberOfToilets()
	 * @see #getBathroom()
	 * @generated
	 */
	EAttribute getBathroom_NumberOfToilets();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Bathroom#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see RestaurantMetamodel.Bathroom#getGender()
	 * @see #getBathroom()
	 * @generated
	 */
	EAttribute getBathroom_Gender();

	/**
	 * Returns the meta object for the attribute '{@link RestaurantMetamodel.Bathroom#isIsAccessible <em>Is Accessible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Accessible</em>'.
	 * @see RestaurantMetamodel.Bathroom#isIsAccessible()
	 * @see #getBathroom()
	 * @generated
	 */
	EAttribute getBathroom_IsAccessible();

	/**
	 * Returns the meta object for class '{@link RestaurantMetamodel.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element</em>'.
	 * @see RestaurantMetamodel.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for enum '{@link RestaurantMetamodel.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see RestaurantMetamodel.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the meta object for enum '{@link RestaurantMetamodel.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see RestaurantMetamodel.Role
	 * @generated
	 */
	EEnum getRole();

	/**
	 * Returns the meta object for enum '{@link RestaurantMetamodel.CourseType <em>Course Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Type</em>'.
	 * @see RestaurantMetamodel.CourseType
	 * @generated
	 */
	EEnum getCourseType();

	/**
	 * Returns the meta object for enum '{@link RestaurantMetamodel.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Material</em>'.
	 * @see RestaurantMetamodel.Material
	 * @generated
	 */
	EEnum getMaterial();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestaurantMetamodelFactory getRestaurantMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.RestaurantImpl <em>Restaurant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.RestaurantImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getRestaurant()
		 * @generated
		 */
		EClass RESTAURANT = eINSTANCE.getRestaurant();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT__STREET = eINSTANCE.getRestaurant_Street();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT__TELEPHONE = eINSTANCE.getRestaurant_Telephone();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__CITY = eINSTANCE.getRestaurant_City();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__ROOMS = eINSTANCE.getRestaurant_Rooms();

		/**
		 * The meta object literal for the '<em><b>Owners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__OWNERS = eINSTANCE.getRestaurant_Owners();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__EMPLOYEES = eINSTANCE.getRestaurant_Employees();

		/**
		 * The meta object literal for the '<em><b>Menus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__MENUS = eINSTANCE.getRestaurant_Menus();

		/**
		 * The meta object literal for the '<em><b>Number Of Employes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT__NUMBER_OF_EMPLOYES = eINSTANCE.getRestaurant_NumberOfEmployes();

		/**
		 * The meta object literal for the '<em><b>Total Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT__TOTAL_AREA = eINSTANCE.getRestaurant_TotalArea();

		/**
		 * The meta object literal for the '<em><b>Has Accessible Toilets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESTAURANT___HAS_ACCESSIBLE_TOILETS = eINSTANCE.getRestaurant__HasAccessibleToilets();

		/**
		 * The meta object literal for the '<em><b>Must Be Owned</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESTAURANT___MUST_BE_OWNED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRestaurant__MustBeOwned__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.NamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.NamedElement
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.CityImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__CAP = eINSTANCE.getCity_Cap();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__REGION = eINSTANCE.getCity_Region();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.RegionImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.DiagramImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__ELEMENTS = eINSTANCE.getDiagram_Elements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.PersonImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SURNAME = eINSTANCE.getPerson_Surname();

		/**
		 * The meta object literal for the '<em><b>Fiscal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FISCAL_CODE = eINSTANCE.getPerson_FiscalCode();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTH_DATE = eINSTANCE.getPerson_BirthDate();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '<em><b>Birth Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__BIRTH_PLACE = eINSTANCE.getPerson_BirthPlace();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.OwnerImpl <em>Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.OwnerImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getOwner()
		 * @generated
		 */
		EClass OWNER = eINSTANCE.getOwner();

		/**
		 * The meta object literal for the '<em><b>Vat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__VAT = eINSTANCE.getOwner_Vat();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.EmployeeImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Contract Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__CONTRACT_EXPIRATION_DATE = eINSTANCE.getEmployee_ContractExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Contract Sign Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__CONTRACT_SIGN_DATE = eINSTANCE.getEmployee_ContractSignDate();

		/**
		 * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__SALARY = eINSTANCE.getEmployee_Salary();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__ROLE = eINSTANCE.getEmployee_Role();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.MenuImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__COURSES = eINSTANCE.getMenu_Courses();

		/**
		 * The meta object literal for the '<em><b>Number Of Courses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__NUMBER_OF_COURSES = eINSTANCE.getMenu_NumberOfCourses();

		/**
		 * The meta object literal for the '<em><b>Has Course Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MENU___HAS_COURSE_TYPE__COURSETYPE = eINSTANCE.getMenu__HasCourseType__CourseType();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.CourseImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__PRICE = eINSTANCE.getCourse_Price();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__TYPE = eINSTANCE.getCourse_Type();

		/**
		 * The meta object literal for the '<em><b>Number Of Pieces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NUMBER_OF_PIECES = eINSTANCE.getCourse_NumberOfPieces();

		/**
		 * The meta object literal for the '<em><b>Non Negative Number Of Pieces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSE___NON_NEGATIVE_NUMBER_OF_PIECES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCourse__NonNegativeNumberOfPieces__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.RestaurantAreaImpl <em>Restaurant Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.RestaurantAreaImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getRestaurantArea()
		 * @generated
		 */
		EClass RESTAURANT_AREA = eINSTANCE.getRestaurantArea();

		/**
		 * The meta object literal for the '<em><b>Perimeter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT_AREA__PERIMETER = eINSTANCE.getRestaurantArea_Perimeter();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT_AREA__AREA = eINSTANCE.getRestaurantArea_Area();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.DiningRoomImpl <em>Dining Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.DiningRoomImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getDiningRoom()
		 * @generated
		 */
		EClass DINING_ROOM = eINSTANCE.getDiningRoom();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DINING_ROOM__TABLES = eINSTANCE.getDiningRoom_Tables();

		/**
		 * The meta object literal for the '<em><b>Number Of Tables</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DINING_ROOM__NUMBER_OF_TABLES = eINSTANCE.getDiningRoom_NumberOfTables();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.TableImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NUMBER = eINSTANCE.getTable_Number();

		/**
		 * The meta object literal for the '<em><b>Number Of Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NUMBER_OF_SEATS = eINSTANCE.getTable_NumberOfSeats();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__MATERIAL = eINSTANCE.getTable_Material();

		/**
		 * The meta object literal for the '<em><b>Dining Room</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__DINING_ROOM = eINSTANCE.getTable_DiningRoom();

		/**
		 * The meta object literal for the '<em><b>Unique Table Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___UNIQUE_TABLE_NUMBER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTable__UniqueTableNumber__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.KitchenImpl <em>Kitchen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.KitchenImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getKitchen()
		 * @generated
		 */
		EClass KITCHEN = eINSTANCE.getKitchen();

		/**
		 * The meta object literal for the '<em><b>Number Of Stoves</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KITCHEN__NUMBER_OF_STOVES = eINSTANCE.getKitchen_NumberOfStoves();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.BathroomImpl <em>Bathroom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.BathroomImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getBathroom()
		 * @generated
		 */
		EClass BATHROOM = eINSTANCE.getBathroom();

		/**
		 * The meta object literal for the '<em><b>Number Of Toilets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATHROOM__NUMBER_OF_TOILETS = eINSTANCE.getBathroom_NumberOfToilets();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATHROOM__GENDER = eINSTANCE.getBathroom_Gender();

		/**
		 * The meta object literal for the '<em><b>Is Accessible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATHROOM__IS_ACCESSIBLE = eINSTANCE.getBathroom_IsAccessible();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.impl.DiagramElementImpl
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getDiagramElement()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.Gender
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.Role
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.CourseType <em>Course Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.CourseType
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getCourseType()
		 * @generated
		 */
		EEnum COURSE_TYPE = eINSTANCE.getCourseType();

		/**
		 * The meta object literal for the '{@link RestaurantMetamodel.Material <em>Material</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RestaurantMetamodel.Material
		 * @see RestaurantMetamodel.impl.RestaurantMetamodelPackageImpl#getMaterial()
		 * @generated
		 */
		EEnum MATERIAL = eINSTANCE.getMaterial();

	}

} //RestaurantMetamodelPackage
