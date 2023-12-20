/**
 */
package candy_factory_v2.tests;

import candy_factory_v2.CandyBall;
import candy_factory_v2.Candy_factory_v2Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Candy Ball</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CandyBallTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CandyBallTest.class);
	}

	/**
	 * Constructs a new Candy Ball test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandyBallTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Candy Ball test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CandyBall getFixture() {
		return (CandyBall)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Candy_factory_v2Factory.eINSTANCE.createCandyBall());
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

} //CandyBallTest
