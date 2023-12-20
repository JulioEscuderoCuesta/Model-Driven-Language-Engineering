/**
 */
package es.unican.ildm.factory.factory.impl;

import es.unican.ildm.factory.factory.Element;
import es.unican.ildm.factory.factory.Factory;
import es.unican.ildm.factory.factory.FactoryPackage;
import es.unican.ildm.factory.factory.Tray;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unican.ildm.factory.factory.impl.FactoryImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.impl.FactoryImpl#getTotalCounter <em>Total Counter</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.impl.FactoryImpl#getCurrentParts <em>Current Parts</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.impl.FactoryImpl#getTrays <em>Trays</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.impl.FactoryImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryImpl extends MinimalEObjectImpl.Container implements Factory {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The cached setting delegate for the '{@link #getTotalCounter() <em>Total Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCounter()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TOTAL_COUNTER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FactoryPackage.Literals.FACTORY__TOTAL_COUNTER).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getCurrentParts() <em>Current Parts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentParts()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CURRENT_PARTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FactoryPackage.Literals.FACTORY__CURRENT_PARTS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTrays() <em>Trays</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrays()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TRAYS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FactoryPackage.Literals.FACTORY__TRAYS).getSettingDelegate();

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FactoryPackage.Literals.FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, FactoryPackage.FACTORY__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalCounter() {
		return (Integer)TOTAL_COUNTER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCounter(int newTotalCounter) {
		TOTAL_COUNTER__ESETTING_DELEGATE.dynamicSet(this, null, 0, newTotalCounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentParts() {
		return (Integer)CURRENT_PARTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentParts(int newCurrentParts) {
		CURRENT_PARTS__ESETTING_DELEGATE.dynamicSet(this, null, 0, newCurrentParts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tray> getTrays() {
		return (EList<Tray>)TRAYS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FactoryPackage.FACTORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FactoryPackage.FACTORY__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case FactoryPackage.FACTORY__ELEMENTS:
				return getElements();
			case FactoryPackage.FACTORY__TOTAL_COUNTER:
				return getTotalCounter();
			case FactoryPackage.FACTORY__CURRENT_PARTS:
				return getCurrentParts();
			case FactoryPackage.FACTORY__TRAYS:
				return getTrays();
			case FactoryPackage.FACTORY__NAME:
				return getName();
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
			case FactoryPackage.FACTORY__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case FactoryPackage.FACTORY__TOTAL_COUNTER:
				setTotalCounter((Integer)newValue);
				return;
			case FactoryPackage.FACTORY__CURRENT_PARTS:
				setCurrentParts((Integer)newValue);
				return;
			case FactoryPackage.FACTORY__NAME:
				setName((String)newValue);
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
			case FactoryPackage.FACTORY__ELEMENTS:
				getElements().clear();
				return;
			case FactoryPackage.FACTORY__TOTAL_COUNTER:
				TOTAL_COUNTER__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case FactoryPackage.FACTORY__CURRENT_PARTS:
				CURRENT_PARTS__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case FactoryPackage.FACTORY__NAME:
				setName(NAME_EDEFAULT);
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
			case FactoryPackage.FACTORY__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case FactoryPackage.FACTORY__TOTAL_COUNTER:
				return TOTAL_COUNTER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case FactoryPackage.FACTORY__CURRENT_PARTS:
				return CURRENT_PARTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case FactoryPackage.FACTORY__TRAYS:
				return TRAYS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case FactoryPackage.FACTORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FactoryImpl
