/**
 */
package factory.util;

import factory.*;

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
 * @see factory.FactoryPackage
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
			case FactoryPackage.PRODUCER: {
				Producer producer = (Producer)theEObject;
				T result = caseProducer(producer);
				if (result == null) result = caseMachine(producer);
				if (result == null) result = caseElement(producer);
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
			case FactoryPackage.STICK_PRODUCER: {
				StickProducer stickProducer = (StickProducer)theEObject;
				T result = caseStickProducer(stickProducer);
				if (result == null) result = caseProducer(stickProducer);
				if (result == null) result = caseMachine(stickProducer);
				if (result == null) result = caseElement(stickProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.CANDY_PRODUCER: {
				CandyProducer candyProducer = (CandyProducer)theEObject;
				T result = caseCandyProducer(candyProducer);
				if (result == null) result = caseProducer(candyProducer);
				if (result == null) result = caseMachine(candyProducer);
				if (result == null) result = caseElement(candyProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.CONVEYOR_BELT: {
				ConveyorBelt conveyorBelt = (ConveyorBelt)theEObject;
				T result = caseConveyorBelt(conveyorBelt);
				if (result == null) result = caseElement(conveyorBelt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.CANDY_FLAT: {
				CandyFlat candyFlat = (CandyFlat)theEObject;
				T result = caseCandyFlat(candyFlat);
				if (result == null) result = caseComponent(candyFlat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.STICK: {
				Stick stick = (Stick)theEObject;
				T result = caseStick(stick);
				if (result == null) result = caseComponent(stick);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.CANDY_BALL: {
				CandyBall candyBall = (CandyBall)theEObject;
				T result = caseCandyBall(candyBall);
				if (result == null) result = caseComponent(candyBall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.LOLLIPOP: {
				Lollipop lollipop = (Lollipop)theEObject;
				T result = caseLollipop(lollipop);
				if (result == null) result = caseComponent(lollipop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FactoryPackage.FLATTENER: {
				Flattener flattener = (Flattener)theEObject;
				T result = caseFlattener(flattener);
				if (result == null) result = caseMachine(flattener);
				if (result == null) result = caseElement(flattener);
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
	 * Returns the result of interpreting the object as an instance of '<em>Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProducer(Producer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Stick Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stick Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStickProducer(StickProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candy Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candy Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandyProducer(CandyProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveyor Belt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveyor Belt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveyorBelt(ConveyorBelt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candy Flat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candy Flat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandyFlat(CandyFlat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stick</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stick</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStick(Stick object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candy Ball</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candy Ball</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandyBall(CandyBall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lollipop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lollipop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLollipop(Lollipop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flattener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flattener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlattener(Flattener object) {
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
