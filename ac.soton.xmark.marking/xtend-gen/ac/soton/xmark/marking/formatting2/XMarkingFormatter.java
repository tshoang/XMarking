/**
 * generated by Xtext 2.14.0
 */
package ac.soton.xmark.marking.formatting2;

import ac.soton.xmark.marking.Comment;
import ac.soton.xmark.marking.Exercise;
import ac.soton.xmark.marking.Group;
import ac.soton.xmark.marking.Mark;
import ac.soton.xmark.marking.Part;
import ac.soton.xmark.marking.Section;
import ac.soton.xmark.marking.Student;
import ac.soton.xmark.marking.services.XMarkingGrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class XMarkingFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private XMarkingGrammarAccess _xMarkingGrammarAccess;
  
  protected void _format(final Exercise exercise, @Extension final IFormattableDocument document) {
    EList<Part> _parts = exercise.getParts();
    for (final Part part : _parts) {
      document.<Part>format(part);
    }
    EList<Student> _students = exercise.getStudents();
    for (final Student student : _students) {
      document.<Student>format(student);
    }
    EList<Group> _groups = exercise.getGroups();
    for (final Group group : _groups) {
      document.<Group>format(group);
    }
    EList<Mark> _marks = exercise.getMarks();
    for (final Mark mark : _marks) {
      document.<Mark>format(mark);
    }
  }
  
  protected void _format(final Section section, @Extension final IFormattableDocument document) {
    EList<Comment> _comments = section.getComments();
    for (final Comment comment : _comments) {
      document.<Comment>format(comment);
    }
    EList<Part> _subsections = section.getSubsections();
    for (final Part part : _subsections) {
      document.<Part>format(part);
    }
  }
  
  public void format(final Object section, final IFormattableDocument document) {
    if (section instanceof Section) {
      _format((Section)section, document);
      return;
    } else if (section instanceof XtextResource) {
      _format((XtextResource)section, document);
      return;
    } else if (section instanceof Exercise) {
      _format((Exercise)section, document);
      return;
    } else if (section instanceof EObject) {
      _format((EObject)section, document);
      return;
    } else if (section == null) {
      _format((Void)null, document);
      return;
    } else if (section != null) {
      _format(section, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(section, document).toString());
    }
  }
}
