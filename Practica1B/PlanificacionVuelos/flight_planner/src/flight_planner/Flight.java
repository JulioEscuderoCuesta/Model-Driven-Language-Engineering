/**
 */
package flight_planner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flight_planner.Flight#getNumber <em>Number</em>}</li>
 *   <li>{@link flight_planner.Flight#getTakeoff <em>Takeoff</em>}</li>
 *   <li>{@link flight_planner.Flight#getLanding <em>Landing</em>}</li>
 *   <li>{@link flight_planner.Flight#getPlane <em>Plane</em>}</li>
 *   <li>{@link flight_planner.Flight#getOrigin <em>Origin</em>}</li>
 *   <li>{@link flight_planner.Flight#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see flight_planner.Flight_plannerPackage#getFlight()
 * @model
 * @generated
 */
public interface Flight extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see flight_planner.Flight_plannerPackage#getFlight_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link flight_planner.Flight#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Takeoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Takeoff</em>' attribute.
	 * @see #setTakeoff(int)
	 * @see flight_planner.Flight_plannerPackage#getFlight_Takeoff()
	 * @model
	 * @generated
	 */
	int getTakeoff();

	/**
	 * Sets the value of the '{@link flight_planner.Flight#getTakeoff <em>Takeoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Takeoff</em>' attribute.
	 * @see #getTakeoff()
	 * @generated
	 */
	void setTakeoff(int value);

	/**
	 * Returns the value of the '<em><b>Landing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing</em>' attribute.
	 * @see #setLanding(int)
	 * @see flight_planner.Flight_plannerPackage#getFlight_Landing()
	 * @model
	 * @generated
	 */
	int getLanding();

	/**
	 * Sets the value of the '{@link flight_planner.Flight#getLanding <em>Landing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing</em>' attribute.
	 * @see #getLanding()
	 * @generated
	 */
	void setLanding(int value);

	/**
	 * Returns the value of the '<em><b>Plane</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link flight_planner.Plane#getFlight <em>Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane</em>' reference.
	 * @see #setPlane(Plane)
	 * @see flight_planner.Flight_plannerPackage#getFlight_Plane()
	 * @see flight_planner.Plane#getFlight
	 * @model opposite="flight" required="true"
	 * @generated
	 */
	Plane getPlane();

	/**
	 * Sets the value of the '{@link flight_planner.Flight#getPlane <em>Plane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane</em>' reference.
	 * @see #getPlane()
	 * @generated
	 */
	void setPlane(Plane value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Place)
	 * @see flight_planner.Flight_plannerPackage#getFlight_Origin()
	 * @model required="true"
	 * @generated
	 */
	Place getOrigin();

	/**
	 * Sets the value of the '{@link flight_planner.Flight#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Place value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Place)
	 * @see flight_planner.Flight_plannerPackage#getFlight_Destination()
	 * @model required="true"
	 * @generated
	 */
	Place getDestination();

	/**
	 * Sets the value of the '{@link flight_planner.Flight#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Place value);

} // Flight
