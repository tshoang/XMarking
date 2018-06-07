package ac.soton.xmark.feedback.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xmark.feedback.services.FeedbackGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeedbackParser extends AbstractInternalAntlrParser {
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

        public InternalFeedbackParser(TokenStream input, FeedbackGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ExerciseFeedback";
       	}

       	@Override
       	protected FeedbackGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExerciseFeedback"
    // InternalFeedback.g:64:1: entryRuleExerciseFeedback returns [EObject current=null] : iv_ruleExerciseFeedback= ruleExerciseFeedback EOF ;
    public final EObject entryRuleExerciseFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExerciseFeedback = null;


        try {
            // InternalFeedback.g:64:57: (iv_ruleExerciseFeedback= ruleExerciseFeedback EOF )
            // InternalFeedback.g:65:2: iv_ruleExerciseFeedback= ruleExerciseFeedback EOF
            {
             newCompositeNode(grammarAccess.getExerciseFeedbackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExerciseFeedback=ruleExerciseFeedback();

            state._fsp--;

             current =iv_ruleExerciseFeedback; 
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
    // $ANTLR end "entryRuleExerciseFeedback"


    // $ANTLR start "ruleExerciseFeedback"
    // InternalFeedback.g:71:1: ruleExerciseFeedback returns [EObject current=null] : ( () otherlv_1= 'Feedback' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_feedbacks_3_0= ruleFeedback ) ) ( (lv_feedbacks_4_0= ruleFeedback ) )* )? otherlv_5= 'end' ) ;
    public final EObject ruleExerciseFeedback() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_feedbacks_3_0 = null;

        EObject lv_feedbacks_4_0 = null;



        	enterRule();

        try {
            // InternalFeedback.g:77:2: ( ( () otherlv_1= 'Feedback' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_feedbacks_3_0= ruleFeedback ) ) ( (lv_feedbacks_4_0= ruleFeedback ) )* )? otherlv_5= 'end' ) )
            // InternalFeedback.g:78:2: ( () otherlv_1= 'Feedback' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_feedbacks_3_0= ruleFeedback ) ) ( (lv_feedbacks_4_0= ruleFeedback ) )* )? otherlv_5= 'end' )
            {
            // InternalFeedback.g:78:2: ( () otherlv_1= 'Feedback' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_feedbacks_3_0= ruleFeedback ) ) ( (lv_feedbacks_4_0= ruleFeedback ) )* )? otherlv_5= 'end' )
            // InternalFeedback.g:79:3: () otherlv_1= 'Feedback' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_feedbacks_3_0= ruleFeedback ) ) ( (lv_feedbacks_4_0= ruleFeedback ) )* )? otherlv_5= 'end'
            {
            // InternalFeedback.g:79:3: ()
            // InternalFeedback.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExerciseFeedbackAccess().getExerciseFeedbackAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExerciseFeedbackAccess().getFeedbackKeyword_1());
            		
            // InternalFeedback.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFeedback.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalFeedback.g:91:4: (lv_name_2_0= ruleEString )
            // InternalFeedback.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExerciseFeedbackAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExerciseFeedbackRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xmark.feedback.Feedback.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeedback.g:109:3: ( ( (lv_feedbacks_3_0= ruleFeedback ) ) ( (lv_feedbacks_4_0= ruleFeedback ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFeedback.g:110:4: ( (lv_feedbacks_3_0= ruleFeedback ) ) ( (lv_feedbacks_4_0= ruleFeedback ) )*
                    {
                    // InternalFeedback.g:110:4: ( (lv_feedbacks_3_0= ruleFeedback ) )
                    // InternalFeedback.g:111:5: (lv_feedbacks_3_0= ruleFeedback )
                    {
                    // InternalFeedback.g:111:5: (lv_feedbacks_3_0= ruleFeedback )
                    // InternalFeedback.g:112:6: lv_feedbacks_3_0= ruleFeedback
                    {

                    						newCompositeNode(grammarAccess.getExerciseFeedbackAccess().getFeedbacksFeedbackParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_feedbacks_3_0=ruleFeedback();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExerciseFeedbackRule());
                    						}
                    						add(
                    							current,
                    							"feedbacks",
                    							lv_feedbacks_3_0,
                    							"ac.soton.xmark.feedback.Feedback.Feedback");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFeedback.g:129:4: ( (lv_feedbacks_4_0= ruleFeedback ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalFeedback.g:130:5: (lv_feedbacks_4_0= ruleFeedback )
                    	    {
                    	    // InternalFeedback.g:130:5: (lv_feedbacks_4_0= ruleFeedback )
                    	    // InternalFeedback.g:131:6: lv_feedbacks_4_0= ruleFeedback
                    	    {

                    	    						newCompositeNode(grammarAccess.getExerciseFeedbackAccess().getFeedbacksFeedbackParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_feedbacks_4_0=ruleFeedback();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExerciseFeedbackRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"feedbacks",
                    	    							lv_feedbacks_4_0,
                    	    							"ac.soton.xmark.feedback.Feedback.Feedback");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExerciseFeedbackAccess().getEndKeyword_4());
            		

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
    // $ANTLR end "ruleExerciseFeedback"


    // $ANTLR start "entryRuleEString"
    // InternalFeedback.g:157:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFeedback.g:157:47: (iv_ruleEString= ruleEString EOF )
            // InternalFeedback.g:158:2: iv_ruleEString= ruleEString EOF
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
    // InternalFeedback.g:164:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFeedback.g:170:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFeedback.g:171:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFeedback.g:171:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalFeedback.g:172:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFeedback.g:180:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleFeedback"
    // InternalFeedback.g:191:1: entryRuleFeedback returns [EObject current=null] : iv_ruleFeedback= ruleFeedback EOF ;
    public final EObject entryRuleFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedback = null;


        try {
            // InternalFeedback.g:191:49: (iv_ruleFeedback= ruleFeedback EOF )
            // InternalFeedback.g:192:2: iv_ruleFeedback= ruleFeedback EOF
            {
             newCompositeNode(grammarAccess.getFeedbackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeedback=ruleFeedback();

            state._fsp--;

             current =iv_ruleFeedback; 
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
    // $ANTLR end "entryRuleFeedback"


    // $ANTLR start "ruleFeedback"
    // InternalFeedback.g:198:1: ruleFeedback returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'recipients' ( (lv_recipients_3_0= ruleEString ) ) otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) otherlv_6= 'feedback' ( (lv_feedback_7_0= ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleFeedback() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_recipients_3_0 = null;

        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_feedback_7_0 = null;



        	enterRule();

        try {
            // InternalFeedback.g:204:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'recipients' ( (lv_recipients_3_0= ruleEString ) ) otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) otherlv_6= 'feedback' ( (lv_feedback_7_0= ruleEString ) ) otherlv_8= '}' ) )
            // InternalFeedback.g:205:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'recipients' ( (lv_recipients_3_0= ruleEString ) ) otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) otherlv_6= 'feedback' ( (lv_feedback_7_0= ruleEString ) ) otherlv_8= '}' )
            {
            // InternalFeedback.g:205:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'recipients' ( (lv_recipients_3_0= ruleEString ) ) otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) otherlv_6= 'feedback' ( (lv_feedback_7_0= ruleEString ) ) otherlv_8= '}' )
            // InternalFeedback.g:206:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'recipients' ( (lv_recipients_3_0= ruleEString ) ) otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) otherlv_6= 'feedback' ( (lv_feedback_7_0= ruleEString ) ) otherlv_8= '}'
            {
            // InternalFeedback.g:206:3: ( (lv_name_0_0= ruleEString ) )
            // InternalFeedback.g:207:4: (lv_name_0_0= ruleEString )
            {
            // InternalFeedback.g:207:4: (lv_name_0_0= ruleEString )
            // InternalFeedback.g:208:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeedbackAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeedbackRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ac.soton.xmark.feedback.Feedback.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFeedbackAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getFeedbackAccess().getRecipientsKeyword_2());
            		
            // InternalFeedback.g:233:3: ( (lv_recipients_3_0= ruleEString ) )
            // InternalFeedback.g:234:4: (lv_recipients_3_0= ruleEString )
            {
            // InternalFeedback.g:234:4: (lv_recipients_3_0= ruleEString )
            // InternalFeedback.g:235:5: lv_recipients_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeedbackAccess().getRecipientsEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_recipients_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeedbackRule());
            					}
            					set(
            						current,
            						"recipients",
            						lv_recipients_3_0,
            						"ac.soton.xmark.feedback.Feedback.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getFeedbackAccess().getTitleKeyword_4());
            		
            // InternalFeedback.g:256:3: ( (lv_title_5_0= ruleEString ) )
            // InternalFeedback.g:257:4: (lv_title_5_0= ruleEString )
            {
            // InternalFeedback.g:257:4: (lv_title_5_0= ruleEString )
            // InternalFeedback.g:258:5: lv_title_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeedbackAccess().getTitleEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_title_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeedbackRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_5_0,
            						"ac.soton.xmark.feedback.Feedback.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getFeedbackAccess().getFeedbackKeyword_6());
            		
            // InternalFeedback.g:279:3: ( (lv_feedback_7_0= ruleEString ) )
            // InternalFeedback.g:280:4: (lv_feedback_7_0= ruleEString )
            {
            // InternalFeedback.g:280:4: (lv_feedback_7_0= ruleEString )
            // InternalFeedback.g:281:5: lv_feedback_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeedbackAccess().getFeedbackEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_feedback_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeedbackRule());
            					}
            					set(
            						current,
            						"feedback",
            						lv_feedback_7_0,
            						"ac.soton.xmark.feedback.Feedback.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFeedbackAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleFeedback"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});

}