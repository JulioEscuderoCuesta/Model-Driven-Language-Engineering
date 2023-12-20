/**
 */
package candy_factory_v2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Candy Producer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see candy_factory_v2.Candy_factory_v2Package#getCandyProducer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OutPutIsCandyBall'"
 * @generated
 */
public interface CandyProducer extends Producer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='output.component -&gt; forAll(oclIsTypeOf(CandyBall))'"
	 * @generated
	 */
	boolean whichOutput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'CandyProducer must have only CandyBalls as output\',\n\tstatus : Boolean = \n\t\t\twhichOutput()\n}.status'"
	 * @generated
	 */
	boolean OutPutIsCandyBall(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CandyProducer
