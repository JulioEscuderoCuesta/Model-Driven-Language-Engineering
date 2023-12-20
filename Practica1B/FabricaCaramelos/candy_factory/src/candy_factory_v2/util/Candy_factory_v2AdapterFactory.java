/**
 */
package candy_factory_v2.util;

import candy_factory_v2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see candy_factory_v2.Candy_factory_v2Package
 * @generated
 */
public class Candy_factory_v2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Candy_factory_v2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Candy_factory_v2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Candy_factory_v2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Candy_factory_v2Switch<Adapter> modelSwitch =
		new Candy_factory_v2Switch<Adapter>() {
			@Override
			public Adapter caseFactory(Factory object) {
				return createFactoryAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseMachine(Machine object) {
				return createMachineAdapter();
			}
			@Override
			public Adapter caseConveyorBelt(ConveyorBelt object) {
				return createConveyorBeltAdapter();
			}
			@Override
			public Adapter caseProducer(Producer object) {
				return createProducerAdapter();
			}
			@Override
			public Adapter caseAssembler(Assembler object) {
				return createAssemblerAdapter();
			}
			@Override
			public Adapter caseWrapper(Wrapper object) {
				return createWrapperAdapter();
			}
			@Override
			public Adapter caseFlattener(Flattener object) {
				return createFlattenerAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseCandyProducer(CandyProducer object) {
				return createCandyProducerAdapter();
			}
			@Override
			public Adapter caseStickProducer(StickProducer object) {
				return createStickProducerAdapter();
			}
			@Override
			public Adapter caseStick(Stick object) {
				return createStickAdapter();
			}
			@Override
			public Adapter caseCandyFlat(CandyFlat object) {
				return createCandyFlatAdapter();
			}
			@Override
			public Adapter caseCandyBall(CandyBall object) {
				return createCandyBallAdapter();
			}
			@Override
			public Adapter caseLollipop(Lollipop object) {
				return createLollipopAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.Factory
	 * @generated
	 */
	public Adapter createFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.ConveyorBelt <em>Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.ConveyorBelt
	 * @generated
	 */
	public Adapter createConveyorBeltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.Producer <em>Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.Producer
	 * @generated
	 */
	public Adapter createProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.Assembler <em>Assembler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.Assembler
	 * @generated
	 */
	public Adapter createAssemblerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.Wrapper <em>Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.Wrapper
	 * @generated
	 */
	public Adapter createWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.Flattener <em>Flattener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.Flattener
	 * @generated
	 */
	public Adapter createFlattenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.CandyProducer <em>Candy Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.CandyProducer
	 * @generated
	 */
	public Adapter createCandyProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.StickProducer <em>Stick Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.StickProducer
	 * @generated
	 */
	public Adapter createStickProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.Stick <em>Stick</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.Stick
	 * @generated
	 */
	public Adapter createStickAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.CandyFlat <em>Candy Flat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.CandyFlat
	 * @generated
	 */
	public Adapter createCandyFlatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.CandyBall <em>Candy Ball</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.CandyBall
	 * @generated
	 */
	public Adapter createCandyBallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory_v2.Lollipop <em>Lollipop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory_v2.Lollipop
	 * @generated
	 */
	public Adapter createLollipopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Candy_factory_v2AdapterFactory
