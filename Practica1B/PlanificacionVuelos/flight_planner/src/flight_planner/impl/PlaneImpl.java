/**
 */
package flight_planner.impl;

import flight_planner.Flight;
import flight_planner.Flight_plannerPackage;
import flight_planner.Plane;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flight_planner.impl.PlaneImpl#getName <em>Name</em>}</li>
 *   <li>{@link flight_planner.impl.PlaneImpl#getModel <em>Model</em>}</li>
 *   <li>{@link flight_planner.impl.PlaneImpl#getLicensePlate <em>License Plate</em>}</li>
 *   <li>{@link flight_planner.impl.PlaneImpl#isAvailability <em>Availability</em>}</li>
 *   <li>{@link flight_planner.impl.PlaneImpl#getFlight <em>Flight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaneImpl extends MinimalEObjectImpl.Container implements Plane {
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
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicensePlate() <em>License Plate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicensePlate()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_PLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicensePlate() <em>License Plate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicensePlate()
	 * @generated
	 * @ordered
	 */
	protected String licensePlate = LICENSE_PLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVAILABILITY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailability()
	 * @generated
	 * @ordered
	 */
	protected boolean availability = AVAILABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlight() <em>Flight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlight()
	 * @generated
	 * @ordered
	 */
	protected Flight flight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Flight_plannerPackage.Literals.PLANE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Flight_plannerPackage.PLANE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flight_plannerPackage.PLANE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicensePlate() {
		return licensePlate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicensePlate(String newLicensePlate) {
		String oldLicensePlate = licensePlate;
		licensePlate = newLicensePlate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flight_plannerPackage.PLANE__LICENSE_PLATE, oldLicensePlate, licensePlate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(boolean newAvailability) {
		boolean oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flight_plannerPackage.PLANE__AVAILABILITY, oldAvailability, availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flight getFlight() {
		if (flight != null && flight.eIsProxy()) {
			InternalEObject oldFlight = (InternalEObject)flight;
			flight = (Flight)eResolveProxy(oldFlight);
			if (flight != oldFlight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Flight_plannerPackage.PLANE__FLIGHT, oldFlight, flight));
			}
		}
		return flight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flight basicGetFlight() {
		return flight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlight(Flight newFlight, NotificationChain msgs) {
		Flight oldFlight = flight;
		flight = newFlight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Flight_plannerPackage.PLANE__FLIGHT, oldFlight, newFlight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlight(Flight newFlight) {
		if (newFlight != flight) {
			NotificationChain msgs = null;
			if (flight != null)
				msgs = ((InternalEObject)flight).eInverseRemove(this, Flight_plannerPackage.FLIGHT__PLANE, Flight.class, msgs);
			if (newFlight != null)
				msgs = ((InternalEObject)newFlight).eInverseAdd(this, Flight_plannerPackage.FLIGHT__PLANE, Flight.class, msgs);
			msgs = basicSetFlight(newFlight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flight_plannerPackage.PLANE__FLIGHT, newFlight, newFlight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Flight_plannerPackage.PLANE__FLIGHT:
				if (flight != null)
					msgs = ((InternalEObject)flight).eInverseRemove(this, Flight_plannerPackage.FLIGHT__PLANE, Flight.class, msgs);
				return basicSetFlight((Flight)otherEnd, msgs);
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
			case Flight_plannerPackage.PLANE__FLIGHT:
				return basicSetFlight(null, msgs);
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
			case Flight_plannerPackage.PLANE__NAME:
				return getName();
			case Flight_plannerPackage.PLANE__MODEL:
				return getModel();
			case Flight_plannerPackage.PLANE__LICENSE_PLATE:
				return getLicensePlate();
			case Flight_plannerPackage.PLANE__AVAILABILITY:
				return isAvailability();
			case Flight_plannerPackage.PLANE__FLIGHT:
				if (resolve) return getFlight();
				return basicGetFlight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Flight_plannerPackage.PLANE__NAME:
				setName((String)newValue);
				return;
			case Flight_plannerPackage.PLANE__MODEL:
				setModel((String)newValue);
				return;
			case Flight_plannerPackage.PLANE__LICENSE_PLATE:
				setLicensePlate((String)newValue);
				return;
			case Flight_plannerPackage.PLANE__AVAILABILITY:
				setAvailability((Boolean)newValue);
				return;
			case Flight_plannerPackage.PLANE__FLIGHT:
				setFlight((Flight)newValue);
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
			case Flight_plannerPackage.PLANE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Flight_plannerPackage.PLANE__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case Flight_plannerPackage.PLANE__LICENSE_PLATE:
				setLicensePlate(LICENSE_PLATE_EDEFAULT);
				return;
			case Flight_plannerPackage.PLANE__AVAILABILITY:
				setAvailability(AVAILABILITY_EDEFAULT);
				return;
			case Flight_plannerPackage.PLANE__FLIGHT:
				setFlight((Flight)null);
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
			case Flight_plannerPackage.PLANE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Flight_plannerPackage.PLANE__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case Flight_plannerPackage.PLANE__LICENSE_PLATE:
				return LICENSE_PLATE_EDEFAULT == null ? licensePlate != null : !LICENSE_PLATE_EDEFAULT.equals(licensePlate);
			case Flight_plannerPackage.PLANE__AVAILABILITY:
				return availability != AVAILABILITY_EDEFAULT;
			case Flight_plannerPackage.PLANE__FLIGHT:
				return flight != null;
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
		result.append(", model: ");
		result.append(model);
		result.append(", licensePlate: ");
		result.append(licensePlate);
		result.append(", availability: ");
		result.append(availability);
		result.append(')');
		return result.toString();
	}

} //PlaneImpl
