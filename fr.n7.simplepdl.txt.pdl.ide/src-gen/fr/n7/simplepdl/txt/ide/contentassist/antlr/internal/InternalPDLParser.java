package fr.n7.simplepdl.txt.ide.contentassist.antlr.internal;

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
import fr.n7.simplepdl.txt.services.PDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'startToStart'", "'finishToStart'", "'startToFinish'", "'finishToFinish'", "'process'", "'{'", "'}'", "'wd'", "'note'", "'for'", "','", "'ws'", "'from'", "'to'", "'need'", "'of'", "'create'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL.g"; }


    	private PDLGrammarAccess grammarAccess;

    	public void setGrammarAccess(PDLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProcess"
    // InternalPDL.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDL.g:54:1: ( ruleProcess EOF )
            // InternalPDL.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDL.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDL.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDL.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDL.g:69:3: ( rule__Process__Group__0 )
            // InternalPDL.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL.g:78:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // InternalPDL.g:79:1: ( ruleProcessElement EOF )
            // InternalPDL.g:80:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL.g:87:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:91:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // InternalPDL.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            {
            // InternalPDL.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            // InternalPDL.g:93:3: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // InternalPDL.g:94:3: ( rule__ProcessElement__Alternatives )
            // InternalPDL.g:94:4: rule__ProcessElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL.g:103:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalPDL.g:104:1: ( ruleWorkDefinition EOF )
            // InternalPDL.g:105:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL.g:112:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:116:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // InternalPDL.g:117:2: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // InternalPDL.g:117:2: ( ( rule__WorkDefinition__Group__0 ) )
            // InternalPDL.g:118:3: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // InternalPDL.g:119:3: ( rule__WorkDefinition__Group__0 )
            // InternalPDL.g:119:4: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL.g:128:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalPDL.g:129:1: ( ruleGuidance EOF )
            // InternalPDL.g:130:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL.g:137:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:141:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalPDL.g:142:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalPDL.g:142:2: ( ( rule__Guidance__Group__0 ) )
            // InternalPDL.g:143:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalPDL.g:144:3: ( rule__Guidance__Group__0 )
            // InternalPDL.g:144:4: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL.g:153:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalPDL.g:154:1: ( ruleWorkSequence EOF )
            // InternalPDL.g:155:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL.g:162:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:166:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalPDL.g:167:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalPDL.g:167:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalPDL.g:168:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalPDL.g:169:3: ( rule__WorkSequence__Group__0 )
            // InternalPDL.g:169:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleNeed"
    // InternalPDL.g:178:1: entryRuleNeed : ruleNeed EOF ;
    public final void entryRuleNeed() throws RecognitionException {
        try {
            // InternalPDL.g:179:1: ( ruleNeed EOF )
            // InternalPDL.g:180:1: ruleNeed EOF
            {
             before(grammarAccess.getNeedRule()); 
            pushFollow(FOLLOW_1);
            ruleNeed();

            state._fsp--;

             after(grammarAccess.getNeedRule()); 
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
    // $ANTLR end "entryRuleNeed"


    // $ANTLR start "ruleNeed"
    // InternalPDL.g:187:1: ruleNeed : ( ( rule__Need__Group__0 ) ) ;
    public final void ruleNeed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:191:2: ( ( ( rule__Need__Group__0 ) ) )
            // InternalPDL.g:192:2: ( ( rule__Need__Group__0 ) )
            {
            // InternalPDL.g:192:2: ( ( rule__Need__Group__0 ) )
            // InternalPDL.g:193:3: ( rule__Need__Group__0 )
            {
             before(grammarAccess.getNeedAccess().getGroup()); 
            // InternalPDL.g:194:3: ( rule__Need__Group__0 )
            // InternalPDL.g:194:4: rule__Need__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Need__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getGroup()); 

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
    // $ANTLR end "ruleNeed"


    // $ANTLR start "entryRuleResource"
    // InternalPDL.g:203:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalPDL.g:204:1: ( ruleResource EOF )
            // InternalPDL.g:205:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalPDL.g:212:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:216:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalPDL.g:217:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalPDL.g:217:2: ( ( rule__Resource__Group__0 ) )
            // InternalPDL.g:218:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalPDL.g:219:3: ( rule__Resource__Group__0 )
            // InternalPDL.g:219:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL.g:228:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:232:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDL.g:233:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDL.g:233:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDL.g:234:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDL.g:235:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDL.g:235:4: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // InternalPDL.g:243:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleResource ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:247:1: ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleResource ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 27:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPDL.g:248:2: ( ruleWorkDefinition )
                    {
                    // InternalPDL.g:248:2: ( ruleWorkDefinition )
                    // InternalPDL.g:249:3: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:254:2: ( ruleWorkSequence )
                    {
                    // InternalPDL.g:254:2: ( ruleWorkSequence )
                    // InternalPDL.g:255:3: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:260:2: ( ruleGuidance )
                    {
                    // InternalPDL.g:260:2: ( ruleGuidance )
                    // InternalPDL.g:261:3: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:266:2: ( ruleResource )
                    {
                    // InternalPDL.g:266:2: ( ruleResource )
                    // InternalPDL.g:267:3: ruleResource
                    {
                     before(grammarAccess.getProcessElementAccess().getResourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleResource();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getResourceParserRuleCall_3()); 

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
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalPDL.g:276:1: rule__WorkSequenceType__Alternatives : ( ( ( 'startToStart' ) ) | ( ( 'finishToStart' ) ) | ( ( 'startToFinish' ) ) | ( ( 'finishToFinish' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:280:1: ( ( ( 'startToStart' ) ) | ( ( 'finishToStart' ) ) | ( ( 'startToFinish' ) ) | ( ( 'finishToFinish' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
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
                    // InternalPDL.g:281:2: ( ( 'startToStart' ) )
                    {
                    // InternalPDL.g:281:2: ( ( 'startToStart' ) )
                    // InternalPDL.g:282:3: ( 'startToStart' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 
                    // InternalPDL.g:283:3: ( 'startToStart' )
                    // InternalPDL.g:283:4: 'startToStart'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:287:2: ( ( 'finishToStart' ) )
                    {
                    // InternalPDL.g:287:2: ( ( 'finishToStart' ) )
                    // InternalPDL.g:288:3: ( 'finishToStart' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 
                    // InternalPDL.g:289:3: ( 'finishToStart' )
                    // InternalPDL.g:289:4: 'finishToStart'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:293:2: ( ( 'startToFinish' ) )
                    {
                    // InternalPDL.g:293:2: ( ( 'startToFinish' ) )
                    // InternalPDL.g:294:3: ( 'startToFinish' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 
                    // InternalPDL.g:295:3: ( 'startToFinish' )
                    // InternalPDL.g:295:4: 'startToFinish'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:299:2: ( ( 'finishToFinish' ) )
                    {
                    // InternalPDL.g:299:2: ( ( 'finishToFinish' ) )
                    // InternalPDL.g:300:3: ( 'finishToFinish' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 
                    // InternalPDL.g:301:3: ( 'finishToFinish' )
                    // InternalPDL.g:301:4: 'finishToFinish'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalPDL.g:309:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:313:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL.g:314:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

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
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalPDL.g:321:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:325:1: ( ( 'process' ) )
            // InternalPDL.g:326:1: ( 'process' )
            {
            // InternalPDL.g:326:1: ( 'process' )
            // InternalPDL.g:327:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

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
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalPDL.g:336:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:340:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL.g:341:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

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
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalPDL.g:348:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:352:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // InternalPDL.g:353:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // InternalPDL.g:353:1: ( ( rule__Process__NameAssignment_1 ) )
            // InternalPDL.g:354:2: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // InternalPDL.g:355:2: ( rule__Process__NameAssignment_1 )
            // InternalPDL.g:355:3: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalPDL.g:363:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:367:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL.g:368:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

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
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalPDL.g:375:1: rule__Process__Group__2__Impl : ( '{' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:379:1: ( ( '{' ) )
            // InternalPDL.g:380:1: ( '{' )
            {
            // InternalPDL.g:380:1: ( '{' )
            // InternalPDL.g:381:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalPDL.g:390:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:394:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL.g:395:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

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
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalPDL.g:402:1: rule__Process__Group__3__Impl : ( ( rule__Process__ProcessElementsAssignment_3 )* ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:406:1: ( ( ( rule__Process__ProcessElementsAssignment_3 )* ) )
            // InternalPDL.g:407:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            {
            // InternalPDL.g:407:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            // InternalPDL.g:408:2: ( rule__Process__ProcessElementsAssignment_3 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 
            // InternalPDL.g:409:2: ( rule__Process__ProcessElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=18 && LA3_0<=19)||LA3_0==22||LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPDL.g:409:3: rule__Process__ProcessElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Process__ProcessElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 

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
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalPDL.g:417:1: rule__Process__Group__4 : rule__Process__Group__4__Impl ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:421:1: ( rule__Process__Group__4__Impl )
            // InternalPDL.g:422:2: rule__Process__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__4__Impl();

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
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalPDL.g:428:1: rule__Process__Group__4__Impl : ( '}' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:432:1: ( ( '}' ) )
            // InternalPDL.g:433:1: ( '}' )
            {
            // InternalPDL.g:433:1: ( '}' )
            // InternalPDL.g:434:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // InternalPDL.g:444:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:448:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalPDL.g:449:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__1();

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
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // InternalPDL.g:456:1: rule__WorkDefinition__Group__0__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:460:1: ( ( 'wd' ) )
            // InternalPDL.g:461:1: ( 'wd' )
            {
            // InternalPDL.g:461:1: ( 'wd' )
            // InternalPDL.g:462:2: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // InternalPDL.g:471:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:475:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalPDL.g:476:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2();

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
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // InternalPDL.g:483:1: rule__WorkDefinition__Group__1__Impl : ( ( rule__WorkDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:487:1: ( ( ( rule__WorkDefinition__NameAssignment_1 ) ) )
            // InternalPDL.g:488:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            {
            // InternalPDL.g:488:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            // InternalPDL.g:489:2: ( rule__WorkDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 
            // InternalPDL.g:490:2: ( rule__WorkDefinition__NameAssignment_1 )
            // InternalPDL.g:490:3: rule__WorkDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // InternalPDL.g:498:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:502:1: ( rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 )
            // InternalPDL.g:503:2: rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__3();

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
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // InternalPDL.g:510:1: rule__WorkDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:514:1: ( ( '{' ) )
            // InternalPDL.g:515:1: ( '{' )
            {
            // InternalPDL.g:515:1: ( '{' )
            // InternalPDL.g:516:2: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__3"
    // InternalPDL.g:525:1: rule__WorkDefinition__Group__3 : rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 ;
    public final void rule__WorkDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:529:1: ( rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 )
            // InternalPDL.g:530:2: rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__WorkDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__4();

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
    // $ANTLR end "rule__WorkDefinition__Group__3"


    // $ANTLR start "rule__WorkDefinition__Group__3__Impl"
    // InternalPDL.g:537:1: rule__WorkDefinition__Group__3__Impl : ( ( rule__WorkDefinition__NeedAssignment_3 )? ) ;
    public final void rule__WorkDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:541:1: ( ( ( rule__WorkDefinition__NeedAssignment_3 )? ) )
            // InternalPDL.g:542:1: ( ( rule__WorkDefinition__NeedAssignment_3 )? )
            {
            // InternalPDL.g:542:1: ( ( rule__WorkDefinition__NeedAssignment_3 )? )
            // InternalPDL.g:543:2: ( rule__WorkDefinition__NeedAssignment_3 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getNeedAssignment_3()); 
            // InternalPDL.g:544:2: ( rule__WorkDefinition__NeedAssignment_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL.g:544:3: rule__WorkDefinition__NeedAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__NeedAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getNeedAssignment_3()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__4"
    // InternalPDL.g:552:1: rule__WorkDefinition__Group__4 : rule__WorkDefinition__Group__4__Impl ;
    public final void rule__WorkDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:556:1: ( rule__WorkDefinition__Group__4__Impl )
            // InternalPDL.g:557:2: rule__WorkDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group__4"


    // $ANTLR start "rule__WorkDefinition__Group__4__Impl"
    // InternalPDL.g:563:1: rule__WorkDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:567:1: ( ( '}' ) )
            // InternalPDL.g:568:1: ( '}' )
            {
            // InternalPDL.g:568:1: ( '}' )
            // InternalPDL.g:569:2: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__4__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalPDL.g:579:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:583:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalPDL.g:584:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1();

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
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // InternalPDL.g:591:1: rule__Guidance__Group__0__Impl : ( 'note' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:595:1: ( ( 'note' ) )
            // InternalPDL.g:596:1: ( 'note' )
            {
            // InternalPDL.g:596:1: ( 'note' )
            // InternalPDL.g:597:2: 'note'
            {
             before(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 

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
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // InternalPDL.g:606:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:610:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // InternalPDL.g:611:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__2();

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
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // InternalPDL.g:618:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__TextAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:622:1: ( ( ( rule__Guidance__TextAssignment_1 ) ) )
            // InternalPDL.g:623:1: ( ( rule__Guidance__TextAssignment_1 ) )
            {
            // InternalPDL.g:623:1: ( ( rule__Guidance__TextAssignment_1 ) )
            // InternalPDL.g:624:2: ( rule__Guidance__TextAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment_1()); 
            // InternalPDL.g:625:2: ( rule__Guidance__TextAssignment_1 )
            // InternalPDL.g:625:3: rule__Guidance__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Guidance__Group__2"
    // InternalPDL.g:633:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:637:1: ( rule__Guidance__Group__2__Impl )
            // InternalPDL.g:638:2: rule__Guidance__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__2__Impl();

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
    // $ANTLR end "rule__Guidance__Group__2"


    // $ANTLR start "rule__Guidance__Group__2__Impl"
    // InternalPDL.g:644:1: rule__Guidance__Group__2__Impl : ( ( rule__Guidance__Group_2__0 )? ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:648:1: ( ( ( rule__Guidance__Group_2__0 )? ) )
            // InternalPDL.g:649:1: ( ( rule__Guidance__Group_2__0 )? )
            {
            // InternalPDL.g:649:1: ( ( rule__Guidance__Group_2__0 )? )
            // InternalPDL.g:650:2: ( rule__Guidance__Group_2__0 )?
            {
             before(grammarAccess.getGuidanceAccess().getGroup_2()); 
            // InternalPDL.g:651:2: ( rule__Guidance__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPDL.g:651:3: rule__Guidance__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guidance__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuidanceAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Guidance__Group__2__Impl"


    // $ANTLR start "rule__Guidance__Group_2__0"
    // InternalPDL.g:660:1: rule__Guidance__Group_2__0 : rule__Guidance__Group_2__0__Impl rule__Guidance__Group_2__1 ;
    public final void rule__Guidance__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:664:1: ( rule__Guidance__Group_2__0__Impl rule__Guidance__Group_2__1 )
            // InternalPDL.g:665:2: rule__Guidance__Group_2__0__Impl rule__Guidance__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Guidance__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_2__1();

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
    // $ANTLR end "rule__Guidance__Group_2__0"


    // $ANTLR start "rule__Guidance__Group_2__0__Impl"
    // InternalPDL.g:672:1: rule__Guidance__Group_2__0__Impl : ( 'for' ) ;
    public final void rule__Guidance__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:676:1: ( ( 'for' ) )
            // InternalPDL.g:677:1: ( 'for' )
            {
            // InternalPDL.g:677:1: ( 'for' )
            // InternalPDL.g:678:2: 'for'
            {
             before(grammarAccess.getGuidanceAccess().getForKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getForKeyword_2_0()); 

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
    // $ANTLR end "rule__Guidance__Group_2__0__Impl"


    // $ANTLR start "rule__Guidance__Group_2__1"
    // InternalPDL.g:687:1: rule__Guidance__Group_2__1 : rule__Guidance__Group_2__1__Impl rule__Guidance__Group_2__2 ;
    public final void rule__Guidance__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:691:1: ( rule__Guidance__Group_2__1__Impl rule__Guidance__Group_2__2 )
            // InternalPDL.g:692:2: rule__Guidance__Group_2__1__Impl rule__Guidance__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__Guidance__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_2__2();

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
    // $ANTLR end "rule__Guidance__Group_2__1"


    // $ANTLR start "rule__Guidance__Group_2__1__Impl"
    // InternalPDL.g:699:1: rule__Guidance__Group_2__1__Impl : ( ( rule__Guidance__ElementsAssignment_2_1 ) ) ;
    public final void rule__Guidance__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:703:1: ( ( ( rule__Guidance__ElementsAssignment_2_1 ) ) )
            // InternalPDL.g:704:1: ( ( rule__Guidance__ElementsAssignment_2_1 ) )
            {
            // InternalPDL.g:704:1: ( ( rule__Guidance__ElementsAssignment_2_1 ) )
            // InternalPDL.g:705:2: ( rule__Guidance__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_2_1()); 
            // InternalPDL.g:706:2: ( rule__Guidance__ElementsAssignment_2_1 )
            // InternalPDL.g:706:3: rule__Guidance__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__ElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_2_1()); 

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
    // $ANTLR end "rule__Guidance__Group_2__1__Impl"


    // $ANTLR start "rule__Guidance__Group_2__2"
    // InternalPDL.g:714:1: rule__Guidance__Group_2__2 : rule__Guidance__Group_2__2__Impl ;
    public final void rule__Guidance__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:718:1: ( rule__Guidance__Group_2__2__Impl )
            // InternalPDL.g:719:2: rule__Guidance__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_2__2__Impl();

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
    // $ANTLR end "rule__Guidance__Group_2__2"


    // $ANTLR start "rule__Guidance__Group_2__2__Impl"
    // InternalPDL.g:725:1: rule__Guidance__Group_2__2__Impl : ( ( rule__Guidance__Group_2_2__0 )* ) ;
    public final void rule__Guidance__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:729:1: ( ( ( rule__Guidance__Group_2_2__0 )* ) )
            // InternalPDL.g:730:1: ( ( rule__Guidance__Group_2_2__0 )* )
            {
            // InternalPDL.g:730:1: ( ( rule__Guidance__Group_2_2__0 )* )
            // InternalPDL.g:731:2: ( rule__Guidance__Group_2_2__0 )*
            {
             before(grammarAccess.getGuidanceAccess().getGroup_2_2()); 
            // InternalPDL.g:732:2: ( rule__Guidance__Group_2_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPDL.g:732:3: rule__Guidance__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Guidance__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGuidanceAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__Guidance__Group_2__2__Impl"


    // $ANTLR start "rule__Guidance__Group_2_2__0"
    // InternalPDL.g:741:1: rule__Guidance__Group_2_2__0 : rule__Guidance__Group_2_2__0__Impl rule__Guidance__Group_2_2__1 ;
    public final void rule__Guidance__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:745:1: ( rule__Guidance__Group_2_2__0__Impl rule__Guidance__Group_2_2__1 )
            // InternalPDL.g:746:2: rule__Guidance__Group_2_2__0__Impl rule__Guidance__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Guidance__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_2_2__1();

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
    // $ANTLR end "rule__Guidance__Group_2_2__0"


    // $ANTLR start "rule__Guidance__Group_2_2__0__Impl"
    // InternalPDL.g:753:1: rule__Guidance__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Guidance__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:757:1: ( ( ',' ) )
            // InternalPDL.g:758:1: ( ',' )
            {
            // InternalPDL.g:758:1: ( ',' )
            // InternalPDL.g:759:2: ','
            {
             before(grammarAccess.getGuidanceAccess().getCommaKeyword_2_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Guidance__Group_2_2__0__Impl"


    // $ANTLR start "rule__Guidance__Group_2_2__1"
    // InternalPDL.g:768:1: rule__Guidance__Group_2_2__1 : rule__Guidance__Group_2_2__1__Impl ;
    public final void rule__Guidance__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:772:1: ( rule__Guidance__Group_2_2__1__Impl )
            // InternalPDL.g:773:2: rule__Guidance__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Guidance__Group_2_2__1"


    // $ANTLR start "rule__Guidance__Group_2_2__1__Impl"
    // InternalPDL.g:779:1: rule__Guidance__Group_2_2__1__Impl : ( ( rule__Guidance__ElementsAssignment_2_2_1 ) ) ;
    public final void rule__Guidance__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:783:1: ( ( ( rule__Guidance__ElementsAssignment_2_2_1 ) ) )
            // InternalPDL.g:784:1: ( ( rule__Guidance__ElementsAssignment_2_2_1 ) )
            {
            // InternalPDL.g:784:1: ( ( rule__Guidance__ElementsAssignment_2_2_1 ) )
            // InternalPDL.g:785:2: ( rule__Guidance__ElementsAssignment_2_2_1 )
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_2_2_1()); 
            // InternalPDL.g:786:2: ( rule__Guidance__ElementsAssignment_2_2_1 )
            // InternalPDL.g:786:3: rule__Guidance__ElementsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__ElementsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Guidance__Group_2_2__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL.g:795:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:799:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL.g:800:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

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
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalPDL.g:807:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:811:1: ( ( 'ws' ) )
            // InternalPDL.g:812:1: ( 'ws' )
            {
            // InternalPDL.g:812:1: ( 'ws' )
            // InternalPDL.g:813:2: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 

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
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalPDL.g:822:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:826:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL.g:827:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

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
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalPDL.g:834:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:838:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // InternalPDL.g:839:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // InternalPDL.g:839:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // InternalPDL.g:840:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // InternalPDL.g:841:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // InternalPDL.g:841:3: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

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
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalPDL.g:849:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:853:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalPDL.g:854:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__3();

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
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalPDL.g:861:1: rule__WorkSequence__Group__2__Impl : ( 'from' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:865:1: ( ( 'from' ) )
            // InternalPDL.g:866:1: ( 'from' )
            {
            // InternalPDL.g:866:1: ( 'from' )
            // InternalPDL.g:867:2: 'from'
            {
             before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 

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
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // InternalPDL.g:876:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:880:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalPDL.g:881:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4();

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
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // InternalPDL.g:888:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:892:1: ( ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) )
            // InternalPDL.g:893:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            {
            // InternalPDL.g:893:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            // InternalPDL.g:894:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 
            // InternalPDL.g:895:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            // InternalPDL.g:895:3: rule__WorkSequence__PredecessorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 

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
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // InternalPDL.g:903:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:907:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalPDL.g:908:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5();

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
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // InternalPDL.g:915:1: rule__WorkSequence__Group__4__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:919:1: ( ( 'to' ) )
            // InternalPDL.g:920:1: ( 'to' )
            {
            // InternalPDL.g:920:1: ( 'to' )
            // InternalPDL.g:921:2: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 

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
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // InternalPDL.g:930:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:934:1: ( rule__WorkSequence__Group__5__Impl )
            // InternalPDL.g:935:2: rule__WorkSequence__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5__Impl();

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
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // InternalPDL.g:941:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:945:1: ( ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) )
            // InternalPDL.g:946:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            {
            // InternalPDL.g:946:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            // InternalPDL.g:947:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 
            // InternalPDL.g:948:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            // InternalPDL.g:948:3: rule__WorkSequence__SuccessorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 

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
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__Need__Group__0"
    // InternalPDL.g:957:1: rule__Need__Group__0 : rule__Need__Group__0__Impl rule__Need__Group__1 ;
    public final void rule__Need__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:961:1: ( rule__Need__Group__0__Impl rule__Need__Group__1 )
            // InternalPDL.g:962:2: rule__Need__Group__0__Impl rule__Need__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Need__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Need__Group__1();

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
    // $ANTLR end "rule__Need__Group__0"


    // $ANTLR start "rule__Need__Group__0__Impl"
    // InternalPDL.g:969:1: rule__Need__Group__0__Impl : ( 'need' ) ;
    public final void rule__Need__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:973:1: ( ( 'need' ) )
            // InternalPDL.g:974:1: ( 'need' )
            {
            // InternalPDL.g:974:1: ( 'need' )
            // InternalPDL.g:975:2: 'need'
            {
             before(grammarAccess.getNeedAccess().getNeedKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getNeedKeyword_0()); 

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
    // $ANTLR end "rule__Need__Group__0__Impl"


    // $ANTLR start "rule__Need__Group__1"
    // InternalPDL.g:984:1: rule__Need__Group__1 : rule__Need__Group__1__Impl rule__Need__Group__2 ;
    public final void rule__Need__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:988:1: ( rule__Need__Group__1__Impl rule__Need__Group__2 )
            // InternalPDL.g:989:2: rule__Need__Group__1__Impl rule__Need__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Need__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Need__Group__2();

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
    // $ANTLR end "rule__Need__Group__1"


    // $ANTLR start "rule__Need__Group__1__Impl"
    // InternalPDL.g:996:1: rule__Need__Group__1__Impl : ( ( rule__Need__NbResourcesAssignment_1 ) ) ;
    public final void rule__Need__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1000:1: ( ( ( rule__Need__NbResourcesAssignment_1 ) ) )
            // InternalPDL.g:1001:1: ( ( rule__Need__NbResourcesAssignment_1 ) )
            {
            // InternalPDL.g:1001:1: ( ( rule__Need__NbResourcesAssignment_1 ) )
            // InternalPDL.g:1002:2: ( rule__Need__NbResourcesAssignment_1 )
            {
             before(grammarAccess.getNeedAccess().getNbResourcesAssignment_1()); 
            // InternalPDL.g:1003:2: ( rule__Need__NbResourcesAssignment_1 )
            // InternalPDL.g:1003:3: rule__Need__NbResourcesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Need__NbResourcesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getNbResourcesAssignment_1()); 

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
    // $ANTLR end "rule__Need__Group__1__Impl"


    // $ANTLR start "rule__Need__Group__2"
    // InternalPDL.g:1011:1: rule__Need__Group__2 : rule__Need__Group__2__Impl rule__Need__Group__3 ;
    public final void rule__Need__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1015:1: ( rule__Need__Group__2__Impl rule__Need__Group__3 )
            // InternalPDL.g:1016:2: rule__Need__Group__2__Impl rule__Need__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Need__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Need__Group__3();

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
    // $ANTLR end "rule__Need__Group__2"


    // $ANTLR start "rule__Need__Group__2__Impl"
    // InternalPDL.g:1023:1: rule__Need__Group__2__Impl : ( 'of' ) ;
    public final void rule__Need__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1027:1: ( ( 'of' ) )
            // InternalPDL.g:1028:1: ( 'of' )
            {
            // InternalPDL.g:1028:1: ( 'of' )
            // InternalPDL.g:1029:2: 'of'
            {
             before(grammarAccess.getNeedAccess().getOfKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getOfKeyword_2()); 

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
    // $ANTLR end "rule__Need__Group__2__Impl"


    // $ANTLR start "rule__Need__Group__3"
    // InternalPDL.g:1038:1: rule__Need__Group__3 : rule__Need__Group__3__Impl ;
    public final void rule__Need__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1042:1: ( rule__Need__Group__3__Impl )
            // InternalPDL.g:1043:2: rule__Need__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Need__Group__3__Impl();

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
    // $ANTLR end "rule__Need__Group__3"


    // $ANTLR start "rule__Need__Group__3__Impl"
    // InternalPDL.g:1049:1: rule__Need__Group__3__Impl : ( ( rule__Need__ResourceAssignment_3 ) ) ;
    public final void rule__Need__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1053:1: ( ( ( rule__Need__ResourceAssignment_3 ) ) )
            // InternalPDL.g:1054:1: ( ( rule__Need__ResourceAssignment_3 ) )
            {
            // InternalPDL.g:1054:1: ( ( rule__Need__ResourceAssignment_3 ) )
            // InternalPDL.g:1055:2: ( rule__Need__ResourceAssignment_3 )
            {
             before(grammarAccess.getNeedAccess().getResourceAssignment_3()); 
            // InternalPDL.g:1056:2: ( rule__Need__ResourceAssignment_3 )
            // InternalPDL.g:1056:3: rule__Need__ResourceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Need__ResourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getResourceAssignment_3()); 

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
    // $ANTLR end "rule__Need__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalPDL.g:1065:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1069:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalPDL.g:1070:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

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
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalPDL.g:1077:1: rule__Resource__Group__0__Impl : ( 'create' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1081:1: ( ( 'create' ) )
            // InternalPDL.g:1082:1: ( 'create' )
            {
            // InternalPDL.g:1082:1: ( 'create' )
            // InternalPDL.g:1083:2: 'create'
            {
             before(grammarAccess.getResourceAccess().getCreateKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getCreateKeyword_0()); 

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
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalPDL.g:1092:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1096:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalPDL.g:1097:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

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
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalPDL.g:1104:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NbAvailableResourcesAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1108:1: ( ( ( rule__Resource__NbAvailableResourcesAssignment_1 ) ) )
            // InternalPDL.g:1109:1: ( ( rule__Resource__NbAvailableResourcesAssignment_1 ) )
            {
            // InternalPDL.g:1109:1: ( ( rule__Resource__NbAvailableResourcesAssignment_1 ) )
            // InternalPDL.g:1110:2: ( rule__Resource__NbAvailableResourcesAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNbAvailableResourcesAssignment_1()); 
            // InternalPDL.g:1111:2: ( rule__Resource__NbAvailableResourcesAssignment_1 )
            // InternalPDL.g:1111:3: rule__Resource__NbAvailableResourcesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NbAvailableResourcesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNbAvailableResourcesAssignment_1()); 

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
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalPDL.g:1119:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1123:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalPDL.g:1124:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__3();

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
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalPDL.g:1131:1: rule__Resource__Group__2__Impl : ( 'of' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1135:1: ( ( 'of' ) )
            // InternalPDL.g:1136:1: ( 'of' )
            {
            // InternalPDL.g:1136:1: ( 'of' )
            // InternalPDL.g:1137:2: 'of'
            {
             before(grammarAccess.getResourceAccess().getOfKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getOfKeyword_2()); 

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
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // InternalPDL.g:1146:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1150:1: ( rule__Resource__Group__3__Impl )
            // InternalPDL.g:1151:2: rule__Resource__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__3__Impl();

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
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // InternalPDL.g:1157:1: rule__Resource__Group__3__Impl : ( ( rule__Resource__NameAssignment_3 ) ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1161:1: ( ( ( rule__Resource__NameAssignment_3 ) ) )
            // InternalPDL.g:1162:1: ( ( rule__Resource__NameAssignment_3 ) )
            {
            // InternalPDL.g:1162:1: ( ( rule__Resource__NameAssignment_3 ) )
            // InternalPDL.g:1163:2: ( rule__Resource__NameAssignment_3 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_3()); 
            // InternalPDL.g:1164:2: ( rule__Resource__NameAssignment_3 )
            // InternalPDL.g:1164:3: rule__Resource__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // InternalPDL.g:1173:1: rule__Process__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1177:1: ( ( RULE_ID ) )
            // InternalPDL.g:1178:2: ( RULE_ID )
            {
            // InternalPDL.g:1178:2: ( RULE_ID )
            // InternalPDL.g:1179:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_3"
    // InternalPDL.g:1188:1: rule__Process__ProcessElementsAssignment_3 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1192:1: ( ( ruleProcessElement ) )
            // InternalPDL.g:1193:2: ( ruleProcessElement )
            {
            // InternalPDL.g:1193:2: ( ruleProcessElement )
            // InternalPDL.g:1194:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_3"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_1"
    // InternalPDL.g:1203:1: rule__WorkDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1207:1: ( ( RULE_ID ) )
            // InternalPDL.g:1208:2: ( RULE_ID )
            {
            // InternalPDL.g:1208:2: ( RULE_ID )
            // InternalPDL.g:1209:3: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__NameAssignment_1"


    // $ANTLR start "rule__WorkDefinition__NeedAssignment_3"
    // InternalPDL.g:1218:1: rule__WorkDefinition__NeedAssignment_3 : ( ruleNeed ) ;
    public final void rule__WorkDefinition__NeedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1222:1: ( ( ruleNeed ) )
            // InternalPDL.g:1223:2: ( ruleNeed )
            {
            // InternalPDL.g:1223:2: ( ruleNeed )
            // InternalPDL.g:1224:3: ruleNeed
            {
             before(grammarAccess.getWorkDefinitionAccess().getNeedNeedParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNeed();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getNeedNeedParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__WorkDefinition__NeedAssignment_3"


    // $ANTLR start "rule__Guidance__TextAssignment_1"
    // InternalPDL.g:1233:1: rule__Guidance__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Guidance__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1237:1: ( ( RULE_STRING ) )
            // InternalPDL.g:1238:2: ( RULE_STRING )
            {
            // InternalPDL.g:1238:2: ( RULE_STRING )
            // InternalPDL.g:1239:3: RULE_STRING
            {
             before(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Guidance__TextAssignment_1"


    // $ANTLR start "rule__Guidance__ElementsAssignment_2_1"
    // InternalPDL.g:1248:1: rule__Guidance__ElementsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1252:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1253:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1253:2: ( ( RULE_ID ) )
            // InternalPDL.g:1254:3: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_1_0()); 
            // InternalPDL.g:1255:3: ( RULE_ID )
            // InternalPDL.g:1256:4: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Guidance__ElementsAssignment_2_1"


    // $ANTLR start "rule__Guidance__ElementsAssignment_2_2_1"
    // InternalPDL.g:1267:1: rule__Guidance__ElementsAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__ElementsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1271:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1272:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1272:2: ( ( RULE_ID ) )
            // InternalPDL.g:1273:3: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_2_1_0()); 
            // InternalPDL.g:1274:3: ( RULE_ID )
            // InternalPDL.g:1275:4: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__Guidance__ElementsAssignment_2_2_1"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // InternalPDL.g:1286:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1290:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL.g:1291:2: ( ruleWorkSequenceType )
            {
            // InternalPDL.g:1291:2: ( ruleWorkSequenceType )
            // InternalPDL.g:1292:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_3"
    // InternalPDL.g:1301:1: rule__WorkSequence__PredecessorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1305:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1306:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1306:2: ( ( RULE_ID ) )
            // InternalPDL.g:1307:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            // InternalPDL.g:1308:3: ( RULE_ID )
            // InternalPDL.g:1309:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 

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
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_3"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_5"
    // InternalPDL.g:1320:1: rule__WorkSequence__SuccessorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1324:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1325:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1325:2: ( ( RULE_ID ) )
            // InternalPDL.g:1326:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            // InternalPDL.g:1327:3: ( RULE_ID )
            // InternalPDL.g:1328:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 

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
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_5"


    // $ANTLR start "rule__Need__NbResourcesAssignment_1"
    // InternalPDL.g:1339:1: rule__Need__NbResourcesAssignment_1 : ( RULE_INT ) ;
    public final void rule__Need__NbResourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1343:1: ( ( RULE_INT ) )
            // InternalPDL.g:1344:2: ( RULE_INT )
            {
            // InternalPDL.g:1344:2: ( RULE_INT )
            // InternalPDL.g:1345:3: RULE_INT
            {
             before(grammarAccess.getNeedAccess().getNbResourcesINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getNbResourcesINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Need__NbResourcesAssignment_1"


    // $ANTLR start "rule__Need__ResourceAssignment_3"
    // InternalPDL.g:1354:1: rule__Need__ResourceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Need__ResourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1358:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1359:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1359:2: ( ( RULE_ID ) )
            // InternalPDL.g:1360:3: ( RULE_ID )
            {
             before(grammarAccess.getNeedAccess().getResourceResourceCrossReference_3_0()); 
            // InternalPDL.g:1361:3: ( RULE_ID )
            // InternalPDL.g:1362:4: RULE_ID
            {
             before(grammarAccess.getNeedAccess().getResourceResourceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getResourceResourceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getNeedAccess().getResourceResourceCrossReference_3_0()); 

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
    // $ANTLR end "rule__Need__ResourceAssignment_3"


    // $ANTLR start "rule__Resource__NbAvailableResourcesAssignment_1"
    // InternalPDL.g:1373:1: rule__Resource__NbAvailableResourcesAssignment_1 : ( RULE_INT ) ;
    public final void rule__Resource__NbAvailableResourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1377:1: ( ( RULE_INT ) )
            // InternalPDL.g:1378:2: ( RULE_INT )
            {
            // InternalPDL.g:1378:2: ( RULE_INT )
            // InternalPDL.g:1379:3: RULE_INT
            {
             before(grammarAccess.getResourceAccess().getNbAvailableResourcesINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getNbAvailableResourcesINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Resource__NbAvailableResourcesAssignment_1"


    // $ANTLR start "rule__Resource__NameAssignment_3"
    // InternalPDL.g:1388:1: rule__Resource__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1392:1: ( ( RULE_ID ) )
            // InternalPDL.g:1393:2: ( RULE_ID )
            {
            // InternalPDL.g:1393:2: ( RULE_ID )
            // InternalPDL.g:1394:3: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Resource__NameAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000084E0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000084C0002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});

}