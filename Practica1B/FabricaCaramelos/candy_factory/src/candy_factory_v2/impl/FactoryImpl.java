/**
 */
package candy_factory_v2.impl;

import candy_factory_v2.CandyProducer;
import candy_factory_v2.Candy_factory_v2Package;
import candy_factory_v2.Candy_factory_v2Tables;
import candy_factory_v2.Element;
import candy_factory_v2.Factory;
import candy_factory_v2.StickProducer;

import java.math.BigInteger;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

import org.eclipse.ocl.pivot.values.SequenceValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link candy_factory_v2.impl.FactoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link candy_factory_v2.impl.FactoryImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link candy_factory_v2.impl.FactoryImpl#getNumberOfElementsProduced <em>Number Of Elements Produced</em>}</li>
 *   <li>{@link candy_factory_v2.impl.FactoryImpl#getNumberOfElementsInTheFactory <em>Number Of Elements In The Factory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryImpl extends MinimalEObjectImpl.Container implements Factory {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The default value of the '{@link #getNumberOfElementsProduced() <em>Number Of Elements Produced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfElementsProduced()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_ELEMENTS_PRODUCED_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNumberOfElementsInTheFactory() <em>Number Of Elements In The Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfElementsInTheFactory()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_ELEMENTS_IN_THE_FACTORY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Candy_factory_v2Package.Literals.FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Candy_factory_v2Package.FACTORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, Candy_factory_v2Package.FACTORY__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberOfElementsProduced() {
		/**
		 *
		 * elements->select(element |
		 *   element.oclIsTypeOf(CandyProducer) or
		 *   element.oclIsTypeOf(StickProducer))
		 * ->collect(element |
		 *   if element.oclIsTypeOf(CandyProducer)
		 *   then element.oclAsType(CandyProducer).counter
		 *   else element.oclAsType(StickProducer).counter
		 *   endif)
		 * ->sum()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Element> elements = this.getElements();
		final /*@NonInvalid*/ OrderedSetValue BOXED_elements = idResolver.createOrderedSetOfAll(Candy_factory_v2Tables.ORD_CLSSid_Element, elements);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(Candy_factory_v2Tables.ORD_CLSSid_Element);
		Iterator<Object> ITERATOR_element = BOXED_elements.iterator();
		/*@Thrown*/ OrderedSetValue select;
		while (true) {
			if (!ITERATOR_element.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Element element = (Element)ITERATOR_element.next();
			/**
			 *
			 * element.oclIsTypeOf(CandyProducer) or
			 * element.oclIsTypeOf(StickProducer)
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_candy_factory_v2_c_c_CandyProducer_0 = idResolver.getClass(Candy_factory_v2Tables.CLSSid_CandyProducer, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_candy_factory_v2_c_c_StickProducer_0 = idResolver.getClass(Candy_factory_v2Tables.CLSSid_StickProducer, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, element, TYP_candy_factory_v2_c_c_CandyProducer_0).booleanValue();
			final /*@NonInvalid*/ Boolean or;
			if (oclIsTypeOf) {
				or = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, element, TYP_candy_factory_v2_c_c_StickProducer_0).booleanValue();
				if (oclIsTypeOf_0) {
					or = ValueUtil.TRUE_VALUE;
				}
				else {
					or = ValueUtil.FALSE_VALUE;
				}
			}
			if (or == null) {
				throw new InvalidValueException("Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
			}
			//
			if (or == ValueUtil.TRUE_VALUE) {
				accumulator.add(element);
			}
		}
		/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(Candy_factory_v2Tables.SEQ_DATAid_EInt);
		Iterator<Object> ITERATOR_element_0 = select.iterator();
		/*@Thrown*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR_element_0.hasNext()) {
				collect = accumulator_0;
				break;
			}
			/*@NonInvalid*/ Element element_0 = (Element)ITERATOR_element_0.next();
			/**
			 *
			 * if element.oclIsTypeOf(CandyProducer)
			 * then element.oclAsType(CandyProducer).counter
			 * else element.oclAsType(StickProducer).counter
			 * endif
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_candy_factory_v2_c_c_CandyProducer_1 = idResolver.getClass(Candy_factory_v2Tables.CLSSid_CandyProducer, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf_1 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, element_0, TYP_candy_factory_v2_c_c_CandyProducer_1).booleanValue();
			/*@Thrown*/ int local_0;
			if (oclIsTypeOf_1) {
				final /*@Thrown*/ CandyProducer oclAsType = (CandyProducer)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, element_0, TYP_candy_factory_v2_c_c_CandyProducer_1);
				final /*@Thrown*/ int counter = oclAsType.getCounter();
				local_0 = counter;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_candy_factory_v2_c_c_StickProducer_1 = idResolver.getClass(Candy_factory_v2Tables.CLSSid_StickProducer, null);
				final /*@Thrown*/ StickProducer oclAsType_0 = (StickProducer)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, element_0, TYP_candy_factory_v2_c_c_StickProducer_1);
				final /*@Thrown*/ int counter_0 = oclAsType_0.getCounter();
				local_0 = counter_0;
			}
			final /*@Thrown*/ IntegerValue BOXED_local_0 = ValueUtil.integerValueOf(local_0);
			//
			accumulator_0.add(BOXED_local_0);
		}
		final /*@Thrown*/ IntegerValue sum = (IntegerValue)CollectionSumOperation.INSTANCE.evaluate(executor, Candy_factory_v2Tables.DATAid_EInt, collect);
		final BigInteger ECORE_sum = ValueUtil.bigIntegerValueOf(sum);
		return ECORE_sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfElementsProduced(BigInteger newNumberOfElementsProduced) {
		// TODO: implement this method to set the 'Number Of Elements Produced' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberOfElementsInTheFactory() {
		/**
		 * elements->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Element> elements = this.getElements();
		final /*@NonInvalid*/ OrderedSetValue BOXED_elements = idResolver.createOrderedSetOfAll(Candy_factory_v2Tables.ORD_CLSSid_Element, elements);
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_elements);
		final BigInteger ECORE_size = ValueUtil.bigIntegerValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfElementsInTheFactory(BigInteger newNumberOfElementsInTheFactory) {
		// TODO: implement this method to set the 'Number Of Elements In The Factory' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Candy_factory_v2Package.FACTORY__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Candy_factory_v2Package.FACTORY__NAME:
				return getName();
			case Candy_factory_v2Package.FACTORY__ELEMENTS:
				return getElements();
			case Candy_factory_v2Package.FACTORY__NUMBER_OF_ELEMENTS_PRODUCED:
				return getNumberOfElementsProduced();
			case Candy_factory_v2Package.FACTORY__NUMBER_OF_ELEMENTS_IN_THE_FACTORY:
				return getNumberOfElementsInTheFactory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Candy_factory_v2Package.FACTORY__NAME:
				setName((String)newValue);
				return;
			case Candy_factory_v2Package.FACTORY__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case Candy_factory_v2Package.FACTORY__NUMBER_OF_ELEMENTS_PRODUCED:
				setNumberOfElementsProduced((BigInteger)newValue);
				return;
			case Candy_factory_v2Package.FACTORY__NUMBER_OF_ELEMENTS_IN_THE_FACTORY:
				setNumberOfElementsInTheFactory((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Candy_factory_v2Package.FACTORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Candy_factory_v2Package.FACTORY__ELEMENTS:
				getElements().clear();
				return;
			case Candy_factory_v2Package.FACTORY__NUMBER_OF_ELEMENTS_PRODUCED:
				setNumberOfElementsProduced(NUMBER_OF_ELEMENTS_PRODUCED_EDEFAULT);
				return;
			case Candy_factory_v2Package.FACTORY__NUMBER_OF_ELEMENTS_IN_THE_FACTORY:
				setNumberOfElementsInTheFactory(NUMBER_OF_ELEMENTS_IN_THE_FACTORY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Candy_factory_v2Package.FACTORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Candy_factory_v2Package.FACTORY__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case Candy_factory_v2Package.FACTORY__NUMBER_OF_ELEMENTS_PRODUCED:
				return NUMBER_OF_ELEMENTS_PRODUCED_EDEFAULT == null ? getNumberOfElementsProduced() != null : !NUMBER_OF_ELEMENTS_PRODUCED_EDEFAULT.equals(getNumberOfElementsProduced());
			case Candy_factory_v2Package.FACTORY__NUMBER_OF_ELEMENTS_IN_THE_FACTORY:
				return NUMBER_OF_ELEMENTS_IN_THE_FACTORY_EDEFAULT == null ? getNumberOfElementsInTheFactory() != null : !NUMBER_OF_ELEMENTS_IN_THE_FACTORY_EDEFAULT.equals(getNumberOfElementsInTheFactory());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FactoryImpl
