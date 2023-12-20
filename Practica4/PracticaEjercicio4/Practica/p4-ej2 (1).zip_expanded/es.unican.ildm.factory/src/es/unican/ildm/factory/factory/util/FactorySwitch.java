/**
 */
package es.unican.ildm.factory.factory.util;

import es.unican.ildm.factory.factory.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.unican.ildm.factory.factory.FactoryPackage
 * @generated
 */
public class FactorySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FactoryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactorySwitch() {
		if (modelPackage == null) {
			modelPackage = FactoryPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FactoryPackage.FACTORY: {
				Factory factory = (Factory)theEObject;
				T result = caseFactory(factory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.MACHINE: {
				Machine machine = (Machine)theEObject;
				T result = caseMachine(machine);
				if (result == null) result = caseElement(machine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.MAKER: {
				Maker maker = (Maker)theEObject;
				T result = caseMaker(maker);
				if (result == null) result = caseMachine(maker);
				if (result == null) result = caseElement(maker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.ASSEMBLER: {
				Assembler assembler = (Assembler)theEObject;
				T result = caseAssembler(assembler);
				if (result == null) result = caseMachine(assembler);
				if (result == null) result = caseElement(assembler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.WRAPPER: {
				Wrapper wrapper = (Wrapper)theEObject;
				T result = caseWrapper(wrapper);
				if (result == null) result = caseMachine(wrapper);
				if (result == null) result = caseElement(wrapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.CUERPO_MAKER: {
				CuerpoMaker cuerpoMaker = (CuerpoMaker)theEObject;
				T result = caseCuerpoMaker(cuerpoMaker);
				if (result == null) result = caseMaker(cuerpoMaker);
				if (result == null) result = caseMachine(cuerpoMaker);
				if (result == null) result = caseElement(cuerpoMaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.MANGO_MAKER: {
				MangoMaker mangoMaker = (MangoMaker)theEObject;
				T result = caseMangoMaker(mangoMaker);
				if (result == null) result = caseMaker(mangoMaker);
				if (result == null) result = caseMachine(mangoMaker);
				if (result == null) result = caseElement(mangoMaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.TRAY: {
				Tray tray = (Tray)theEObject;
				T result = caseTray(tray);
				if (result == null) result = caseElement(tray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.PART: {
				Part part = (Part)theEObject;
				T result = casePart(part);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.MANGO: {
				Mango mango = (Mango)theEObject;
				T result = caseMango(mango);
				if (result == null) result = casePart(mango);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.CUERPO: {
				Cuerpo cuerpo = (Cuerpo)theEObject;
				T result = caseCuerpo(cuerpo);
				if (result == null) result = casePart(cuerpo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.SARTEN: {
				Sarten sarten = (Sarten)theEObject;
				T result = caseSarten(sarten);
				if (result == null) result = casePart(sarten);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactory(Factory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaker(Maker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssembler(Assembler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wrapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWrapper(Wrapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cuerpo Maker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cuerpo Maker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCuerpoMaker(CuerpoMaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mango Maker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mango Maker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMangoMaker(MangoMaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tray</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTray(Tray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePart(Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mango</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mango</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMango(Mango object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cuerpo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cuerpo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCuerpo(Cuerpo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sarten</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sarten</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSarten(Sarten object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FactorySwitch
