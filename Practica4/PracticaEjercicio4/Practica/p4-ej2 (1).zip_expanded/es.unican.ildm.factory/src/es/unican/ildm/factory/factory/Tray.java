/**
 */
package es.unican.ildm.factory.factory;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tray</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.ildm.factory.factory.Tray#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.Tray#getSource <em>Source</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.Tray#getTarget <em>Target</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.Tray#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see es.unican.ildm.factory.factory.FactoryPackage#getTray()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OverCapacity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OverCapacity='Tuple {\n\tmessage : String = \'Tray has more parts than permitted\',\n\tstatus : Boolean = \n\t\t\tparts -&gt; size() &lt;= capacity\n}.status'"
 * @generated
 */
public interface Tray extends Element {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see es.unican.ildm.factory.factory.FactoryPackage#getTray_Capacity()
	 * @model required="true"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link es.unican.ildm.factory.factory.Tray#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.unican.ildm.factory.factory.Machine#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Machine)
	 * @see es.unican.ildm.factory.factory.FactoryPackage#getTray_Source()
	 * @see es.unican.ildm.factory.factory.Machine#getOutput
	 * @model opposite="output"
	 * @generated
	 */
	Machine getSource();

	/**
	 * Sets the value of the '{@link es.unican.ildm.factory.factory.Tray#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Machine value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.unican.ildm.factory.factory.Machine#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Machine)
	 * @see es.unican.ildm.factory.factory.FactoryPackage#getTray_Target()
	 * @see es.unican.ildm.factory.factory.Machine#getInput
	 * @model opposite="input"
	 * @generated
	 */
	Machine getTarget();

	/**
	 * Sets the value of the '{@link es.unican.ildm.factory.factory.Tray#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Machine value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.ildm.factory.factory.Part}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see es.unican.ildm.factory.factory.FactoryPackage#getTray_Parts()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Part> getParts();

} // Tray
