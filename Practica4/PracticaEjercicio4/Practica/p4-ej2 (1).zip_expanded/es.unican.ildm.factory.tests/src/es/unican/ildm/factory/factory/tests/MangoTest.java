/**
 */
package es.unican.ildm.factory.factory.tests;

import es.unican.ildm.factory.factory.FactoryFactory;
import es.unican.ildm.factory.factory.Mango;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mango</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MangoTest extends PartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MangoTest.class);
	}

	/**
	 * Constructs a new Mango test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MangoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mango test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Mango getFixture() {
		return (Mango)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FactoryFactory.eINSTANCE.createMango());
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

} //MangoTest
