/**
 */
package flight_planner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flight_planner.Plane#getName <em>Name</em>}</li>
 *   <li>{@link flight_planner.Plane#getModel <em>Model</em>}</li>
 *   <li>{@link flight_planner.Plane#getLicensePlate <em>License Plate</em>}</li>
 *   <li>{@link flight_planner.Plane#isAvailability <em>Availability</em>}</li>
 *   <li>{@link flight_planner.Plane#getFlight <em>Flight</em>}</li>
 * </ul>
 *
 * @see flight_planner.Flight_plannerPackage#getPlane()
 * @model
 * @generated
 */
public interface Plane extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see flight_planner.Flight_plannerPackage#getPlane_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link flight_planner.Plane#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see flight_planner.Flight_plannerPackage#getPlane_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link flight_planner.Plane#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>License Plate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Plate</em>' attribute.
	 * @see #setLicensePlate(String)
	 * @see flight_planner.Flight_plannerPackage#getPlane_LicensePlate()
	 * @model
	 * @generated
	 */
	String getLicensePlate();

	/**
	 * Sets the value of the '{@link flight_planner.Plane#getLicensePlate <em>License Plate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Plate</em>' attribute.
	 * @see #getLicensePlate()
	 * @generated
	 */
	void setLicensePlate(String value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' attribute.
	 * @see #setAvailability(boolean)
	 * @see flight_planner.Flight_plannerPackage#getPlane_Availability()
	 * @model default="true"
	 * @generated
	 */
	boolean isAvailability();

	/**
	 * Sets the value of the '{@link flight_planner.Plane#isAvailability <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' attribute.
	 * @see #isAvailability()
	 * @generated
	 */
	void setAvailability(boolean value);

	/**
	 * Returns the value of the '<em><b>Flight</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link flight_planner.Flight#getPlane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight</em>' reference.
	 * @see #setFlight(Flight)
	 * @see flight_planner.Flight_plannerPackage#getPlane_Flight()
	 * @see flight_planner.Flight#getPlane
	 * @model opposite="plane"
	 * @generated
	 */
	Flight getFlight();

	/**
	 * Sets the value of the '{@link flight_planner.Plane#getFlight <em>Flight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight</em>' reference.
	 * @see #getFlight()
	 * @generated
	 */
	void setFlight(Flight value);

} // Plane
