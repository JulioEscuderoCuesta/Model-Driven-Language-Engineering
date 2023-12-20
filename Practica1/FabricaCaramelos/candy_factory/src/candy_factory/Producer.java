/**
 */
package candy_factory;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link candy_factory.Producer#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @see candy_factory.Candy_factoryPackage#getProducer()
 * @model abstract="true"
 * @generated
 */
public interface Producer extends Machine {
	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(int)
	 * @see candy_factory.Candy_factoryPackage#getProducer_Counter()
	 * @model required="true"
	 * @generated
	 */
	int getCounter();

	/**
	 * Sets the value of the '{@link candy_factory.Producer#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(int value);

} // Producer
