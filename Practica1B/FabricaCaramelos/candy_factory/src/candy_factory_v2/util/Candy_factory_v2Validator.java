/**
 */
package candy_factory_v2.util;

import candy_factory_v2.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see candy_factory_v2.Candy_factory_v2Package
 * @generated
 */
public class Candy_factory_v2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Candy_factory_v2Validator INSTANCE = new Candy_factory_v2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "candy_factory_v2";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Capacity Exceeded' of 'Conveyor Belt'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONVEYOR_BELT__CAPACITY_EXCEEDED = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Out Put Is Lollipop' of 'Assembler'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSEMBLER__OUT_PUT_IS_LOLLIPOP = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Out Put Is Lollipop' of 'Wrapper'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WRAPPER__OUT_PUT_IS_LOLLIPOP = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Out Put Is Candy Flat' of 'Flattener'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FLATTENER__OUT_PUT_IS_CANDY_FLAT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Out Put Is Candy Ball' of 'Candy Producer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CANDY_PRODUCER__OUT_PUT_IS_CANDY_BALL = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Out Put Is Stick' of 'Stick Producer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STICK_PRODUCER__OUT_PUT_IS_STICK = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Candy_factory_v2Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Candy_factory_v2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Candy_factory_v2Package.FACTORY:
				return validateFactory((Factory)value, diagnostics, context);
			case Candy_factory_v2Package.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case Candy_factory_v2Package.MACHINE:
				return validateMachine((Machine)value, diagnostics, context);
			case Candy_factory_v2Package.CONVEYOR_BELT:
				return validateConveyorBelt((ConveyorBelt)value, diagnostics, context);
			case Candy_factory_v2Package.PRODUCER:
				return validateProducer((Producer)value, diagnostics, context);
			case Candy_factory_v2Package.ASSEMBLER:
				return validateAssembler((Assembler)value, diagnostics, context);
			case Candy_factory_v2Package.WRAPPER:
				return validateWrapper((Wrapper)value, diagnostics, context);
			case Candy_factory_v2Package.FLATTENER:
				return validateFlattener((Flattener)value, diagnostics, context);
			case Candy_factory_v2Package.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case Candy_factory_v2Package.CANDY_PRODUCER:
				return validateCandyProducer((CandyProducer)value, diagnostics, context);
			case Candy_factory_v2Package.STICK_PRODUCER:
				return validateStickProducer((StickProducer)value, diagnostics, context);
			case Candy_factory_v2Package.STICK:
				return validateStick((Stick)value, diagnostics, context);
			case Candy_factory_v2Package.CANDY_FLAT:
				return validateCandyFlat((CandyFlat)value, diagnostics, context);
			case Candy_factory_v2Package.CANDY_BALL:
				return validateCandyBall((CandyBall)value, diagnostics, context);
			case Candy_factory_v2Package.LOLLIPOP:
				return validateLollipop((Lollipop)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactory(Factory factory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(factory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(machine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConveyorBelt(ConveyorBelt conveyorBelt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conveyorBelt, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conveyorBelt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conveyorBelt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conveyorBelt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conveyorBelt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conveyorBelt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conveyorBelt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conveyorBelt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conveyorBelt, diagnostics, context);
		if (result || diagnostics != null) result &= validateConveyorBelt_CapacityExceeded(conveyorBelt, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CapacityExceeded constraint of '<em>Conveyor Belt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConveyorBelt_CapacityExceeded(ConveyorBelt conveyorBelt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conveyorBelt.CapacityExceeded(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProducer(Producer producer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(producer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembler(Assembler assembler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assembler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assembler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assembler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assembler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assembler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assembler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assembler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assembler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assembler, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssembler_OutPutIsLollipop(assembler, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OutPutIsLollipop constraint of '<em>Assembler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembler_OutPutIsLollipop(Assembler assembler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assembler.OutPutIsLollipop(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrapper(Wrapper wrapper, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wrapper, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wrapper, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wrapper, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wrapper, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wrapper, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wrapper, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wrapper, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wrapper, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wrapper, diagnostics, context);
		if (result || diagnostics != null) result &= validateWrapper_OutPutIsLollipop(wrapper, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OutPutIsLollipop constraint of '<em>Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrapper_OutPutIsLollipop(Wrapper wrapper, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wrapper.OutPutIsLollipop(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlattener(Flattener flattener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(flattener, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(flattener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(flattener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(flattener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(flattener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(flattener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(flattener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(flattener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(flattener, diagnostics, context);
		if (result || diagnostics != null) result &= validateFlattener_OutPutIsCandyFlat(flattener, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OutPutIsCandyFlat constraint of '<em>Flattener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlattener_OutPutIsCandyFlat(Flattener flattener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return flattener.OutPutIsCandyFlat(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCandyProducer(CandyProducer candyProducer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(candyProducer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(candyProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(candyProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(candyProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(candyProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(candyProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(candyProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(candyProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(candyProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validateCandyProducer_OutPutIsCandyBall(candyProducer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OutPutIsCandyBall constraint of '<em>Candy Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCandyProducer_OutPutIsCandyBall(CandyProducer candyProducer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return candyProducer.OutPutIsCandyBall(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStickProducer(StickProducer stickProducer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stickProducer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stickProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stickProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stickProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stickProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stickProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stickProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stickProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stickProducer, diagnostics, context);
		if (result || diagnostics != null) result &= validateStickProducer_OutPutIsStick(stickProducer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OutPutIsStick constraint of '<em>Stick Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStickProducer_OutPutIsStick(StickProducer stickProducer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stickProducer.OutPutIsStick(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStick(Stick stick, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stick, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCandyFlat(CandyFlat candyFlat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(candyFlat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCandyBall(CandyBall candyBall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(candyBall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLollipop(Lollipop lollipop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lollipop, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Candy_factory_v2Validator
