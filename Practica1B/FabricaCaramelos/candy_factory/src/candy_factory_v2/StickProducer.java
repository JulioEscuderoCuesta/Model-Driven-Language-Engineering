/**
 */
package candy_factory_v2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stick Producer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see candy_factory_v2.Candy_factory_v2Package#getStickProducer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OutPutIsStick'"
 * @generated
 */
public interface StickProducer extends Producer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='output.component -&gt; forAll(oclIsTypeOf(Stick))'"
	 * @generated
	 */
	boolean whichOutput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'StickProducer has only Sticks as output\',\n\tstatus : Boolean = \n\twhichOutput()\n}.status'"
	 * @generated
	 */
	boolean OutPutIsStick(DiagnosticChain diagnostics, Map<Object, Object> context);

} // StickProducer
