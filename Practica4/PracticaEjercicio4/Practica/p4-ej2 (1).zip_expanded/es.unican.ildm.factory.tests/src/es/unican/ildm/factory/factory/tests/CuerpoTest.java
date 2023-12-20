/**
 */
package es.unican.ildm.factory.factory.tests;

import es.unican.ildm.factory.factory.Cuerpo;
import es.unican.ildm.factory.factory.FactoryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cuerpo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CuerpoTest extends PartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CuerpoTest.class);
	}

	/**
	 * Constructs a new Cuerpo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CuerpoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cuerpo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Cuerpo getFixture() {
		return (Cuerpo)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FactoryFactory.eINSTANCE.createCuerpo());
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

} //CuerpoTest
