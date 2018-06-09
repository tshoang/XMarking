/**
 * generated by Xtext 2.14.0
 */
package ac.soton.xmark.feedback.formatting2;

import ac.soton.xmark.feedback.ExerciseFeedback;
import ac.soton.xmark.feedback.Feedback;
import ac.soton.xmark.feedback.services.FeedbackGrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class FeedbackFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private FeedbackGrammarAccess _feedbackGrammarAccess;
  
  protected void _format(final ExerciseFeedback exerciseFeedback, @Extension final IFormattableDocument document) {
    final EList<Feedback> feedbacks = exerciseFeedback.getFeedbacks();
    for (final Feedback feedback : feedbacks) {
      {
        final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
          it.setNewLines(2);
        };
        document.<Feedback>prepend(document.<Feedback>format(feedback), _function);
        final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
          it.indent();
        };
        document.<Feedback>interior(feedback, _function_1);
      }
    }
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.allRegionsFor(exerciseFeedback).ruleCallTo(this._feedbackGrammarAccess.getML_COMMENTRule()), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(exerciseFeedback).keyword("end"), _function_1);
  }
  
  protected void _format(final Feedback feedback, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(feedback).keyword("recipients"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(feedback).keyword("title"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(feedback).keyword("feedback"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(feedback).keyword("}"), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.allRegionsFor(feedback).ruleCallTo(this._feedbackGrammarAccess.getML_COMMENTRule()), _function_4);
  }
  
  public void format(final Object exerciseFeedback, final IFormattableDocument document) {
    if (exerciseFeedback instanceof XtextResource) {
      _format((XtextResource)exerciseFeedback, document);
      return;
    } else if (exerciseFeedback instanceof ExerciseFeedback) {
      _format((ExerciseFeedback)exerciseFeedback, document);
      return;
    } else if (exerciseFeedback instanceof Feedback) {
      _format((Feedback)exerciseFeedback, document);
      return;
    } else if (exerciseFeedback instanceof EObject) {
      _format((EObject)exerciseFeedback, document);
      return;
    } else if (exerciseFeedback == null) {
      _format((Void)null, document);
      return;
    } else if (exerciseFeedback != null) {
      _format(exerciseFeedback, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exerciseFeedback, document).toString());
    }
  }
}
