/**
 * Copyright (c) 2018 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.xmarking.marking;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ac.soton.xmarking.marking.MarkingFactory
 * @model kind="package"
 * @generated
 */
public interface MarkingPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 University of Southampton.\n\nAll rights reserved. This program and the accompanying materials  are made\navailable under the terms of the Eclipse Public License v1.0 which accompanies\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "marking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xmarking.soton.ac/models/marking/2018";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "marking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarkingPackage eINSTANCE = ac.soton.xmarking.marking.impl.MarkingPackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.soton.xmarking.marking.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmarking.marking.impl.NamedElementImpl
	 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmarking.marking.impl.ExerciseImpl <em>Exercise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmarking.marking.impl.ExerciseImpl
	 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getExercise()
	 * @generated
	 */
	int EXERCISE = 1;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__PARTS = 0;

	/**
	 * The feature id for the '<em><b>Recipients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__RECIPIENTS = 1;

	/**
	 * The number of structural features of the '<em>Exercise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exercise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmarking.marking.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmarking.marking.impl.PartImpl
	 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getPart()
	 * @generated
	 */
	int PART = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__COMMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmarking.marking.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmarking.marking.impl.SectionImpl
	 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = PART__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__COMMENTS = PART__COMMENTS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SUBSECTIONS = PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmarking.marking.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmarking.marking.impl.QuestionImpl
	 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NAME = PART__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__COMMENTS = PART__COMMENTS;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmarking.marking.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmarking.marking.impl.CommentImpl
	 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmarking.marking.impl.RecipientImpl <em>Recipient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmarking.marking.impl.RecipientImpl
	 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getRecipient()
	 * @generated
	 */
	int RECIPIENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Grades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT__GRADES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Recipient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Recipient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmarking.marking.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmarking.marking.impl.StudentImpl
	 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = RECIPIENT__NAME;

	/**
	 * The feature id for the '<em><b>Grades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__GRADES = RECIPIENT__GRADES;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__FIRSTNAME = RECIPIENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__LASTNAME = RECIPIENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = RECIPIENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = RECIPIENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmarking.marking.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmarking.marking.impl.GroupImpl
	 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = RECIPIENT__NAME;

	/**
	 * The feature id for the '<em><b>Grades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GRADES = RECIPIENT__GRADES;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__STUDENTS = RECIPIENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = RECIPIENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = RECIPIENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmarking.marking.impl.PartGradeImpl <em>Part Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmarking.marking.impl.PartGradeImpl
	 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getPartGrade()
	 * @generated
	 */
	int PART_GRADE = 9;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_GRADE__PART = 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_GRADE__COMMENTS = 1;

	/**
	 * The number of structural features of the '<em>Part Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_GRADE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Part Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_GRADE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmarking.marking.impl.SectionGradeImpl <em>Section Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmarking.marking.impl.SectionGradeImpl
	 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getSectionGrade()
	 * @generated
	 */
	int SECTION_GRADE = 10;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_GRADE__PART = PART_GRADE__PART;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_GRADE__COMMENTS = PART_GRADE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Subgrades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_GRADE__SUBGRADES = PART_GRADE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_GRADE__MARK = PART_GRADE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Section Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_GRADE_FEATURE_COUNT = PART_GRADE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Section Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_GRADE_OPERATION_COUNT = PART_GRADE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmarking.marking.impl.QuestionGradeImpl <em>Question Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmarking.marking.impl.QuestionGradeImpl
	 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getQuestionGrade()
	 * @generated
	 */
	int QUESTION_GRADE = 11;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GRADE__PART = PART_GRADE__PART;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GRADE__COMMENTS = PART_GRADE__COMMENTS;

	/**
	 * The number of structural features of the '<em>Question Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GRADE_FEATURE_COUNT = PART_GRADE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Question Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GRADE_OPERATION_COUNT = PART_GRADE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ac.soton.xmarking.marking.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ac.soton.xmarking.marking.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.xmarking.marking.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ac.soton.xmarking.marking.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmarking.marking.Exercise <em>Exercise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exercise</em>'.
	 * @see ac.soton.xmarking.marking.Exercise
	 * @generated
	 */
	EClass getExercise();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmarking.marking.Exercise#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see ac.soton.xmarking.marking.Exercise#getParts()
	 * @see #getExercise()
	 * @generated
	 */
	EReference getExercise_Parts();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmarking.marking.Exercise#getRecipients <em>Recipients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recipients</em>'.
	 * @see ac.soton.xmarking.marking.Exercise#getRecipients()
	 * @see #getExercise()
	 * @generated
	 */
	EReference getExercise_Recipients();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmarking.marking.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see ac.soton.xmarking.marking.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmarking.marking.Part#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see ac.soton.xmarking.marking.Part#getComments()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Comments();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmarking.marking.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see ac.soton.xmarking.marking.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmarking.marking.Section#getSubsections <em>Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsections</em>'.
	 * @see ac.soton.xmarking.marking.Section#getSubsections()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Subsections();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmarking.marking.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see ac.soton.xmarking.marking.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmarking.marking.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see ac.soton.xmarking.marking.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.xmarking.marking.Comment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see ac.soton.xmarking.marking.Comment#getComment()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Comment();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmarking.marking.Recipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipient</em>'.
	 * @see ac.soton.xmarking.marking.Recipient
	 * @generated
	 */
	EClass getRecipient();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmarking.marking.Recipient#getGrades <em>Grades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grades</em>'.
	 * @see ac.soton.xmarking.marking.Recipient#getGrades()
	 * @see #getRecipient()
	 * @generated
	 */
	EReference getRecipient_Grades();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmarking.marking.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see ac.soton.xmarking.marking.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.xmarking.marking.Student#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see ac.soton.xmarking.marking.Student#getFirstname()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.xmarking.marking.Student#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see ac.soton.xmarking.marking.Student#getLastname()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Lastname();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmarking.marking.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see ac.soton.xmarking.marking.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmarking.marking.Group#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see ac.soton.xmarking.marking.Group#getStudents()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Students();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmarking.marking.PartGrade <em>Part Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Grade</em>'.
	 * @see ac.soton.xmarking.marking.PartGrade
	 * @generated
	 */
	EClass getPartGrade();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.xmarking.marking.PartGrade#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part</em>'.
	 * @see ac.soton.xmarking.marking.PartGrade#getPart()
	 * @see #getPartGrade()
	 * @generated
	 */
	EReference getPartGrade_Part();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.xmarking.marking.PartGrade#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comments</em>'.
	 * @see ac.soton.xmarking.marking.PartGrade#getComments()
	 * @see #getPartGrade()
	 * @generated
	 */
	EReference getPartGrade_Comments();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmarking.marking.SectionGrade <em>Section Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Grade</em>'.
	 * @see ac.soton.xmarking.marking.SectionGrade
	 * @generated
	 */
	EClass getSectionGrade();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmarking.marking.SectionGrade#getSubgrades <em>Subgrades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subgrades</em>'.
	 * @see ac.soton.xmarking.marking.SectionGrade#getSubgrades()
	 * @see #getSectionGrade()
	 * @generated
	 */
	EReference getSectionGrade_Subgrades();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.xmarking.marking.SectionGrade#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mark</em>'.
	 * @see ac.soton.xmarking.marking.SectionGrade#getMark()
	 * @see #getSectionGrade()
	 * @generated
	 */
	EAttribute getSectionGrade_Mark();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmarking.marking.QuestionGrade <em>Question Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Grade</em>'.
	 * @see ac.soton.xmarking.marking.QuestionGrade
	 * @generated
	 */
	EClass getQuestionGrade();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MarkingFactory getMarkingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ac.soton.xmarking.marking.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmarking.marking.impl.NamedElementImpl
		 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link ac.soton.xmarking.marking.impl.ExerciseImpl <em>Exercise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmarking.marking.impl.ExerciseImpl
		 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getExercise()
		 * @generated
		 */
		EClass EXERCISE = eINSTANCE.getExercise();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE__PARTS = eINSTANCE.getExercise_Parts();

		/**
		 * The meta object literal for the '<em><b>Recipients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE__RECIPIENTS = eINSTANCE.getExercise_Recipients();

		/**
		 * The meta object literal for the '{@link ac.soton.xmarking.marking.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmarking.marking.impl.PartImpl
		 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__COMMENTS = eINSTANCE.getPart_Comments();

		/**
		 * The meta object literal for the '{@link ac.soton.xmarking.marking.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmarking.marking.impl.SectionImpl
		 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__SUBSECTIONS = eINSTANCE.getSection_Subsections();

		/**
		 * The meta object literal for the '{@link ac.soton.xmarking.marking.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmarking.marking.impl.QuestionImpl
		 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '{@link ac.soton.xmarking.marking.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmarking.marking.impl.CommentImpl
		 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__COMMENT = eINSTANCE.getComment_Comment();

		/**
		 * The meta object literal for the '{@link ac.soton.xmarking.marking.impl.RecipientImpl <em>Recipient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmarking.marking.impl.RecipientImpl
		 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getRecipient()
		 * @generated
		 */
		EClass RECIPIENT = eINSTANCE.getRecipient();

		/**
		 * The meta object literal for the '<em><b>Grades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPIENT__GRADES = eINSTANCE.getRecipient_Grades();

		/**
		 * The meta object literal for the '{@link ac.soton.xmarking.marking.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmarking.marking.impl.StudentImpl
		 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__FIRSTNAME = eINSTANCE.getStudent_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__LASTNAME = eINSTANCE.getStudent_Lastname();

		/**
		 * The meta object literal for the '{@link ac.soton.xmarking.marking.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmarking.marking.impl.GroupImpl
		 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__STUDENTS = eINSTANCE.getGroup_Students();

		/**
		 * The meta object literal for the '{@link ac.soton.xmarking.marking.impl.PartGradeImpl <em>Part Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmarking.marking.impl.PartGradeImpl
		 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getPartGrade()
		 * @generated
		 */
		EClass PART_GRADE = eINSTANCE.getPartGrade();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_GRADE__PART = eINSTANCE.getPartGrade_Part();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_GRADE__COMMENTS = eINSTANCE.getPartGrade_Comments();

		/**
		 * The meta object literal for the '{@link ac.soton.xmarking.marking.impl.SectionGradeImpl <em>Section Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmarking.marking.impl.SectionGradeImpl
		 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getSectionGrade()
		 * @generated
		 */
		EClass SECTION_GRADE = eINSTANCE.getSectionGrade();

		/**
		 * The meta object literal for the '<em><b>Subgrades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_GRADE__SUBGRADES = eINSTANCE.getSectionGrade_Subgrades();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_GRADE__MARK = eINSTANCE.getSectionGrade_Mark();

		/**
		 * The meta object literal for the '{@link ac.soton.xmarking.marking.impl.QuestionGradeImpl <em>Question Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmarking.marking.impl.QuestionGradeImpl
		 * @see ac.soton.xmarking.marking.impl.MarkingPackageImpl#getQuestionGrade()
		 * @generated
		 */
		EClass QUESTION_GRADE = eINSTANCE.getQuestionGrade();

	}

} //MarkingPackage
