/**
 */
package es.unican.ildm.factory.factory.impl;

import es.unican.ildm.factory.factory.FactoryPackage;
import es.unican.ildm.factory.factory.Machine;
import es.unican.ildm.factory.factory.Tray;

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
 *   <li>{@link es.unican.ildm.factory.factory.impl.MachineImpl#getTiempoProcesado <em>Tiempo Procesado</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.impl.MachineImpl#getInput <em>Input</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.impl.MachineImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MachineImpl extends ElementImpl implements Machine {
	/**
	 * The default value of the '{@link #getTiempoProcesado() <em>Tiempo Procesado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiempoProcesado()
	 * @generated
	 * @ordered
	 */
	protected static final int TIEMPO_PROCESADO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTiempoProcesado() <em>Tiempo Procesado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiempoProcesado()
	 * @generated
	 * @ordered
	 */
	protected int tiempoProcesado = TIEMPO_PROCESADO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Tray> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Tray output;

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
		return FactoryPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTiempoProcesado() {
		return tiempoProcesado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiempoProcesado(int newTiempoProcesado) {
		int oldTiempoProcesado = tiempoProcesado;
		tiempoProcesado = newTiempoProcesado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.MACHINE__TIEMPO_PROCESADO, oldTiempoProcesado, tiempoProcesado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tray> getInput() {
		if (input == null) {
			input = new EObjectWithInverseResolvingEList<Tray>(Tray.class, this, FactoryPackage.MACHINE__INPUT, FactoryPackage.TRAY__TARGET);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tray getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (Tray)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FactoryPackage.MACHINE__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tray basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Tray newOutput, NotificationChain msgs) {
		Tray oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FactoryPackage.MACHINE__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Tray newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, FactoryPackage.TRAY__SOURCE, Tray.class, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, FactoryPackage.TRAY__SOURCE, Tray.class, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.MACHINE__OUTPUT, newOutput, newOutput));
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
			case FactoryPackage.MACHINE__INPUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInput()).basicAdd(otherEnd, msgs);
			case FactoryPackage.MACHINE__OUTPUT:
				if (output != null)
					msgs = ((InternalEObject)output).eInverseRemove(this, FactoryPackage.TRAY__SOURCE, Tray.class, msgs);
				return basicSetOutput((Tray)otherEnd, msgs);
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
			case FactoryPackage.MACHINE__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case FactoryPackage.MACHINE__OUTPUT:
				return basicSetOutput(null, msgs);
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
			case FactoryPackage.MACHINE__TIEMPO_PROCESADO:
				return getTiempoProcesado();
			case FactoryPackage.MACHINE__INPUT:
				return getInput();
			case FactoryPackage.MACHINE__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
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
			case FactoryPackage.MACHINE__TIEMPO_PROCESADO:
				setTiempoProcesado((Integer)newValue);
				return;
			case FactoryPackage.MACHINE__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Tray>)newValue);
				return;
			case FactoryPackage.MACHINE__OUTPUT:
				setOutput((Tray)newValue);
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
			case FactoryPackage.MACHINE__TIEMPO_PROCESADO:
				setTiempoProcesado(TIEMPO_PROCESADO_EDEFAULT);
				return;
			case FactoryPackage.MACHINE__INPUT:
				getInput().clear();
				return;
			case FactoryPackage.MACHINE__OUTPUT:
				setOutput((Tray)null);
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
			case FactoryPackage.MACHINE__TIEMPO_PROCESADO:
				return tiempoProcesado != TIEMPO_PROCESADO_EDEFAULT;
			case FactoryPackage.MACHINE__INPUT:
				return input != null && !input.isEmpty();
			case FactoryPackage.MACHINE__OUTPUT:
				return output != null;
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
		result.append(" (tiempoProcesado: ");
		result.append(tiempoProcesado);
		result.append(')');
		return result.toString();
	}

} //MachineImpl
