/**
 */
package es.unican.ildm.factory.factory;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.unican.ildm.factory.factory.FactoryFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface FactoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "factory";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unican.es/ildm/factory";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "factory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FactoryPackage eINSTANCE = es.unican.ildm.factory.factory.impl.FactoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unican.ildm.factory.factory.impl.FactoryImpl <em>Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.ildm.factory.factory.impl.FactoryImpl
	 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getFactory()
	 * @generated
	 */
	int FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Total Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__TOTAL_COUNTER = 1;

	/**
	 * The feature id for the '<em><b>Current Parts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__CURRENT_PARTS = 2;

	/**
	 * The feature id for the '<em><b>Trays</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__TRAYS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__NAME = 4;

	/**
	 * The number of structural features of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.ildm.factory.factory.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.ildm.factory.factory.impl.ElementImpl
	 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__Y = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__Z = 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.ildm.factory.factory.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.ildm.factory.factory.impl.MachineImpl
	 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__X = ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__Y = ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__Z = ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Tiempo Procesado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__TIEMPO_PROCESADO = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__INPUT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OUTPUT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.ildm.factory.factory.impl.MakerImpl <em>Maker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.ildm.factory.factory.impl.MakerImpl
	 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getMaker()
	 * @generated
	 */
	int MAKER = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKER__X = MACHINE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKER__Y = MACHINE__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKER__Z = MACHINE__Z;

	/**
	 * The feature id for the '<em><b>Tiempo Procesado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKER__TIEMPO_PROCESADO = MACHINE__TIEMPO_PROCESADO;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKER__INPUT = MACHINE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKER__OUTPUT = MACHINE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKER__COUNTER = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKER_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKER_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.ildm.factory.factory.impl.AssemblerImpl <em>Assembler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.ildm.factory.factory.impl.AssemblerImpl
	 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getAssembler()
	 * @generated
	 */
	int ASSEMBLER = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__X = MACHINE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__Y = MACHINE__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__Z = MACHINE__Z;

	/**
	 * The feature id for the '<em><b>Tiempo Procesado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__TIEMPO_PROCESADO = MACHINE__TIEMPO_PROCESADO;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__INPUT = MACHINE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__OUTPUT = MACHINE__OUTPUT;

	/**
	 * The number of structural features of the '<em>Assembler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assembler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.ildm.factory.factory.impl.WrapperImpl <em>Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.ildm.factory.factory.impl.WrapperImpl
	 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getWrapper()
	 * @generated
	 */
	int WRAPPER = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER__X = MACHINE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER__Y = MACHINE__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER__Z = MACHINE__Z;

	/**
	 * The feature id for the '<em><b>Tiempo Procesado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER__TIEMPO_PROCESADO = MACHINE__TIEMPO_PROCESADO;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER__INPUT = MACHINE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER__OUTPUT = MACHINE__OUTPUT;

	/**
	 * The number of structural features of the '<em>Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.ildm.factory.factory.impl.CuerpoMakerImpl <em>Cuerpo Maker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.ildm.factory.factory.impl.CuerpoMakerImpl
	 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getCuerpoMaker()
	 * @generated
	 */
	int CUERPO_MAKER = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUERPO_MAKER__X = MAKER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUERPO_MAKER__Y = MAKER__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUERPO_MAKER__NAME = MAKER__NAME;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUERPO_MAKER__Z = MAKER__Z;

	/**
	 * The feature id for the '<em><b>Tiempo Procesado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUERPO_MAKER__TIEMPO_PROCESADO = MAKER__TIEMPO_PROCESADO;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUERPO_MAKER__INPUT = MAKER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUERPO_MAKER__OUTPUT = MAKER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUERPO_MAKER__COUNTER = MAKER__COUNTER;

	/**
	 * The number of structural features of the '<em>Cuerpo Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUERPO_MAKER_FEATURE_COUNT = MAKER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cuerpo Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUERPO_MAKER_OPERATION_COUNT = MAKER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.ildm.factory.factory.impl.MangoMakerImpl <em>Mango Maker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.ildm.factory.factory.impl.MangoMakerImpl
	 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getMangoMaker()
	 * @generated
	 */
	int MANGO_MAKER = 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANGO_MAKER__X = MAKER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANGO_MAKER__Y = MAKER__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANGO_MAKER__NAME = MAKER__NAME;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANGO_MAKER__Z = MAKER__Z;

	/**
	 * The feature id for the '<em><b>Tiempo Procesado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANGO_MAKER__TIEMPO_PROCESADO = MAKER__TIEMPO_PROCESADO;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANGO_MAKER__INPUT = MAKER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANGO_MAKER__OUTPUT = MAKER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANGO_MAKER__COUNTER = MAKER__COUNTER;

	/**
	 * The number of structural features of the '<em>Mango Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANGO_MAKER_FEATURE_COUNT = MAKER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mango Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANGO_MAKER_OPERATION_COUNT = MAKER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.ildm.factory.factory.impl.TrayImpl <em>Tray</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.ildm.factory.factory.impl.TrayImpl
	 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getTray()
	 * @generated
	 */
	int TRAY = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__X = ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__Y = ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__Z = ELEMENT__Z;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__CAPACITY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__SOURCE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__TARGET = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__PARTS = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.ildm.factory.factory.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.ildm.factory.factory.impl.PartImpl
	 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getPart()
	 * @generated
	 */
	int PART = 9;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.ildm.factory.factory.impl.MangoImpl <em>Mango</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.ildm.factory.factory.impl.MangoImpl
	 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getMango()
	 * @generated
	 */
	int MANGO = 10;

	/**
	 * The number of structural features of the '<em>Mango</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANGO_FEATURE_COUNT = PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mango</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANGO_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.ildm.factory.factory.impl.CuerpoImpl <em>Cuerpo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.ildm.factory.factory.impl.CuerpoImpl
	 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getCuerpo()
	 * @generated
	 */
	int CUERPO = 11;

	/**
	 * The number of structural features of the '<em>Cuerpo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUERPO_FEATURE_COUNT = PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cuerpo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUERPO_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.ildm.factory.factory.impl.SartenImpl <em>Sarten</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.ildm.factory.factory.impl.SartenImpl
	 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getSarten()
	 * @generated
	 */
	int SARTEN = 12;

	/**
	 * The number of structural features of the '<em>Sarten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SARTEN_FEATURE_COUNT = PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sarten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SARTEN_OPERATION_COUNT = PART_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.unican.ildm.factory.factory.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory</em>'.
	 * @see es.unican.ildm.factory.factory.Factory
	 * @generated
	 */
	EClass getFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.ildm.factory.factory.Factory#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see es.unican.ildm.factory.factory.Factory#getElements()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_Elements();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.ildm.factory.factory.Factory#getTotalCounter <em>Total Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Counter</em>'.
	 * @see es.unican.ildm.factory.factory.Factory#getTotalCounter()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_TotalCounter();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.ildm.factory.factory.Factory#getCurrentParts <em>Current Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Parts</em>'.
	 * @see es.unican.ildm.factory.factory.Factory#getCurrentParts()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_CurrentParts();

	/**
	 * Returns the meta object for the reference list '{@link es.unican.ildm.factory.factory.Factory#getTrays <em>Trays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trays</em>'.
	 * @see es.unican.ildm.factory.factory.Factory#getTrays()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_Trays();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.ildm.factory.factory.Factory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.ildm.factory.factory.Factory#getName()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_Name();

	/**
	 * Returns the meta object for class '{@link es.unican.ildm.factory.factory.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see es.unican.ildm.factory.factory.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.ildm.factory.factory.Element#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see es.unican.ildm.factory.factory.Element#getX()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_X();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.ildm.factory.factory.Element#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see es.unican.ildm.factory.factory.Element#getY()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Y();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.ildm.factory.factory.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.ildm.factory.factory.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.ildm.factory.factory.Element#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see es.unican.ildm.factory.factory.Element#getZ()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Z();

	/**
	 * Returns the meta object for class '{@link es.unican.ildm.factory.factory.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see es.unican.ildm.factory.factory.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.ildm.factory.factory.Machine#getTiempoProcesado <em>Tiempo Procesado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiempo Procesado</em>'.
	 * @see es.unican.ildm.factory.factory.Machine#getTiempoProcesado()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_TiempoProcesado();

	/**
	 * Returns the meta object for the reference list '{@link es.unican.ildm.factory.factory.Machine#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see es.unican.ildm.factory.factory.Machine#getInput()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Input();

	/**
	 * Returns the meta object for the reference '{@link es.unican.ildm.factory.factory.Machine#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see es.unican.ildm.factory.factory.Machine#getOutput()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Output();

	/**
	 * Returns the meta object for class '{@link es.unican.ildm.factory.factory.Maker <em>Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maker</em>'.
	 * @see es.unican.ildm.factory.factory.Maker
	 * @generated
	 */
	EClass getMaker();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.ildm.factory.factory.Maker#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see es.unican.ildm.factory.factory.Maker#getCounter()
	 * @see #getMaker()
	 * @generated
	 */
	EAttribute getMaker_Counter();

	/**
	 * Returns the meta object for class '{@link es.unican.ildm.factory.factory.Assembler <em>Assembler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembler</em>'.
	 * @see es.unican.ildm.factory.factory.Assembler
	 * @generated
	 */
	EClass getAssembler();

	/**
	 * Returns the meta object for class '{@link es.unican.ildm.factory.factory.Wrapper <em>Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wrapper</em>'.
	 * @see es.unican.ildm.factory.factory.Wrapper
	 * @generated
	 */
	EClass getWrapper();

	/**
	 * Returns the meta object for class '{@link es.unican.ildm.factory.factory.CuerpoMaker <em>Cuerpo Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cuerpo Maker</em>'.
	 * @see es.unican.ildm.factory.factory.CuerpoMaker
	 * @generated
	 */
	EClass getCuerpoMaker();

	/**
	 * Returns the meta object for class '{@link es.unican.ildm.factory.factory.MangoMaker <em>Mango Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mango Maker</em>'.
	 * @see es.unican.ildm.factory.factory.MangoMaker
	 * @generated
	 */
	EClass getMangoMaker();

	/**
	 * Returns the meta object for class '{@link es.unican.ildm.factory.factory.Tray <em>Tray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tray</em>'.
	 * @see es.unican.ildm.factory.factory.Tray
	 * @generated
	 */
	EClass getTray();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.ildm.factory.factory.Tray#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see es.unican.ildm.factory.factory.Tray#getCapacity()
	 * @see #getTray()
	 * @generated
	 */
	EAttribute getTray_Capacity();

	/**
	 * Returns the meta object for the reference '{@link es.unican.ildm.factory.factory.Tray#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see es.unican.ildm.factory.factory.Tray#getSource()
	 * @see #getTray()
	 * @generated
	 */
	EReference getTray_Source();

	/**
	 * Returns the meta object for the reference '{@link es.unican.ildm.factory.factory.Tray#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see es.unican.ildm.factory.factory.Tray#getTarget()
	 * @see #getTray()
	 * @generated
	 */
	EReference getTray_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.ildm.factory.factory.Tray#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see es.unican.ildm.factory.factory.Tray#getParts()
	 * @see #getTray()
	 * @generated
	 */
	EReference getTray_Parts();

	/**
	 * Returns the meta object for class '{@link es.unican.ildm.factory.factory.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see es.unican.ildm.factory.factory.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for class '{@link es.unican.ildm.factory.factory.Mango <em>Mango</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mango</em>'.
	 * @see es.unican.ildm.factory.factory.Mango
	 * @generated
	 */
	EClass getMango();

	/**
	 * Returns the meta object for class '{@link es.unican.ildm.factory.factory.Cuerpo <em>Cuerpo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cuerpo</em>'.
	 * @see es.unican.ildm.factory.factory.Cuerpo
	 * @generated
	 */
	EClass getCuerpo();

	/**
	 * Returns the meta object for class '{@link es.unican.ildm.factory.factory.Sarten <em>Sarten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sarten</em>'.
	 * @see es.unican.ildm.factory.factory.Sarten
	 * @generated
	 */
	EClass getSarten();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FactoryFactory getFactoryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.unican.ildm.factory.factory.impl.FactoryImpl <em>Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.ildm.factory.factory.impl.FactoryImpl
		 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getFactory()
		 * @generated
		 */
		EClass FACTORY = eINSTANCE.getFactory();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__ELEMENTS = eINSTANCE.getFactory_Elements();

		/**
		 * The meta object literal for the '<em><b>Total Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__TOTAL_COUNTER = eINSTANCE.getFactory_TotalCounter();

		/**
		 * The meta object literal for the '<em><b>Current Parts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__CURRENT_PARTS = eINSTANCE.getFactory_CurrentParts();

		/**
		 * The meta object literal for the '<em><b>Trays</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__TRAYS = eINSTANCE.getFactory_Trays();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__NAME = eINSTANCE.getFactory_Name();

		/**
		 * The meta object literal for the '{@link es.unican.ildm.factory.factory.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.ildm.factory.factory.impl.ElementImpl
		 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__X = eINSTANCE.getElement_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__Y = eINSTANCE.getElement_Y();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__Z = eINSTANCE.getElement_Z();

		/**
		 * The meta object literal for the '{@link es.unican.ildm.factory.factory.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.ildm.factory.factory.impl.MachineImpl
		 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Tiempo Procesado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__TIEMPO_PROCESADO = eINSTANCE.getMachine_TiempoProcesado();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__INPUT = eINSTANCE.getMachine_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__OUTPUT = eINSTANCE.getMachine_Output();

		/**
		 * The meta object literal for the '{@link es.unican.ildm.factory.factory.impl.MakerImpl <em>Maker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.ildm.factory.factory.impl.MakerImpl
		 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getMaker()
		 * @generated
		 */
		EClass MAKER = eINSTANCE.getMaker();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAKER__COUNTER = eINSTANCE.getMaker_Counter();

		/**
		 * The meta object literal for the '{@link es.unican.ildm.factory.factory.impl.AssemblerImpl <em>Assembler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.ildm.factory.factory.impl.AssemblerImpl
		 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getAssembler()
		 * @generated
		 */
		EClass ASSEMBLER = eINSTANCE.getAssembler();

		/**
		 * The meta object literal for the '{@link es.unican.ildm.factory.factory.impl.WrapperImpl <em>Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.ildm.factory.factory.impl.WrapperImpl
		 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getWrapper()
		 * @generated
		 */
		EClass WRAPPER = eINSTANCE.getWrapper();

		/**
		 * The meta object literal for the '{@link es.unican.ildm.factory.factory.impl.CuerpoMakerImpl <em>Cuerpo Maker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.ildm.factory.factory.impl.CuerpoMakerImpl
		 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getCuerpoMaker()
		 * @generated
		 */
		EClass CUERPO_MAKER = eINSTANCE.getCuerpoMaker();

		/**
		 * The meta object literal for the '{@link es.unican.ildm.factory.factory.impl.MangoMakerImpl <em>Mango Maker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.ildm.factory.factory.impl.MangoMakerImpl
		 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getMangoMaker()
		 * @generated
		 */
		EClass MANGO_MAKER = eINSTANCE.getMangoMaker();

		/**
		 * The meta object literal for the '{@link es.unican.ildm.factory.factory.impl.TrayImpl <em>Tray</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.ildm.factory.factory.impl.TrayImpl
		 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getTray()
		 * @generated
		 */
		EClass TRAY = eINSTANCE.getTray();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAY__CAPACITY = eINSTANCE.getTray_Capacity();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAY__SOURCE = eINSTANCE.getTray_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAY__TARGET = eINSTANCE.getTray_Target();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAY__PARTS = eINSTANCE.getTray_Parts();

		/**
		 * The meta object literal for the '{@link es.unican.ildm.factory.factory.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.ildm.factory.factory.impl.PartImpl
		 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '{@link es.unican.ildm.factory.factory.impl.MangoImpl <em>Mango</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.ildm.factory.factory.impl.MangoImpl
		 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getMango()
		 * @generated
		 */
		EClass MANGO = eINSTANCE.getMango();

		/**
		 * The meta object literal for the '{@link es.unican.ildm.factory.factory.impl.CuerpoImpl <em>Cuerpo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.ildm.factory.factory.impl.CuerpoImpl
		 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getCuerpo()
		 * @generated
		 */
		EClass CUERPO = eINSTANCE.getCuerpo();

		/**
		 * The meta object literal for the '{@link es.unican.ildm.factory.factory.impl.SartenImpl <em>Sarten</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.ildm.factory.factory.impl.SartenImpl
		 * @see es.unican.ildm.factory.factory.impl.FactoryPackageImpl#getSarten()
		 * @generated
		 */
		EClass SARTEN = eINSTANCE.getSarten();

	}

} //FactoryPackage
