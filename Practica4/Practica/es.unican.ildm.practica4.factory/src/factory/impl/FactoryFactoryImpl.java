/**
 */
package factory.impl;

import factory.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactoryFactoryImpl extends EFactoryImpl implements FactoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FactoryFactory init() {
		try {
			FactoryFactory theFactoryFactory = (FactoryFactory)EPackage.Registry.INSTANCE.getEFactory(FactoryPackage.eNS_URI);
			if (theFactoryFactory != null) {
				return theFactoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FactoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FactoryPackage.FACTORY: return createFactory();
			case FactoryPackage.ASSEMBLER: return createAssembler();
			case FactoryPackage.WRAPPER: return createWrapper();
			case FactoryPackage.STICK_PRODUCER: return createStickProducer();
			case FactoryPackage.CANDY_PRODUCER: return createCandyProducer();
			case FactoryPackage.CONVEYOR_BELT: return createConveyorBelt();
			case FactoryPackage.CANDY_FLAT: return createCandyFlat();
			case FactoryPackage.STICK: return createStick();
			case FactoryPackage.CANDY_BALL: return createCandyBall();
			case FactoryPackage.CONNECTION: return createConnection();
			case FactoryPackage.LOLLIPOP: return createLollipop();
			case FactoryPackage.FLATTENER: return createFlattener();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factory createFactory() {
		FactoryImpl factory = new FactoryImpl();
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembler createAssembler() {
		AssemblerImpl assembler = new AssemblerImpl();
		return assembler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wrapper createWrapper() {
		WrapperImpl wrapper = new WrapperImpl();
		return wrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StickProducer createStickProducer() {
		StickProducerImpl stickProducer = new StickProducerImpl();
		return stickProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandyProducer createCandyProducer() {
		CandyProducerImpl candyProducer = new CandyProducerImpl();
		return candyProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyorBelt createConveyorBelt() {
		ConveyorBeltImpl conveyorBelt = new ConveyorBeltImpl();
		return conveyorBelt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandyFlat createCandyFlat() {
		CandyFlatImpl candyFlat = new CandyFlatImpl();
		return candyFlat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stick createStick() {
		StickImpl stick = new StickImpl();
		return stick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandyBall createCandyBall() {
		CandyBallImpl candyBall = new CandyBallImpl();
		return candyBall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lollipop createLollipop() {
		LollipopImpl lollipop = new LollipopImpl();
		return lollipop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flattener createFlattener() {
		FlattenerImpl flattener = new FlattenerImpl();
		return flattener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryPackage getFactoryPackage() {
		return (FactoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FactoryPackage getPackage() {
		return FactoryPackage.eINSTANCE;
	}

} //FactoryFactoryImpl
