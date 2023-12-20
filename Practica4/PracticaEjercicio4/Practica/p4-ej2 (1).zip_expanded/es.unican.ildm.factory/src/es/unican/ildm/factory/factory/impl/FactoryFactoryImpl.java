/**
 */
package es.unican.ildm.factory.factory.impl;

import es.unican.ildm.factory.factory.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactoryFactoryImpl extends EFactoryImpl implements FactoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FactoryFactory init() {
		try {
			FactoryFactory theFactoryFactory = (FactoryFactory)EPackage.Registry.INSTANCE.getEFactory(FactoryPackage.eNS_URI);
			if (theFactoryFactory != null) {
				return theFactoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FactoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FactoryPackage.FACTORY: return createFactory();
			case FactoryPackage.ASSEMBLER: return createAssembler();
			case FactoryPackage.WRAPPER: return createWrapper();
			case FactoryPackage.CUERPO_MAKER: return createCuerpoMaker();
			case FactoryPackage.MANGO_MAKER: return createMangoMaker();
			case FactoryPackage.TRAY: return createTray();
			case FactoryPackage.MANGO: return createMango();
			case FactoryPackage.CUERPO: return createCuerpo();
			case FactoryPackage.SARTEN: return createSarten();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factory createFactory() {
		FactoryImpl factory = new FactoryImpl();
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembler createAssembler() {
		AssemblerImpl assembler = new AssemblerImpl();
		return assembler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wrapper createWrapper() {
		WrapperImpl wrapper = new WrapperImpl();
		return wrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CuerpoMaker createCuerpoMaker() {
		CuerpoMakerImpl cuerpoMaker = new CuerpoMakerImpl();
		return cuerpoMaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MangoMaker createMangoMaker() {
		MangoMakerImpl mangoMaker = new MangoMakerImpl();
		return mangoMaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tray createTray() {
		TrayImpl tray = new TrayImpl();
		return tray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mango createMango() {
		MangoImpl mango = new MangoImpl();
		return mango;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cuerpo createCuerpo() {
		CuerpoImpl cuerpo = new CuerpoImpl();
		return cuerpo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sarten createSarten() {
		SartenImpl sarten = new SartenImpl();
		return sarten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryPackage getFactoryPackage() {
		return (FactoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FactoryPackage getPackage() {
		return FactoryPackage.eINSTANCE;
	}

} //FactoryFactoryImpl
