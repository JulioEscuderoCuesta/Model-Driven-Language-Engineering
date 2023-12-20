/**
 */
package es.unican.ildm.factory.factory;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.ildm.factory.factory.Maker#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @see es.unican.ildm.factory.factory.FactoryPackage#getMaker()
 * @model abstract="true"
 * @generated
 */
public interface Maker extends Machine {
	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(int)
	 * @see es.unican.ildm.factory.factory.FactoryPackage#getMaker_Counter()
	 * @model required="true"
	 * @generated
	 */
	int getCounter();

	/**
	 * Sets the value of the '{@link es.unican.ildm.factory.factory.Maker#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(int value);

} // Maker
