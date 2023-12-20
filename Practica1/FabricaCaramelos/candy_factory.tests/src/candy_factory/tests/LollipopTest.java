/**
 */
package candy_factory.tests;

import candy_factory.Candy_factoryFactory;
import candy_factory.Lollipop;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lollipop</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LollipopTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LollipopTest.class);
	}

	/**
	 * Constructs a new Lollipop test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LollipopTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lollipop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Lollipop getFixture() {
		return (Lollipop)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Candy_factoryFactory.eINSTANCE.createLollipop());
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

} //LollipopTest
