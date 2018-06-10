/*
 * generated by Xtext 2.14.0
 */
grammar InternalXMarking;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package ac.soton.xmark.marking.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package ac.soton.xmark.marking.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xmark.marking.services.XMarkingGrammarAccess;

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleExercise
entryRuleExercise returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExerciseRule()); }
	iv_ruleExercise=ruleExercise
	{ $current=$iv_ruleExercise.current; }
	EOF;

// Rule Exercise
ruleExercise returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getExerciseAccess().getExerciseAction_0(),
					$current);
			}
		)
		(
			otherlv_1='exercise'
			{
				newLeafNode(otherlv_1, grammarAccess.getExerciseAccess().getExerciseKeyword_1_0());
			}
			    |
			(
				otherlv_2='problem'
				{
					newLeafNode(otherlv_2, grammarAccess.getExerciseAccess().getProblemKeyword_1_1_0());
				}
				otherlv_3='class'
				{
					newLeafNode(otherlv_3, grammarAccess.getExerciseAccess().getClassKeyword_1_1_1());
				}
			)
			    |
			otherlv_4='tutorial'
			{
				newLeafNode(otherlv_4, grammarAccess.getExerciseAccess().getTutorialKeyword_1_2());
			}
			    |
			otherlv_5='assignment'
			{
				newLeafNode(otherlv_5, grammarAccess.getExerciseAccess().getAssignmentKeyword_1_3());
			}
			    |
			otherlv_6='coursework'
			{
				newLeafNode(otherlv_6, grammarAccess.getExerciseAccess().getCourseworkKeyword_1_4());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getExerciseAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_7_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExerciseRule());
					}
					set(
						$current,
						"name",
						lv_name_7_0,
						"ac.soton.xmark.marking.XMarking.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='('
		{
			newLeafNode(otherlv_8, grammarAccess.getExerciseAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExerciseAccess().getModuleEStringParserRuleCall_4_0());
				}
				lv_module_9_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExerciseRule());
					}
					set(
						$current,
						"module",
						lv_module_9_0,
						"ac.soton.xmark.marking.XMarking.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10=')'
		{
			newLeafNode(otherlv_10, grammarAccess.getExerciseAccess().getRightParenthesisKeyword_5());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getExerciseAccess().getPartsXPartParserRuleCall_6_0_0());
					}
					lv_parts_11_0=ruleXPart
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExerciseRule());
						}
						add(
							$current,
							"parts",
							lv_parts_11_0,
							"ac.soton.xmark.marking.XMarking.XPart");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExerciseAccess().getPartsXPartParserRuleCall_6_1_0());
					}
					lv_parts_12_0=ruleXPart
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExerciseRule());
						}
						add(
							$current,
							"parts",
							lv_parts_12_0,
							"ac.soton.xmark.marking.XMarking.XPart");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		(
			otherlv_13='students'
			{
				newLeafNode(otherlv_13, grammarAccess.getExerciseAccess().getStudentsKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExerciseAccess().getStudentsXStudentParserRuleCall_7_1_0());
					}
					lv_students_14_0=ruleXStudent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExerciseRule());
						}
						add(
							$current,
							"students",
							lv_students_14_0,
							"ac.soton.xmark.marking.XMarking.XStudent");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExerciseAccess().getStudentsXStudentParserRuleCall_7_2_0());
					}
					lv_students_15_0=ruleXStudent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExerciseRule());
						}
						add(
							$current,
							"students",
							lv_students_15_0,
							"ac.soton.xmark.marking.XMarking.XStudent");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
		(
			otherlv_16='groups'
			{
				newLeafNode(otherlv_16, grammarAccess.getExerciseAccess().getGroupsKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExerciseAccess().getGroupsXGroupParserRuleCall_8_1_0());
					}
					lv_groups_17_0=ruleXGroup
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExerciseRule());
						}
						add(
							$current,
							"groups",
							lv_groups_17_0,
							"ac.soton.xmark.marking.XMarking.XGroup");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExerciseAccess().getGroupsXGroupParserRuleCall_8_2_0());
					}
					lv_groups_18_0=ruleXGroup
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExerciseRule());
						}
						add(
							$current,
							"groups",
							lv_groups_18_0,
							"ac.soton.xmark.marking.XMarking.XGroup");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		(
			otherlv_19='marks'
			{
				newLeafNode(otherlv_19, grammarAccess.getExerciseAccess().getMarksKeyword_9_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExerciseAccess().getMarksXMarkParserRuleCall_9_1_0());
					}
					lv_marks_20_0=ruleXMark
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExerciseRule());
						}
						add(
							$current,
							"marks",
							lv_marks_20_0,
							"ac.soton.xmark.marking.XMarking.XMark");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExerciseAccess().getMarksXMarkParserRuleCall_9_2_0());
					}
					lv_marks_21_0=ruleXMark
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExerciseRule());
						}
						add(
							$current,
							"marks",
							lv_marks_21_0,
							"ac.soton.xmark.marking.XMarking.XMark");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		otherlv_22='end'
		{
			newLeafNode(otherlv_22, grammarAccess.getExerciseAccess().getEndKeyword_10());
		}
	)
