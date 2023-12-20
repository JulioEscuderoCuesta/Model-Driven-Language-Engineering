/**
 */
package es.unican.ildm.factory.factory.tests;

import es.unican.ildm.factory.factory.CuerpoMaker;
import es.unican.ildm.factory.factory.FactoryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cuerpo Maker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CuerpoMakerTest extends MakerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CuerpoMakerTest.class);
	}

	/**
	 * Constructs a new Cuerpo Maker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CuerpoMakerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cuerpo Maker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CuerpoMaker getFixture() {
		return (CuerpoMaker)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FactoryFactory.eINSTANCE.createCuerpoMaker());
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

} //CuerpoMakerTest
