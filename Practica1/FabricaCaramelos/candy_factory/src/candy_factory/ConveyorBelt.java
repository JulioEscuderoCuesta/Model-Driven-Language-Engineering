/**
 */
package candy_factory;

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
 *   <li>{@link candy_factory.ConveyorBelt#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link candy_factory.ConveyorBelt#getTarget <em>Target</em>}</li>
 *   <li>{@link candy_factory.ConveyorBelt#getSource <em>Source</em>}</li>
 *   <li>{@link candy_factory.ConveyorBelt#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see candy_factory.Candy_factoryPackage#getConveyorBelt()
 * @model
 * @generated
 */
public interface ConveyorBelt extends Element {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see candy_factory.Candy_factoryPackage#getConveyorBelt_Capacity()
	 * @model required="true"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link candy_factory.ConveyorBelt#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link candy_factory.Machine#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Machine)
	 * @see candy_factory.Candy_factoryPackage#getConveyorBelt_Target()
	 * @see candy_factory.Machine#getInput
	 * @model opposite="input"
	 * @generated
	 */
	Machine getTarget();

	/**
	 * Sets the value of the '{@link candy_factory.ConveyorBelt#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Machine value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link candy_factory.Machine#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Machine)
	 * @see candy_factory.Candy_factoryPackage#getConveyorBelt_Source()
	 * @see candy_factory.Machine#getOutput
	 * @model opposite="output"
	 * @generated
	 */
	Machine getSource();

	/**
	 * Sets the value of the '{@link candy_factory.ConveyorBelt#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Machine value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link candy_factory.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see candy_factory.Candy_factoryPackage#getConveyorBelt_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

} // ConveyorBelt
