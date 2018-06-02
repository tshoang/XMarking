package ac.soton.xmark.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xmark.services.XMarkingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXMarkingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'exercise'", "'problem'", "'class'", "'tutorial'", "'assignment'", "'coursework'", "'('", "')'", "'students'", "'groups'", "'marks'", "'end'", "':'", "'section'", "'part'", "'subsection'", "'{'", "'}'", "'question'", "'task'", "'begin'", "','", "'-'"
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

        public InternalXMarkingParser(TokenStream input, XMarkingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Exercise";
       	}

       	@Override
       	protected XMarkingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExercise"
    // InternalXMarking.g:64:1: entryRuleExercise returns [EObject current=null] : iv_ruleExercise= ruleExercise EOF ;
    public final EObject entryRuleExercise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExercise = null;


        try {
            // InternalXMarking.g:64:49: (iv_ruleExercise= ruleExercise EOF )
            // InternalXMarking.g:65:2: iv_ruleExercise= ruleExercise EOF
            {
             newCompositeNode(grammarAccess.getExerciseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExercise=ruleExercise();

            state._fsp--;

             current =iv_ruleExercise; 
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
    // $ANTLR end "entryRuleExercise"


    // $ANTLR start "ruleExercise"
    // InternalXMarking.g:71:1: ruleExercise returns [EObject current=null] : ( () (otherlv_1= 'exercise' | (otherlv_2= 'problem' otherlv_3= 'class' ) | otherlv_4= 'tutorial' | otherlv_5= 'assignment' | otherlv_6= 'coursework' ) ( (lv_name_7_0= ruleEString ) ) otherlv_8= '(' ( (lv_module_9_0= ruleEString ) ) otherlv_10= ')' ( ( (lv_parts_11_0= ruleXPart ) ) ( (lv_parts_12_0= ruleXPart ) )* )? (otherlv_13= 'students' ( (lv_students_14_0= ruleXStudent ) ) ( (lv_students_15_0= ruleXStudent ) )* ) (otherlv_16= 'groups' ( (lv_groups_17_0= ruleXGroup ) ) ( (lv_groups_18_0= ruleXGroup ) )* )? (otherlv_19= 'marks' ( (lv_marks_20_0= ruleXMark ) ) ( (lv_marks_21_0= ruleXMark ) )* )? otherlv_22= 'end' ) ;
    public final EObject ruleExercise() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_module_9_0 = null;

        EObject lv_parts_11_0 = null;

        EObject lv_parts_12_0 = null;

        EObject lv_students_14_0 = null;

        EObject lv_students_15_0 = null;

        EObject lv_groups_17_0 = null;

        EObject lv_groups_18_0 = null;

        EObject lv_marks_20_0 = null;

        EObject lv_marks_21_0 = null;



        	enterRule();

        try {
            // InternalXMarking.g:77:2: ( ( () (otherlv_1= 'exercise' | (otherlv_2= 'problem' otherlv_3= 'class' ) | otherlv_4= 'tutorial' | otherlv_5= 'assignment' | otherlv_6= 'coursework' ) ( (lv_name_7_0= ruleEString ) ) otherlv_8= '(' ( (lv_module_9_0= ruleEString ) ) otherlv_10= ')' ( ( (lv_parts_11_0= ruleXPart ) ) ( (lv_parts_12_0= ruleXPart ) )* )? (otherlv_13= 'students' ( (lv_students_14_0= ruleXStudent ) ) ( (lv_students_15_0= ruleXStudent ) )* ) (otherlv_16= 'groups' ( (lv_groups_17_0= ruleXGroup ) ) ( (lv_groups_18_0= ruleXGroup ) )* )? (otherlv_19= 'marks' ( (lv_marks_20_0= ruleXMark ) ) ( (lv_marks_21_0= ruleXMark ) )* )? otherlv_22= 'end' ) )
            // InternalXMarking.g:78:2: ( () (otherlv_1= 'exercise' | (otherlv_2= 'problem' otherlv_3= 'class' ) | otherlv_4= 'tutorial' | otherlv_5= 'assignment' | otherlv_6= 'coursework' ) ( (lv_name_7_0= ruleEString ) ) otherlv_8= '(' ( (lv_module_9_0= ruleEString ) ) otherlv_10= ')' ( ( (lv_parts_11_0= ruleXPart ) ) ( (lv_parts_12_0= ruleXPart ) )* )? (otherlv_13= 'students' ( (lv_students_14_0= ruleXStudent ) ) ( (lv_students_15_0= ruleXStudent ) )* ) (otherlv_16= 'groups' ( (lv_groups_17_0= ruleXGroup ) ) ( (lv_groups_18_0= ruleXGroup ) )* )? (otherlv_19= 'marks' ( (lv_marks_20_0= ruleXMark ) ) ( (lv_marks_21_0= ruleXMark ) )* )? otherlv_22= 'end' )
            {
            // InternalXMarking.g:78:2: ( () (otherlv_1= 'exercise' | (otherlv_2= 'problem' otherlv_3= 'class' ) | otherlv_4= 'tutorial' | otherlv_5= 'assignment' | otherlv_6= 'coursework' ) ( (lv_name_7_0= ruleEString ) ) otherlv_8= '(' ( (lv_module_9_0= ruleEString ) ) otherlv_10= ')' ( ( (lv_parts_11_0= ruleXPart ) ) ( (lv_parts_12_0= ruleXPart ) )* )? (otherlv_13= 'students' ( (lv_students_14_0= ruleXStudent ) ) ( (lv_students_15_0= ruleXStudent ) )* ) (otherlv_16= 'groups' ( (lv_groups_17_0= ruleXGroup ) ) ( (lv_groups_18_0= ruleXGroup ) )* )? (otherlv_19= 'marks' ( (lv_marks_20_0= ruleXMark ) ) ( (lv_marks_21_0= ruleXMark ) )* )? otherlv_22= 'end' )
            // InternalXMarking.g:79:3: () (otherlv_1= 'exercise' | (otherlv_2= 'problem' otherlv_3= 'class' ) | otherlv_4= 'tutorial' | otherlv_5= 'assignment' | otherlv_6= 'coursework' ) ( (lv_name_7_0= ruleEString ) ) otherlv_8= '(' ( (lv_module_9_0= ruleEString ) ) otherlv_10= ')' ( ( (lv_parts_11_0= ruleXPart ) ) ( (lv_parts_12_0= ruleXPart ) )* )? (otherlv_13= 'students' ( (lv_students_14_0= ruleXStudent ) ) ( (lv_students_15_0= ruleXStudent ) )* ) (otherlv_16= 'groups' ( (lv_groups_17_0= ruleXGroup ) ) ( (lv_groups_18_0= ruleXGroup ) )* )? (otherlv_19= 'marks' ( (lv_marks_20_0= ruleXMark ) ) ( (lv_marks_21_0= ruleXMark ) )* )? otherlv_22= 'end'
            {
            // InternalXMarking.g:79:3: ()
            // InternalXMarking.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExerciseAccess().getExerciseAction_0(),
            					current);
            			

            }

            // InternalXMarking.g:86:3: (otherlv_1= 'exercise' | (otherlv_2= 'problem' otherlv_3= 'class' ) | otherlv_4= 'tutorial' | otherlv_5= 'assignment' | otherlv_6= 'coursework' )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 16:
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
                    // InternalXMarking.g:87:4: otherlv_1= 'exercise'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getExerciseAccess().getExerciseKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXMarking.g:92:4: (otherlv_2= 'problem' otherlv_3= 'class' )
                    {
                    // InternalXMarking.g:92:4: (otherlv_2= 'problem' otherlv_3= 'class' )
                    // InternalXMarking.g:93:5: otherlv_2= 'problem' otherlv_3= 'class'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    					newLeafNode(otherlv_2, grammarAccess.getExerciseAccess().getProblemKeyword_1_1_0());
                    				
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getExerciseAccess().getClassKeyword_1_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalXMarking.g:103:4: otherlv_4= 'tutorial'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getExerciseAccess().getTutorialKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalXMarking.g:108:4: otherlv_5= 'assignment'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getExerciseAccess().getAssignmentKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalXMarking.g:113:4: otherlv_6= 'coursework'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getExerciseAccess().getCourseworkKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalXMarking.g:118:3: ( (lv_name_7_0= ruleEString ) )
            // InternalXMarking.g:119:4: (lv_name_7_0= ruleEString )
            {
            // InternalXMarking.g:119:4: (lv_name_7_0= ruleEString )
            // InternalXMarking.g:120:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExerciseAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExerciseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"ac.soton.xmark.XMarking.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getExerciseAccess().getLeftParenthesisKeyword_3());
            		
            // InternalXMarking.g:141:3: ( (lv_module_9_0= ruleEString ) )
            // InternalXMarking.g:142:4: (lv_module_9_0= ruleEString )
            {
            // InternalXMarking.g:142:4: (lv_module_9_0= ruleEString )
            // InternalXMarking.g:143:5: lv_module_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExerciseAccess().getModuleEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_module_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExerciseRule());
            					}
            					set(
            						current,
            						"module",
            						lv_module_9_0,
            						"ac.soton.xmark.XMarking.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getExerciseAccess().getRightParenthesisKeyword_5());
            		
            // InternalXMarking.g:164:3: ( ( (lv_parts_11_0= ruleXPart ) ) ( (lv_parts_12_0= ruleXPart ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=24 && LA3_0<=26)||(LA3_0>=29 && LA3_0<=30)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXMarking.g:165:4: ( (lv_parts_11_0= ruleXPart ) ) ( (lv_parts_12_0= ruleXPart ) )*
                    {
                    // InternalXMarking.g:165:4: ( (lv_parts_11_0= ruleXPart ) )
                    // InternalXMarking.g:166:5: (lv_parts_11_0= ruleXPart )
                    {
                    // InternalXMarking.g:166:5: (lv_parts_11_0= ruleXPart )
                    // InternalXMarking.g:167:6: lv_parts_11_0= ruleXPart
                    {

                    						newCompositeNode(grammarAccess.getExerciseAccess().getPartsXPartParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_parts_11_0=ruleXPart();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExerciseRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_11_0,
                    							"ac.soton.xmark.XMarking.XPart");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXMarking.g:184:4: ( (lv_parts_12_0= ruleXPart ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=24 && LA2_0<=26)||(LA2_0>=29 && LA2_0<=30)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalXMarking.g:185:5: (lv_parts_12_0= ruleXPart )
                    	    {
                    	    // InternalXMarking.g:185:5: (lv_parts_12_0= ruleXPart )
                    	    // InternalXMarking.g:186:6: lv_parts_12_0= ruleXPart
                    	    {

                    	    						newCompositeNode(grammarAccess.getExerciseAccess().getPartsXPartParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_parts_12_0=ruleXPart();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExerciseRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parts",
                    	    							lv_parts_12_0,
                    	    							"ac.soton.xmark.XMarking.XPart");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalXMarking.g:204:3: (otherlv_13= 'students' ( (lv_students_14_0= ruleXStudent ) ) ( (lv_students_15_0= ruleXStudent ) )* )
            // InternalXMarking.g:205:4: otherlv_13= 'students' ( (lv_students_14_0= ruleXStudent ) ) ( (lv_students_15_0= ruleXStudent ) )*
            {
            otherlv_13=(Token)match(input,19,FOLLOW_8); 

            				newLeafNode(otherlv_13, grammarAccess.getExerciseAccess().getStudentsKeyword_7_0());
            			
            // InternalXMarking.g:209:4: ( (lv_students_14_0= ruleXStudent ) )
            // InternalXMarking.g:210:5: (lv_students_14_0= ruleXStudent )
            {
            // InternalXMarking.g:210:5: (lv_students_14_0= ruleXStudent )
            // InternalXMarking.g:211:6: lv_students_14_0= ruleXStudent
            {

            						newCompositeNode(grammarAccess.getExerciseAccess().getStudentsXStudentParserRuleCall_7_1_0());
            					
            pushFollow(FOLLOW_9);
            lv_students_14_0=ruleXStudent();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getExerciseRule());
            						}
            						add(
            							current,
            							"students",
            							lv_students_14_0,
            							"ac.soton.xmark.XMarking.XStudent");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalXMarking.g:228:4: ( (lv_students_15_0= ruleXStudent ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXMarking.g:229:5: (lv_students_15_0= ruleXStudent )
            	    {
            	    // InternalXMarking.g:229:5: (lv_students_15_0= ruleXStudent )
            	    // InternalXMarking.g:230:6: lv_students_15_0= ruleXStudent
            	    {

            	    						newCompositeNode(grammarAccess.getExerciseAccess().getStudentsXStudentParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_students_15_0=ruleXStudent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExerciseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"students",
            	    							lv_students_15_0,
            	    							"ac.soton.xmark.XMarking.XStudent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            // InternalXMarking.g:248:3: (otherlv_16= 'groups' ( (lv_groups_17_0= ruleXGroup ) ) ( (lv_groups_18_0= ruleXGroup ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXMarking.g:249:4: otherlv_16= 'groups' ( (lv_groups_17_0= ruleXGroup ) ) ( (lv_groups_18_0= ruleXGroup ) )*
                    {
                    otherlv_16=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getExerciseAccess().getGroupsKeyword_8_0());
                    			
                    // InternalXMarking.g:253:4: ( (lv_groups_17_0= ruleXGroup ) )
                    // InternalXMarking.g:254:5: (lv_groups_17_0= ruleXGroup )
                    {
                    // InternalXMarking.g:254:5: (lv_groups_17_0= ruleXGroup )
                    // InternalXMarking.g:255:6: lv_groups_17_0= ruleXGroup
                    {

                    						newCompositeNode(grammarAccess.getExerciseAccess().getGroupsXGroupParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_groups_17_0=ruleXGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExerciseRule());
                    						}
                    						add(
                    							current,
                    							"groups",
                    							lv_groups_17_0,
                    							"ac.soton.xmark.XMarking.XGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXMarking.g:272:4: ( (lv_groups_18_0= ruleXGroup ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalXMarking.g:273:5: (lv_groups_18_0= ruleXGroup )
                    	    {
                    	    // InternalXMarking.g:273:5: (lv_groups_18_0= ruleXGroup )
                    	    // InternalXMarking.g:274:6: lv_groups_18_0= ruleXGroup
                    	    {

                    	    						newCompositeNode(grammarAccess.getExerciseAccess().getGroupsXGroupParserRuleCall_8_2_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_groups_18_0=ruleXGroup();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExerciseRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"groups",
                    	    							lv_groups_18_0,
                    	    							"ac.soton.xmark.XMarking.XGroup");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalXMarking.g:292:3: (otherlv_19= 'marks' ( (lv_marks_20_0= ruleXMark ) ) ( (lv_marks_21_0= ruleXMark ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXMarking.g:293:4: otherlv_19= 'marks' ( (lv_marks_20_0= ruleXMark ) ) ( (lv_marks_21_0= ruleXMark ) )*
                    {
                    otherlv_19=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_19, grammarAccess.getExerciseAccess().getMarksKeyword_9_0());
                    			
                    // InternalXMarking.g:297:4: ( (lv_marks_20_0= ruleXMark ) )
                    // InternalXMarking.g:298:5: (lv_marks_20_0= ruleXMark )
                    {
                    // InternalXMarking.g:298:5: (lv_marks_20_0= ruleXMark )
                    // InternalXMarking.g:299:6: lv_marks_20_0= ruleXMark
                    {

                    						newCompositeNode(grammarAccess.getExerciseAccess().getMarksXMarkParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_marks_20_0=ruleXMark();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExerciseRule());
                    						}
                    						add(
                    							current,
                    							"marks",
                    							lv_marks_20_0,
                    							"ac.soton.xmark.XMarking.XMark");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXMarking.g:316:4: ( (lv_marks_21_0= ruleXMark ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalXMarking.g:317:5: (lv_marks_21_0= ruleXMark )
                    	    {
                    	    // InternalXMarking.g:317:5: (lv_marks_21_0= ruleXMark )
                    	    // InternalXMarking.g:318:6: lv_marks_21_0= ruleXMark
                    	    {

                    	    						newCompositeNode(grammarAccess.getExerciseAccess().getMarksXMarkParserRuleCall_9_2_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_marks_21_0=ruleXMark();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExerciseRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"marks",
                    	    							lv_marks_21_0,
                    	    							"ac.soton.xmark.XMarking.XMark");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getExerciseAccess().getEndKeyword_10());
            		

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
    // $ANTLR end "ruleExercise"


    // $ANTLR start "entryRuleXPart"
    // InternalXMarking.g:344:1: entryRuleXPart returns [EObject current=null] : iv_ruleXPart= ruleXPart EOF ;
    public final EObject entryRuleXPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPart = null;


        try {
            // InternalXMarking.g:344:46: (iv_ruleXPart= ruleXPart EOF )
            // InternalXMarking.g:345:2: iv_ruleXPart= ruleXPart EOF
            {
             newCompositeNode(grammarAccess.getXPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXPart=ruleXPart();

            state._fsp--;

             current =iv_ruleXPart; 
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
    // $ANTLR end "entryRuleXPart"


    // $ANTLR start "ruleXPart"
    // InternalXMarking.g:351:1: ruleXPart returns [EObject current=null] : (this_XSection_0= ruleXSection | this_XQuestion_1= ruleXQuestion ) ;
    public final EObject ruleXPart() throws RecognitionException {
        EObject current = null;

        EObject this_XSection_0 = null;

        EObject this_XQuestion_1 = null;



        	enterRule();

        try {
            // InternalXMarking.g:357:2: ( (this_XSection_0= ruleXSection | this_XQuestion_1= ruleXQuestion ) )
            // InternalXMarking.g:358:2: (this_XSection_0= ruleXSection | this_XQuestion_1= ruleXQuestion )
            {
            // InternalXMarking.g:358:2: (this_XSection_0= ruleXSection | this_XQuestion_1= ruleXQuestion )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=24 && LA9_0<=26)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=29 && LA9_0<=30)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalXMarking.g:359:3: this_XSection_0= ruleXSection
                    {

                    			newCompositeNode(grammarAccess.getXPartAccess().getXSectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_XSection_0=ruleXSection();

                    state._fsp--;


                    			current = this_XSection_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXMarking.g:368:3: this_XQuestion_1= ruleXQuestion
                    {

                    			newCompositeNode(grammarAccess.getXPartAccess().getXQuestionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XQuestion_1=ruleXQuestion();

                    state._fsp--;


                    			current = this_XQuestion_1;
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
    // $ANTLR end "ruleXPart"


    // $ANTLR start "entryRuleXPartGrade"
    // InternalXMarking.g:380:1: entryRuleXPartGrade returns [EObject current=null] : iv_ruleXPartGrade= ruleXPartGrade EOF ;
    public final EObject entryRuleXPartGrade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPartGrade = null;


        try {
            // InternalXMarking.g:380:51: (iv_ruleXPartGrade= ruleXPartGrade EOF )
            // InternalXMarking.g:381:2: iv_ruleXPartGrade= ruleXPartGrade EOF
            {
             newCompositeNode(grammarAccess.getXPartGradeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXPartGrade=ruleXPartGrade();

            state._fsp--;

             current =iv_ruleXPartGrade; 
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
    // $ANTLR end "entryRuleXPartGrade"


    // $ANTLR start "ruleXPartGrade"
    // InternalXMarking.g:387:1: ruleXPartGrade returns [EObject current=null] : (this_SectionGrade_0= ruleSectionGrade | this_QuestionGrade_1= ruleQuestionGrade ) ;
    public final EObject ruleXPartGrade() throws RecognitionException {
        EObject current = null;

        EObject this_SectionGrade_0 = null;

        EObject this_QuestionGrade_1 = null;



        	enterRule();

        try {
            // InternalXMarking.g:393:2: ( (this_SectionGrade_0= ruleSectionGrade | this_QuestionGrade_1= ruleQuestionGrade ) )
            // InternalXMarking.g:394:2: (this_SectionGrade_0= ruleSectionGrade | this_QuestionGrade_1= ruleQuestionGrade )
            {
            // InternalXMarking.g:394:2: (this_SectionGrade_0= ruleSectionGrade | this_QuestionGrade_1= ruleQuestionGrade )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_INT||LA10_1==33) ) {
                    alt10=2;
                }
                else if ( (LA10_1==17||LA10_1==27) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==RULE_INT||LA10_2==33) ) {
                    alt10=2;
                }
                else if ( (LA10_2==17||LA10_2==27) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXMarking.g:395:3: this_SectionGrade_0= ruleSectionGrade
                    {

                    			newCompositeNode(grammarAccess.getXPartGradeAccess().getSectionGradeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SectionGrade_0=ruleSectionGrade();

                    state._fsp--;


                    			current = this_SectionGrade_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXMarking.g:404:3: this_QuestionGrade_1= ruleQuestionGrade
                    {

                    			newCompositeNode(grammarAccess.getXPartGradeAccess().getQuestionGradeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QuestionGrade_1=ruleQuestionGrade();

                    state._fsp--;


                    			current = this_QuestionGrade_1;
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
    // $ANTLR end "ruleXPartGrade"


    // $ANTLR start "entryRuleEString"
    // InternalXMarking.g:416:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalXMarking.g:416:47: (iv_ruleEString= ruleEString EOF )
            // InternalXMarking.g:417:2: iv_ruleEString= ruleEString EOF
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
    // InternalXMarking.g:423:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalXMarking.g:429:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalXMarking.g:430:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalXMarking.g:430:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMarking.g:431:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXMarking.g:439:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleXComment"
    // InternalXMarking.g:450:1: entryRuleXComment returns [EObject current=null] : iv_ruleXComment= ruleXComment EOF ;
    public final EObject entryRuleXComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXComment = null;


        try {
            // InternalXMarking.g:450:49: (iv_ruleXComment= ruleXComment EOF )
            // InternalXMarking.g:451:2: iv_ruleXComment= ruleXComment EOF
            {
             newCompositeNode(grammarAccess.getXCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXComment=ruleXComment();

            state._fsp--;

             current =iv_ruleXComment; 
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
    // $ANTLR end "entryRuleXComment"


    // $ANTLR start "ruleXComment"
    // InternalXMarking.g:457:1: ruleXComment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_comment_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleXComment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_comment_2_0=null;


        	enterRule();

        try {
            // InternalXMarking.g:463:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_comment_2_0= RULE_STRING ) ) ) )
            // InternalXMarking.g:464:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_comment_2_0= RULE_STRING ) ) )
            {
            // InternalXMarking.g:464:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_comment_2_0= RULE_STRING ) ) )
            // InternalXMarking.g:465:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_comment_2_0= RULE_STRING ) )
            {
            // InternalXMarking.g:465:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXMarking.g:466:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXMarking.g:466:4: (lv_name_0_0= RULE_ID )
            // InternalXMarking.g:467:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getXCommentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getXCommentAccess().getColonKeyword_1());
            		
            // InternalXMarking.g:487:3: ( (lv_comment_2_0= RULE_STRING ) )
            // InternalXMarking.g:488:4: (lv_comment_2_0= RULE_STRING )
            {
            // InternalXMarking.g:488:4: (lv_comment_2_0= RULE_STRING )
            // InternalXMarking.g:489:5: lv_comment_2_0= RULE_STRING
            {
            lv_comment_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_comment_2_0, grammarAccess.getXCommentAccess().getCommentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleXComment"


    // $ANTLR start "entryRuleXSection"
    // InternalXMarking.g:509:1: entryRuleXSection returns [EObject current=null] : iv_ruleXSection= ruleXSection EOF ;
    public final EObject entryRuleXSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSection = null;


        try {
            // InternalXMarking.g:509:49: (iv_ruleXSection= ruleXSection EOF )
            // InternalXMarking.g:510:2: iv_ruleXSection= ruleXSection EOF
            {
             newCompositeNode(grammarAccess.getXSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXSection=ruleXSection();

            state._fsp--;

             current =iv_ruleXSection; 
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
    // $ANTLR end "entryRuleXSection"


    // $ANTLR start "ruleXSection"
    // InternalXMarking.g:516:1: ruleXSection returns [EObject current=null] : ( (otherlv_0= 'section' | otherlv_1= 'part' | otherlv_2= 'subsection' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_comments_5_0= ruleXComment ) ) ( (lv_comments_6_0= ruleXComment ) )* )? ( (lv_subsections_7_0= ruleXPart ) ) ( (lv_subsections_8_0= ruleXPart ) )* otherlv_9= '}' ) ;
    public final EObject ruleXSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_comments_5_0 = null;

        EObject lv_comments_6_0 = null;

        EObject lv_subsections_7_0 = null;

        EObject lv_subsections_8_0 = null;



        	enterRule();

        try {
            // InternalXMarking.g:522:2: ( ( (otherlv_0= 'section' | otherlv_1= 'part' | otherlv_2= 'subsection' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_comments_5_0= ruleXComment ) ) ( (lv_comments_6_0= ruleXComment ) )* )? ( (lv_subsections_7_0= ruleXPart ) ) ( (lv_subsections_8_0= ruleXPart ) )* otherlv_9= '}' ) )
            // InternalXMarking.g:523:2: ( (otherlv_0= 'section' | otherlv_1= 'part' | otherlv_2= 'subsection' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_comments_5_0= ruleXComment ) ) ( (lv_comments_6_0= ruleXComment ) )* )? ( (lv_subsections_7_0= ruleXPart ) ) ( (lv_subsections_8_0= ruleXPart ) )* otherlv_9= '}' )
            {
            // InternalXMarking.g:523:2: ( (otherlv_0= 'section' | otherlv_1= 'part' | otherlv_2= 'subsection' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_comments_5_0= ruleXComment ) ) ( (lv_comments_6_0= ruleXComment ) )* )? ( (lv_subsections_7_0= ruleXPart ) ) ( (lv_subsections_8_0= ruleXPart ) )* otherlv_9= '}' )
            // InternalXMarking.g:524:3: (otherlv_0= 'section' | otherlv_1= 'part' | otherlv_2= 'subsection' ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_comments_5_0= ruleXComment ) ) ( (lv_comments_6_0= ruleXComment ) )* )? ( (lv_subsections_7_0= ruleXPart ) ) ( (lv_subsections_8_0= ruleXPart ) )* otherlv_9= '}'
            {
            // InternalXMarking.g:524:3: (otherlv_0= 'section' | otherlv_1= 'part' | otherlv_2= 'subsection' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt12=1;
                }
                break;
            case 25:
                {
                alt12=2;
                }
                break;
            case 26:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalXMarking.g:525:4: otherlv_0= 'section'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getXSectionAccess().getSectionKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXMarking.g:530:4: otherlv_1= 'part'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getXSectionAccess().getPartKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalXMarking.g:535:4: otherlv_2= 'subsection'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getXSectionAccess().getSubsectionKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalXMarking.g:540:3: ( (lv_name_3_0= ruleEString ) )
            // InternalXMarking.g:541:4: (lv_name_3_0= ruleEString )
            {
            // InternalXMarking.g:541:4: (lv_name_3_0= ruleEString )
            // InternalXMarking.g:542:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getXSectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXSectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"ac.soton.xmark.XMarking.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getXSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXMarking.g:563:3: ( ( (lv_comments_5_0= ruleXComment ) ) ( (lv_comments_6_0= ruleXComment ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXMarking.g:564:4: ( (lv_comments_5_0= ruleXComment ) ) ( (lv_comments_6_0= ruleXComment ) )*
                    {
                    // InternalXMarking.g:564:4: ( (lv_comments_5_0= ruleXComment ) )
                    // InternalXMarking.g:565:5: (lv_comments_5_0= ruleXComment )
                    {
                    // InternalXMarking.g:565:5: (lv_comments_5_0= ruleXComment )
                    // InternalXMarking.g:566:6: lv_comments_5_0= ruleXComment
                    {

                    						newCompositeNode(grammarAccess.getXSectionAccess().getCommentsXCommentParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_comments_5_0=ruleXComment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXSectionRule());
                    						}
                    						add(
                    							current,
                    							"comments",
                    							lv_comments_5_0,
                    							"ac.soton.xmark.XMarking.XComment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXMarking.g:583:4: ( (lv_comments_6_0= ruleXComment ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalXMarking.g:584:5: (lv_comments_6_0= ruleXComment )
                    	    {
                    	    // InternalXMarking.g:584:5: (lv_comments_6_0= ruleXComment )
                    	    // InternalXMarking.g:585:6: lv_comments_6_0= ruleXComment
                    	    {

                    	    						newCompositeNode(grammarAccess.getXSectionAccess().getCommentsXCommentParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_comments_6_0=ruleXComment();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXSectionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"comments",
                    	    							lv_comments_6_0,
                    	    							"ac.soton.xmark.XMarking.XComment");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalXMarking.g:603:3: ( (lv_subsections_7_0= ruleXPart ) )
            // InternalXMarking.g:604:4: (lv_subsections_7_0= ruleXPart )
            {
            // InternalXMarking.g:604:4: (lv_subsections_7_0= ruleXPart )
            // InternalXMarking.g:605:5: lv_subsections_7_0= ruleXPart
            {

            					newCompositeNode(grammarAccess.getXSectionAccess().getSubsectionsXPartParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_subsections_7_0=ruleXPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXSectionRule());
            					}
            					add(
            						current,
            						"subsections",
            						lv_subsections_7_0,
            						"ac.soton.xmark.XMarking.XPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMarking.g:622:3: ( (lv_subsections_8_0= ruleXPart ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=24 && LA15_0<=26)||(LA15_0>=29 && LA15_0<=30)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalXMarking.g:623:4: (lv_subsections_8_0= ruleXPart )
            	    {
            	    // InternalXMarking.g:623:4: (lv_subsections_8_0= ruleXPart )
            	    // InternalXMarking.g:624:5: lv_subsections_8_0= ruleXPart
            	    {

            	    					newCompositeNode(grammarAccess.getXSectionAccess().getSubsectionsXPartParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_subsections_8_0=ruleXPart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subsections",
            	    						lv_subsections_8_0,
            	    						"ac.soton.xmark.XMarking.XPart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getXSectionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleXSection"


    // $ANTLR start "entryRuleXQuestion"
    // InternalXMarking.g:649:1: entryRuleXQuestion returns [EObject current=null] : iv_ruleXQuestion= ruleXQuestion EOF ;
    public final EObject entryRuleXQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXQuestion = null;


        try {
            // InternalXMarking.g:649:50: (iv_ruleXQuestion= ruleXQuestion EOF )
            // InternalXMarking.g:650:2: iv_ruleXQuestion= ruleXQuestion EOF
            {
             newCompositeNode(grammarAccess.getXQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXQuestion=ruleXQuestion();

            state._fsp--;

             current =iv_ruleXQuestion; 
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
    // $ANTLR end "entryRuleXQuestion"


    // $ANTLR start "ruleXQuestion"
    // InternalXMarking.g:656:1: ruleXQuestion returns [EObject current=null] : ( () (otherlv_1= 'question' | otherlv_2= 'task' ) ( (lv_name_3_0= ruleEString ) ) ( (lv_grade_4_0= RULE_INT ) ) ( ( (lv_comments_5_0= ruleXComment ) ) ( (lv_comments_6_0= ruleXComment ) )* )? ) ;
    public final EObject ruleXQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_grade_4_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_comments_5_0 = null;

        EObject lv_comments_6_0 = null;



        	enterRule();

        try {
            // InternalXMarking.g:662:2: ( ( () (otherlv_1= 'question' | otherlv_2= 'task' ) ( (lv_name_3_0= ruleEString ) ) ( (lv_grade_4_0= RULE_INT ) ) ( ( (lv_comments_5_0= ruleXComment ) ) ( (lv_comments_6_0= ruleXComment ) )* )? ) )
            // InternalXMarking.g:663:2: ( () (otherlv_1= 'question' | otherlv_2= 'task' ) ( (lv_name_3_0= ruleEString ) ) ( (lv_grade_4_0= RULE_INT ) ) ( ( (lv_comments_5_0= ruleXComment ) ) ( (lv_comments_6_0= ruleXComment ) )* )? )
            {
            // InternalXMarking.g:663:2: ( () (otherlv_1= 'question' | otherlv_2= 'task' ) ( (lv_name_3_0= ruleEString ) ) ( (lv_grade_4_0= RULE_INT ) ) ( ( (lv_comments_5_0= ruleXComment ) ) ( (lv_comments_6_0= ruleXComment ) )* )? )
            // InternalXMarking.g:664:3: () (otherlv_1= 'question' | otherlv_2= 'task' ) ( (lv_name_3_0= ruleEString ) ) ( (lv_grade_4_0= RULE_INT ) ) ( ( (lv_comments_5_0= ruleXComment ) ) ( (lv_comments_6_0= ruleXComment ) )* )?
            {
            // InternalXMarking.g:664:3: ()
            // InternalXMarking.g:665:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXQuestionAccess().getQuestionAction_0(),
            					current);
            			

            }

            // InternalXMarking.g:671:3: (otherlv_1= 'question' | otherlv_2= 'task' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalXMarking.g:672:4: otherlv_1= 'question'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getXQuestionAccess().getQuestionKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXMarking.g:677:4: otherlv_2= 'task'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getXQuestionAccess().getTaskKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalXMarking.g:682:3: ( (lv_name_3_0= ruleEString ) )
            // InternalXMarking.g:683:4: (lv_name_3_0= ruleEString )
            {
            // InternalXMarking.g:683:4: (lv_name_3_0= ruleEString )
            // InternalXMarking.g:684:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getXQuestionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXQuestionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"ac.soton.xmark.XMarking.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMarking.g:701:3: ( (lv_grade_4_0= RULE_INT ) )
            // InternalXMarking.g:702:4: (lv_grade_4_0= RULE_INT )
            {
            // InternalXMarking.g:702:4: (lv_grade_4_0= RULE_INT )
            // InternalXMarking.g:703:5: lv_grade_4_0= RULE_INT
            {
            lv_grade_4_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_grade_4_0, grammarAccess.getXQuestionAccess().getGradeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"grade",
            						lv_grade_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalXMarking.g:719:3: ( ( (lv_comments_5_0= ruleXComment ) ) ( (lv_comments_6_0= ruleXComment ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXMarking.g:720:4: ( (lv_comments_5_0= ruleXComment ) ) ( (lv_comments_6_0= ruleXComment ) )*
                    {
                    // InternalXMarking.g:720:4: ( (lv_comments_5_0= ruleXComment ) )
                    // InternalXMarking.g:721:5: (lv_comments_5_0= ruleXComment )
                    {
                    // InternalXMarking.g:721:5: (lv_comments_5_0= ruleXComment )
                    // InternalXMarking.g:722:6: lv_comments_5_0= ruleXComment
                    {

                    						newCompositeNode(grammarAccess.getXQuestionAccess().getCommentsXCommentParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_comments_5_0=ruleXComment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXQuestionRule());
                    						}
                    						add(
                    							current,
                    							"comments",
                    							lv_comments_5_0,
                    							"ac.soton.xmark.XMarking.XComment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXMarking.g:739:4: ( (lv_comments_6_0= ruleXComment ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalXMarking.g:740:5: (lv_comments_6_0= ruleXComment )
                    	    {
                    	    // InternalXMarking.g:740:5: (lv_comments_6_0= ruleXComment )
                    	    // InternalXMarking.g:741:6: lv_comments_6_0= ruleXComment
                    	    {

                    	    						newCompositeNode(grammarAccess.getXQuestionAccess().getCommentsXCommentParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_comments_6_0=ruleXComment();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXQuestionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"comments",
                    	    							lv_comments_6_0,
                    	    							"ac.soton.xmark.XMarking.XComment");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleXQuestion"


    // $ANTLR start "entryRuleXStudent"
    // InternalXMarking.g:763:1: entryRuleXStudent returns [EObject current=null] : iv_ruleXStudent= ruleXStudent EOF ;
    public final EObject entryRuleXStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStudent = null;


        try {
            // InternalXMarking.g:763:49: (iv_ruleXStudent= ruleXStudent EOF )
            // InternalXMarking.g:764:2: iv_ruleXStudent= ruleXStudent EOF
            {
             newCompositeNode(grammarAccess.getXStudentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXStudent=ruleXStudent();

            state._fsp--;

             current =iv_ruleXStudent; 
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
    // $ANTLR end "entryRuleXStudent"


    // $ANTLR start "ruleXStudent"
    // InternalXMarking.g:770:1: ruleXStudent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_firstname_2_0= ruleEString ) ) ( (lv_lastname_3_0= ruleEString ) ) ) ;
    public final EObject ruleXStudent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_firstname_2_0 = null;

        AntlrDatatypeRuleToken lv_lastname_3_0 = null;



        	enterRule();

        try {
            // InternalXMarking.g:776:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_firstname_2_0= ruleEString ) ) ( (lv_lastname_3_0= ruleEString ) ) ) )
            // InternalXMarking.g:777:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_firstname_2_0= ruleEString ) ) ( (lv_lastname_3_0= ruleEString ) ) )
            {
            // InternalXMarking.g:777:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_firstname_2_0= ruleEString ) ) ( (lv_lastname_3_0= ruleEString ) ) )
            // InternalXMarking.g:778:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_firstname_2_0= ruleEString ) ) ( (lv_lastname_3_0= ruleEString ) )
            {
            // InternalXMarking.g:778:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXMarking.g:779:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXMarking.g:779:4: (lv_name_0_0= RULE_ID )
            // InternalXMarking.g:780:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getXStudentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXStudentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getXStudentAccess().getColonKeyword_1());
            		
            // InternalXMarking.g:800:3: ( (lv_firstname_2_0= ruleEString ) )
            // InternalXMarking.g:801:4: (lv_firstname_2_0= ruleEString )
            {
            // InternalXMarking.g:801:4: (lv_firstname_2_0= ruleEString )
            // InternalXMarking.g:802:5: lv_firstname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getXStudentAccess().getFirstnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_firstname_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXStudentRule());
            					}
            					set(
            						current,
            						"firstname",
            						lv_firstname_2_0,
            						"ac.soton.xmark.XMarking.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMarking.g:819:3: ( (lv_lastname_3_0= ruleEString ) )
            // InternalXMarking.g:820:4: (lv_lastname_3_0= ruleEString )
            {
            // InternalXMarking.g:820:4: (lv_lastname_3_0= ruleEString )
            // InternalXMarking.g:821:5: lv_lastname_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getXStudentAccess().getLastnameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_lastname_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXStudentRule());
            					}
            					set(
            						current,
            						"lastname",
            						lv_lastname_3_0,
            						"ac.soton.xmark.XMarking.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleXStudent"


    // $ANTLR start "entryRuleXGroup"
    // InternalXMarking.g:842:1: entryRuleXGroup returns [EObject current=null] : iv_ruleXGroup= ruleXGroup EOF ;
    public final EObject entryRuleXGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXGroup = null;


        try {
            // InternalXMarking.g:842:47: (iv_ruleXGroup= ruleXGroup EOF )
            // InternalXMarking.g:843:2: iv_ruleXGroup= ruleXGroup EOF
            {
             newCompositeNode(grammarAccess.getXGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXGroup=ruleXGroup();

            state._fsp--;

             current =iv_ruleXGroup; 
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
    // $ANTLR end "entryRuleXGroup"


    // $ANTLR start "ruleXGroup"
    // InternalXMarking.g:849:1: ruleXGroup returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleXGroup() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXMarking.g:855:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) )
            // InternalXMarking.g:856:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            {
            // InternalXMarking.g:856:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            // InternalXMarking.g:857:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            {
            // InternalXMarking.g:857:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXMarking.g:858:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXMarking.g:858:4: (lv_name_0_0= RULE_ID )
            // InternalXMarking.g:859:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getXGroupAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getXGroupAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXMarking.g:879:3: ( (otherlv_2= RULE_ID ) )
            // InternalXMarking.g:880:4: (otherlv_2= RULE_ID )
            {
            // InternalXMarking.g:880:4: (otherlv_2= RULE_ID )
            // InternalXMarking.g:881:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXGroupRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_2, grammarAccess.getXGroupAccess().getStudentsStudentCrossReference_2_0());
            				

            }


            }

            // InternalXMarking.g:892:3: ( (otherlv_3= RULE_ID ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalXMarking.g:893:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalXMarking.g:893:4: (otherlv_3= RULE_ID )
            	    // InternalXMarking.g:894:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getXGroupRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    					newLeafNode(otherlv_3, grammarAccess.getXGroupAccess().getStudentsStudentCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getXGroupAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleXGroup"


    // $ANTLR start "entryRuleXMark"
    // InternalXMarking.g:913:1: entryRuleXMark returns [EObject current=null] : iv_ruleXMark= ruleXMark EOF ;
    public final EObject entryRuleXMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMark = null;


        try {
            // InternalXMarking.g:913:46: (iv_ruleXMark= ruleXMark EOF )
            // InternalXMarking.g:914:2: iv_ruleXMark= ruleXMark EOF
            {
             newCompositeNode(grammarAccess.getXMarkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXMark=ruleXMark();

            state._fsp--;

             current =iv_ruleXMark; 
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
    // $ANTLR end "entryRuleXMark"


    // $ANTLR start "ruleXMark"
    // InternalXMarking.g:920:1: ruleXMark returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'begin' ( (lv_grade_4_0= ruleXPartGrade ) ) ( (lv_grade_5_0= ruleXPartGrade ) )* otherlv_6= 'end' ) ;
    public final EObject ruleXMark() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_grade_4_0 = null;

        EObject lv_grade_5_0 = null;



        	enterRule();

        try {
            // InternalXMarking.g:926:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'begin' ( (lv_grade_4_0= ruleXPartGrade ) ) ( (lv_grade_5_0= ruleXPartGrade ) )* otherlv_6= 'end' ) )
            // InternalXMarking.g:927:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'begin' ( (lv_grade_4_0= ruleXPartGrade ) ) ( (lv_grade_5_0= ruleXPartGrade ) )* otherlv_6= 'end' )
            {
            // InternalXMarking.g:927:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'begin' ( (lv_grade_4_0= ruleXPartGrade ) ) ( (lv_grade_5_0= ruleXPartGrade ) )* otherlv_6= 'end' )
            // InternalXMarking.g:928:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'begin' ( (lv_grade_4_0= ruleXPartGrade ) ) ( (lv_grade_5_0= ruleXPartGrade ) )* otherlv_6= 'end'
            {
            // InternalXMarking.g:928:3: ()
            // InternalXMarking.g:929:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXMarkAccess().getMarkAction_0(),
            					current);
            			

            }

            // InternalXMarking.g:935:3: ( (otherlv_1= RULE_ID ) )
            // InternalXMarking.g:936:4: (otherlv_1= RULE_ID )
            {
            // InternalXMarking.g:936:4: (otherlv_1= RULE_ID )
            // InternalXMarking.g:937:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXMarkRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getXMarkAccess().getRecipientRecipientCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getXMarkAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getXMarkAccess().getBeginKeyword_3());
            		
            // InternalXMarking.g:956:3: ( (lv_grade_4_0= ruleXPartGrade ) )
            // InternalXMarking.g:957:4: (lv_grade_4_0= ruleXPartGrade )
            {
            // InternalXMarking.g:957:4: (lv_grade_4_0= ruleXPartGrade )
            // InternalXMarking.g:958:5: lv_grade_4_0= ruleXPartGrade
            {

            					newCompositeNode(grammarAccess.getXMarkAccess().getGradeXPartGradeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_grade_4_0=ruleXPartGrade();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXMarkRule());
            					}
            					add(
            						current,
            						"grade",
            						lv_grade_4_0,
            						"ac.soton.xmark.XMarking.XPartGrade");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMarking.g:975:3: ( (lv_grade_5_0= ruleXPartGrade ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalXMarking.g:976:4: (lv_grade_5_0= ruleXPartGrade )
            	    {
            	    // InternalXMarking.g:976:4: (lv_grade_5_0= ruleXPartGrade )
            	    // InternalXMarking.g:977:5: lv_grade_5_0= ruleXPartGrade
            	    {

            	    					newCompositeNode(grammarAccess.getXMarkAccess().getGradeXPartGradeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_grade_5_0=ruleXPartGrade();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXMarkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"grade",
            	    						lv_grade_5_0,
            	    						"ac.soton.xmark.XMarking.XPartGrade");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getXMarkAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleXMark"


    // $ANTLR start "entryRuleSectionGrade"
    // InternalXMarking.g:1002:1: entryRuleSectionGrade returns [EObject current=null] : iv_ruleSectionGrade= ruleSectionGrade EOF ;
    public final EObject entryRuleSectionGrade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionGrade = null;


        try {
            // InternalXMarking.g:1002:53: (iv_ruleSectionGrade= ruleSectionGrade EOF )
            // InternalXMarking.g:1003:2: iv_ruleSectionGrade= ruleSectionGrade EOF
            {
             newCompositeNode(grammarAccess.getSectionGradeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSectionGrade=ruleSectionGrade();

            state._fsp--;

             current =iv_ruleSectionGrade; 
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
    // $ANTLR end "entryRuleSectionGrade"


    // $ANTLR start "ruleSectionGrade"
    // InternalXMarking.g:1009:1: ruleSectionGrade returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_4= ')' )? otherlv_5= '{' ( (lv_subgrades_6_0= ruleXPartGrade ) ) ( (lv_subgrades_7_0= ruleXPartGrade ) )* otherlv_8= '}' ) ;
    public final EObject ruleSectionGrade() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_subgrades_6_0 = null;

        EObject lv_subgrades_7_0 = null;



        	enterRule();

        try {
            // InternalXMarking.g:1015:2: ( ( ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_4= ')' )? otherlv_5= '{' ( (lv_subgrades_6_0= ruleXPartGrade ) ) ( (lv_subgrades_7_0= ruleXPartGrade ) )* otherlv_8= '}' ) )
            // InternalXMarking.g:1016:2: ( ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_4= ')' )? otherlv_5= '{' ( (lv_subgrades_6_0= ruleXPartGrade ) ) ( (lv_subgrades_7_0= ruleXPartGrade ) )* otherlv_8= '}' )
            {
            // InternalXMarking.g:1016:2: ( ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_4= ')' )? otherlv_5= '{' ( (lv_subgrades_6_0= ruleXPartGrade ) ) ( (lv_subgrades_7_0= ruleXPartGrade ) )* otherlv_8= '}' )
            // InternalXMarking.g:1017:3: ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_4= ')' )? otherlv_5= '{' ( (lv_subgrades_6_0= ruleXPartGrade ) ) ( (lv_subgrades_7_0= ruleXPartGrade ) )* otherlv_8= '}'
            {
            // InternalXMarking.g:1017:3: ( ( ruleEString ) )
            // InternalXMarking.g:1018:4: ( ruleEString )
            {
            // InternalXMarking.g:1018:4: ( ruleEString )
            // InternalXMarking.g:1019:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionGradeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSectionGradeAccess().getPartSectionCrossReference_0_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMarking.g:1033:3: (otherlv_1= '(' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_4= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXMarking.g:1034:4: otherlv_1= '(' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSectionGradeAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalXMarking.g:1038:4: ( ( ruleEString ) )
                    // InternalXMarking.g:1039:5: ( ruleEString )
                    {
                    // InternalXMarking.g:1039:5: ( ruleEString )
                    // InternalXMarking.g:1040:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSectionGradeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSectionGradeAccess().getCommentsCommentCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXMarking.g:1054:4: ( ( ruleEString ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalXMarking.g:1055:5: ( ruleEString )
                    	    {
                    	    // InternalXMarking.g:1055:5: ( ruleEString )
                    	    // InternalXMarking.g:1056:6: ruleEString
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getSectionGradeRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getSectionGradeAccess().getCommentsCommentCrossReference_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getSectionGradeAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSectionGradeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXMarking.g:1079:3: ( (lv_subgrades_6_0= ruleXPartGrade ) )
            // InternalXMarking.g:1080:4: (lv_subgrades_6_0= ruleXPartGrade )
            {
            // InternalXMarking.g:1080:4: (lv_subgrades_6_0= ruleXPartGrade )
            // InternalXMarking.g:1081:5: lv_subgrades_6_0= ruleXPartGrade
            {

            					newCompositeNode(grammarAccess.getSectionGradeAccess().getSubgradesXPartGradeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_subgrades_6_0=ruleXPartGrade();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionGradeRule());
            					}
            					add(
            						current,
            						"subgrades",
            						lv_subgrades_6_0,
            						"ac.soton.xmark.XMarking.XPartGrade");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMarking.g:1098:3: ( (lv_subgrades_7_0= ruleXPartGrade ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXMarking.g:1099:4: (lv_subgrades_7_0= ruleXPartGrade )
            	    {
            	    // InternalXMarking.g:1099:4: (lv_subgrades_7_0= ruleXPartGrade )
            	    // InternalXMarking.g:1100:5: lv_subgrades_7_0= ruleXPartGrade
            	    {

            	    					newCompositeNode(grammarAccess.getSectionGradeAccess().getSubgradesXPartGradeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_subgrades_7_0=ruleXPartGrade();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionGradeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subgrades",
            	    						lv_subgrades_7_0,
            	    						"ac.soton.xmark.XMarking.XPartGrade");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSectionGradeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSectionGrade"


    // $ANTLR start "entryRuleQuestionGrade"
    // InternalXMarking.g:1125:1: entryRuleQuestionGrade returns [EObject current=null] : iv_ruleQuestionGrade= ruleQuestionGrade EOF ;
    public final EObject entryRuleQuestionGrade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionGrade = null;


        try {
            // InternalXMarking.g:1125:54: (iv_ruleQuestionGrade= ruleQuestionGrade EOF )
            // InternalXMarking.g:1126:2: iv_ruleQuestionGrade= ruleQuestionGrade EOF
            {
             newCompositeNode(grammarAccess.getQuestionGradeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionGrade=ruleQuestionGrade();

            state._fsp--;

             current =iv_ruleQuestionGrade; 
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
    // $ANTLR end "entryRuleQuestionGrade"


    // $ANTLR start "ruleQuestionGrade"
    // InternalXMarking.g:1132:1: ruleQuestionGrade returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_mark_1_0= ruleEInt ) ) (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleQuestionGrade() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_mark_1_0 = null;



        	enterRule();

        try {
            // InternalXMarking.g:1138:2: ( ( ( ( ruleEString ) ) ( (lv_mark_1_0= ruleEInt ) ) (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? ) )
            // InternalXMarking.g:1139:2: ( ( ( ruleEString ) ) ( (lv_mark_1_0= ruleEInt ) ) (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? )
            {
            // InternalXMarking.g:1139:2: ( ( ( ruleEString ) ) ( (lv_mark_1_0= ruleEInt ) ) (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? )
            // InternalXMarking.g:1140:3: ( ( ruleEString ) ) ( (lv_mark_1_0= ruleEInt ) ) (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )?
            {
            // InternalXMarking.g:1140:3: ( ( ruleEString ) )
            // InternalXMarking.g:1141:4: ( ruleEString )
            {
            // InternalXMarking.g:1141:4: ( ruleEString )
            // InternalXMarking.g:1142:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionGradeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQuestionGradeAccess().getPartQuestionCrossReference_0_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMarking.g:1156:3: ( (lv_mark_1_0= ruleEInt ) )
            // InternalXMarking.g:1157:4: (lv_mark_1_0= ruleEInt )
            {
            // InternalXMarking.g:1157:4: (lv_mark_1_0= ruleEInt )
            // InternalXMarking.g:1158:5: lv_mark_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getQuestionGradeAccess().getMarkEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_mark_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionGradeRule());
            					}
            					set(
            						current,
            						"mark",
            						lv_mark_1_0,
            						"ac.soton.xmark.XMarking.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXMarking.g:1175:3: (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXMarking.g:1176:4: otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getQuestionGradeAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalXMarking.g:1180:4: ( ( ruleEString ) )
                    // InternalXMarking.g:1181:5: ( ruleEString )
                    {
                    // InternalXMarking.g:1181:5: ( ruleEString )
                    // InternalXMarking.g:1182:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuestionGradeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getQuestionGradeAccess().getCommentsCommentCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXMarking.g:1196:4: (otherlv_4= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==32) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalXMarking.g:1197:5: otherlv_4= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getQuestionGradeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalXMarking.g:1201:5: ( ( ruleEString ) )
                    	    // InternalXMarking.g:1202:6: ( ruleEString )
                    	    {
                    	    // InternalXMarking.g:1202:6: ( ruleEString )
                    	    // InternalXMarking.g:1203:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getQuestionGradeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getQuestionGradeAccess().getCommentsCommentCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getQuestionGradeAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleQuestionGrade"


    // $ANTLR start "entryRuleEInt"
    // InternalXMarking.g:1227:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalXMarking.g:1227:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalXMarking.g:1228:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalXMarking.g:1234:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalXMarking.g:1240:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalXMarking.g:1241:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalXMarking.g:1241:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalXMarking.g:1242:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalXMarking.g:1242:3: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXMarking.g:1243:4: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_17); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000067080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000700020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000067000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000077000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100040000L});

}