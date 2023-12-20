/**
 */
package candy_factory;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link candy_factory.Machine#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link candy_factory.Machine#getOutput <em>Output</em>}</li>
 *   <li>{@link candy_factory.Machine#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see candy_factory.Candy_factoryPackage#getMachine()
 * @model abstract="true"
 * @generated
 */
public interface Machine extends Element {
	/**
	 * Returns the value of the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Time</em>' attribute.
	 * @see #setProcessingTime(int)
	 * @see candy_factory.Candy_factoryPackage#getMachine_ProcessingTime()
	 * @model required="true"
	 * @generated
	 */
	int getProcessingTime();

	/**
	 * Sets the value of the '{@link candy_factory.Machine#getProcessingTime <em>Processing Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Time</em>' attribute.
	 * @see #getProcessingTime()
	 * @generated
	 */
	void setProcessingTime(int value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link candy_factory.ConveyorBelt#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(ConveyorBelt)
	 * @see candy_factory.Candy_factoryPackage#getMachine_Output()
	 * @see candy_factory.ConveyorBelt#getSource
	 * @model opposite="source"
	 * @generated
	 */
	ConveyorBelt getOutput();

	/**
	 * Sets the value of the '{@link candy_factory.Machine#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(ConveyorBelt value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link candy_factory.ConveyorBelt}.
	 * It is bidirectional and its opposite is '{@link candy_factory.ConveyorBelt#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see candy_factory.Candy_factoryPackage#getMachine_Input()
	 * @see candy_factory.ConveyorBelt#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ConveyorBelt> getInput();

} // Machine
