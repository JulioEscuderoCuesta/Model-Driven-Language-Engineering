/**
 */
package candy_factory_v2.impl;

import candy_factory_v2.Candy_factory_v2Package;
import candy_factory_v2.Candy_factory_v2Tables;
import candy_factory_v2.Component;
import candy_factory_v2.ConveyorBelt;
import candy_factory_v2.Machine;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conveyor Belt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link candy_factory_v2.impl.ConveyorBeltImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link candy_factory_v2.impl.ConveyorBeltImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link candy_factory_v2.impl.ConveyorBeltImpl#getSource <em>Source</em>}</li>
 *   <li>{@link candy_factory_v2.impl.ConveyorBeltImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConveyorBeltImpl extends ElementImpl implements ConveyorBelt {
	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Machine target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Machine source;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorBeltImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Candy_factory_v2Package.Literals.CONVEYOR_BELT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Candy_factory_v2Package.CONVEYOR_BELT__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Machine)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Candy_factory_v2Package.CONVEYOR_BELT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Machine newTarget, NotificationChain msgs) {
		Machine oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Candy_factory_v2Package.CONVEYOR_BELT__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Machine newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, Candy_factory_v2Package.MACHINE__INPUT, Machine.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, Candy_factory_v2Package.MACHINE__INPUT, Machine.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Candy_factory_v2Package.CONVEYOR_BELT__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Machine)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Candy_factory_v2Package.CONVEYOR_BELT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Machine newSource, NotificationChain msgs) {
		Machine oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Candy_factory_v2Package.CONVEYOR_BELT__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Machine newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, Candy_factory_v2Package.MACHINE__OUTPUT, Machine.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, Candy_factory_v2Package.MACHINE__OUTPUT, Machine.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Candy_factory_v2Package.CONVEYOR_BELT__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this, Candy_factory_v2Package.CONVEYOR_BELT__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasSpaceLeft() {
		/**
		 * component->size() <= capacity
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Component> component = this.getComponent();
		final /*@NonInvalid*/ OrderedSetValue BOXED_component = idResolver.createOrderedSetOfAll(Candy_factory_v2Tables.ORD_CLSSid_Component, component);
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_component);
		final /*@NonInvalid*/ int capacity = this.getCapacity();
		final /*@NonInvalid*/ IntegerValue BOXED_capacity = ValueUtil.integerValueOf(capacity);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, BOXED_capacity).booleanValue();
		return le;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CapacityExceeded(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ConveyorBelt::CapacityExceeded";
		try {
			/**
			 *
			 * inv CapacityExceeded:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let status : Boolean[1] = hasSpaceLeft()
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Conveyor belt + id + has exceeded its capacity', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Candy_factory_v2Package.Literals.CONVEYOR_BELT___CAPACITY_EXCEEDED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Candy_factory_v2Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			}
			else {
				final /*@NonInvalid*/ boolean status = this.hasSpaceLeft();
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Candy_factory_v2Tables.TUPLid_, Candy_factory_v2Tables.STR_Conveyor_32_belt_32_p_32_id_32_p_32_has_32_exceeded_32_its_32_capacity, status);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Candy_factory_v2Package.CONVEYOR_BELT__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, Candy_factory_v2Package.MACHINE__INPUT, Machine.class, msgs);
				return basicSetTarget((Machine)otherEnd, msgs);
			case Candy_factory_v2Package.CONVEYOR_BELT__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, Candy_factory_v2Package.MACHINE__OUTPUT, Machine.class, msgs);
				return basicSetSource((Machine)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Candy_factory_v2Package.CONVEYOR_BELT__TARGET:
				return basicSetTarget(null, msgs);
			case Candy_factory_v2Package.CONVEYOR_BELT__SOURCE:
				return basicSetSource(null, msgs);
			case Candy_factory_v2Package.CONVEYOR_BELT__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Candy_factory_v2Package.CONVEYOR_BELT__CAPACITY:
				return getCapacity();
			case Candy_factory_v2Package.CONVEYOR_BELT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case Candy_factory_v2Package.CONVEYOR_BELT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Candy_factory_v2Package.CONVEYOR_BELT__COMPONENT:
				return getComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Candy_factory_v2Package.CONVEYOR_BELT__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case Candy_factory_v2Package.CONVEYOR_BELT__TARGET:
				setTarget((Machine)newValue);
				return;
			case Candy_factory_v2Package.CONVEYOR_BELT__SOURCE:
				setSource((Machine)newValue);
				return;
			case Candy_factory_v2Package.CONVEYOR_BELT__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Candy_factory_v2Package.CONVEYOR_BELT__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case Candy_factory_v2Package.CONVEYOR_BELT__TARGET:
				setTarget((Machine)null);
				return;
			case Candy_factory_v2Package.CONVEYOR_BELT__SOURCE:
				setSource((Machine)null);
				return;
			case Candy_factory_v2Package.CONVEYOR_BELT__COMPONENT:
				getComponent().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Candy_factory_v2Package.CONVEYOR_BELT__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case Candy_factory_v2Package.CONVEYOR_BELT__TARGET:
				return target != null;
			case Candy_factory_v2Package.CONVEYOR_BELT__SOURCE:
				return source != null;
			case Candy_factory_v2Package.CONVEYOR_BELT__COMPONENT:
				return component != null && !component.isEmpty();
		}
		return super.eIsSet(featureID);
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
			case Candy_factory_v2Package.CONVEYOR_BELT___HAS_SPACE_LEFT:
				return hasSpaceLeft();
			case Candy_factory_v2Package.CONVEYOR_BELT___CAPACITY_EXCEEDED__DIAGNOSTICCHAIN_MAP:
				return CapacityExceeded((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //ConveyorBeltImpl
