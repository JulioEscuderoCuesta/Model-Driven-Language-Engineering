/**
 */
package flight_planner.tests;

import flight_planner.AdministrationOficine;
import flight_planner.Flight_plannerFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Administration Oficine</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdministrationOficineTest extends InfrastructureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdministrationOficineTest.class);
	}

	/**
	 * Constructs a new Administration Oficine test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrationOficineTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Administration Oficine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AdministrationOficine getFixture() {
		return (AdministrationOficine)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Flight_plannerFactory.eINSTANCE.createAdministrationOficine());
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

} //AdministrationOficineTest
