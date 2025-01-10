/**
 */
package RestaurantMetamodel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>RestaurantMetamodel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestaurantMetamodelTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new RestaurantMetamodelTests("RestaurantMetamodel Tests");
		suite.addTestSuite(RestaurantTest.class);
		suite.addTestSuite(MenuTest.class);
		suite.addTestSuite(CourseTest.class);
		suite.addTestSuite(DiningRoomTest.class);
		suite.addTestSuite(TableTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantMetamodelTests(String name) {
		super(name);
	}

} //RestaurantMetamodelTests
