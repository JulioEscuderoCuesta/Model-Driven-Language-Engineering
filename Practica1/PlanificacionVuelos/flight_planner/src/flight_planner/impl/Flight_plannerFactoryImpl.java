/**
 */
package flight_planner.impl;

import flight_planner.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Flight_plannerFactoryImpl extends EFactoryImpl implements Flight_plannerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Flight_plannerFactory init() {
		try {
			Flight_plannerFactory theFlight_plannerFactory = (Flight_plannerFactory)EPackage.Registry.INSTANCE.getEFactory(Flight_plannerPackage.eNS_URI);
			if (theFlight_plannerFactory != null) {
				return theFlight_plannerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Flight_plannerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flight_plannerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Flight_plannerPackage.PLANE: return createPlane();
			case Flight_plannerPackage.FLIGHT: return createFlight();
			case Flight_plannerPackage.BASE: return createBase();
			case Flight_plannerPackage.MAINTENANCE_HANGAR: return createMaintenanceHangar();
			case Flight_plannerPackage.ADMINISTRATION_OFICINE: return createAdministrationOficine();
			case Flight_plannerPackage.NO_BASE: return createNoBase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plane createPlane() {
		PlaneImpl plane = new PlaneImpl();
		return plane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flight createFlight() {
		FlightImpl flight = new FlightImpl();
		return flight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base createBase() {
		BaseImpl base = new BaseImpl();
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceHangar createMaintenanceHangar() {
		MaintenanceHangarImpl maintenanceHangar = new MaintenanceHangarImpl();
		return maintenanceHangar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrationOficine createAdministrationOficine() {
		AdministrationOficineImpl administrationOficine = new AdministrationOficineImpl();
		return administrationOficine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoBase createNoBase() {
		NoBaseImpl noBase = new NoBaseImpl();
		return noBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flight_plannerPackage getFlight_plannerPackage() {
		return (Flight_plannerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Flight_plannerPackage getPackage() {
		return Flight_plannerPackage.eINSTANCE;
	}

} //Flight_plannerFactoryImpl
