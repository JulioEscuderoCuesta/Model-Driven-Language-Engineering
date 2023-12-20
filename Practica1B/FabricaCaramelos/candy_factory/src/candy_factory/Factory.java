/**
 */
package candy_factory;

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
 *   <li>{@link candy_factory.Factory#getName <em>Name</em>}</li>
 *   <li>{@link candy_factory.Factory#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see candy_factory.Candy_factoryPackage#getFactory()
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
	 * @see candy_factory.Candy_factoryPackage#getFactory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link candy_factory.Factory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link candy_factory.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see candy_factory.Candy_factoryPackage#getFactory_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // Factory
