/**
 */
package es.unican.ildm.factory.factory.impl;

import es.unican.ildm.factory.factory.Assembler;
import es.unican.ildm.factory.factory.Cuerpo;
import es.unican.ildm.factory.factory.CuerpoMaker;
import es.unican.ildm.factory.factory.Element;
import es.unican.ildm.factory.factory.Factory;
import es.unican.ildm.factory.factory.FactoryFactory;
import es.unican.ildm.factory.factory.FactoryPackage;
import es.unican.ildm.factory.factory.Machine;
import es.unican.ildm.factory.factory.Maker;
import es.unican.ildm.factory.factory.Mango;
import es.unican.ildm.factory.factory.MangoMaker;
import es.unican.ildm.factory.factory.Part;
import es.unican.ildm.factory.factory.Sarten;
import es.unican.ildm.factory.factory.Tray;
import es.unican.ildm.factory.factory.Wrapper;

import es.unican.ildm.factory.factory.util.FactoryValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class FactoryPackageImpl extends EPackageImpl implements FactoryPackage {
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
	private EClass makerEClass = null;

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
	private EClass cuerpoMakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mangoMakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mangoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuerpoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sartenEClass = null;

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
	 * @see es.unican.ildm.factory.factory.FactoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FactoryPackageImpl() {
		super(eNS_URI, FactoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FactoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FactoryPackage init() {
		if (isInited) return (FactoryPackage)EPackage.Registry.INSTANCE.getEPackage(FactoryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFactoryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FactoryPackageImpl theFactoryPackage = registeredFactoryPackage instanceof FactoryPackageImpl ? (FactoryPackageImpl)registeredFactoryPackage : new FactoryPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFactoryPackage.createPackageContents();

		// Initialize created meta-data
		theFactoryPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFactoryPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FactoryValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFactoryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FactoryPackage.eNS_URI, theFactoryPackage);
		return theFactoryPackage;
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
	public EReference getFactory_Elements() {
		return (EReference)factoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactory_TotalCounter() {
		return (EAttribute)factoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactory_CurrentParts() {
		return (EAttribute)factoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactory_Trays() {
		return (EReference)factoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactory_Name() {
		return (EAttribute)factoryEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getElement_X() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Y() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Z() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getMachine_TiempoProcesado() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_Input() {
		return (EReference)machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_Output() {
		return (EReference)machineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaker() {
		return makerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaker_Counter() {
		return (EAttribute)makerEClass.getEStructuralFeatures().get(0);
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
	public EClass getWrapper() {
		return wrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCuerpoMaker() {
		return cuerpoMakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMangoMaker() {
		return mangoMakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTray() {
		return trayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTray_Capacity() {
		return (EAttribute)trayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTray_Source() {
		return (EReference)trayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTray_Target() {
		return (EReference)trayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTray_Parts() {
		return (EReference)trayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPart() {
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMango() {
		return mangoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCuerpo() {
		return cuerpoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSarten() {
		return sartenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryFactory getFactoryFactory() {
		return (FactoryFactory)getEFactoryInstance();
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
		createEReference(factoryEClass, FACTORY__ELEMENTS);
		createEAttribute(factoryEClass, FACTORY__TOTAL_COUNTER);
		createEAttribute(factoryEClass, FACTORY__CURRENT_PARTS);
		createEReference(factoryEClass, FACTORY__TRAYS);
		createEAttribute(factoryEClass, FACTORY__NAME);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__X);
		createEAttribute(elementEClass, ELEMENT__Y);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__Z);

		machineEClass = createEClass(MACHINE);
		createEAttribute(machineEClass, MACHINE__TIEMPO_PROCESADO);
		createEReference(machineEClass, MACHINE__INPUT);
		createEReference(machineEClass, MACHINE__OUTPUT);

		makerEClass = createEClass(MAKER);
		createEAttribute(makerEClass, MAKER__COUNTER);

		assemblerEClass = createEClass(ASSEMBLER);

		wrapperEClass = createEClass(WRAPPER);

		cuerpoMakerEClass = createEClass(CUERPO_MAKER);

		mangoMakerEClass = createEClass(MANGO_MAKER);

		trayEClass = createEClass(TRAY);
		createEAttribute(trayEClass, TRAY__CAPACITY);
		createEReference(trayEClass, TRAY__SOURCE);
		createEReference(trayEClass, TRAY__TARGET);
		createEReference(trayEClass, TRAY__PARTS);

		partEClass = createEClass(PART);

		mangoEClass = createEClass(MANGO);

		cuerpoEClass = createEClass(CUERPO);

		sartenEClass = createEClass(SARTEN);
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
		makerEClass.getESuperTypes().add(this.getMachine());
		assemblerEClass.getESuperTypes().add(this.getMachine());
		wrapperEClass.getESuperTypes().add(this.getMachine());
		cuerpoMakerEClass.getESuperTypes().add(this.getMaker());
		mangoMakerEClass.getESuperTypes().add(this.getMaker());
		trayEClass.getESuperTypes().add(this.getElement());
		mangoEClass.getESuperTypes().add(this.getPart());
		cuerpoEClass.getESuperTypes().add(this.getPart());
		sartenEClass.getESuperTypes().add(this.getPart());

		// Initialize classes, features, and operations; add parameters
		initEClass(factoryEClass, Factory.class, "Factory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactory_Elements(), this.getElement(), null, "elements", null, 0, -1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFactory_TotalCounter(), ecorePackage.getEInt(), "totalCounter", null, 1, 1, Factory.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactory_CurrentParts(), ecorePackage.getEInt(), "currentParts", null, 1, 1, Factory.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFactory_Trays(), this.getTray(), null, "trays", null, 0, -1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFactory_Name(), ecorePackage.getEString(), "name", null, 0, 1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_X(), ecorePackage.getEInt(), "x", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Y(), ecorePackage.getEInt(), "y", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Z(), ecorePackage.getEInt(), "z", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_TiempoProcesado(), ecorePackage.getEInt(), "tiempoProcesado", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMachine_Input(), this.getTray(), this.getTray_Target(), "input", null, 0, -1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMachine_Output(), this.getTray(), this.getTray_Source(), "output", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(makerEClass, Maker.class, "Maker", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaker_Counter(), ecorePackage.getEInt(), "counter", null, 1, 1, Maker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblerEClass, Assembler.class, "Assembler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wrapperEClass, Wrapper.class, "Wrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cuerpoMakerEClass, CuerpoMaker.class, "CuerpoMaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mangoMakerEClass, MangoMaker.class, "MangoMaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trayEClass, Tray.class, "Tray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTray_Capacity(), ecorePackage.getEInt(), "capacity", null, 1, 1, Tray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTray_Source(), this.getMachine(), this.getMachine_Output(), "source", null, 0, 1, Tray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTray_Target(), this.getMachine(), this.getMachine_Input(), "target", null, 0, 1, Tray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTray_Parts(), this.getPart(), null, "parts", null, 0, -1, Tray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(partEClass, Part.class, "Part", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mangoEClass, Mango.class, "Mango", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cuerpoEClass, Cuerpo.class, "Cuerpo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sartenEClass, Sarten.class, "Sarten", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
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
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (assemblerEClass,
		   source,
		   new String[] {
			   "constraints", "IncorrectOutput"
		   });
		addAnnotation
		  (wrapperEClass,
		   source,
		   new String[] {
			   "constraints", "IncorrectOutput"
		   });
		addAnnotation
		  (cuerpoMakerEClass,
		   source,
		   new String[] {
			   "constraints", "IncorrectOutput"
		   });
		addAnnotation
		  (mangoMakerEClass,
		   source,
		   new String[] {
			   "constraints", "IncorrectOutput"
		   });
		addAnnotation
		  (trayEClass,
		   source,
		   new String[] {
			   "constraints", "OverCapacity"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getFactory_Elements(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getFactory_Trays(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getMachine_Input(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getTray_Parts(),
		   source,
		   new String[] {
			   "nullFree", "false"
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
		  (getFactory_TotalCounter(),
		   source,
		   new String[] {
			   "derivation", "elements -> select(element | element.oclIsKindOf(Maker)) -> collect(element | element.oclAsType(Maker)) -> collect(maker | maker.counter) -> sum()"
		   });
		addAnnotation
		  (getFactory_CurrentParts(),
		   source,
		   new String[] {
			   "derivation", "elements -> select(element | element.oclIsKindOf(Tray)) -> collect(element | element.oclAsType(Tray)) -> collect(tray | tray.parts -> size()) -> sum()"
		   });
		addAnnotation
		  (getFactory_Trays(),
		   source,
		   new String[] {
			   "derivation", "elements -> select(element | element.oclIsKindOf(Tray)) -> collect(element | element.oclAsType(Tray))"
		   });
		addAnnotation
		  (assemblerEClass,
		   source,
		   new String[] {
			   "IncorrectOutput", "\n\t\t\toutput=null or output.parts -> forAll(part | part.oclIsTypeOf(Sarten))"
		   });
		addAnnotation
		  (wrapperEClass,
		   source,
		   new String[] {
			   "IncorrectOutput", "\n\t\t\toutput=null or output.parts -> forAll(part | part.oclIsTypeOf(Sarten))"
		   });
		addAnnotation
		  (cuerpoMakerEClass,
		   source,
		   new String[] {
			   "IncorrectOutput", "\n\t\t\toutput=null or output.parts -> forAll(part | part.oclIsTypeOf(Cuerpo))"
		   });
		addAnnotation
		  (mangoMakerEClass,
		   source,
		   new String[] {
			   "IncorrectOutput", "\n\t\t\toutput=null or output.parts -> forAll(part | part.oclIsTypeOf(Mango))"
		   });
		addAnnotation
		  (trayEClass,
		   source,
		   new String[] {
			   "OverCapacity", "Tuple {\n\tmessage : String = \'Tray has more parts than permitted\',\n\tstatus : Boolean = \n\t\t\tparts -> size() <= capacity\n}.status"
		   });
	}

} //FactoryPackageImpl
