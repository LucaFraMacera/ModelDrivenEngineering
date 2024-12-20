/**
 */
package RestaurantMetamodel.tests;

import RestaurantMetamodel.DiningRoom;
import RestaurantMetamodel.RestaurantMetamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dining Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link RestaurantMetamodel.DiningRoom#getNumberOfTables() <em>Number Of Tables</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DiningRoomTest extends RestaurantAreaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiningRoomTest.class);
	}

	/**
	 * Constructs a new Dining Room test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiningRoomTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dining Room test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DiningRoom getFixture() {
		return (DiningRoom)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestaurantMetamodelFactory.eINSTANCE.createDiningRoom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link RestaurantMetamodel.DiningRoom#getNumberOfTables() <em>Number Of Tables</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.DiningRoom#getNumberOfTables()
	 * @generated
	 */
	public void testGetNumberOfTables() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link RestaurantMetamodel.DiningRoom#setNumberOfTables(int) <em>Number Of Tables</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RestaurantMetamodel.DiningRoom#setNumberOfTables(int)
	 * @generated
	 */
	public void testSetNumberOfTables() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DiningRoomTest
