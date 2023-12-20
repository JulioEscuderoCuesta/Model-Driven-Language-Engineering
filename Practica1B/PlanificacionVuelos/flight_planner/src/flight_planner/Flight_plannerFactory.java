/**
 */
package flight_planner;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see flight_planner.Flight_plannerPackage
 * @generated
 */
public interface Flight_plannerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Flight_plannerFactory eINSTANCE = flight_planner.impl.Flight_plannerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Plane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plane</em>'.
	 * @generated
	 */
	Plane createPlane();

	/**
	 * Returns a new object of class '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flight</em>'.
	 * @generated
	 */
	Flight createFlight();

	/**
	 * Returns a new object of class '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base</em>'.
	 * @generated
	 */
	Base createBase();

	/**
	 * Returns a new object of class '<em>Maintenance Hangar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maintenance Hangar</em>'.
	 * @generated
	 */
	MaintenanceHangar createMaintenanceHangar();

	/**
	 * Returns a new object of class '<em>Administration Oficine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Administration Oficine</em>'.
	 * @generated
	 */
	AdministrationOficine createAdministrationOficine();

	/**
	 * Returns a new object of class '<em>No Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Base</em>'.
	 * @generated
	 */
	NoBase createNoBase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Flight_plannerPackage getFlight_plannerPackage();

} //Flight_plannerFactory
