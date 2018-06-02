package ac.soton.xmark.ide.contentassist.antlr.internal;

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
import ac.soton.xmark.services.XMarkingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXMarkingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'exercise'", "'tutorial'", "'assignment'", "'coursework'", "'section'", "'part'", "'subsection'", "'question'", "'task'", "'('", "')'", "'end'", "'problem'", "'class'", "'students'", "'groups'", "'marks'", "':'", "'{'", "'}'", "'begin'", "','", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


        public InternalXMarkingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXMarkingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXMarkingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXMarking.g"; }


    	private XMarkingGrammarAccess grammarAccess;

    	public void setGrammarAccess(XMarkingGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleExercise"
    // InternalXMarking.g:53:1: entryRuleExercise : ruleExercise EOF ;
    public final void entryRuleExercise() throws RecognitionException {
        try {
            // InternalXMarking.g:54:1: ( ruleExercise EOF )
            // InternalXMarking.g:55:1: ruleExercise EOF
            {
             before(grammarAccess.getExerciseRule()); 
            pushFollow(FOLLOW_1);
            ruleExercise();

            state._fsp--;

             after(grammarAccess.getExerciseRule()); 
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
    // $ANTLR end "entryRuleExercise"


    // $ANTLR start "ruleExercise"
    // InternalXMarking.g:62:1: ruleExercise : ( ( rule__Exercise__Group__0 ) ) ;
    public final void ruleExercise() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:66:2: ( ( ( rule__Exercise__Group__0 ) ) )
            // InternalXMarking.g:67:2: ( ( rule__Exercise__Group__0 ) )
            {
            // InternalXMarking.g:67:2: ( ( rule__Exercise__Group__0 ) )
            // InternalXMarking.g:68:3: ( rule__Exercise__Group__0 )
            {
             before(grammarAccess.getExerciseAccess().getGroup()); 
            // InternalXMarking.g:69:3: ( rule__Exercise__Group__0 )
            // InternalXMarking.g:69:4: rule__Exercise__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getGroup()); 

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
    // $ANTLR end "ruleExercise"


    // $ANTLR start "entryRuleXPart"
    // InternalXMarking.g:78:1: entryRuleXPart : ruleXPart EOF ;
    public final void entryRuleXPart() throws RecognitionException {
        try {
            // InternalXMarking.g:79:1: ( ruleXPart EOF )
            // InternalXMarking.g:80:1: ruleXPart EOF
            {
             before(grammarAccess.getXPartRule()); 
            pushFollow(FOLLOW_1);
            ruleXPart();

            state._fsp--;

             after(grammarAccess.getXPartRule()); 
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
    // $ANTLR end "entryRuleXPart"


    // $ANTLR start "ruleXPart"
    // InternalXMarking.g:87:1: ruleXPart : ( ( rule__XPart__Alternatives ) ) ;
    public final void ruleXPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:91:2: ( ( ( rule__XPart__Alternatives ) ) )
            // InternalXMarking.g:92:2: ( ( rule__XPart__Alternatives ) )
            {
            // InternalXMarking.g:92:2: ( ( rule__XPart__Alternatives ) )
            // InternalXMarking.g:93:3: ( rule__XPart__Alternatives )
            {
             before(grammarAccess.getXPartAccess().getAlternatives()); 
            // InternalXMarking.g:94:3: ( rule__XPart__Alternatives )
            // InternalXMarking.g:94:4: rule__XPart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XPart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXPartAccess().getAlternatives()); 

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
    // $ANTLR end "ruleXPart"


    // $ANTLR start "entryRuleXPartGrade"
    // InternalXMarking.g:103:1: entryRuleXPartGrade : ruleXPartGrade EOF ;
    public final void entryRuleXPartGrade() throws RecognitionException {
        try {
            // InternalXMarking.g:104:1: ( ruleXPartGrade EOF )
            // InternalXMarking.g:105:1: ruleXPartGrade EOF
            {
             before(grammarAccess.getXPartGradeRule()); 
            pushFollow(FOLLOW_1);
            ruleXPartGrade();

            state._fsp--;

             after(grammarAccess.getXPartGradeRule()); 
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
    // $ANTLR end "entryRuleXPartGrade"


    // $ANTLR start "ruleXPartGrade"
    // InternalXMarking.g:112:1: ruleXPartGrade : ( ( rule__XPartGrade__Alternatives ) ) ;
    public final void ruleXPartGrade() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:116:2: ( ( ( rule__XPartGrade__Alternatives ) ) )
            // InternalXMarking.g:117:2: ( ( rule__XPartGrade__Alternatives ) )
            {
            // InternalXMarking.g:117:2: ( ( rule__XPartGrade__Alternatives ) )
            // InternalXMarking.g:118:3: ( rule__XPartGrade__Alternatives )
            {
             before(grammarAccess.getXPartGradeAccess().getAlternatives()); 
            // InternalXMarking.g:119:3: ( rule__XPartGrade__Alternatives )
            // InternalXMarking.g:119:4: rule__XPartGrade__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XPartGrade__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXPartGradeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleXPartGrade"


    // $ANTLR start "entryRuleEString"
    // InternalXMarking.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalXMarking.g:129:1: ( ruleEString EOF )
            // InternalXMarking.g:130:1: ruleEString EOF
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
    // InternalXMarking.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalXMarking.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalXMarking.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalXMarking.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalXMarking.g:144:3: ( rule__EString__Alternatives )
            // InternalXMarking.g:144:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleXComment"
    // InternalXMarking.g:153:1: entryRuleXComment : ruleXComment EOF ;
    public final void entryRuleXComment() throws RecognitionException {
        try {
            // InternalXMarking.g:154:1: ( ruleXComment EOF )
            // InternalXMarking.g:155:1: ruleXComment EOF
            {
             before(grammarAccess.getXCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleXComment();

            state._fsp--;

             after(grammarAccess.getXCommentRule()); 
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
    // $ANTLR end "entryRuleXComment"


    // $ANTLR start "ruleXComment"
    // InternalXMarking.g:162:1: ruleXComment : ( ( rule__XComment__Group__0 ) ) ;
    public final void ruleXComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:166:2: ( ( ( rule__XComment__Group__0 ) ) )
            // InternalXMarking.g:167:2: ( ( rule__XComment__Group__0 ) )
            {
            // InternalXMarking.g:167:2: ( ( rule__XComment__Group__0 ) )
            // InternalXMarking.g:168:3: ( rule__XComment__Group__0 )
            {
             before(grammarAccess.getXCommentAccess().getGroup()); 
            // InternalXMarking.g:169:3: ( rule__XComment__Group__0 )
            // InternalXMarking.g:169:4: rule__XComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXCommentAccess().getGroup()); 

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
    // $ANTLR end "ruleXComment"


    // $ANTLR start "entryRuleXSection"
    // InternalXMarking.g:178:1: entryRuleXSection : ruleXSection EOF ;
    public final void entryRuleXSection() throws RecognitionException {
        try {
            // InternalXMarking.g:179:1: ( ruleXSection EOF )
            // InternalXMarking.g:180:1: ruleXSection EOF
            {
             before(grammarAccess.getXSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleXSection();

            state._fsp--;

             after(grammarAccess.getXSectionRule()); 
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
    // $ANTLR end "entryRuleXSection"


    // $ANTLR start "ruleXSection"
    // InternalXMarking.g:187:1: ruleXSection : ( ( rule__XSection__Group__0 ) ) ;
    public final void ruleXSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:191:2: ( ( ( rule__XSection__Group__0 ) ) )
            // InternalXMarking.g:192:2: ( ( rule__XSection__Group__0 ) )
            {
            // InternalXMarking.g:192:2: ( ( rule__XSection__Group__0 ) )
            // InternalXMarking.g:193:3: ( rule__XSection__Group__0 )
            {
             before(grammarAccess.getXSectionAccess().getGroup()); 
            // InternalXMarking.g:194:3: ( rule__XSection__Group__0 )
            // InternalXMarking.g:194:4: rule__XSection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXSectionAccess().getGroup()); 

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
    // $ANTLR end "ruleXSection"


    // $ANTLR start "entryRuleXQuestion"
    // InternalXMarking.g:203:1: entryRuleXQuestion : ruleXQuestion EOF ;
    public final void entryRuleXQuestion() throws RecognitionException {
        try {
            // InternalXMarking.g:204:1: ( ruleXQuestion EOF )
            // InternalXMarking.g:205:1: ruleXQuestion EOF
            {
             before(grammarAccess.getXQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleXQuestion();

            state._fsp--;

             after(grammarAccess.getXQuestionRule()); 
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
    // $ANTLR end "entryRuleXQuestion"


    // $ANTLR start "ruleXQuestion"
    // InternalXMarking.g:212:1: ruleXQuestion : ( ( rule__XQuestion__Group__0 ) ) ;
    public final void ruleXQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:216:2: ( ( ( rule__XQuestion__Group__0 ) ) )
            // InternalXMarking.g:217:2: ( ( rule__XQuestion__Group__0 ) )
            {
            // InternalXMarking.g:217:2: ( ( rule__XQuestion__Group__0 ) )
            // InternalXMarking.g:218:3: ( rule__XQuestion__Group__0 )
            {
             before(grammarAccess.getXQuestionAccess().getGroup()); 
            // InternalXMarking.g:219:3: ( rule__XQuestion__Group__0 )
            // InternalXMarking.g:219:4: rule__XQuestion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXQuestionAccess().getGroup()); 

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
    // $ANTLR end "ruleXQuestion"


    // $ANTLR start "entryRuleXStudent"
    // InternalXMarking.g:228:1: entryRuleXStudent : ruleXStudent EOF ;
    public final void entryRuleXStudent() throws RecognitionException {
        try {
            // InternalXMarking.g:229:1: ( ruleXStudent EOF )
            // InternalXMarking.g:230:1: ruleXStudent EOF
            {
             before(grammarAccess.getXStudentRule()); 
            pushFollow(FOLLOW_1);
            ruleXStudent();

            state._fsp--;

             after(grammarAccess.getXStudentRule()); 
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
    // $ANTLR end "entryRuleXStudent"


    // $ANTLR start "ruleXStudent"
    // InternalXMarking.g:237:1: ruleXStudent : ( ( rule__XStudent__Group__0 ) ) ;
    public final void ruleXStudent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:241:2: ( ( ( rule__XStudent__Group__0 ) ) )
            // InternalXMarking.g:242:2: ( ( rule__XStudent__Group__0 ) )
            {
            // InternalXMarking.g:242:2: ( ( rule__XStudent__Group__0 ) )
            // InternalXMarking.g:243:3: ( rule__XStudent__Group__0 )
            {
             before(grammarAccess.getXStudentAccess().getGroup()); 
            // InternalXMarking.g:244:3: ( rule__XStudent__Group__0 )
            // InternalXMarking.g:244:4: rule__XStudent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XStudent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXStudentAccess().getGroup()); 

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
    // $ANTLR end "ruleXStudent"


    // $ANTLR start "entryRuleXGroup"
    // InternalXMarking.g:253:1: entryRuleXGroup : ruleXGroup EOF ;
    public final void entryRuleXGroup() throws RecognitionException {
        try {
            // InternalXMarking.g:254:1: ( ruleXGroup EOF )
            // InternalXMarking.g:255:1: ruleXGroup EOF
            {
             before(grammarAccess.getXGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleXGroup();

            state._fsp--;

             after(grammarAccess.getXGroupRule()); 
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
    // $ANTLR end "entryRuleXGroup"


    // $ANTLR start "ruleXGroup"
    // InternalXMarking.g:262:1: ruleXGroup : ( ( rule__XGroup__Group__0 ) ) ;
    public final void ruleXGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:266:2: ( ( ( rule__XGroup__Group__0 ) ) )
            // InternalXMarking.g:267:2: ( ( rule__XGroup__Group__0 ) )
            {
            // InternalXMarking.g:267:2: ( ( rule__XGroup__Group__0 ) )
            // InternalXMarking.g:268:3: ( rule__XGroup__Group__0 )
            {
             before(grammarAccess.getXGroupAccess().getGroup()); 
            // InternalXMarking.g:269:3: ( rule__XGroup__Group__0 )
            // InternalXMarking.g:269:4: rule__XGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXGroupAccess().getGroup()); 

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
    // $ANTLR end "ruleXGroup"


    // $ANTLR start "entryRuleXMark"
    // InternalXMarking.g:278:1: entryRuleXMark : ruleXMark EOF ;
    public final void entryRuleXMark() throws RecognitionException {
        try {
            // InternalXMarking.g:279:1: ( ruleXMark EOF )
            // InternalXMarking.g:280:1: ruleXMark EOF
            {
             before(grammarAccess.getXMarkRule()); 
            pushFollow(FOLLOW_1);
            ruleXMark();

            state._fsp--;

             after(grammarAccess.getXMarkRule()); 
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
    // $ANTLR end "entryRuleXMark"


    // $ANTLR start "ruleXMark"
    // InternalXMarking.g:287:1: ruleXMark : ( ( rule__XMark__Group__0 ) ) ;
    public final void ruleXMark() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:291:2: ( ( ( rule__XMark__Group__0 ) ) )
            // InternalXMarking.g:292:2: ( ( rule__XMark__Group__0 ) )
            {
            // InternalXMarking.g:292:2: ( ( rule__XMark__Group__0 ) )
            // InternalXMarking.g:293:3: ( rule__XMark__Group__0 )
            {
             before(grammarAccess.getXMarkAccess().getGroup()); 
            // InternalXMarking.g:294:3: ( rule__XMark__Group__0 )
            // InternalXMarking.g:294:4: rule__XMark__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XMark__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXMarkAccess().getGroup()); 

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
    // $ANTLR end "ruleXMark"


    // $ANTLR start "entryRuleSectionGrade"
    // InternalXMarking.g:303:1: entryRuleSectionGrade : ruleSectionGrade EOF ;
    public final void entryRuleSectionGrade() throws RecognitionException {
        try {
            // InternalXMarking.g:304:1: ( ruleSectionGrade EOF )
            // InternalXMarking.g:305:1: ruleSectionGrade EOF
            {
             before(grammarAccess.getSectionGradeRule()); 
            pushFollow(FOLLOW_1);
            ruleSectionGrade();

            state._fsp--;

             after(grammarAccess.getSectionGradeRule()); 
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
    // $ANTLR end "entryRuleSectionGrade"


    // $ANTLR start "ruleSectionGrade"
    // InternalXMarking.g:312:1: ruleSectionGrade : ( ( rule__SectionGrade__Group__0 ) ) ;
    public final void ruleSectionGrade() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:316:2: ( ( ( rule__SectionGrade__Group__0 ) ) )
            // InternalXMarking.g:317:2: ( ( rule__SectionGrade__Group__0 ) )
            {
            // InternalXMarking.g:317:2: ( ( rule__SectionGrade__Group__0 ) )
            // InternalXMarking.g:318:3: ( rule__SectionGrade__Group__0 )
            {
             before(grammarAccess.getSectionGradeAccess().getGroup()); 
            // InternalXMarking.g:319:3: ( rule__SectionGrade__Group__0 )
            // InternalXMarking.g:319:4: rule__SectionGrade__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SectionGrade__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionGradeAccess().getGroup()); 

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
    // $ANTLR end "ruleSectionGrade"


    // $ANTLR start "entryRuleQuestionGrade"
    // InternalXMarking.g:328:1: entryRuleQuestionGrade : ruleQuestionGrade EOF ;
    public final void entryRuleQuestionGrade() throws RecognitionException {
        try {
            // InternalXMarking.g:329:1: ( ruleQuestionGrade EOF )
            // InternalXMarking.g:330:1: ruleQuestionGrade EOF
            {
             before(grammarAccess.getQuestionGradeRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionGrade();

            state._fsp--;

             after(grammarAccess.getQuestionGradeRule()); 
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
    // $ANTLR end "entryRuleQuestionGrade"


    // $ANTLR start "ruleQuestionGrade"
    // InternalXMarking.g:337:1: ruleQuestionGrade : ( ( rule__QuestionGrade__Group__0 ) ) ;
    public final void ruleQuestionGrade() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:341:2: ( ( ( rule__QuestionGrade__Group__0 ) ) )
            // InternalXMarking.g:342:2: ( ( rule__QuestionGrade__Group__0 ) )
            {
            // InternalXMarking.g:342:2: ( ( rule__QuestionGrade__Group__0 ) )
            // InternalXMarking.g:343:3: ( rule__QuestionGrade__Group__0 )
            {
             before(grammarAccess.getQuestionGradeAccess().getGroup()); 
            // InternalXMarking.g:344:3: ( rule__QuestionGrade__Group__0 )
            // InternalXMarking.g:344:4: rule__QuestionGrade__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGrade__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGradeAccess().getGroup()); 

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
    // $ANTLR end "ruleQuestionGrade"


    // $ANTLR start "entryRuleEInt"
    // InternalXMarking.g:353:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalXMarking.g:354:1: ( ruleEInt EOF )
            // InternalXMarking.g:355:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalXMarking.g:362:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:366:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalXMarking.g:367:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalXMarking.g:367:2: ( ( rule__EInt__Group__0 ) )
            // InternalXMarking.g:368:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalXMarking.g:369:3: ( rule__EInt__Group__0 )
            // InternalXMarking.g:369:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__Exercise__Alternatives_1"
    // InternalXMarking.g:377:1: rule__Exercise__Alternatives_1 : ( ( 'exercise' ) | ( ( rule__Exercise__Group_1_1__0 ) ) | ( 'tutorial' ) | ( 'assignment' ) | ( 'coursework' ) );
    public final void rule__Exercise__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:381:1: ( ( 'exercise' ) | ( ( rule__Exercise__Group_1_1__0 ) ) | ( 'tutorial' ) | ( 'assignment' ) | ( 'coursework' ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 12:
                {
                alt1=3;
                }
                break;
            case 13:
                {
                alt1=4;
                }
                break;
            case 14:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalXMarking.g:382:2: ( 'exercise' )
                    {
                    // InternalXMarking.g:382:2: ( 'exercise' )
                    // InternalXMarking.g:383:3: 'exercise'
                    {
                     before(grammarAccess.getExerciseAccess().getExerciseKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getExerciseAccess().getExerciseKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMarking.g:388:2: ( ( rule__Exercise__Group_1_1__0 ) )
                    {
                    // InternalXMarking.g:388:2: ( ( rule__Exercise__Group_1_1__0 ) )
                    // InternalXMarking.g:389:3: ( rule__Exercise__Group_1_1__0 )
                    {
                     before(grammarAccess.getExerciseAccess().getGroup_1_1()); 
                    // InternalXMarking.g:390:3: ( rule__Exercise__Group_1_1__0 )
                    // InternalXMarking.g:390:4: rule__Exercise__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exercise__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExerciseAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMarking.g:394:2: ( 'tutorial' )
                    {
                    // InternalXMarking.g:394:2: ( 'tutorial' )
                    // InternalXMarking.g:395:3: 'tutorial'
                    {
                     before(grammarAccess.getExerciseAccess().getTutorialKeyword_1_2()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getExerciseAccess().getTutorialKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXMarking.g:400:2: ( 'assignment' )
                    {
                    // InternalXMarking.g:400:2: ( 'assignment' )
                    // InternalXMarking.g:401:3: 'assignment'
                    {
                     before(grammarAccess.getExerciseAccess().getAssignmentKeyword_1_3()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getExerciseAccess().getAssignmentKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXMarking.g:406:2: ( 'coursework' )
                    {
                    // InternalXMarking.g:406:2: ( 'coursework' )
                    // InternalXMarking.g:407:3: 'coursework'
                    {
                     before(grammarAccess.getExerciseAccess().getCourseworkKeyword_1_4()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getExerciseAccess().getCourseworkKeyword_1_4()); 

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
    // $ANTLR end "rule__Exercise__Alternatives_1"


    // $ANTLR start "rule__XPart__Alternatives"
    // InternalXMarking.g:416:1: rule__XPart__Alternatives : ( ( ruleXSection ) | ( ruleXQuestion ) );
    public final void rule__XPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:420:1: ( ( ruleXSection ) | ( ruleXQuestion ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=15 && LA2_0<=17)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=18 && LA2_0<=19)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXMarking.g:421:2: ( ruleXSection )
                    {
                    // InternalXMarking.g:421:2: ( ruleXSection )
                    // InternalXMarking.g:422:3: ruleXSection
                    {
                     before(grammarAccess.getXPartAccess().getXSectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleXSection();

                    state._fsp--;

                     after(grammarAccess.getXPartAccess().getXSectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMarking.g:427:2: ( ruleXQuestion )
                    {
                    // InternalXMarking.g:427:2: ( ruleXQuestion )
                    // InternalXMarking.g:428:3: ruleXQuestion
                    {
                     before(grammarAccess.getXPartAccess().getXQuestionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleXQuestion();

                    state._fsp--;

                     after(grammarAccess.getXPartAccess().getXQuestionParserRuleCall_1()); 

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
    // $ANTLR end "rule__XPart__Alternatives"


    // $ANTLR start "rule__XPartGrade__Alternatives"
    // InternalXMarking.g:437:1: rule__XPartGrade__Alternatives : ( ( ruleSectionGrade ) | ( ruleQuestionGrade ) );
    public final void rule__XPartGrade__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:441:1: ( ( ruleSectionGrade ) | ( ruleQuestionGrade ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_INT||LA3_1==33) ) {
                    alt3=2;
                }
                else if ( (LA3_1==20||LA3_1==29) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_ID) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_INT||LA3_2==33) ) {
                    alt3=2;
                }
                else if ( (LA3_2==20||LA3_2==29) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXMarking.g:442:2: ( ruleSectionGrade )
                    {
                    // InternalXMarking.g:442:2: ( ruleSectionGrade )
                    // InternalXMarking.g:443:3: ruleSectionGrade
                    {
                     before(grammarAccess.getXPartGradeAccess().getSectionGradeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSectionGrade();

                    state._fsp--;

                     after(grammarAccess.getXPartGradeAccess().getSectionGradeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMarking.g:448:2: ( ruleQuestionGrade )
                    {
                    // InternalXMarking.g:448:2: ( ruleQuestionGrade )
                    // InternalXMarking.g:449:3: ruleQuestionGrade
                    {
                     before(grammarAccess.getXPartGradeAccess().getQuestionGradeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuestionGrade();

                    state._fsp--;

                     after(grammarAccess.getXPartGradeAccess().getQuestionGradeParserRuleCall_1()); 

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
    // $ANTLR end "rule__XPartGrade__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalXMarking.g:458:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:462:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXMarking.g:463:2: ( RULE_STRING )
                    {
                    // InternalXMarking.g:463:2: ( RULE_STRING )
                    // InternalXMarking.g:464:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMarking.g:469:2: ( RULE_ID )
                    {
                    // InternalXMarking.g:469:2: ( RULE_ID )
                    // InternalXMarking.g:470:3: RULE_ID
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


    // $ANTLR start "rule__XSection__Alternatives_0"
    // InternalXMarking.g:479:1: rule__XSection__Alternatives_0 : ( ( 'section' ) | ( 'part' ) | ( 'subsection' ) );
    public final void rule__XSection__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:483:1: ( ( 'section' ) | ( 'part' ) | ( 'subsection' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalXMarking.g:484:2: ( 'section' )
                    {
                    // InternalXMarking.g:484:2: ( 'section' )
                    // InternalXMarking.g:485:3: 'section'
                    {
                     before(grammarAccess.getXSectionAccess().getSectionKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getXSectionAccess().getSectionKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMarking.g:490:2: ( 'part' )
                    {
                    // InternalXMarking.g:490:2: ( 'part' )
                    // InternalXMarking.g:491:3: 'part'
                    {
                     before(grammarAccess.getXSectionAccess().getPartKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getXSectionAccess().getPartKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXMarking.g:496:2: ( 'subsection' )
                    {
                    // InternalXMarking.g:496:2: ( 'subsection' )
                    // InternalXMarking.g:497:3: 'subsection'
                    {
                     before(grammarAccess.getXSectionAccess().getSubsectionKeyword_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getXSectionAccess().getSubsectionKeyword_0_2()); 

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
    // $ANTLR end "rule__XSection__Alternatives_0"


    // $ANTLR start "rule__XQuestion__Alternatives_1"
    // InternalXMarking.g:506:1: rule__XQuestion__Alternatives_1 : ( ( 'question' ) | ( 'task' ) );
    public final void rule__XQuestion__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:510:1: ( ( 'question' ) | ( 'task' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMarking.g:511:2: ( 'question' )
                    {
                    // InternalXMarking.g:511:2: ( 'question' )
                    // InternalXMarking.g:512:3: 'question'
                    {
                     before(grammarAccess.getXQuestionAccess().getQuestionKeyword_1_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getXQuestionAccess().getQuestionKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXMarking.g:517:2: ( 'task' )
                    {
                    // InternalXMarking.g:517:2: ( 'task' )
                    // InternalXMarking.g:518:3: 'task'
                    {
                     before(grammarAccess.getXQuestionAccess().getTaskKeyword_1_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getXQuestionAccess().getTaskKeyword_1_1()); 

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
    // $ANTLR end "rule__XQuestion__Alternatives_1"


    // $ANTLR start "rule__Exercise__Group__0"
    // InternalXMarking.g:527:1: rule__Exercise__Group__0 : rule__Exercise__Group__0__Impl rule__Exercise__Group__1 ;
    public final void rule__Exercise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:531:1: ( rule__Exercise__Group__0__Impl rule__Exercise__Group__1 )
            // InternalXMarking.g:532:2: rule__Exercise__Group__0__Impl rule__Exercise__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Exercise__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__1();

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
    // $ANTLR end "rule__Exercise__Group__0"


    // $ANTLR start "rule__Exercise__Group__0__Impl"
    // InternalXMarking.g:539:1: rule__Exercise__Group__0__Impl : ( () ) ;
    public final void rule__Exercise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:543:1: ( ( () ) )
            // InternalXMarking.g:544:1: ( () )
            {
            // InternalXMarking.g:544:1: ( () )
            // InternalXMarking.g:545:2: ()
            {
             before(grammarAccess.getExerciseAccess().getExerciseAction_0()); 
            // InternalXMarking.g:546:2: ()
            // InternalXMarking.g:546:3: 
            {
            }

             after(grammarAccess.getExerciseAccess().getExerciseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__0__Impl"


    // $ANTLR start "rule__Exercise__Group__1"
    // InternalXMarking.g:554:1: rule__Exercise__Group__1 : rule__Exercise__Group__1__Impl rule__Exercise__Group__2 ;
    public final void rule__Exercise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:558:1: ( rule__Exercise__Group__1__Impl rule__Exercise__Group__2 )
            // InternalXMarking.g:559:2: rule__Exercise__Group__1__Impl rule__Exercise__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Exercise__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__2();

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
    // $ANTLR end "rule__Exercise__Group__1"


    // $ANTLR start "rule__Exercise__Group__1__Impl"
    // InternalXMarking.g:566:1: rule__Exercise__Group__1__Impl : ( ( rule__Exercise__Alternatives_1 ) ) ;
    public final void rule__Exercise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:570:1: ( ( ( rule__Exercise__Alternatives_1 ) ) )
            // InternalXMarking.g:571:1: ( ( rule__Exercise__Alternatives_1 ) )
            {
            // InternalXMarking.g:571:1: ( ( rule__Exercise__Alternatives_1 ) )
            // InternalXMarking.g:572:2: ( rule__Exercise__Alternatives_1 )
            {
             before(grammarAccess.getExerciseAccess().getAlternatives_1()); 
            // InternalXMarking.g:573:2: ( rule__Exercise__Alternatives_1 )
            // InternalXMarking.g:573:3: rule__Exercise__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Exercise__Group__1__Impl"


    // $ANTLR start "rule__Exercise__Group__2"
    // InternalXMarking.g:581:1: rule__Exercise__Group__2 : rule__Exercise__Group__2__Impl rule__Exercise__Group__3 ;
    public final void rule__Exercise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:585:1: ( rule__Exercise__Group__2__Impl rule__Exercise__Group__3 )
            // InternalXMarking.g:586:2: rule__Exercise__Group__2__Impl rule__Exercise__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Exercise__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__3();

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
    // $ANTLR end "rule__Exercise__Group__2"


    // $ANTLR start "rule__Exercise__Group__2__Impl"
    // InternalXMarking.g:593:1: rule__Exercise__Group__2__Impl : ( ( rule__Exercise__NameAssignment_2 ) ) ;
    public final void rule__Exercise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:597:1: ( ( ( rule__Exercise__NameAssignment_2 ) ) )
            // InternalXMarking.g:598:1: ( ( rule__Exercise__NameAssignment_2 ) )
            {
            // InternalXMarking.g:598:1: ( ( rule__Exercise__NameAssignment_2 ) )
            // InternalXMarking.g:599:2: ( rule__Exercise__NameAssignment_2 )
            {
             before(grammarAccess.getExerciseAccess().getNameAssignment_2()); 
            // InternalXMarking.g:600:2: ( rule__Exercise__NameAssignment_2 )
            // InternalXMarking.g:600:3: rule__Exercise__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Exercise__Group__2__Impl"


    // $ANTLR start "rule__Exercise__Group__3"
    // InternalXMarking.g:608:1: rule__Exercise__Group__3 : rule__Exercise__Group__3__Impl rule__Exercise__Group__4 ;
    public final void rule__Exercise__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:612:1: ( rule__Exercise__Group__3__Impl rule__Exercise__Group__4 )
            // InternalXMarking.g:613:2: rule__Exercise__Group__3__Impl rule__Exercise__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Exercise__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__4();

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
    // $ANTLR end "rule__Exercise__Group__3"


    // $ANTLR start "rule__Exercise__Group__3__Impl"
    // InternalXMarking.g:620:1: rule__Exercise__Group__3__Impl : ( '(' ) ;
    public final void rule__Exercise__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:624:1: ( ( '(' ) )
            // InternalXMarking.g:625:1: ( '(' )
            {
            // InternalXMarking.g:625:1: ( '(' )
            // InternalXMarking.g:626:2: '('
            {
             before(grammarAccess.getExerciseAccess().getLeftParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Exercise__Group__3__Impl"


    // $ANTLR start "rule__Exercise__Group__4"
    // InternalXMarking.g:635:1: rule__Exercise__Group__4 : rule__Exercise__Group__4__Impl rule__Exercise__Group__5 ;
    public final void rule__Exercise__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:639:1: ( rule__Exercise__Group__4__Impl rule__Exercise__Group__5 )
            // InternalXMarking.g:640:2: rule__Exercise__Group__4__Impl rule__Exercise__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Exercise__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__5();

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
    // $ANTLR end "rule__Exercise__Group__4"


    // $ANTLR start "rule__Exercise__Group__4__Impl"
    // InternalXMarking.g:647:1: rule__Exercise__Group__4__Impl : ( ( rule__Exercise__ModuleAssignment_4 ) ) ;
    public final void rule__Exercise__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:651:1: ( ( ( rule__Exercise__ModuleAssignment_4 ) ) )
            // InternalXMarking.g:652:1: ( ( rule__Exercise__ModuleAssignment_4 ) )
            {
            // InternalXMarking.g:652:1: ( ( rule__Exercise__ModuleAssignment_4 ) )
            // InternalXMarking.g:653:2: ( rule__Exercise__ModuleAssignment_4 )
            {
             before(grammarAccess.getExerciseAccess().getModuleAssignment_4()); 
            // InternalXMarking.g:654:2: ( rule__Exercise__ModuleAssignment_4 )
            // InternalXMarking.g:654:3: rule__Exercise__ModuleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__ModuleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getModuleAssignment_4()); 

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
    // $ANTLR end "rule__Exercise__Group__4__Impl"


    // $ANTLR start "rule__Exercise__Group__5"
    // InternalXMarking.g:662:1: rule__Exercise__Group__5 : rule__Exercise__Group__5__Impl rule__Exercise__Group__6 ;
    public final void rule__Exercise__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:666:1: ( rule__Exercise__Group__5__Impl rule__Exercise__Group__6 )
            // InternalXMarking.g:667:2: rule__Exercise__Group__5__Impl rule__Exercise__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Exercise__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__6();

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
    // $ANTLR end "rule__Exercise__Group__5"


    // $ANTLR start "rule__Exercise__Group__5__Impl"
    // InternalXMarking.g:674:1: rule__Exercise__Group__5__Impl : ( ')' ) ;
    public final void rule__Exercise__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:678:1: ( ( ')' ) )
            // InternalXMarking.g:679:1: ( ')' )
            {
            // InternalXMarking.g:679:1: ( ')' )
            // InternalXMarking.g:680:2: ')'
            {
             before(grammarAccess.getExerciseAccess().getRightParenthesisKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Exercise__Group__5__Impl"


    // $ANTLR start "rule__Exercise__Group__6"
    // InternalXMarking.g:689:1: rule__Exercise__Group__6 : rule__Exercise__Group__6__Impl rule__Exercise__Group__7 ;
    public final void rule__Exercise__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:693:1: ( rule__Exercise__Group__6__Impl rule__Exercise__Group__7 )
            // InternalXMarking.g:694:2: rule__Exercise__Group__6__Impl rule__Exercise__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Exercise__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__7();

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
    // $ANTLR end "rule__Exercise__Group__6"


    // $ANTLR start "rule__Exercise__Group__6__Impl"
    // InternalXMarking.g:701:1: rule__Exercise__Group__6__Impl : ( ( rule__Exercise__Group_6__0 )? ) ;
    public final void rule__Exercise__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:705:1: ( ( ( rule__Exercise__Group_6__0 )? ) )
            // InternalXMarking.g:706:1: ( ( rule__Exercise__Group_6__0 )? )
            {
            // InternalXMarking.g:706:1: ( ( rule__Exercise__Group_6__0 )? )
            // InternalXMarking.g:707:2: ( rule__Exercise__Group_6__0 )?
            {
             before(grammarAccess.getExerciseAccess().getGroup_6()); 
            // InternalXMarking.g:708:2: ( rule__Exercise__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=15 && LA7_0<=19)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXMarking.g:708:3: rule__Exercise__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exercise__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExerciseAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Exercise__Group__6__Impl"


    // $ANTLR start "rule__Exercise__Group__7"
    // InternalXMarking.g:716:1: rule__Exercise__Group__7 : rule__Exercise__Group__7__Impl rule__Exercise__Group__8 ;
    public final void rule__Exercise__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:720:1: ( rule__Exercise__Group__7__Impl rule__Exercise__Group__8 )
            // InternalXMarking.g:721:2: rule__Exercise__Group__7__Impl rule__Exercise__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Exercise__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__8();

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
    // $ANTLR end "rule__Exercise__Group__7"


    // $ANTLR start "rule__Exercise__Group__7__Impl"
    // InternalXMarking.g:728:1: rule__Exercise__Group__7__Impl : ( ( rule__Exercise__Group_7__0 ) ) ;
    public final void rule__Exercise__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:732:1: ( ( ( rule__Exercise__Group_7__0 ) ) )
            // InternalXMarking.g:733:1: ( ( rule__Exercise__Group_7__0 ) )
            {
            // InternalXMarking.g:733:1: ( ( rule__Exercise__Group_7__0 ) )
            // InternalXMarking.g:734:2: ( rule__Exercise__Group_7__0 )
            {
             before(grammarAccess.getExerciseAccess().getGroup_7()); 
            // InternalXMarking.g:735:2: ( rule__Exercise__Group_7__0 )
            // InternalXMarking.g:735:3: rule__Exercise__Group_7__0
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Exercise__Group__7__Impl"


    // $ANTLR start "rule__Exercise__Group__8"
    // InternalXMarking.g:743:1: rule__Exercise__Group__8 : rule__Exercise__Group__8__Impl rule__Exercise__Group__9 ;
    public final void rule__Exercise__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:747:1: ( rule__Exercise__Group__8__Impl rule__Exercise__Group__9 )
            // InternalXMarking.g:748:2: rule__Exercise__Group__8__Impl rule__Exercise__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Exercise__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__9();

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
    // $ANTLR end "rule__Exercise__Group__8"


    // $ANTLR start "rule__Exercise__Group__8__Impl"
    // InternalXMarking.g:755:1: rule__Exercise__Group__8__Impl : ( ( rule__Exercise__Group_8__0 )? ) ;
    public final void rule__Exercise__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:759:1: ( ( ( rule__Exercise__Group_8__0 )? ) )
            // InternalXMarking.g:760:1: ( ( rule__Exercise__Group_8__0 )? )
            {
            // InternalXMarking.g:760:1: ( ( rule__Exercise__Group_8__0 )? )
            // InternalXMarking.g:761:2: ( rule__Exercise__Group_8__0 )?
            {
             before(grammarAccess.getExerciseAccess().getGroup_8()); 
            // InternalXMarking.g:762:2: ( rule__Exercise__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMarking.g:762:3: rule__Exercise__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exercise__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExerciseAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Exercise__Group__8__Impl"


    // $ANTLR start "rule__Exercise__Group__9"
    // InternalXMarking.g:770:1: rule__Exercise__Group__9 : rule__Exercise__Group__9__Impl rule__Exercise__Group__10 ;
    public final void rule__Exercise__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:774:1: ( rule__Exercise__Group__9__Impl rule__Exercise__Group__10 )
            // InternalXMarking.g:775:2: rule__Exercise__Group__9__Impl rule__Exercise__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Exercise__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__10();

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
    // $ANTLR end "rule__Exercise__Group__9"


    // $ANTLR start "rule__Exercise__Group__9__Impl"
    // InternalXMarking.g:782:1: rule__Exercise__Group__9__Impl : ( ( rule__Exercise__Group_9__0 )? ) ;
    public final void rule__Exercise__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:786:1: ( ( ( rule__Exercise__Group_9__0 )? ) )
            // InternalXMarking.g:787:1: ( ( rule__Exercise__Group_9__0 )? )
            {
            // InternalXMarking.g:787:1: ( ( rule__Exercise__Group_9__0 )? )
            // InternalXMarking.g:788:2: ( rule__Exercise__Group_9__0 )?
            {
             before(grammarAccess.getExerciseAccess().getGroup_9()); 
            // InternalXMarking.g:789:2: ( rule__Exercise__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXMarking.g:789:3: rule__Exercise__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exercise__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExerciseAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Exercise__Group__9__Impl"


    // $ANTLR start "rule__Exercise__Group__10"
    // InternalXMarking.g:797:1: rule__Exercise__Group__10 : rule__Exercise__Group__10__Impl ;
    public final void rule__Exercise__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:801:1: ( rule__Exercise__Group__10__Impl )
            // InternalXMarking.g:802:2: rule__Exercise__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group__10__Impl();

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
    // $ANTLR end "rule__Exercise__Group__10"


    // $ANTLR start "rule__Exercise__Group__10__Impl"
    // InternalXMarking.g:808:1: rule__Exercise__Group__10__Impl : ( 'end' ) ;
    public final void rule__Exercise__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:812:1: ( ( 'end' ) )
            // InternalXMarking.g:813:1: ( 'end' )
            {
            // InternalXMarking.g:813:1: ( 'end' )
            // InternalXMarking.g:814:2: 'end'
            {
             before(grammarAccess.getExerciseAccess().getEndKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getEndKeyword_10()); 

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
    // $ANTLR end "rule__Exercise__Group__10__Impl"


    // $ANTLR start "rule__Exercise__Group_1_1__0"
    // InternalXMarking.g:824:1: rule__Exercise__Group_1_1__0 : rule__Exercise__Group_1_1__0__Impl rule__Exercise__Group_1_1__1 ;
    public final void rule__Exercise__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:828:1: ( rule__Exercise__Group_1_1__0__Impl rule__Exercise__Group_1_1__1 )
            // InternalXMarking.g:829:2: rule__Exercise__Group_1_1__0__Impl rule__Exercise__Group_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Exercise__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_1_1__1();

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
    // $ANTLR end "rule__Exercise__Group_1_1__0"


    // $ANTLR start "rule__Exercise__Group_1_1__0__Impl"
    // InternalXMarking.g:836:1: rule__Exercise__Group_1_1__0__Impl : ( 'problem' ) ;
    public final void rule__Exercise__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:840:1: ( ( 'problem' ) )
            // InternalXMarking.g:841:1: ( 'problem' )
            {
            // InternalXMarking.g:841:1: ( 'problem' )
            // InternalXMarking.g:842:2: 'problem'
            {
             before(grammarAccess.getExerciseAccess().getProblemKeyword_1_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getProblemKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Exercise__Group_1_1__0__Impl"


    // $ANTLR start "rule__Exercise__Group_1_1__1"
    // InternalXMarking.g:851:1: rule__Exercise__Group_1_1__1 : rule__Exercise__Group_1_1__1__Impl ;
    public final void rule__Exercise__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:855:1: ( rule__Exercise__Group_1_1__1__Impl )
            // InternalXMarking.g:856:2: rule__Exercise__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Exercise__Group_1_1__1"


    // $ANTLR start "rule__Exercise__Group_1_1__1__Impl"
    // InternalXMarking.g:862:1: rule__Exercise__Group_1_1__1__Impl : ( 'class' ) ;
    public final void rule__Exercise__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:866:1: ( ( 'class' ) )
            // InternalXMarking.g:867:1: ( 'class' )
            {
            // InternalXMarking.g:867:1: ( 'class' )
            // InternalXMarking.g:868:2: 'class'
            {
             before(grammarAccess.getExerciseAccess().getClassKeyword_1_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getClassKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Exercise__Group_1_1__1__Impl"


    // $ANTLR start "rule__Exercise__Group_6__0"
    // InternalXMarking.g:878:1: rule__Exercise__Group_6__0 : rule__Exercise__Group_6__0__Impl rule__Exercise__Group_6__1 ;
    public final void rule__Exercise__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:882:1: ( rule__Exercise__Group_6__0__Impl rule__Exercise__Group_6__1 )
            // InternalXMarking.g:883:2: rule__Exercise__Group_6__0__Impl rule__Exercise__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__Exercise__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_6__1();

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
    // $ANTLR end "rule__Exercise__Group_6__0"


    // $ANTLR start "rule__Exercise__Group_6__0__Impl"
    // InternalXMarking.g:890:1: rule__Exercise__Group_6__0__Impl : ( ( rule__Exercise__PartsAssignment_6_0 ) ) ;
    public final void rule__Exercise__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:894:1: ( ( ( rule__Exercise__PartsAssignment_6_0 ) ) )
            // InternalXMarking.g:895:1: ( ( rule__Exercise__PartsAssignment_6_0 ) )
            {
            // InternalXMarking.g:895:1: ( ( rule__Exercise__PartsAssignment_6_0 ) )
            // InternalXMarking.g:896:2: ( rule__Exercise__PartsAssignment_6_0 )
            {
             before(grammarAccess.getExerciseAccess().getPartsAssignment_6_0()); 
            // InternalXMarking.g:897:2: ( rule__Exercise__PartsAssignment_6_0 )
            // InternalXMarking.g:897:3: rule__Exercise__PartsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__PartsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getPartsAssignment_6_0()); 

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
    // $ANTLR end "rule__Exercise__Group_6__0__Impl"


    // $ANTLR start "rule__Exercise__Group_6__1"
    // InternalXMarking.g:905:1: rule__Exercise__Group_6__1 : rule__Exercise__Group_6__1__Impl ;
    public final void rule__Exercise__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:909:1: ( rule__Exercise__Group_6__1__Impl )
            // InternalXMarking.g:910:2: rule__Exercise__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_6__1__Impl();

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
    // $ANTLR end "rule__Exercise__Group_6__1"


    // $ANTLR start "rule__Exercise__Group_6__1__Impl"
    // InternalXMarking.g:916:1: rule__Exercise__Group_6__1__Impl : ( ( rule__Exercise__PartsAssignment_6_1 )* ) ;
    public final void rule__Exercise__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:920:1: ( ( ( rule__Exercise__PartsAssignment_6_1 )* ) )
            // InternalXMarking.g:921:1: ( ( rule__Exercise__PartsAssignment_6_1 )* )
            {
            // InternalXMarking.g:921:1: ( ( rule__Exercise__PartsAssignment_6_1 )* )
            // InternalXMarking.g:922:2: ( rule__Exercise__PartsAssignment_6_1 )*
            {
             before(grammarAccess.getExerciseAccess().getPartsAssignment_6_1()); 
            // InternalXMarking.g:923:2: ( rule__Exercise__PartsAssignment_6_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=15 && LA10_0<=19)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXMarking.g:923:3: rule__Exercise__PartsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Exercise__PartsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getExerciseAccess().getPartsAssignment_6_1()); 

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
    // $ANTLR end "rule__Exercise__Group_6__1__Impl"


    // $ANTLR start "rule__Exercise__Group_7__0"
    // InternalXMarking.g:932:1: rule__Exercise__Group_7__0 : rule__Exercise__Group_7__0__Impl rule__Exercise__Group_7__1 ;
    public final void rule__Exercise__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:936:1: ( rule__Exercise__Group_7__0__Impl rule__Exercise__Group_7__1 )
            // InternalXMarking.g:937:2: rule__Exercise__Group_7__0__Impl rule__Exercise__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__Exercise__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_7__1();

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
    // $ANTLR end "rule__Exercise__Group_7__0"


    // $ANTLR start "rule__Exercise__Group_7__0__Impl"
    // InternalXMarking.g:944:1: rule__Exercise__Group_7__0__Impl : ( 'students' ) ;
    public final void rule__Exercise__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:948:1: ( ( 'students' ) )
            // InternalXMarking.g:949:1: ( 'students' )
            {
            // InternalXMarking.g:949:1: ( 'students' )
            // InternalXMarking.g:950:2: 'students'
            {
             before(grammarAccess.getExerciseAccess().getStudentsKeyword_7_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getStudentsKeyword_7_0()); 

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
    // $ANTLR end "rule__Exercise__Group_7__0__Impl"


    // $ANTLR start "rule__Exercise__Group_7__1"
    // InternalXMarking.g:959:1: rule__Exercise__Group_7__1 : rule__Exercise__Group_7__1__Impl rule__Exercise__Group_7__2 ;
    public final void rule__Exercise__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:963:1: ( rule__Exercise__Group_7__1__Impl rule__Exercise__Group_7__2 )
            // InternalXMarking.g:964:2: rule__Exercise__Group_7__1__Impl rule__Exercise__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__Exercise__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_7__2();

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
    // $ANTLR end "rule__Exercise__Group_7__1"


    // $ANTLR start "rule__Exercise__Group_7__1__Impl"
    // InternalXMarking.g:971:1: rule__Exercise__Group_7__1__Impl : ( ( rule__Exercise__StudentsAssignment_7_1 ) ) ;
    public final void rule__Exercise__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:975:1: ( ( ( rule__Exercise__StudentsAssignment_7_1 ) ) )
            // InternalXMarking.g:976:1: ( ( rule__Exercise__StudentsAssignment_7_1 ) )
            {
            // InternalXMarking.g:976:1: ( ( rule__Exercise__StudentsAssignment_7_1 ) )
            // InternalXMarking.g:977:2: ( rule__Exercise__StudentsAssignment_7_1 )
            {
             before(grammarAccess.getExerciseAccess().getStudentsAssignment_7_1()); 
            // InternalXMarking.g:978:2: ( rule__Exercise__StudentsAssignment_7_1 )
            // InternalXMarking.g:978:3: rule__Exercise__StudentsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__StudentsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getStudentsAssignment_7_1()); 

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
    // $ANTLR end "rule__Exercise__Group_7__1__Impl"


    // $ANTLR start "rule__Exercise__Group_7__2"
    // InternalXMarking.g:986:1: rule__Exercise__Group_7__2 : rule__Exercise__Group_7__2__Impl ;
    public final void rule__Exercise__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:990:1: ( rule__Exercise__Group_7__2__Impl )
            // InternalXMarking.g:991:2: rule__Exercise__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_7__2__Impl();

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
    // $ANTLR end "rule__Exercise__Group_7__2"


    // $ANTLR start "rule__Exercise__Group_7__2__Impl"
    // InternalXMarking.g:997:1: rule__Exercise__Group_7__2__Impl : ( ( rule__Exercise__StudentsAssignment_7_2 )* ) ;
    public final void rule__Exercise__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1001:1: ( ( ( rule__Exercise__StudentsAssignment_7_2 )* ) )
            // InternalXMarking.g:1002:1: ( ( rule__Exercise__StudentsAssignment_7_2 )* )
            {
            // InternalXMarking.g:1002:1: ( ( rule__Exercise__StudentsAssignment_7_2 )* )
            // InternalXMarking.g:1003:2: ( rule__Exercise__StudentsAssignment_7_2 )*
            {
             before(grammarAccess.getExerciseAccess().getStudentsAssignment_7_2()); 
            // InternalXMarking.g:1004:2: ( rule__Exercise__StudentsAssignment_7_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXMarking.g:1004:3: rule__Exercise__StudentsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Exercise__StudentsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getExerciseAccess().getStudentsAssignment_7_2()); 

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
    // $ANTLR end "rule__Exercise__Group_7__2__Impl"


    // $ANTLR start "rule__Exercise__Group_8__0"
    // InternalXMarking.g:1013:1: rule__Exercise__Group_8__0 : rule__Exercise__Group_8__0__Impl rule__Exercise__Group_8__1 ;
    public final void rule__Exercise__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1017:1: ( rule__Exercise__Group_8__0__Impl rule__Exercise__Group_8__1 )
            // InternalXMarking.g:1018:2: rule__Exercise__Group_8__0__Impl rule__Exercise__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__Exercise__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_8__1();

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
    // $ANTLR end "rule__Exercise__Group_8__0"


    // $ANTLR start "rule__Exercise__Group_8__0__Impl"
    // InternalXMarking.g:1025:1: rule__Exercise__Group_8__0__Impl : ( 'groups' ) ;
    public final void rule__Exercise__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1029:1: ( ( 'groups' ) )
            // InternalXMarking.g:1030:1: ( 'groups' )
            {
            // InternalXMarking.g:1030:1: ( 'groups' )
            // InternalXMarking.g:1031:2: 'groups'
            {
             before(grammarAccess.getExerciseAccess().getGroupsKeyword_8_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getGroupsKeyword_8_0()); 

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
    // $ANTLR end "rule__Exercise__Group_8__0__Impl"


    // $ANTLR start "rule__Exercise__Group_8__1"
    // InternalXMarking.g:1040:1: rule__Exercise__Group_8__1 : rule__Exercise__Group_8__1__Impl rule__Exercise__Group_8__2 ;
    public final void rule__Exercise__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1044:1: ( rule__Exercise__Group_8__1__Impl rule__Exercise__Group_8__2 )
            // InternalXMarking.g:1045:2: rule__Exercise__Group_8__1__Impl rule__Exercise__Group_8__2
            {
            pushFollow(FOLLOW_12);
            rule__Exercise__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_8__2();

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
    // $ANTLR end "rule__Exercise__Group_8__1"


    // $ANTLR start "rule__Exercise__Group_8__1__Impl"
    // InternalXMarking.g:1052:1: rule__Exercise__Group_8__1__Impl : ( ( rule__Exercise__GroupsAssignment_8_1 ) ) ;
    public final void rule__Exercise__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1056:1: ( ( ( rule__Exercise__GroupsAssignment_8_1 ) ) )
            // InternalXMarking.g:1057:1: ( ( rule__Exercise__GroupsAssignment_8_1 ) )
            {
            // InternalXMarking.g:1057:1: ( ( rule__Exercise__GroupsAssignment_8_1 ) )
            // InternalXMarking.g:1058:2: ( rule__Exercise__GroupsAssignment_8_1 )
            {
             before(grammarAccess.getExerciseAccess().getGroupsAssignment_8_1()); 
            // InternalXMarking.g:1059:2: ( rule__Exercise__GroupsAssignment_8_1 )
            // InternalXMarking.g:1059:3: rule__Exercise__GroupsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__GroupsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getGroupsAssignment_8_1()); 

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
    // $ANTLR end "rule__Exercise__Group_8__1__Impl"


    // $ANTLR start "rule__Exercise__Group_8__2"
    // InternalXMarking.g:1067:1: rule__Exercise__Group_8__2 : rule__Exercise__Group_8__2__Impl ;
    public final void rule__Exercise__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1071:1: ( rule__Exercise__Group_8__2__Impl )
            // InternalXMarking.g:1072:2: rule__Exercise__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_8__2__Impl();

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
    // $ANTLR end "rule__Exercise__Group_8__2"


    // $ANTLR start "rule__Exercise__Group_8__2__Impl"
    // InternalXMarking.g:1078:1: rule__Exercise__Group_8__2__Impl : ( ( rule__Exercise__GroupsAssignment_8_2 )* ) ;
    public final void rule__Exercise__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1082:1: ( ( ( rule__Exercise__GroupsAssignment_8_2 )* ) )
            // InternalXMarking.g:1083:1: ( ( rule__Exercise__GroupsAssignment_8_2 )* )
            {
            // InternalXMarking.g:1083:1: ( ( rule__Exercise__GroupsAssignment_8_2 )* )
            // InternalXMarking.g:1084:2: ( rule__Exercise__GroupsAssignment_8_2 )*
            {
             before(grammarAccess.getExerciseAccess().getGroupsAssignment_8_2()); 
            // InternalXMarking.g:1085:2: ( rule__Exercise__GroupsAssignment_8_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXMarking.g:1085:3: rule__Exercise__GroupsAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Exercise__GroupsAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getExerciseAccess().getGroupsAssignment_8_2()); 

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
    // $ANTLR end "rule__Exercise__Group_8__2__Impl"


    // $ANTLR start "rule__Exercise__Group_9__0"
    // InternalXMarking.g:1094:1: rule__Exercise__Group_9__0 : rule__Exercise__Group_9__0__Impl rule__Exercise__Group_9__1 ;
    public final void rule__Exercise__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1098:1: ( rule__Exercise__Group_9__0__Impl rule__Exercise__Group_9__1 )
            // InternalXMarking.g:1099:2: rule__Exercise__Group_9__0__Impl rule__Exercise__Group_9__1
            {
            pushFollow(FOLLOW_12);
            rule__Exercise__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_9__1();

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
    // $ANTLR end "rule__Exercise__Group_9__0"


    // $ANTLR start "rule__Exercise__Group_9__0__Impl"
    // InternalXMarking.g:1106:1: rule__Exercise__Group_9__0__Impl : ( 'marks' ) ;
    public final void rule__Exercise__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1110:1: ( ( 'marks' ) )
            // InternalXMarking.g:1111:1: ( 'marks' )
            {
            // InternalXMarking.g:1111:1: ( 'marks' )
            // InternalXMarking.g:1112:2: 'marks'
            {
             before(grammarAccess.getExerciseAccess().getMarksKeyword_9_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getMarksKeyword_9_0()); 

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
    // $ANTLR end "rule__Exercise__Group_9__0__Impl"


    // $ANTLR start "rule__Exercise__Group_9__1"
    // InternalXMarking.g:1121:1: rule__Exercise__Group_9__1 : rule__Exercise__Group_9__1__Impl rule__Exercise__Group_9__2 ;
    public final void rule__Exercise__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1125:1: ( rule__Exercise__Group_9__1__Impl rule__Exercise__Group_9__2 )
            // InternalXMarking.g:1126:2: rule__Exercise__Group_9__1__Impl rule__Exercise__Group_9__2
            {
            pushFollow(FOLLOW_12);
            rule__Exercise__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_9__2();

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
    // $ANTLR end "rule__Exercise__Group_9__1"


    // $ANTLR start "rule__Exercise__Group_9__1__Impl"
    // InternalXMarking.g:1133:1: rule__Exercise__Group_9__1__Impl : ( ( rule__Exercise__MarksAssignment_9_1 ) ) ;
    public final void rule__Exercise__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1137:1: ( ( ( rule__Exercise__MarksAssignment_9_1 ) ) )
            // InternalXMarking.g:1138:1: ( ( rule__Exercise__MarksAssignment_9_1 ) )
            {
            // InternalXMarking.g:1138:1: ( ( rule__Exercise__MarksAssignment_9_1 ) )
            // InternalXMarking.g:1139:2: ( rule__Exercise__MarksAssignment_9_1 )
            {
             before(grammarAccess.getExerciseAccess().getMarksAssignment_9_1()); 
            // InternalXMarking.g:1140:2: ( rule__Exercise__MarksAssignment_9_1 )
            // InternalXMarking.g:1140:3: rule__Exercise__MarksAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__MarksAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getMarksAssignment_9_1()); 

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
    // $ANTLR end "rule__Exercise__Group_9__1__Impl"


    // $ANTLR start "rule__Exercise__Group_9__2"
    // InternalXMarking.g:1148:1: rule__Exercise__Group_9__2 : rule__Exercise__Group_9__2__Impl ;
    public final void rule__Exercise__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1152:1: ( rule__Exercise__Group_9__2__Impl )
            // InternalXMarking.g:1153:2: rule__Exercise__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_9__2__Impl();

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
    // $ANTLR end "rule__Exercise__Group_9__2"


    // $ANTLR start "rule__Exercise__Group_9__2__Impl"
    // InternalXMarking.g:1159:1: rule__Exercise__Group_9__2__Impl : ( ( rule__Exercise__MarksAssignment_9_2 )* ) ;
    public final void rule__Exercise__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1163:1: ( ( ( rule__Exercise__MarksAssignment_9_2 )* ) )
            // InternalXMarking.g:1164:1: ( ( rule__Exercise__MarksAssignment_9_2 )* )
            {
            // InternalXMarking.g:1164:1: ( ( rule__Exercise__MarksAssignment_9_2 )* )
            // InternalXMarking.g:1165:2: ( rule__Exercise__MarksAssignment_9_2 )*
            {
             before(grammarAccess.getExerciseAccess().getMarksAssignment_9_2()); 
            // InternalXMarking.g:1166:2: ( rule__Exercise__MarksAssignment_9_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXMarking.g:1166:3: rule__Exercise__MarksAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Exercise__MarksAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getExerciseAccess().getMarksAssignment_9_2()); 

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
    // $ANTLR end "rule__Exercise__Group_9__2__Impl"


    // $ANTLR start "rule__XComment__Group__0"
    // InternalXMarking.g:1175:1: rule__XComment__Group__0 : rule__XComment__Group__0__Impl rule__XComment__Group__1 ;
    public final void rule__XComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1179:1: ( rule__XComment__Group__0__Impl rule__XComment__Group__1 )
            // InternalXMarking.g:1180:2: rule__XComment__Group__0__Impl rule__XComment__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__XComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XComment__Group__1();

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
    // $ANTLR end "rule__XComment__Group__0"


    // $ANTLR start "rule__XComment__Group__0__Impl"
    // InternalXMarking.g:1187:1: rule__XComment__Group__0__Impl : ( ( rule__XComment__NameAssignment_0 ) ) ;
    public final void rule__XComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1191:1: ( ( ( rule__XComment__NameAssignment_0 ) ) )
            // InternalXMarking.g:1192:1: ( ( rule__XComment__NameAssignment_0 ) )
            {
            // InternalXMarking.g:1192:1: ( ( rule__XComment__NameAssignment_0 ) )
            // InternalXMarking.g:1193:2: ( rule__XComment__NameAssignment_0 )
            {
             before(grammarAccess.getXCommentAccess().getNameAssignment_0()); 
            // InternalXMarking.g:1194:2: ( rule__XComment__NameAssignment_0 )
            // InternalXMarking.g:1194:3: rule__XComment__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__XComment__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXCommentAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__XComment__Group__0__Impl"


    // $ANTLR start "rule__XComment__Group__1"
    // InternalXMarking.g:1202:1: rule__XComment__Group__1 : rule__XComment__Group__1__Impl rule__XComment__Group__2 ;
    public final void rule__XComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1206:1: ( rule__XComment__Group__1__Impl rule__XComment__Group__2 )
            // InternalXMarking.g:1207:2: rule__XComment__Group__1__Impl rule__XComment__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__XComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XComment__Group__2();

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
    // $ANTLR end "rule__XComment__Group__1"


    // $ANTLR start "rule__XComment__Group__1__Impl"
    // InternalXMarking.g:1214:1: rule__XComment__Group__1__Impl : ( ':' ) ;
    public final void rule__XComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1218:1: ( ( ':' ) )
            // InternalXMarking.g:1219:1: ( ':' )
            {
            // InternalXMarking.g:1219:1: ( ':' )
            // InternalXMarking.g:1220:2: ':'
            {
             before(grammarAccess.getXCommentAccess().getColonKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getXCommentAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__XComment__Group__1__Impl"


    // $ANTLR start "rule__XComment__Group__2"
    // InternalXMarking.g:1229:1: rule__XComment__Group__2 : rule__XComment__Group__2__Impl ;
    public final void rule__XComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1233:1: ( rule__XComment__Group__2__Impl )
            // InternalXMarking.g:1234:2: rule__XComment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XComment__Group__2__Impl();

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
    // $ANTLR end "rule__XComment__Group__2"


    // $ANTLR start "rule__XComment__Group__2__Impl"
    // InternalXMarking.g:1240:1: rule__XComment__Group__2__Impl : ( ( rule__XComment__CommentAssignment_2 ) ) ;
    public final void rule__XComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1244:1: ( ( ( rule__XComment__CommentAssignment_2 ) ) )
            // InternalXMarking.g:1245:1: ( ( rule__XComment__CommentAssignment_2 ) )
            {
            // InternalXMarking.g:1245:1: ( ( rule__XComment__CommentAssignment_2 ) )
            // InternalXMarking.g:1246:2: ( rule__XComment__CommentAssignment_2 )
            {
             before(grammarAccess.getXCommentAccess().getCommentAssignment_2()); 
            // InternalXMarking.g:1247:2: ( rule__XComment__CommentAssignment_2 )
            // InternalXMarking.g:1247:3: rule__XComment__CommentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XComment__CommentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXCommentAccess().getCommentAssignment_2()); 

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
    // $ANTLR end "rule__XComment__Group__2__Impl"


    // $ANTLR start "rule__XSection__Group__0"
    // InternalXMarking.g:1256:1: rule__XSection__Group__0 : rule__XSection__Group__0__Impl rule__XSection__Group__1 ;
    public final void rule__XSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1260:1: ( rule__XSection__Group__0__Impl rule__XSection__Group__1 )
            // InternalXMarking.g:1261:2: rule__XSection__Group__0__Impl rule__XSection__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__XSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XSection__Group__1();

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
    // $ANTLR end "rule__XSection__Group__0"


    // $ANTLR start "rule__XSection__Group__0__Impl"
    // InternalXMarking.g:1268:1: rule__XSection__Group__0__Impl : ( ( rule__XSection__Alternatives_0 ) ) ;
    public final void rule__XSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1272:1: ( ( ( rule__XSection__Alternatives_0 ) ) )
            // InternalXMarking.g:1273:1: ( ( rule__XSection__Alternatives_0 ) )
            {
            // InternalXMarking.g:1273:1: ( ( rule__XSection__Alternatives_0 ) )
            // InternalXMarking.g:1274:2: ( rule__XSection__Alternatives_0 )
            {
             before(grammarAccess.getXSectionAccess().getAlternatives_0()); 
            // InternalXMarking.g:1275:2: ( rule__XSection__Alternatives_0 )
            // InternalXMarking.g:1275:3: rule__XSection__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__XSection__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getXSectionAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__XSection__Group__0__Impl"


    // $ANTLR start "rule__XSection__Group__1"
    // InternalXMarking.g:1283:1: rule__XSection__Group__1 : rule__XSection__Group__1__Impl rule__XSection__Group__2 ;
    public final void rule__XSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1287:1: ( rule__XSection__Group__1__Impl rule__XSection__Group__2 )
            // InternalXMarking.g:1288:2: rule__XSection__Group__1__Impl rule__XSection__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__XSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XSection__Group__2();

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
    // $ANTLR end "rule__XSection__Group__1"


    // $ANTLR start "rule__XSection__Group__1__Impl"
    // InternalXMarking.g:1295:1: rule__XSection__Group__1__Impl : ( ( rule__XSection__NameAssignment_1 ) ) ;
    public final void rule__XSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1299:1: ( ( ( rule__XSection__NameAssignment_1 ) ) )
            // InternalXMarking.g:1300:1: ( ( rule__XSection__NameAssignment_1 ) )
            {
            // InternalXMarking.g:1300:1: ( ( rule__XSection__NameAssignment_1 ) )
            // InternalXMarking.g:1301:2: ( rule__XSection__NameAssignment_1 )
            {
             before(grammarAccess.getXSectionAccess().getNameAssignment_1()); 
            // InternalXMarking.g:1302:2: ( rule__XSection__NameAssignment_1 )
            // InternalXMarking.g:1302:3: rule__XSection__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XSection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXSectionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__XSection__Group__1__Impl"


    // $ANTLR start "rule__XSection__Group__2"
    // InternalXMarking.g:1310:1: rule__XSection__Group__2 : rule__XSection__Group__2__Impl rule__XSection__Group__3 ;
    public final void rule__XSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1314:1: ( rule__XSection__Group__2__Impl rule__XSection__Group__3 )
            // InternalXMarking.g:1315:2: rule__XSection__Group__2__Impl rule__XSection__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__XSection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XSection__Group__3();

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
    // $ANTLR end "rule__XSection__Group__2"


    // $ANTLR start "rule__XSection__Group__2__Impl"
    // InternalXMarking.g:1322:1: rule__XSection__Group__2__Impl : ( '{' ) ;
    public final void rule__XSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1326:1: ( ( '{' ) )
            // InternalXMarking.g:1327:1: ( '{' )
            {
            // InternalXMarking.g:1327:1: ( '{' )
            // InternalXMarking.g:1328:2: '{'
            {
             before(grammarAccess.getXSectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getXSectionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__XSection__Group__2__Impl"


    // $ANTLR start "rule__XSection__Group__3"
    // InternalXMarking.g:1337:1: rule__XSection__Group__3 : rule__XSection__Group__3__Impl rule__XSection__Group__4 ;
    public final void rule__XSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1341:1: ( rule__XSection__Group__3__Impl rule__XSection__Group__4 )
            // InternalXMarking.g:1342:2: rule__XSection__Group__3__Impl rule__XSection__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__XSection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XSection__Group__4();

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
    // $ANTLR end "rule__XSection__Group__3"


    // $ANTLR start "rule__XSection__Group__3__Impl"
    // InternalXMarking.g:1349:1: rule__XSection__Group__3__Impl : ( ( rule__XSection__Group_3__0 )? ) ;
    public final void rule__XSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1353:1: ( ( ( rule__XSection__Group_3__0 )? ) )
            // InternalXMarking.g:1354:1: ( ( rule__XSection__Group_3__0 )? )
            {
            // InternalXMarking.g:1354:1: ( ( rule__XSection__Group_3__0 )? )
            // InternalXMarking.g:1355:2: ( rule__XSection__Group_3__0 )?
            {
             before(grammarAccess.getXSectionAccess().getGroup_3()); 
            // InternalXMarking.g:1356:2: ( rule__XSection__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMarking.g:1356:3: rule__XSection__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XSection__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXSectionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__XSection__Group__3__Impl"


    // $ANTLR start "rule__XSection__Group__4"
    // InternalXMarking.g:1364:1: rule__XSection__Group__4 : rule__XSection__Group__4__Impl rule__XSection__Group__5 ;
    public final void rule__XSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1368:1: ( rule__XSection__Group__4__Impl rule__XSection__Group__5 )
            // InternalXMarking.g:1369:2: rule__XSection__Group__4__Impl rule__XSection__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__XSection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XSection__Group__5();

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
    // $ANTLR end "rule__XSection__Group__4"


    // $ANTLR start "rule__XSection__Group__4__Impl"
    // InternalXMarking.g:1376:1: rule__XSection__Group__4__Impl : ( ( rule__XSection__SubsectionsAssignment_4 ) ) ;
    public final void rule__XSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1380:1: ( ( ( rule__XSection__SubsectionsAssignment_4 ) ) )
            // InternalXMarking.g:1381:1: ( ( rule__XSection__SubsectionsAssignment_4 ) )
            {
            // InternalXMarking.g:1381:1: ( ( rule__XSection__SubsectionsAssignment_4 ) )
            // InternalXMarking.g:1382:2: ( rule__XSection__SubsectionsAssignment_4 )
            {
             before(grammarAccess.getXSectionAccess().getSubsectionsAssignment_4()); 
            // InternalXMarking.g:1383:2: ( rule__XSection__SubsectionsAssignment_4 )
            // InternalXMarking.g:1383:3: rule__XSection__SubsectionsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XSection__SubsectionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXSectionAccess().getSubsectionsAssignment_4()); 

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
    // $ANTLR end "rule__XSection__Group__4__Impl"


    // $ANTLR start "rule__XSection__Group__5"
    // InternalXMarking.g:1391:1: rule__XSection__Group__5 : rule__XSection__Group__5__Impl rule__XSection__Group__6 ;
    public final void rule__XSection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1395:1: ( rule__XSection__Group__5__Impl rule__XSection__Group__6 )
            // InternalXMarking.g:1396:2: rule__XSection__Group__5__Impl rule__XSection__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__XSection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XSection__Group__6();

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
    // $ANTLR end "rule__XSection__Group__5"


    // $ANTLR start "rule__XSection__Group__5__Impl"
    // InternalXMarking.g:1403:1: rule__XSection__Group__5__Impl : ( ( rule__XSection__SubsectionsAssignment_5 )* ) ;
    public final void rule__XSection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1407:1: ( ( ( rule__XSection__SubsectionsAssignment_5 )* ) )
            // InternalXMarking.g:1408:1: ( ( rule__XSection__SubsectionsAssignment_5 )* )
            {
            // InternalXMarking.g:1408:1: ( ( rule__XSection__SubsectionsAssignment_5 )* )
            // InternalXMarking.g:1409:2: ( rule__XSection__SubsectionsAssignment_5 )*
            {
             before(grammarAccess.getXSectionAccess().getSubsectionsAssignment_5()); 
            // InternalXMarking.g:1410:2: ( rule__XSection__SubsectionsAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=15 && LA15_0<=19)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalXMarking.g:1410:3: rule__XSection__SubsectionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__XSection__SubsectionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getXSectionAccess().getSubsectionsAssignment_5()); 

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
    // $ANTLR end "rule__XSection__Group__5__Impl"


    // $ANTLR start "rule__XSection__Group__6"
    // InternalXMarking.g:1418:1: rule__XSection__Group__6 : rule__XSection__Group__6__Impl ;
    public final void rule__XSection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1422:1: ( rule__XSection__Group__6__Impl )
            // InternalXMarking.g:1423:2: rule__XSection__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XSection__Group__6__Impl();

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
    // $ANTLR end "rule__XSection__Group__6"


    // $ANTLR start "rule__XSection__Group__6__Impl"
    // InternalXMarking.g:1429:1: rule__XSection__Group__6__Impl : ( '}' ) ;
    public final void rule__XSection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1433:1: ( ( '}' ) )
            // InternalXMarking.g:1434:1: ( '}' )
            {
            // InternalXMarking.g:1434:1: ( '}' )
            // InternalXMarking.g:1435:2: '}'
            {
             before(grammarAccess.getXSectionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getXSectionAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__XSection__Group__6__Impl"


    // $ANTLR start "rule__XSection__Group_3__0"
    // InternalXMarking.g:1445:1: rule__XSection__Group_3__0 : rule__XSection__Group_3__0__Impl rule__XSection__Group_3__1 ;
    public final void rule__XSection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1449:1: ( rule__XSection__Group_3__0__Impl rule__XSection__Group_3__1 )
            // InternalXMarking.g:1450:2: rule__XSection__Group_3__0__Impl rule__XSection__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__XSection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XSection__Group_3__1();

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
    // $ANTLR end "rule__XSection__Group_3__0"


    // $ANTLR start "rule__XSection__Group_3__0__Impl"
    // InternalXMarking.g:1457:1: rule__XSection__Group_3__0__Impl : ( ( rule__XSection__CommentsAssignment_3_0 ) ) ;
    public final void rule__XSection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1461:1: ( ( ( rule__XSection__CommentsAssignment_3_0 ) ) )
            // InternalXMarking.g:1462:1: ( ( rule__XSection__CommentsAssignment_3_0 ) )
            {
            // InternalXMarking.g:1462:1: ( ( rule__XSection__CommentsAssignment_3_0 ) )
            // InternalXMarking.g:1463:2: ( rule__XSection__CommentsAssignment_3_0 )
            {
             before(grammarAccess.getXSectionAccess().getCommentsAssignment_3_0()); 
            // InternalXMarking.g:1464:2: ( rule__XSection__CommentsAssignment_3_0 )
            // InternalXMarking.g:1464:3: rule__XSection__CommentsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__XSection__CommentsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getXSectionAccess().getCommentsAssignment_3_0()); 

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
    // $ANTLR end "rule__XSection__Group_3__0__Impl"


    // $ANTLR start "rule__XSection__Group_3__1"
    // InternalXMarking.g:1472:1: rule__XSection__Group_3__1 : rule__XSection__Group_3__1__Impl ;
    public final void rule__XSection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1476:1: ( rule__XSection__Group_3__1__Impl )
            // InternalXMarking.g:1477:2: rule__XSection__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XSection__Group_3__1__Impl();

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
    // $ANTLR end "rule__XSection__Group_3__1"


    // $ANTLR start "rule__XSection__Group_3__1__Impl"
    // InternalXMarking.g:1483:1: rule__XSection__Group_3__1__Impl : ( ( rule__XSection__CommentsAssignment_3_1 )* ) ;
    public final void rule__XSection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1487:1: ( ( ( rule__XSection__CommentsAssignment_3_1 )* ) )
            // InternalXMarking.g:1488:1: ( ( rule__XSection__CommentsAssignment_3_1 )* )
            {
            // InternalXMarking.g:1488:1: ( ( rule__XSection__CommentsAssignment_3_1 )* )
            // InternalXMarking.g:1489:2: ( rule__XSection__CommentsAssignment_3_1 )*
            {
             before(grammarAccess.getXSectionAccess().getCommentsAssignment_3_1()); 
            // InternalXMarking.g:1490:2: ( rule__XSection__CommentsAssignment_3_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalXMarking.g:1490:3: rule__XSection__CommentsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__XSection__CommentsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getXSectionAccess().getCommentsAssignment_3_1()); 

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
    // $ANTLR end "rule__XSection__Group_3__1__Impl"


    // $ANTLR start "rule__XQuestion__Group__0"
    // InternalXMarking.g:1499:1: rule__XQuestion__Group__0 : rule__XQuestion__Group__0__Impl rule__XQuestion__Group__1 ;
    public final void rule__XQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1503:1: ( rule__XQuestion__Group__0__Impl rule__XQuestion__Group__1 )
            // InternalXMarking.g:1504:2: rule__XQuestion__Group__0__Impl rule__XQuestion__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XQuestion__Group__1();

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
    // $ANTLR end "rule__XQuestion__Group__0"


    // $ANTLR start "rule__XQuestion__Group__0__Impl"
    // InternalXMarking.g:1511:1: rule__XQuestion__Group__0__Impl : ( () ) ;
    public final void rule__XQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1515:1: ( ( () ) )
            // InternalXMarking.g:1516:1: ( () )
            {
            // InternalXMarking.g:1516:1: ( () )
            // InternalXMarking.g:1517:2: ()
            {
             before(grammarAccess.getXQuestionAccess().getQuestionAction_0()); 
            // InternalXMarking.g:1518:2: ()
            // InternalXMarking.g:1518:3: 
            {
            }

             after(grammarAccess.getXQuestionAccess().getQuestionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XQuestion__Group__0__Impl"


    // $ANTLR start "rule__XQuestion__Group__1"
    // InternalXMarking.g:1526:1: rule__XQuestion__Group__1 : rule__XQuestion__Group__1__Impl rule__XQuestion__Group__2 ;
    public final void rule__XQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1530:1: ( rule__XQuestion__Group__1__Impl rule__XQuestion__Group__2 )
            // InternalXMarking.g:1531:2: rule__XQuestion__Group__1__Impl rule__XQuestion__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__XQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XQuestion__Group__2();

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
    // $ANTLR end "rule__XQuestion__Group__1"


    // $ANTLR start "rule__XQuestion__Group__1__Impl"
    // InternalXMarking.g:1538:1: rule__XQuestion__Group__1__Impl : ( ( rule__XQuestion__Alternatives_1 ) ) ;
    public final void rule__XQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1542:1: ( ( ( rule__XQuestion__Alternatives_1 ) ) )
            // InternalXMarking.g:1543:1: ( ( rule__XQuestion__Alternatives_1 ) )
            {
            // InternalXMarking.g:1543:1: ( ( rule__XQuestion__Alternatives_1 ) )
            // InternalXMarking.g:1544:2: ( rule__XQuestion__Alternatives_1 )
            {
             before(grammarAccess.getXQuestionAccess().getAlternatives_1()); 
            // InternalXMarking.g:1545:2: ( rule__XQuestion__Alternatives_1 )
            // InternalXMarking.g:1545:3: rule__XQuestion__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__XQuestion__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getXQuestionAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__XQuestion__Group__1__Impl"


    // $ANTLR start "rule__XQuestion__Group__2"
    // InternalXMarking.g:1553:1: rule__XQuestion__Group__2 : rule__XQuestion__Group__2__Impl rule__XQuestion__Group__3 ;
    public final void rule__XQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1557:1: ( rule__XQuestion__Group__2__Impl rule__XQuestion__Group__3 )
            // InternalXMarking.g:1558:2: rule__XQuestion__Group__2__Impl rule__XQuestion__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__XQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XQuestion__Group__3();

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
    // $ANTLR end "rule__XQuestion__Group__2"


    // $ANTLR start "rule__XQuestion__Group__2__Impl"
    // InternalXMarking.g:1565:1: rule__XQuestion__Group__2__Impl : ( ( rule__XQuestion__NameAssignment_2 ) ) ;
    public final void rule__XQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1569:1: ( ( ( rule__XQuestion__NameAssignment_2 ) ) )
            // InternalXMarking.g:1570:1: ( ( rule__XQuestion__NameAssignment_2 ) )
            {
            // InternalXMarking.g:1570:1: ( ( rule__XQuestion__NameAssignment_2 ) )
            // InternalXMarking.g:1571:2: ( rule__XQuestion__NameAssignment_2 )
            {
             before(grammarAccess.getXQuestionAccess().getNameAssignment_2()); 
            // InternalXMarking.g:1572:2: ( rule__XQuestion__NameAssignment_2 )
            // InternalXMarking.g:1572:3: rule__XQuestion__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XQuestion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXQuestionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__XQuestion__Group__2__Impl"


    // $ANTLR start "rule__XQuestion__Group__3"
    // InternalXMarking.g:1580:1: rule__XQuestion__Group__3 : rule__XQuestion__Group__3__Impl rule__XQuestion__Group__4 ;
    public final void rule__XQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1584:1: ( rule__XQuestion__Group__3__Impl rule__XQuestion__Group__4 )
            // InternalXMarking.g:1585:2: rule__XQuestion__Group__3__Impl rule__XQuestion__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__XQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XQuestion__Group__4();

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
    // $ANTLR end "rule__XQuestion__Group__3"


    // $ANTLR start "rule__XQuestion__Group__3__Impl"
    // InternalXMarking.g:1592:1: rule__XQuestion__Group__3__Impl : ( ( rule__XQuestion__GradeAssignment_3 ) ) ;
    public final void rule__XQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1596:1: ( ( ( rule__XQuestion__GradeAssignment_3 ) ) )
            // InternalXMarking.g:1597:1: ( ( rule__XQuestion__GradeAssignment_3 ) )
            {
            // InternalXMarking.g:1597:1: ( ( rule__XQuestion__GradeAssignment_3 ) )
            // InternalXMarking.g:1598:2: ( rule__XQuestion__GradeAssignment_3 )
            {
             before(grammarAccess.getXQuestionAccess().getGradeAssignment_3()); 
            // InternalXMarking.g:1599:2: ( rule__XQuestion__GradeAssignment_3 )
            // InternalXMarking.g:1599:3: rule__XQuestion__GradeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XQuestion__GradeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXQuestionAccess().getGradeAssignment_3()); 

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
    // $ANTLR end "rule__XQuestion__Group__3__Impl"


    // $ANTLR start "rule__XQuestion__Group__4"
    // InternalXMarking.g:1607:1: rule__XQuestion__Group__4 : rule__XQuestion__Group__4__Impl ;
    public final void rule__XQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1611:1: ( rule__XQuestion__Group__4__Impl )
            // InternalXMarking.g:1612:2: rule__XQuestion__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XQuestion__Group__4__Impl();

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
    // $ANTLR end "rule__XQuestion__Group__4"


    // $ANTLR start "rule__XQuestion__Group__4__Impl"
    // InternalXMarking.g:1618:1: rule__XQuestion__Group__4__Impl : ( ( rule__XQuestion__Group_4__0 )? ) ;
    public final void rule__XQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1622:1: ( ( ( rule__XQuestion__Group_4__0 )? ) )
            // InternalXMarking.g:1623:1: ( ( rule__XQuestion__Group_4__0 )? )
            {
            // InternalXMarking.g:1623:1: ( ( rule__XQuestion__Group_4__0 )? )
            // InternalXMarking.g:1624:2: ( rule__XQuestion__Group_4__0 )?
            {
             before(grammarAccess.getXQuestionAccess().getGroup_4()); 
            // InternalXMarking.g:1625:2: ( rule__XQuestion__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXMarking.g:1625:3: rule__XQuestion__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XQuestion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXQuestionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__XQuestion__Group__4__Impl"


    // $ANTLR start "rule__XQuestion__Group_4__0"
    // InternalXMarking.g:1634:1: rule__XQuestion__Group_4__0 : rule__XQuestion__Group_4__0__Impl rule__XQuestion__Group_4__1 ;
    public final void rule__XQuestion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1638:1: ( rule__XQuestion__Group_4__0__Impl rule__XQuestion__Group_4__1 )
            // InternalXMarking.g:1639:2: rule__XQuestion__Group_4__0__Impl rule__XQuestion__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__XQuestion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XQuestion__Group_4__1();

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
    // $ANTLR end "rule__XQuestion__Group_4__0"


    // $ANTLR start "rule__XQuestion__Group_4__0__Impl"
    // InternalXMarking.g:1646:1: rule__XQuestion__Group_4__0__Impl : ( ( rule__XQuestion__CommentsAssignment_4_0 ) ) ;
    public final void rule__XQuestion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1650:1: ( ( ( rule__XQuestion__CommentsAssignment_4_0 ) ) )
            // InternalXMarking.g:1651:1: ( ( rule__XQuestion__CommentsAssignment_4_0 ) )
            {
            // InternalXMarking.g:1651:1: ( ( rule__XQuestion__CommentsAssignment_4_0 ) )
            // InternalXMarking.g:1652:2: ( rule__XQuestion__CommentsAssignment_4_0 )
            {
             before(grammarAccess.getXQuestionAccess().getCommentsAssignment_4_0()); 
            // InternalXMarking.g:1653:2: ( rule__XQuestion__CommentsAssignment_4_0 )
            // InternalXMarking.g:1653:3: rule__XQuestion__CommentsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__XQuestion__CommentsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getXQuestionAccess().getCommentsAssignment_4_0()); 

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
    // $ANTLR end "rule__XQuestion__Group_4__0__Impl"


    // $ANTLR start "rule__XQuestion__Group_4__1"
    // InternalXMarking.g:1661:1: rule__XQuestion__Group_4__1 : rule__XQuestion__Group_4__1__Impl ;
    public final void rule__XQuestion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1665:1: ( rule__XQuestion__Group_4__1__Impl )
            // InternalXMarking.g:1666:2: rule__XQuestion__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XQuestion__Group_4__1__Impl();

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
    // $ANTLR end "rule__XQuestion__Group_4__1"


    // $ANTLR start "rule__XQuestion__Group_4__1__Impl"
    // InternalXMarking.g:1672:1: rule__XQuestion__Group_4__1__Impl : ( ( rule__XQuestion__CommentsAssignment_4_1 )* ) ;
    public final void rule__XQuestion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1676:1: ( ( ( rule__XQuestion__CommentsAssignment_4_1 )* ) )
            // InternalXMarking.g:1677:1: ( ( rule__XQuestion__CommentsAssignment_4_1 )* )
            {
            // InternalXMarking.g:1677:1: ( ( rule__XQuestion__CommentsAssignment_4_1 )* )
            // InternalXMarking.g:1678:2: ( rule__XQuestion__CommentsAssignment_4_1 )*
            {
             before(grammarAccess.getXQuestionAccess().getCommentsAssignment_4_1()); 
            // InternalXMarking.g:1679:2: ( rule__XQuestion__CommentsAssignment_4_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXMarking.g:1679:3: rule__XQuestion__CommentsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__XQuestion__CommentsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getXQuestionAccess().getCommentsAssignment_4_1()); 

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
    // $ANTLR end "rule__XQuestion__Group_4__1__Impl"


    // $ANTLR start "rule__XStudent__Group__0"
    // InternalXMarking.g:1688:1: rule__XStudent__Group__0 : rule__XStudent__Group__0__Impl rule__XStudent__Group__1 ;
    public final void rule__XStudent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1692:1: ( rule__XStudent__Group__0__Impl rule__XStudent__Group__1 )
            // InternalXMarking.g:1693:2: rule__XStudent__Group__0__Impl rule__XStudent__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__XStudent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XStudent__Group__1();

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
    // $ANTLR end "rule__XStudent__Group__0"


    // $ANTLR start "rule__XStudent__Group__0__Impl"
    // InternalXMarking.g:1700:1: rule__XStudent__Group__0__Impl : ( ( rule__XStudent__NameAssignment_0 ) ) ;
    public final void rule__XStudent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1704:1: ( ( ( rule__XStudent__NameAssignment_0 ) ) )
            // InternalXMarking.g:1705:1: ( ( rule__XStudent__NameAssignment_0 ) )
            {
            // InternalXMarking.g:1705:1: ( ( rule__XStudent__NameAssignment_0 ) )
            // InternalXMarking.g:1706:2: ( rule__XStudent__NameAssignment_0 )
            {
             before(grammarAccess.getXStudentAccess().getNameAssignment_0()); 
            // InternalXMarking.g:1707:2: ( rule__XStudent__NameAssignment_0 )
            // InternalXMarking.g:1707:3: rule__XStudent__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__XStudent__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXStudentAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__XStudent__Group__0__Impl"


    // $ANTLR start "rule__XStudent__Group__1"
    // InternalXMarking.g:1715:1: rule__XStudent__Group__1 : rule__XStudent__Group__1__Impl rule__XStudent__Group__2 ;
    public final void rule__XStudent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1719:1: ( rule__XStudent__Group__1__Impl rule__XStudent__Group__2 )
            // InternalXMarking.g:1720:2: rule__XStudent__Group__1__Impl rule__XStudent__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__XStudent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XStudent__Group__2();

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
    // $ANTLR end "rule__XStudent__Group__1"


    // $ANTLR start "rule__XStudent__Group__1__Impl"
    // InternalXMarking.g:1727:1: rule__XStudent__Group__1__Impl : ( ':' ) ;
    public final void rule__XStudent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1731:1: ( ( ':' ) )
            // InternalXMarking.g:1732:1: ( ':' )
            {
            // InternalXMarking.g:1732:1: ( ':' )
            // InternalXMarking.g:1733:2: ':'
            {
             before(grammarAccess.getXStudentAccess().getColonKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getXStudentAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__XStudent__Group__1__Impl"


    // $ANTLR start "rule__XStudent__Group__2"
    // InternalXMarking.g:1742:1: rule__XStudent__Group__2 : rule__XStudent__Group__2__Impl rule__XStudent__Group__3 ;
    public final void rule__XStudent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1746:1: ( rule__XStudent__Group__2__Impl rule__XStudent__Group__3 )
            // InternalXMarking.g:1747:2: rule__XStudent__Group__2__Impl rule__XStudent__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__XStudent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XStudent__Group__3();

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
    // $ANTLR end "rule__XStudent__Group__2"


    // $ANTLR start "rule__XStudent__Group__2__Impl"
    // InternalXMarking.g:1754:1: rule__XStudent__Group__2__Impl : ( ( rule__XStudent__FirstnameAssignment_2 ) ) ;
    public final void rule__XStudent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1758:1: ( ( ( rule__XStudent__FirstnameAssignment_2 ) ) )
            // InternalXMarking.g:1759:1: ( ( rule__XStudent__FirstnameAssignment_2 ) )
            {
            // InternalXMarking.g:1759:1: ( ( rule__XStudent__FirstnameAssignment_2 ) )
            // InternalXMarking.g:1760:2: ( rule__XStudent__FirstnameAssignment_2 )
            {
             before(grammarAccess.getXStudentAccess().getFirstnameAssignment_2()); 
            // InternalXMarking.g:1761:2: ( rule__XStudent__FirstnameAssignment_2 )
            // InternalXMarking.g:1761:3: rule__XStudent__FirstnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XStudent__FirstnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXStudentAccess().getFirstnameAssignment_2()); 

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
    // $ANTLR end "rule__XStudent__Group__2__Impl"


    // $ANTLR start "rule__XStudent__Group__3"
    // InternalXMarking.g:1769:1: rule__XStudent__Group__3 : rule__XStudent__Group__3__Impl ;
    public final void rule__XStudent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1773:1: ( rule__XStudent__Group__3__Impl )
            // InternalXMarking.g:1774:2: rule__XStudent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XStudent__Group__3__Impl();

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
    // $ANTLR end "rule__XStudent__Group__3"


    // $ANTLR start "rule__XStudent__Group__3__Impl"
    // InternalXMarking.g:1780:1: rule__XStudent__Group__3__Impl : ( ( rule__XStudent__LastnameAssignment_3 ) ) ;
    public final void rule__XStudent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1784:1: ( ( ( rule__XStudent__LastnameAssignment_3 ) ) )
            // InternalXMarking.g:1785:1: ( ( rule__XStudent__LastnameAssignment_3 ) )
            {
            // InternalXMarking.g:1785:1: ( ( rule__XStudent__LastnameAssignment_3 ) )
            // InternalXMarking.g:1786:2: ( rule__XStudent__LastnameAssignment_3 )
            {
             before(grammarAccess.getXStudentAccess().getLastnameAssignment_3()); 
            // InternalXMarking.g:1787:2: ( rule__XStudent__LastnameAssignment_3 )
            // InternalXMarking.g:1787:3: rule__XStudent__LastnameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XStudent__LastnameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXStudentAccess().getLastnameAssignment_3()); 

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
    // $ANTLR end "rule__XStudent__Group__3__Impl"


    // $ANTLR start "rule__XGroup__Group__0"
    // InternalXMarking.g:1796:1: rule__XGroup__Group__0 : rule__XGroup__Group__0__Impl rule__XGroup__Group__1 ;
    public final void rule__XGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1800:1: ( rule__XGroup__Group__0__Impl rule__XGroup__Group__1 )
            // InternalXMarking.g:1801:2: rule__XGroup__Group__0__Impl rule__XGroup__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__XGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group__1();

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
    // $ANTLR end "rule__XGroup__Group__0"


    // $ANTLR start "rule__XGroup__Group__0__Impl"
    // InternalXMarking.g:1808:1: rule__XGroup__Group__0__Impl : ( ( rule__XGroup__NameAssignment_0 ) ) ;
    public final void rule__XGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1812:1: ( ( ( rule__XGroup__NameAssignment_0 ) ) )
            // InternalXMarking.g:1813:1: ( ( rule__XGroup__NameAssignment_0 ) )
            {
            // InternalXMarking.g:1813:1: ( ( rule__XGroup__NameAssignment_0 ) )
            // InternalXMarking.g:1814:2: ( rule__XGroup__NameAssignment_0 )
            {
             before(grammarAccess.getXGroupAccess().getNameAssignment_0()); 
            // InternalXMarking.g:1815:2: ( rule__XGroup__NameAssignment_0 )
            // InternalXMarking.g:1815:3: rule__XGroup__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXGroupAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__XGroup__Group__0__Impl"


    // $ANTLR start "rule__XGroup__Group__1"
    // InternalXMarking.g:1823:1: rule__XGroup__Group__1 : rule__XGroup__Group__1__Impl rule__XGroup__Group__2 ;
    public final void rule__XGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1827:1: ( rule__XGroup__Group__1__Impl rule__XGroup__Group__2 )
            // InternalXMarking.g:1828:2: rule__XGroup__Group__1__Impl rule__XGroup__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__XGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group__2();

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
    // $ANTLR end "rule__XGroup__Group__1"


    // $ANTLR start "rule__XGroup__Group__1__Impl"
    // InternalXMarking.g:1835:1: rule__XGroup__Group__1__Impl : ( '{' ) ;
    public final void rule__XGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1839:1: ( ( '{' ) )
            // InternalXMarking.g:1840:1: ( '{' )
            {
            // InternalXMarking.g:1840:1: ( '{' )
            // InternalXMarking.g:1841:2: '{'
            {
             before(grammarAccess.getXGroupAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__XGroup__Group__1__Impl"


    // $ANTLR start "rule__XGroup__Group__2"
    // InternalXMarking.g:1850:1: rule__XGroup__Group__2 : rule__XGroup__Group__2__Impl rule__XGroup__Group__3 ;
    public final void rule__XGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1854:1: ( rule__XGroup__Group__2__Impl rule__XGroup__Group__3 )
            // InternalXMarking.g:1855:2: rule__XGroup__Group__2__Impl rule__XGroup__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__XGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group__3();

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
    // $ANTLR end "rule__XGroup__Group__2"


    // $ANTLR start "rule__XGroup__Group__2__Impl"
    // InternalXMarking.g:1862:1: rule__XGroup__Group__2__Impl : ( ( rule__XGroup__StudentsAssignment_2 ) ) ;
    public final void rule__XGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1866:1: ( ( ( rule__XGroup__StudentsAssignment_2 ) ) )
            // InternalXMarking.g:1867:1: ( ( rule__XGroup__StudentsAssignment_2 ) )
            {
            // InternalXMarking.g:1867:1: ( ( rule__XGroup__StudentsAssignment_2 ) )
            // InternalXMarking.g:1868:2: ( rule__XGroup__StudentsAssignment_2 )
            {
             before(grammarAccess.getXGroupAccess().getStudentsAssignment_2()); 
            // InternalXMarking.g:1869:2: ( rule__XGroup__StudentsAssignment_2 )
            // InternalXMarking.g:1869:3: rule__XGroup__StudentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__StudentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXGroupAccess().getStudentsAssignment_2()); 

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
    // $ANTLR end "rule__XGroup__Group__2__Impl"


    // $ANTLR start "rule__XGroup__Group__3"
    // InternalXMarking.g:1877:1: rule__XGroup__Group__3 : rule__XGroup__Group__3__Impl rule__XGroup__Group__4 ;
    public final void rule__XGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1881:1: ( rule__XGroup__Group__3__Impl rule__XGroup__Group__4 )
            // InternalXMarking.g:1882:2: rule__XGroup__Group__3__Impl rule__XGroup__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__XGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGroup__Group__4();

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
    // $ANTLR end "rule__XGroup__Group__3"


    // $ANTLR start "rule__XGroup__Group__3__Impl"
    // InternalXMarking.g:1889:1: rule__XGroup__Group__3__Impl : ( ( rule__XGroup__StudentsAssignment_3 )* ) ;
    public final void rule__XGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1893:1: ( ( ( rule__XGroup__StudentsAssignment_3 )* ) )
            // InternalXMarking.g:1894:1: ( ( rule__XGroup__StudentsAssignment_3 )* )
            {
            // InternalXMarking.g:1894:1: ( ( rule__XGroup__StudentsAssignment_3 )* )
            // InternalXMarking.g:1895:2: ( rule__XGroup__StudentsAssignment_3 )*
            {
             before(grammarAccess.getXGroupAccess().getStudentsAssignment_3()); 
            // InternalXMarking.g:1896:2: ( rule__XGroup__StudentsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalXMarking.g:1896:3: rule__XGroup__StudentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__XGroup__StudentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getXGroupAccess().getStudentsAssignment_3()); 

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
    // $ANTLR end "rule__XGroup__Group__3__Impl"


    // $ANTLR start "rule__XGroup__Group__4"
    // InternalXMarking.g:1904:1: rule__XGroup__Group__4 : rule__XGroup__Group__4__Impl ;
    public final void rule__XGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1908:1: ( rule__XGroup__Group__4__Impl )
            // InternalXMarking.g:1909:2: rule__XGroup__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGroup__Group__4__Impl();

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
    // $ANTLR end "rule__XGroup__Group__4"


    // $ANTLR start "rule__XGroup__Group__4__Impl"
    // InternalXMarking.g:1915:1: rule__XGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__XGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1919:1: ( ( '}' ) )
            // InternalXMarking.g:1920:1: ( '}' )
            {
            // InternalXMarking.g:1920:1: ( '}' )
            // InternalXMarking.g:1921:2: '}'
            {
             before(grammarAccess.getXGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__XGroup__Group__4__Impl"


    // $ANTLR start "rule__XMark__Group__0"
    // InternalXMarking.g:1931:1: rule__XMark__Group__0 : rule__XMark__Group__0__Impl rule__XMark__Group__1 ;
    public final void rule__XMark__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1935:1: ( rule__XMark__Group__0__Impl rule__XMark__Group__1 )
            // InternalXMarking.g:1936:2: rule__XMark__Group__0__Impl rule__XMark__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__XMark__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMark__Group__1();

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
    // $ANTLR end "rule__XMark__Group__0"


    // $ANTLR start "rule__XMark__Group__0__Impl"
    // InternalXMarking.g:1943:1: rule__XMark__Group__0__Impl : ( () ) ;
    public final void rule__XMark__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1947:1: ( ( () ) )
            // InternalXMarking.g:1948:1: ( () )
            {
            // InternalXMarking.g:1948:1: ( () )
            // InternalXMarking.g:1949:2: ()
            {
             before(grammarAccess.getXMarkAccess().getMarkAction_0()); 
            // InternalXMarking.g:1950:2: ()
            // InternalXMarking.g:1950:3: 
            {
            }

             after(grammarAccess.getXMarkAccess().getMarkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMark__Group__0__Impl"


    // $ANTLR start "rule__XMark__Group__1"
    // InternalXMarking.g:1958:1: rule__XMark__Group__1 : rule__XMark__Group__1__Impl rule__XMark__Group__2 ;
    public final void rule__XMark__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1962:1: ( rule__XMark__Group__1__Impl rule__XMark__Group__2 )
            // InternalXMarking.g:1963:2: rule__XMark__Group__1__Impl rule__XMark__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__XMark__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMark__Group__2();

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
    // $ANTLR end "rule__XMark__Group__1"


    // $ANTLR start "rule__XMark__Group__1__Impl"
    // InternalXMarking.g:1970:1: rule__XMark__Group__1__Impl : ( ( rule__XMark__RecipientAssignment_1 ) ) ;
    public final void rule__XMark__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1974:1: ( ( ( rule__XMark__RecipientAssignment_1 ) ) )
            // InternalXMarking.g:1975:1: ( ( rule__XMark__RecipientAssignment_1 ) )
            {
            // InternalXMarking.g:1975:1: ( ( rule__XMark__RecipientAssignment_1 ) )
            // InternalXMarking.g:1976:2: ( rule__XMark__RecipientAssignment_1 )
            {
             before(grammarAccess.getXMarkAccess().getRecipientAssignment_1()); 
            // InternalXMarking.g:1977:2: ( rule__XMark__RecipientAssignment_1 )
            // InternalXMarking.g:1977:3: rule__XMark__RecipientAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XMark__RecipientAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXMarkAccess().getRecipientAssignment_1()); 

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
    // $ANTLR end "rule__XMark__Group__1__Impl"


    // $ANTLR start "rule__XMark__Group__2"
    // InternalXMarking.g:1985:1: rule__XMark__Group__2 : rule__XMark__Group__2__Impl rule__XMark__Group__3 ;
    public final void rule__XMark__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:1989:1: ( rule__XMark__Group__2__Impl rule__XMark__Group__3 )
            // InternalXMarking.g:1990:2: rule__XMark__Group__2__Impl rule__XMark__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__XMark__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMark__Group__3();

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
    // $ANTLR end "rule__XMark__Group__2"


    // $ANTLR start "rule__XMark__Group__2__Impl"
    // InternalXMarking.g:1997:1: rule__XMark__Group__2__Impl : ( ':' ) ;
    public final void rule__XMark__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2001:1: ( ( ':' ) )
            // InternalXMarking.g:2002:1: ( ':' )
            {
            // InternalXMarking.g:2002:1: ( ':' )
            // InternalXMarking.g:2003:2: ':'
            {
             before(grammarAccess.getXMarkAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getXMarkAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__XMark__Group__2__Impl"


    // $ANTLR start "rule__XMark__Group__3"
    // InternalXMarking.g:2012:1: rule__XMark__Group__3 : rule__XMark__Group__3__Impl rule__XMark__Group__4 ;
    public final void rule__XMark__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2016:1: ( rule__XMark__Group__3__Impl rule__XMark__Group__4 )
            // InternalXMarking.g:2017:2: rule__XMark__Group__3__Impl rule__XMark__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__XMark__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMark__Group__4();

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
    // $ANTLR end "rule__XMark__Group__3"


    // $ANTLR start "rule__XMark__Group__3__Impl"
    // InternalXMarking.g:2024:1: rule__XMark__Group__3__Impl : ( 'begin' ) ;
    public final void rule__XMark__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2028:1: ( ( 'begin' ) )
            // InternalXMarking.g:2029:1: ( 'begin' )
            {
            // InternalXMarking.g:2029:1: ( 'begin' )
            // InternalXMarking.g:2030:2: 'begin'
            {
             before(grammarAccess.getXMarkAccess().getBeginKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getXMarkAccess().getBeginKeyword_3()); 

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
    // $ANTLR end "rule__XMark__Group__3__Impl"


    // $ANTLR start "rule__XMark__Group__4"
    // InternalXMarking.g:2039:1: rule__XMark__Group__4 : rule__XMark__Group__4__Impl rule__XMark__Group__5 ;
    public final void rule__XMark__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2043:1: ( rule__XMark__Group__4__Impl rule__XMark__Group__5 )
            // InternalXMarking.g:2044:2: rule__XMark__Group__4__Impl rule__XMark__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__XMark__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMark__Group__5();

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
    // $ANTLR end "rule__XMark__Group__4"


    // $ANTLR start "rule__XMark__Group__4__Impl"
    // InternalXMarking.g:2051:1: rule__XMark__Group__4__Impl : ( ( rule__XMark__GradeAssignment_4 ) ) ;
    public final void rule__XMark__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2055:1: ( ( ( rule__XMark__GradeAssignment_4 ) ) )
            // InternalXMarking.g:2056:1: ( ( rule__XMark__GradeAssignment_4 ) )
            {
            // InternalXMarking.g:2056:1: ( ( rule__XMark__GradeAssignment_4 ) )
            // InternalXMarking.g:2057:2: ( rule__XMark__GradeAssignment_4 )
            {
             before(grammarAccess.getXMarkAccess().getGradeAssignment_4()); 
            // InternalXMarking.g:2058:2: ( rule__XMark__GradeAssignment_4 )
            // InternalXMarking.g:2058:3: rule__XMark__GradeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XMark__GradeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXMarkAccess().getGradeAssignment_4()); 

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
    // $ANTLR end "rule__XMark__Group__4__Impl"


    // $ANTLR start "rule__XMark__Group__5"
    // InternalXMarking.g:2066:1: rule__XMark__Group__5 : rule__XMark__Group__5__Impl rule__XMark__Group__6 ;
    public final void rule__XMark__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2070:1: ( rule__XMark__Group__5__Impl rule__XMark__Group__6 )
            // InternalXMarking.g:2071:2: rule__XMark__Group__5__Impl rule__XMark__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__XMark__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XMark__Group__6();

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
    // $ANTLR end "rule__XMark__Group__5"


    // $ANTLR start "rule__XMark__Group__5__Impl"
    // InternalXMarking.g:2078:1: rule__XMark__Group__5__Impl : ( ( rule__XMark__GradeAssignment_5 )* ) ;
    public final void rule__XMark__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2082:1: ( ( ( rule__XMark__GradeAssignment_5 )* ) )
            // InternalXMarking.g:2083:1: ( ( rule__XMark__GradeAssignment_5 )* )
            {
            // InternalXMarking.g:2083:1: ( ( rule__XMark__GradeAssignment_5 )* )
            // InternalXMarking.g:2084:2: ( rule__XMark__GradeAssignment_5 )*
            {
             before(grammarAccess.getXMarkAccess().getGradeAssignment_5()); 
            // InternalXMarking.g:2085:2: ( rule__XMark__GradeAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalXMarking.g:2085:3: rule__XMark__GradeAssignment_5
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__XMark__GradeAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getXMarkAccess().getGradeAssignment_5()); 

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
    // $ANTLR end "rule__XMark__Group__5__Impl"


    // $ANTLR start "rule__XMark__Group__6"
    // InternalXMarking.g:2093:1: rule__XMark__Group__6 : rule__XMark__Group__6__Impl ;
    public final void rule__XMark__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2097:1: ( rule__XMark__Group__6__Impl )
            // InternalXMarking.g:2098:2: rule__XMark__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XMark__Group__6__Impl();

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
    // $ANTLR end "rule__XMark__Group__6"


    // $ANTLR start "rule__XMark__Group__6__Impl"
    // InternalXMarking.g:2104:1: rule__XMark__Group__6__Impl : ( 'end' ) ;
    public final void rule__XMark__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2108:1: ( ( 'end' ) )
            // InternalXMarking.g:2109:1: ( 'end' )
            {
            // InternalXMarking.g:2109:1: ( 'end' )
            // InternalXMarking.g:2110:2: 'end'
            {
             before(grammarAccess.getXMarkAccess().getEndKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getXMarkAccess().getEndKeyword_6()); 

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
    // $ANTLR end "rule__XMark__Group__6__Impl"


    // $ANTLR start "rule__SectionGrade__Group__0"
    // InternalXMarking.g:2120:1: rule__SectionGrade__Group__0 : rule__SectionGrade__Group__0__Impl rule__SectionGrade__Group__1 ;
    public final void rule__SectionGrade__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2124:1: ( rule__SectionGrade__Group__0__Impl rule__SectionGrade__Group__1 )
            // InternalXMarking.g:2125:2: rule__SectionGrade__Group__0__Impl rule__SectionGrade__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__SectionGrade__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionGrade__Group__1();

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
    // $ANTLR end "rule__SectionGrade__Group__0"


    // $ANTLR start "rule__SectionGrade__Group__0__Impl"
    // InternalXMarking.g:2132:1: rule__SectionGrade__Group__0__Impl : ( ( rule__SectionGrade__PartAssignment_0 ) ) ;
    public final void rule__SectionGrade__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2136:1: ( ( ( rule__SectionGrade__PartAssignment_0 ) ) )
            // InternalXMarking.g:2137:1: ( ( rule__SectionGrade__PartAssignment_0 ) )
            {
            // InternalXMarking.g:2137:1: ( ( rule__SectionGrade__PartAssignment_0 ) )
            // InternalXMarking.g:2138:2: ( rule__SectionGrade__PartAssignment_0 )
            {
             before(grammarAccess.getSectionGradeAccess().getPartAssignment_0()); 
            // InternalXMarking.g:2139:2: ( rule__SectionGrade__PartAssignment_0 )
            // InternalXMarking.g:2139:3: rule__SectionGrade__PartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SectionGrade__PartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSectionGradeAccess().getPartAssignment_0()); 

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
    // $ANTLR end "rule__SectionGrade__Group__0__Impl"


    // $ANTLR start "rule__SectionGrade__Group__1"
    // InternalXMarking.g:2147:1: rule__SectionGrade__Group__1 : rule__SectionGrade__Group__1__Impl rule__SectionGrade__Group__2 ;
    public final void rule__SectionGrade__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2151:1: ( rule__SectionGrade__Group__1__Impl rule__SectionGrade__Group__2 )
            // InternalXMarking.g:2152:2: rule__SectionGrade__Group__1__Impl rule__SectionGrade__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__SectionGrade__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionGrade__Group__2();

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
    // $ANTLR end "rule__SectionGrade__Group__1"


    // $ANTLR start "rule__SectionGrade__Group__1__Impl"
    // InternalXMarking.g:2159:1: rule__SectionGrade__Group__1__Impl : ( ( rule__SectionGrade__Group_1__0 )? ) ;
    public final void rule__SectionGrade__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2163:1: ( ( ( rule__SectionGrade__Group_1__0 )? ) )
            // InternalXMarking.g:2164:1: ( ( rule__SectionGrade__Group_1__0 )? )
            {
            // InternalXMarking.g:2164:1: ( ( rule__SectionGrade__Group_1__0 )? )
            // InternalXMarking.g:2165:2: ( rule__SectionGrade__Group_1__0 )?
            {
             before(grammarAccess.getSectionGradeAccess().getGroup_1()); 
            // InternalXMarking.g:2166:2: ( rule__SectionGrade__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXMarking.g:2166:3: rule__SectionGrade__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SectionGrade__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionGradeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SectionGrade__Group__1__Impl"


    // $ANTLR start "rule__SectionGrade__Group__2"
    // InternalXMarking.g:2174:1: rule__SectionGrade__Group__2 : rule__SectionGrade__Group__2__Impl rule__SectionGrade__Group__3 ;
    public final void rule__SectionGrade__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2178:1: ( rule__SectionGrade__Group__2__Impl rule__SectionGrade__Group__3 )
            // InternalXMarking.g:2179:2: rule__SectionGrade__Group__2__Impl rule__SectionGrade__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SectionGrade__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionGrade__Group__3();

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
    // $ANTLR end "rule__SectionGrade__Group__2"


    // $ANTLR start "rule__SectionGrade__Group__2__Impl"
    // InternalXMarking.g:2186:1: rule__SectionGrade__Group__2__Impl : ( '{' ) ;
    public final void rule__SectionGrade__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2190:1: ( ( '{' ) )
            // InternalXMarking.g:2191:1: ( '{' )
            {
            // InternalXMarking.g:2191:1: ( '{' )
            // InternalXMarking.g:2192:2: '{'
            {
             before(grammarAccess.getSectionGradeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSectionGradeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SectionGrade__Group__2__Impl"


    // $ANTLR start "rule__SectionGrade__Group__3"
    // InternalXMarking.g:2201:1: rule__SectionGrade__Group__3 : rule__SectionGrade__Group__3__Impl rule__SectionGrade__Group__4 ;
    public final void rule__SectionGrade__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2205:1: ( rule__SectionGrade__Group__3__Impl rule__SectionGrade__Group__4 )
            // InternalXMarking.g:2206:2: rule__SectionGrade__Group__3__Impl rule__SectionGrade__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__SectionGrade__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionGrade__Group__4();

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
    // $ANTLR end "rule__SectionGrade__Group__3"


    // $ANTLR start "rule__SectionGrade__Group__3__Impl"
    // InternalXMarking.g:2213:1: rule__SectionGrade__Group__3__Impl : ( ( rule__SectionGrade__SubgradesAssignment_3 ) ) ;
    public final void rule__SectionGrade__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2217:1: ( ( ( rule__SectionGrade__SubgradesAssignment_3 ) ) )
            // InternalXMarking.g:2218:1: ( ( rule__SectionGrade__SubgradesAssignment_3 ) )
            {
            // InternalXMarking.g:2218:1: ( ( rule__SectionGrade__SubgradesAssignment_3 ) )
            // InternalXMarking.g:2219:2: ( rule__SectionGrade__SubgradesAssignment_3 )
            {
             before(grammarAccess.getSectionGradeAccess().getSubgradesAssignment_3()); 
            // InternalXMarking.g:2220:2: ( rule__SectionGrade__SubgradesAssignment_3 )
            // InternalXMarking.g:2220:3: rule__SectionGrade__SubgradesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SectionGrade__SubgradesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSectionGradeAccess().getSubgradesAssignment_3()); 

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
    // $ANTLR end "rule__SectionGrade__Group__3__Impl"


    // $ANTLR start "rule__SectionGrade__Group__4"
    // InternalXMarking.g:2228:1: rule__SectionGrade__Group__4 : rule__SectionGrade__Group__4__Impl rule__SectionGrade__Group__5 ;
    public final void rule__SectionGrade__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2232:1: ( rule__SectionGrade__Group__4__Impl rule__SectionGrade__Group__5 )
            // InternalXMarking.g:2233:2: rule__SectionGrade__Group__4__Impl rule__SectionGrade__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__SectionGrade__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionGrade__Group__5();

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
    // $ANTLR end "rule__SectionGrade__Group__4"


    // $ANTLR start "rule__SectionGrade__Group__4__Impl"
    // InternalXMarking.g:2240:1: rule__SectionGrade__Group__4__Impl : ( ( rule__SectionGrade__SubgradesAssignment_4 )* ) ;
    public final void rule__SectionGrade__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2244:1: ( ( ( rule__SectionGrade__SubgradesAssignment_4 )* ) )
            // InternalXMarking.g:2245:1: ( ( rule__SectionGrade__SubgradesAssignment_4 )* )
            {
            // InternalXMarking.g:2245:1: ( ( rule__SectionGrade__SubgradesAssignment_4 )* )
            // InternalXMarking.g:2246:2: ( rule__SectionGrade__SubgradesAssignment_4 )*
            {
             before(grammarAccess.getSectionGradeAccess().getSubgradesAssignment_4()); 
            // InternalXMarking.g:2247:2: ( rule__SectionGrade__SubgradesAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXMarking.g:2247:3: rule__SectionGrade__SubgradesAssignment_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SectionGrade__SubgradesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSectionGradeAccess().getSubgradesAssignment_4()); 

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
    // $ANTLR end "rule__SectionGrade__Group__4__Impl"


    // $ANTLR start "rule__SectionGrade__Group__5"
    // InternalXMarking.g:2255:1: rule__SectionGrade__Group__5 : rule__SectionGrade__Group__5__Impl ;
    public final void rule__SectionGrade__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2259:1: ( rule__SectionGrade__Group__5__Impl )
            // InternalXMarking.g:2260:2: rule__SectionGrade__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SectionGrade__Group__5__Impl();

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
    // $ANTLR end "rule__SectionGrade__Group__5"


    // $ANTLR start "rule__SectionGrade__Group__5__Impl"
    // InternalXMarking.g:2266:1: rule__SectionGrade__Group__5__Impl : ( '}' ) ;
    public final void rule__SectionGrade__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2270:1: ( ( '}' ) )
            // InternalXMarking.g:2271:1: ( '}' )
            {
            // InternalXMarking.g:2271:1: ( '}' )
            // InternalXMarking.g:2272:2: '}'
            {
             before(grammarAccess.getSectionGradeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSectionGradeAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__SectionGrade__Group__5__Impl"


    // $ANTLR start "rule__SectionGrade__Group_1__0"
    // InternalXMarking.g:2282:1: rule__SectionGrade__Group_1__0 : rule__SectionGrade__Group_1__0__Impl rule__SectionGrade__Group_1__1 ;
    public final void rule__SectionGrade__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2286:1: ( rule__SectionGrade__Group_1__0__Impl rule__SectionGrade__Group_1__1 )
            // InternalXMarking.g:2287:2: rule__SectionGrade__Group_1__0__Impl rule__SectionGrade__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__SectionGrade__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionGrade__Group_1__1();

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
    // $ANTLR end "rule__SectionGrade__Group_1__0"


    // $ANTLR start "rule__SectionGrade__Group_1__0__Impl"
    // InternalXMarking.g:2294:1: rule__SectionGrade__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SectionGrade__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2298:1: ( ( '(' ) )
            // InternalXMarking.g:2299:1: ( '(' )
            {
            // InternalXMarking.g:2299:1: ( '(' )
            // InternalXMarking.g:2300:2: '('
            {
             before(grammarAccess.getSectionGradeAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSectionGradeAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__SectionGrade__Group_1__0__Impl"


    // $ANTLR start "rule__SectionGrade__Group_1__1"
    // InternalXMarking.g:2309:1: rule__SectionGrade__Group_1__1 : rule__SectionGrade__Group_1__1__Impl rule__SectionGrade__Group_1__2 ;
    public final void rule__SectionGrade__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2313:1: ( rule__SectionGrade__Group_1__1__Impl rule__SectionGrade__Group_1__2 )
            // InternalXMarking.g:2314:2: rule__SectionGrade__Group_1__1__Impl rule__SectionGrade__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__SectionGrade__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionGrade__Group_1__2();

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
    // $ANTLR end "rule__SectionGrade__Group_1__1"


    // $ANTLR start "rule__SectionGrade__Group_1__1__Impl"
    // InternalXMarking.g:2321:1: rule__SectionGrade__Group_1__1__Impl : ( ( rule__SectionGrade__CommentsAssignment_1_1 ) ) ;
    public final void rule__SectionGrade__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2325:1: ( ( ( rule__SectionGrade__CommentsAssignment_1_1 ) ) )
            // InternalXMarking.g:2326:1: ( ( rule__SectionGrade__CommentsAssignment_1_1 ) )
            {
            // InternalXMarking.g:2326:1: ( ( rule__SectionGrade__CommentsAssignment_1_1 ) )
            // InternalXMarking.g:2327:2: ( rule__SectionGrade__CommentsAssignment_1_1 )
            {
             before(grammarAccess.getSectionGradeAccess().getCommentsAssignment_1_1()); 
            // InternalXMarking.g:2328:2: ( rule__SectionGrade__CommentsAssignment_1_1 )
            // InternalXMarking.g:2328:3: rule__SectionGrade__CommentsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SectionGrade__CommentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionGradeAccess().getCommentsAssignment_1_1()); 

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
    // $ANTLR end "rule__SectionGrade__Group_1__1__Impl"


    // $ANTLR start "rule__SectionGrade__Group_1__2"
    // InternalXMarking.g:2336:1: rule__SectionGrade__Group_1__2 : rule__SectionGrade__Group_1__2__Impl rule__SectionGrade__Group_1__3 ;
    public final void rule__SectionGrade__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2340:1: ( rule__SectionGrade__Group_1__2__Impl rule__SectionGrade__Group_1__3 )
            // InternalXMarking.g:2341:2: rule__SectionGrade__Group_1__2__Impl rule__SectionGrade__Group_1__3
            {
            pushFollow(FOLLOW_26);
            rule__SectionGrade__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionGrade__Group_1__3();

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
    // $ANTLR end "rule__SectionGrade__Group_1__2"


    // $ANTLR start "rule__SectionGrade__Group_1__2__Impl"
    // InternalXMarking.g:2348:1: rule__SectionGrade__Group_1__2__Impl : ( ( rule__SectionGrade__CommentsAssignment_1_2 )* ) ;
    public final void rule__SectionGrade__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2352:1: ( ( ( rule__SectionGrade__CommentsAssignment_1_2 )* ) )
            // InternalXMarking.g:2353:1: ( ( rule__SectionGrade__CommentsAssignment_1_2 )* )
            {
            // InternalXMarking.g:2353:1: ( ( rule__SectionGrade__CommentsAssignment_1_2 )* )
            // InternalXMarking.g:2354:2: ( rule__SectionGrade__CommentsAssignment_1_2 )*
            {
             before(grammarAccess.getSectionGradeAccess().getCommentsAssignment_1_2()); 
            // InternalXMarking.g:2355:2: ( rule__SectionGrade__CommentsAssignment_1_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXMarking.g:2355:3: rule__SectionGrade__CommentsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SectionGrade__CommentsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSectionGradeAccess().getCommentsAssignment_1_2()); 

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
    // $ANTLR end "rule__SectionGrade__Group_1__2__Impl"


    // $ANTLR start "rule__SectionGrade__Group_1__3"
    // InternalXMarking.g:2363:1: rule__SectionGrade__Group_1__3 : rule__SectionGrade__Group_1__3__Impl ;
    public final void rule__SectionGrade__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2367:1: ( rule__SectionGrade__Group_1__3__Impl )
            // InternalXMarking.g:2368:2: rule__SectionGrade__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SectionGrade__Group_1__3__Impl();

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
    // $ANTLR end "rule__SectionGrade__Group_1__3"


    // $ANTLR start "rule__SectionGrade__Group_1__3__Impl"
    // InternalXMarking.g:2374:1: rule__SectionGrade__Group_1__3__Impl : ( ')' ) ;
    public final void rule__SectionGrade__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2378:1: ( ( ')' ) )
            // InternalXMarking.g:2379:1: ( ')' )
            {
            // InternalXMarking.g:2379:1: ( ')' )
            // InternalXMarking.g:2380:2: ')'
            {
             before(grammarAccess.getSectionGradeAccess().getRightParenthesisKeyword_1_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSectionGradeAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__SectionGrade__Group_1__3__Impl"


    // $ANTLR start "rule__QuestionGrade__Group__0"
    // InternalXMarking.g:2390:1: rule__QuestionGrade__Group__0 : rule__QuestionGrade__Group__0__Impl rule__QuestionGrade__Group__1 ;
    public final void rule__QuestionGrade__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2394:1: ( rule__QuestionGrade__Group__0__Impl rule__QuestionGrade__Group__1 )
            // InternalXMarking.g:2395:2: rule__QuestionGrade__Group__0__Impl rule__QuestionGrade__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__QuestionGrade__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGrade__Group__1();

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
    // $ANTLR end "rule__QuestionGrade__Group__0"


    // $ANTLR start "rule__QuestionGrade__Group__0__Impl"
    // InternalXMarking.g:2402:1: rule__QuestionGrade__Group__0__Impl : ( ( rule__QuestionGrade__PartAssignment_0 ) ) ;
    public final void rule__QuestionGrade__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2406:1: ( ( ( rule__QuestionGrade__PartAssignment_0 ) ) )
            // InternalXMarking.g:2407:1: ( ( rule__QuestionGrade__PartAssignment_0 ) )
            {
            // InternalXMarking.g:2407:1: ( ( rule__QuestionGrade__PartAssignment_0 ) )
            // InternalXMarking.g:2408:2: ( rule__QuestionGrade__PartAssignment_0 )
            {
             before(grammarAccess.getQuestionGradeAccess().getPartAssignment_0()); 
            // InternalXMarking.g:2409:2: ( rule__QuestionGrade__PartAssignment_0 )
            // InternalXMarking.g:2409:3: rule__QuestionGrade__PartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGrade__PartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGradeAccess().getPartAssignment_0()); 

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
    // $ANTLR end "rule__QuestionGrade__Group__0__Impl"


    // $ANTLR start "rule__QuestionGrade__Group__1"
    // InternalXMarking.g:2417:1: rule__QuestionGrade__Group__1 : rule__QuestionGrade__Group__1__Impl rule__QuestionGrade__Group__2 ;
    public final void rule__QuestionGrade__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2421:1: ( rule__QuestionGrade__Group__1__Impl rule__QuestionGrade__Group__2 )
            // InternalXMarking.g:2422:2: rule__QuestionGrade__Group__1__Impl rule__QuestionGrade__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__QuestionGrade__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGrade__Group__2();

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
    // $ANTLR end "rule__QuestionGrade__Group__1"


    // $ANTLR start "rule__QuestionGrade__Group__1__Impl"
    // InternalXMarking.g:2429:1: rule__QuestionGrade__Group__1__Impl : ( ( rule__QuestionGrade__MarkAssignment_1 ) ) ;
    public final void rule__QuestionGrade__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2433:1: ( ( ( rule__QuestionGrade__MarkAssignment_1 ) ) )
            // InternalXMarking.g:2434:1: ( ( rule__QuestionGrade__MarkAssignment_1 ) )
            {
            // InternalXMarking.g:2434:1: ( ( rule__QuestionGrade__MarkAssignment_1 ) )
            // InternalXMarking.g:2435:2: ( rule__QuestionGrade__MarkAssignment_1 )
            {
             before(grammarAccess.getQuestionGradeAccess().getMarkAssignment_1()); 
            // InternalXMarking.g:2436:2: ( rule__QuestionGrade__MarkAssignment_1 )
            // InternalXMarking.g:2436:3: rule__QuestionGrade__MarkAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGrade__MarkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGradeAccess().getMarkAssignment_1()); 

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
    // $ANTLR end "rule__QuestionGrade__Group__1__Impl"


    // $ANTLR start "rule__QuestionGrade__Group__2"
    // InternalXMarking.g:2444:1: rule__QuestionGrade__Group__2 : rule__QuestionGrade__Group__2__Impl ;
    public final void rule__QuestionGrade__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2448:1: ( rule__QuestionGrade__Group__2__Impl )
            // InternalXMarking.g:2449:2: rule__QuestionGrade__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGrade__Group__2__Impl();

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
    // $ANTLR end "rule__QuestionGrade__Group__2"


    // $ANTLR start "rule__QuestionGrade__Group__2__Impl"
    // InternalXMarking.g:2455:1: rule__QuestionGrade__Group__2__Impl : ( ( rule__QuestionGrade__Group_2__0 )? ) ;
    public final void rule__QuestionGrade__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2459:1: ( ( ( rule__QuestionGrade__Group_2__0 )? ) )
            // InternalXMarking.g:2460:1: ( ( rule__QuestionGrade__Group_2__0 )? )
            {
            // InternalXMarking.g:2460:1: ( ( rule__QuestionGrade__Group_2__0 )? )
            // InternalXMarking.g:2461:2: ( rule__QuestionGrade__Group_2__0 )?
            {
             before(grammarAccess.getQuestionGradeAccess().getGroup_2()); 
            // InternalXMarking.g:2462:2: ( rule__QuestionGrade__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXMarking.g:2462:3: rule__QuestionGrade__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionGrade__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionGradeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__QuestionGrade__Group__2__Impl"


    // $ANTLR start "rule__QuestionGrade__Group_2__0"
    // InternalXMarking.g:2471:1: rule__QuestionGrade__Group_2__0 : rule__QuestionGrade__Group_2__0__Impl rule__QuestionGrade__Group_2__1 ;
    public final void rule__QuestionGrade__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2475:1: ( rule__QuestionGrade__Group_2__0__Impl rule__QuestionGrade__Group_2__1 )
            // InternalXMarking.g:2476:2: rule__QuestionGrade__Group_2__0__Impl rule__QuestionGrade__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__QuestionGrade__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGrade__Group_2__1();

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
    // $ANTLR end "rule__QuestionGrade__Group_2__0"


    // $ANTLR start "rule__QuestionGrade__Group_2__0__Impl"
    // InternalXMarking.g:2483:1: rule__QuestionGrade__Group_2__0__Impl : ( '(' ) ;
    public final void rule__QuestionGrade__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2487:1: ( ( '(' ) )
            // InternalXMarking.g:2488:1: ( '(' )
            {
            // InternalXMarking.g:2488:1: ( '(' )
            // InternalXMarking.g:2489:2: '('
            {
             before(grammarAccess.getQuestionGradeAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQuestionGradeAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__QuestionGrade__Group_2__0__Impl"


    // $ANTLR start "rule__QuestionGrade__Group_2__1"
    // InternalXMarking.g:2498:1: rule__QuestionGrade__Group_2__1 : rule__QuestionGrade__Group_2__1__Impl rule__QuestionGrade__Group_2__2 ;
    public final void rule__QuestionGrade__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2502:1: ( rule__QuestionGrade__Group_2__1__Impl rule__QuestionGrade__Group_2__2 )
            // InternalXMarking.g:2503:2: rule__QuestionGrade__Group_2__1__Impl rule__QuestionGrade__Group_2__2
            {
            pushFollow(FOLLOW_28);
            rule__QuestionGrade__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGrade__Group_2__2();

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
    // $ANTLR end "rule__QuestionGrade__Group_2__1"


    // $ANTLR start "rule__QuestionGrade__Group_2__1__Impl"
    // InternalXMarking.g:2510:1: rule__QuestionGrade__Group_2__1__Impl : ( ( rule__QuestionGrade__CommentsAssignment_2_1 ) ) ;
    public final void rule__QuestionGrade__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2514:1: ( ( ( rule__QuestionGrade__CommentsAssignment_2_1 ) ) )
            // InternalXMarking.g:2515:1: ( ( rule__QuestionGrade__CommentsAssignment_2_1 ) )
            {
            // InternalXMarking.g:2515:1: ( ( rule__QuestionGrade__CommentsAssignment_2_1 ) )
            // InternalXMarking.g:2516:2: ( rule__QuestionGrade__CommentsAssignment_2_1 )
            {
             before(grammarAccess.getQuestionGradeAccess().getCommentsAssignment_2_1()); 
            // InternalXMarking.g:2517:2: ( rule__QuestionGrade__CommentsAssignment_2_1 )
            // InternalXMarking.g:2517:3: rule__QuestionGrade__CommentsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGrade__CommentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGradeAccess().getCommentsAssignment_2_1()); 

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
    // $ANTLR end "rule__QuestionGrade__Group_2__1__Impl"


    // $ANTLR start "rule__QuestionGrade__Group_2__2"
    // InternalXMarking.g:2525:1: rule__QuestionGrade__Group_2__2 : rule__QuestionGrade__Group_2__2__Impl rule__QuestionGrade__Group_2__3 ;
    public final void rule__QuestionGrade__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2529:1: ( rule__QuestionGrade__Group_2__2__Impl rule__QuestionGrade__Group_2__3 )
            // InternalXMarking.g:2530:2: rule__QuestionGrade__Group_2__2__Impl rule__QuestionGrade__Group_2__3
            {
            pushFollow(FOLLOW_28);
            rule__QuestionGrade__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGrade__Group_2__3();

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
    // $ANTLR end "rule__QuestionGrade__Group_2__2"


    // $ANTLR start "rule__QuestionGrade__Group_2__2__Impl"
    // InternalXMarking.g:2537:1: rule__QuestionGrade__Group_2__2__Impl : ( ( rule__QuestionGrade__Group_2_2__0 )* ) ;
    public final void rule__QuestionGrade__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2541:1: ( ( ( rule__QuestionGrade__Group_2_2__0 )* ) )
            // InternalXMarking.g:2542:1: ( ( rule__QuestionGrade__Group_2_2__0 )* )
            {
            // InternalXMarking.g:2542:1: ( ( rule__QuestionGrade__Group_2_2__0 )* )
            // InternalXMarking.g:2543:2: ( rule__QuestionGrade__Group_2_2__0 )*
            {
             before(grammarAccess.getQuestionGradeAccess().getGroup_2_2()); 
            // InternalXMarking.g:2544:2: ( rule__QuestionGrade__Group_2_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==32) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalXMarking.g:2544:3: rule__QuestionGrade__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__QuestionGrade__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getQuestionGradeAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__QuestionGrade__Group_2__2__Impl"


    // $ANTLR start "rule__QuestionGrade__Group_2__3"
    // InternalXMarking.g:2552:1: rule__QuestionGrade__Group_2__3 : rule__QuestionGrade__Group_2__3__Impl ;
    public final void rule__QuestionGrade__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2556:1: ( rule__QuestionGrade__Group_2__3__Impl )
            // InternalXMarking.g:2557:2: rule__QuestionGrade__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGrade__Group_2__3__Impl();

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
    // $ANTLR end "rule__QuestionGrade__Group_2__3"


    // $ANTLR start "rule__QuestionGrade__Group_2__3__Impl"
    // InternalXMarking.g:2563:1: rule__QuestionGrade__Group_2__3__Impl : ( ')' ) ;
    public final void rule__QuestionGrade__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2567:1: ( ( ')' ) )
            // InternalXMarking.g:2568:1: ( ')' )
            {
            // InternalXMarking.g:2568:1: ( ')' )
            // InternalXMarking.g:2569:2: ')'
            {
             before(grammarAccess.getQuestionGradeAccess().getRightParenthesisKeyword_2_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getQuestionGradeAccess().getRightParenthesisKeyword_2_3()); 

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
    // $ANTLR end "rule__QuestionGrade__Group_2__3__Impl"


    // $ANTLR start "rule__QuestionGrade__Group_2_2__0"
    // InternalXMarking.g:2579:1: rule__QuestionGrade__Group_2_2__0 : rule__QuestionGrade__Group_2_2__0__Impl rule__QuestionGrade__Group_2_2__1 ;
    public final void rule__QuestionGrade__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2583:1: ( rule__QuestionGrade__Group_2_2__0__Impl rule__QuestionGrade__Group_2_2__1 )
            // InternalXMarking.g:2584:2: rule__QuestionGrade__Group_2_2__0__Impl rule__QuestionGrade__Group_2_2__1
            {
            pushFollow(FOLLOW_4);
            rule__QuestionGrade__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGrade__Group_2_2__1();

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
    // $ANTLR end "rule__QuestionGrade__Group_2_2__0"


    // $ANTLR start "rule__QuestionGrade__Group_2_2__0__Impl"
    // InternalXMarking.g:2591:1: rule__QuestionGrade__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__QuestionGrade__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2595:1: ( ( ',' ) )
            // InternalXMarking.g:2596:1: ( ',' )
            {
            // InternalXMarking.g:2596:1: ( ',' )
            // InternalXMarking.g:2597:2: ','
            {
             before(grammarAccess.getQuestionGradeAccess().getCommaKeyword_2_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQuestionGradeAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__QuestionGrade__Group_2_2__0__Impl"


    // $ANTLR start "rule__QuestionGrade__Group_2_2__1"
    // InternalXMarking.g:2606:1: rule__QuestionGrade__Group_2_2__1 : rule__QuestionGrade__Group_2_2__1__Impl ;
    public final void rule__QuestionGrade__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2610:1: ( rule__QuestionGrade__Group_2_2__1__Impl )
            // InternalXMarking.g:2611:2: rule__QuestionGrade__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGrade__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__QuestionGrade__Group_2_2__1"


    // $ANTLR start "rule__QuestionGrade__Group_2_2__1__Impl"
    // InternalXMarking.g:2617:1: rule__QuestionGrade__Group_2_2__1__Impl : ( ( rule__QuestionGrade__CommentsAssignment_2_2_1 ) ) ;
    public final void rule__QuestionGrade__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2621:1: ( ( ( rule__QuestionGrade__CommentsAssignment_2_2_1 ) ) )
            // InternalXMarking.g:2622:1: ( ( rule__QuestionGrade__CommentsAssignment_2_2_1 ) )
            {
            // InternalXMarking.g:2622:1: ( ( rule__QuestionGrade__CommentsAssignment_2_2_1 ) )
            // InternalXMarking.g:2623:2: ( rule__QuestionGrade__CommentsAssignment_2_2_1 )
            {
             before(grammarAccess.getQuestionGradeAccess().getCommentsAssignment_2_2_1()); 
            // InternalXMarking.g:2624:2: ( rule__QuestionGrade__CommentsAssignment_2_2_1 )
            // InternalXMarking.g:2624:3: rule__QuestionGrade__CommentsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGrade__CommentsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGradeAccess().getCommentsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__QuestionGrade__Group_2_2__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalXMarking.g:2633:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2637:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalXMarking.g:2638:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalXMarking.g:2645:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2649:1: ( ( ( '-' )? ) )
            // InternalXMarking.g:2650:1: ( ( '-' )? )
            {
            // InternalXMarking.g:2650:1: ( ( '-' )? )
            // InternalXMarking.g:2651:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalXMarking.g:2652:2: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXMarking.g:2652:3: '-'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalXMarking.g:2660:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2664:1: ( rule__EInt__Group__1__Impl )
            // InternalXMarking.g:2665:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalXMarking.g:2671:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2675:1: ( ( RULE_INT ) )
            // InternalXMarking.g:2676:1: ( RULE_INT )
            {
            // InternalXMarking.g:2676:1: ( RULE_INT )
            // InternalXMarking.g:2677:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Exercise__NameAssignment_2"
    // InternalXMarking.g:2687:1: rule__Exercise__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Exercise__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2691:1: ( ( ruleEString ) )
            // InternalXMarking.g:2692:2: ( ruleEString )
            {
            // InternalXMarking.g:2692:2: ( ruleEString )
            // InternalXMarking.g:2693:3: ruleEString
            {
             before(grammarAccess.getExerciseAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExerciseAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Exercise__NameAssignment_2"


    // $ANTLR start "rule__Exercise__ModuleAssignment_4"
    // InternalXMarking.g:2702:1: rule__Exercise__ModuleAssignment_4 : ( ruleEString ) ;
    public final void rule__Exercise__ModuleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2706:1: ( ( ruleEString ) )
            // InternalXMarking.g:2707:2: ( ruleEString )
            {
            // InternalXMarking.g:2707:2: ( ruleEString )
            // InternalXMarking.g:2708:3: ruleEString
            {
             before(grammarAccess.getExerciseAccess().getModuleEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExerciseAccess().getModuleEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Exercise__ModuleAssignment_4"


    // $ANTLR start "rule__Exercise__PartsAssignment_6_0"
    // InternalXMarking.g:2717:1: rule__Exercise__PartsAssignment_6_0 : ( ruleXPart ) ;
    public final void rule__Exercise__PartsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2721:1: ( ( ruleXPart ) )
            // InternalXMarking.g:2722:2: ( ruleXPart )
            {
            // InternalXMarking.g:2722:2: ( ruleXPart )
            // InternalXMarking.g:2723:3: ruleXPart
            {
             before(grammarAccess.getExerciseAccess().getPartsXPartParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleXPart();

            state._fsp--;

             after(grammarAccess.getExerciseAccess().getPartsXPartParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Exercise__PartsAssignment_6_0"


    // $ANTLR start "rule__Exercise__PartsAssignment_6_1"
    // InternalXMarking.g:2732:1: rule__Exercise__PartsAssignment_6_1 : ( ruleXPart ) ;
    public final void rule__Exercise__PartsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2736:1: ( ( ruleXPart ) )
            // InternalXMarking.g:2737:2: ( ruleXPart )
            {
            // InternalXMarking.g:2737:2: ( ruleXPart )
            // InternalXMarking.g:2738:3: ruleXPart
            {
             before(grammarAccess.getExerciseAccess().getPartsXPartParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXPart();

            state._fsp--;

             after(grammarAccess.getExerciseAccess().getPartsXPartParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Exercise__PartsAssignment_6_1"


    // $ANTLR start "rule__Exercise__StudentsAssignment_7_1"
    // InternalXMarking.g:2747:1: rule__Exercise__StudentsAssignment_7_1 : ( ruleXStudent ) ;
    public final void rule__Exercise__StudentsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2751:1: ( ( ruleXStudent ) )
            // InternalXMarking.g:2752:2: ( ruleXStudent )
            {
            // InternalXMarking.g:2752:2: ( ruleXStudent )
            // InternalXMarking.g:2753:3: ruleXStudent
            {
             before(grammarAccess.getExerciseAccess().getStudentsXStudentParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXStudent();

            state._fsp--;

             after(grammarAccess.getExerciseAccess().getStudentsXStudentParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Exercise__StudentsAssignment_7_1"


    // $ANTLR start "rule__Exercise__StudentsAssignment_7_2"
    // InternalXMarking.g:2762:1: rule__Exercise__StudentsAssignment_7_2 : ( ruleXStudent ) ;
    public final void rule__Exercise__StudentsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2766:1: ( ( ruleXStudent ) )
            // InternalXMarking.g:2767:2: ( ruleXStudent )
            {
            // InternalXMarking.g:2767:2: ( ruleXStudent )
            // InternalXMarking.g:2768:3: ruleXStudent
            {
             before(grammarAccess.getExerciseAccess().getStudentsXStudentParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXStudent();

            state._fsp--;

             after(grammarAccess.getExerciseAccess().getStudentsXStudentParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Exercise__StudentsAssignment_7_2"


    // $ANTLR start "rule__Exercise__GroupsAssignment_8_1"
    // InternalXMarking.g:2777:1: rule__Exercise__GroupsAssignment_8_1 : ( ruleXGroup ) ;
    public final void rule__Exercise__GroupsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2781:1: ( ( ruleXGroup ) )
            // InternalXMarking.g:2782:2: ( ruleXGroup )
            {
            // InternalXMarking.g:2782:2: ( ruleXGroup )
            // InternalXMarking.g:2783:3: ruleXGroup
            {
             before(grammarAccess.getExerciseAccess().getGroupsXGroupParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXGroup();

            state._fsp--;

             after(grammarAccess.getExerciseAccess().getGroupsXGroupParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Exercise__GroupsAssignment_8_1"


    // $ANTLR start "rule__Exercise__GroupsAssignment_8_2"
    // InternalXMarking.g:2792:1: rule__Exercise__GroupsAssignment_8_2 : ( ruleXGroup ) ;
    public final void rule__Exercise__GroupsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2796:1: ( ( ruleXGroup ) )
            // InternalXMarking.g:2797:2: ( ruleXGroup )
            {
            // InternalXMarking.g:2797:2: ( ruleXGroup )
            // InternalXMarking.g:2798:3: ruleXGroup
            {
             before(grammarAccess.getExerciseAccess().getGroupsXGroupParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXGroup();

            state._fsp--;

             after(grammarAccess.getExerciseAccess().getGroupsXGroupParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Exercise__GroupsAssignment_8_2"


    // $ANTLR start "rule__Exercise__MarksAssignment_9_1"
    // InternalXMarking.g:2807:1: rule__Exercise__MarksAssignment_9_1 : ( ruleXMark ) ;
    public final void rule__Exercise__MarksAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2811:1: ( ( ruleXMark ) )
            // InternalXMarking.g:2812:2: ( ruleXMark )
            {
            // InternalXMarking.g:2812:2: ( ruleXMark )
            // InternalXMarking.g:2813:3: ruleXMark
            {
             before(grammarAccess.getExerciseAccess().getMarksXMarkParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXMark();

            state._fsp--;

             after(grammarAccess.getExerciseAccess().getMarksXMarkParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Exercise__MarksAssignment_9_1"


    // $ANTLR start "rule__Exercise__MarksAssignment_9_2"
    // InternalXMarking.g:2822:1: rule__Exercise__MarksAssignment_9_2 : ( ruleXMark ) ;
    public final void rule__Exercise__MarksAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2826:1: ( ( ruleXMark ) )
            // InternalXMarking.g:2827:2: ( ruleXMark )
            {
            // InternalXMarking.g:2827:2: ( ruleXMark )
            // InternalXMarking.g:2828:3: ruleXMark
            {
             before(grammarAccess.getExerciseAccess().getMarksXMarkParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXMark();

            state._fsp--;

             after(grammarAccess.getExerciseAccess().getMarksXMarkParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Exercise__MarksAssignment_9_2"


    // $ANTLR start "rule__XComment__NameAssignment_0"
    // InternalXMarking.g:2837:1: rule__XComment__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__XComment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2841:1: ( ( RULE_ID ) )
            // InternalXMarking.g:2842:2: ( RULE_ID )
            {
            // InternalXMarking.g:2842:2: ( RULE_ID )
            // InternalXMarking.g:2843:3: RULE_ID
            {
             before(grammarAccess.getXCommentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXCommentAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__XComment__NameAssignment_0"


    // $ANTLR start "rule__XComment__CommentAssignment_2"
    // InternalXMarking.g:2852:1: rule__XComment__CommentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XComment__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2856:1: ( ( RULE_STRING ) )
            // InternalXMarking.g:2857:2: ( RULE_STRING )
            {
            // InternalXMarking.g:2857:2: ( RULE_STRING )
            // InternalXMarking.g:2858:3: RULE_STRING
            {
             before(grammarAccess.getXCommentAccess().getCommentSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXCommentAccess().getCommentSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__XComment__CommentAssignment_2"


    // $ANTLR start "rule__XSection__NameAssignment_1"
    // InternalXMarking.g:2867:1: rule__XSection__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__XSection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2871:1: ( ( ruleEString ) )
            // InternalXMarking.g:2872:2: ( ruleEString )
            {
            // InternalXMarking.g:2872:2: ( ruleEString )
            // InternalXMarking.g:2873:3: ruleEString
            {
             before(grammarAccess.getXSectionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXSectionAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__XSection__NameAssignment_1"


    // $ANTLR start "rule__XSection__CommentsAssignment_3_0"
    // InternalXMarking.g:2882:1: rule__XSection__CommentsAssignment_3_0 : ( ruleXComment ) ;
    public final void rule__XSection__CommentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2886:1: ( ( ruleXComment ) )
            // InternalXMarking.g:2887:2: ( ruleXComment )
            {
            // InternalXMarking.g:2887:2: ( ruleXComment )
            // InternalXMarking.g:2888:3: ruleXComment
            {
             before(grammarAccess.getXSectionAccess().getCommentsXCommentParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleXComment();

            state._fsp--;

             after(grammarAccess.getXSectionAccess().getCommentsXCommentParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__XSection__CommentsAssignment_3_0"


    // $ANTLR start "rule__XSection__CommentsAssignment_3_1"
    // InternalXMarking.g:2897:1: rule__XSection__CommentsAssignment_3_1 : ( ruleXComment ) ;
    public final void rule__XSection__CommentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2901:1: ( ( ruleXComment ) )
            // InternalXMarking.g:2902:2: ( ruleXComment )
            {
            // InternalXMarking.g:2902:2: ( ruleXComment )
            // InternalXMarking.g:2903:3: ruleXComment
            {
             before(grammarAccess.getXSectionAccess().getCommentsXCommentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXComment();

            state._fsp--;

             after(grammarAccess.getXSectionAccess().getCommentsXCommentParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__XSection__CommentsAssignment_3_1"


    // $ANTLR start "rule__XSection__SubsectionsAssignment_4"
    // InternalXMarking.g:2912:1: rule__XSection__SubsectionsAssignment_4 : ( ruleXPart ) ;
    public final void rule__XSection__SubsectionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2916:1: ( ( ruleXPart ) )
            // InternalXMarking.g:2917:2: ( ruleXPart )
            {
            // InternalXMarking.g:2917:2: ( ruleXPart )
            // InternalXMarking.g:2918:3: ruleXPart
            {
             before(grammarAccess.getXSectionAccess().getSubsectionsXPartParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleXPart();

            state._fsp--;

             after(grammarAccess.getXSectionAccess().getSubsectionsXPartParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__XSection__SubsectionsAssignment_4"


    // $ANTLR start "rule__XSection__SubsectionsAssignment_5"
    // InternalXMarking.g:2927:1: rule__XSection__SubsectionsAssignment_5 : ( ruleXPart ) ;
    public final void rule__XSection__SubsectionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2931:1: ( ( ruleXPart ) )
            // InternalXMarking.g:2932:2: ( ruleXPart )
            {
            // InternalXMarking.g:2932:2: ( ruleXPart )
            // InternalXMarking.g:2933:3: ruleXPart
            {
             before(grammarAccess.getXSectionAccess().getSubsectionsXPartParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleXPart();

            state._fsp--;

             after(grammarAccess.getXSectionAccess().getSubsectionsXPartParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__XSection__SubsectionsAssignment_5"


    // $ANTLR start "rule__XQuestion__NameAssignment_2"
    // InternalXMarking.g:2942:1: rule__XQuestion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__XQuestion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2946:1: ( ( ruleEString ) )
            // InternalXMarking.g:2947:2: ( ruleEString )
            {
            // InternalXMarking.g:2947:2: ( ruleEString )
            // InternalXMarking.g:2948:3: ruleEString
            {
             before(grammarAccess.getXQuestionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXQuestionAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__XQuestion__NameAssignment_2"


    // $ANTLR start "rule__XQuestion__GradeAssignment_3"
    // InternalXMarking.g:2957:1: rule__XQuestion__GradeAssignment_3 : ( RULE_INT ) ;
    public final void rule__XQuestion__GradeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2961:1: ( ( RULE_INT ) )
            // InternalXMarking.g:2962:2: ( RULE_INT )
            {
            // InternalXMarking.g:2962:2: ( RULE_INT )
            // InternalXMarking.g:2963:3: RULE_INT
            {
             before(grammarAccess.getXQuestionAccess().getGradeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getXQuestionAccess().getGradeINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__XQuestion__GradeAssignment_3"


    // $ANTLR start "rule__XQuestion__CommentsAssignment_4_0"
    // InternalXMarking.g:2972:1: rule__XQuestion__CommentsAssignment_4_0 : ( ruleXComment ) ;
    public final void rule__XQuestion__CommentsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2976:1: ( ( ruleXComment ) )
            // InternalXMarking.g:2977:2: ( ruleXComment )
            {
            // InternalXMarking.g:2977:2: ( ruleXComment )
            // InternalXMarking.g:2978:3: ruleXComment
            {
             before(grammarAccess.getXQuestionAccess().getCommentsXCommentParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleXComment();

            state._fsp--;

             after(grammarAccess.getXQuestionAccess().getCommentsXCommentParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__XQuestion__CommentsAssignment_4_0"


    // $ANTLR start "rule__XQuestion__CommentsAssignment_4_1"
    // InternalXMarking.g:2987:1: rule__XQuestion__CommentsAssignment_4_1 : ( ruleXComment ) ;
    public final void rule__XQuestion__CommentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:2991:1: ( ( ruleXComment ) )
            // InternalXMarking.g:2992:2: ( ruleXComment )
            {
            // InternalXMarking.g:2992:2: ( ruleXComment )
            // InternalXMarking.g:2993:3: ruleXComment
            {
             before(grammarAccess.getXQuestionAccess().getCommentsXCommentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXComment();

            state._fsp--;

             after(grammarAccess.getXQuestionAccess().getCommentsXCommentParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__XQuestion__CommentsAssignment_4_1"


    // $ANTLR start "rule__XStudent__NameAssignment_0"
    // InternalXMarking.g:3002:1: rule__XStudent__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__XStudent__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3006:1: ( ( RULE_ID ) )
            // InternalXMarking.g:3007:2: ( RULE_ID )
            {
            // InternalXMarking.g:3007:2: ( RULE_ID )
            // InternalXMarking.g:3008:3: RULE_ID
            {
             before(grammarAccess.getXStudentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXStudentAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__XStudent__NameAssignment_0"


    // $ANTLR start "rule__XStudent__FirstnameAssignment_2"
    // InternalXMarking.g:3017:1: rule__XStudent__FirstnameAssignment_2 : ( ruleEString ) ;
    public final void rule__XStudent__FirstnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3021:1: ( ( ruleEString ) )
            // InternalXMarking.g:3022:2: ( ruleEString )
            {
            // InternalXMarking.g:3022:2: ( ruleEString )
            // InternalXMarking.g:3023:3: ruleEString
            {
             before(grammarAccess.getXStudentAccess().getFirstnameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXStudentAccess().getFirstnameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__XStudent__FirstnameAssignment_2"


    // $ANTLR start "rule__XStudent__LastnameAssignment_3"
    // InternalXMarking.g:3032:1: rule__XStudent__LastnameAssignment_3 : ( ruleEString ) ;
    public final void rule__XStudent__LastnameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3036:1: ( ( ruleEString ) )
            // InternalXMarking.g:3037:2: ( ruleEString )
            {
            // InternalXMarking.g:3037:2: ( ruleEString )
            // InternalXMarking.g:3038:3: ruleEString
            {
             before(grammarAccess.getXStudentAccess().getLastnameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXStudentAccess().getLastnameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__XStudent__LastnameAssignment_3"


    // $ANTLR start "rule__XGroup__NameAssignment_0"
    // InternalXMarking.g:3047:1: rule__XGroup__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__XGroup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3051:1: ( ( RULE_ID ) )
            // InternalXMarking.g:3052:2: ( RULE_ID )
            {
            // InternalXMarking.g:3052:2: ( RULE_ID )
            // InternalXMarking.g:3053:3: RULE_ID
            {
             before(grammarAccess.getXGroupAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__XGroup__NameAssignment_0"


    // $ANTLR start "rule__XGroup__StudentsAssignment_2"
    // InternalXMarking.g:3062:1: rule__XGroup__StudentsAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__XGroup__StudentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3066:1: ( ( ( RULE_ID ) ) )
            // InternalXMarking.g:3067:2: ( ( RULE_ID ) )
            {
            // InternalXMarking.g:3067:2: ( ( RULE_ID ) )
            // InternalXMarking.g:3068:3: ( RULE_ID )
            {
             before(grammarAccess.getXGroupAccess().getStudentsStudentCrossReference_2_0()); 
            // InternalXMarking.g:3069:3: ( RULE_ID )
            // InternalXMarking.g:3070:4: RULE_ID
            {
             before(grammarAccess.getXGroupAccess().getStudentsStudentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getStudentsStudentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getXGroupAccess().getStudentsStudentCrossReference_2_0()); 

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
    // $ANTLR end "rule__XGroup__StudentsAssignment_2"


    // $ANTLR start "rule__XGroup__StudentsAssignment_3"
    // InternalXMarking.g:3081:1: rule__XGroup__StudentsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__XGroup__StudentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3085:1: ( ( ( RULE_ID ) ) )
            // InternalXMarking.g:3086:2: ( ( RULE_ID ) )
            {
            // InternalXMarking.g:3086:2: ( ( RULE_ID ) )
            // InternalXMarking.g:3087:3: ( RULE_ID )
            {
             before(grammarAccess.getXGroupAccess().getStudentsStudentCrossReference_3_0()); 
            // InternalXMarking.g:3088:3: ( RULE_ID )
            // InternalXMarking.g:3089:4: RULE_ID
            {
             before(grammarAccess.getXGroupAccess().getStudentsStudentIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXGroupAccess().getStudentsStudentIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getXGroupAccess().getStudentsStudentCrossReference_3_0()); 

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
    // $ANTLR end "rule__XGroup__StudentsAssignment_3"


    // $ANTLR start "rule__XMark__RecipientAssignment_1"
    // InternalXMarking.g:3100:1: rule__XMark__RecipientAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__XMark__RecipientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3104:1: ( ( ( RULE_ID ) ) )
            // InternalXMarking.g:3105:2: ( ( RULE_ID ) )
            {
            // InternalXMarking.g:3105:2: ( ( RULE_ID ) )
            // InternalXMarking.g:3106:3: ( RULE_ID )
            {
             before(grammarAccess.getXMarkAccess().getRecipientRecipientCrossReference_1_0()); 
            // InternalXMarking.g:3107:3: ( RULE_ID )
            // InternalXMarking.g:3108:4: RULE_ID
            {
             before(grammarAccess.getXMarkAccess().getRecipientRecipientIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXMarkAccess().getRecipientRecipientIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getXMarkAccess().getRecipientRecipientCrossReference_1_0()); 

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
    // $ANTLR end "rule__XMark__RecipientAssignment_1"


    // $ANTLR start "rule__XMark__GradeAssignment_4"
    // InternalXMarking.g:3119:1: rule__XMark__GradeAssignment_4 : ( ruleXPartGrade ) ;
    public final void rule__XMark__GradeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3123:1: ( ( ruleXPartGrade ) )
            // InternalXMarking.g:3124:2: ( ruleXPartGrade )
            {
            // InternalXMarking.g:3124:2: ( ruleXPartGrade )
            // InternalXMarking.g:3125:3: ruleXPartGrade
            {
             before(grammarAccess.getXMarkAccess().getGradeXPartGradeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleXPartGrade();

            state._fsp--;

             after(grammarAccess.getXMarkAccess().getGradeXPartGradeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__XMark__GradeAssignment_4"


    // $ANTLR start "rule__XMark__GradeAssignment_5"
    // InternalXMarking.g:3134:1: rule__XMark__GradeAssignment_5 : ( ruleXPartGrade ) ;
    public final void rule__XMark__GradeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3138:1: ( ( ruleXPartGrade ) )
            // InternalXMarking.g:3139:2: ( ruleXPartGrade )
            {
            // InternalXMarking.g:3139:2: ( ruleXPartGrade )
            // InternalXMarking.g:3140:3: ruleXPartGrade
            {
             before(grammarAccess.getXMarkAccess().getGradeXPartGradeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleXPartGrade();

            state._fsp--;

             after(grammarAccess.getXMarkAccess().getGradeXPartGradeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__XMark__GradeAssignment_5"


    // $ANTLR start "rule__SectionGrade__PartAssignment_0"
    // InternalXMarking.g:3149:1: rule__SectionGrade__PartAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__SectionGrade__PartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3153:1: ( ( ( ruleEString ) ) )
            // InternalXMarking.g:3154:2: ( ( ruleEString ) )
            {
            // InternalXMarking.g:3154:2: ( ( ruleEString ) )
            // InternalXMarking.g:3155:3: ( ruleEString )
            {
             before(grammarAccess.getSectionGradeAccess().getPartSectionCrossReference_0_0()); 
            // InternalXMarking.g:3156:3: ( ruleEString )
            // InternalXMarking.g:3157:4: ruleEString
            {
             before(grammarAccess.getSectionGradeAccess().getPartSectionEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionGradeAccess().getPartSectionEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSectionGradeAccess().getPartSectionCrossReference_0_0()); 

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
    // $ANTLR end "rule__SectionGrade__PartAssignment_0"


    // $ANTLR start "rule__SectionGrade__CommentsAssignment_1_1"
    // InternalXMarking.g:3168:1: rule__SectionGrade__CommentsAssignment_1_1 : ( ( ruleEString ) ) ;
    public final void rule__SectionGrade__CommentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3172:1: ( ( ( ruleEString ) ) )
            // InternalXMarking.g:3173:2: ( ( ruleEString ) )
            {
            // InternalXMarking.g:3173:2: ( ( ruleEString ) )
            // InternalXMarking.g:3174:3: ( ruleEString )
            {
             before(grammarAccess.getSectionGradeAccess().getCommentsCommentCrossReference_1_1_0()); 
            // InternalXMarking.g:3175:3: ( ruleEString )
            // InternalXMarking.g:3176:4: ruleEString
            {
             before(grammarAccess.getSectionGradeAccess().getCommentsCommentEStringParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionGradeAccess().getCommentsCommentEStringParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getSectionGradeAccess().getCommentsCommentCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__SectionGrade__CommentsAssignment_1_1"


    // $ANTLR start "rule__SectionGrade__CommentsAssignment_1_2"
    // InternalXMarking.g:3187:1: rule__SectionGrade__CommentsAssignment_1_2 : ( ( ruleEString ) ) ;
    public final void rule__SectionGrade__CommentsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3191:1: ( ( ( ruleEString ) ) )
            // InternalXMarking.g:3192:2: ( ( ruleEString ) )
            {
            // InternalXMarking.g:3192:2: ( ( ruleEString ) )
            // InternalXMarking.g:3193:3: ( ruleEString )
            {
             before(grammarAccess.getSectionGradeAccess().getCommentsCommentCrossReference_1_2_0()); 
            // InternalXMarking.g:3194:3: ( ruleEString )
            // InternalXMarking.g:3195:4: ruleEString
            {
             before(grammarAccess.getSectionGradeAccess().getCommentsCommentEStringParserRuleCall_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionGradeAccess().getCommentsCommentEStringParserRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getSectionGradeAccess().getCommentsCommentCrossReference_1_2_0()); 

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
    // $ANTLR end "rule__SectionGrade__CommentsAssignment_1_2"


    // $ANTLR start "rule__SectionGrade__SubgradesAssignment_3"
    // InternalXMarking.g:3206:1: rule__SectionGrade__SubgradesAssignment_3 : ( ruleXPartGrade ) ;
    public final void rule__SectionGrade__SubgradesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3210:1: ( ( ruleXPartGrade ) )
            // InternalXMarking.g:3211:2: ( ruleXPartGrade )
            {
            // InternalXMarking.g:3211:2: ( ruleXPartGrade )
            // InternalXMarking.g:3212:3: ruleXPartGrade
            {
             before(grammarAccess.getSectionGradeAccess().getSubgradesXPartGradeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleXPartGrade();

            state._fsp--;

             after(grammarAccess.getSectionGradeAccess().getSubgradesXPartGradeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SectionGrade__SubgradesAssignment_3"


    // $ANTLR start "rule__SectionGrade__SubgradesAssignment_4"
    // InternalXMarking.g:3221:1: rule__SectionGrade__SubgradesAssignment_4 : ( ruleXPartGrade ) ;
    public final void rule__SectionGrade__SubgradesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3225:1: ( ( ruleXPartGrade ) )
            // InternalXMarking.g:3226:2: ( ruleXPartGrade )
            {
            // InternalXMarking.g:3226:2: ( ruleXPartGrade )
            // InternalXMarking.g:3227:3: ruleXPartGrade
            {
             before(grammarAccess.getSectionGradeAccess().getSubgradesXPartGradeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleXPartGrade();

            state._fsp--;

             after(grammarAccess.getSectionGradeAccess().getSubgradesXPartGradeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SectionGrade__SubgradesAssignment_4"


    // $ANTLR start "rule__QuestionGrade__PartAssignment_0"
    // InternalXMarking.g:3236:1: rule__QuestionGrade__PartAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__QuestionGrade__PartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3240:1: ( ( ( ruleEString ) ) )
            // InternalXMarking.g:3241:2: ( ( ruleEString ) )
            {
            // InternalXMarking.g:3241:2: ( ( ruleEString ) )
            // InternalXMarking.g:3242:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionGradeAccess().getPartQuestionCrossReference_0_0()); 
            // InternalXMarking.g:3243:3: ( ruleEString )
            // InternalXMarking.g:3244:4: ruleEString
            {
             before(grammarAccess.getQuestionGradeAccess().getPartQuestionEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionGradeAccess().getPartQuestionEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getQuestionGradeAccess().getPartQuestionCrossReference_0_0()); 

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
    // $ANTLR end "rule__QuestionGrade__PartAssignment_0"


    // $ANTLR start "rule__QuestionGrade__MarkAssignment_1"
    // InternalXMarking.g:3255:1: rule__QuestionGrade__MarkAssignment_1 : ( ruleEInt ) ;
    public final void rule__QuestionGrade__MarkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3259:1: ( ( ruleEInt ) )
            // InternalXMarking.g:3260:2: ( ruleEInt )
            {
            // InternalXMarking.g:3260:2: ( ruleEInt )
            // InternalXMarking.g:3261:3: ruleEInt
            {
             before(grammarAccess.getQuestionGradeAccess().getMarkEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getQuestionGradeAccess().getMarkEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__QuestionGrade__MarkAssignment_1"


    // $ANTLR start "rule__QuestionGrade__CommentsAssignment_2_1"
    // InternalXMarking.g:3270:1: rule__QuestionGrade__CommentsAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__QuestionGrade__CommentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3274:1: ( ( ( ruleEString ) ) )
            // InternalXMarking.g:3275:2: ( ( ruleEString ) )
            {
            // InternalXMarking.g:3275:2: ( ( ruleEString ) )
            // InternalXMarking.g:3276:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionGradeAccess().getCommentsCommentCrossReference_2_1_0()); 
            // InternalXMarking.g:3277:3: ( ruleEString )
            // InternalXMarking.g:3278:4: ruleEString
            {
             before(grammarAccess.getQuestionGradeAccess().getCommentsCommentEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionGradeAccess().getCommentsCommentEStringParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getQuestionGradeAccess().getCommentsCommentCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__QuestionGrade__CommentsAssignment_2_1"


    // $ANTLR start "rule__QuestionGrade__CommentsAssignment_2_2_1"
    // InternalXMarking.g:3289:1: rule__QuestionGrade__CommentsAssignment_2_2_1 : ( ( ruleEString ) ) ;
    public final void rule__QuestionGrade__CommentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXMarking.g:3293:1: ( ( ( ruleEString ) ) )
            // InternalXMarking.g:3294:2: ( ( ruleEString ) )
            {
            // InternalXMarking.g:3294:2: ( ( ruleEString ) )
            // InternalXMarking.g:3295:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionGradeAccess().getCommentsCommentCrossReference_2_2_1_0()); 
            // InternalXMarking.g:3296:3: ( ruleEString )
            // InternalXMarking.g:3297:4: ruleEString
            {
             before(grammarAccess.getQuestionGradeAccess().getCommentsCommentEStringParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionGradeAccess().getCommentsCommentEStringParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getQuestionGradeAccess().getCommentsCommentCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__QuestionGrade__CommentsAssignment_2_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000807800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000020F8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000C400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000F8002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000F8020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000400F8000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000002L});

}