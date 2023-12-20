/**
 */
package flight_planner.impl;

import flight_planner.Base;
import flight_planner.Flight_plannerPackage;
import flight_planner.Infrastructure;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flight_planner.impl.BaseImpl#getInfrastructure <em>Infrastructure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseImpl extends PlaceImpl implements Base {
	/**
	 * The cached value of the '{@link #getInfrastructure() <em>Infrastructure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected EList<Infrastructure> infrastructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Flight_plannerPackage.Literals.BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Infrastructure> getInfrastructure() {
		if (infrastructure == null) {
			infrastructure = new EObjectResolvingEList<Infrastructure>(Infrastructure.class, this, Flight_plannerPackage.BASE__INFRASTRUCTURE);
		}
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Flight_plannerPackage.BASE__INFRASTRUCTURE:
				return getInfrastructure();
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
			case Flight_plannerPackage.BASE__INFRASTRUCTURE:
				getInfrastructure().clear();
				getInfrastructure().addAll((Collection<? extends Infrastructure>)newValue);
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
			case Flight_plannerPackage.BASE__INFRASTRUCTURE:
				getInfrastructure().clear();
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
			case Flight_plannerPackage.BASE__INFRASTRUCTURE:
				return infrastructure != null && !infrastructure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BaseImpl
