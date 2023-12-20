/**
 */
package flight_planner.tests;

import flight_planner.Flight_plannerFactory;
import flight_planner.MaintenanceHangar;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Maintenance Hangar</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaintenanceHangarTest extends InfrastructureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MaintenanceHangarTest.class);
	}

	/**
	 * Constructs a new Maintenance Hangar test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceHangarTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Maintenance Hangar test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MaintenanceHangar getFixture() {
		return (MaintenanceHangar)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Flight_plannerFactory.eINSTANCE.createMaintenanceHangar());
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

} //MaintenanceHangarTest