;

// Entry rule entryRuleXPart
entryRuleXPart returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXPartRule()); }
	iv_ruleXPart=ruleXPart
	{ $current=$iv_ruleXPart.current; }
	EOF;

// Rule XPart
ruleXPart returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getXPartAccess().getXSectionParserRuleCall_0());
		}
		this_XSection_0=ruleXSection
		{
			$current = $this_XSection_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getXPartAccess().getXQuestionParserRuleCall_1());
		}
		this_XQuestion_1=ruleXQuestion
		{
			$current = $this_XQuestion_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleXPartGrade
entryRuleXPartGrade returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXPartGradeRule()); }
	iv_ruleXPartGrade=ruleXPartGrade
	{ $current=$iv_ruleXPartGrade.current; }
	EOF;

// Rule XPartGrade
ruleXPartGrade returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getXPartGradeAccess().getSectionGradeParserRuleCall_0());
		}
		this_SectionGrade_0=ruleSectionGrade
		{
			$current = $this_SectionGrade_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getXPartGradeAccess().getQuestionGradeParserRuleCall_1());
		}
		this_QuestionGrade_1=ruleQuestionGrade
		{
			$current = $this_QuestionGrade_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleXComment
entryRuleXComment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXCommentRule()); }
	iv_ruleXComment=ruleXComment
	{ $current=$iv_ruleXComment.current; }
	EOF;

// Rule XComment
ruleXComment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getXCommentAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getXCommentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getXCommentAccess().getColonKeyword_1());
		}
		(
			(
				lv_comment_2_0=RULE_STRING
				{
					newLeafNode(lv_comment_2_0, grammarAccess.getXCommentAccess().getCommentSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getXCommentRule());
					}
					setWithLastConsumed(
						$current,
						"comment",
						lv_comment_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleXSection
entryRuleXSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXSectionRule()); }
	iv_ruleXSection=ruleXSection
	{ $current=$iv_ruleXSection.current; }
	EOF;

// Rule XSection
ruleXSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='section'
			{
				newLeafNode(otherlv_0, grammarAccess.getXSectionAccess().getSectionKeyword_0_0());
			}
			    |
			otherlv_1='part'
			{
				newLeafNode(otherlv_1, grammarAccess.getXSectionAccess().getPartKeyword_0_1());
			}
			    |
			otherlv_2='subsection'
			{
				newLeafNode(otherlv_2, grammarAccess.getXSectionAccess().getSubsectionKeyword_0_2());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getXSectionAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getXSectionRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"ac.soton.xmark.marking.XMarking.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getXSectionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getXSectionAccess().getCommentsXCommentParserRuleCall_3_0_0());
					}
					lv_comments_5_0=ruleXComment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getXSectionRule());
						}
						add(
							$current,
							"comments",
							lv_comments_5_0,
							"ac.soton.xmark.marking.XMarking.XComment");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getXSectionAccess().getCommentsXCommentParserRuleCall_3_1_0());
					}
					lv_comments_6_0=ruleXComment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getXSectionRule());
						}
						add(
							$current,
							"comments",
							lv_comments_6_0,
							"ac.soton.xmark.marking.XMarking.XComment");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getXSectionAccess().getSubsectionsXPartParserRuleCall_4_0());
				}
				lv_subsections_7_0=ruleXPart
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getXSectionRule());
					}
					add(
						$current,
						"subsections",
						lv_subsections_7_0,
						"ac.soton.xmark.marking.XMarking.XPart");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getXSectionAccess().getSubsectionsXPartParserRuleCall_5_0());
				}
				lv_subsections_8_0=ruleXPart
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getXSectionRule());
					}
					add(
						$current,
						"subsections",
						lv_subsections_8_0,
						"ac.soton.xmark.marking.XMarking.XPart");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getXSectionAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleXQuestion
