package es.unican.ildm.practica3.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import es.unican.ildm.practica3.services.FactoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFactoryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'shift'", "'{'", "'date'", "':'", "';'", "'work'", "'}'", "','", "'task'", "'['", "'->'", "']'", "'duration'", "'='", "'operator'", "'area'", "'machine'", "'manufacturer'", "'-'"
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

    	public void setGrammarAccess(FactoryGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleFactory"
    // InternalFactory.g:53:1: entryRuleFactory : ruleFactory EOF ;
    public final void entryRuleFactory() throws RecognitionException {
        try {
            // InternalFactory.g:54:1: ( ruleFactory EOF )
            // InternalFactory.g:55:1: ruleFactory EOF
            {
             before(grammarAccess.getFactoryRule()); 
            pushFollow(FOLLOW_1);
            ruleFactory();

            state._fsp--;

             after(grammarAccess.getFactoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactory"


    // $ANTLR start "ruleFactory"
    // InternalFactory.g:62:1: ruleFactory : ( ( rule__Factory__ElementsAssignment )* ) ;
    public final void ruleFactory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:66:2: ( ( ( rule__Factory__ElementsAssignment )* ) )
            // InternalFactory.g:67:2: ( ( rule__Factory__ElementsAssignment )* )
            {
            // InternalFactory.g:67:2: ( ( rule__Factory__ElementsAssignment )* )
            // InternalFactory.g:68:3: ( rule__Factory__ElementsAssignment )*
            {
             before(grammarAccess.getFactoryAccess().getElementsAssignment()); 
            // InternalFactory.g:69:3: ( rule__Factory__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==19||LA1_0==25||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFactory.g:69:4: rule__Factory__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Factory__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getFactoryAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactory"


    // $ANTLR start "entryRuleElement"
    // InternalFactory.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalFactory.g:79:1: ( ruleElement EOF )
            // InternalFactory.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalFactory.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalFactory.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalFactory.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalFactory.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalFactory.g:94:3: ( rule__Element__Alternatives )
            // InternalFactory.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleShift"
    // InternalFactory.g:103:1: entryRuleShift : ruleShift EOF ;
    public final void entryRuleShift() throws RecognitionException {
        try {
            // InternalFactory.g:104:1: ( ruleShift EOF )
            // InternalFactory.g:105:1: ruleShift EOF
            {
             before(grammarAccess.getShiftRule()); 
            pushFollow(FOLLOW_1);
            ruleShift();

            state._fsp--;

             after(grammarAccess.getShiftRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShift"


    // $ANTLR start "ruleShift"
    // InternalFactory.g:112:1: ruleShift : ( ( rule__Shift__Group__0 ) ) ;
    public final void ruleShift() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:116:2: ( ( ( rule__Shift__Group__0 ) ) )
            // InternalFactory.g:117:2: ( ( rule__Shift__Group__0 ) )
            {
            // InternalFactory.g:117:2: ( ( rule__Shift__Group__0 ) )
            // InternalFactory.g:118:3: ( rule__Shift__Group__0 )
            {
             before(grammarAccess.getShiftAccess().getGroup()); 
            // InternalFactory.g:119:3: ( rule__Shift__Group__0 )
            // InternalFactory.g:119:4: rule__Shift__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Shift__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShiftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShift"


    // $ANTLR start "entryRuleTask"
    // InternalFactory.g:128:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalFactory.g:129:1: ( ruleTask EOF )
            // InternalFactory.g:130:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalFactory.g:137:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:141:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalFactory.g:142:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalFactory.g:142:2: ( ( rule__Task__Group__0 ) )
            // InternalFactory.g:143:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalFactory.g:144:3: ( rule__Task__Group__0 )
            // InternalFactory.g:144:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleOperator"
    // InternalFactory.g:153:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalFactory.g:154:1: ( ruleOperator EOF )
            // InternalFactory.g:155:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalFactory.g:162:1: ruleOperator : ( ( rule__Operator__Group__0 ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:166:2: ( ( ( rule__Operator__Group__0 ) ) )
            // InternalFactory.g:167:2: ( ( rule__Operator__Group__0 ) )
            {
            // InternalFactory.g:167:2: ( ( rule__Operator__Group__0 ) )
            // InternalFactory.g:168:3: ( rule__Operator__Group__0 )
            {
             before(grammarAccess.getOperatorAccess().getGroup()); 
            // InternalFactory.g:169:3: ( rule__Operator__Group__0 )
            // InternalFactory.g:169:4: rule__Operator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleMachine"
    // InternalFactory.g:178:1: entryRuleMachine : ruleMachine EOF ;
    public final void entryRuleMachine() throws RecognitionException {
        try {
            // InternalFactory.g:179:1: ( ruleMachine EOF )
            // InternalFactory.g:180:1: ruleMachine EOF
            {
             before(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getMachineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalFactory.g:187:1: ruleMachine : ( ( rule__Machine__Group__0 ) ) ;
    public final void ruleMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:191:2: ( ( ( rule__Machine__Group__0 ) ) )
            // InternalFactory.g:192:2: ( ( rule__Machine__Group__0 ) )
            {
            // InternalFactory.g:192:2: ( ( rule__Machine__Group__0 ) )
            // InternalFactory.g:193:3: ( rule__Machine__Group__0 )
            {
             before(grammarAccess.getMachineAccess().getGroup()); 
            // InternalFactory.g:194:3: ( rule__Machine__Group__0 )
            // InternalFactory.g:194:4: rule__Machine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleEString"
    // InternalFactory.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalFactory.g:204:1: ( ruleEString EOF )
            // InternalFactory.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFactory.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalFactory.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalFactory.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalFactory.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalFactory.g:219:3: ( rule__EString__Alternatives )
            // InternalFactory.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalFactory.g:228:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // InternalFactory.g:229:1: ( ruleEIntegerObject EOF )
            // InternalFactory.g:230:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // InternalFactory.g:237:1: ruleEIntegerObject : ( ( rule__EIntegerObject__Group__0 ) ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:241:2: ( ( ( rule__EIntegerObject__Group__0 ) ) )
            // InternalFactory.g:242:2: ( ( rule__EIntegerObject__Group__0 ) )
            {
            // InternalFactory.g:242:2: ( ( rule__EIntegerObject__Group__0 ) )
            // InternalFactory.g:243:3: ( rule__EIntegerObject__Group__0 )
            {
             before(grammarAccess.getEIntegerObjectAccess().getGroup()); 
            // InternalFactory.g:244:3: ( rule__EIntegerObject__Group__0 )
            // InternalFactory.g:244:4: rule__EIntegerObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntegerObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalFactory.g:252:1: rule__Element__Alternatives : ( ( ruleShift ) | ( ruleTask ) | ( ruleOperator ) | ( ruleMachine ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:256:1: ( ( ruleShift ) | ( ruleTask ) | ( ruleOperator ) | ( ruleMachine ) )
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
                    // InternalFactory.g:257:2: ( ruleShift )
                    {
                    // InternalFactory.g:257:2: ( ruleShift )
                    // InternalFactory.g:258:3: ruleShift
                    {
                     before(grammarAccess.getElementAccess().getShiftParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleShift();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getShiftParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFactory.g:263:2: ( ruleTask )
                    {
                    // InternalFactory.g:263:2: ( ruleTask )
                    // InternalFactory.g:264:3: ruleTask
                    {
                     before(grammarAccess.getElementAccess().getTaskParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTask();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTaskParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFactory.g:269:2: ( ruleOperator )
                    {
                    // InternalFactory.g:269:2: ( ruleOperator )
                    // InternalFactory.g:270:3: ruleOperator
                    {
                     before(grammarAccess.getElementAccess().getOperatorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOperator();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getOperatorParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFactory.g:275:2: ( ruleMachine )
                    {
                    // InternalFactory.g:275:2: ( ruleMachine )
                    // InternalFactory.g:276:3: ruleMachine
                    {
                     before(grammarAccess.getElementAccess().getMachineParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMachine();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMachineParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalFactory.g:285:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:289:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFactory.g:290:2: ( RULE_STRING )
                    {
                    // InternalFactory.g:290:2: ( RULE_STRING )
                    // InternalFactory.g:291:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFactory.g:296:2: ( RULE_ID )
                    {
                    // InternalFactory.g:296:2: ( RULE_ID )
                    // InternalFactory.g:297:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Shift__Group__0"
    // InternalFactory.g:306:1: rule__Shift__Group__0 : rule__Shift__Group__0__Impl rule__Shift__Group__1 ;
    public final void rule__Shift__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:310:1: ( rule__Shift__Group__0__Impl rule__Shift__Group__1 )
            // InternalFactory.g:311:2: rule__Shift__Group__0__Impl rule__Shift__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Shift__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shift__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__0"


    // $ANTLR start "rule__Shift__Group__0__Impl"
    // InternalFactory.g:318:1: rule__Shift__Group__0__Impl : ( 'shift' ) ;
    public final void rule__Shift__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:322:1: ( ( 'shift' ) )
            // InternalFactory.g:323:1: ( 'shift' )
            {
            // InternalFactory.g:323:1: ( 'shift' )
            // InternalFactory.g:324:2: 'shift'
            {
             before(grammarAccess.getShiftAccess().getShiftKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getShiftAccess().getShiftKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__0__Impl"


    // $ANTLR start "rule__Shift__Group__1"
    // InternalFactory.g:333:1: rule__Shift__Group__1 : rule__Shift__Group__1__Impl rule__Shift__Group__2 ;
    public final void rule__Shift__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:337:1: ( rule__Shift__Group__1__Impl rule__Shift__Group__2 )
            // InternalFactory.g:338:2: rule__Shift__Group__1__Impl rule__Shift__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Shift__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shift__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__1"


    // $ANTLR start "rule__Shift__Group__1__Impl"
    // InternalFactory.g:345:1: rule__Shift__Group__1__Impl : ( ( rule__Shift__NameAssignment_1 ) ) ;
    public final void rule__Shift__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:349:1: ( ( ( rule__Shift__NameAssignment_1 ) ) )
            // InternalFactory.g:350:1: ( ( rule__Shift__NameAssignment_1 ) )
            {
            // InternalFactory.g:350:1: ( ( rule__Shift__NameAssignment_1 ) )
            // InternalFactory.g:351:2: ( rule__Shift__NameAssignment_1 )
            {
             before(grammarAccess.getShiftAccess().getNameAssignment_1()); 
            // InternalFactory.g:352:2: ( rule__Shift__NameAssignment_1 )
            // InternalFactory.g:352:3: rule__Shift__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Shift__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShiftAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__1__Impl"


    // $ANTLR start "rule__Shift__Group__2"
    // InternalFactory.g:360:1: rule__Shift__Group__2 : rule__Shift__Group__2__Impl rule__Shift__Group__3 ;
    public final void rule__Shift__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:364:1: ( rule__Shift__Group__2__Impl rule__Shift__Group__3 )
            // InternalFactory.g:365:2: rule__Shift__Group__2__Impl rule__Shift__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Shift__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shift__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__2"


    // $ANTLR start "rule__Shift__Group__2__Impl"
    // InternalFactory.g:372:1: rule__Shift__Group__2__Impl : ( '{' ) ;
    public final void rule__Shift__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:376:1: ( ( '{' ) )
            // InternalFactory.g:377:1: ( '{' )
            {
            // InternalFactory.g:377:1: ( '{' )
            // InternalFactory.g:378:2: '{'
            {
             before(grammarAccess.getShiftAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getShiftAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__2__Impl"


    // $ANTLR start "rule__Shift__Group__3"
    // InternalFactory.g:387:1: rule__Shift__Group__3 : rule__Shift__Group__3__Impl rule__Shift__Group__4 ;
    public final void rule__Shift__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:391:1: ( rule__Shift__Group__3__Impl rule__Shift__Group__4 )
            // InternalFactory.g:392:2: rule__Shift__Group__3__Impl rule__Shift__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Shift__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shift__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__3"


    // $ANTLR start "rule__Shift__Group__3__Impl"
    // InternalFactory.g:399:1: rule__Shift__Group__3__Impl : ( 'date' ) ;
    public final void rule__Shift__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:403:1: ( ( 'date' ) )
            // InternalFactory.g:404:1: ( 'date' )
            {
            // InternalFactory.g:404:1: ( 'date' )
            // InternalFactory.g:405:2: 'date'
            {
             before(grammarAccess.getShiftAccess().getDateKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getShiftAccess().getDateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__3__Impl"


    // $ANTLR start "rule__Shift__Group__4"
    // InternalFactory.g:414:1: rule__Shift__Group__4 : rule__Shift__Group__4__Impl rule__Shift__Group__5 ;
    public final void rule__Shift__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:418:1: ( rule__Shift__Group__4__Impl rule__Shift__Group__5 )
            // InternalFactory.g:419:2: rule__Shift__Group__4__Impl rule__Shift__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Shift__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shift__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__4"


    // $ANTLR start "rule__Shift__Group__4__Impl"
    // InternalFactory.g:426:1: rule__Shift__Group__4__Impl : ( ':' ) ;
    public final void rule__Shift__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:430:1: ( ( ':' ) )
            // InternalFactory.g:431:1: ( ':' )
            {
            // InternalFactory.g:431:1: ( ':' )
            // InternalFactory.g:432:2: ':'
            {
             before(grammarAccess.getShiftAccess().getColonKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getShiftAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__4__Impl"


    // $ANTLR start "rule__Shift__Group__5"
    // InternalFactory.g:441:1: rule__Shift__Group__5 : rule__Shift__Group__5__Impl rule__Shift__Group__6 ;
    public final void rule__Shift__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:445:1: ( rule__Shift__Group__5__Impl rule__Shift__Group__6 )
            // InternalFactory.g:446:2: rule__Shift__Group__5__Impl rule__Shift__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Shift__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shift__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__5"


    // $ANTLR start "rule__Shift__Group__5__Impl"
    // InternalFactory.g:453:1: rule__Shift__Group__5__Impl : ( ( rule__Shift__DateAssignment_5 ) ) ;
    public final void rule__Shift__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:457:1: ( ( ( rule__Shift__DateAssignment_5 ) ) )
            // InternalFactory.g:458:1: ( ( rule__Shift__DateAssignment_5 ) )
            {
            // InternalFactory.g:458:1: ( ( rule__Shift__DateAssignment_5 ) )
            // InternalFactory.g:459:2: ( rule__Shift__DateAssignment_5 )
            {
             before(grammarAccess.getShiftAccess().getDateAssignment_5()); 
            // InternalFactory.g:460:2: ( rule__Shift__DateAssignment_5 )
            // InternalFactory.g:460:3: rule__Shift__DateAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Shift__DateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getShiftAccess().getDateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__5__Impl"


    // $ANTLR start "rule__Shift__Group__6"
    // InternalFactory.g:468:1: rule__Shift__Group__6 : rule__Shift__Group__6__Impl rule__Shift__Group__7 ;
    public final void rule__Shift__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:472:1: ( rule__Shift__Group__6__Impl rule__Shift__Group__7 )
            // InternalFactory.g:473:2: rule__Shift__Group__6__Impl rule__Shift__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Shift__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shift__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__6"


    // $ANTLR start "rule__Shift__Group__6__Impl"
    // InternalFactory.g:480:1: rule__Shift__Group__6__Impl : ( ';' ) ;
    public final void rule__Shift__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:484:1: ( ( ';' ) )
            // InternalFactory.g:485:1: ( ';' )
            {
            // InternalFactory.g:485:1: ( ';' )
            // InternalFactory.g:486:2: ';'
            {
             before(grammarAccess.getShiftAccess().getSemicolonKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getShiftAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__6__Impl"


    // $ANTLR start "rule__Shift__Group__7"
    // InternalFactory.g:495:1: rule__Shift__Group__7 : rule__Shift__Group__7__Impl rule__Shift__Group__8 ;
    public final void rule__Shift__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:499:1: ( rule__Shift__Group__7__Impl rule__Shift__Group__8 )
            // InternalFactory.g:500:2: rule__Shift__Group__7__Impl rule__Shift__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Shift__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shift__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__7"


    // $ANTLR start "rule__Shift__Group__7__Impl"
    // InternalFactory.g:507:1: rule__Shift__Group__7__Impl : ( 'work' ) ;
    public final void rule__Shift__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:511:1: ( ( 'work' ) )
            // InternalFactory.g:512:1: ( 'work' )
            {
            // InternalFactory.g:512:1: ( 'work' )
            // InternalFactory.g:513:2: 'work'
            {
             before(grammarAccess.getShiftAccess().getWorkKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getShiftAccess().getWorkKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__7__Impl"


    // $ANTLR start "rule__Shift__Group__8"
    // InternalFactory.g:522:1: rule__Shift__Group__8 : rule__Shift__Group__8__Impl rule__Shift__Group__9 ;
    public final void rule__Shift__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:526:1: ( rule__Shift__Group__8__Impl rule__Shift__Group__9 )
            // InternalFactory.g:527:2: rule__Shift__Group__8__Impl rule__Shift__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Shift__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shift__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__8"


    // $ANTLR start "rule__Shift__Group__8__Impl"
    // InternalFactory.g:534:1: rule__Shift__Group__8__Impl : ( ':' ) ;
    public final void rule__Shift__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:538:1: ( ( ':' ) )
            // InternalFactory.g:539:1: ( ':' )
            {
            // InternalFactory.g:539:1: ( ':' )
            // InternalFactory.g:540:2: ':'
            {
             before(grammarAccess.getShiftAccess().getColonKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getShiftAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__8__Impl"


    // $ANTLR start "rule__Shift__Group__9"
    // InternalFactory.g:549:1: rule__Shift__Group__9 : rule__Shift__Group__9__Impl rule__Shift__Group__10 ;
    public final void rule__Shift__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:553:1: ( rule__Shift__Group__9__Impl rule__Shift__Group__10 )
            // InternalFactory.g:554:2: rule__Shift__Group__9__Impl rule__Shift__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Shift__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shift__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__9"


    // $ANTLR start "rule__Shift__Group__9__Impl"
    // InternalFactory.g:561:1: rule__Shift__Group__9__Impl : ( ( rule__Shift__WorkAssignment_9 ) ) ;
    public final void rule__Shift__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:565:1: ( ( ( rule__Shift__WorkAssignment_9 ) ) )
            // InternalFactory.g:566:1: ( ( rule__Shift__WorkAssignment_9 ) )
            {
            // InternalFactory.g:566:1: ( ( rule__Shift__WorkAssignment_9 ) )
            // InternalFactory.g:567:2: ( rule__Shift__WorkAssignment_9 )
            {
             before(grammarAccess.getShiftAccess().getWorkAssignment_9()); 
            // InternalFactory.g:568:2: ( rule__Shift__WorkAssignment_9 )
            // InternalFactory.g:568:3: rule__Shift__WorkAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Shift__WorkAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getShiftAccess().getWorkAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__9__Impl"


    // $ANTLR start "rule__Shift__Group__10"
    // InternalFactory.g:576:1: rule__Shift__Group__10 : rule__Shift__Group__10__Impl rule__Shift__Group__11 ;
    public final void rule__Shift__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:580:1: ( rule__Shift__Group__10__Impl rule__Shift__Group__11 )
            // InternalFactory.g:581:2: rule__Shift__Group__10__Impl rule__Shift__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Shift__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shift__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__10"


    // $ANTLR start "rule__Shift__Group__10__Impl"
    // InternalFactory.g:588:1: rule__Shift__Group__10__Impl : ( ( rule__Shift__Group_10__0 )* ) ;
    public final void rule__Shift__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:592:1: ( ( ( rule__Shift__Group_10__0 )* ) )
            // InternalFactory.g:593:1: ( ( rule__Shift__Group_10__0 )* )
            {
            // InternalFactory.g:593:1: ( ( rule__Shift__Group_10__0 )* )
            // InternalFactory.g:594:2: ( rule__Shift__Group_10__0 )*
            {
             before(grammarAccess.getShiftAccess().getGroup_10()); 
            // InternalFactory.g:595:2: ( rule__Shift__Group_10__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFactory.g:595:3: rule__Shift__Group_10__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Shift__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getShiftAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__10__Impl"


    // $ANTLR start "rule__Shift__Group__11"
    // InternalFactory.g:603:1: rule__Shift__Group__11 : rule__Shift__Group__11__Impl rule__Shift__Group__12 ;
    public final void rule__Shift__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:607:1: ( rule__Shift__Group__11__Impl rule__Shift__Group__12 )
            // InternalFactory.g:608:2: rule__Shift__Group__11__Impl rule__Shift__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__Shift__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shift__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__11"


    // $ANTLR start "rule__Shift__Group__11__Impl"
    // InternalFactory.g:615:1: rule__Shift__Group__11__Impl : ( ';' ) ;
    public final void rule__Shift__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:619:1: ( ( ';' ) )
            // InternalFactory.g:620:1: ( ';' )
            {
            // InternalFactory.g:620:1: ( ';' )
            // InternalFactory.g:621:2: ';'
            {
             before(grammarAccess.getShiftAccess().getSemicolonKeyword_11()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getShiftAccess().getSemicolonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__11__Impl"


    // $ANTLR start "rule__Shift__Group__12"
    // InternalFactory.g:630:1: rule__Shift__Group__12 : rule__Shift__Group__12__Impl ;
    public final void rule__Shift__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:634:1: ( rule__Shift__Group__12__Impl )
            // InternalFactory.g:635:2: rule__Shift__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shift__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__12"


    // $ANTLR start "rule__Shift__Group__12__Impl"
    // InternalFactory.g:641:1: rule__Shift__Group__12__Impl : ( '}' ) ;
    public final void rule__Shift__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:645:1: ( ( '}' ) )
            // InternalFactory.g:646:1: ( '}' )
            {
            // InternalFactory.g:646:1: ( '}' )
            // InternalFactory.g:647:2: '}'
            {
             before(grammarAccess.getShiftAccess().getRightCurlyBracketKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getShiftAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group__12__Impl"


    // $ANTLR start "rule__Shift__Group_10__0"
    // InternalFactory.g:657:1: rule__Shift__Group_10__0 : rule__Shift__Group_10__0__Impl rule__Shift__Group_10__1 ;
    public final void rule__Shift__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:661:1: ( rule__Shift__Group_10__0__Impl rule__Shift__Group_10__1 )
            // InternalFactory.g:662:2: rule__Shift__Group_10__0__Impl rule__Shift__Group_10__1
            {
            pushFollow(FOLLOW_11);
            rule__Shift__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shift__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group_10__0"


    // $ANTLR start "rule__Shift__Group_10__0__Impl"
    // InternalFactory.g:669:1: rule__Shift__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Shift__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:673:1: ( ( ',' ) )
            // InternalFactory.g:674:1: ( ',' )
            {
            // InternalFactory.g:674:1: ( ',' )
            // InternalFactory.g:675:2: ','
            {
             before(grammarAccess.getShiftAccess().getCommaKeyword_10_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getShiftAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group_10__0__Impl"


    // $ANTLR start "rule__Shift__Group_10__1"
    // InternalFactory.g:684:1: rule__Shift__Group_10__1 : rule__Shift__Group_10__1__Impl ;
    public final void rule__Shift__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:688:1: ( rule__Shift__Group_10__1__Impl )
            // InternalFactory.g:689:2: rule__Shift__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shift__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group_10__1"


    // $ANTLR start "rule__Shift__Group_10__1__Impl"
    // InternalFactory.g:695:1: rule__Shift__Group_10__1__Impl : ( ( rule__Shift__WorkAssignment_10_1 ) ) ;
    public final void rule__Shift__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:699:1: ( ( ( rule__Shift__WorkAssignment_10_1 ) ) )
            // InternalFactory.g:700:1: ( ( rule__Shift__WorkAssignment_10_1 ) )
            {
            // InternalFactory.g:700:1: ( ( rule__Shift__WorkAssignment_10_1 ) )
            // InternalFactory.g:701:2: ( rule__Shift__WorkAssignment_10_1 )
            {
             before(grammarAccess.getShiftAccess().getWorkAssignment_10_1()); 
            // InternalFactory.g:702:2: ( rule__Shift__WorkAssignment_10_1 )
            // InternalFactory.g:702:3: rule__Shift__WorkAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Shift__WorkAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getShiftAccess().getWorkAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__Group_10__1__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalFactory.g:711:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:715:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalFactory.g:716:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalFactory.g:723:1: rule__Task__Group__0__Impl : ( () ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:727:1: ( ( () ) )
            // InternalFactory.g:728:1: ( () )
            {
            // InternalFactory.g:728:1: ( () )
            // InternalFactory.g:729:2: ()
            {
             before(grammarAccess.getTaskAccess().getTaskAction_0()); 
            // InternalFactory.g:730:2: ()
            // InternalFactory.g:730:3: 
            {
            }

             after(grammarAccess.getTaskAccess().getTaskAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalFactory.g:738:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:742:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalFactory.g:743:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalFactory.g:750:1: rule__Task__Group__1__Impl : ( 'task' ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:754:1: ( ( 'task' ) )
            // InternalFactory.g:755:1: ( 'task' )
            {
            // InternalFactory.g:755:1: ( 'task' )
            // InternalFactory.g:756:2: 'task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalFactory.g:765:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:769:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalFactory.g:770:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalFactory.g:777:1: rule__Task__Group__2__Impl : ( ( rule__Task__NameAssignment_2 ) ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:781:1: ( ( ( rule__Task__NameAssignment_2 ) ) )
            // InternalFactory.g:782:1: ( ( rule__Task__NameAssignment_2 ) )
            {
            // InternalFactory.g:782:1: ( ( rule__Task__NameAssignment_2 ) )
            // InternalFactory.g:783:2: ( rule__Task__NameAssignment_2 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_2()); 
            // InternalFactory.g:784:2: ( rule__Task__NameAssignment_2 )
            // InternalFactory.g:784:3: rule__Task__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalFactory.g:792:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:796:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalFactory.g:797:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalFactory.g:804:1: rule__Task__Group__3__Impl : ( ( rule__Task__Group_3__0 )? ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:808:1: ( ( ( rule__Task__Group_3__0 )? ) )
            // InternalFactory.g:809:1: ( ( rule__Task__Group_3__0 )? )
            {
            // InternalFactory.g:809:1: ( ( rule__Task__Group_3__0 )? )
            // InternalFactory.g:810:2: ( rule__Task__Group_3__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_3()); 
            // InternalFactory.g:811:2: ( rule__Task__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFactory.g:811:3: rule__Task__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalFactory.g:819:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:823:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalFactory.g:824:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalFactory.g:831:1: rule__Task__Group__4__Impl : ( '[' ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:835:1: ( ( '[' ) )
            // InternalFactory.g:836:1: ( '[' )
            {
            // InternalFactory.g:836:1: ( '[' )
            // InternalFactory.g:837:2: '['
            {
             before(grammarAccess.getTaskAccess().getLeftSquareBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalFactory.g:846:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:850:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalFactory.g:851:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // InternalFactory.g:858:1: rule__Task__Group__5__Impl : ( ( rule__Task__OperatorAssignment_5 ) ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:862:1: ( ( ( rule__Task__OperatorAssignment_5 ) ) )
            // InternalFactory.g:863:1: ( ( rule__Task__OperatorAssignment_5 ) )
            {
            // InternalFactory.g:863:1: ( ( rule__Task__OperatorAssignment_5 ) )
            // InternalFactory.g:864:2: ( rule__Task__OperatorAssignment_5 )
            {
             before(grammarAccess.getTaskAccess().getOperatorAssignment_5()); 
            // InternalFactory.g:865:2: ( rule__Task__OperatorAssignment_5 )
            // InternalFactory.g:865:3: rule__Task__OperatorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Task__OperatorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getOperatorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalFactory.g:873:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:877:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalFactory.g:878:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // InternalFactory.g:885:1: rule__Task__Group__6__Impl : ( '->' ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:889:1: ( ( '->' ) )
            // InternalFactory.g:890:1: ( '->' )
            {
            // InternalFactory.g:890:1: ( '->' )
            // InternalFactory.g:891:2: '->'
            {
             before(grammarAccess.getTaskAccess().getHyphenMinusGreaterThanSignKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getHyphenMinusGreaterThanSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group__7"
    // InternalFactory.g:900:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:904:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalFactory.g:905:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Task__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__7"


    // $ANTLR start "rule__Task__Group__7__Impl"
    // InternalFactory.g:912:1: rule__Task__Group__7__Impl : ( ( rule__Task__MachineAssignment_7 ) ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:916:1: ( ( ( rule__Task__MachineAssignment_7 ) ) )
            // InternalFactory.g:917:1: ( ( rule__Task__MachineAssignment_7 ) )
            {
            // InternalFactory.g:917:1: ( ( rule__Task__MachineAssignment_7 ) )
            // InternalFactory.g:918:2: ( rule__Task__MachineAssignment_7 )
            {
             before(grammarAccess.getTaskAccess().getMachineAssignment_7()); 
            // InternalFactory.g:919:2: ( rule__Task__MachineAssignment_7 )
            // InternalFactory.g:919:3: rule__Task__MachineAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Task__MachineAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getMachineAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__7__Impl"


    // $ANTLR start "rule__Task__Group__8"
    // InternalFactory.g:927:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:931:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalFactory.g:932:2: rule__Task__Group__8__Impl rule__Task__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__8"


    // $ANTLR start "rule__Task__Group__8__Impl"
    // InternalFactory.g:939:1: rule__Task__Group__8__Impl : ( ']' ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:943:1: ( ( ']' ) )
            // InternalFactory.g:944:1: ( ']' )
            {
            // InternalFactory.g:944:1: ( ']' )
            // InternalFactory.g:945:2: ']'
            {
             before(grammarAccess.getTaskAccess().getRightSquareBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getRightSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__8__Impl"


    // $ANTLR start "rule__Task__Group__9"
    // InternalFactory.g:954:1: rule__Task__Group__9 : rule__Task__Group__9__Impl ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:958:1: ( rule__Task__Group__9__Impl )
            // InternalFactory.g:959:2: rule__Task__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__9"


    // $ANTLR start "rule__Task__Group__9__Impl"
    // InternalFactory.g:965:1: rule__Task__Group__9__Impl : ( ';' ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:969:1: ( ( ';' ) )
            // InternalFactory.g:970:1: ( ';' )
            {
            // InternalFactory.g:970:1: ( ';' )
            // InternalFactory.g:971:2: ';'
            {
             before(grammarAccess.getTaskAccess().getSemicolonKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__9__Impl"


    // $ANTLR start "rule__Task__Group_3__0"
    // InternalFactory.g:981:1: rule__Task__Group_3__0 : rule__Task__Group_3__0__Impl rule__Task__Group_3__1 ;
    public final void rule__Task__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:985:1: ( rule__Task__Group_3__0__Impl rule__Task__Group_3__1 )
            // InternalFactory.g:986:2: rule__Task__Group_3__0__Impl rule__Task__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__Task__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__0"


    // $ANTLR start "rule__Task__Group_3__0__Impl"
    // InternalFactory.g:993:1: rule__Task__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__Task__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:997:1: ( ( 'duration' ) )
            // InternalFactory.g:998:1: ( 'duration' )
            {
            // InternalFactory.g:998:1: ( 'duration' )
            // InternalFactory.g:999:2: 'duration'
            {
             before(grammarAccess.getTaskAccess().getDurationKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDurationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__0__Impl"


    // $ANTLR start "rule__Task__Group_3__1"
    // InternalFactory.g:1008:1: rule__Task__Group_3__1 : rule__Task__Group_3__1__Impl rule__Task__Group_3__2 ;
    public final void rule__Task__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1012:1: ( rule__Task__Group_3__1__Impl rule__Task__Group_3__2 )
            // InternalFactory.g:1013:2: rule__Task__Group_3__1__Impl rule__Task__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__Task__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__1"


    // $ANTLR start "rule__Task__Group_3__1__Impl"
    // InternalFactory.g:1020:1: rule__Task__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Task__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1024:1: ( ( '=' ) )
            // InternalFactory.g:1025:1: ( '=' )
            {
            // InternalFactory.g:1025:1: ( '=' )
            // InternalFactory.g:1026:2: '='
            {
             before(grammarAccess.getTaskAccess().getEqualsSignKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__1__Impl"


    // $ANTLR start "rule__Task__Group_3__2"
    // InternalFactory.g:1035:1: rule__Task__Group_3__2 : rule__Task__Group_3__2__Impl ;
    public final void rule__Task__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1039:1: ( rule__Task__Group_3__2__Impl )
            // InternalFactory.g:1040:2: rule__Task__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__2"


    // $ANTLR start "rule__Task__Group_3__2__Impl"
    // InternalFactory.g:1046:1: rule__Task__Group_3__2__Impl : ( ( rule__Task__DurationAssignment_3_2 ) ) ;
    public final void rule__Task__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1050:1: ( ( ( rule__Task__DurationAssignment_3_2 ) ) )
            // InternalFactory.g:1051:1: ( ( rule__Task__DurationAssignment_3_2 ) )
            {
            // InternalFactory.g:1051:1: ( ( rule__Task__DurationAssignment_3_2 ) )
            // InternalFactory.g:1052:2: ( rule__Task__DurationAssignment_3_2 )
            {
             before(grammarAccess.getTaskAccess().getDurationAssignment_3_2()); 
            // InternalFactory.g:1053:2: ( rule__Task__DurationAssignment_3_2 )
            // InternalFactory.g:1053:3: rule__Task__DurationAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__DurationAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDurationAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__2__Impl"


    // $ANTLR start "rule__Operator__Group__0"
    // InternalFactory.g:1062:1: rule__Operator__Group__0 : rule__Operator__Group__0__Impl rule__Operator__Group__1 ;
    public final void rule__Operator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1066:1: ( rule__Operator__Group__0__Impl rule__Operator__Group__1 )
            // InternalFactory.g:1067:2: rule__Operator__Group__0__Impl rule__Operator__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Operator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__0"


    // $ANTLR start "rule__Operator__Group__0__Impl"
    // InternalFactory.g:1074:1: rule__Operator__Group__0__Impl : ( 'operator' ) ;
    public final void rule__Operator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1078:1: ( ( 'operator' ) )
            // InternalFactory.g:1079:1: ( 'operator' )
            {
            // InternalFactory.g:1079:1: ( 'operator' )
            // InternalFactory.g:1080:2: 'operator'
            {
             before(grammarAccess.getOperatorAccess().getOperatorKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getOperatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__0__Impl"


    // $ANTLR start "rule__Operator__Group__1"
    // InternalFactory.g:1089:1: rule__Operator__Group__1 : rule__Operator__Group__1__Impl rule__Operator__Group__2 ;
    public final void rule__Operator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1093:1: ( rule__Operator__Group__1__Impl rule__Operator__Group__2 )
            // InternalFactory.g:1094:2: rule__Operator__Group__1__Impl rule__Operator__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Operator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__1"


    // $ANTLR start "rule__Operator__Group__1__Impl"
    // InternalFactory.g:1101:1: rule__Operator__Group__1__Impl : ( ( rule__Operator__NameAssignment_1 ) ) ;
    public final void rule__Operator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1105:1: ( ( ( rule__Operator__NameAssignment_1 ) ) )
            // InternalFactory.g:1106:1: ( ( rule__Operator__NameAssignment_1 ) )
            {
            // InternalFactory.g:1106:1: ( ( rule__Operator__NameAssignment_1 ) )
            // InternalFactory.g:1107:2: ( rule__Operator__NameAssignment_1 )
            {
             before(grammarAccess.getOperatorAccess().getNameAssignment_1()); 
            // InternalFactory.g:1108:2: ( rule__Operator__NameAssignment_1 )
            // InternalFactory.g:1108:3: rule__Operator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__1__Impl"


    // $ANTLR start "rule__Operator__Group__2"
    // InternalFactory.g:1116:1: rule__Operator__Group__2 : rule__Operator__Group__2__Impl rule__Operator__Group__3 ;
    public final void rule__Operator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1120:1: ( rule__Operator__Group__2__Impl rule__Operator__Group__3 )
            // InternalFactory.g:1121:2: rule__Operator__Group__2__Impl rule__Operator__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Operator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__2"


    // $ANTLR start "rule__Operator__Group__2__Impl"
    // InternalFactory.g:1128:1: rule__Operator__Group__2__Impl : ( ( rule__Operator__Group_2__0 )? ) ;
    public final void rule__Operator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1132:1: ( ( ( rule__Operator__Group_2__0 )? ) )
            // InternalFactory.g:1133:1: ( ( rule__Operator__Group_2__0 )? )
            {
            // InternalFactory.g:1133:1: ( ( rule__Operator__Group_2__0 )? )
            // InternalFactory.g:1134:2: ( rule__Operator__Group_2__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_2()); 
            // InternalFactory.g:1135:2: ( rule__Operator__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFactory.g:1135:3: rule__Operator__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperatorAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__2__Impl"


    // $ANTLR start "rule__Operator__Group__3"
    // InternalFactory.g:1143:1: rule__Operator__Group__3 : rule__Operator__Group__3__Impl ;
    public final void rule__Operator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1147:1: ( rule__Operator__Group__3__Impl )
            // InternalFactory.g:1148:2: rule__Operator__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__3"


    // $ANTLR start "rule__Operator__Group__3__Impl"
    // InternalFactory.g:1154:1: rule__Operator__Group__3__Impl : ( ';' ) ;
    public final void rule__Operator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1158:1: ( ( ';' ) )
            // InternalFactory.g:1159:1: ( ';' )
            {
            // InternalFactory.g:1159:1: ( ';' )
            // InternalFactory.g:1160:2: ';'
            {
             before(grammarAccess.getOperatorAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__3__Impl"


    // $ANTLR start "rule__Operator__Group_2__0"
    // InternalFactory.g:1170:1: rule__Operator__Group_2__0 : rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 ;
    public final void rule__Operator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1174:1: ( rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 )
            // InternalFactory.g:1175:2: rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Operator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__0"


    // $ANTLR start "rule__Operator__Group_2__0__Impl"
    // InternalFactory.g:1182:1: rule__Operator__Group_2__0__Impl : ( 'area' ) ;
    public final void rule__Operator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1186:1: ( ( 'area' ) )
            // InternalFactory.g:1187:1: ( 'area' )
            {
            // InternalFactory.g:1187:1: ( 'area' )
            // InternalFactory.g:1188:2: 'area'
            {
             before(grammarAccess.getOperatorAccess().getAreaKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getAreaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__0__Impl"


    // $ANTLR start "rule__Operator__Group_2__1"
    // InternalFactory.g:1197:1: rule__Operator__Group_2__1 : rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2 ;
    public final void rule__Operator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1201:1: ( rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2 )
            // InternalFactory.g:1202:2: rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__Operator__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__1"


    // $ANTLR start "rule__Operator__Group_2__1__Impl"
    // InternalFactory.g:1209:1: rule__Operator__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Operator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1213:1: ( ( '=' ) )
            // InternalFactory.g:1214:1: ( '=' )
            {
            // InternalFactory.g:1214:1: ( '=' )
            // InternalFactory.g:1215:2: '='
            {
             before(grammarAccess.getOperatorAccess().getEqualsSignKeyword_2_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__1__Impl"


    // $ANTLR start "rule__Operator__Group_2__2"
    // InternalFactory.g:1224:1: rule__Operator__Group_2__2 : rule__Operator__Group_2__2__Impl ;
    public final void rule__Operator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1228:1: ( rule__Operator__Group_2__2__Impl )
            // InternalFactory.g:1229:2: rule__Operator__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__2"


    // $ANTLR start "rule__Operator__Group_2__2__Impl"
    // InternalFactory.g:1235:1: rule__Operator__Group_2__2__Impl : ( ( rule__Operator__AreaAssignment_2_2 ) ) ;
    public final void rule__Operator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1239:1: ( ( ( rule__Operator__AreaAssignment_2_2 ) ) )
            // InternalFactory.g:1240:1: ( ( rule__Operator__AreaAssignment_2_2 ) )
            {
            // InternalFactory.g:1240:1: ( ( rule__Operator__AreaAssignment_2_2 ) )
            // InternalFactory.g:1241:2: ( rule__Operator__AreaAssignment_2_2 )
            {
             before(grammarAccess.getOperatorAccess().getAreaAssignment_2_2()); 
            // InternalFactory.g:1242:2: ( rule__Operator__AreaAssignment_2_2 )
            // InternalFactory.g:1242:3: rule__Operator__AreaAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Operator__AreaAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAreaAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__2__Impl"


    // $ANTLR start "rule__Machine__Group__0"
    // InternalFactory.g:1251:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1255:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalFactory.g:1256:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0"


    // $ANTLR start "rule__Machine__Group__0__Impl"
    // InternalFactory.g:1263:1: rule__Machine__Group__0__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1267:1: ( ( 'machine' ) )
            // InternalFactory.g:1268:1: ( 'machine' )
            {
            // InternalFactory.g:1268:1: ( 'machine' )
            // InternalFactory.g:1269:2: 'machine'
            {
             before(grammarAccess.getMachineAccess().getMachineKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getMachineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0__Impl"


    // $ANTLR start "rule__Machine__Group__1"
    // InternalFactory.g:1278:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1282:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalFactory.g:1283:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Machine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1"


    // $ANTLR start "rule__Machine__Group__1__Impl"
    // InternalFactory.g:1290:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__NameAssignment_1 ) ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1294:1: ( ( ( rule__Machine__NameAssignment_1 ) ) )
            // InternalFactory.g:1295:1: ( ( rule__Machine__NameAssignment_1 ) )
            {
            // InternalFactory.g:1295:1: ( ( rule__Machine__NameAssignment_1 ) )
            // InternalFactory.g:1296:2: ( rule__Machine__NameAssignment_1 )
            {
             before(grammarAccess.getMachineAccess().getNameAssignment_1()); 
            // InternalFactory.g:1297:2: ( rule__Machine__NameAssignment_1 )
            // InternalFactory.g:1297:3: rule__Machine__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1__Impl"


    // $ANTLR start "rule__Machine__Group__2"
    // InternalFactory.g:1305:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1309:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalFactory.g:1310:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Machine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2"


    // $ANTLR start "rule__Machine__Group__2__Impl"
    // InternalFactory.g:1317:1: rule__Machine__Group__2__Impl : ( ( rule__Machine__Group_2__0 )? ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1321:1: ( ( ( rule__Machine__Group_2__0 )? ) )
            // InternalFactory.g:1322:1: ( ( rule__Machine__Group_2__0 )? )
            {
            // InternalFactory.g:1322:1: ( ( rule__Machine__Group_2__0 )? )
            // InternalFactory.g:1323:2: ( rule__Machine__Group_2__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_2()); 
            // InternalFactory.g:1324:2: ( rule__Machine__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFactory.g:1324:3: rule__Machine__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Machine__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2__Impl"


    // $ANTLR start "rule__Machine__Group__3"
    // InternalFactory.g:1332:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1336:1: ( rule__Machine__Group__3__Impl )
            // InternalFactory.g:1337:2: rule__Machine__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3"


    // $ANTLR start "rule__Machine__Group__3__Impl"
    // InternalFactory.g:1343:1: rule__Machine__Group__3__Impl : ( ';' ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1347:1: ( ( ';' ) )
            // InternalFactory.g:1348:1: ( ';' )
            {
            // InternalFactory.g:1348:1: ( ';' )
            // InternalFactory.g:1349:2: ';'
            {
             before(grammarAccess.getMachineAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3__Impl"


    // $ANTLR start "rule__Machine__Group_2__0"
    // InternalFactory.g:1359:1: rule__Machine__Group_2__0 : rule__Machine__Group_2__0__Impl rule__Machine__Group_2__1 ;
    public final void rule__Machine__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1363:1: ( rule__Machine__Group_2__0__Impl rule__Machine__Group_2__1 )
            // InternalFactory.g:1364:2: rule__Machine__Group_2__0__Impl rule__Machine__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Machine__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_2__0"


    // $ANTLR start "rule__Machine__Group_2__0__Impl"
    // InternalFactory.g:1371:1: rule__Machine__Group_2__0__Impl : ( 'manufacturer' ) ;
    public final void rule__Machine__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1375:1: ( ( 'manufacturer' ) )
            // InternalFactory.g:1376:1: ( 'manufacturer' )
            {
            // InternalFactory.g:1376:1: ( 'manufacturer' )
            // InternalFactory.g:1377:2: 'manufacturer'
            {
             before(grammarAccess.getMachineAccess().getManufacturerKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getManufacturerKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_2__0__Impl"


    // $ANTLR start "rule__Machine__Group_2__1"
    // InternalFactory.g:1386:1: rule__Machine__Group_2__1 : rule__Machine__Group_2__1__Impl rule__Machine__Group_2__2 ;
    public final void rule__Machine__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1390:1: ( rule__Machine__Group_2__1__Impl rule__Machine__Group_2__2 )
            // InternalFactory.g:1391:2: rule__Machine__Group_2__1__Impl rule__Machine__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__Machine__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_2__1"


    // $ANTLR start "rule__Machine__Group_2__1__Impl"
    // InternalFactory.g:1398:1: rule__Machine__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Machine__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1402:1: ( ( '=' ) )
            // InternalFactory.g:1403:1: ( '=' )
            {
            // InternalFactory.g:1403:1: ( '=' )
            // InternalFactory.g:1404:2: '='
            {
             before(grammarAccess.getMachineAccess().getEqualsSignKeyword_2_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_2__1__Impl"


    // $ANTLR start "rule__Machine__Group_2__2"
    // InternalFactory.g:1413:1: rule__Machine__Group_2__2 : rule__Machine__Group_2__2__Impl ;
    public final void rule__Machine__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1417:1: ( rule__Machine__Group_2__2__Impl )
            // InternalFactory.g:1418:2: rule__Machine__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_2__2"


    // $ANTLR start "rule__Machine__Group_2__2__Impl"
    // InternalFactory.g:1424:1: rule__Machine__Group_2__2__Impl : ( ( rule__Machine__ManufacturerAssignment_2_2 ) ) ;
    public final void rule__Machine__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1428:1: ( ( ( rule__Machine__ManufacturerAssignment_2_2 ) ) )
            // InternalFactory.g:1429:1: ( ( rule__Machine__ManufacturerAssignment_2_2 ) )
            {
            // InternalFactory.g:1429:1: ( ( rule__Machine__ManufacturerAssignment_2_2 ) )
            // InternalFactory.g:1430:2: ( rule__Machine__ManufacturerAssignment_2_2 )
            {
             before(grammarAccess.getMachineAccess().getManufacturerAssignment_2_2()); 
            // InternalFactory.g:1431:2: ( rule__Machine__ManufacturerAssignment_2_2 )
            // InternalFactory.g:1431:3: rule__Machine__ManufacturerAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Machine__ManufacturerAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getManufacturerAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_2__2__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__0"
    // InternalFactory.g:1440:1: rule__EIntegerObject__Group__0 : rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 ;
    public final void rule__EIntegerObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1444:1: ( rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 )
            // InternalFactory.g:1445:2: rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EIntegerObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__0"


    // $ANTLR start "rule__EIntegerObject__Group__0__Impl"
    // InternalFactory.g:1452:1: rule__EIntegerObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EIntegerObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1456:1: ( ( ( '-' )? ) )
            // InternalFactory.g:1457:1: ( ( '-' )? )
            {
            // InternalFactory.g:1457:1: ( ( '-' )? )
            // InternalFactory.g:1458:2: ( '-' )?
            {
             before(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalFactory.g:1459:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFactory.g:1459:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__0__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__1"
    // InternalFactory.g:1467:1: rule__EIntegerObject__Group__1 : rule__EIntegerObject__Group__1__Impl ;
    public final void rule__EIntegerObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1471:1: ( rule__EIntegerObject__Group__1__Impl )
            // InternalFactory.g:1472:2: rule__EIntegerObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__1"


    // $ANTLR start "rule__EIntegerObject__Group__1__Impl"
    // InternalFactory.g:1478:1: rule__EIntegerObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EIntegerObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1482:1: ( ( RULE_INT ) )
            // InternalFactory.g:1483:1: ( RULE_INT )
            {
            // InternalFactory.g:1483:1: ( RULE_INT )
            // InternalFactory.g:1484:2: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__1__Impl"


    // $ANTLR start "rule__Factory__ElementsAssignment"
    // InternalFactory.g:1494:1: rule__Factory__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Factory__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1498:1: ( ( ruleElement ) )
            // InternalFactory.g:1499:2: ( ruleElement )
            {
            // InternalFactory.g:1499:2: ( ruleElement )
            // InternalFactory.g:1500:3: ruleElement
            {
             before(grammarAccess.getFactoryAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getFactoryAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__ElementsAssignment"


    // $ANTLR start "rule__Shift__NameAssignment_1"
    // InternalFactory.g:1509:1: rule__Shift__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Shift__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1513:1: ( ( ruleEString ) )
            // InternalFactory.g:1514:2: ( ruleEString )
            {
            // InternalFactory.g:1514:2: ( ruleEString )
            // InternalFactory.g:1515:3: ruleEString
            {
             before(grammarAccess.getShiftAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShiftAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__NameAssignment_1"


    // $ANTLR start "rule__Shift__DateAssignment_5"
    // InternalFactory.g:1524:1: rule__Shift__DateAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Shift__DateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1528:1: ( ( RULE_STRING ) )
            // InternalFactory.g:1529:2: ( RULE_STRING )
            {
            // InternalFactory.g:1529:2: ( RULE_STRING )
            // InternalFactory.g:1530:3: RULE_STRING
            {
             before(grammarAccess.getShiftAccess().getDateSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getShiftAccess().getDateSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__DateAssignment_5"


    // $ANTLR start "rule__Shift__WorkAssignment_9"
    // InternalFactory.g:1539:1: rule__Shift__WorkAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Shift__WorkAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1543:1: ( ( ( RULE_ID ) ) )
            // InternalFactory.g:1544:2: ( ( RULE_ID ) )
            {
            // InternalFactory.g:1544:2: ( ( RULE_ID ) )
            // InternalFactory.g:1545:3: ( RULE_ID )
            {
             before(grammarAccess.getShiftAccess().getWorkTaskCrossReference_9_0()); 
            // InternalFactory.g:1546:3: ( RULE_ID )
            // InternalFactory.g:1547:4: RULE_ID
            {
             before(grammarAccess.getShiftAccess().getWorkTaskIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShiftAccess().getWorkTaskIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getShiftAccess().getWorkTaskCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__WorkAssignment_9"


    // $ANTLR start "rule__Shift__WorkAssignment_10_1"
    // InternalFactory.g:1558:1: rule__Shift__WorkAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Shift__WorkAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1562:1: ( ( ( RULE_ID ) ) )
            // InternalFactory.g:1563:2: ( ( RULE_ID ) )
            {
            // InternalFactory.g:1563:2: ( ( RULE_ID ) )
            // InternalFactory.g:1564:3: ( RULE_ID )
            {
             before(grammarAccess.getShiftAccess().getWorkTaskCrossReference_10_1_0()); 
            // InternalFactory.g:1565:3: ( RULE_ID )
            // InternalFactory.g:1566:4: RULE_ID
            {
             before(grammarAccess.getShiftAccess().getWorkTaskIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShiftAccess().getWorkTaskIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getShiftAccess().getWorkTaskCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shift__WorkAssignment_10_1"


    // $ANTLR start "rule__Task__NameAssignment_2"
    // InternalFactory.g:1577:1: rule__Task__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Task__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1581:1: ( ( ruleEString ) )
            // InternalFactory.g:1582:2: ( ruleEString )
            {
            // InternalFactory.g:1582:2: ( ruleEString )
            // InternalFactory.g:1583:3: ruleEString
            {
             before(grammarAccess.getTaskAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__NameAssignment_2"


    // $ANTLR start "rule__Task__DurationAssignment_3_2"
    // InternalFactory.g:1592:1: rule__Task__DurationAssignment_3_2 : ( ruleEIntegerObject ) ;
    public final void rule__Task__DurationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1596:1: ( ( ruleEIntegerObject ) )
            // InternalFactory.g:1597:2: ( ruleEIntegerObject )
            {
            // InternalFactory.g:1597:2: ( ruleEIntegerObject )
            // InternalFactory.g:1598:3: ruleEIntegerObject
            {
             before(grammarAccess.getTaskAccess().getDurationEIntegerObjectParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDurationEIntegerObjectParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DurationAssignment_3_2"


    // $ANTLR start "rule__Task__OperatorAssignment_5"
    // InternalFactory.g:1607:1: rule__Task__OperatorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Task__OperatorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1611:1: ( ( ( RULE_ID ) ) )
            // InternalFactory.g:1612:2: ( ( RULE_ID ) )
            {
            // InternalFactory.g:1612:2: ( ( RULE_ID ) )
            // InternalFactory.g:1613:3: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getOperatorOperatorCrossReference_5_0()); 
            // InternalFactory.g:1614:3: ( RULE_ID )
            // InternalFactory.g:1615:4: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getOperatorOperatorIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getOperatorOperatorIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getOperatorOperatorCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__OperatorAssignment_5"


    // $ANTLR start "rule__Task__MachineAssignment_7"
    // InternalFactory.g:1626:1: rule__Task__MachineAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Task__MachineAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1630:1: ( ( ( RULE_ID ) ) )
            // InternalFactory.g:1631:2: ( ( RULE_ID ) )
            {
            // InternalFactory.g:1631:2: ( ( RULE_ID ) )
            // InternalFactory.g:1632:3: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getMachineMachineCrossReference_7_0()); 
            // InternalFactory.g:1633:3: ( RULE_ID )
            // InternalFactory.g:1634:4: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getMachineMachineIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getMachineMachineIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getMachineMachineCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__MachineAssignment_7"


    // $ANTLR start "rule__Operator__NameAssignment_1"
    // InternalFactory.g:1645:1: rule__Operator__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Operator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1649:1: ( ( ruleEString ) )
            // InternalFactory.g:1650:2: ( ruleEString )
            {
            // InternalFactory.g:1650:2: ( ruleEString )
            // InternalFactory.g:1651:3: ruleEString
            {
             before(grammarAccess.getOperatorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperatorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__NameAssignment_1"


    // $ANTLR start "rule__Operator__AreaAssignment_2_2"
    // InternalFactory.g:1660:1: rule__Operator__AreaAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__Operator__AreaAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1664:1: ( ( RULE_STRING ) )
            // InternalFactory.g:1665:2: ( RULE_STRING )
            {
            // InternalFactory.g:1665:2: ( RULE_STRING )
            // InternalFactory.g:1666:3: RULE_STRING
            {
             before(grammarAccess.getOperatorAccess().getAreaSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getAreaSTRINGTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__AreaAssignment_2_2"


    // $ANTLR start "rule__Machine__NameAssignment_1"
    // InternalFactory.g:1675:1: rule__Machine__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Machine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1679:1: ( ( ruleEString ) )
            // InternalFactory.g:1680:2: ( ruleEString )
            {
            // InternalFactory.g:1680:2: ( ruleEString )
            // InternalFactory.g:1681:3: ruleEString
            {
             before(grammarAccess.getMachineAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__NameAssignment_1"


    // $ANTLR start "rule__Machine__ManufacturerAssignment_2_2"
    // InternalFactory.g:1690:1: rule__Machine__ManufacturerAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__Machine__ManufacturerAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFactory.g:1694:1: ( ( RULE_STRING ) )
            // InternalFactory.g:1695:2: ( RULE_STRING )
            {
            // InternalFactory.g:1695:2: ( RULE_STRING )
            // InternalFactory.g:1696:3: RULE_STRING
            {
             before(grammarAccess.getMachineAccess().getManufacturerSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getManufacturerSTRINGTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__ManufacturerAssignment_2_2"

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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010008000L});

}