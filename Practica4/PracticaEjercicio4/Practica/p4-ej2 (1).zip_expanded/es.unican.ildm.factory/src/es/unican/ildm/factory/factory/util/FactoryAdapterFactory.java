/**
 */
package es.unican.ildm.factory.factory.util;

import es.unican.ildm.factory.factory.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.unican.ildm.factory.factory.FactoryPackage
 * @generated
 */
public class FactoryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FactoryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FactoryPackage.eINSTANCE;
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
	protected FactorySwitch<Adapter> modelSwitch =
		new FactorySwitch<Adapter>() {
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
			public Adapter caseMaker(Maker object) {
				return createMakerAdapter();
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
			public Adapter caseCuerpoMaker(CuerpoMaker object) {
				return createCuerpoMakerAdapter();
			}
			@Override
			public Adapter caseMangoMaker(MangoMaker object) {
				return createMangoMakerAdapter();
			}
			@Override
			public Adapter caseTray(Tray object) {
				return createTrayAdapter();
			}
			@Override
			public Adapter casePart(Part object) {
				return createPartAdapter();
			}
			@Override
			public Adapter caseMango(Mango object) {
				return createMangoAdapter();
			}
			@Override
			public Adapter caseCuerpo(Cuerpo object) {
				return createCuerpoAdapter();
			}
			@Override
			public Adapter caseSarten(Sarten object) {
				return createSartenAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.unican.ildm.factory.factory.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.ildm.factory.factory.Factory
	 * @generated
	 */
	public Adapter createFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.ildm.factory.factory.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.ildm.factory.factory.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.ildm.factory.factory.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.ildm.factory.factory.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.ildm.factory.factory.Maker <em>Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.ildm.factory.factory.Maker
	 * @generated
	 */
	public Adapter createMakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.ildm.factory.factory.Assembler <em>Assembler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.ildm.factory.factory.Assembler
	 * @generated
	 */
	public Adapter createAssemblerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.ildm.factory.factory.Wrapper <em>Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.ildm.factory.factory.Wrapper
	 * @generated
	 */
	public Adapter createWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.ildm.factory.factory.CuerpoMaker <em>Cuerpo Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.ildm.factory.factory.CuerpoMaker
	 * @generated
	 */
	public Adapter createCuerpoMakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.ildm.factory.factory.MangoMaker <em>Mango Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.ildm.factory.factory.MangoMaker
	 * @generated
	 */
	public Adapter createMangoMakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.ildm.factory.factory.Tray <em>Tray</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.ildm.factory.factory.Tray
	 * @generated
	 */
	public Adapter createTrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.ildm.factory.factory.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.ildm.factory.factory.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.ildm.factory.factory.Mango <em>Mango</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.ildm.factory.factory.Mango
	 * @generated
	 */
	public Adapter createMangoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.ildm.factory.factory.Cuerpo <em>Cuerpo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.ildm.factory.factory.Cuerpo
	 * @generated
	 */
	public Adapter createCuerpoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.ildm.factory.factory.Sarten <em>Sarten</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.ildm.factory.factory.Sarten
	 * @generated
	 */
	public Adapter createSartenAdapter() {
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

} //FactoryAdapterFactory
