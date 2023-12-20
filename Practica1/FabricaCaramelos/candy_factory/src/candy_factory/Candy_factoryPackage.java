/**
 */
package candy_factory;

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
 * @see candy_factory.Candy_factoryFactory
 * @model kind="package"
 * @generated
 */
public interface Candy_factoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "candy_factory";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unican.es/ildm/candy_factory";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "candy_factory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Candy_factoryPackage eINSTANCE = candy_factory.impl.Candy_factoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link candy_factory.impl.FactoryImpl <em>Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.FactoryImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getFactory()
	 * @generated
	 */
	int FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link candy_factory.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.ElementImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link candy_factory.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.MachineImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__PROCESSING_TIME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OUTPUT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__INPUT = ELEMENT_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link candy_factory.impl.ConveyorBeltImpl <em>Conveyor Belt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.ConveyorBeltImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getConveyorBelt()
	 * @generated
	 */
	int CONVEYOR_BELT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__CAPACITY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__TARGET = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__SOURCE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__COMPONENT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link candy_factory.impl.ProducerImpl <em>Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.ProducerImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getProducer()
	 * @generated
	 */
	int PRODUCER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCER__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCER__PROCESSING_TIME = MACHINE__PROCESSING_TIME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCER__OUTPUT = MACHINE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCER__INPUT = MACHINE__INPUT;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCER__COUNTER = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCER_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCER_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link candy_factory.impl.AssemblerImpl <em>Assembler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.AssemblerImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getAssembler()
	 * @generated
	 */
	int ASSEMBLER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__PROCESSING_TIME = MACHINE__PROCESSING_TIME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__OUTPUT = MACHINE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__INPUT = MACHINE__INPUT;

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
	 * The meta object id for the '{@link candy_factory.impl.WrapperImpl <em>Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.WrapperImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getWrapper()
	 * @generated
	 */
	int WRAPPER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER__PROCESSING_TIME = MACHINE__PROCESSING_TIME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER__OUTPUT = MACHINE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER__INPUT = MACHINE__INPUT;

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
	 * The meta object id for the '{@link candy_factory.impl.FlattenerImpl <em>Flattener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.FlattenerImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getFlattener()
	 * @generated
	 */
	int FLATTENER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTENER__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTENER__PROCESSING_TIME = MACHINE__PROCESSING_TIME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTENER__OUTPUT = MACHINE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTENER__INPUT = MACHINE__INPUT;

	/**
	 * The number of structural features of the '<em>Flattener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTENER_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flattener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTENER_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link candy_factory.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.ComponentImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 8;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link candy_factory.impl.CandyProducerImpl <em>Candy Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.CandyProducerImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getCandyProducer()
	 * @generated
	 */
	int CANDY_PRODUCER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDY_PRODUCER__ID = PRODUCER__ID;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDY_PRODUCER__PROCESSING_TIME = PRODUCER__PROCESSING_TIME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDY_PRODUCER__OUTPUT = PRODUCER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDY_PRODUCER__INPUT = PRODUCER__INPUT;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDY_PRODUCER__COUNTER = PRODUCER__COUNTER;

	/**
	 * The number of structural features of the '<em>Candy Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDY_PRODUCER_FEATURE_COUNT = PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Candy Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDY_PRODUCER_OPERATION_COUNT = PRODUCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link candy_factory.impl.StickProducerImpl <em>Stick Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.StickProducerImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getStickProducer()
	 * @generated
	 */
	int STICK_PRODUCER = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICK_PRODUCER__ID = PRODUCER__ID;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICK_PRODUCER__PROCESSING_TIME = PRODUCER__PROCESSING_TIME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICK_PRODUCER__OUTPUT = PRODUCER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICK_PRODUCER__INPUT = PRODUCER__INPUT;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICK_PRODUCER__COUNTER = PRODUCER__COUNTER;

	/**
	 * The number of structural features of the '<em>Stick Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICK_PRODUCER_FEATURE_COUNT = PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stick Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICK_PRODUCER_OPERATION_COUNT = PRODUCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link candy_factory.impl.StickImpl <em>Stick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.StickImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getStick()
	 * @generated
	 */
	int STICK = 11;

	/**
	 * The number of structural features of the '<em>Stick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICK_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICK_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link candy_factory.impl.CandyFlatImpl <em>Candy Flat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.CandyFlatImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getCandyFlat()
	 * @generated
	 */
	int CANDY_FLAT = 12;

	/**
	 * The number of structural features of the '<em>Candy Flat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDY_FLAT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Candy Flat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDY_FLAT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link candy_factory.impl.CandyBallImpl <em>Candy Ball</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.CandyBallImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getCandyBall()
	 * @generated
	 */
	int CANDY_BALL = 13;

	/**
	 * The number of structural features of the '<em>Candy Ball</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDY_BALL_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Candy Ball</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDY_BALL_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link candy_factory.impl.LollipopImpl <em>Lollipop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see candy_factory.impl.LollipopImpl
	 * @see candy_factory.impl.Candy_factoryPackageImpl#getLollipop()
	 * @generated
	 */
	int LOLLIPOP = 14;

	/**
	 * The number of structural features of the '<em>Lollipop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOLLIPOP_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lollipop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOLLIPOP_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link candy_factory.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory</em>'.
	 * @see candy_factory.Factory
	 * @generated
	 */
	EClass getFactory();

	/**
	 * Returns the meta object for the attribute '{@link candy_factory.Factory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see candy_factory.Factory#getName()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link candy_factory.Factory#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see candy_factory.Factory#getElements()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_Elements();

	/**
	 * Returns the meta object for class '{@link candy_factory.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see candy_factory.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link candy_factory.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see candy_factory.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for class '{@link candy_factory.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see candy_factory.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link candy_factory.Machine#getProcessingTime <em>Processing Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Time</em>'.
	 * @see candy_factory.Machine#getProcessingTime()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_ProcessingTime();

	/**
	 * Returns the meta object for the reference '{@link candy_factory.Machine#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see candy_factory.Machine#getOutput()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Output();

	/**
	 * Returns the meta object for the reference list '{@link candy_factory.Machine#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see candy_factory.Machine#getInput()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Input();

	/**
	 * Returns the meta object for class '{@link candy_factory.ConveyorBelt <em>Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor Belt</em>'.
	 * @see candy_factory.ConveyorBelt
	 * @generated
	 */
	EClass getConveyorBelt();

	/**
	 * Returns the meta object for the attribute '{@link candy_factory.ConveyorBelt#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see candy_factory.ConveyorBelt#getCapacity()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EAttribute getConveyorBelt_Capacity();

	/**
	 * Returns the meta object for the reference '{@link candy_factory.ConveyorBelt#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see candy_factory.ConveyorBelt#getTarget()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_Target();

	/**
	 * Returns the meta object for the reference '{@link candy_factory.ConveyorBelt#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see candy_factory.ConveyorBelt#getSource()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link candy_factory.ConveyorBelt#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see candy_factory.ConveyorBelt#getComponent()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_Component();

	/**
	 * Returns the meta object for class '{@link candy_factory.Producer <em>Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producer</em>'.
	 * @see candy_factory.Producer
	 * @generated
	 */
	EClass getProducer();

	/**
	 * Returns the meta object for the attribute '{@link candy_factory.Producer#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see candy_factory.Producer#getCounter()
	 * @see #getProducer()
	 * @generated
	 */
	EAttribute getProducer_Counter();

	/**
	 * Returns the meta object for class '{@link candy_factory.Assembler <em>Assembler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembler</em>'.
	 * @see candy_factory.Assembler
	 * @generated
	 */
	EClass getAssembler();

	/**
	 * Returns the meta object for class '{@link candy_factory.Wrapper <em>Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wrapper</em>'.
	 * @see candy_factory.Wrapper
	 * @generated
	 */
	EClass getWrapper();

	/**
	 * Returns the meta object for class '{@link candy_factory.Flattener <em>Flattener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flattener</em>'.
	 * @see candy_factory.Flattener
	 * @generated
	 */
	EClass getFlattener();

	/**
	 * Returns the meta object for class '{@link candy_factory.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see candy_factory.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link candy_factory.CandyProducer <em>Candy Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candy Producer</em>'.
	 * @see candy_factory.CandyProducer
	 * @generated
	 */
	EClass getCandyProducer();

	/**
	 * Returns the meta object for class '{@link candy_factory.StickProducer <em>Stick Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stick Producer</em>'.
	 * @see candy_factory.StickProducer
	 * @generated
	 */
	EClass getStickProducer();

	/**
	 * Returns the meta object for class '{@link candy_factory.Stick <em>Stick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stick</em>'.
	 * @see candy_factory.Stick
	 * @generated
	 */
	EClass getStick();

	/**
	 * Returns the meta object for class '{@link candy_factory.CandyFlat <em>Candy Flat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candy Flat</em>'.
	 * @see candy_factory.CandyFlat
	 * @generated
	 */
	EClass getCandyFlat();

	/**
	 * Returns the meta object for class '{@link candy_factory.CandyBall <em>Candy Ball</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candy Ball</em>'.
	 * @see candy_factory.CandyBall
	 * @generated
	 */
	EClass getCandyBall();

	/**
	 * Returns the meta object for class '{@link candy_factory.Lollipop <em>Lollipop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lollipop</em>'.
	 * @see candy_factory.Lollipop
	 * @generated
	 */
	EClass getLollipop();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Candy_factoryFactory getCandy_factoryFactory();

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
		 * The meta object literal for the '{@link candy_factory.impl.FactoryImpl <em>Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.FactoryImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getFactory()
		 * @generated
		 */
		EClass FACTORY = eINSTANCE.getFactory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__NAME = eINSTANCE.getFactory_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__ELEMENTS = eINSTANCE.getFactory_Elements();

		/**
		 * The meta object literal for the '{@link candy_factory.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.ElementImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '{@link candy_factory.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.MachineImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Processing Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__PROCESSING_TIME = eINSTANCE.getMachine_ProcessingTime();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__OUTPUT = eINSTANCE.getMachine_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__INPUT = eINSTANCE.getMachine_Input();

		/**
		 * The meta object literal for the '{@link candy_factory.impl.ConveyorBeltImpl <em>Conveyor Belt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.ConveyorBeltImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getConveyorBelt()
		 * @generated
		 */
		EClass CONVEYOR_BELT = eINSTANCE.getConveyorBelt();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVEYOR_BELT__CAPACITY = eINSTANCE.getConveyorBelt_Capacity();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__TARGET = eINSTANCE.getConveyorBelt_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__SOURCE = eINSTANCE.getConveyorBelt_Source();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__COMPONENT = eINSTANCE.getConveyorBelt_Component();

		/**
		 * The meta object literal for the '{@link candy_factory.impl.ProducerImpl <em>Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.ProducerImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getProducer()
		 * @generated
		 */
		EClass PRODUCER = eINSTANCE.getProducer();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCER__COUNTER = eINSTANCE.getProducer_Counter();

		/**
		 * The meta object literal for the '{@link candy_factory.impl.AssemblerImpl <em>Assembler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.AssemblerImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getAssembler()
		 * @generated
		 */
		EClass ASSEMBLER = eINSTANCE.getAssembler();

		/**
		 * The meta object literal for the '{@link candy_factory.impl.WrapperImpl <em>Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.WrapperImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getWrapper()
		 * @generated
		 */
		EClass WRAPPER = eINSTANCE.getWrapper();

		/**
		 * The meta object literal for the '{@link candy_factory.impl.FlattenerImpl <em>Flattener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.FlattenerImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getFlattener()
		 * @generated
		 */
		EClass FLATTENER = eINSTANCE.getFlattener();

		/**
		 * The meta object literal for the '{@link candy_factory.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.ComponentImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link candy_factory.impl.CandyProducerImpl <em>Candy Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.CandyProducerImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getCandyProducer()
		 * @generated
		 */
		EClass CANDY_PRODUCER = eINSTANCE.getCandyProducer();

		/**
		 * The meta object literal for the '{@link candy_factory.impl.StickProducerImpl <em>Stick Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.StickProducerImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getStickProducer()
		 * @generated
		 */
		EClass STICK_PRODUCER = eINSTANCE.getStickProducer();

		/**
		 * The meta object literal for the '{@link candy_factory.impl.StickImpl <em>Stick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.StickImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getStick()
		 * @generated
		 */
		EClass STICK = eINSTANCE.getStick();

		/**
		 * The meta object literal for the '{@link candy_factory.impl.CandyFlatImpl <em>Candy Flat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.CandyFlatImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getCandyFlat()
		 * @generated
		 */
		EClass CANDY_FLAT = eINSTANCE.getCandyFlat();

		/**
		 * The meta object literal for the '{@link candy_factory.impl.CandyBallImpl <em>Candy Ball</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.CandyBallImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getCandyBall()
		 * @generated
		 */
		EClass CANDY_BALL = eINSTANCE.getCandyBall();

		/**
		 * The meta object literal for the '{@link candy_factory.impl.LollipopImpl <em>Lollipop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see candy_factory.impl.LollipopImpl
		 * @see candy_factory.impl.Candy_factoryPackageImpl#getLollipop()
		 * @generated
		 */
		EClass LOLLIPOP = eINSTANCE.getLollipop();

	}

} //Candy_factoryPackage
