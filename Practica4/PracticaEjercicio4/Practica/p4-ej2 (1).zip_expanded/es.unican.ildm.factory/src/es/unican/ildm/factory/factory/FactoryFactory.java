/**
 */
package es.unican.ildm.factory.factory;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.unican.ildm.factory.factory.FactoryPackage
 * @generated
 */
public interface FactoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FactoryFactory eINSTANCE = es.unican.ildm.factory.factory.impl.FactoryFactoryImpl.init();

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
	 * Returns a new object of class '<em>Cuerpo Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cuerpo Maker</em>'.
	 * @generated
	 */
	CuerpoMaker createCuerpoMaker();

	/**
	 * Returns a new object of class '<em>Mango Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mango Maker</em>'.
	 * @generated
	 */
	MangoMaker createMangoMaker();

	/**
	 * Returns a new object of class '<em>Tray</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tray</em>'.
	 * @generated
	 */
	Tray createTray();

	/**
	 * Returns a new object of class '<em>Mango</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mango</em>'.
	 * @generated
	 */
	Mango createMango();

	/**
	 * Returns a new object of class '<em>Cuerpo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cuerpo</em>'.
	 * @generated
	 */
	Cuerpo createCuerpo();

	/**
	 * Returns a new object of class '<em>Sarten</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sarten</em>'.
	 * @generated
	 */
	Sarten createSarten();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FactoryPackage getFactoryPackage();

} //FactoryFactory
