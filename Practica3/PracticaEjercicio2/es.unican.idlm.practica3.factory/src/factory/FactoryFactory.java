/**
 */
package factory;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see factory.FactoryPackage
 * @generated
 */
public interface FactoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FactoryFactory eINSTANCE = factory.impl.FactoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factory</em>'.
	 * @generated
	 */
	Factory createFactory();

	/**
	 * Returns a new object of class '<em>Assembler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembler</em>'.
	 * @generated
	 */
	Assembler createAssembler();

	/**
	 * Returns a new object of class '<em>Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wrapper</em>'.
	 * @generated
	 */
	Wrapper createWrapper();

	/**
	 * Returns a new object of class '<em>Stick Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stick Producer</em>'.
	 * @generated
	 */
	StickProducer createStickProducer();

	/**
	 * Returns a new object of class '<em>Candy Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Candy Producer</em>'.
	 * @generated
	 */
	CandyProducer createCandyProducer();

	/**
	 * Returns a new object of class '<em>Conveyor Belt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conveyor Belt</em>'.
	 * @generated
	 */
	ConveyorBelt createConveyorBelt();

	/**
	 * Returns a new object of class '<em>Candy Flat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Candy Flat</em>'.
	 * @generated
	 */
	CandyFlat createCandyFlat();

	/**
	 * Returns a new object of class '<em>Stick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stick</em>'.
	 * @generated
	 */
	Stick createStick();

	/**
	 * Returns a new object of class '<em>Candy Ball</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Candy Ball</em>'.
	 * @generated
	 */
	CandyBall createCandyBall();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Lollipop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lollipop</em>'.
	 * @generated
	 */
	Lollipop createLollipop();

	/**
	 * Returns a new object of class '<em>Flattener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flattener</em>'.
	 * @generated
	 */
	Flattener createFlattener();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FactoryPackage getFactoryPackage();

} //FactoryFactory
