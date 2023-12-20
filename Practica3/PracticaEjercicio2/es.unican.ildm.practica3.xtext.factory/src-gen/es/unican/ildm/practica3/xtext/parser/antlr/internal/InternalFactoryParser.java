package es.unican.ildm.practica3.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.unican.ildm.practica3.xtext.services.FactoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFactoryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Factory'", "'{'", "'elements'", "','", "'}'", "'connections'", "'->'", "'Assembler'", "'processingTime'", "'Wrapper'", "'StickProducer'", "'counter'", "'CandyProducer'", "'ConveyorBelt'", "'capacity'", "'components'", "'Flattener'", "'-'", "'CandyFlat'", "'Stick'", "'CandyBall'", "'Lollipop'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFactoryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFactoryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFactoryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFactory.g"; }



     	private FactoryGrammarAccess grammarAccess;

        public InternalFactoryParser(TokenStream input, FactoryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Factory";
       	}

       	@Override
       	protected FactoryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFactory"
    // InternalFactory.g:64:1: entryRuleFactory returns [EObject current=null] : iv_ruleFactory= ruleFactory EOF ;
    public final EObject entryRuleFactory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactory = null;


        try {
            // InternalFactory.g:64:48: (iv_ruleFactory= ruleFactory EOF )
            // InternalFactory.g:65:2: iv_ruleFactory= ruleFactory EOF
            {
             newCompositeNode(grammarAccess.getFactoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactory=ruleFactory();

            state._fsp--;

             current =iv_ruleFactory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactory"


    // $ANTLR start "ruleFactory"
    // InternalFactory.g:71:1: ruleFactory returns [EObject current=null] : ( () otherlv_1= 'Factory' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'connections' otherlv_10= '{' ( (lv_connections_11_0= ruleConnection ) ) (otherlv_12= ',' ( (lv_connections_13_0= ruleConnection ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleFactory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_elements_5_0 = null;

        EObject lv_elements_7_0 = null;

        EObject lv_connections_11_0 = null;

        EObject lv_connections_13_0 = null;



        	enterRule();

        try {
            // InternalFactory.g:77:2: ( ( () otherlv_1= 'Factory' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'connections' otherlv_10= '{' ( (lv_connections_11_0= ruleConnection ) ) (otherlv_12= ',' ( (lv_connections_13_0= ruleConnection ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalFactory.g:78:2: ( () otherlv_1= 'Factory' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'connections' otherlv_10= '{' ( (lv_connections_11_0= ruleConnection ) ) (otherlv_12= ',' ( (lv_connections_13_0= ruleConnection ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalFactory.g:78:2: ( () otherlv_1= 'Factory' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'connections' otherlv_10= '{' ( (lv_connections_11_0= ruleConnection ) ) (otherlv_12= ',' ( (lv_connections_13_0= ruleConnection ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalFactory.g:79:3: () otherlv_1= 'Factory' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )* otherlv_8= '}' )? (otherlv_9= 'connections' otherlv_10= '{' ( (lv_connections_11_0= ruleConnection ) ) (otherlv_12= ',' ( (lv_connections_13_0= ruleConnection ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalFactory.g:79:3: ()
            // InternalFactory.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFactoryAccess().getFactoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFactoryAccess().getFactoryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFactory.g:94:3: (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFactory.g:95:4: otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFactoryAccess().getElementsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalFactory.g:103:4: ( (lv_elements_5_0= ruleElement ) )
                    // InternalFactory.g:104:5: (lv_elements_5_0= ruleElement )
                    {
                    // InternalFactory.g:104:5: (lv_elements_5_0= ruleElement )
                    // InternalFactory.g:105:6: lv_elements_5_0= ruleElement
                    {

                    						newCompositeNode(grammarAccess.getFactoryAccess().getElementsElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_elements_5_0=ruleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactoryRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_5_0,
                    							"es.unican.ildm.practica3.xtext.Factory.Element");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFactory.g:122:4: (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalFactory.g:123:5: otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getFactoryAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalFactory.g:127:5: ( (lv_elements_7_0= ruleElement ) )
                    	    // InternalFactory.g:128:6: (lv_elements_7_0= ruleElement )
                    	    {
                    	    // InternalFactory.g:128:6: (lv_elements_7_0= ruleElement )
                    	    // InternalFactory.g:129:7: lv_elements_7_0= ruleElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getFactoryAccess().getElementsElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_7_0=ruleElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFactoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_7_0,
                    	    								"es.unican.ildm.practica3.xtext.Factory.Element");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalFactory.g:152:3: (otherlv_9= 'connections' otherlv_10= '{' ( (lv_connections_11_0= ruleConnection ) ) (otherlv_12= ',' ( (lv_connections_13_0= ruleConnection ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFactory.g:153:4: otherlv_9= 'connections' otherlv_10= '{' ( (lv_connections_11_0= ruleConnection ) ) (otherlv_12= ',' ( (lv_connections_13_0= ruleConnection ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getFactoryAccess().getConnectionsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalFactory.g:161:4: ( (lv_connections_11_0= ruleConnection ) )
                    // InternalFactory.g:162:5: (lv_connections_11_0= ruleConnection )
                    {
                    // InternalFactory.g:162:5: (lv_connections_11_0= ruleConnection )
                    // InternalFactory.g:163:6: lv_connections_11_0= ruleConnection
                    {

                    						newCompositeNode(grammarAccess.getFactoryAccess().getConnectionsConnectionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_connections_11_0=ruleConnection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactoryRule());
                    						}
                    						add(
                    							current,
                    							"connections",
                    							lv_connections_11_0,
                    							"es.unican.ildm.practica3.xtext.Factory.Connection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFactory.g:180:4: (otherlv_12= ',' ( (lv_connections_13_0= ruleConnection ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalFactory.g:181:5: otherlv_12= ',' ( (lv_connections_13_0= ruleConnection ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getFactoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalFactory.g:185:5: ( (lv_connections_13_0= ruleConnection ) )
                    	    // InternalFactory.g:186:6: (lv_connections_13_0= ruleConnection )
                    	    {
                    	    // InternalFactory.g:186:6: (lv_connections_13_0= ruleConnection )
                    	    // InternalFactory.g:187:7: lv_connections_13_0= ruleConnection
                    	    {

                    	    							newCompositeNode(grammarAccess.getFactoryAccess().getConnectionsConnectionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_connections_13_0=ruleConnection();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFactoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"connections",
                    	    								lv_connections_13_0,
                    	    								"es.unican.ildm.practica3.xtext.Factory.Connection");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactory"


    // $ANTLR start "entryRuleElement"
    // InternalFactory.g:218:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalFactory.g:218:48: (iv_ruleElement= ruleElement EOF )
            // InternalFactory.g:219:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalFactory.g:225:1: ruleElement returns [EObject current=null] : (this_Assembler_0= ruleAssembler | this_Wrapper_1= ruleWrapper | this_StickProducer_2= ruleStickProducer | this_CandyProducer_3= ruleCandyProducer | this_ConveyorBelt_4= ruleConveyorBelt | this_Flattener_5= ruleFlattener ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Assembler_0 = null;

        EObject this_Wrapper_1 = null;

        EObject this_StickProducer_2 = null;

        EObject this_CandyProducer_3 = null;

        EObject this_ConveyorBelt_4 = null;

        EObject this_Flattener_5 = null;



        	enterRule();

        try {
            // InternalFactory.g:231:2: ( (this_Assembler_0= ruleAssembler | this_Wrapper_1= ruleWrapper | this_StickProducer_2= ruleStickProducer | this_CandyProducer_3= ruleCandyProducer | this_ConveyorBelt_4= ruleConveyorBelt | this_Flattener_5= ruleFlattener ) )
            // InternalFactory.g:232:2: (this_Assembler_0= ruleAssembler | this_Wrapper_1= ruleWrapper | this_StickProducer_2= ruleStickProducer | this_CandyProducer_3= ruleCandyProducer | this_ConveyorBelt_4= ruleConveyorBelt | this_Flattener_5= ruleFlattener )
            {
            // InternalFactory.g:232:2: (this_Assembler_0= ruleAssembler | this_Wrapper_1= ruleWrapper | this_StickProducer_2= ruleStickProducer | this_CandyProducer_3= ruleCandyProducer | this_ConveyorBelt_4= ruleConveyorBelt | this_Flattener_5= ruleFlattener )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case 27:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFactory.g:233:3: this_Assembler_0= ruleAssembler
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAssemblerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assembler_0=ruleAssembler();

                    state._fsp--;


                    			current = this_Assembler_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFactory.g:242:3: this_Wrapper_1= ruleWrapper
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getWrapperParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wrapper_1=ruleWrapper();

                    state._fsp--;


                    			current = this_Wrapper_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFactory.g:251:3: this_StickProducer_2= ruleStickProducer
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getStickProducerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StickProducer_2=ruleStickProducer();

                    state._fsp--;


                    			current = this_StickProducer_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFactory.g:260:3: this_CandyProducer_3= ruleCandyProducer
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCandyProducerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CandyProducer_3=ruleCandyProducer();

                    state._fsp--;


                    			current = this_CandyProducer_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFactory.g:269:3: this_ConveyorBelt_4= ruleConveyorBelt
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getConveyorBeltParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConveyorBelt_4=ruleConveyorBelt();

                    state._fsp--;


                    			current = this_ConveyorBelt_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFactory.g:278:3: this_Flattener_5= ruleFlattener
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFlattenerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Flattener_5=ruleFlattener();

                    state._fsp--;


                    			current = this_Flattener_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleComponent"
    // InternalFactory.g:290:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalFactory.g:290:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalFactory.g:291:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalFactory.g:297:1: ruleComponent returns [EObject current=null] : (this_CandyFlat_0= ruleCandyFlat | this_Stick_1= ruleStick | this_CandyBall_2= ruleCandyBall | this_Lollipop_3= ruleLollipop ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_CandyFlat_0 = null;

        EObject this_Stick_1 = null;

        EObject this_CandyBall_2 = null;

        EObject this_Lollipop_3 = null;



        	enterRule();

        try {
            // InternalFactory.g:303:2: ( (this_CandyFlat_0= ruleCandyFlat | this_Stick_1= ruleStick | this_CandyBall_2= ruleCandyBall | this_Lollipop_3= ruleLollipop ) )
            // InternalFactory.g:304:2: (this_CandyFlat_0= ruleCandyFlat | this_Stick_1= ruleStick | this_CandyBall_2= ruleCandyBall | this_Lollipop_3= ruleLollipop )
            {
            // InternalFactory.g:304:2: (this_CandyFlat_0= ruleCandyFlat | this_Stick_1= ruleStick | this_CandyBall_2= ruleCandyBall | this_Lollipop_3= ruleLollipop )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt6=1;
                }
                break;
            case 30:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            case 32:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFactory.g:305:3: this_CandyFlat_0= ruleCandyFlat
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getCandyFlatParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CandyFlat_0=ruleCandyFlat();

                    state._fsp--;


                    			current = this_CandyFlat_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFactory.g:314:3: this_Stick_1= ruleStick
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getStickParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stick_1=ruleStick();

                    state._fsp--;


                    			current = this_Stick_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFactory.g:323:3: this_CandyBall_2= ruleCandyBall
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getCandyBallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CandyBall_2=ruleCandyBall();

                    state._fsp--;


                    			current = this_CandyBall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFactory.g:332:3: this_Lollipop_3= ruleLollipop
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getLollipopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lollipop_3=ruleLollipop();

                    state._fsp--;


                    			current = this_Lollipop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConnection"
    // InternalFactory.g:344:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalFactory.g:344:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalFactory.g:345:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalFactory.g:351:1: ruleConnection returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFactory.g:357:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalFactory.g:358:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalFactory.g:358:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            // InternalFactory.g:359:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) )
            {
            // InternalFactory.g:359:3: ()
            // InternalFactory.g:360:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnectionAccess().getConnectionAction_0(),
            					current);
            			

            }

            // InternalFactory.g:366:3: ( (otherlv_1= RULE_ID ) )
            // InternalFactory.g:367:4: (otherlv_1= RULE_ID )
            {
            // InternalFactory.g:367:4: (otherlv_1= RULE_ID )
            // InternalFactory.g:368:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getSourceElementCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalFactory.g:383:3: ( (otherlv_3= RULE_ID ) )
            // InternalFactory.g:384:4: (otherlv_3= RULE_ID )
            {
            // InternalFactory.g:384:4: (otherlv_3= RULE_ID )
            // InternalFactory.g:385:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getConnectionAccess().getTargetElementCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleEString"
    // InternalFactory.g:400:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFactory.g:400:47: (iv_ruleEString= ruleEString EOF )
            // InternalFactory.g:401:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFactory.g:407:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFactory.g:413:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFactory.g:414:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFactory.g:414:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFactory.g:415:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFactory.g:423:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAssembler"
    // InternalFactory.g:434:1: entryRuleAssembler returns [EObject current=null] : iv_ruleAssembler= ruleAssembler EOF ;
    public final EObject entryRuleAssembler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembler = null;


        try {
            // InternalFactory.g:434:50: (iv_ruleAssembler= ruleAssembler EOF )
            // InternalFactory.g:435:2: iv_ruleAssembler= ruleAssembler EOF
            {
             newCompositeNode(grammarAccess.getAssemblerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssembler=ruleAssembler();

            state._fsp--;

             current =iv_ruleAssembler; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssembler"


    // $ANTLR start "ruleAssembler"
    // InternalFactory.g:441:1: ruleAssembler returns [EObject current=null] : (otherlv_0= 'Assembler' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}' ) ;
    public final EObject ruleAssembler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_processingTime_4_0 = null;



        	enterRule();

        try {
            // InternalFactory.g:447:2: ( (otherlv_0= 'Assembler' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}' ) )
            // InternalFactory.g:448:2: (otherlv_0= 'Assembler' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}' )
            {
            // InternalFactory.g:448:2: (otherlv_0= 'Assembler' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}' )
            // InternalFactory.g:449:3: otherlv_0= 'Assembler' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblerAccess().getAssemblerKeyword_0());
            		
            // InternalFactory.g:453:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFactory.g:454:4: (lv_name_1_0= ruleEString )
            {
            // InternalFactory.g:454:4: (lv_name_1_0= ruleEString )
            // InternalFactory.g:455:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.unican.ildm.practica3.xtext.Factory.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblerAccess().getProcessingTimeKeyword_3());
            		
            // InternalFactory.g:480:3: ( (lv_processingTime_4_0= ruleEInt ) )
            // InternalFactory.g:481:4: (lv_processingTime_4_0= ruleEInt )
            {
            // InternalFactory.g:481:4: (lv_processingTime_4_0= ruleEInt )
            // InternalFactory.g:482:5: lv_processingTime_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAssemblerAccess().getProcessingTimeEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_processingTime_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblerRule());
            					}
            					set(
            						current,
            						"processingTime",
            						lv_processingTime_4_0,
            						"es.unican.ildm.practica3.xtext.Factory.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAssemblerAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssembler"


    // $ANTLR start "entryRuleWrapper"
    // InternalFactory.g:507:1: entryRuleWrapper returns [EObject current=null] : iv_ruleWrapper= ruleWrapper EOF ;
    public final EObject entryRuleWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrapper = null;


        try {
            // InternalFactory.g:507:48: (iv_ruleWrapper= ruleWrapper EOF )
            // InternalFactory.g:508:2: iv_ruleWrapper= ruleWrapper EOF
            {
             newCompositeNode(grammarAccess.getWrapperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWrapper=ruleWrapper();

            state._fsp--;

             current =iv_ruleWrapper; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWrapper"


    // $ANTLR start "ruleWrapper"
    // InternalFactory.g:514:1: ruleWrapper returns [EObject current=null] : (otherlv_0= 'Wrapper' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}' ) ;
    public final EObject ruleWrapper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_processingTime_4_0 = null;



        	enterRule();

        try {
            // InternalFactory.g:520:2: ( (otherlv_0= 'Wrapper' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}' ) )
            // InternalFactory.g:521:2: (otherlv_0= 'Wrapper' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}' )
            {
            // InternalFactory.g:521:2: (otherlv_0= 'Wrapper' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}' )
            // InternalFactory.g:522:3: otherlv_0= 'Wrapper' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getWrapperAccess().getWrapperKeyword_0());
            		
            // InternalFactory.g:526:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFactory.g:527:4: (lv_name_1_0= ruleEString )
            {
            // InternalFactory.g:527:4: (lv_name_1_0= ruleEString )
            // InternalFactory.g:528:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWrapperAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWrapperRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.unican.ildm.practica3.xtext.Factory.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getWrapperAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getWrapperAccess().getProcessingTimeKeyword_3());
            		
            // InternalFactory.g:553:3: ( (lv_processingTime_4_0= ruleEInt ) )
            // InternalFactory.g:554:4: (lv_processingTime_4_0= ruleEInt )
            {
            // InternalFactory.g:554:4: (lv_processingTime_4_0= ruleEInt )
            // InternalFactory.g:555:5: lv_processingTime_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getWrapperAccess().getProcessingTimeEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_processingTime_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWrapperRule());
            					}
            					set(
            						current,
            						"processingTime",
            						lv_processingTime_4_0,
            						"es.unican.ildm.practica3.xtext.Factory.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWrapperAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWrapper"


    // $ANTLR start "entryRuleStickProducer"
    // InternalFactory.g:580:1: entryRuleStickProducer returns [EObject current=null] : iv_ruleStickProducer= ruleStickProducer EOF ;
    public final EObject entryRuleStickProducer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStickProducer = null;


        try {
            // InternalFactory.g:580:54: (iv_ruleStickProducer= ruleStickProducer EOF )
            // InternalFactory.g:581:2: iv_ruleStickProducer= ruleStickProducer EOF
            {
             newCompositeNode(grammarAccess.getStickProducerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStickProducer=ruleStickProducer();

            state._fsp--;

             current =iv_ruleStickProducer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStickProducer"


    // $ANTLR start "ruleStickProducer"
    // InternalFactory.g:587:1: ruleStickProducer returns [EObject current=null] : (otherlv_0= 'StickProducer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= 'counter' ( (lv_counter_6_0= ruleEInt ) ) otherlv_7= '}' ) ;
    public final EObject ruleStickProducer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_processingTime_4_0 = null;

        AntlrDatatypeRuleToken lv_counter_6_0 = null;



        	enterRule();

        try {
            // InternalFactory.g:593:2: ( (otherlv_0= 'StickProducer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= 'counter' ( (lv_counter_6_0= ruleEInt ) ) otherlv_7= '}' ) )
            // InternalFactory.g:594:2: (otherlv_0= 'StickProducer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= 'counter' ( (lv_counter_6_0= ruleEInt ) ) otherlv_7= '}' )
            {
            // InternalFactory.g:594:2: (otherlv_0= 'StickProducer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= 'counter' ( (lv_counter_6_0= ruleEInt ) ) otherlv_7= '}' )
            // InternalFactory.g:595:3: otherlv_0= 'StickProducer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= 'counter' ( (lv_counter_6_0= ruleEInt ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getStickProducerAccess().getStickProducerKeyword_0());
            		
            // InternalFactory.g:599:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFactory.g:600:4: (lv_name_1_0= ruleEString )
            {
            // InternalFactory.g:600:4: (lv_name_1_0= ruleEString )
            // InternalFactory.g:601:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStickProducerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStickProducerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.unican.ildm.practica3.xtext.Factory.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getStickProducerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getStickProducerAccess().getProcessingTimeKeyword_3());
            		
            // InternalFactory.g:626:3: ( (lv_processingTime_4_0= ruleEInt ) )
            // InternalFactory.g:627:4: (lv_processingTime_4_0= ruleEInt )
            {
            // InternalFactory.g:627:4: (lv_processingTime_4_0= ruleEInt )
            // InternalFactory.g:628:5: lv_processingTime_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getStickProducerAccess().getProcessingTimeEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_processingTime_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStickProducerRule());
            					}
            					set(
            						current,
            						"processingTime",
            						lv_processingTime_4_0,
            						"es.unican.ildm.practica3.xtext.Factory.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getStickProducerAccess().getCounterKeyword_5());
            		
            // InternalFactory.g:649:3: ( (lv_counter_6_0= ruleEInt ) )
            // InternalFactory.g:650:4: (lv_counter_6_0= ruleEInt )
            {
            // InternalFactory.g:650:4: (lv_counter_6_0= ruleEInt )
            // InternalFactory.g:651:5: lv_counter_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getStickProducerAccess().getCounterEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_counter_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStickProducerRule());
            					}
            					set(
            						current,
            						"counter",
            						lv_counter_6_0,
            						"es.unican.ildm.practica3.xtext.Factory.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getStickProducerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStickProducer"


    // $ANTLR start "entryRuleCandyProducer"
    // InternalFactory.g:676:1: entryRuleCandyProducer returns [EObject current=null] : iv_ruleCandyProducer= ruleCandyProducer EOF ;
    public final EObject entryRuleCandyProducer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCandyProducer = null;


        try {
            // InternalFactory.g:676:54: (iv_ruleCandyProducer= ruleCandyProducer EOF )
            // InternalFactory.g:677:2: iv_ruleCandyProducer= ruleCandyProducer EOF
            {
             newCompositeNode(grammarAccess.getCandyProducerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCandyProducer=ruleCandyProducer();

            state._fsp--;

             current =iv_ruleCandyProducer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCandyProducer"


    // $ANTLR start "ruleCandyProducer"
    // InternalFactory.g:683:1: ruleCandyProducer returns [EObject current=null] : (otherlv_0= 'CandyProducer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= 'counter' ( (lv_counter_6_0= ruleEInt ) ) otherlv_7= '}' ) ;
    public final EObject ruleCandyProducer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_processingTime_4_0 = null;

        AntlrDatatypeRuleToken lv_counter_6_0 = null;



        	enterRule();

        try {
            // InternalFactory.g:689:2: ( (otherlv_0= 'CandyProducer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= 'counter' ( (lv_counter_6_0= ruleEInt ) ) otherlv_7= '}' ) )
            // InternalFactory.g:690:2: (otherlv_0= 'CandyProducer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= 'counter' ( (lv_counter_6_0= ruleEInt ) ) otherlv_7= '}' )
            {
            // InternalFactory.g:690:2: (otherlv_0= 'CandyProducer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= 'counter' ( (lv_counter_6_0= ruleEInt ) ) otherlv_7= '}' )
            // InternalFactory.g:691:3: otherlv_0= 'CandyProducer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= 'counter' ( (lv_counter_6_0= ruleEInt ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCandyProducerAccess().getCandyProducerKeyword_0());
            		
            // InternalFactory.g:695:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFactory.g:696:4: (lv_name_1_0= ruleEString )
            {
            // InternalFactory.g:696:4: (lv_name_1_0= ruleEString )
            // InternalFactory.g:697:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCandyProducerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCandyProducerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.unican.ildm.practica3.xtext.Factory.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCandyProducerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getCandyProducerAccess().getProcessingTimeKeyword_3());
            		
            // InternalFactory.g:722:3: ( (lv_processingTime_4_0= ruleEInt ) )
            // InternalFactory.g:723:4: (lv_processingTime_4_0= ruleEInt )
            {
            // InternalFactory.g:723:4: (lv_processingTime_4_0= ruleEInt )
            // InternalFactory.g:724:5: lv_processingTime_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCandyProducerAccess().getProcessingTimeEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_processingTime_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCandyProducerRule());
            					}
            					set(
            						current,
            						"processingTime",
            						lv_processingTime_4_0,
            						"es.unican.ildm.practica3.xtext.Factory.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getCandyProducerAccess().getCounterKeyword_5());
            		
            // InternalFactory.g:745:3: ( (lv_counter_6_0= ruleEInt ) )
            // InternalFactory.g:746:4: (lv_counter_6_0= ruleEInt )
            {
            // InternalFactory.g:746:4: (lv_counter_6_0= ruleEInt )
            // InternalFactory.g:747:5: lv_counter_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCandyProducerAccess().getCounterEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_counter_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCandyProducerRule());
            					}
            					set(
            						current,
            						"counter",
            						lv_counter_6_0,
            						"es.unican.ildm.practica3.xtext.Factory.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCandyProducerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCandyProducer"


    // $ANTLR start "entryRuleConveyorBelt"
    // InternalFactory.g:772:1: entryRuleConveyorBelt returns [EObject current=null] : iv_ruleConveyorBelt= ruleConveyorBelt EOF ;
    public final EObject entryRuleConveyorBelt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConveyorBelt = null;


        try {
            // InternalFactory.g:772:53: (iv_ruleConveyorBelt= ruleConveyorBelt EOF )
            // InternalFactory.g:773:2: iv_ruleConveyorBelt= ruleConveyorBelt EOF
            {
             newCompositeNode(grammarAccess.getConveyorBeltRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConveyorBelt=ruleConveyorBelt();

            state._fsp--;

             current =iv_ruleConveyorBelt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConveyorBelt"


    // $ANTLR start "ruleConveyorBelt"
    // InternalFactory.g:779:1: ruleConveyorBelt returns [EObject current=null] : (otherlv_0= 'ConveyorBelt' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEInt ) ) (otherlv_5= 'components' otherlv_6= '{' ( (lv_components_7_0= ruleComponent ) ) (otherlv_8= ',' ( (lv_components_9_0= ruleComponent ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleConveyorBelt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_capacity_4_0 = null;

        EObject lv_components_7_0 = null;

        EObject lv_components_9_0 = null;



        	enterRule();

        try {
            // InternalFactory.g:785:2: ( (otherlv_0= 'ConveyorBelt' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEInt ) ) (otherlv_5= 'components' otherlv_6= '{' ( (lv_components_7_0= ruleComponent ) ) (otherlv_8= ',' ( (lv_components_9_0= ruleComponent ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalFactory.g:786:2: (otherlv_0= 'ConveyorBelt' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEInt ) ) (otherlv_5= 'components' otherlv_6= '{' ( (lv_components_7_0= ruleComponent ) ) (otherlv_8= ',' ( (lv_components_9_0= ruleComponent ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalFactory.g:786:2: (otherlv_0= 'ConveyorBelt' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEInt ) ) (otherlv_5= 'components' otherlv_6= '{' ( (lv_components_7_0= ruleComponent ) ) (otherlv_8= ',' ( (lv_components_9_0= ruleComponent ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalFactory.g:787:3: otherlv_0= 'ConveyorBelt' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEInt ) ) (otherlv_5= 'components' otherlv_6= '{' ( (lv_components_7_0= ruleComponent ) ) (otherlv_8= ',' ( (lv_components_9_0= ruleComponent ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getConveyorBeltAccess().getConveyorBeltKeyword_0());
            		
            // InternalFactory.g:791:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFactory.g:792:4: (lv_name_1_0= ruleEString )
            {
            // InternalFactory.g:792:4: (lv_name_1_0= ruleEString )
            // InternalFactory.g:793:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConveyorBeltAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConveyorBeltRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.unican.ildm.practica3.xtext.Factory.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getConveyorBeltAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getConveyorBeltAccess().getCapacityKeyword_3());
            		
            // InternalFactory.g:818:3: ( (lv_capacity_4_0= ruleEInt ) )
            // InternalFactory.g:819:4: (lv_capacity_4_0= ruleEInt )
            {
            // InternalFactory.g:819:4: (lv_capacity_4_0= ruleEInt )
            // InternalFactory.g:820:5: lv_capacity_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getConveyorBeltAccess().getCapacityEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_capacity_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConveyorBeltRule());
            					}
            					set(
            						current,
            						"capacity",
            						lv_capacity_4_0,
            						"es.unican.ildm.practica3.xtext.Factory.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFactory.g:837:3: (otherlv_5= 'components' otherlv_6= '{' ( (lv_components_7_0= ruleComponent ) ) (otherlv_8= ',' ( (lv_components_9_0= ruleComponent ) ) )* otherlv_10= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFactory.g:838:4: otherlv_5= 'components' otherlv_6= '{' ( (lv_components_7_0= ruleComponent ) ) (otherlv_8= ',' ( (lv_components_9_0= ruleComponent ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getConveyorBeltAccess().getComponentsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getConveyorBeltAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalFactory.g:846:4: ( (lv_components_7_0= ruleComponent ) )
                    // InternalFactory.g:847:5: (lv_components_7_0= ruleComponent )
                    {
                    // InternalFactory.g:847:5: (lv_components_7_0= ruleComponent )
                    // InternalFactory.g:848:6: lv_components_7_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getConveyorBeltAccess().getComponentsComponentParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_components_7_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConveyorBeltRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_7_0,
                    							"es.unican.ildm.practica3.xtext.Factory.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFactory.g:865:4: (otherlv_8= ',' ( (lv_components_9_0= ruleComponent ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalFactory.g:866:5: otherlv_8= ',' ( (lv_components_9_0= ruleComponent ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getConveyorBeltAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalFactory.g:870:5: ( (lv_components_9_0= ruleComponent ) )
                    	    // InternalFactory.g:871:6: (lv_components_9_0= ruleComponent )
                    	    {
                    	    // InternalFactory.g:871:6: (lv_components_9_0= ruleComponent )
                    	    // InternalFactory.g:872:7: lv_components_9_0= ruleComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getConveyorBeltAccess().getComponentsComponentParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_components_9_0=ruleComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConveyorBeltRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"components",
                    	    								lv_components_9_0,
                    	    								"es.unican.ildm.practica3.xtext.Factory.Component");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getConveyorBeltAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getConveyorBeltAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConveyorBelt"


    // $ANTLR start "entryRuleFlattener"
    // InternalFactory.g:903:1: entryRuleFlattener returns [EObject current=null] : iv_ruleFlattener= ruleFlattener EOF ;
    public final EObject entryRuleFlattener() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlattener = null;


        try {
            // InternalFactory.g:903:50: (iv_ruleFlattener= ruleFlattener EOF )
            // InternalFactory.g:904:2: iv_ruleFlattener= ruleFlattener EOF
            {
             newCompositeNode(grammarAccess.getFlattenerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlattener=ruleFlattener();

            state._fsp--;

             current =iv_ruleFlattener; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlattener"


    // $ANTLR start "ruleFlattener"
    // InternalFactory.g:910:1: ruleFlattener returns [EObject current=null] : (otherlv_0= 'Flattener' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}' ) ;
    public final EObject ruleFlattener() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_processingTime_4_0 = null;



        	enterRule();

        try {
            // InternalFactory.g:916:2: ( (otherlv_0= 'Flattener' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}' ) )
            // InternalFactory.g:917:2: (otherlv_0= 'Flattener' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}' )
            {
            // InternalFactory.g:917:2: (otherlv_0= 'Flattener' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}' )
            // InternalFactory.g:918:3: otherlv_0= 'Flattener' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'processingTime' ( (lv_processingTime_4_0= ruleEInt ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFlattenerAccess().getFlattenerKeyword_0());
            		
            // InternalFactory.g:922:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFactory.g:923:4: (lv_name_1_0= ruleEString )
            {
            // InternalFactory.g:923:4: (lv_name_1_0= ruleEString )
            // InternalFactory.g:924:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFlattenerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFlattenerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.unican.ildm.practica3.xtext.Factory.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getFlattenerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getFlattenerAccess().getProcessingTimeKeyword_3());
            		
            // InternalFactory.g:949:3: ( (lv_processingTime_4_0= ruleEInt ) )
            // InternalFactory.g:950:4: (lv_processingTime_4_0= ruleEInt )
            {
            // InternalFactory.g:950:4: (lv_processingTime_4_0= ruleEInt )
            // InternalFactory.g:951:5: lv_processingTime_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getFlattenerAccess().getProcessingTimeEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_processingTime_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFlattenerRule());
            					}
            					set(
            						current,
            						"processingTime",
            						lv_processingTime_4_0,
            						"es.unican.ildm.practica3.xtext.Factory.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFlattenerAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlattener"


    // $ANTLR start "entryRuleEInt"
    // InternalFactory.g:976:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalFactory.g:976:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalFactory.g:977:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalFactory.g:983:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalFactory.g:989:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalFactory.g:990:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalFactory.g:990:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalFactory.g:991:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalFactory.g:991:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFactory.g:992:4: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleCandyFlat"
    // InternalFactory.g:1009:1: entryRuleCandyFlat returns [EObject current=null] : iv_ruleCandyFlat= ruleCandyFlat EOF ;
    public final EObject entryRuleCandyFlat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCandyFlat = null;


        try {
            // InternalFactory.g:1009:50: (iv_ruleCandyFlat= ruleCandyFlat EOF )
            // InternalFactory.g:1010:2: iv_ruleCandyFlat= ruleCandyFlat EOF
            {
             newCompositeNode(grammarAccess.getCandyFlatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCandyFlat=ruleCandyFlat();

            state._fsp--;

             current =iv_ruleCandyFlat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCandyFlat"


    // $ANTLR start "ruleCandyFlat"
    // InternalFactory.g:1016:1: ruleCandyFlat returns [EObject current=null] : ( () otherlv_1= 'CandyFlat' ) ;
    public final EObject ruleCandyFlat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFactory.g:1022:2: ( ( () otherlv_1= 'CandyFlat' ) )
            // InternalFactory.g:1023:2: ( () otherlv_1= 'CandyFlat' )
            {
            // InternalFactory.g:1023:2: ( () otherlv_1= 'CandyFlat' )
            // InternalFactory.g:1024:3: () otherlv_1= 'CandyFlat'
            {
            // InternalFactory.g:1024:3: ()
            // InternalFactory.g:1025:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCandyFlatAccess().getCandyFlatAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCandyFlatAccess().getCandyFlatKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCandyFlat"


    // $ANTLR start "entryRuleStick"
    // InternalFactory.g:1039:1: entryRuleStick returns [EObject current=null] : iv_ruleStick= ruleStick EOF ;
    public final EObject entryRuleStick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStick = null;


        try {
            // InternalFactory.g:1039:46: (iv_ruleStick= ruleStick EOF )
            // InternalFactory.g:1040:2: iv_ruleStick= ruleStick EOF
            {
             newCompositeNode(grammarAccess.getStickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStick=ruleStick();

            state._fsp--;

             current =iv_ruleStick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStick"


    // $ANTLR start "ruleStick"
    // InternalFactory.g:1046:1: ruleStick returns [EObject current=null] : ( () otherlv_1= 'Stick' ) ;
    public final EObject ruleStick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFactory.g:1052:2: ( ( () otherlv_1= 'Stick' ) )
            // InternalFactory.g:1053:2: ( () otherlv_1= 'Stick' )
            {
            // InternalFactory.g:1053:2: ( () otherlv_1= 'Stick' )
            // InternalFactory.g:1054:3: () otherlv_1= 'Stick'
            {
            // InternalFactory.g:1054:3: ()
            // InternalFactory.g:1055:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStickAccess().getStickAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStickAccess().getStickKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStick"


    // $ANTLR start "entryRuleCandyBall"
    // InternalFactory.g:1069:1: entryRuleCandyBall returns [EObject current=null] : iv_ruleCandyBall= ruleCandyBall EOF ;
    public final EObject entryRuleCandyBall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCandyBall = null;


        try {
            // InternalFactory.g:1069:50: (iv_ruleCandyBall= ruleCandyBall EOF )
            // InternalFactory.g:1070:2: iv_ruleCandyBall= ruleCandyBall EOF
            {
             newCompositeNode(grammarAccess.getCandyBallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCandyBall=ruleCandyBall();

            state._fsp--;

             current =iv_ruleCandyBall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCandyBall"


    // $ANTLR start "ruleCandyBall"
    // InternalFactory.g:1076:1: ruleCandyBall returns [EObject current=null] : ( () otherlv_1= 'CandyBall' ) ;
    public final EObject ruleCandyBall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFactory.g:1082:2: ( ( () otherlv_1= 'CandyBall' ) )
            // InternalFactory.g:1083:2: ( () otherlv_1= 'CandyBall' )
            {
            // InternalFactory.g:1083:2: ( () otherlv_1= 'CandyBall' )
            // InternalFactory.g:1084:3: () otherlv_1= 'CandyBall'
            {
            // InternalFactory.g:1084:3: ()
            // InternalFactory.g:1085:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCandyBallAccess().getCandyBallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCandyBallAccess().getCandyBallKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCandyBall"


    // $ANTLR start "entryRuleLollipop"
    // InternalFactory.g:1099:1: entryRuleLollipop returns [EObject current=null] : iv_ruleLollipop= ruleLollipop EOF ;
    public final EObject entryRuleLollipop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLollipop = null;


        try {
            // InternalFactory.g:1099:49: (iv_ruleLollipop= ruleLollipop EOF )
            // InternalFactory.g:1100:2: iv_ruleLollipop= ruleLollipop EOF
            {
             newCompositeNode(grammarAccess.getLollipopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLollipop=ruleLollipop();

            state._fsp--;

             current =iv_ruleLollipop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLollipop"


    // $ANTLR start "ruleLollipop"
    // InternalFactory.g:1106:1: ruleLollipop returns [EObject current=null] : ( () otherlv_1= 'Lollipop' ) ;
    public final EObject ruleLollipop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFactory.g:1112:2: ( ( () otherlv_1= 'Lollipop' ) )
            // InternalFactory.g:1113:2: ( () otherlv_1= 'Lollipop' )
            {
            // InternalFactory.g:1113:2: ( () otherlv_1= 'Lollipop' )
            // InternalFactory.g:1114:3: () otherlv_1= 'Lollipop'
            {
            // InternalFactory.g:1114:3: ()
            // InternalFactory.g:1115:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLollipopAccess().getLollipopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLollipopAccess().getLollipopKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLollipop"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000009B40000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});

}