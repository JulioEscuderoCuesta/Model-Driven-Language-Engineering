package es.unican.ildm.practica3.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.unican.ildm.practica3.services.FactoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFactoryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'shift'", "'{'", "'date'", "':'", "';'", "'work'", "','", "'}'", "'task'", "'duration'", "'='", "'['", "'->'", "']'", "'operator'", "'area'", "'machine'", "'manufacturer'", "'-'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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
    // InternalFactory.g:71:1: ruleFactory returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleFactory() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalFactory.g:77:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalFactory.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalFactory.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==19||LA1_0==25||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFactory.g:79:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalFactory.g:79:3: (lv_elements_0_0= ruleElement )
            	    // InternalFactory.g:80:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getFactoryAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getFactoryRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"es.unican.ildm.practica3.Factory.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // InternalFactory.g:100:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalFactory.g:100:48: (iv_ruleElement= ruleElement EOF )
            // InternalFactory.g:101:2: iv_ruleElement= ruleElement EOF
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
    // InternalFactory.g:107:1: ruleElement returns [EObject current=null] : (this_Shift_0= ruleShift | this_Task_1= ruleTask | this_Operator_2= ruleOperator | this_Machine_3= ruleMachine ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Shift_0 = null;

        EObject this_Task_1 = null;

        EObject this_Operator_2 = null;

        EObject this_Machine_3 = null;



        	enterRule();

        try {
            // InternalFactory.g:113:2: ( (this_Shift_0= ruleShift | this_Task_1= ruleTask | this_Operator_2= ruleOperator | this_Machine_3= ruleMachine ) )
            // InternalFactory.g:114:2: (this_Shift_0= ruleShift | this_Task_1= ruleTask | this_Operator_2= ruleOperator | this_Machine_3= ruleMachine )
            {
            // InternalFactory.g:114:2: (this_Shift_0= ruleShift | this_Task_1= ruleTask | this_Operator_2= ruleOperator | this_Machine_3= ruleMachine )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFactory.g:115:3: this_Shift_0= ruleShift
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getShiftParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Shift_0=ruleShift();

                    state._fsp--;


                    			current = this_Shift_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFactory.g:124:3: this_Task_1= ruleTask
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Task_1=ruleTask();

                    state._fsp--;


                    			current = this_Task_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFactory.g:133:3: this_Operator_2= ruleOperator
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getOperatorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operator_2=ruleOperator();

                    state._fsp--;


                    			current = this_Operator_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFactory.g:142:3: this_Machine_3= ruleMachine
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getMachineParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Machine_3=ruleMachine();

                    state._fsp--;


                    			current = this_Machine_3;
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


    // $ANTLR start "entryRuleShift"
    // InternalFactory.g:154:1: entryRuleShift returns [EObject current=null] : iv_ruleShift= ruleShift EOF ;
    public final EObject entryRuleShift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShift = null;


        try {
            // InternalFactory.g:154:46: (iv_ruleShift= ruleShift EOF )
            // InternalFactory.g:155:2: iv_ruleShift= ruleShift EOF
            {
             newCompositeNode(grammarAccess.getShiftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShift=ruleShift();

            state._fsp--;

             current =iv_ruleShift; 
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
    // $ANTLR end "entryRuleShift"


    // $ANTLR start "ruleShift"
    // InternalFactory.g:161:1: ruleShift returns [EObject current=null] : (otherlv_0= 'shift' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'date' otherlv_4= ':' ( (lv_date_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'work' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' otherlv_13= '}' ) ;
    public final EObject ruleShift() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_date_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalFactory.g:167:2: ( (otherlv_0= 'shift' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'date' otherlv_4= ':' ( (lv_date_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'work' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' otherlv_13= '}' ) )
            // InternalFactory.g:168:2: (otherlv_0= 'shift' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'date' otherlv_4= ':' ( (lv_date_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'work' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' otherlv_13= '}' )
            {
            // InternalFactory.g:168:2: (otherlv_0= 'shift' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'date' otherlv_4= ':' ( (lv_date_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'work' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' otherlv_13= '}' )
            // InternalFactory.g:169:3: otherlv_0= 'shift' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'date' otherlv_4= ':' ( (lv_date_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'work' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ';' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getShiftAccess().getShiftKeyword_0());
            		
            // InternalFactory.g:173:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFactory.g:174:4: (lv_name_1_0= ruleEString )
            {
            // InternalFactory.g:174:4: (lv_name_1_0= ruleEString )
            // InternalFactory.g:175:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getShiftAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShiftRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.unican.ildm.practica3.Factory.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getShiftAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getShiftAccess().getDateKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getShiftAccess().getColonKeyword_4());
            		
            // InternalFactory.g:204:3: ( (lv_date_5_0= RULE_STRING ) )
            // InternalFactory.g:205:4: (lv_date_5_0= RULE_STRING )
            {
            // InternalFactory.g:205:4: (lv_date_5_0= RULE_STRING )
            // InternalFactory.g:206:5: lv_date_5_0= RULE_STRING
            {
            lv_date_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_date_5_0, grammarAccess.getShiftAccess().getDateSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShiftRule());
            					}
            					setWithLastConsumed(
            						current,
            						"date",
            						lv_date_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getShiftAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getShiftAccess().getWorkKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getShiftAccess().getColonKeyword_8());
            		
            // InternalFactory.g:234:3: ( (otherlv_9= RULE_ID ) )
            // InternalFactory.g:235:4: (otherlv_9= RULE_ID )
            {
            // InternalFactory.g:235:4: (otherlv_9= RULE_ID )
            // InternalFactory.g:236:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShiftRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_9, grammarAccess.getShiftAccess().getWorkTaskCrossReference_9_0());
            				

            }


            }

            // InternalFactory.g:247:3: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFactory.g:248:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_11); 

            	    				newLeafNode(otherlv_10, grammarAccess.getShiftAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalFactory.g:252:4: ( (otherlv_11= RULE_ID ) )
            	    // InternalFactory.g:253:5: (otherlv_11= RULE_ID )
            	    {
            	    // InternalFactory.g:253:5: (otherlv_11= RULE_ID )
            	    // InternalFactory.g:254:6: otherlv_11= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getShiftRule());
            	    						}
            	    					
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    						newLeafNode(otherlv_11, grammarAccess.getShiftAccess().getWorkTaskCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getShiftAccess().getSemicolonKeyword_11());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getShiftAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleShift"


    // $ANTLR start "entryRuleTask"
    // InternalFactory.g:278:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalFactory.g:278:45: (iv_ruleTask= ruleTask EOF )
            // InternalFactory.g:279:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalFactory.g:285:1: ruleTask returns [EObject current=null] : ( () otherlv_1= 'task' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'duration' otherlv_4= '=' ( (lv_duration_5_0= ruleEIntegerObject ) ) )? otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']' otherlv_11= ';' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_duration_5_0 = null;



        	enterRule();

        try {
            // InternalFactory.g:291:2: ( ( () otherlv_1= 'task' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'duration' otherlv_4= '=' ( (lv_duration_5_0= ruleEIntegerObject ) ) )? otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']' otherlv_11= ';' ) )
            // InternalFactory.g:292:2: ( () otherlv_1= 'task' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'duration' otherlv_4= '=' ( (lv_duration_5_0= ruleEIntegerObject ) ) )? otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']' otherlv_11= ';' )
            {
            // InternalFactory.g:292:2: ( () otherlv_1= 'task' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'duration' otherlv_4= '=' ( (lv_duration_5_0= ruleEIntegerObject ) ) )? otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']' otherlv_11= ';' )
            // InternalFactory.g:293:3: () otherlv_1= 'task' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'duration' otherlv_4= '=' ( (lv_duration_5_0= ruleEIntegerObject ) ) )? otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']' otherlv_11= ';'
            {
            // InternalFactory.g:293:3: ()
            // InternalFactory.g:294:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskAccess().getTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getTaskKeyword_1());
            		
            // InternalFactory.g:304:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFactory.g:305:4: (lv_name_2_0= ruleEString )
            {
            // InternalFactory.g:305:4: (lv_name_2_0= ruleEString )
            // InternalFactory.g:306:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"es.unican.ildm.practica3.Factory.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFactory.g:323:3: (otherlv_3= 'duration' otherlv_4= '=' ( (lv_duration_5_0= ruleEIntegerObject ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFactory.g:324:4: otherlv_3= 'duration' otherlv_4= '=' ( (lv_duration_5_0= ruleEIntegerObject ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getDurationKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalFactory.g:332:4: ( (lv_duration_5_0= ruleEIntegerObject ) )
                    // InternalFactory.g:333:5: (lv_duration_5_0= ruleEIntegerObject )
                    {
                    // InternalFactory.g:333:5: (lv_duration_5_0= ruleEIntegerObject )
                    // InternalFactory.g:334:6: lv_duration_5_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getDurationEIntegerObjectParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_duration_5_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_5_0,
                    							"es.unican.ildm.practica3.Factory.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalFactory.g:356:3: ( (otherlv_7= RULE_ID ) )
            // InternalFactory.g:357:4: (otherlv_7= RULE_ID )
            {
            // InternalFactory.g:357:4: (otherlv_7= RULE_ID )
            // InternalFactory.g:358:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getOperatorOperatorCrossReference_5_0());
            				

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            // InternalFactory.g:373:3: ( (otherlv_9= RULE_ID ) )
            // InternalFactory.g:374:4: (otherlv_9= RULE_ID )
            {
            // InternalFactory.g:374:4: (otherlv_9= RULE_ID )
            // InternalFactory.g:375:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getMachineMachineCrossReference_7_0());
            				

            }


            }

            otherlv_10=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleOperator"
    // InternalFactory.g:398:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalFactory.g:398:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalFactory.g:399:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalFactory.g:405:1: ruleOperator returns [EObject current=null] : (otherlv_0= 'operator' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'area' otherlv_3= '=' ( (lv_area_4_0= RULE_STRING ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_area_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalFactory.g:411:2: ( (otherlv_0= 'operator' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'area' otherlv_3= '=' ( (lv_area_4_0= RULE_STRING ) ) )? otherlv_5= ';' ) )
            // InternalFactory.g:412:2: (otherlv_0= 'operator' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'area' otherlv_3= '=' ( (lv_area_4_0= RULE_STRING ) ) )? otherlv_5= ';' )
            {
            // InternalFactory.g:412:2: (otherlv_0= 'operator' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'area' otherlv_3= '=' ( (lv_area_4_0= RULE_STRING ) ) )? otherlv_5= ';' )
            // InternalFactory.g:413:3: otherlv_0= 'operator' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'area' otherlv_3= '=' ( (lv_area_4_0= RULE_STRING ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOperatorAccess().getOperatorKeyword_0());
            		
            // InternalFactory.g:417:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFactory.g:418:4: (lv_name_1_0= ruleEString )
            {
            // InternalFactory.g:418:4: (lv_name_1_0= ruleEString )
            // InternalFactory.g:419:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperatorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperatorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.unican.ildm.practica3.Factory.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFactory.g:436:3: (otherlv_2= 'area' otherlv_3= '=' ( (lv_area_4_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFactory.g:437:4: otherlv_2= 'area' otherlv_3= '=' ( (lv_area_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getOperatorAccess().getAreaKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalFactory.g:445:4: ( (lv_area_4_0= RULE_STRING ) )
                    // InternalFactory.g:446:5: (lv_area_4_0= RULE_STRING )
                    {
                    // InternalFactory.g:446:5: (lv_area_4_0= RULE_STRING )
                    // InternalFactory.g:447:6: lv_area_4_0= RULE_STRING
                    {
                    lv_area_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_area_4_0, grammarAccess.getOperatorAccess().getAreaSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperatorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"area",
                    							lv_area_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOperatorAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleMachine"
    // InternalFactory.g:472:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalFactory.g:472:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalFactory.g:473:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalFactory.g:479:1: ruleMachine returns [EObject current=null] : (otherlv_0= 'machine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'manufacturer' otherlv_3= '=' ( (lv_manufacturer_4_0= RULE_STRING ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_manufacturer_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalFactory.g:485:2: ( (otherlv_0= 'machine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'manufacturer' otherlv_3= '=' ( (lv_manufacturer_4_0= RULE_STRING ) ) )? otherlv_5= ';' ) )
            // InternalFactory.g:486:2: (otherlv_0= 'machine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'manufacturer' otherlv_3= '=' ( (lv_manufacturer_4_0= RULE_STRING ) ) )? otherlv_5= ';' )
            {
            // InternalFactory.g:486:2: (otherlv_0= 'machine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'manufacturer' otherlv_3= '=' ( (lv_manufacturer_4_0= RULE_STRING ) ) )? otherlv_5= ';' )
            // InternalFactory.g:487:3: otherlv_0= 'machine' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'manufacturer' otherlv_3= '=' ( (lv_manufacturer_4_0= RULE_STRING ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getMachineKeyword_0());
            		
            // InternalFactory.g:491:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFactory.g:492:4: (lv_name_1_0= ruleEString )
            {
            // InternalFactory.g:492:4: (lv_name_1_0= ruleEString )
            // InternalFactory.g:493:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMachineAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMachineRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.unican.ildm.practica3.Factory.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFactory.g:510:3: (otherlv_2= 'manufacturer' otherlv_3= '=' ( (lv_manufacturer_4_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFactory.g:511:4: otherlv_2= 'manufacturer' otherlv_3= '=' ( (lv_manufacturer_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getManufacturerKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getMachineAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalFactory.g:519:4: ( (lv_manufacturer_4_0= RULE_STRING ) )
                    // InternalFactory.g:520:5: (lv_manufacturer_4_0= RULE_STRING )
                    {
                    // InternalFactory.g:520:5: (lv_manufacturer_4_0= RULE_STRING )
                    // InternalFactory.g:521:6: lv_manufacturer_4_0= RULE_STRING
                    {
                    lv_manufacturer_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_manufacturer_4_0, grammarAccess.getMachineAccess().getManufacturerSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMachineRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"manufacturer",
                    							lv_manufacturer_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleEString"
    // InternalFactory.g:546:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFactory.g:546:47: (iv_ruleEString= ruleEString EOF )
            // InternalFactory.g:547:2: iv_ruleEString= ruleEString EOF
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
    // InternalFactory.g:553:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFactory.g:559:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFactory.g:560:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFactory.g:560:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalFactory.g:561:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFactory.g:569:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalFactory.g:580:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalFactory.g:580:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalFactory.g:581:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
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
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // InternalFactory.g:587:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalFactory.g:593:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalFactory.g:594:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalFactory.g:594:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalFactory.g:595:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalFactory.g:595:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFactory.g:596:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEIntegerObject"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000A080802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});

}