/**
 */
package candy_factory_v2.impl;

import candy_factory_v2.Assembler;
import candy_factory_v2.CandyBall;
import candy_factory_v2.CandyFlat;
import candy_factory_v2.CandyProducer;
import candy_factory_v2.Candy_factory_v2Factory;
import candy_factory_v2.Candy_factory_v2Package;
import candy_factory_v2.Component;
import candy_factory_v2.ConveyorBelt;
import candy_factory_v2.Element;
import candy_factory_v2.Factory;
import candy_factory_v2.Flattener;
import candy_factory_v2.Lollipop;
import candy_factory_v2.Machine;
import candy_factory_v2.Producer;
import candy_factory_v2.Stick;
import candy_factory_v2.StickProducer;
import candy_factory_v2.Wrapper;

import candy_factory_v2.util.Candy_factory_v2Validator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Candy_factory_v2PackageImpl extends EPackageImpl implements Candy_factory_v2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyorBeltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass producerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flattenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass candyProducerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stickProducerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stickEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass candyFlatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass candyBallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lollipopEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see candy_factory_v2.Candy_factory_v2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Candy_factory_v2PackageImpl() {
		super(eNS_URI, Candy_factory_v2Factory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Candy_factory_v2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Candy_factory_v2Package init() {
		if (isInited) return (Candy_factory_v2Package)EPackage.Registry.INSTANCE.getEPackage(Candy_factory_v2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredCandy_factory_v2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Candy_factory_v2PackageImpl theCandy_factory_v2Package = registeredCandy_factory_v2Package instanceof Candy_factory_v2PackageImpl ? (Candy_factory_v2PackageImpl)registeredCandy_factory_v2Package : new Candy_factory_v2PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCandy_factory_v2Package.createPackageContents();

		// Initialize created meta-data
		theCandy_factory_v2Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCandy_factory_v2Package,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Candy_factory_v2Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCandy_factory_v2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Candy_factory_v2Package.eNS_URI, theCandy_factory_v2Package);
		return theCandy_factory_v2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactory() {
		return factoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactory_Name() {
		return (EAttribute)factoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactory_Elements() {
		return (EReference)factoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactory_NumberOfElementsProduced() {
		return (EAttribute)factoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactory_NumberOfElementsInTheFactory() {
		return (EAttribute)factoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Id() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_ProcessingTime() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_Output() {
		return (EReference)machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_Input() {
		return (EReference)machineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConveyorBelt() {
		return conveyorBeltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConveyorBelt_Capacity() {
		return (EAttribute)conveyorBeltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBelt_Target() {
		return (EReference)conveyorBeltEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBelt_Source() {
		return (EReference)conveyorBeltEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBelt_Component() {
		return (EReference)conveyorBeltEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConveyorBelt__HasSpaceLeft() {
		return conveyorBeltEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConveyorBelt__CapacityExceeded__DiagnosticChain_Map() {
		return conveyorBeltEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProducer() {
		return producerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducer_Counter() {
		return (EAttribute)producerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssembler() {
		return assemblerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssembler__WhichOutput() {
		return assemblerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssembler__OutPutIsLollipop__DiagnosticChain_Map() {
		return assemblerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWrapper() {
		return wrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWrapper__WhichOutput() {
		return wrapperEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWrapper__OutPutIsLollipop__DiagnosticChain_Map() {
		return wrapperEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlattener() {
		return flattenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFlattener__WhichOutput() {
		return flattenerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFlattener__OutPutIsCandyFlat__DiagnosticChain_Map() {
		return flattenerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCandyProducer() {
		return candyProducerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCandyProducer__WhichOutput() {
		return candyProducerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCandyProducer__OutPutIsCandyBall__DiagnosticChain_Map() {
		return candyProducerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStickProducer() {
		return stickProducerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStickProducer__WhichOutput() {
		return stickProducerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStickProducer__OutPutIsStick__DiagnosticChain_Map() {
		return stickProducerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStick() {
		return stickEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCandyFlat() {
		return candyFlatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCandyBall() {
		return candyBallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLollipop() {
		return lollipopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Candy_factory_v2Factory getCandy_factory_v2Factory() {
		return (Candy_factory_v2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		factoryEClass = createEClass(FACTORY);
		createEAttribute(factoryEClass, FACTORY__NAME);
		createEReference(factoryEClass, FACTORY__ELEMENTS);
		createEAttribute(factoryEClass, FACTORY__NUMBER_OF_ELEMENTS_PRODUCED);
		createEAttribute(factoryEClass, FACTORY__NUMBER_OF_ELEMENTS_IN_THE_FACTORY);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__ID);

		machineEClass = createEClass(MACHINE);
		createEAttribute(machineEClass, MACHINE__PROCESSING_TIME);
		createEReference(machineEClass, MACHINE__OUTPUT);
		createEReference(machineEClass, MACHINE__INPUT);

		conveyorBeltEClass = createEClass(CONVEYOR_BELT);
		createEAttribute(conveyorBeltEClass, CONVEYOR_BELT__CAPACITY);
		createEReference(conveyorBeltEClass, CONVEYOR_BELT__TARGET);
		createEReference(conveyorBeltEClass, CONVEYOR_BELT__SOURCE);
		createEReference(conveyorBeltEClass, CONVEYOR_BELT__COMPONENT);
		createEOperation(conveyorBeltEClass, CONVEYOR_BELT___HAS_SPACE_LEFT);
		createEOperation(conveyorBeltEClass, CONVEYOR_BELT___CAPACITY_EXCEEDED__DIAGNOSTICCHAIN_MAP);

		producerEClass = createEClass(PRODUCER);
		createEAttribute(producerEClass, PRODUCER__COUNTER);

		assemblerEClass = createEClass(ASSEMBLER);
		createEOperation(assemblerEClass, ASSEMBLER___WHICH_OUTPUT);
		createEOperation(assemblerEClass, ASSEMBLER___OUT_PUT_IS_LOLLIPOP__DIAGNOSTICCHAIN_MAP);

		wrapperEClass = createEClass(WRAPPER);
		createEOperation(wrapperEClass, WRAPPER___WHICH_OUTPUT);
		createEOperation(wrapperEClass, WRAPPER___OUT_PUT_IS_LOLLIPOP__DIAGNOSTICCHAIN_MAP);

		flattenerEClass = createEClass(FLATTENER);
		createEOperation(flattenerEClass, FLATTENER___WHICH_OUTPUT);
		createEOperation(flattenerEClass, FLATTENER___OUT_PUT_IS_CANDY_FLAT__DIAGNOSTICCHAIN_MAP);

		componentEClass = createEClass(COMPONENT);

		candyProducerEClass = createEClass(CANDY_PRODUCER);
		createEOperation(candyProducerEClass, CANDY_PRODUCER___WHICH_OUTPUT);
		createEOperation(candyProducerEClass, CANDY_PRODUCER___OUT_PUT_IS_CANDY_BALL__DIAGNOSTICCHAIN_MAP);

		stickProducerEClass = createEClass(STICK_PRODUCER);
		createEOperation(stickProducerEClass, STICK_PRODUCER___WHICH_OUTPUT);
		createEOperation(stickProducerEClass, STICK_PRODUCER___OUT_PUT_IS_STICK__DIAGNOSTICCHAIN_MAP);

		stickEClass = createEClass(STICK);

		candyFlatEClass = createEClass(CANDY_FLAT);

		candyBallEClass = createEClass(CANDY_BALL);

		lollipopEClass = createEClass(LOLLIPOP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		machineEClass.getESuperTypes().add(this.getElement());
		conveyorBeltEClass.getESuperTypes().add(this.getElement());
		producerEClass.getESuperTypes().add(this.getMachine());
		assemblerEClass.getESuperTypes().add(this.getMachine());
		wrapperEClass.getESuperTypes().add(this.getMachine());
		flattenerEClass.getESuperTypes().add(this.getMachine());
		candyProducerEClass.getESuperTypes().add(this.getProducer());
		stickProducerEClass.getESuperTypes().add(this.getProducer());
		stickEClass.getESuperTypes().add(this.getComponent());
		candyFlatEClass.getESuperTypes().add(this.getComponent());
		candyBallEClass.getESuperTypes().add(this.getComponent());
		lollipopEClass.getESuperTypes().add(this.getComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(factoryEClass, Factory.class, "Factory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactory_Name(), ecorePackage.getEString(), "name", null, 0, 1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactory_Elements(), this.getElement(), null, "elements", null, 0, -1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactory_NumberOfElementsProduced(), ecorePackage.getEBigInteger(), "numberOfElementsProduced", null, 1, 1, Factory.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactory_NumberOfElementsInTheFactory(), ecorePackage.getEBigInteger(), "numberOfElementsInTheFactory", null, 1, 1, Factory.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_ProcessingTime(), ecorePackage.getEInt(), "processingTime", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMachine_Output(), this.getConveyorBelt(), this.getConveyorBelt_Source(), "output", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMachine_Input(), this.getConveyorBelt(), this.getConveyorBelt_Target(), "input", null, 0, -1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conveyorBeltEClass, ConveyorBelt.class, "ConveyorBelt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConveyorBelt_Capacity(), ecorePackage.getEInt(), "capacity", null, 1, 1, ConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConveyorBelt_Target(), this.getMachine(), this.getMachine_Input(), "target", null, 0, 1, ConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConveyorBelt_Source(), this.getMachine(), this.getMachine_Output(), "source", null, 0, 1, ConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConveyorBelt_Component(), this.getComponent(), null, "component", null, 0, -1, ConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getConveyorBelt__HasSpaceLeft(), ecorePackage.getEBoolean(), "hasSpaceLeft", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getConveyorBelt__CapacityExceeded__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "CapacityExceeded", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(producerEClass, Producer.class, "Producer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProducer_Counter(), ecorePackage.getEInt(), "counter", null, 1, 1, Producer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblerEClass, Assembler.class, "Assembler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAssembler__WhichOutput(), ecorePackage.getEBoolean(), "whichOutput", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAssembler__OutPutIsLollipop__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OutPutIsLollipop", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(wrapperEClass, Wrapper.class, "Wrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getWrapper__WhichOutput(), ecorePackage.getEBoolean(), "whichOutput", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWrapper__OutPutIsLollipop__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OutPutIsLollipop", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(flattenerEClass, Flattener.class, "Flattener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getFlattener__WhichOutput(), ecorePackage.getEBoolean(), "whichOutput", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFlattener__OutPutIsCandyFlat__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OutPutIsCandyFlat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(candyProducerEClass, CandyProducer.class, "CandyProducer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCandyProducer__WhichOutput(), ecorePackage.getEBoolean(), "whichOutput", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCandyProducer__OutPutIsCandyBall__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OutPutIsCandyBall", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stickProducerEClass, StickProducer.class, "StickProducer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getStickProducer__WhichOutput(), ecorePackage.getEBoolean(), "whichOutput", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStickProducer__OutPutIsStick__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OutPutIsStick", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stickEClass, Stick.class, "Stick", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(candyFlatEClass, CandyFlat.class, "CandyFlat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(candyBallEClass, CandyBall.class, "CandyBall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lollipopEClass, Lollipop.class, "Lollipop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (conveyorBeltEClass,
		   source,
		   new String[] {
			   "constraints", "CapacityExceeded"
		   });
		addAnnotation
		  (assemblerEClass,
		   source,
		   new String[] {
			   "constraints", "OutPutIsLollipop"
		   });
		addAnnotation
		  (wrapperEClass,
		   source,
		   new String[] {
			   "constraints", "OutPutIsLollipop"
		   });
		addAnnotation
		  (flattenerEClass,
		   source,
		   new String[] {
			   "constraints", "OutPutIsCandyFlat"
		   });
		addAnnotation
		  (candyProducerEClass,
		   source,
		   new String[] {
			   "constraints", "OutPutIsCandyBall"
		   });
		addAnnotation
		  (stickProducerEClass,
		   source,
		   new String[] {
			   "constraints", "OutPutIsStick"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getConveyorBelt__HasSpaceLeft(),
		   source,
		   new String[] {
			   "body", "component -> size() <= capacity"
		   });
		addAnnotation
		  (getConveyorBelt__CapacityExceeded__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Conveyor belt\'\' + id + \'\'has exceeded its capacity\',\n\tstatus : Boolean = \n\t\t\thasSpaceLeft()\n}.status"
		   });
		addAnnotation
		  (getAssembler__WhichOutput(),
		   source,
		   new String[] {
			   "body", "output.component -> forAll(oclIsTypeOf(Lollipop))"
		   });
		addAnnotation
		  (getAssembler__OutPutIsLollipop__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Assembler has only LolliPops as output\',\n\tstatus : Boolean = \n\t\t\twhichOutput()\n}.status"
		   });
		addAnnotation
		  (getWrapper__WhichOutput(),
		   source,
		   new String[] {
			   "body", "output.component -> forAll(oclIsTypeOf(Lollipop))"
		   });
		addAnnotation
		  (getWrapper__OutPutIsLollipop__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Assembler has only LolliPops as output\',\n\tstatus : Boolean = \n\t\t\twhichOutput()\n}.status"
		   });
		addAnnotation
		  (getFlattener__WhichOutput(),
		   source,
		   new String[] {
			   "body", "output.component -> forAll(oclIsTypeOf(CandyFlat))"
		   });
		addAnnotation
		  (getFlattener__OutPutIsCandyFlat__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'Flattener has only CandyFlats as output\',\n\tstatus : Boolean = \n\t\t\twhichOutput()\n}.status"
		   });
		addAnnotation
		  (getCandyProducer__WhichOutput(),
		   source,
		   new String[] {
			   "body", "output.component -> forAll(oclIsTypeOf(CandyBall))"
		   });
		addAnnotation
		  (getCandyProducer__OutPutIsCandyBall__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'CandyProducer must have only CandyBalls as output\',\n\tstatus : Boolean = \n\t\t\twhichOutput()\n}.status"
		   });
		addAnnotation
		  (getStickProducer__WhichOutput(),
		   source,
		   new String[] {
			   "body", "output.component -> forAll(oclIsTypeOf(Stick))"
		   });
		addAnnotation
		  (getStickProducer__OutPutIsStick__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Tuple {\n\tmessage : String = \'StickProducer has only Sticks as output\',\n\tstatus : Boolean = \n\twhichOutput()\n}.status"
		   });
	}

} //Candy_factory_v2PackageImpl
