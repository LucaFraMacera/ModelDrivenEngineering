/**
 */
package RestaurantMetamodel.tests;

import RestaurantMetamodel.Kitchen;
import RestaurantMetamodel.RestaurantMetamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Kitchen</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KitchenTest extends RestaurantAreaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KitchenTest.class);
	}

	/**
	 * Constructs a new Kitchen test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KitchenTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Kitchen test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Kitchen getFixture() {
		return (Kitchen)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RestaurantMetamodelFactory.eINSTANCE.createKitchen());
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

} //KitchenTest
