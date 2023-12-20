/**
 */
package candy_factory_v2;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link candy_factory_v2.Factory#getName <em>Name</em>}</li>
 *   <li>{@link candy_factory_v2.Factory#getElements <em>Elements</em>}</li>
 *   <li>{@link candy_factory_v2.Factory#getNumberOfElementsProduced <em>Number Of Elements Produced</em>}</li>
 *   <li>{@link candy_factory_v2.Factory#getNumberOfElementsInTheFactory <em>Number Of Elements In The Factory</em>}</li>
 * </ul>
 *
 * @see candy_factory_v2.Candy_factory_v2Package#getFactory()
 * @model
 * @generated
 */
public interface Factory extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see candy_factory_v2.Candy_factory_v2Package#getFactory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link candy_factory_v2.Factory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link candy_factory_v2.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see candy_factory_v2.Candy_factory_v2Package#getFactory_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Number Of Elements Produced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Elements Produced</em>' attribute.
	 * @see #setNumberOfElementsProduced(BigInteger)
	 * @see candy_factory_v2.Candy_factory_v2Package#getFactory_NumberOfElementsProduced()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	BigInteger getNumberOfElementsProduced();

	/**
	 * Sets the value of the '{@link candy_factory_v2.Factory#getNumberOfElementsProduced <em>Number Of Elements Produced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Elements Produced</em>' attribute.
	 * @see #getNumberOfElementsProduced()
	 * @generated
	 */
	void setNumberOfElementsProduced(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Number Of Elements In The Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Elements In The Factory</em>' attribute.
	 * @see #setNumberOfElementsInTheFactory(BigInteger)
	 * @see candy_factory_v2.Candy_factory_v2Package#getFactory_NumberOfElementsInTheFactory()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	BigInteger getNumberOfElementsInTheFactory();

	/**
	 * Sets the value of the '{@link candy_factory_v2.Factory#getNumberOfElementsInTheFactory <em>Number Of Elements In The Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Elements In The Factory</em>' attribute.
	 * @see #getNumberOfElementsInTheFactory()
	 * @generated
	 */
	void setNumberOfElementsInTheFactory(BigInteger value);

} // Factory
