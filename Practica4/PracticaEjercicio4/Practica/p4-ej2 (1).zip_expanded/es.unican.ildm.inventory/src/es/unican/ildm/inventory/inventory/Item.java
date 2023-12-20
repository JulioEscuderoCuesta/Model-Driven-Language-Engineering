/**
 */
package es.unican.ildm.inventory.inventory;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.ildm.inventory.inventory.Item#getItemName <em>Item Name</em>}</li>
 *   <li>{@link es.unican.ildm.inventory.inventory.Item#getState <em>State</em>}</li>
 *   <li>{@link es.unican.ildm.inventory.inventory.Item#getPrice <em>Price</em>}</li>
 *   <li>{@link es.unican.ildm.inventory.inventory.Item#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see es.unican.ildm.inventory.inventory.InventoryPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Name</em>' attribute.
	 * @see #setItemName(String)
	 * @see es.unican.ildm.inventory.inventory.InventoryPackage#getItem_ItemName()
	 * @model
	 * @generated
	 */
	String getItemName();

	/**
	 * Sets the value of the '{@link es.unican.ildm.inventory.inventory.Item#getItemName <em>Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Name</em>' attribute.
	 * @see #getItemName()
	 * @generated
	 */
	void setItemName(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.ildm.inventory.inventory.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see es.unican.ildm.inventory.inventory.State
	 * @see #setState(State)
	 * @see es.unican.ildm.inventory.inventory.InventoryPackage#getItem_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link es.unican.ildm.inventory.inventory.Item#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see es.unican.ildm.inventory.inventory.State
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(Double)
	 * @see es.unican.ildm.inventory.inventory.InventoryPackage#getItem_Price()
	 * @model
	 * @generated
	 */
	Double getPrice();

	/**
	 * Sets the value of the '{@link es.unican.ildm.inventory.inventory.Item#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(Double value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.ildm.inventory.inventory.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference list.
	 * @see es.unican.ildm.inventory.inventory.InventoryPackage#getItem_Tag()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTag();

} // Item