entryRuleXQuestion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXQuestionRule()); }
	iv_ruleXQuestion=ruleXQuestion
	{ $current=$iv_ruleXQuestion.current; }
	EOF;

// Rule XQuestion
ruleXQuestion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getXQuestionAccess().getQuestionAction_0(),
					$current);
			}
		)
		(
			otherlv_1='question'
			{
				newLeafNode(otherlv_1, grammarAccess.getXQuestionAccess().getQuestionKeyword_1_0());
			}
			    |
			otherlv_2='task'
			{
				newLeafNode(otherlv_2, grammarAccess.getXQuestionAccess().getTaskKeyword_1_1());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getXQuestionAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getXQuestionRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"ac.soton.xmark.marking.XMarking.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_grade_4_0=RULE_INT
				{
					newLeafNode(lv_grade_4_0, grammarAccess.getXQuestionAccess().getGradeINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getXQuestionRule());
					}
					setWithLastConsumed(
						$current,
						"grade",
						lv_grade_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getXQuestionAccess().getCommentsXCommentParserRuleCall_4_0_0());
					}
					lv_comments_5_0=ruleXComment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getXQuestionRule());
						}
						add(
							$current,
							"comments",
							lv_comments_5_0,
							"ac.soton.xmark.marking.XMarking.XComment");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getXQuestionAccess().getCommentsXCommentParserRuleCall_4_1_0());
					}
					lv_comments_6_0=ruleXComment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getXQuestionRule());
						}
						add(
							$current,
							"comments",
							lv_comments_6_0,
							"ac.soton.xmark.marking.XMarking.XComment");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
	)
;

// Entry rule entryRuleXStudent
entryRuleXStudent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXStudentRule()); }
	iv_ruleXStudent=ruleXStudent
	{ $current=$iv_ruleXStudent.current; }
	EOF;

// Rule XStudent
ruleXStudent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getXStudentAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getXStudentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getXStudentAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getXStudentAccess().getFirstnameEStringParserRuleCall_2_0());
				}
				lv_firstname_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getXStudentRule());
					}
					set(
						$current,
						"firstname",
						lv_firstname_2_0,
						"ac.soton.xmark.marking.XMarking.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getXStudentAccess().getLastnameEStringParserRuleCall_3_0());
				}
				lv_lastname_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getXStudentRule());
					}
					set(
						$current,
						"lastname",
						lv_lastname_3_0,
						"ac.soton.xmark.marking.XMarking.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleXGroup
entryRuleXGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXGroupRule()); }
	iv_ruleXGroup=ruleXGroup
	{ $current=$iv_ruleXGroup.current; }
	EOF;

