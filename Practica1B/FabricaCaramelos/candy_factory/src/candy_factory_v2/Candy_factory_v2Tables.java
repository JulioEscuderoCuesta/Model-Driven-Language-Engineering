/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /candy_factory/model/candy_factory_v2.ecore
 * using:
 *   /candy_factory/model/candy_factory_v2.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package candy_factory_v2;

// import candy_factory_v2.Candy_factory_v2Package;
// import candy_factory_v2.Candy_factory_v2Tables;
import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Candy_factory_v2Tables provides the dispatch tables for the candy_factory_v2 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Candy_factory_v2Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Candy_factory_v2Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2 = IdManager.getNsURIPackageId("http://www.unican.es/ildm/candy_factory_v2", null, Candy_factory_v2Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Assembler = Candy_factory_v2Tables.PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2.getClassId("Assembler", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CandyBall = Candy_factory_v2Tables.PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2.getClassId("CandyBall", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CandyFlat = Candy_factory_v2Tables.PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2.getClassId("CandyFlat", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CandyProducer = Candy_factory_v2Tables.PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2.getClassId("CandyProducer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Candy_factory_v2Tables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Component = Candy_factory_v2Tables.PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2.getClassId("Component", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ConveyorBelt = Candy_factory_v2Tables.PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2.getClassId("ConveyorBelt", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Element = Candy_factory_v2Tables.PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2.getClassId("Element", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Factory = Candy_factory_v2Tables.PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2.getClassId("Factory", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Flattener = Candy_factory_v2Tables.PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2.getClassId("Flattener", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Lollipop = Candy_factory_v2Tables.PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2.getClassId("Lollipop", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Machine = Candy_factory_v2Tables.PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2.getClassId("Machine", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Stick = Candy_factory_v2Tables.PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2.getClassId("Stick", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StickProducer = Candy_factory_v2Tables.PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2.getClassId("StickProducer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Wrapper = Candy_factory_v2Tables.PACKid_http_c_s_s_www_unican_es_s_ildm_s_candy_factory_v2.getClassId("Wrapper", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Candy_factory_v2Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ TuplePartId PARTid_ = IdManager.getTuplePartId(0, "message", TypeId.STRING);
	public static final /*@NonInvalid*/ TuplePartId PARTid__0 = IdManager.getTuplePartId(1, "status", TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ String STR_Assembler_32_has_32_only_32_LolliPops_32_as_32_output = "Assembler has only LolliPops as output";
	public static final /*@NonInvalid*/ String STR_CandyProducer_32_must_32_have_32_only_32_CandyBalls_32_as_32_output = "CandyProducer must have only CandyBalls as output";
	public static final /*@NonInvalid*/ String STR_Conveyor_32_belt_32_p_32_id_32_p_32_has_32_exceeded_32_its_32_capacity = "Conveyor belt + id + has exceeded its capacity";
	public static final /*@NonInvalid*/ String STR_Flattener_32_has_32_only_32_CandyFlats_32_as_32_output = "Flattener has only CandyFlats as output";
	public static final /*@NonInvalid*/ String STR_StickProducer_32_has_32_only_32_Sticks_32_as_32_output = "StickProducer has only Sticks as output";
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Component = TypeId.ORDERED_SET.getSpecializedId(Candy_factory_v2Tables.CLSSid_Component);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ConveyorBelt = TypeId.ORDERED_SET.getSpecializedId(Candy_factory_v2Tables.CLSSid_ConveyorBelt);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Element = TypeId.ORDERED_SET.getSpecializedId(Candy_factory_v2Tables.CLSSid_Element);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EInt = TypeId.SEQUENCE.getSpecializedId(Candy_factory_v2Tables.DATAid_EInt);
	public static final /*@NonInvalid*/ TupleTypeId TUPLid_ = IdManager.getTupleTypeId("Tuple", Candy_factory_v2Tables.PARTid_, Candy_factory_v2Tables.PARTid__0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Candy_factory_v2Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Candy_factory_v2Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Assembler = new EcoreExecutorType(Candy_factory_v2Package.Literals.ASSEMBLER, PACKAGE, 0);
		public static final EcoreExecutorType _CandyBall = new EcoreExecutorType(Candy_factory_v2Package.Literals.CANDY_BALL, PACKAGE, 0);
		public static final EcoreExecutorType _CandyFlat = new EcoreExecutorType(Candy_factory_v2Package.Literals.CANDY_FLAT, PACKAGE, 0);
		public static final EcoreExecutorType _CandyProducer = new EcoreExecutorType(Candy_factory_v2Package.Literals.CANDY_PRODUCER, PACKAGE, 0);
		public static final EcoreExecutorType _Component = new EcoreExecutorType(Candy_factory_v2Package.Literals.COMPONENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ConveyorBelt = new EcoreExecutorType(Candy_factory_v2Package.Literals.CONVEYOR_BELT, PACKAGE, 0);
		public static final EcoreExecutorType _Element = new EcoreExecutorType(Candy_factory_v2Package.Literals.ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Factory = new EcoreExecutorType(Candy_factory_v2Package.Literals.FACTORY, PACKAGE, 0);
		public static final EcoreExecutorType _Flattener = new EcoreExecutorType(Candy_factory_v2Package.Literals.FLATTENER, PACKAGE, 0);
		public static final EcoreExecutorType _Lollipop = new EcoreExecutorType(Candy_factory_v2Package.Literals.LOLLIPOP, PACKAGE, 0);
		public static final EcoreExecutorType _Machine = new EcoreExecutorType(Candy_factory_v2Package.Literals.MACHINE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Producer = new EcoreExecutorType(Candy_factory_v2Package.Literals.PRODUCER, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Stick = new EcoreExecutorType(Candy_factory_v2Package.Literals.STICK, PACKAGE, 0);
		public static final EcoreExecutorType _StickProducer = new EcoreExecutorType(Candy_factory_v2Package.Literals.STICK_PRODUCER, PACKAGE, 0);
		public static final EcoreExecutorType _Wrapper = new EcoreExecutorType(Candy_factory_v2Package.Literals.WRAPPER, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Assembler,
			_CandyBall,
			_CandyFlat,
			_CandyProducer,
			_Component,
			_ConveyorBelt,
			_Element,
			_Factory,
			_Flattener,
			_Lollipop,
			_Machine,
			_Producer,
			_Stick,
			_StickProducer,
			_Wrapper
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Candy_factory_v2Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Assembler__Assembler = new ExecutorFragment(Types._Assembler, Candy_factory_v2Tables.Types._Assembler);
		private static final ExecutorFragment _Assembler__Element = new ExecutorFragment(Types._Assembler, Candy_factory_v2Tables.Types._Element);
		private static final ExecutorFragment _Assembler__Machine = new ExecutorFragment(Types._Assembler, Candy_factory_v2Tables.Types._Machine);
		private static final ExecutorFragment _Assembler__OclAny = new ExecutorFragment(Types._Assembler, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Assembler__OclElement = new ExecutorFragment(Types._Assembler, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CandyBall__CandyBall = new ExecutorFragment(Types._CandyBall, Candy_factory_v2Tables.Types._CandyBall);
		private static final ExecutorFragment _CandyBall__Component = new ExecutorFragment(Types._CandyBall, Candy_factory_v2Tables.Types._Component);
		private static final ExecutorFragment _CandyBall__OclAny = new ExecutorFragment(Types._CandyBall, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CandyBall__OclElement = new ExecutorFragment(Types._CandyBall, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CandyFlat__CandyFlat = new ExecutorFragment(Types._CandyFlat, Candy_factory_v2Tables.Types._CandyFlat);
		private static final ExecutorFragment _CandyFlat__Component = new ExecutorFragment(Types._CandyFlat, Candy_factory_v2Tables.Types._Component);
		private static final ExecutorFragment _CandyFlat__OclAny = new ExecutorFragment(Types._CandyFlat, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CandyFlat__OclElement = new ExecutorFragment(Types._CandyFlat, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CandyProducer__CandyProducer = new ExecutorFragment(Types._CandyProducer, Candy_factory_v2Tables.Types._CandyProducer);
		private static final ExecutorFragment _CandyProducer__Element = new ExecutorFragment(Types._CandyProducer, Candy_factory_v2Tables.Types._Element);
		private static final ExecutorFragment _CandyProducer__Machine = new ExecutorFragment(Types._CandyProducer, Candy_factory_v2Tables.Types._Machine);
		private static final ExecutorFragment _CandyProducer__OclAny = new ExecutorFragment(Types._CandyProducer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CandyProducer__OclElement = new ExecutorFragment(Types._CandyProducer, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CandyProducer__Producer = new ExecutorFragment(Types._CandyProducer, Candy_factory_v2Tables.Types._Producer);

		private static final ExecutorFragment _Component__Component = new ExecutorFragment(Types._Component, Candy_factory_v2Tables.Types._Component);
		private static final ExecutorFragment _Component__OclAny = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Component__OclElement = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ConveyorBelt__ConveyorBelt = new ExecutorFragment(Types._ConveyorBelt, Candy_factory_v2Tables.Types._ConveyorBelt);
		private static final ExecutorFragment _ConveyorBelt__Element = new ExecutorFragment(Types._ConveyorBelt, Candy_factory_v2Tables.Types._Element);
		private static final ExecutorFragment _ConveyorBelt__OclAny = new ExecutorFragment(Types._ConveyorBelt, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ConveyorBelt__OclElement = new ExecutorFragment(Types._ConveyorBelt, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Element__Element = new ExecutorFragment(Types._Element, Candy_factory_v2Tables.Types._Element);
		private static final ExecutorFragment _Element__OclAny = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Element__OclElement = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Factory__Factory = new ExecutorFragment(Types._Factory, Candy_factory_v2Tables.Types._Factory);
		private static final ExecutorFragment _Factory__OclAny = new ExecutorFragment(Types._Factory, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Factory__OclElement = new ExecutorFragment(Types._Factory, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Flattener__Element = new ExecutorFragment(Types._Flattener, Candy_factory_v2Tables.Types._Element);
		private static final ExecutorFragment _Flattener__Flattener = new ExecutorFragment(Types._Flattener, Candy_factory_v2Tables.Types._Flattener);
		private static final ExecutorFragment _Flattener__Machine = new ExecutorFragment(Types._Flattener, Candy_factory_v2Tables.Types._Machine);
		private static final ExecutorFragment _Flattener__OclAny = new ExecutorFragment(Types._Flattener, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Flattener__OclElement = new ExecutorFragment(Types._Flattener, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Lollipop__Component = new ExecutorFragment(Types._Lollipop, Candy_factory_v2Tables.Types._Component);
		private static final ExecutorFragment _Lollipop__Lollipop = new ExecutorFragment(Types._Lollipop, Candy_factory_v2Tables.Types._Lollipop);
		private static final ExecutorFragment _Lollipop__OclAny = new ExecutorFragment(Types._Lollipop, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Lollipop__OclElement = new ExecutorFragment(Types._Lollipop, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Machine__Element = new ExecutorFragment(Types._Machine, Candy_factory_v2Tables.Types._Element);
		private static final ExecutorFragment _Machine__Machine = new ExecutorFragment(Types._Machine, Candy_factory_v2Tables.Types._Machine);
		private static final ExecutorFragment _Machine__OclAny = new ExecutorFragment(Types._Machine, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Machine__OclElement = new ExecutorFragment(Types._Machine, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Producer__Element = new ExecutorFragment(Types._Producer, Candy_factory_v2Tables.Types._Element);
		private static final ExecutorFragment _Producer__Machine = new ExecutorFragment(Types._Producer, Candy_factory_v2Tables.Types._Machine);
		private static final ExecutorFragment _Producer__OclAny = new ExecutorFragment(Types._Producer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Producer__OclElement = new ExecutorFragment(Types._Producer, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Producer__Producer = new ExecutorFragment(Types._Producer, Candy_factory_v2Tables.Types._Producer);

		private static final ExecutorFragment _Stick__Component = new ExecutorFragment(Types._Stick, Candy_factory_v2Tables.Types._Component);
		private static final ExecutorFragment _Stick__OclAny = new ExecutorFragment(Types._Stick, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Stick__OclElement = new ExecutorFragment(Types._Stick, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Stick__Stick = new ExecutorFragment(Types._Stick, Candy_factory_v2Tables.Types._Stick);

		private static final ExecutorFragment _StickProducer__Element = new ExecutorFragment(Types._StickProducer, Candy_factory_v2Tables.Types._Element);
		private static final ExecutorFragment _StickProducer__Machine = new ExecutorFragment(Types._StickProducer, Candy_factory_v2Tables.Types._Machine);
		private static final ExecutorFragment _StickProducer__OclAny = new ExecutorFragment(Types._StickProducer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StickProducer__OclElement = new ExecutorFragment(Types._StickProducer, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StickProducer__Producer = new ExecutorFragment(Types._StickProducer, Candy_factory_v2Tables.Types._Producer);
		private static final ExecutorFragment _StickProducer__StickProducer = new ExecutorFragment(Types._StickProducer, Candy_factory_v2Tables.Types._StickProducer);

		private static final ExecutorFragment _Wrapper__Element = new ExecutorFragment(Types._Wrapper, Candy_factory_v2Tables.Types._Element);
		private static final ExecutorFragment _Wrapper__Machine = new ExecutorFragment(Types._Wrapper, Candy_factory_v2Tables.Types._Machine);
		private static final ExecutorFragment _Wrapper__OclAny = new ExecutorFragment(Types._Wrapper, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Wrapper__OclElement = new ExecutorFragment(Types._Wrapper, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Wrapper__Wrapper = new ExecutorFragment(Types._Wrapper, Candy_factory_v2Tables.Types._Wrapper);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Candy_factory_v2Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Candy_factory_v2Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Assembler__whichOutput = new ExecutorOperation("whichOutput", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Assembler,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _CandyProducer__whichOutput = new ExecutorOperation("whichOutput", TypeUtil.EMPTY_PARAMETER_TYPES, Types._CandyProducer,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _ConveyorBelt__hasSpaceLeft = new ExecutorOperation("hasSpaceLeft", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ConveyorBelt,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Flattener__whichOutput = new ExecutorOperation("whichOutput", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Flattener,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _StickProducer__whichOutput = new ExecutorOperation("whichOutput", TypeUtil.EMPTY_PARAMETER_TYPES, Types._StickProducer,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Wrapper__whichOutput = new ExecutorOperation("whichOutput", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Wrapper,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Candy_factory_v2Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final ExecutorProperty _Component__ConveyorBelt__component = new ExecutorPropertyWithImplementation("ConveyorBelt", Types._Component, 0, new EcoreLibraryOppositeProperty(Candy_factory_v2Package.Literals.CONVEYOR_BELT__COMPONENT));

		public static final ExecutorProperty _ConveyorBelt__capacity = new EcoreExecutorProperty(Candy_factory_v2Package.Literals.CONVEYOR_BELT__CAPACITY, Types._ConveyorBelt, 0);
		public static final ExecutorProperty _ConveyorBelt__component = new EcoreExecutorProperty(Candy_factory_v2Package.Literals.CONVEYOR_BELT__COMPONENT, Types._ConveyorBelt, 1);
		public static final ExecutorProperty _ConveyorBelt__source = new EcoreExecutorProperty(Candy_factory_v2Package.Literals.CONVEYOR_BELT__SOURCE, Types._ConveyorBelt, 2);
		public static final ExecutorProperty _ConveyorBelt__target = new EcoreExecutorProperty(Candy_factory_v2Package.Literals.CONVEYOR_BELT__TARGET, Types._ConveyorBelt, 3);

		public static final ExecutorProperty _Element__id = new EcoreExecutorProperty(Candy_factory_v2Package.Literals.ELEMENT__ID, Types._Element, 0);
		public static final ExecutorProperty _Element__Factory__elements = new ExecutorPropertyWithImplementation("Factory", Types._Element, 1, new EcoreLibraryOppositeProperty(Candy_factory_v2Package.Literals.FACTORY__ELEMENTS));

		public static final ExecutorProperty _Factory__elements = new EcoreExecutorProperty(Candy_factory_v2Package.Literals.FACTORY__ELEMENTS, Types._Factory, 0);
		public static final ExecutorProperty _Factory__name = new EcoreExecutorProperty(Candy_factory_v2Package.Literals.FACTORY__NAME, Types._Factory, 1);
		public static final ExecutorProperty _Factory__numberOfElementsInTheFactory = new EcoreExecutorProperty(Candy_factory_v2Package.Literals.FACTORY__NUMBER_OF_ELEMENTS_IN_THE_FACTORY, Types._Factory, 2);
		public static final ExecutorProperty _Factory__numberOfElementsProduced = new EcoreExecutorProperty(Candy_factory_v2Package.Literals.FACTORY__NUMBER_OF_ELEMENTS_PRODUCED, Types._Factory, 3);

		public static final ExecutorProperty _Machine__input = new EcoreExecutorProperty(Candy_factory_v2Package.Literals.MACHINE__INPUT, Types._Machine, 0);
		public static final ExecutorProperty _Machine__output = new EcoreExecutorProperty(Candy_factory_v2Package.Literals.MACHINE__OUTPUT, Types._Machine, 1);
		public static final ExecutorProperty _Machine__processingTime = new EcoreExecutorProperty(Candy_factory_v2Package.Literals.MACHINE__PROCESSING_TIME, Types._Machine, 2);

		public static final ExecutorProperty _Producer__counter = new EcoreExecutorProperty(Candy_factory_v2Package.Literals.PRODUCER__COUNTER, Types._Producer, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Candy_factory_v2Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Assembler =
			{
				Fragments._Assembler__OclAny /* 0 */,
				Fragments._Assembler__OclElement /* 1 */,
				Fragments._Assembler__Element /* 2 */,
				Fragments._Assembler__Machine /* 3 */,
				Fragments._Assembler__Assembler /* 4 */
			};
		private static final int /*@NonNull*/ [] __Assembler = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CandyBall =
			{
				Fragments._CandyBall__OclAny /* 0 */,
				Fragments._CandyBall__OclElement /* 1 */,
				Fragments._CandyBall__Component /* 2 */,
				Fragments._CandyBall__CandyBall /* 3 */
			};
		private static final int /*@NonNull*/ [] __CandyBall = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CandyFlat =
			{
				Fragments._CandyFlat__OclAny /* 0 */,
				Fragments._CandyFlat__OclElement /* 1 */,
				Fragments._CandyFlat__Component /* 2 */,
				Fragments._CandyFlat__CandyFlat /* 3 */
			};
		private static final int /*@NonNull*/ [] __CandyFlat = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CandyProducer =
			{
				Fragments._CandyProducer__OclAny /* 0 */,
				Fragments._CandyProducer__OclElement /* 1 */,
				Fragments._CandyProducer__Element /* 2 */,
				Fragments._CandyProducer__Machine /* 3 */,
				Fragments._CandyProducer__Producer /* 4 */,
				Fragments._CandyProducer__CandyProducer /* 5 */
			};
		private static final int /*@NonNull*/ [] __CandyProducer = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Component =
			{
				Fragments._Component__OclAny /* 0 */,
				Fragments._Component__OclElement /* 1 */,
				Fragments._Component__Component /* 2 */
			};
		private static final int /*@NonNull*/ [] __Component = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ConveyorBelt =
			{
				Fragments._ConveyorBelt__OclAny /* 0 */,
				Fragments._ConveyorBelt__OclElement /* 1 */,
				Fragments._ConveyorBelt__Element /* 2 */,
				Fragments._ConveyorBelt__ConveyorBelt /* 3 */
			};
		private static final int /*@NonNull*/ [] __ConveyorBelt = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Element =
			{
				Fragments._Element__OclAny /* 0 */,
				Fragments._Element__OclElement /* 1 */,
				Fragments._Element__Element /* 2 */
			};
		private static final int /*@NonNull*/ [] __Element = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Factory =
			{
				Fragments._Factory__OclAny /* 0 */,
				Fragments._Factory__OclElement /* 1 */,
				Fragments._Factory__Factory /* 2 */
			};
		private static final int /*@NonNull*/ [] __Factory = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Flattener =
			{
				Fragments._Flattener__OclAny /* 0 */,
				Fragments._Flattener__OclElement /* 1 */,
				Fragments._Flattener__Element /* 2 */,
				Fragments._Flattener__Machine /* 3 */,
				Fragments._Flattener__Flattener /* 4 */
			};
		private static final int /*@NonNull*/ [] __Flattener = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Lollipop =
			{
				Fragments._Lollipop__OclAny /* 0 */,
				Fragments._Lollipop__OclElement /* 1 */,
				Fragments._Lollipop__Component /* 2 */,
				Fragments._Lollipop__Lollipop /* 3 */
			};
		private static final int /*@NonNull*/ [] __Lollipop = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Machine =
			{
				Fragments._Machine__OclAny /* 0 */,
				Fragments._Machine__OclElement /* 1 */,
				Fragments._Machine__Element /* 2 */,
				Fragments._Machine__Machine /* 3 */
			};
		private static final int /*@NonNull*/ [] __Machine = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Producer =
			{
				Fragments._Producer__OclAny /* 0 */,
				Fragments._Producer__OclElement /* 1 */,
				Fragments._Producer__Element /* 2 */,
				Fragments._Producer__Machine /* 3 */,
				Fragments._Producer__Producer /* 4 */
			};
		private static final int /*@NonNull*/ [] __Producer = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Stick =
			{
				Fragments._Stick__OclAny /* 0 */,
				Fragments._Stick__OclElement /* 1 */,
				Fragments._Stick__Component /* 2 */,
				Fragments._Stick__Stick /* 3 */
			};
		private static final int /*@NonNull*/ [] __Stick = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StickProducer =
			{
				Fragments._StickProducer__OclAny /* 0 */,
				Fragments._StickProducer__OclElement /* 1 */,
				Fragments._StickProducer__Element /* 2 */,
				Fragments._StickProducer__Machine /* 3 */,
				Fragments._StickProducer__Producer /* 4 */,
				Fragments._StickProducer__StickProducer /* 5 */
			};
		private static final int /*@NonNull*/ [] __StickProducer = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Wrapper =
			{
				Fragments._Wrapper__OclAny /* 0 */,
				Fragments._Wrapper__OclElement /* 1 */,
				Fragments._Wrapper__Element /* 2 */,
				Fragments._Wrapper__Machine /* 3 */,
				Fragments._Wrapper__Wrapper /* 4 */
			};
		private static final int /*@NonNull*/ [] __Wrapper = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Assembler.initFragments(_Assembler, __Assembler);
			Types._CandyBall.initFragments(_CandyBall, __CandyBall);
			Types._CandyFlat.initFragments(_CandyFlat, __CandyFlat);
			Types._CandyProducer.initFragments(_CandyProducer, __CandyProducer);
			Types._Component.initFragments(_Component, __Component);
			Types._ConveyorBelt.initFragments(_ConveyorBelt, __ConveyorBelt);
			Types._Element.initFragments(_Element, __Element);
			Types._Factory.initFragments(_Factory, __Factory);
			Types._Flattener.initFragments(_Flattener, __Flattener);
			Types._Lollipop.initFragments(_Lollipop, __Lollipop);
			Types._Machine.initFragments(_Machine, __Machine);
			Types._Producer.initFragments(_Producer, __Producer);
			Types._Stick.initFragments(_Stick, __Stick);
			Types._StickProducer.initFragments(_StickProducer, __StickProducer);
			Types._Wrapper.initFragments(_Wrapper, __Wrapper);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Candy_factory_v2Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Assembler__Assembler = {
			Candy_factory_v2Tables.Operations._Assembler__whichOutput /* whichOutput() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Assembler__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Assembler__Machine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Assembler__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Assembler__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CandyBall__CandyBall = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CandyBall__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CandyBall__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CandyBall__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CandyFlat__CandyFlat = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CandyFlat__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CandyFlat__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CandyFlat__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CandyProducer__CandyProducer = {
			Candy_factory_v2Tables.Operations._CandyProducer__whichOutput /* whichOutput() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CandyProducer__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CandyProducer__Machine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CandyProducer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CandyProducer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CandyProducer__Producer = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Component__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Component__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Component__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ConveyorBelt__ConveyorBelt = {
			Candy_factory_v2Tables.Operations._ConveyorBelt__hasSpaceLeft /* hasSpaceLeft() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConveyorBelt__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ConveyorBelt__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConveyorBelt__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Element__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Element__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Element__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Factory__Factory = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Factory__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Factory__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Flattener__Flattener = {
			Candy_factory_v2Tables.Operations._Flattener__whichOutput /* whichOutput() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Flattener__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Flattener__Machine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Flattener__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Flattener__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Lollipop__Lollipop = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Lollipop__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Lollipop__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Lollipop__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Machine__Machine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Machine__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Machine__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Machine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Producer__Producer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Producer__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Producer__Machine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Producer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Producer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Stick__Stick = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Stick__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Stick__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Stick__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StickProducer__StickProducer = {
			Candy_factory_v2Tables.Operations._StickProducer__whichOutput /* whichOutput() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StickProducer__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StickProducer__Machine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StickProducer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StickProducer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StickProducer__Producer = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Wrapper__Wrapper = {
			Candy_factory_v2Tables.Operations._Wrapper__whichOutput /* whichOutput() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Wrapper__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Wrapper__Machine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Wrapper__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Wrapper__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Assembler__Assembler.initOperations(_Assembler__Assembler);
			Fragments._Assembler__Element.initOperations(_Assembler__Element);
			Fragments._Assembler__Machine.initOperations(_Assembler__Machine);
			Fragments._Assembler__OclAny.initOperations(_Assembler__OclAny);
			Fragments._Assembler__OclElement.initOperations(_Assembler__OclElement);

			Fragments._CandyBall__CandyBall.initOperations(_CandyBall__CandyBall);
			Fragments._CandyBall__Component.initOperations(_CandyBall__Component);
			Fragments._CandyBall__OclAny.initOperations(_CandyBall__OclAny);
			Fragments._CandyBall__OclElement.initOperations(_CandyBall__OclElement);

			Fragments._CandyFlat__CandyFlat.initOperations(_CandyFlat__CandyFlat);
			Fragments._CandyFlat__Component.initOperations(_CandyFlat__Component);
			Fragments._CandyFlat__OclAny.initOperations(_CandyFlat__OclAny);
			Fragments._CandyFlat__OclElement.initOperations(_CandyFlat__OclElement);

			Fragments._CandyProducer__CandyProducer.initOperations(_CandyProducer__CandyProducer);
			Fragments._CandyProducer__Element.initOperations(_CandyProducer__Element);
			Fragments._CandyProducer__Machine.initOperations(_CandyProducer__Machine);
			Fragments._CandyProducer__OclAny.initOperations(_CandyProducer__OclAny);
			Fragments._CandyProducer__OclElement.initOperations(_CandyProducer__OclElement);
			Fragments._CandyProducer__Producer.initOperations(_CandyProducer__Producer);

			Fragments._Component__Component.initOperations(_Component__Component);
			Fragments._Component__OclAny.initOperations(_Component__OclAny);
			Fragments._Component__OclElement.initOperations(_Component__OclElement);

			Fragments._ConveyorBelt__ConveyorBelt.initOperations(_ConveyorBelt__ConveyorBelt);
			Fragments._ConveyorBelt__Element.initOperations(_ConveyorBelt__Element);
			Fragments._ConveyorBelt__OclAny.initOperations(_ConveyorBelt__OclAny);
			Fragments._ConveyorBelt__OclElement.initOperations(_ConveyorBelt__OclElement);

			Fragments._Element__Element.initOperations(_Element__Element);
			Fragments._Element__OclAny.initOperations(_Element__OclAny);
			Fragments._Element__OclElement.initOperations(_Element__OclElement);

			Fragments._Factory__Factory.initOperations(_Factory__Factory);
			Fragments._Factory__OclAny.initOperations(_Factory__OclAny);
			Fragments._Factory__OclElement.initOperations(_Factory__OclElement);

			Fragments._Flattener__Element.initOperations(_Flattener__Element);
			Fragments._Flattener__Flattener.initOperations(_Flattener__Flattener);
			Fragments._Flattener__Machine.initOperations(_Flattener__Machine);
			Fragments._Flattener__OclAny.initOperations(_Flattener__OclAny);
			Fragments._Flattener__OclElement.initOperations(_Flattener__OclElement);

			Fragments._Lollipop__Component.initOperations(_Lollipop__Component);
			Fragments._Lollipop__Lollipop.initOperations(_Lollipop__Lollipop);
			Fragments._Lollipop__OclAny.initOperations(_Lollipop__OclAny);
			Fragments._Lollipop__OclElement.initOperations(_Lollipop__OclElement);

			Fragments._Machine__Element.initOperations(_Machine__Element);
			Fragments._Machine__Machine.initOperations(_Machine__Machine);
			Fragments._Machine__OclAny.initOperations(_Machine__OclAny);
			Fragments._Machine__OclElement.initOperations(_Machine__OclElement);

			Fragments._Producer__Element.initOperations(_Producer__Element);
			Fragments._Producer__Machine.initOperations(_Producer__Machine);
			Fragments._Producer__OclAny.initOperations(_Producer__OclAny);
			Fragments._Producer__OclElement.initOperations(_Producer__OclElement);
			Fragments._Producer__Producer.initOperations(_Producer__Producer);

			Fragments._Stick__Component.initOperations(_Stick__Component);
			Fragments._Stick__OclAny.initOperations(_Stick__OclAny);
			Fragments._Stick__OclElement.initOperations(_Stick__OclElement);
			Fragments._Stick__Stick.initOperations(_Stick__Stick);

			Fragments._StickProducer__Element.initOperations(_StickProducer__Element);
			Fragments._StickProducer__Machine.initOperations(_StickProducer__Machine);
			Fragments._StickProducer__OclAny.initOperations(_StickProducer__OclAny);
			Fragments._StickProducer__OclElement.initOperations(_StickProducer__OclElement);
			Fragments._StickProducer__Producer.initOperations(_StickProducer__Producer);
			Fragments._StickProducer__StickProducer.initOperations(_StickProducer__StickProducer);

			Fragments._Wrapper__Element.initOperations(_Wrapper__Element);
			Fragments._Wrapper__Machine.initOperations(_Wrapper__Machine);
			Fragments._Wrapper__OclAny.initOperations(_Wrapper__OclAny);
			Fragments._Wrapper__OclElement.initOperations(_Wrapper__OclElement);
			Fragments._Wrapper__Wrapper.initOperations(_Wrapper__Wrapper);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Candy_factory_v2Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Assembler = {
			Candy_factory_v2Tables.Properties._Element__id,
			Candy_factory_v2Tables.Properties._Machine__input,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Candy_factory_v2Tables.Properties._Machine__output,
			Candy_factory_v2Tables.Properties._Machine__processingTime
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CandyBall = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CandyFlat = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CandyProducer = {
			Candy_factory_v2Tables.Properties._Producer__counter,
			Candy_factory_v2Tables.Properties._Element__id,
			Candy_factory_v2Tables.Properties._Machine__input,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Candy_factory_v2Tables.Properties._Machine__output,
			Candy_factory_v2Tables.Properties._Machine__processingTime
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Component = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ConveyorBelt = {
			Candy_factory_v2Tables.Properties._ConveyorBelt__capacity,
			Candy_factory_v2Tables.Properties._ConveyorBelt__component,
			Candy_factory_v2Tables.Properties._Element__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Candy_factory_v2Tables.Properties._ConveyorBelt__source,
			Candy_factory_v2Tables.Properties._ConveyorBelt__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Element = {
			Candy_factory_v2Tables.Properties._Element__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Factory = {
			Candy_factory_v2Tables.Properties._Factory__elements,
			Candy_factory_v2Tables.Properties._Factory__name,
			Candy_factory_v2Tables.Properties._Factory__numberOfElementsInTheFactory,
			Candy_factory_v2Tables.Properties._Factory__numberOfElementsProduced,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Flattener = {
			Candy_factory_v2Tables.Properties._Element__id,
			Candy_factory_v2Tables.Properties._Machine__input,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Candy_factory_v2Tables.Properties._Machine__output,
			Candy_factory_v2Tables.Properties._Machine__processingTime
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Lollipop = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Machine = {
			Candy_factory_v2Tables.Properties._Element__id,
			Candy_factory_v2Tables.Properties._Machine__input,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Candy_factory_v2Tables.Properties._Machine__output,
			Candy_factory_v2Tables.Properties._Machine__processingTime
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Producer = {
			Candy_factory_v2Tables.Properties._Producer__counter,
			Candy_factory_v2Tables.Properties._Element__id,
			Candy_factory_v2Tables.Properties._Machine__input,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Candy_factory_v2Tables.Properties._Machine__output,
			Candy_factory_v2Tables.Properties._Machine__processingTime
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Stick = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StickProducer = {
			Candy_factory_v2Tables.Properties._Producer__counter,
			Candy_factory_v2Tables.Properties._Element__id,
			Candy_factory_v2Tables.Properties._Machine__input,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Candy_factory_v2Tables.Properties._Machine__output,
			Candy_factory_v2Tables.Properties._Machine__processingTime
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Wrapper = {
			Candy_factory_v2Tables.Properties._Element__id,
			Candy_factory_v2Tables.Properties._Machine__input,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Candy_factory_v2Tables.Properties._Machine__output,
			Candy_factory_v2Tables.Properties._Machine__processingTime
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Assembler__Assembler.initProperties(_Assembler);
			Fragments._CandyBall__CandyBall.initProperties(_CandyBall);
			Fragments._CandyFlat__CandyFlat.initProperties(_CandyFlat);
			Fragments._CandyProducer__CandyProducer.initProperties(_CandyProducer);
			Fragments._Component__Component.initProperties(_Component);
			Fragments._ConveyorBelt__ConveyorBelt.initProperties(_ConveyorBelt);
			Fragments._Element__Element.initProperties(_Element);
			Fragments._Factory__Factory.initProperties(_Factory);
			Fragments._Flattener__Flattener.initProperties(_Flattener);
			Fragments._Lollipop__Lollipop.initProperties(_Lollipop);
			Fragments._Machine__Machine.initProperties(_Machine);
			Fragments._Producer__Producer.initProperties(_Producer);
			Fragments._Stick__Stick.initProperties(_Stick);
			Fragments._StickProducer__StickProducer.initProperties(_StickProducer);
			Fragments._Wrapper__Wrapper.initProperties(_Wrapper);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Candy_factory_v2Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Candy_factory_v2Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Candy_factory_v2Tables();
	}

	private Candy_factory_v2Tables() {
		super(Candy_factory_v2Package.eNS_URI);
	}
}
