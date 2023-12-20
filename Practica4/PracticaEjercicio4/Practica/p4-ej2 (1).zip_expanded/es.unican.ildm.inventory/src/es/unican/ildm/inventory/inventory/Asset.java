/**
 */
package es.unican.ildm.inventory.inventory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.ildm.inventory.inventory.Asset#getAssetType <em>Asset Type</em>}</li>
 *   <li>{@link es.unican.ildm.inventory.inventory.Asset#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see es.unican.ildm.inventory.inventory.InventoryPackage#getAsset()
 * @model
 * @generated
 */
public interface Asset extends EObject {
	/**
	 * Returns the value of the '<em><b>Asset Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Type</em>' attribute.
	 * @see #setAssetType(String)
	 * @see es.unican.ildm.inventory.inventory.InventoryPackage#getAsset_AssetType()
	 * @model
	 * @generated
	 */
	String getAssetType();

	/**
	 * Sets the value of the '{@link es.unican.ildm.inventory.inventory.Asset#getAssetType <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Type</em>' attribute.
	 * @see #getAssetType()
	 * @generated
	 */
	void setAssetType(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.ildm.inventory.inventory.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see es.unican.ildm.inventory.inventory.Location
	 * @see #setLocation(Location)
	 * @see es.unican.ildm.inventory.inventory.InventoryPackage#getAsset_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link es.unican.ildm.inventory.inventory.Asset#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see es.unican.ildm.inventory.inventory.Location
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // Asset
