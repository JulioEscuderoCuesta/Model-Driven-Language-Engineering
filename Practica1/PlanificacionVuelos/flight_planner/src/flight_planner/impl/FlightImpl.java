/**
 */
package flight_planner.impl;

import flight_planner.Flight;
import flight_planner.Flight_plannerPackage;
import flight_planner.Place;
import flight_planner.Plane;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flight_planner.impl.FlightImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link flight_planner.impl.FlightImpl#getTakeoff <em>Takeoff</em>}</li>
 *   <li>{@link flight_planner.impl.FlightImpl#getLanding <em>Landing</em>}</li>
 *   <li>{@link flight_planner.impl.FlightImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link flight_planner.impl.FlightImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link flight_planner.impl.FlightImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightImpl extends MinimalEObjectImpl.Container implements Flight {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTakeoff() <em>Takeoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakeoff()
	 * @generated
	 * @ordered
	 */
	protected static final int TAKEOFF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTakeoff() <em>Takeoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakeoff()
	 * @generated
	 * @ordered
	 */
	protected int takeoff = TAKEOFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanding() <em>Landing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanding()
	 * @generated
	 * @ordered
	 */
	protected static final int LANDING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLanding() <em>Landing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanding()
	 * @generated
	 * @ordered
	 */
	protected int landing = LANDING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlane() <em>Plane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlane()
	 * @generated
	 * @ordered
	 */
	protected Plane plane;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Place origin;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Place destination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Flight_plannerPackage.Literals.FLIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flight_plannerPackage.FLIGHT__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTakeoff() {
		return takeoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTakeoff(int newTakeoff) {
		int oldTakeoff = takeoff;
		takeoff = newTakeoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flight_plannerPackage.FLIGHT__TAKEOFF, oldTakeoff, takeoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLanding() {
		return landing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanding(int newLanding) {
		int oldLanding = landing;
		landing = newLanding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flight_plannerPackage.FLIGHT__LANDING, oldLanding, landing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plane getPlane() {
		if (plane != null && plane.eIsProxy()) {
			InternalEObject oldPlane = (InternalEObject)plane;
			plane = (Plane)eResolveProxy(oldPlane);
			if (plane != oldPlane) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Flight_plannerPackage.FLIGHT__PLANE, oldPlane, plane));
			}
		}
		return plane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plane basicGetPlane() {
		return plane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlane(Plane newPlane, NotificationChain msgs) {
		Plane oldPlane = plane;
		plane = newPlane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Flight_plannerPackage.FLIGHT__PLANE, oldPlane, newPlane);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlane(Plane newPlane) {
		if (newPlane != plane) {
			NotificationChain msgs = null;
			if (plane != null)
				msgs = ((InternalEObject)plane).eInverseRemove(this, Flight_plannerPackage.PLANE__FLIGHT, Plane.class, msgs);
			if (newPlane != null)
				msgs = ((InternalEObject)newPlane).eInverseAdd(this, Flight_plannerPackage.PLANE__FLIGHT, Plane.class, msgs);
			msgs = basicSetPlane(newPlane, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flight_plannerPackage.FLIGHT__PLANE, newPlane, newPlane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = (Place)eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Flight_plannerPackage.FLIGHT__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Place newOrigin) {
		Place oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flight_plannerPackage.FLIGHT__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (Place)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Flight_plannerPackage.FLIGHT__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Place newDestination) {
		Place oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Flight_plannerPackage.FLIGHT__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Flight_plannerPackage.FLIGHT__PLANE:
				if (plane != null)
					msgs = ((InternalEObject)plane).eInverseRemove(this, Flight_plannerPackage.PLANE__FLIGHT, Plane.class, msgs);
				return basicSetPlane((Plane)otherEnd, msgs);
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
			case Flight_plannerPackage.FLIGHT__PLANE:
				return basicSetPlane(null, msgs);
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
			case Flight_plannerPackage.FLIGHT__NUMBER:
				return getNumber();
			case Flight_plannerPackage.FLIGHT__TAKEOFF:
				return getTakeoff();
			case Flight_plannerPackage.FLIGHT__LANDING:
				return getLanding();
			case Flight_plannerPackage.FLIGHT__PLANE:
				if (resolve) return getPlane();
				return basicGetPlane();
			case Flight_plannerPackage.FLIGHT__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case Flight_plannerPackage.FLIGHT__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
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
			case Flight_plannerPackage.FLIGHT__NUMBER:
				setNumber((Integer)newValue);
				return;
			case Flight_plannerPackage.FLIGHT__TAKEOFF:
				setTakeoff((Integer)newValue);
				return;
			case Flight_plannerPackage.FLIGHT__LANDING:
				setLanding((Integer)newValue);
				return;
			case Flight_plannerPackage.FLIGHT__PLANE:
				setPlane((Plane)newValue);
				return;
			case Flight_plannerPackage.FLIGHT__ORIGIN:
				setOrigin((Place)newValue);
				return;
			case Flight_plannerPackage.FLIGHT__DESTINATION:
				setDestination((Place)newValue);
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
			case Flight_plannerPackage.FLIGHT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case Flight_plannerPackage.FLIGHT__TAKEOFF:
				setTakeoff(TAKEOFF_EDEFAULT);
				return;
			case Flight_plannerPackage.FLIGHT__LANDING:
				setLanding(LANDING_EDEFAULT);
				return;
			case Flight_plannerPackage.FLIGHT__PLANE:
				setPlane((Plane)null);
				return;
			case Flight_plannerPackage.FLIGHT__ORIGIN:
				setOrigin((Place)null);
				return;
			case Flight_plannerPackage.FLIGHT__DESTINATION:
				setDestination((Place)null);
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
			case Flight_plannerPackage.FLIGHT__NUMBER:
				return number != NUMBER_EDEFAULT;
			case Flight_plannerPackage.FLIGHT__TAKEOFF:
				return takeoff != TAKEOFF_EDEFAULT;
			case Flight_plannerPackage.FLIGHT__LANDING:
				return landing != LANDING_EDEFAULT;
			case Flight_plannerPackage.FLIGHT__PLANE:
				return plane != null;
			case Flight_plannerPackage.FLIGHT__ORIGIN:
				return origin != null;
			case Flight_plannerPackage.FLIGHT__DESTINATION:
				return destination != null;
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
		result.append(" (number: ");
		result.append(number);
		result.append(", takeoff: ");
		result.append(takeoff);
		result.append(", landing: ");
		result.append(landing);
		result.append(')');
		return result.toString();
	}

} //FlightImpl
