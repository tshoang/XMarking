/*
 * generated by Xtext 2.14.0
 */
package ac.soton.xmark.marking.serializer;

import ac.soton.xmark.marking.services.XMarkingGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class XMarkingSyntacticSequencer extends AbstractSyntacticSequencer {

	protected XMarkingGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Exercise_AssignmentKeyword_1_3_or_CourseworkKeyword_1_4_or_ExerciseKeyword_1_0_or_TutorialKeyword_1_2_or___ProblemKeyword_1_1_0_ClassKeyword_1_1_1__;
	protected AbstractElementAlias match_XQuestion_QuestionKeyword_1_0_or_TaskKeyword_1_1;
	protected AbstractElementAlias match_XSection_PartKeyword_0_1_or_SectionKeyword_0_0_or_SubsectionKeyword_0_2;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XMarkingGrammarAccess) access;
		match_Exercise_AssignmentKeyword_1_3_or_CourseworkKeyword_1_4_or_ExerciseKeyword_1_0_or_TutorialKeyword_1_2_or___ProblemKeyword_1_1_0_ClassKeyword_1_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getExerciseAccess().getProblemKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getExerciseAccess().getClassKeyword_1_1_1())), new TokenAlias(false, false, grammarAccess.getExerciseAccess().getAssignmentKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getExerciseAccess().getCourseworkKeyword_1_4()), new TokenAlias(false, false, grammarAccess.getExerciseAccess().getExerciseKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getExerciseAccess().getTutorialKeyword_1_2()));
		match_XQuestion_QuestionKeyword_1_0_or_TaskKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getXQuestionAccess().getQuestionKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getXQuestionAccess().getTaskKeyword_1_1()));
		match_XSection_PartKeyword_0_1_or_SectionKeyword_0_0_or_SubsectionKeyword_0_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getXSectionAccess().getPartKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getXSectionAccess().getSectionKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXSectionAccess().getSubsectionKeyword_0_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Exercise_AssignmentKeyword_1_3_or_CourseworkKeyword_1_4_or_ExerciseKeyword_1_0_or_TutorialKeyword_1_2_or___ProblemKeyword_1_1_0_ClassKeyword_1_1_1__.equals(syntax))
				emit_Exercise_AssignmentKeyword_1_3_or_CourseworkKeyword_1_4_or_ExerciseKeyword_1_0_or_TutorialKeyword_1_2_or___ProblemKeyword_1_1_0_ClassKeyword_1_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XQuestion_QuestionKeyword_1_0_or_TaskKeyword_1_1.equals(syntax))
				emit_XQuestion_QuestionKeyword_1_0_or_TaskKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XSection_PartKeyword_0_1_or_SectionKeyword_0_0_or_SubsectionKeyword_0_2.equals(syntax))
				emit_XSection_PartKeyword_0_1_or_SectionKeyword_0_0_or_SubsectionKeyword_0_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'exercise' | ('problem' 'class') | 'tutorial' | 'assignment' | 'coursework'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=EString
	 */
	protected void emit_Exercise_AssignmentKeyword_1_3_or_CourseworkKeyword_1_4_or_ExerciseKeyword_1_0_or_TutorialKeyword_1_2_or___ProblemKeyword_1_1_0_ClassKeyword_1_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'question' | 'task'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=EString
	 */
	protected void emit_XQuestion_QuestionKeyword_1_0_or_TaskKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'section' | 'part' | 'subsection'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=EString
	 */
	protected void emit_XSection_PartKeyword_0_1_or_SectionKeyword_0_0_or_SubsectionKeyword_0_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
