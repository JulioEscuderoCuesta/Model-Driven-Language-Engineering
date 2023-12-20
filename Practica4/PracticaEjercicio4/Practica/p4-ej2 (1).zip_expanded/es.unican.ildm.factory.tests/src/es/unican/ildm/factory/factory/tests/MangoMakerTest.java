/**
 */
package es.unican.ildm.factory.factory.tests;

import es.unican.ildm.factory.factory.FactoryFactory;
import es.unican.ildm.factory.factory.MangoMaker;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mango Maker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MangoMakerTest extends MakerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MangoMakerTest.class);
	}

	/**
	 * Constructs a new Mango Maker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MangoMakerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mango Maker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MangoMaker getFixture() {
		return (MangoMaker)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FactoryFactory.eINSTANCE.createMangoMaker());
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

} //MangoMakerTest
