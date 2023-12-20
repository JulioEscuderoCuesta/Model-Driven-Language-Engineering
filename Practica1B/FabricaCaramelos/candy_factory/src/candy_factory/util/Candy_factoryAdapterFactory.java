/**
 */
package candy_factory.util;

import candy_factory.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see candy_factory.Candy_factoryPackage
 * @generated
 */
public class Candy_factoryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Candy_factoryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Candy_factoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Candy_factoryPackage.eINSTANCE;
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
	protected Candy_factorySwitch<Adapter> modelSwitch =
		new Candy_factorySwitch<Adapter>() {
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
	 * Creates a new adapter for an object of class '{@link candy_factory.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.Factory
	 * @generated
	 */
	public Adapter createFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory.ConveyorBelt <em>Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.ConveyorBelt
	 * @generated
	 */
	public Adapter createConveyorBeltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory.Producer <em>Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.Producer
	 * @generated
	 */
	public Adapter createProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory.Assembler <em>Assembler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.Assembler
	 * @generated
	 */
	public Adapter createAssemblerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory.Wrapper <em>Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.Wrapper
	 * @generated
	 */
	public Adapter createWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory.Flattener <em>Flattener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.Flattener
	 * @generated
	 */
	public Adapter createFlattenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory.CandyProducer <em>Candy Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.CandyProducer
	 * @generated
	 */
	public Adapter createCandyProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory.StickProducer <em>Stick Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.StickProducer
	 * @generated
	 */
	public Adapter createStickProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory.Stick <em>Stick</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.Stick
	 * @generated
	 */
	public Adapter createStickAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory.CandyFlat <em>Candy Flat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.CandyFlat
	 * @generated
	 */
	public Adapter createCandyFlatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory.CandyBall <em>Candy Ball</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.CandyBall
	 * @generated
	 */
	public Adapter createCandyBallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link candy_factory.Lollipop <em>Lollipop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see candy_factory.Lollipop
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

} //Candy_factoryAdapterFactory
