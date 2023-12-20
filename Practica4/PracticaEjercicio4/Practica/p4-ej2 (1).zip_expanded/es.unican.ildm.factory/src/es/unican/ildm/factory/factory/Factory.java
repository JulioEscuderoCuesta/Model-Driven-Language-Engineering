/**
 */
package es.unican.ildm.factory.factory;

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
 *   <li>{@link es.unican.ildm.factory.factory.Factory#getElements <em>Elements</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.Factory#getTotalCounter <em>Total Counter</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.Factory#getCurrentParts <em>Current Parts</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.Factory#getTrays <em>Trays</em>}</li>
 *   <li>{@link es.unican.ildm.factory.factory.Factory#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see es.unican.ildm.factory.factory.FactoryPackage#getFactory()
 * @model
 * @generated
 */
public interface Factory extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.ildm.factory.factory.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see es.unican.ildm.factory.factory.FactoryPackage#getFactory_Elements()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Total Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Counter</em>' attribute.
	 * @see #setTotalCounter(int)
	 * @see es.unican.ildm.factory.factory.FactoryPackage#getFactory_TotalCounter()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='elements -&gt; select(element | element.oclIsKindOf(Maker)) -&gt; collect(element | element.oclAsType(Maker)) -&gt; collect(maker | maker.counter) -&gt; sum()'"
	 * @generated
	 */
	int getTotalCounter();

	/**
	 * Sets the value of the '{@link es.unican.ildm.factory.factory.Factory#getTotalCounter <em>Total Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Counter</em>' attribute.
	 * @see #getTotalCounter()
	 * @generated
	 */
	void setTotalCounter(int value);

	/**
	 * Returns the value of the '<em><b>Current Parts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Parts</em>' attribute.
	 * @see #setCurrentParts(int)
	 * @see es.unican.ildm.factory.factory.FactoryPackage#getFactory_CurrentParts()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='elements -&gt; select(element | element.oclIsKindOf(Tray)) -&gt; collect(element | element.oclAsType(Tray)) -&gt; collect(tray | tray.parts -&gt; size()) -&gt; sum()'"
	 * @generated
	 */
	int getCurrentParts();

	/**
	 * Sets the value of the '{@link es.unican.ildm.factory.factory.Factory#getCurrentParts <em>Current Parts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Parts</em>' attribute.
	 * @see #getCurrentParts()
	 * @generated
	 */
	void setCurrentParts(int value);

	/**
	 * Returns the value of the '<em><b>Trays</b></em>' reference list.
	 * The list contents are of type {@link es.unican.ildm.factory.factory.Tray}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trays</em>' reference list.
	 * @see es.unican.ildm.factory.factory.FactoryPackage#getFactory_Trays()
	 * @model changeable="false" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='elements -&gt; select(element | element.oclIsKindOf(Tray)) -&gt; collect(element | element.oclAsType(Tray))'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Tray> getTrays();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.unican.ildm.factory.factory.FactoryPackage#getFactory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.ildm.factory.factory.Factory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Factory
