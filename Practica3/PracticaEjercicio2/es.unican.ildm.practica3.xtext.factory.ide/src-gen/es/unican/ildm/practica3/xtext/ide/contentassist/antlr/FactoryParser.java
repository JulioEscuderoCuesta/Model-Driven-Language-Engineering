/*
 * generated by Xtext 2.31.0
 */
package es.unican.ildm.practica3.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import es.unican.ildm.practica3.xtext.ide.contentassist.antlr.internal.InternalFactoryParser;
import es.unican.ildm.practica3.xtext.services.FactoryGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class FactoryParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(FactoryGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, FactoryGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
			builder.put(grammarAccess.getComponentAccess().getAlternatives(), "rule__Component__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getFactoryAccess().getGroup(), "rule__Factory__Group__0");
			builder.put(grammarAccess.getFactoryAccess().getGroup_3(), "rule__Factory__Group_3__0");
			builder.put(grammarAccess.getFactoryAccess().getGroup_3_3(), "rule__Factory__Group_3_3__0");
			builder.put(grammarAccess.getFactoryAccess().getGroup_4(), "rule__Factory__Group_4__0");
			builder.put(grammarAccess.getFactoryAccess().getGroup_4_3(), "rule__Factory__Group_4_3__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup(), "rule__Connection__Group__0");
			builder.put(grammarAccess.getAssemblerAccess().getGroup(), "rule__Assembler__Group__0");
			builder.put(grammarAccess.getWrapperAccess().getGroup(), "rule__Wrapper__Group__0");
			builder.put(grammarAccess.getStickProducerAccess().getGroup(), "rule__StickProducer__Group__0");
			builder.put(grammarAccess.getCandyProducerAccess().getGroup(), "rule__CandyProducer__Group__0");
			builder.put(grammarAccess.getConveyorBeltAccess().getGroup(), "rule__ConveyorBelt__Group__0");
			builder.put(grammarAccess.getConveyorBeltAccess().getGroup_5(), "rule__ConveyorBelt__Group_5__0");
			builder.put(grammarAccess.getConveyorBeltAccess().getGroup_5_3(), "rule__ConveyorBelt__Group_5_3__0");
			builder.put(grammarAccess.getFlattenerAccess().getGroup(), "rule__Flattener__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getCandyFlatAccess().getGroup(), "rule__CandyFlat__Group__0");
			builder.put(grammarAccess.getStickAccess().getGroup(), "rule__Stick__Group__0");
			builder.put(grammarAccess.getCandyBallAccess().getGroup(), "rule__CandyBall__Group__0");
			builder.put(grammarAccess.getLollipopAccess().getGroup(), "rule__Lollipop__Group__0");
			builder.put(grammarAccess.getFactoryAccess().getElementsAssignment_3_2(), "rule__Factory__ElementsAssignment_3_2");
			builder.put(grammarAccess.getFactoryAccess().getElementsAssignment_3_3_1(), "rule__Factory__ElementsAssignment_3_3_1");
			builder.put(grammarAccess.getFactoryAccess().getConnectionsAssignment_4_2(), "rule__Factory__ConnectionsAssignment_4_2");
			builder.put(grammarAccess.getFactoryAccess().getConnectionsAssignment_4_3_1(), "rule__Factory__ConnectionsAssignment_4_3_1");
			builder.put(grammarAccess.getConnectionAccess().getSourceAssignment_1(), "rule__Connection__SourceAssignment_1");
			builder.put(grammarAccess.getConnectionAccess().getTargetAssignment_3(), "rule__Connection__TargetAssignment_3");
			builder.put(grammarAccess.getAssemblerAccess().getNameAssignment_1(), "rule__Assembler__NameAssignment_1");
			builder.put(grammarAccess.getAssemblerAccess().getProcessingTimeAssignment_4(), "rule__Assembler__ProcessingTimeAssignment_4");
			builder.put(grammarAccess.getWrapperAccess().getNameAssignment_1(), "rule__Wrapper__NameAssignment_1");
			builder.put(grammarAccess.getWrapperAccess().getProcessingTimeAssignment_4(), "rule__Wrapper__ProcessingTimeAssignment_4");
			builder.put(grammarAccess.getStickProducerAccess().getNameAssignment_1(), "rule__StickProducer__NameAssignment_1");
			builder.put(grammarAccess.getStickProducerAccess().getProcessingTimeAssignment_4(), "rule__StickProducer__ProcessingTimeAssignment_4");
			builder.put(grammarAccess.getStickProducerAccess().getCounterAssignment_6(), "rule__StickProducer__CounterAssignment_6");
			builder.put(grammarAccess.getCandyProducerAccess().getNameAssignment_1(), "rule__CandyProducer__NameAssignment_1");
			builder.put(grammarAccess.getCandyProducerAccess().getProcessingTimeAssignment_4(), "rule__CandyProducer__ProcessingTimeAssignment_4");
			builder.put(grammarAccess.getCandyProducerAccess().getCounterAssignment_6(), "rule__CandyProducer__CounterAssignment_6");
			builder.put(grammarAccess.getConveyorBeltAccess().getNameAssignment_1(), "rule__ConveyorBelt__NameAssignment_1");
			builder.put(grammarAccess.getConveyorBeltAccess().getCapacityAssignment_4(), "rule__ConveyorBelt__CapacityAssignment_4");
			builder.put(grammarAccess.getConveyorBeltAccess().getComponentsAssignment_5_2(), "rule__ConveyorBelt__ComponentsAssignment_5_2");
			builder.put(grammarAccess.getConveyorBeltAccess().getComponentsAssignment_5_3_1(), "rule__ConveyorBelt__ComponentsAssignment_5_3_1");
			builder.put(grammarAccess.getFlattenerAccess().getNameAssignment_1(), "rule__Flattener__NameAssignment_1");
			builder.put(grammarAccess.getFlattenerAccess().getProcessingTimeAssignment_4(), "rule__Flattener__ProcessingTimeAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private FactoryGrammarAccess grammarAccess;

	@Override
	protected InternalFactoryParser createParser() {
		InternalFactoryParser result = new InternalFactoryParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FactoryGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FactoryGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
