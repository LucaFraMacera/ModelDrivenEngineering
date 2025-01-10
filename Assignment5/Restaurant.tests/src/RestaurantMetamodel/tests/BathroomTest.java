/**
 */
package RestaurantMetamodel.tests;

import RestaurantMetamodel.Bathroom;
import RestaurantMetamodel.RestaurantMetamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bathroom</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BathroomTest extends RestaurantAreaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BathroomTest.class);
	}

	/**
	 * Constructs a new Bathroom test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BathroomTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bathroom test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Bathroom getFixture() {
		return (Bathroom)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestaurantMetamodelFactory.eINSTANCE.createBathroom());
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

} //BathroomTest
