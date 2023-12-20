/**
 */
package candy_factory_v2.impl;

import candy_factory_v2.Candy_factory_v2Package;
import candy_factory_v2.Candy_factory_v2Tables;
import candy_factory_v2.Component;
import candy_factory_v2.ConveyorBelt;
import candy_factory_v2.Flattener;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flattener</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FlattenerImpl extends MachineImpl implements Flattener {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlattenerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Candy_factory_v2Package.Literals.FLATTENER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean whichOutput() {
		/**
		 *
		 * output.component->forAll(oclIsTypeOf(CandyFlat))
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ ConveyorBelt output = this.getOutput();
		if (output == null) {
			throw new InvalidValueException("Null source for \'\'http://www.unican.es/ildm/candy_factory_v2\'::ConveyorBelt::component\'");
		}
		final /*@Thrown*/ List<Component> component = output.getComponent();
		final /*@Thrown*/ OrderedSetValue BOXED_component = idResolver.createOrderedSetOfAll(Candy_factory_v2Tables.ORD_CLSSid_Component, component);
		/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
		Iterator<Object> ITERATOR__1 = BOXED_component.iterator();
		/*@Thrown*/ Boolean forAll;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				if (accumulator == ValueUtil.TRUE_VALUE) {
					forAll = ValueUtil.TRUE_VALUE;
				}
				else {
					throw (InvalidValueException)accumulator;
				}
				break;
			}
			/*@NonInvalid*/ Component _1 = (Component)ITERATOR__1.next();
			/**
			 * oclIsTypeOf(CandyFlat)
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_candy_factory_v2_c_c_CandyFlat_0 = idResolver.getClass(Candy_factory_v2Tables.CLSSid_CandyFlat, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, _1, TYP_candy_factory_v2_c_c_CandyFlat_0).booleanValue();
			//
			if (!oclIsTypeOf) {					// Normal unsuccessful body evaluation result
				forAll = ValueUtil.FALSE_VALUE;
				break;														// Stop immediately
			}
			else if (oclIsTypeOf) {				// Normal successful body evaluation result
				;															// Carry on
			}
			else {															// Impossible badly typed result
				accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
			}
		}
		if (forAll == null) {
			throw new InvalidValueException("Null body for \'candy_factory_v2::Flattener::whichOutput() : Boolean[1]\'");
		}
		return forAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OutPutIsCandyFlat(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Flattener::OutPutIsCandyFlat";
		try {
			/**
			 *
			 * inv OutPutIsCandyFlat:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let status : Boolean[1] = whichOutput()
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Flattener has only CandyFlats as output', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Candy_factory_v2Package.Literals.FLATTENER___OUT_PUT_IS_CANDY_FLAT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Candy_factory_v2Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			}
			else {
				final /*@NonInvalid*/ boolean status = this.whichOutput();
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Candy_factory_v2Tables.TUPLid_, Candy_factory_v2Tables.STR_Flattener_32_has_32_only_32_CandyFlats_32_as_32_output, status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, local_1, Candy_factory_v2Tables.INT_0).booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Candy_factory_v2Package.FLATTENER___WHICH_OUTPUT:
				return whichOutput();
			case Candy_factory_v2Package.FLATTENER___OUT_PUT_IS_CANDY_FLAT__DIAGNOSTICCHAIN_MAP:
				return OutPutIsCandyFlat((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //FlattenerImpl
