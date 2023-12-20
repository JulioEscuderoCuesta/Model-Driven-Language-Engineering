/**
 */
package candy_factory_v2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor Belt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link candy_factory_v2.ConveyorBelt#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link candy_factory_v2.ConveyorBelt#getTarget <em>Target</em>}</li>
 *   <li>{@link candy_factory_v2.ConveyorBelt#getSource <em>Source</em>}</li>
 *   <li>{@link candy_factory_v2.ConveyorBelt#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see candy_factory_v2.Candy_factory_v2Package#getConveyorBelt()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CapacityExceeded'"
 * @generated
 */
public interface ConveyorBelt extends Element {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see candy_factory_v2.Candy_factory_v2Package#getConveyorBelt_Capacity()
	 * @model required="true"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link candy_factory_v2.ConveyorBelt#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link candy_factory_v2.Machine#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Machine)
	 * @see candy_factory_v2.Candy_factory_v2Package#getConveyorBelt_Target()
	 * @see candy_factory_v2.Machine#getInput
	 * @model opposite="input"
	 * @generated
	 */
	Machine getTarget();

	/**
	 * Sets the value of the '{@link candy_factory_v2.ConveyorBelt#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Machine value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link candy_factory_v2.Machine#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Machine)
	 * @see candy_factory_v2.Candy_factory_v2Package#getConveyorBelt_Source()
	 * @see candy_factory_v2.Machine#getOutput
	 * @model opposite="output"
	 * @generated
	 */
	Machine getSource();

	/**
	 * Sets the value of the '{@link candy_factory_v2.ConveyorBelt#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Machine value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link candy_factory_v2.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see candy_factory_v2.Candy_factory_v2Package#getConveyorBelt_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='component -&gt; size() &lt;= capacity'"
	 * @generated
	 */
	boolean hasSpaceLeft();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Conveyor belt\'\' + id + \'\'has exceeded its capacity\',\n\tstatus : Boolean = \n\t\t\thasSpaceLeft()\n}.status'"
	 * @generated
	 */
	boolean CapacityExceeded(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ConveyorBelt
