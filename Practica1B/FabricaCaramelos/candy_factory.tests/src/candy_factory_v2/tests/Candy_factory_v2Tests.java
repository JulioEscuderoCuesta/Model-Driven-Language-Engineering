/**
 */
package candy_factory_v2.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>candy_factory_v2</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Candy_factory_v2Tests extends TestSuite {

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
		TestSuite suite = new Candy_factory_v2Tests("candy_factory_v2 Tests");
		suite.addTestSuite(FactoryTest.class);
		suite.addTestSuite(ConveyorBeltTest.class);
		suite.addTestSuite(AssemblerTest.class);
		suite.addTestSuite(FlattenerTest.class);
		suite.addTestSuite(CandyProducerTest.class);
		suite.addTestSuite(StickProducerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Candy_factory_v2Tests(String name) {
		super(name);
	}

} //Candy_factory_v2Tests