// Rule XGroup
ruleXGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getXGroupAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getXGroupRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getXGroupAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getXGroupRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getXGroupAccess().getStudentsStudentCrossReference_2_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getXGroupRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getXGroupAccess().getStudentsStudentCrossReference_3_0());
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getXGroupAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleXMark
entryRuleXMark returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXMarkRule()); }
	iv_ruleXMark=ruleXMark
	{ $current=$iv_ruleXMark.current; }
	EOF;

// Rule XMark
ruleXMark returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getXMarkAccess().getMarkAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getXMarkRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getXMarkAccess().getRecipientRecipientCrossReference_1_0());
				}
			)
		)
		otherlv_2='begin'
		{
			newLeafNode(otherlv_2, grammarAccess.getXMarkAccess().getBeginKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getXMarkAccess().getGradeXPartGradeParserRuleCall_3_0());
				}
				lv_grade_3_0=ruleXPartGrade
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getXMarkRule());
					}
					add(
						$current,
						"grade",
						lv_grade_3_0,
						"ac.soton.xmark.marking.XMarking.XPartGrade");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getXMarkAccess().getGradeXPartGradeParserRuleCall_4_0());
				}
				lv_grade_4_0=ruleXPartGrade
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getXMarkRule());
					}
					add(
						$current,
						"grade",
						lv_grade_4_0,
						"ac.soton.xmark.marking.XMarking.XPartGrade");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='end'
		{
			newLeafNode(otherlv_5, grammarAccess.getXMarkAccess().getEndKeyword_5());
		}
	)
;

// Entry rule entryRuleSectionGrade
entryRuleSectionGrade returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSectionGradeRule()); }
	iv_ruleSectionGrade=ruleSectionGrade
	{ $current=$iv_ruleSectionGrade.current; }
	EOF;

// Rule SectionGrade
ruleSectionGrade returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSectionGradeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSectionGradeAccess().getPartSectionCrossReference_0_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getSectionGradeAccess().getLeftParenthesisKeyword_1_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSectionGradeRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getSectionGradeAccess().getCommentsCommentCrossReference_1_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSectionGradeRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getSectionGradeAccess().getCommentsCommentCrossReference_1_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getSectionGradeAccess().getRightParenthesisKeyword_1_3());
			}
		)?
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getSectionGradeAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSectionGradeAccess().getSubgradesXPartGradeParserRuleCall_3_0());
				}
				lv_subgrades_6_0=ruleXPartGrade
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSectionGradeRule());
					}
					add(
						$current,
						"subgrades",
						lv_subgrades_6_0,
						"ac.soton.xmark.marking.XMarking.XPartGrade");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSectionGradeAccess().getSubgradesXPartGradeParserRuleCall_4_0());
				}
				lv_subgrades_7_0=ruleXPartGrade
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSectionGradeRule());
					}
					add(
						$current,
						"subgrades",
						lv_subgrades_7_0,
						"ac.soton.xmark.marking.XMarking.XPartGrade");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getSectionGradeAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleQuestionGrade
entryRuleQuestionGrade returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuestionGradeRule()); }
	iv_ruleQuestionGrade=ruleQuestionGrade
	{ $current=$iv_ruleQuestionGrade.current; }
	EOF;

// Rule QuestionGrade
ruleQuestionGrade returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQuestionGradeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getQuestionGradeAccess().getPartQuestionCrossReference_0_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getQuestionGradeAccess().getMarkEIntParserRuleCall_1_0());
				}
				lv_mark_1_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuestionGradeRule());
					}
					set(
						$current,
						"mark",
						lv_mark_1_0,
						"ac.soton.xmark.marking.XMarking.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getQuestionGradeAccess().getLeftParenthesisKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getQuestionGradeRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getQuestionGradeAccess().getCommentsCommentCrossReference_2_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getQuestionGradeAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getQuestionGradeRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getQuestionGradeAccess().getCommentsCommentCrossReference_2_2_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getQuestionGradeAccess().getRightParenthesisKeyword_2_3());
			}
		)?
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
