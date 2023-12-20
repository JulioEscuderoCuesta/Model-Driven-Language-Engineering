/**
 */
package es.unican.ildm.factory.factory.tests;

import es.unican.ildm.factory.factory.FactoryFactory;
import es.unican.ildm.factory.factory.Tray;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tray</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrayTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TrayTest.class);
	}

	/**
	 * Constructs a new Tray test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrayTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tray test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Tray getFixture() {
		return (Tray)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FactoryFactory.eINSTANCE.createTray());
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

} //TrayTest
