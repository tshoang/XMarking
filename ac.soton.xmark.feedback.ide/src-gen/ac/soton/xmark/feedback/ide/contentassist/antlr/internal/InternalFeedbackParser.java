package ac.soton.xmark.feedback.ide.contentassist.antlr.internal;

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
import ac.soton.xmark.feedback.services.FeedbackGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeedbackParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Feedback'", "'end'", "'{'", "'recipients'", "'title'", "'feedback'", "'}'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalFeedbackParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFeedbackParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFeedbackParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFeedback.g"; }


    	private FeedbackGrammarAccess grammarAccess;

    	public void setGrammarAccess(FeedbackGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleExerciseFeedback"
    // InternalFeedback.g:53:1: entryRuleExerciseFeedback : ruleExerciseFeedback EOF ;
    public final void entryRuleExerciseFeedback() throws RecognitionException {
        try {
            // InternalFeedback.g:54:1: ( ruleExerciseFeedback EOF )
            // InternalFeedback.g:55:1: ruleExerciseFeedback EOF
            {
             before(grammarAccess.getExerciseFeedbackRule()); 
            pushFollow(FOLLOW_1);
            ruleExerciseFeedback();

            state._fsp--;

             after(grammarAccess.getExerciseFeedbackRule()); 
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
    // $ANTLR end "entryRuleExerciseFeedback"


    // $ANTLR start "ruleExerciseFeedback"
    // InternalFeedback.g:62:1: ruleExerciseFeedback : ( ( rule__ExerciseFeedback__Group__0 ) ) ;
    public final void ruleExerciseFeedback() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:66:2: ( ( ( rule__ExerciseFeedback__Group__0 ) ) )
            // InternalFeedback.g:67:2: ( ( rule__ExerciseFeedback__Group__0 ) )
            {
            // InternalFeedback.g:67:2: ( ( rule__ExerciseFeedback__Group__0 ) )
            // InternalFeedback.g:68:3: ( rule__ExerciseFeedback__Group__0 )
            {
             before(grammarAccess.getExerciseFeedbackAccess().getGroup()); 
            // InternalFeedback.g:69:3: ( rule__ExerciseFeedback__Group__0 )
            // InternalFeedback.g:69:4: rule__ExerciseFeedback__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExerciseFeedback__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExerciseFeedbackAccess().getGroup()); 

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
    // $ANTLR end "ruleExerciseFeedback"


    // $ANTLR start "entryRuleEString"
    // InternalFeedback.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalFeedback.g:79:1: ( ruleEString EOF )
            // InternalFeedback.g:80:1: ruleEString EOF
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
    // InternalFeedback.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalFeedback.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalFeedback.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalFeedback.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalFeedback.g:94:3: ( rule__EString__Alternatives )
            // InternalFeedback.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleFeedback"
    // InternalFeedback.g:103:1: entryRuleFeedback : ruleFeedback EOF ;
    public final void entryRuleFeedback() throws RecognitionException {
        try {
            // InternalFeedback.g:104:1: ( ruleFeedback EOF )
            // InternalFeedback.g:105:1: ruleFeedback EOF
            {
             before(grammarAccess.getFeedbackRule()); 
            pushFollow(FOLLOW_1);
            ruleFeedback();

            state._fsp--;

             after(grammarAccess.getFeedbackRule()); 
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
    // $ANTLR end "entryRuleFeedback"


    // $ANTLR start "ruleFeedback"
    // InternalFeedback.g:112:1: ruleFeedback : ( ( rule__Feedback__Group__0 ) ) ;
    public final void ruleFeedback() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:116:2: ( ( ( rule__Feedback__Group__0 ) ) )
            // InternalFeedback.g:117:2: ( ( rule__Feedback__Group__0 ) )
            {
            // InternalFeedback.g:117:2: ( ( rule__Feedback__Group__0 ) )
            // InternalFeedback.g:118:3: ( rule__Feedback__Group__0 )
            {
             before(grammarAccess.getFeedbackAccess().getGroup()); 
            // InternalFeedback.g:119:3: ( rule__Feedback__Group__0 )
            // InternalFeedback.g:119:4: rule__Feedback__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feedback__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeedbackAccess().getGroup()); 

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
    // $ANTLR end "ruleFeedback"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalFeedback.g:127:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:131:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFeedback.g:132:2: ( RULE_STRING )
                    {
                    // InternalFeedback.g:132:2: ( RULE_STRING )
                    // InternalFeedback.g:133:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeedback.g:138:2: ( RULE_ID )
                    {
                    // InternalFeedback.g:138:2: ( RULE_ID )
                    // InternalFeedback.g:139:3: RULE_ID
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


    // $ANTLR start "rule__ExerciseFeedback__Group__0"
    // InternalFeedback.g:148:1: rule__ExerciseFeedback__Group__0 : rule__ExerciseFeedback__Group__0__Impl rule__ExerciseFeedback__Group__1 ;
    public final void rule__ExerciseFeedback__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:152:1: ( rule__ExerciseFeedback__Group__0__Impl rule__ExerciseFeedback__Group__1 )
            // InternalFeedback.g:153:2: rule__ExerciseFeedback__Group__0__Impl rule__ExerciseFeedback__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExerciseFeedback__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExerciseFeedback__Group__1();

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
    // $ANTLR end "rule__ExerciseFeedback__Group__0"


    // $ANTLR start "rule__ExerciseFeedback__Group__0__Impl"
    // InternalFeedback.g:160:1: rule__ExerciseFeedback__Group__0__Impl : ( () ) ;
    public final void rule__ExerciseFeedback__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:164:1: ( ( () ) )
            // InternalFeedback.g:165:1: ( () )
            {
            // InternalFeedback.g:165:1: ( () )
            // InternalFeedback.g:166:2: ()
            {
             before(grammarAccess.getExerciseFeedbackAccess().getExerciseFeedbackAction_0()); 
            // InternalFeedback.g:167:2: ()
            // InternalFeedback.g:167:3: 
            {
            }

             after(grammarAccess.getExerciseFeedbackAccess().getExerciseFeedbackAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExerciseFeedback__Group__0__Impl"


    // $ANTLR start "rule__ExerciseFeedback__Group__1"
    // InternalFeedback.g:175:1: rule__ExerciseFeedback__Group__1 : rule__ExerciseFeedback__Group__1__Impl rule__ExerciseFeedback__Group__2 ;
    public final void rule__ExerciseFeedback__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:179:1: ( rule__ExerciseFeedback__Group__1__Impl rule__ExerciseFeedback__Group__2 )
            // InternalFeedback.g:180:2: rule__ExerciseFeedback__Group__1__Impl rule__ExerciseFeedback__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ExerciseFeedback__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExerciseFeedback__Group__2();

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
    // $ANTLR end "rule__ExerciseFeedback__Group__1"


    // $ANTLR start "rule__ExerciseFeedback__Group__1__Impl"
    // InternalFeedback.g:187:1: rule__ExerciseFeedback__Group__1__Impl : ( 'Feedback' ) ;
    public final void rule__ExerciseFeedback__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:191:1: ( ( 'Feedback' ) )
            // InternalFeedback.g:192:1: ( 'Feedback' )
            {
            // InternalFeedback.g:192:1: ( 'Feedback' )
            // InternalFeedback.g:193:2: 'Feedback'
            {
             before(grammarAccess.getExerciseFeedbackAccess().getFeedbackKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getExerciseFeedbackAccess().getFeedbackKeyword_1()); 

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
    // $ANTLR end "rule__ExerciseFeedback__Group__1__Impl"


    // $ANTLR start "rule__ExerciseFeedback__Group__2"
    // InternalFeedback.g:202:1: rule__ExerciseFeedback__Group__2 : rule__ExerciseFeedback__Group__2__Impl rule__ExerciseFeedback__Group__3 ;
    public final void rule__ExerciseFeedback__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:206:1: ( rule__ExerciseFeedback__Group__2__Impl rule__ExerciseFeedback__Group__3 )
            // InternalFeedback.g:207:2: rule__ExerciseFeedback__Group__2__Impl rule__ExerciseFeedback__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ExerciseFeedback__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExerciseFeedback__Group__3();

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
    // $ANTLR end "rule__ExerciseFeedback__Group__2"


    // $ANTLR start "rule__ExerciseFeedback__Group__2__Impl"
    // InternalFeedback.g:214:1: rule__ExerciseFeedback__Group__2__Impl : ( ( rule__ExerciseFeedback__NameAssignment_2 ) ) ;
    public final void rule__ExerciseFeedback__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:218:1: ( ( ( rule__ExerciseFeedback__NameAssignment_2 ) ) )
            // InternalFeedback.g:219:1: ( ( rule__ExerciseFeedback__NameAssignment_2 ) )
            {
            // InternalFeedback.g:219:1: ( ( rule__ExerciseFeedback__NameAssignment_2 ) )
            // InternalFeedback.g:220:2: ( rule__ExerciseFeedback__NameAssignment_2 )
            {
             before(grammarAccess.getExerciseFeedbackAccess().getNameAssignment_2()); 
            // InternalFeedback.g:221:2: ( rule__ExerciseFeedback__NameAssignment_2 )
            // InternalFeedback.g:221:3: rule__ExerciseFeedback__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExerciseFeedback__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExerciseFeedbackAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ExerciseFeedback__Group__2__Impl"


    // $ANTLR start "rule__ExerciseFeedback__Group__3"
    // InternalFeedback.g:229:1: rule__ExerciseFeedback__Group__3 : rule__ExerciseFeedback__Group__3__Impl rule__ExerciseFeedback__Group__4 ;
    public final void rule__ExerciseFeedback__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:233:1: ( rule__ExerciseFeedback__Group__3__Impl rule__ExerciseFeedback__Group__4 )
            // InternalFeedback.g:234:2: rule__ExerciseFeedback__Group__3__Impl rule__ExerciseFeedback__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ExerciseFeedback__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExerciseFeedback__Group__4();

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
    // $ANTLR end "rule__ExerciseFeedback__Group__3"


    // $ANTLR start "rule__ExerciseFeedback__Group__3__Impl"
    // InternalFeedback.g:241:1: rule__ExerciseFeedback__Group__3__Impl : ( ( rule__ExerciseFeedback__Group_3__0 )? ) ;
    public final void rule__ExerciseFeedback__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:245:1: ( ( ( rule__ExerciseFeedback__Group_3__0 )? ) )
            // InternalFeedback.g:246:1: ( ( rule__ExerciseFeedback__Group_3__0 )? )
            {
            // InternalFeedback.g:246:1: ( ( rule__ExerciseFeedback__Group_3__0 )? )
            // InternalFeedback.g:247:2: ( rule__ExerciseFeedback__Group_3__0 )?
            {
             before(grammarAccess.getExerciseFeedbackAccess().getGroup_3()); 
            // InternalFeedback.g:248:2: ( rule__ExerciseFeedback__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFeedback.g:248:3: rule__ExerciseFeedback__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExerciseFeedback__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExerciseFeedbackAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ExerciseFeedback__Group__3__Impl"


    // $ANTLR start "rule__ExerciseFeedback__Group__4"
    // InternalFeedback.g:256:1: rule__ExerciseFeedback__Group__4 : rule__ExerciseFeedback__Group__4__Impl ;
    public final void rule__ExerciseFeedback__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:260:1: ( rule__ExerciseFeedback__Group__4__Impl )
            // InternalFeedback.g:261:2: rule__ExerciseFeedback__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExerciseFeedback__Group__4__Impl();

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
    // $ANTLR end "rule__ExerciseFeedback__Group__4"


    // $ANTLR start "rule__ExerciseFeedback__Group__4__Impl"
    // InternalFeedback.g:267:1: rule__ExerciseFeedback__Group__4__Impl : ( 'end' ) ;
    public final void rule__ExerciseFeedback__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:271:1: ( ( 'end' ) )
            // InternalFeedback.g:272:1: ( 'end' )
            {
            // InternalFeedback.g:272:1: ( 'end' )
            // InternalFeedback.g:273:2: 'end'
            {
             before(grammarAccess.getExerciseFeedbackAccess().getEndKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getExerciseFeedbackAccess().getEndKeyword_4()); 

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
    // $ANTLR end "rule__ExerciseFeedback__Group__4__Impl"


    // $ANTLR start "rule__ExerciseFeedback__Group_3__0"
    // InternalFeedback.g:283:1: rule__ExerciseFeedback__Group_3__0 : rule__ExerciseFeedback__Group_3__0__Impl rule__ExerciseFeedback__Group_3__1 ;
    public final void rule__ExerciseFeedback__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:287:1: ( rule__ExerciseFeedback__Group_3__0__Impl rule__ExerciseFeedback__Group_3__1 )
            // InternalFeedback.g:288:2: rule__ExerciseFeedback__Group_3__0__Impl rule__ExerciseFeedback__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ExerciseFeedback__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExerciseFeedback__Group_3__1();

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
    // $ANTLR end "rule__ExerciseFeedback__Group_3__0"


    // $ANTLR start "rule__ExerciseFeedback__Group_3__0__Impl"
    // InternalFeedback.g:295:1: rule__ExerciseFeedback__Group_3__0__Impl : ( ( rule__ExerciseFeedback__FeedbacksAssignment_3_0 ) ) ;
    public final void rule__ExerciseFeedback__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:299:1: ( ( ( rule__ExerciseFeedback__FeedbacksAssignment_3_0 ) ) )
            // InternalFeedback.g:300:1: ( ( rule__ExerciseFeedback__FeedbacksAssignment_3_0 ) )
            {
            // InternalFeedback.g:300:1: ( ( rule__ExerciseFeedback__FeedbacksAssignment_3_0 ) )
            // InternalFeedback.g:301:2: ( rule__ExerciseFeedback__FeedbacksAssignment_3_0 )
            {
             before(grammarAccess.getExerciseFeedbackAccess().getFeedbacksAssignment_3_0()); 
            // InternalFeedback.g:302:2: ( rule__ExerciseFeedback__FeedbacksAssignment_3_0 )
            // InternalFeedback.g:302:3: rule__ExerciseFeedback__FeedbacksAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ExerciseFeedback__FeedbacksAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getExerciseFeedbackAccess().getFeedbacksAssignment_3_0()); 

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
    // $ANTLR end "rule__ExerciseFeedback__Group_3__0__Impl"


    // $ANTLR start "rule__ExerciseFeedback__Group_3__1"
    // InternalFeedback.g:310:1: rule__ExerciseFeedback__Group_3__1 : rule__ExerciseFeedback__Group_3__1__Impl ;
    public final void rule__ExerciseFeedback__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:314:1: ( rule__ExerciseFeedback__Group_3__1__Impl )
            // InternalFeedback.g:315:2: rule__ExerciseFeedback__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExerciseFeedback__Group_3__1__Impl();

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
    // $ANTLR end "rule__ExerciseFeedback__Group_3__1"


    // $ANTLR start "rule__ExerciseFeedback__Group_3__1__Impl"
    // InternalFeedback.g:321:1: rule__ExerciseFeedback__Group_3__1__Impl : ( ( rule__ExerciseFeedback__FeedbacksAssignment_3_1 )* ) ;
    public final void rule__ExerciseFeedback__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:325:1: ( ( ( rule__ExerciseFeedback__FeedbacksAssignment_3_1 )* ) )
            // InternalFeedback.g:326:1: ( ( rule__ExerciseFeedback__FeedbacksAssignment_3_1 )* )
            {
            // InternalFeedback.g:326:1: ( ( rule__ExerciseFeedback__FeedbacksAssignment_3_1 )* )
            // InternalFeedback.g:327:2: ( rule__ExerciseFeedback__FeedbacksAssignment_3_1 )*
            {
             before(grammarAccess.getExerciseFeedbackAccess().getFeedbacksAssignment_3_1()); 
            // InternalFeedback.g:328:2: ( rule__ExerciseFeedback__FeedbacksAssignment_3_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFeedback.g:328:3: rule__ExerciseFeedback__FeedbacksAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ExerciseFeedback__FeedbacksAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getExerciseFeedbackAccess().getFeedbacksAssignment_3_1()); 

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
    // $ANTLR end "rule__ExerciseFeedback__Group_3__1__Impl"


    // $ANTLR start "rule__Feedback__Group__0"
    // InternalFeedback.g:337:1: rule__Feedback__Group__0 : rule__Feedback__Group__0__Impl rule__Feedback__Group__1 ;
    public final void rule__Feedback__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:341:1: ( rule__Feedback__Group__0__Impl rule__Feedback__Group__1 )
            // InternalFeedback.g:342:2: rule__Feedback__Group__0__Impl rule__Feedback__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Feedback__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feedback__Group__1();

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
    // $ANTLR end "rule__Feedback__Group__0"


    // $ANTLR start "rule__Feedback__Group__0__Impl"
    // InternalFeedback.g:349:1: rule__Feedback__Group__0__Impl : ( ( rule__Feedback__NameAssignment_0 ) ) ;
    public final void rule__Feedback__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:353:1: ( ( ( rule__Feedback__NameAssignment_0 ) ) )
            // InternalFeedback.g:354:1: ( ( rule__Feedback__NameAssignment_0 ) )
            {
            // InternalFeedback.g:354:1: ( ( rule__Feedback__NameAssignment_0 ) )
            // InternalFeedback.g:355:2: ( rule__Feedback__NameAssignment_0 )
            {
             before(grammarAccess.getFeedbackAccess().getNameAssignment_0()); 
            // InternalFeedback.g:356:2: ( rule__Feedback__NameAssignment_0 )
            // InternalFeedback.g:356:3: rule__Feedback__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Feedback__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeedbackAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Feedback__Group__0__Impl"


    // $ANTLR start "rule__Feedback__Group__1"
    // InternalFeedback.g:364:1: rule__Feedback__Group__1 : rule__Feedback__Group__1__Impl rule__Feedback__Group__2 ;
    public final void rule__Feedback__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:368:1: ( rule__Feedback__Group__1__Impl rule__Feedback__Group__2 )
            // InternalFeedback.g:369:2: rule__Feedback__Group__1__Impl rule__Feedback__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Feedback__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feedback__Group__2();

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
    // $ANTLR end "rule__Feedback__Group__1"


    // $ANTLR start "rule__Feedback__Group__1__Impl"
    // InternalFeedback.g:376:1: rule__Feedback__Group__1__Impl : ( '{' ) ;
    public final void rule__Feedback__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:380:1: ( ( '{' ) )
            // InternalFeedback.g:381:1: ( '{' )
            {
            // InternalFeedback.g:381:1: ( '{' )
            // InternalFeedback.g:382:2: '{'
            {
             before(grammarAccess.getFeedbackAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFeedbackAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Feedback__Group__1__Impl"


    // $ANTLR start "rule__Feedback__Group__2"
    // InternalFeedback.g:391:1: rule__Feedback__Group__2 : rule__Feedback__Group__2__Impl rule__Feedback__Group__3 ;
    public final void rule__Feedback__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:395:1: ( rule__Feedback__Group__2__Impl rule__Feedback__Group__3 )
            // InternalFeedback.g:396:2: rule__Feedback__Group__2__Impl rule__Feedback__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Feedback__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feedback__Group__3();

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
    // $ANTLR end "rule__Feedback__Group__2"


    // $ANTLR start "rule__Feedback__Group__2__Impl"
    // InternalFeedback.g:403:1: rule__Feedback__Group__2__Impl : ( 'recipients' ) ;
    public final void rule__Feedback__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:407:1: ( ( 'recipients' ) )
            // InternalFeedback.g:408:1: ( 'recipients' )
            {
            // InternalFeedback.g:408:1: ( 'recipients' )
            // InternalFeedback.g:409:2: 'recipients'
            {
             before(grammarAccess.getFeedbackAccess().getRecipientsKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFeedbackAccess().getRecipientsKeyword_2()); 

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
    // $ANTLR end "rule__Feedback__Group__2__Impl"


    // $ANTLR start "rule__Feedback__Group__3"
    // InternalFeedback.g:418:1: rule__Feedback__Group__3 : rule__Feedback__Group__3__Impl rule__Feedback__Group__4 ;
    public final void rule__Feedback__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:422:1: ( rule__Feedback__Group__3__Impl rule__Feedback__Group__4 )
            // InternalFeedback.g:423:2: rule__Feedback__Group__3__Impl rule__Feedback__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Feedback__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feedback__Group__4();

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
    // $ANTLR end "rule__Feedback__Group__3"


    // $ANTLR start "rule__Feedback__Group__3__Impl"
    // InternalFeedback.g:430:1: rule__Feedback__Group__3__Impl : ( ( rule__Feedback__RecipientsAssignment_3 ) ) ;
    public final void rule__Feedback__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:434:1: ( ( ( rule__Feedback__RecipientsAssignment_3 ) ) )
            // InternalFeedback.g:435:1: ( ( rule__Feedback__RecipientsAssignment_3 ) )
            {
            // InternalFeedback.g:435:1: ( ( rule__Feedback__RecipientsAssignment_3 ) )
            // InternalFeedback.g:436:2: ( rule__Feedback__RecipientsAssignment_3 )
            {
             before(grammarAccess.getFeedbackAccess().getRecipientsAssignment_3()); 
            // InternalFeedback.g:437:2: ( rule__Feedback__RecipientsAssignment_3 )
            // InternalFeedback.g:437:3: rule__Feedback__RecipientsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feedback__RecipientsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeedbackAccess().getRecipientsAssignment_3()); 

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
    // $ANTLR end "rule__Feedback__Group__3__Impl"


    // $ANTLR start "rule__Feedback__Group__4"
    // InternalFeedback.g:445:1: rule__Feedback__Group__4 : rule__Feedback__Group__4__Impl rule__Feedback__Group__5 ;
    public final void rule__Feedback__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:449:1: ( rule__Feedback__Group__4__Impl rule__Feedback__Group__5 )
            // InternalFeedback.g:450:2: rule__Feedback__Group__4__Impl rule__Feedback__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Feedback__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feedback__Group__5();

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
    // $ANTLR end "rule__Feedback__Group__4"


    // $ANTLR start "rule__Feedback__Group__4__Impl"
    // InternalFeedback.g:457:1: rule__Feedback__Group__4__Impl : ( 'title' ) ;
    public final void rule__Feedback__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:461:1: ( ( 'title' ) )
            // InternalFeedback.g:462:1: ( 'title' )
            {
            // InternalFeedback.g:462:1: ( 'title' )
            // InternalFeedback.g:463:2: 'title'
            {
             before(grammarAccess.getFeedbackAccess().getTitleKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFeedbackAccess().getTitleKeyword_4()); 

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
    // $ANTLR end "rule__Feedback__Group__4__Impl"


    // $ANTLR start "rule__Feedback__Group__5"
    // InternalFeedback.g:472:1: rule__Feedback__Group__5 : rule__Feedback__Group__5__Impl rule__Feedback__Group__6 ;
    public final void rule__Feedback__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:476:1: ( rule__Feedback__Group__5__Impl rule__Feedback__Group__6 )
            // InternalFeedback.g:477:2: rule__Feedback__Group__5__Impl rule__Feedback__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Feedback__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feedback__Group__6();

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
    // $ANTLR end "rule__Feedback__Group__5"


    // $ANTLR start "rule__Feedback__Group__5__Impl"
    // InternalFeedback.g:484:1: rule__Feedback__Group__5__Impl : ( ( rule__Feedback__TitleAssignment_5 ) ) ;
    public final void rule__Feedback__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:488:1: ( ( ( rule__Feedback__TitleAssignment_5 ) ) )
            // InternalFeedback.g:489:1: ( ( rule__Feedback__TitleAssignment_5 ) )
            {
            // InternalFeedback.g:489:1: ( ( rule__Feedback__TitleAssignment_5 ) )
            // InternalFeedback.g:490:2: ( rule__Feedback__TitleAssignment_5 )
            {
             before(grammarAccess.getFeedbackAccess().getTitleAssignment_5()); 
            // InternalFeedback.g:491:2: ( rule__Feedback__TitleAssignment_5 )
            // InternalFeedback.g:491:3: rule__Feedback__TitleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Feedback__TitleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFeedbackAccess().getTitleAssignment_5()); 

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
    // $ANTLR end "rule__Feedback__Group__5__Impl"


    // $ANTLR start "rule__Feedback__Group__6"
    // InternalFeedback.g:499:1: rule__Feedback__Group__6 : rule__Feedback__Group__6__Impl rule__Feedback__Group__7 ;
    public final void rule__Feedback__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:503:1: ( rule__Feedback__Group__6__Impl rule__Feedback__Group__7 )
            // InternalFeedback.g:504:2: rule__Feedback__Group__6__Impl rule__Feedback__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Feedback__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feedback__Group__7();

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
    // $ANTLR end "rule__Feedback__Group__6"


    // $ANTLR start "rule__Feedback__Group__6__Impl"
    // InternalFeedback.g:511:1: rule__Feedback__Group__6__Impl : ( 'feedback' ) ;
    public final void rule__Feedback__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:515:1: ( ( 'feedback' ) )
            // InternalFeedback.g:516:1: ( 'feedback' )
            {
            // InternalFeedback.g:516:1: ( 'feedback' )
            // InternalFeedback.g:517:2: 'feedback'
            {
             before(grammarAccess.getFeedbackAccess().getFeedbackKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFeedbackAccess().getFeedbackKeyword_6()); 

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
    // $ANTLR end "rule__Feedback__Group__6__Impl"


    // $ANTLR start "rule__Feedback__Group__7"
    // InternalFeedback.g:526:1: rule__Feedback__Group__7 : rule__Feedback__Group__7__Impl rule__Feedback__Group__8 ;
    public final void rule__Feedback__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:530:1: ( rule__Feedback__Group__7__Impl rule__Feedback__Group__8 )
            // InternalFeedback.g:531:2: rule__Feedback__Group__7__Impl rule__Feedback__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Feedback__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feedback__Group__8();

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
    // $ANTLR end "rule__Feedback__Group__7"


    // $ANTLR start "rule__Feedback__Group__7__Impl"
    // InternalFeedback.g:538:1: rule__Feedback__Group__7__Impl : ( ( rule__Feedback__FeedbackAssignment_7 ) ) ;
    public final void rule__Feedback__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:542:1: ( ( ( rule__Feedback__FeedbackAssignment_7 ) ) )
            // InternalFeedback.g:543:1: ( ( rule__Feedback__FeedbackAssignment_7 ) )
            {
            // InternalFeedback.g:543:1: ( ( rule__Feedback__FeedbackAssignment_7 ) )
            // InternalFeedback.g:544:2: ( rule__Feedback__FeedbackAssignment_7 )
            {
             before(grammarAccess.getFeedbackAccess().getFeedbackAssignment_7()); 
            // InternalFeedback.g:545:2: ( rule__Feedback__FeedbackAssignment_7 )
            // InternalFeedback.g:545:3: rule__Feedback__FeedbackAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Feedback__FeedbackAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFeedbackAccess().getFeedbackAssignment_7()); 

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
    // $ANTLR end "rule__Feedback__Group__7__Impl"


    // $ANTLR start "rule__Feedback__Group__8"
    // InternalFeedback.g:553:1: rule__Feedback__Group__8 : rule__Feedback__Group__8__Impl ;
    public final void rule__Feedback__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:557:1: ( rule__Feedback__Group__8__Impl )
            // InternalFeedback.g:558:2: rule__Feedback__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feedback__Group__8__Impl();

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
    // $ANTLR end "rule__Feedback__Group__8"


    // $ANTLR start "rule__Feedback__Group__8__Impl"
    // InternalFeedback.g:564:1: rule__Feedback__Group__8__Impl : ( '}' ) ;
    public final void rule__Feedback__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:568:1: ( ( '}' ) )
            // InternalFeedback.g:569:1: ( '}' )
            {
            // InternalFeedback.g:569:1: ( '}' )
            // InternalFeedback.g:570:2: '}'
            {
             before(grammarAccess.getFeedbackAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFeedbackAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Feedback__Group__8__Impl"


    // $ANTLR start "rule__ExerciseFeedback__NameAssignment_2"
    // InternalFeedback.g:580:1: rule__ExerciseFeedback__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ExerciseFeedback__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:584:1: ( ( ruleEString ) )
            // InternalFeedback.g:585:2: ( ruleEString )
            {
            // InternalFeedback.g:585:2: ( ruleEString )
            // InternalFeedback.g:586:3: ruleEString
            {
             before(grammarAccess.getExerciseFeedbackAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExerciseFeedbackAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExerciseFeedback__NameAssignment_2"


    // $ANTLR start "rule__ExerciseFeedback__FeedbacksAssignment_3_0"
    // InternalFeedback.g:595:1: rule__ExerciseFeedback__FeedbacksAssignment_3_0 : ( ruleFeedback ) ;
    public final void rule__ExerciseFeedback__FeedbacksAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:599:1: ( ( ruleFeedback ) )
            // InternalFeedback.g:600:2: ( ruleFeedback )
            {
            // InternalFeedback.g:600:2: ( ruleFeedback )
            // InternalFeedback.g:601:3: ruleFeedback
            {
             before(grammarAccess.getExerciseFeedbackAccess().getFeedbacksFeedbackParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFeedback();

            state._fsp--;

             after(grammarAccess.getExerciseFeedbackAccess().getFeedbacksFeedbackParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__ExerciseFeedback__FeedbacksAssignment_3_0"


    // $ANTLR start "rule__ExerciseFeedback__FeedbacksAssignment_3_1"
    // InternalFeedback.g:610:1: rule__ExerciseFeedback__FeedbacksAssignment_3_1 : ( ruleFeedback ) ;
    public final void rule__ExerciseFeedback__FeedbacksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:614:1: ( ( ruleFeedback ) )
            // InternalFeedback.g:615:2: ( ruleFeedback )
            {
            // InternalFeedback.g:615:2: ( ruleFeedback )
            // InternalFeedback.g:616:3: ruleFeedback
            {
             before(grammarAccess.getExerciseFeedbackAccess().getFeedbacksFeedbackParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeedback();

            state._fsp--;

             after(grammarAccess.getExerciseFeedbackAccess().getFeedbacksFeedbackParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ExerciseFeedback__FeedbacksAssignment_3_1"


    // $ANTLR start "rule__Feedback__NameAssignment_0"
    // InternalFeedback.g:625:1: rule__Feedback__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Feedback__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:629:1: ( ( ruleEString ) )
            // InternalFeedback.g:630:2: ( ruleEString )
            {
            // InternalFeedback.g:630:2: ( ruleEString )
            // InternalFeedback.g:631:3: ruleEString
            {
             before(grammarAccess.getFeedbackAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeedbackAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Feedback__NameAssignment_0"


    // $ANTLR start "rule__Feedback__RecipientsAssignment_3"
    // InternalFeedback.g:640:1: rule__Feedback__RecipientsAssignment_3 : ( ruleEString ) ;
    public final void rule__Feedback__RecipientsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:644:1: ( ( ruleEString ) )
            // InternalFeedback.g:645:2: ( ruleEString )
            {
            // InternalFeedback.g:645:2: ( ruleEString )
            // InternalFeedback.g:646:3: ruleEString
            {
             before(grammarAccess.getFeedbackAccess().getRecipientsEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeedbackAccess().getRecipientsEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Feedback__RecipientsAssignment_3"


    // $ANTLR start "rule__Feedback__TitleAssignment_5"
    // InternalFeedback.g:655:1: rule__Feedback__TitleAssignment_5 : ( ruleEString ) ;
    public final void rule__Feedback__TitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:659:1: ( ( ruleEString ) )
            // InternalFeedback.g:660:2: ( ruleEString )
            {
            // InternalFeedback.g:660:2: ( ruleEString )
            // InternalFeedback.g:661:3: ruleEString
            {
             before(grammarAccess.getFeedbackAccess().getTitleEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeedbackAccess().getTitleEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Feedback__TitleAssignment_5"


    // $ANTLR start "rule__Feedback__FeedbackAssignment_7"
    // InternalFeedback.g:670:1: rule__Feedback__FeedbackAssignment_7 : ( ruleEString ) ;
    public final void rule__Feedback__FeedbackAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeedback.g:674:1: ( ( ruleEString ) )
            // InternalFeedback.g:675:2: ( ruleEString )
            {
            // InternalFeedback.g:675:2: ( ruleEString )
            // InternalFeedback.g:676:3: ruleEString
            {
             before(grammarAccess.getFeedbackAccess().getFeedbackEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeedbackAccess().getFeedbackEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Feedback__FeedbackAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});

}