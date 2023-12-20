/**
 */
package flight_planner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flight_planner.Base#getInfrastructure <em>Infrastructure</em>}</li>
 * </ul>
 *
 * @see flight_planner.Flight_plannerPackage#getBase()
 * @model
 * @generated
 */
public interface Base extends Place {
	/**
	 * Returns the value of the '<em><b>Infrastructure</b></em>' reference list.
	 * The list contents are of type {@link flight_planner.Infrastructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure</em>' reference list.
	 * @see flight_planner.Flight_plannerPackage#getBase_Infrastructure()
	 * @model required="true"
	 * @generated
	 */
	EList<Infrastructure> getInfrastructure();

} // Base
