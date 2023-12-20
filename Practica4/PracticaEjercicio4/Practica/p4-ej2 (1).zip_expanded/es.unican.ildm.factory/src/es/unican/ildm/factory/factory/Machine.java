/**
 */
package es.unican.ildm.factory.factory;

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
 *   <li>{@link es.unican.ildm.factory.factory.Machine#getTiempoProcesado <em>Tiempo Procesado</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.Machine#getInput <em>Input</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.Machine#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see es.unican.ildm.factory.factory.FactoryPackage#getMachine()
 * @model abstract="true"
 * @generated
 */
public interface Machine extends Element {
	/**
	 * Returns the value of the '<em><b>Tiempo Procesado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiempo Procesado</em>' attribute.
	 * @see #setTiempoProcesado(int)
	 * @see es.unican.ildm.factory.factory.FactoryPackage#getMachine_TiempoProcesado()
	 * @model required="true"
	 * @generated
	 */
	int getTiempoProcesado();

	/**
	 * Sets the value of the '{@link es.unican.ildm.factory.factory.Machine#getTiempoProcesado <em>Tiempo Procesado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiempo Procesado</em>' attribute.
	 * @see #getTiempoProcesado()
	 * @generated
	 */
	void setTiempoProcesado(int value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link es.unican.ildm.factory.factory.Tray}.
	 * It is bidirectional and its opposite is '{@link es.unican.ildm.factory.factory.Tray#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see es.unican.ildm.factory.factory.FactoryPackage#getMachine_Input()
	 * @see es.unican.ildm.factory.factory.Tray#getTarget
	 * @model opposite="target" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Tray> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.unican.ildm.factory.factory.Tray#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Tray)
	 * @see es.unican.ildm.factory.factory.FactoryPackage#getMachine_Output()
	 * @see es.unican.ildm.factory.factory.Tray#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Tray getOutput();

	/**
	 * Sets the value of the '{@link es.unican.ildm.factory.factory.Machine#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Tray value);

} // Machine
