/**
 */
package factory;

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
 * @see factory.FactoryFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
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
	String eNS_URI = "http://www.unican.es/ildm/p3/factory";

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
	FactoryPackage eINSTANCE = factory.impl.FactoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link factory.impl.FactoryImpl <em>Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.FactoryImpl
	 * @see factory.impl.FactoryPackageImpl#getFactory()
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
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__CONNECTIONS = 1;

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
	 * The meta object id for the '{@link factory.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.ElementImpl
	 * @see factory.impl.FactoryPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

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
	 * The meta object id for the '{@link factory.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.MachineImpl
	 * @see factory.impl.FactoryPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__PROCESSING_TIME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factory.impl.ProducerImpl <em>Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.ProducerImpl
	 * @see factory.impl.FactoryPackageImpl#getProducer()
	 * @generated
	 */
	int PRODUCER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCER__PROCESSING_TIME = MACHINE__PROCESSING_TIME;

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
	 * The meta object id for the '{@link factory.impl.AssemblerImpl <em>Assembler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.AssemblerImpl
	 * @see factory.impl.FactoryPackageImpl#getAssembler()
	 * @generated
	 */
	int ASSEMBLER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__PROCESSING_TIME = MACHINE__PROCESSING_TIME;

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
	 * The meta object id for the '{@link factory.impl.WrapperImpl <em>Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.WrapperImpl
	 * @see factory.impl.FactoryPackageImpl#getWrapper()
	 * @generated
	 */
	int WRAPPER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPER__PROCESSING_TIME = MACHINE__PROCESSING_TIME;

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
	 * The meta object id for the '{@link factory.impl.StickProducerImpl <em>Stick Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.StickProducerImpl
	 * @see factory.impl.FactoryPackageImpl#getStickProducer()
	 * @generated
	 */
	int STICK_PRODUCER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICK_PRODUCER__NAME = PRODUCER__NAME;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICK_PRODUCER__PROCESSING_TIME = PRODUCER__PROCESSING_TIME;

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
	 * The meta object id for the '{@link factory.impl.CandyProducerImpl <em>Candy Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.CandyProducerImpl
	 * @see factory.impl.FactoryPackageImpl#getCandyProducer()
	 * @generated
	 */
	int CANDY_PRODUCER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDY_PRODUCER__NAME = PRODUCER__NAME;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDY_PRODUCER__PROCESSING_TIME = PRODUCER__PROCESSING_TIME;

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
	 * The meta object id for the '{@link factory.impl.ConveyorBeltImpl <em>Conveyor Belt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.ConveyorBeltImpl
	 * @see factory.impl.FactoryPackageImpl#getConveyorBelt()
	 * @generated
	 */
	int CONVEYOR_BELT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__CAPACITY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__COMPONENTS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link factory.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.ComponentImpl
	 * @see factory.impl.FactoryPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 9;

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
	 * The meta object id for the '{@link factory.impl.CandyFlatImpl <em>Candy Flat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.CandyFlatImpl
	 * @see factory.impl.FactoryPackageImpl#getCandyFlat()
	 * @generated
	 */
	int CANDY_FLAT = 10;

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
	 * The meta object id for the '{@link factory.impl.StickImpl <em>Stick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.StickImpl
	 * @see factory.impl.FactoryPackageImpl#getStick()
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
	 * The meta object id for the '{@link factory.impl.CandyBallImpl <em>Candy Ball</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.CandyBallImpl
	 * @see factory.impl.FactoryPackageImpl#getCandyBall()
	 * @generated
	 */
	int CANDY_BALL = 12;

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
	 * The meta object id for the '{@link factory.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.ConnectionImpl
	 * @see factory.impl.FactoryPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link factory.impl.LollipopImpl <em>Lollipop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.LollipopImpl
	 * @see factory.impl.FactoryPackageImpl#getLollipop()
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
	 * The meta object id for the '{@link factory.impl.FlattenerImpl <em>Flattener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see factory.impl.FlattenerImpl
	 * @see factory.impl.FactoryPackageImpl#getFlattener()
	 * @generated
	 */
	int FLATTENER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTENER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTENER__PROCESSING_TIME = MACHINE__PROCESSING_TIME;

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
	 * Returns the meta object for class '{@link factory.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory</em>'.
	 * @see factory.Factory
	 * @generated
	 */
	EClass getFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link factory.Factory#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see factory.Factory#getElements()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link factory.Factory#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see factory.Factory#getConnections()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_Connections();

	/**
	 * Returns the meta object for class '{@link factory.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see factory.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link factory.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see factory.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link factory.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see factory.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link factory.Machine#getProcessingTime <em>Processing Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Time</em>'.
	 * @see factory.Machine#getProcessingTime()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_ProcessingTime();

	/**
	 * Returns the meta object for class '{@link factory.Producer <em>Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producer</em>'.
	 * @see factory.Producer
	 * @generated
	 */
	EClass getProducer();

	/**
	 * Returns the meta object for the attribute '{@link factory.Producer#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see factory.Producer#getCounter()
	 * @see #getProducer()
	 * @generated
	 */
	EAttribute getProducer_Counter();

	/**
	 * Returns the meta object for class '{@link factory.Assembler <em>Assembler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembler</em>'.
	 * @see factory.Assembler
	 * @generated
	 */
	EClass getAssembler();

	/**
	 * Returns the meta object for class '{@link factory.Wrapper <em>Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wrapper</em>'.
	 * @see factory.Wrapper
	 * @generated
	 */
	EClass getWrapper();

	/**
	 * Returns the meta object for class '{@link factory.StickProducer <em>Stick Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stick Producer</em>'.
	 * @see factory.StickProducer
	 * @generated
	 */
	EClass getStickProducer();

	/**
	 * Returns the meta object for class '{@link factory.CandyProducer <em>Candy Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candy Producer</em>'.
	 * @see factory.CandyProducer
	 * @generated
	 */
	EClass getCandyProducer();

	/**
	 * Returns the meta object for class '{@link factory.ConveyorBelt <em>Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor Belt</em>'.
	 * @see factory.ConveyorBelt
	 * @generated
	 */
	EClass getConveyorBelt();

	/**
	 * Returns the meta object for the attribute '{@link factory.ConveyorBelt#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see factory.ConveyorBelt#getCapacity()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EAttribute getConveyorBelt_Capacity();

	/**
	 * Returns the meta object for the containment reference list '{@link factory.ConveyorBelt#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see factory.ConveyorBelt#getComponents()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_Components();

	/**
	 * Returns the meta object for class '{@link factory.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see factory.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link factory.CandyFlat <em>Candy Flat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candy Flat</em>'.
	 * @see factory.CandyFlat
	 * @generated
	 */
	EClass getCandyFlat();

	/**
	 * Returns the meta object for class '{@link factory.Stick <em>Stick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stick</em>'.
	 * @see factory.Stick
	 * @generated
	 */
	EClass getStick();

	/**
	 * Returns the meta object for class '{@link factory.CandyBall <em>Candy Ball</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candy Ball</em>'.
	 * @see factory.CandyBall
	 * @generated
	 */
	EClass getCandyBall();

	/**
	 * Returns the meta object for class '{@link factory.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see factory.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link factory.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see factory.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link factory.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see factory.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for class '{@link factory.Lollipop <em>Lollipop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lollipop</em>'.
	 * @see factory.Lollipop
	 * @generated
	 */
	EClass getLollipop();

	/**
	 * Returns the meta object for class '{@link factory.Flattener <em>Flattener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flattener</em>'.
	 * @see factory.Flattener
	 * @generated
	 */
	EClass getFlattener();

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
		 * The meta object literal for the '{@link factory.impl.FactoryImpl <em>Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.FactoryImpl
		 * @see factory.impl.FactoryPackageImpl#getFactory()
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
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__CONNECTIONS = eINSTANCE.getFactory_Connections();

		/**
		 * The meta object literal for the '{@link factory.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.ElementImpl
		 * @see factory.impl.FactoryPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link factory.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.MachineImpl
		 * @see factory.impl.FactoryPackageImpl#getMachine()
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
		 * The meta object literal for the '{@link factory.impl.ProducerImpl <em>Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.ProducerImpl
		 * @see factory.impl.FactoryPackageImpl#getProducer()
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
		 * The meta object literal for the '{@link factory.impl.AssemblerImpl <em>Assembler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.AssemblerImpl
		 * @see factory.impl.FactoryPackageImpl#getAssembler()
		 * @generated
		 */
		EClass ASSEMBLER = eINSTANCE.getAssembler();

		/**
		 * The meta object literal for the '{@link factory.impl.WrapperImpl <em>Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.WrapperImpl
		 * @see factory.impl.FactoryPackageImpl#getWrapper()
		 * @generated
		 */
		EClass WRAPPER = eINSTANCE.getWrapper();

		/**
		 * The meta object literal for the '{@link factory.impl.StickProducerImpl <em>Stick Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.StickProducerImpl
		 * @see factory.impl.FactoryPackageImpl#getStickProducer()
		 * @generated
		 */
		EClass STICK_PRODUCER = eINSTANCE.getStickProducer();

		/**
		 * The meta object literal for the '{@link factory.impl.CandyProducerImpl <em>Candy Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.CandyProducerImpl
		 * @see factory.impl.FactoryPackageImpl#getCandyProducer()
		 * @generated
		 */
		EClass CANDY_PRODUCER = eINSTANCE.getCandyProducer();

		/**
		 * The meta object literal for the '{@link factory.impl.ConveyorBeltImpl <em>Conveyor Belt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.ConveyorBeltImpl
		 * @see factory.impl.FactoryPackageImpl#getConveyorBelt()
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
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__COMPONENTS = eINSTANCE.getConveyorBelt_Components();

		/**
		 * The meta object literal for the '{@link factory.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.ComponentImpl
		 * @see factory.impl.FactoryPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link factory.impl.CandyFlatImpl <em>Candy Flat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.CandyFlatImpl
		 * @see factory.impl.FactoryPackageImpl#getCandyFlat()
		 * @generated
		 */
		EClass CANDY_FLAT = eINSTANCE.getCandyFlat();

		/**
		 * The meta object literal for the '{@link factory.impl.StickImpl <em>Stick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.StickImpl
		 * @see factory.impl.FactoryPackageImpl#getStick()
		 * @generated
		 */
		EClass STICK = eINSTANCE.getStick();

		/**
		 * The meta object literal for the '{@link factory.impl.CandyBallImpl <em>Candy Ball</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.CandyBallImpl
		 * @see factory.impl.FactoryPackageImpl#getCandyBall()
		 * @generated
		 */
		EClass CANDY_BALL = eINSTANCE.getCandyBall();

		/**
		 * The meta object literal for the '{@link factory.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.ConnectionImpl
		 * @see factory.impl.FactoryPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '{@link factory.impl.LollipopImpl <em>Lollipop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.LollipopImpl
		 * @see factory.impl.FactoryPackageImpl#getLollipop()
		 * @generated
		 */
		EClass LOLLIPOP = eINSTANCE.getLollipop();

		/**
		 * The meta object literal for the '{@link factory.impl.FlattenerImpl <em>Flattener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see factory.impl.FlattenerImpl
		 * @see factory.impl.FactoryPackageImpl#getFlattener()
		 * @generated
		 */
		EClass FLATTENER = eINSTANCE.getFlattener();

	}

} //FactoryPackage
