/**
 */
package candy_factory.tests;

import candy_factory.Candy_factoryFactory;
import candy_factory.ConveyorBelt;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conveyor Belt</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConveyorBeltTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConveyorBeltTest.class);
	}

	/**
	 * Constructs a new Conveyor Belt test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyorBeltTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Conveyor Belt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConveyorBelt getFixture() {
		return (ConveyorBelt)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Candy_factoryFactory.eINSTANCE.createConveyorBelt());
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

} //ConveyorBeltTest
