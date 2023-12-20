/**
 */
package flight_planner;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see flight_planner.Flight_plannerFactory
 * @model kind="package"
 * @generated
 */
public interface Flight_plannerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flight_planner";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unican.es/ildm/flight_planner";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flight_planner";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Flight_plannerPackage eINSTANCE = flight_planner.impl.Flight_plannerPackageImpl.init();

	/**
	 * The meta object id for the '{@link flight_planner.impl.PlaneImpl <em>Plane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flight_planner.impl.PlaneImpl
	 * @see flight_planner.impl.Flight_plannerPackageImpl#getPlane()
	 * @generated
	 */
	int PLANE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__MODEL = 1;

	/**
	 * The feature id for the '<em><b>License Plate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__LICENSE_PLATE = 2;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__AVAILABILITY = 3;

	/**
	 * The feature id for the '<em><b>Flight</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__FLIGHT = 4;

	/**
	 * The number of structural features of the '<em>Plane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Plane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flight_planner.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flight_planner.impl.PlaceImpl
	 * @see flight_planner.impl.Flight_plannerPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flight_planner.impl.FlightImpl <em>Flight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flight_planner.impl.FlightImpl
	 * @see flight_planner.impl.Flight_plannerPackageImpl#getFlight()
	 * @generated
	 */
	int FLIGHT = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Takeoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__TAKEOFF = 1;

	/**
	 * The feature id for the '<em><b>Landing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__LANDING = 2;

	/**
	 * The feature id for the '<em><b>Plane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__PLANE = 3;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__ORIGIN = 4;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__DESTINATION = 5;

	/**
	 * The number of structural features of the '<em>Flight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Flight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flight_planner.impl.BaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flight_planner.impl.BaseImpl
	 * @see flight_planner.impl.Flight_plannerPackageImpl#getBase()
	 * @generated
	 */
	int BASE = 3;

	/**
	 * The feature id for the '<em><b>Infrastructure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__INFRASTRUCTURE = PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_COUNT = PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OPERATION_COUNT = PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flight_planner.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flight_planner.impl.InfrastructureImpl
	 * @see flight_planner.impl.Flight_plannerPackageImpl#getInfrastructure()
	 * @generated
	 */
	int INFRASTRUCTURE = 4;

	/**
	 * The number of structural features of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flight_planner.impl.MaintenanceHangarImpl <em>Maintenance Hangar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flight_planner.impl.MaintenanceHangarImpl
	 * @see flight_planner.impl.Flight_plannerPackageImpl#getMaintenanceHangar()
	 * @generated
	 */
	int MAINTENANCE_HANGAR = 5;

	/**
	 * The number of structural features of the '<em>Maintenance Hangar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_HANGAR_FEATURE_COUNT = INFRASTRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Maintenance Hangar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_HANGAR_OPERATION_COUNT = INFRASTRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flight_planner.impl.AdministrationOficineImpl <em>Administration Oficine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flight_planner.impl.AdministrationOficineImpl
	 * @see flight_planner.impl.Flight_plannerPackageImpl#getAdministrationOficine()
	 * @generated
	 */
	int ADMINISTRATION_OFICINE = 6;

	/**
	 * The number of structural features of the '<em>Administration Oficine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_OFICINE_FEATURE_COUNT = INFRASTRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Administration Oficine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_OFICINE_OPERATION_COUNT = INFRASTRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flight_planner.impl.NoBaseImpl <em>No Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flight_planner.impl.NoBaseImpl
	 * @see flight_planner.impl.Flight_plannerPackageImpl#getNoBase()
	 * @generated
	 */
	int NO_BASE = 7;

	/**
	 * The number of structural features of the '<em>No Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_BASE_FEATURE_COUNT = PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_BASE_OPERATION_COUNT = PLACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link flight_planner.Plane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plane</em>'.
	 * @see flight_planner.Plane
	 * @generated
	 */
	EClass getPlane();

	/**
	 * Returns the meta object for the attribute '{@link flight_planner.Plane#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see flight_planner.Plane#getName()
	 * @see #getPlane()
	 * @generated
	 */
	EAttribute getPlane_Name();

	/**
	 * Returns the meta object for the attribute '{@link flight_planner.Plane#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see flight_planner.Plane#getModel()
	 * @see #getPlane()
	 * @generated
	 */
	EAttribute getPlane_Model();

	/**
	 * Returns the meta object for the attribute '{@link flight_planner.Plane#getLicensePlate <em>License Plate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License Plate</em>'.
	 * @see flight_planner.Plane#getLicensePlate()
	 * @see #getPlane()
	 * @generated
	 */
	EAttribute getPlane_LicensePlate();

	/**
	 * Returns the meta object for the attribute '{@link flight_planner.Plane#isAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability</em>'.
	 * @see flight_planner.Plane#isAvailability()
	 * @see #getPlane()
	 * @generated
	 */
	EAttribute getPlane_Availability();

	/**
	 * Returns the meta object for the reference '{@link flight_planner.Plane#getFlight <em>Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flight</em>'.
	 * @see flight_planner.Plane#getFlight()
	 * @see #getPlane()
	 * @generated
	 */
	EReference getPlane_Flight();

	/**
	 * Returns the meta object for class '{@link flight_planner.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see flight_planner.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for class '{@link flight_planner.Flight <em>Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flight</em>'.
	 * @see flight_planner.Flight
	 * @generated
	 */
	EClass getFlight();

	/**
	 * Returns the meta object for the attribute '{@link flight_planner.Flight#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see flight_planner.Flight#getNumber()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_Number();

	/**
	 * Returns the meta object for the attribute '{@link flight_planner.Flight#getTakeoff <em>Takeoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Takeoff</em>'.
	 * @see flight_planner.Flight#getTakeoff()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_Takeoff();

	/**
	 * Returns the meta object for the attribute '{@link flight_planner.Flight#getLanding <em>Landing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Landing</em>'.
	 * @see flight_planner.Flight#getLanding()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_Landing();

	/**
	 * Returns the meta object for the reference '{@link flight_planner.Flight#getPlane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plane</em>'.
	 * @see flight_planner.Flight#getPlane()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Plane();

	/**
	 * Returns the meta object for the reference '{@link flight_planner.Flight#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see flight_planner.Flight#getOrigin()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Origin();

	/**
	 * Returns the meta object for the reference '{@link flight_planner.Flight#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see flight_planner.Flight#getDestination()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Destination();

	/**
	 * Returns the meta object for class '{@link flight_planner.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see flight_planner.Base
	 * @generated
	 */
	EClass getBase();

	/**
	 * Returns the meta object for the reference list '{@link flight_planner.Base#getInfrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Infrastructure</em>'.
	 * @see flight_planner.Base#getInfrastructure()
	 * @see #getBase()
	 * @generated
	 */
	EReference getBase_Infrastructure();

	/**
	 * Returns the meta object for class '{@link flight_planner.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure</em>'.
	 * @see flight_planner.Infrastructure
	 * @generated
	 */
	EClass getInfrastructure();

	/**
	 * Returns the meta object for class '{@link flight_planner.MaintenanceHangar <em>Maintenance Hangar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintenance Hangar</em>'.
	 * @see flight_planner.MaintenanceHangar
	 * @generated
	 */
	EClass getMaintenanceHangar();

	/**
	 * Returns the meta object for class '{@link flight_planner.AdministrationOficine <em>Administration Oficine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administration Oficine</em>'.
	 * @see flight_planner.AdministrationOficine
	 * @generated
	 */
	EClass getAdministrationOficine();

	/**
	 * Returns the meta object for class '{@link flight_planner.NoBase <em>No Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Base</em>'.
	 * @see flight_planner.NoBase
	 * @generated
	 */
	EClass getNoBase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Flight_plannerFactory getFlight_plannerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link flight_planner.impl.PlaneImpl <em>Plane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flight_planner.impl.PlaneImpl
		 * @see flight_planner.impl.Flight_plannerPackageImpl#getPlane()
		 * @generated
		 */
		EClass PLANE = eINSTANCE.getPlane();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANE__NAME = eINSTANCE.getPlane_Name();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANE__MODEL = eINSTANCE.getPlane_Model();

		/**
		 * The meta object literal for the '<em><b>License Plate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANE__LICENSE_PLATE = eINSTANCE.getPlane_LicensePlate();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANE__AVAILABILITY = eINSTANCE.getPlane_Availability();

		/**
		 * The meta object literal for the '<em><b>Flight</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANE__FLIGHT = eINSTANCE.getPlane_Flight();

		/**
		 * The meta object literal for the '{@link flight_planner.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flight_planner.impl.PlaceImpl
		 * @see flight_planner.impl.Flight_plannerPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '{@link flight_planner.impl.FlightImpl <em>Flight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flight_planner.impl.FlightImpl
		 * @see flight_planner.impl.Flight_plannerPackageImpl#getFlight()
		 * @generated
		 */
		EClass FLIGHT = eINSTANCE.getFlight();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__NUMBER = eINSTANCE.getFlight_Number();

		/**
		 * The meta object literal for the '<em><b>Takeoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__TAKEOFF = eINSTANCE.getFlight_Takeoff();

		/**
		 * The meta object literal for the '<em><b>Landing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__LANDING = eINSTANCE.getFlight_Landing();

		/**
		 * The meta object literal for the '<em><b>Plane</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__PLANE = eINSTANCE.getFlight_Plane();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__ORIGIN = eINSTANCE.getFlight_Origin();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__DESTINATION = eINSTANCE.getFlight_Destination();

		/**
		 * The meta object literal for the '{@link flight_planner.impl.BaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flight_planner.impl.BaseImpl
		 * @see flight_planner.impl.Flight_plannerPackageImpl#getBase()
		 * @generated
		 */
		EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '<em><b>Infrastructure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE__INFRASTRUCTURE = eINSTANCE.getBase_Infrastructure();

		/**
		 * The meta object literal for the '{@link flight_planner.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flight_planner.impl.InfrastructureImpl
		 * @see flight_planner.impl.Flight_plannerPackageImpl#getInfrastructure()
		 * @generated
		 */
		EClass INFRASTRUCTURE = eINSTANCE.getInfrastructure();

		/**
		 * The meta object literal for the '{@link flight_planner.impl.MaintenanceHangarImpl <em>Maintenance Hangar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flight_planner.impl.MaintenanceHangarImpl
		 * @see flight_planner.impl.Flight_plannerPackageImpl#getMaintenanceHangar()
		 * @generated
		 */
		EClass MAINTENANCE_HANGAR = eINSTANCE.getMaintenanceHangar();

		/**
		 * The meta object literal for the '{@link flight_planner.impl.AdministrationOficineImpl <em>Administration Oficine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flight_planner.impl.AdministrationOficineImpl
		 * @see flight_planner.impl.Flight_plannerPackageImpl#getAdministrationOficine()
		 * @generated
		 */
		EClass ADMINISTRATION_OFICINE = eINSTANCE.getAdministrationOficine();

		/**
		 * The meta object literal for the '{@link flight_planner.impl.NoBaseImpl <em>No Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flight_planner.impl.NoBaseImpl
		 * @see flight_planner.impl.Flight_plannerPackageImpl#getNoBase()
		 * @generated
		 */
		EClass NO_BASE = eINSTANCE.getNoBase();

	}

} //Flight_plannerPackage
