/**
 */
package candy_factory.impl;

import candy_factory.*;

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
public class Candy_factoryFactoryImpl extends EFactoryImpl implements Candy_factoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Candy_factoryFactory init() {
		try {
			Candy_factoryFactory theCandy_factoryFactory = (Candy_factoryFactory)EPackage.Registry.INSTANCE.getEFactory(Candy_factoryPackage.eNS_URI);
			if (theCandy_factoryFactory != null) {
				return theCandy_factoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Candy_factoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Candy_factoryFactoryImpl() {
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
			case Candy_factoryPackage.FACTORY: return createFactory();
			case Candy_factoryPackage.CONVEYOR_BELT: return createConveyorBelt();
			case Candy_factoryPackage.ASSEMBLER: return createAssembler();
			case Candy_factoryPackage.WRAPPER: return createWrapper();
			case Candy_factoryPackage.FLATTENER: return createFlattener();
			case Candy_factoryPackage.CANDY_PRODUCER: return createCandyProducer();
			case Candy_factoryPackage.STICK_PRODUCER: return createStickProducer();
			case Candy_factoryPackage.STICK: return createStick();
			case Candy_factoryPackage.CANDY_FLAT: return createCandyFlat();
			case Candy_factoryPackage.CANDY_BALL: return createCandyBall();
			case Candy_factoryPackage.LOLLIPOP: return createLollipop();
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
	public ConveyorBelt createConveyorBelt() {
		ConveyorBeltImpl conveyorBelt = new ConveyorBeltImpl();
		return conveyorBelt;
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
	public Flattener createFlattener() {
		FlattenerImpl flattener = new FlattenerImpl();
		return flattener;
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
	public StickProducer createStickProducer() {
		StickProducerImpl stickProducer = new StickProducerImpl();
		return stickProducer;
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
	public CandyFlat createCandyFlat() {
		CandyFlatImpl candyFlat = new CandyFlatImpl();
		return candyFlat;
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
	public Lollipop createLollipop() {
		LollipopImpl lollipop = new LollipopImpl();
		return lollipop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Candy_factoryPackage getCandy_factoryPackage() {
		return (Candy_factoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Candy_factoryPackage getPackage() {
		return Candy_factoryPackage.eINSTANCE;
	}

} //Candy_factoryFactoryImpl
