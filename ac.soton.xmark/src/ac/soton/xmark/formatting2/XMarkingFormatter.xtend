/*
 * generated by Xtext 2.14.0
 */
package ac.soton.xmark.formatting2

import ac.soton.xmark.marking.Exercise
import ac.soton.xmark.marking.Section
import ac.soton.xmark.services.XMarkingGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class XMarkingFormatter extends AbstractFormatter2 {
	
	@Inject extension XMarkingGrammarAccess

	def dispatch void format(Exercise exercise, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (part : exercise.parts) {
			part.format
		}
		for (student : exercise.students) {
			student.format
		}
		for (group : exercise.groups) {
			group.format
		}
		for (mark : exercise.marks) {
			mark.format
		}
	}

	def dispatch void format(Section section, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (comment : section.comments) {
			comment.format
		}
		for (part : section.subsections) {
			part.format
		}
	}
	
	// TODO: implement for Question, Mark, SectionGrade
}
