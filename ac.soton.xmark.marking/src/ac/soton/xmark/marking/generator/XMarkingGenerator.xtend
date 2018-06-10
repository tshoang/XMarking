/*
 * generated by Xtext 2.14.0
 */
package ac.soton.xmark.marking.generator

import ac.soton.xmark.marking.Exercise
import ac.soton.xmark.marking.Group
import ac.soton.xmark.marking.Mark
import ac.soton.xmark.marking.PartGrade
import ac.soton.xmark.marking.QuestionGrade
import ac.soton.xmark.marking.SectionGrade
import ac.soton.xmark.marking.Student
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class XMarkingGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var exercise = resource.contents.get(0) as Exercise
		
		fsa.generateFile(exercise.name + ".fbk", exercise.feedback)
		
		fsa.generateFile(exercise.name + ".grd", exercise.grade)
	}
		
	def private feedback(Exercise exercise) 
	'''«
	»Feedback «exercise.name»
«	FOR mark : exercise.marks»

«		mark.recipient.name» {
«		»	recipients «mark.recipients(exercise)»
«		»	title «exercise.title»
«		»	feedback «mark.feedback(exercise)»
«		»}
«	ENDFOR»«
	»end«
	»'''
	
	def private recipients(Mark mark, Exercise exercise) 
	'''«
		»"«val recipient = mark.recipient»«
		IF recipient instanceof Group»«
			val group = recipient as Group»«
			FOR student : group.students»«
				student.firstname» «student.lastname» <«student.name»@ecs.soton.ac.uk>, «
			ENDFOR»«
		ELSE»«
			val student = recipient as Student»«
			student.firstname» «student.lastname» <«student.name»@ecs.soton.ac.uk>«
		ENDIF»"
	'''

	def private title(Exercise exercise)
	'''"«exercise.module» «exercise.name» Feedback"'''
		
	def private feedback(Mark mark, Exercise exercise)
	'''
«	»"
«	» Dear «mark.recipients»
«	» Please find the the feedback for your «exercise.name» below
«	» --
«	FOR grade : mark.grade»
«		grade.feedback»
«	ENDFOR»
«	» Total «mark.calculateGrade»/100
«	» --
«	»Best regards,
«	»
«	»"
	'''

	def private int calculateGrade(Mark mark) {
		var int calGrade = 0
		
		for (grade : mark.grade) {
			calGrade += grade.calculateGrade
		}
		
		return calGrade;
	}	

	def private int calculateGrade(PartGrade grade) {
		if (grade instanceof QuestionGrade) {
			return grade.mark
		}
		val sectGrade = grade as SectionGrade
		var calGrade = 0
		for (partGrade : sectGrade.subgrades) {
			calGrade += partGrade.calculateGrade
		}
		return calGrade;
	}

	def private recipients(Mark mark)
	'''«
		»«val recipient = mark.recipient»«
		IF recipient instanceof Group»«
			val group = recipient as Group»«
			FOR student : group.students»«
				student.firstname», «
			ENDFOR»«
		ELSE»«
			val student = recipient as Student»«
			student.firstname»,«
		ENDIF»
	'''

	def private String feedback(PartGrade grade)
	'''«
	val part = grade.part»«
	IF grade instanceof QuestionGrade»«
		val questionGrade = grade as QuestionGrade»
«	»	«part.name» («questionGrade.mark»/«part.grade»)
		«FOR comment : grade.comments»
«	»		* «comment.comment»
		«ENDFOR»
	«ELSE»
		«val sectionGrade = grade as SectionGrade»
«	»	«part.name»
		«FOR comment : grade.comments»
«	»		* «comment.comment»
		«ENDFOR»
		«FOR subGrade : sectionGrade.subgrades»
«		»	«subGrade.feedback»
		«ENDFOR»								
	«ENDIF»
	'''

	def private grade(Exercise exercise)
	'''«
	FOR student : exercise.students»
«		student.grade(exercise)»«
	ENDFOR»«
	»'''

	/**
	 * The algorithm is certainly not optimal at the moment
	 */
	def private grade(Student student, Exercise exercise)
	'''«student.name»,«
	FOR mark : exercise.marks»«
		IF mark.recipient instanceof Student»«
			IF student === mark.recipient»«
				mark.printGrades»«
			ENDIF»«
		ELSE»«
			val group = mark.recipient as Group»«
			IF group.students.contains(student)»«
				mark.printGrades»«
			ENDIF»«
		ENDIF»«
	ENDFOR
	»'''
	
	def private printGrades(Mark mark)
	'''«
	FOR grade : mark.grade»«
		printGrade(grade)»«
	ENDFOR
	»'''

	def private String printGrade(PartGrade grade)
	'''«
	IF grade instanceof QuestionGrade»«
		grade.mark»,«
	ELSE»«
		val sectGrade = grade as SectionGrade»«
		FOR subGrade : sectGrade.subgrades»«
			printGrade(subGrade)»«
		ENDFOR»«
	ENDIF»'''
}
