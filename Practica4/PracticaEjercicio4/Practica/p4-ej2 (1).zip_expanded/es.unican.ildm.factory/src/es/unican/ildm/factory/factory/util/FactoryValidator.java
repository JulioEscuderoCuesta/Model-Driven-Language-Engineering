/**
 */
package es.unican.ildm.factory.factory.util;

import es.unican.ildm.factory.factory.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see es.unican.ildm.factory.factory.FactoryPackage
 * @generated
 */
public class FactoryValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FactoryValidator INSTANCE = new FactoryValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "es.unican.ildm.factory.factory";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

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
	public FactoryValidator() {
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
	  return FactoryPackage.eINSTANCE;
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
			case FactoryPackage.FACTORY:
				return validateFactory((Factory)value, diagnostics, context);
			case FactoryPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case FactoryPackage.MACHINE:
				return validateMachine((Machine)value, diagnostics, context);
			case FactoryPackage.MAKER:
				return validateMaker((Maker)value, diagnostics, context);
			case FactoryPackage.ASSEMBLER:
				return validateAssembler((Assembler)value, diagnostics, context);
			case FactoryPackage.WRAPPER:
				return validateWrapper((Wrapper)value, diagnostics, context);
			case FactoryPackage.CUERPO_MAKER:
				return validateCuerpoMaker((CuerpoMaker)value, diagnostics, context);
			case FactoryPackage.MANGO_MAKER:
				return validateMangoMaker((MangoMaker)value, diagnostics, context);
			case FactoryPackage.TRAY:
				return validateTray((Tray)value, diagnostics, context);
			case FactoryPackage.PART:
				return validatePart((Part)value, diagnostics, context);
			case FactoryPackage.MANGO:
				return validateMango((Mango)value, diagnostics, context);
			case FactoryPackage.CUERPO:
				return validateCuerpo((Cuerpo)value, diagnostics, context);
			case FactoryPackage.SARTEN:
				return validateSarten((Sarten)value, diagnostics, context);
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
	public boolean validateMaker(Maker maker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maker, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateAssembler_IncorrectOutput(assembler, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IncorrectOutput constraint of '<em>Assembler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLER__INCORRECT_OUTPUT__EEXPRESSION = "\n" +
		"\t\t\toutput=null or output.parts -> forAll(part | part.oclIsTypeOf(Sarten))";

	/**
	 * Validates the IncorrectOutput constraint of '<em>Assembler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembler_IncorrectOutput(Assembler assembler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FactoryPackage.Literals.ASSEMBLER,
				 assembler,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IncorrectOutput",
				 ASSEMBLER__INCORRECT_OUTPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateWrapper_IncorrectOutput(wrapper, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IncorrectOutput constraint of '<em>Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WRAPPER__INCORRECT_OUTPUT__EEXPRESSION = "\n" +
		"\t\t\toutput=null or output.parts -> forAll(part | part.oclIsTypeOf(Sarten))";

	/**
	 * Validates the IncorrectOutput constraint of '<em>Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrapper_IncorrectOutput(Wrapper wrapper, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FactoryPackage.Literals.WRAPPER,
				 wrapper,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IncorrectOutput",
				 WRAPPER__INCORRECT_OUTPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCuerpoMaker(CuerpoMaker cuerpoMaker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cuerpoMaker, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cuerpoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cuerpoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cuerpoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cuerpoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cuerpoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cuerpoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cuerpoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cuerpoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validateCuerpoMaker_IncorrectOutput(cuerpoMaker, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IncorrectOutput constraint of '<em>Cuerpo Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CUERPO_MAKER__INCORRECT_OUTPUT__EEXPRESSION = "\n" +
		"\t\t\toutput=null or output.parts -> forAll(part | part.oclIsTypeOf(Cuerpo))";

	/**
	 * Validates the IncorrectOutput constraint of '<em>Cuerpo Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCuerpoMaker_IncorrectOutput(CuerpoMaker cuerpoMaker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FactoryPackage.Literals.CUERPO_MAKER,
				 cuerpoMaker,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IncorrectOutput",
				 CUERPO_MAKER__INCORRECT_OUTPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMangoMaker(MangoMaker mangoMaker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mangoMaker, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mangoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mangoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mangoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mangoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mangoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mangoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mangoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mangoMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validateMangoMaker_IncorrectOutput(mangoMaker, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IncorrectOutput constraint of '<em>Mango Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANGO_MAKER__INCORRECT_OUTPUT__EEXPRESSION = "\n" +
		"\t\t\toutput=null or output.parts -> forAll(part | part.oclIsTypeOf(Mango))";

	/**
	 * Validates the IncorrectOutput constraint of '<em>Mango Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMangoMaker_IncorrectOutput(MangoMaker mangoMaker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FactoryPackage.Literals.MANGO_MAKER,
				 mangoMaker,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IncorrectOutput",
				 MANGO_MAKER__INCORRECT_OUTPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTray(Tray tray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tray, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tray, diagnostics, context);
		if (result || diagnostics != null) result &= validateTray_OverCapacity(tray, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OverCapacity constraint of '<em>Tray</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRAY__OVER_CAPACITY__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Tray has more parts than permitted',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tparts -> size() <= capacity\n" +
		"}.status";

	/**
	 * Validates the OverCapacity constraint of '<em>Tray</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTray_OverCapacity(Tray tray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FactoryPackage.Literals.TRAY,
				 tray,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OverCapacity",
				 TRAY__OVER_CAPACITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePart(Part part, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(part, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMango(Mango mango, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mango, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCuerpo(Cuerpo cuerpo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cuerpo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSarten(Sarten sarten, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sarten, diagnostics, context);
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

} //FactoryValidator
