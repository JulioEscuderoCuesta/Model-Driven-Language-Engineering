/**
 */
package candy_factory_v2.tests;

import candy_factory_v2.CandyFlat;
import candy_factory_v2.Candy_factory_v2Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Candy Flat</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CandyFlatTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CandyFlatTest.class);
	}

	/**
	 * Constructs a new Candy Flat test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandyFlatTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Candy Flat test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CandyFlat getFixture() {
		return (CandyFlat)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Candy_factory_v2Factory.eINSTANCE.createCandyFlat());
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

} //CandyFlatTest
