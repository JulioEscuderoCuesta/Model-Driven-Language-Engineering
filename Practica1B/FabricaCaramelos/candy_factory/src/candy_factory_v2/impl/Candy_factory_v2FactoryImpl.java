/**
 */
package candy_factory_v2.impl;

import candy_factory_v2.*;

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
public class Candy_factory_v2FactoryImpl extends EFactoryImpl implements Candy_factory_v2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Candy_factory_v2Factory init() {
		try {
			Candy_factory_v2Factory theCandy_factory_v2Factory = (Candy_factory_v2Factory)EPackage.Registry.INSTANCE.getEFactory(Candy_factory_v2Package.eNS_URI);
			if (theCandy_factory_v2Factory != null) {
				return theCandy_factory_v2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Candy_factory_v2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Candy_factory_v2FactoryImpl() {
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
			case Candy_factory_v2Package.FACTORY: return createFactory();
			case Candy_factory_v2Package.CONVEYOR_BELT: return createConveyorBelt();
			case Candy_factory_v2Package.ASSEMBLER: return createAssembler();
			case Candy_factory_v2Package.WRAPPER: return createWrapper();
			case Candy_factory_v2Package.FLATTENER: return createFlattener();
			case Candy_factory_v2Package.CANDY_PRODUCER: return createCandyProducer();
			case Candy_factory_v2Package.STICK_PRODUCER: return createStickProducer();
			case Candy_factory_v2Package.STICK: return createStick();
			case Candy_factory_v2Package.CANDY_FLAT: return createCandyFlat();
			case Candy_factory_v2Package.CANDY_BALL: return createCandyBall();
			case Candy_factory_v2Package.LOLLIPOP: return createLollipop();
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
	public Candy_factory_v2Package getCandy_factory_v2Package() {
		return (Candy_factory_v2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Candy_factory_v2Package getPackage() {
		return Candy_factory_v2Package.eINSTANCE;
	}

} //Candy_factory_v2FactoryImpl
