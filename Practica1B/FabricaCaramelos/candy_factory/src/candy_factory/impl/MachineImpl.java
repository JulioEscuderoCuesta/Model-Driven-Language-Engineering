/**
 */
package candy_factory.impl;

import candy_factory.Candy_factoryPackage;
import candy_factory.ConveyorBelt;
import candy_factory.Machine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link candy_factory.impl.MachineImpl#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link candy_factory.impl.MachineImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link candy_factory.impl.MachineImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MachineImpl extends ElementImpl implements Machine {
	/**
	 * The default value of the '{@link #getProcessingTime() <em>Processing Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingTime()
	 * @generated
	 * @ordered
	 */
	protected static final int PROCESSING_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProcessingTime() <em>Processing Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingTime()
	 * @generated
	 * @ordered
	 */
	protected int processingTime = PROCESSING_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected ConveyorBelt output;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<ConveyorBelt> input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Candy_factoryPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProcessingTime() {
		return processingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingTime(int newProcessingTime) {
		int oldProcessingTime = processingTime;
		processingTime = newProcessingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Candy_factoryPackage.MACHINE__PROCESSING_TIME, oldProcessingTime, processingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyorBelt getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (ConveyorBelt)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Candy_factoryPackage.MACHINE__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyorBelt basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(ConveyorBelt newOutput, NotificationChain msgs) {
		ConveyorBelt oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Candy_factoryPackage.MACHINE__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(ConveyorBelt newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, Candy_factoryPackage.CONVEYOR_BELT__SOURCE, ConveyorBelt.class, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, Candy_factoryPackage.CONVEYOR_BELT__SOURCE, ConveyorBelt.class, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Candy_factoryPackage.MACHINE__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConveyorBelt> getInput() {
		if (input == null) {
			input = new EObjectWithInverseResolvingEList<ConveyorBelt>(ConveyorBelt.class, this, Candy_factoryPackage.MACHINE__INPUT, Candy_factoryPackage.CONVEYOR_BELT__TARGET);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Candy_factoryPackage.MACHINE__OUTPUT:
				if (output != null)
					msgs = ((InternalEObject)output).eInverseRemove(this, Candy_factoryPackage.CONVEYOR_BELT__SOURCE, ConveyorBelt.class, msgs);
				return basicSetOutput((ConveyorBelt)otherEnd, msgs);
			case Candy_factoryPackage.MACHINE__INPUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInput()).basicAdd(otherEnd, msgs);
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
			case Candy_factoryPackage.MACHINE__OUTPUT:
				return basicSetOutput(null, msgs);
			case Candy_factoryPackage.MACHINE__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
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
			case Candy_factoryPackage.MACHINE__PROCESSING_TIME:
				return getProcessingTime();
			case Candy_factoryPackage.MACHINE__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case Candy_factoryPackage.MACHINE__INPUT:
				return getInput();
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
			case Candy_factoryPackage.MACHINE__PROCESSING_TIME:
				setProcessingTime((Integer)newValue);
				return;
			case Candy_factoryPackage.MACHINE__OUTPUT:
				setOutput((ConveyorBelt)newValue);
				return;
			case Candy_factoryPackage.MACHINE__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends ConveyorBelt>)newValue);
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
			case Candy_factoryPackage.MACHINE__PROCESSING_TIME:
				setProcessingTime(PROCESSING_TIME_EDEFAULT);
				return;
			case Candy_factoryPackage.MACHINE__OUTPUT:
				setOutput((ConveyorBelt)null);
				return;
			case Candy_factoryPackage.MACHINE__INPUT:
				getInput().clear();
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
			case Candy_factoryPackage.MACHINE__PROCESSING_TIME:
				return processingTime != PROCESSING_TIME_EDEFAULT;
			case Candy_factoryPackage.MACHINE__OUTPUT:
				return output != null;
			case Candy_factoryPackage.MACHINE__INPUT:
				return input != null && !input.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (processingTime: ");
		result.append(processingTime);
		result.append(')');
		return result.toString();
	}

} //MachineImpl
