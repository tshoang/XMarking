/**
 * Copyright (c) 2018 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.xmark.marking;

import ac.soton.xmark.markingcore.MarkingcorePackage;
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
 * @see ac.soton.xmark.marking.MarkingFactory
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
	MarkingPackage eINSTANCE = ac.soton.xmark.marking.impl.MarkingPackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.soton.xmark.marking.impl.ExerciseImpl <em>Exercise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmark.marking.impl.ExerciseImpl
	 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getExercise()
	 * @generated
	 */
	int EXERCISE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__NAME = MarkingcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__MODULE = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__PARTS = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__STUDENTS = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__GROUPS = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Marks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__MARKS = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Exercise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_FEATURE_COUNT = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Exercise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_OPERATION_COUNT = MarkingcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmark.marking.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmark.marking.impl.PartImpl
	 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getPart()
	 * @generated
	 */
	int PART = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = MarkingcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__COMMENTS = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__GRADE = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = MarkingcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmark.marking.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmark.marking.impl.SectionImpl
	 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 2;

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
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__GRADE = PART__GRADE;

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
	 * The meta object id for the '{@link ac.soton.xmark.marking.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmark.marking.impl.QuestionImpl
	 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 3;

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
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__GRADE = PART__GRADE;

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
	 * The meta object id for the '{@link ac.soton.xmark.marking.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmark.marking.impl.CommentImpl
	 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAME = MarkingcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENT = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = MarkingcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmark.marking.impl.RecipientImpl <em>Recipient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmark.marking.impl.RecipientImpl
	 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getRecipient()
	 * @generated
	 */
	int RECIPIENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT__NAME = MarkingcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Recipient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT_FEATURE_COUNT = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Recipient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT_OPERATION_COUNT = MarkingcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmark.marking.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmark.marking.impl.StudentImpl
	 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = RECIPIENT__NAME;

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
	 * The meta object id for the '{@link ac.soton.xmark.marking.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmark.marking.impl.GroupImpl
	 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = RECIPIENT__NAME;

	/**
	 * The feature id for the '<em><b>Students</b></em>' reference list.
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
	 * The meta object id for the '{@link ac.soton.xmark.marking.impl.PartGradeImpl <em>Part Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmark.marking.impl.PartGradeImpl
	 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getPartGrade()
	 * @generated
	 */
	int PART_GRADE = 8;

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
	 * The meta object id for the '{@link ac.soton.xmark.marking.impl.SectionGradeImpl <em>Section Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmark.marking.impl.SectionGradeImpl
	 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getSectionGrade()
	 * @generated
	 */
	int SECTION_GRADE = 9;

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
	 * The number of structural features of the '<em>Section Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_GRADE_FEATURE_COUNT = PART_GRADE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_GRADE_OPERATION_COUNT = PART_GRADE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmark.marking.impl.QuestionGradeImpl <em>Question Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmark.marking.impl.QuestionGradeImpl
	 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getQuestionGrade()
	 * @generated
	 */
	int QUESTION_GRADE = 10;

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
	 * The feature id for the '<em><b>Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GRADE__MARK = PART_GRADE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Question Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GRADE_FEATURE_COUNT = PART_GRADE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Question Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GRADE_OPERATION_COUNT = PART_GRADE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmark.marking.impl.MarkImpl <em>Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmark.marking.impl.MarkImpl
	 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getMark()
	 * @generated
	 */
	int MARK = 11;

	/**
	 * The feature id for the '<em><b>Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__RECIPIENT = 0;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__GRADE = 1;

	/**
	 * The number of structural features of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ac.soton.xmark.marking.Exercise <em>Exercise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exercise</em>'.
	 * @see ac.soton.xmark.marking.Exercise
	 * @generated
	 */
	EClass getExercise();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.xmark.marking.Exercise#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see ac.soton.xmark.marking.Exercise#getModule()
	 * @see #getExercise()
	 * @generated
	 */
	EAttribute getExercise_Module();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmark.marking.Exercise#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see ac.soton.xmark.marking.Exercise#getParts()
	 * @see #getExercise()
	 * @generated
	 */
	EReference getExercise_Parts();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmark.marking.Exercise#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see ac.soton.xmark.marking.Exercise#getStudents()
	 * @see #getExercise()
	 * @generated
	 */
	EReference getExercise_Students();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmark.marking.Exercise#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see ac.soton.xmark.marking.Exercise#getGroups()
	 * @see #getExercise()
	 * @generated
	 */
	EReference getExercise_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmark.marking.Exercise#getMarks <em>Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Marks</em>'.
	 * @see ac.soton.xmark.marking.Exercise#getMarks()
	 * @see #getExercise()
	 * @generated
	 */
	EReference getExercise_Marks();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmark.marking.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see ac.soton.xmark.marking.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmark.marking.Part#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see ac.soton.xmark.marking.Part#getComments()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Comments();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.xmark.marking.Part#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see ac.soton.xmark.marking.Part#getGrade()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Grade();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmark.marking.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see ac.soton.xmark.marking.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmark.marking.Section#getSubsections <em>Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsections</em>'.
	 * @see ac.soton.xmark.marking.Section#getSubsections()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Subsections();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmark.marking.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see ac.soton.xmark.marking.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmark.marking.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see ac.soton.xmark.marking.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.xmark.marking.Comment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see ac.soton.xmark.marking.Comment#getComment()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Comment();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmark.marking.Recipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipient</em>'.
	 * @see ac.soton.xmark.marking.Recipient
	 * @generated
	 */
	EClass getRecipient();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmark.marking.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see ac.soton.xmark.marking.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.xmark.marking.Student#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see ac.soton.xmark.marking.Student#getFirstname()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.xmark.marking.Student#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see ac.soton.xmark.marking.Student#getLastname()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Lastname();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmark.marking.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see ac.soton.xmark.marking.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.xmark.marking.Group#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Students</em>'.
	 * @see ac.soton.xmark.marking.Group#getStudents()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Students();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmark.marking.PartGrade <em>Part Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Grade</em>'.
	 * @see ac.soton.xmark.marking.PartGrade
	 * @generated
	 */
	EClass getPartGrade();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.xmark.marking.PartGrade#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part</em>'.
	 * @see ac.soton.xmark.marking.PartGrade#getPart()
	 * @see #getPartGrade()
	 * @generated
	 */
	EReference getPartGrade_Part();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.xmark.marking.PartGrade#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comments</em>'.
	 * @see ac.soton.xmark.marking.PartGrade#getComments()
	 * @see #getPartGrade()
	 * @generated
	 */
	EReference getPartGrade_Comments();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmark.marking.SectionGrade <em>Section Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Grade</em>'.
	 * @see ac.soton.xmark.marking.SectionGrade
	 * @generated
	 */
	EClass getSectionGrade();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmark.marking.SectionGrade#getSubgrades <em>Subgrades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subgrades</em>'.
	 * @see ac.soton.xmark.marking.SectionGrade#getSubgrades()
	 * @see #getSectionGrade()
	 * @generated
	 */
	EReference getSectionGrade_Subgrades();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmark.marking.QuestionGrade <em>Question Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Grade</em>'.
	 * @see ac.soton.xmark.marking.QuestionGrade
	 * @generated
	 */
	EClass getQuestionGrade();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.xmark.marking.QuestionGrade#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mark</em>'.
	 * @see ac.soton.xmark.marking.QuestionGrade#getMark()
	 * @see #getQuestionGrade()
	 * @generated
	 */
	EAttribute getQuestionGrade_Mark();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmark.marking.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark</em>'.
	 * @see ac.soton.xmark.marking.Mark
	 * @generated
	 */
	EClass getMark();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.xmark.marking.Mark#getRecipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recipient</em>'.
	 * @see ac.soton.xmark.marking.Mark#getRecipient()
	 * @see #getMark()
	 * @generated
	 */
	EReference getMark_Recipient();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmark.marking.Mark#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grade</em>'.
	 * @see ac.soton.xmark.marking.Mark#getGrade()
	 * @see #getMark()
	 * @generated
	 */
	EReference getMark_Grade();

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
		 * The meta object literal for the '{@link ac.soton.xmark.marking.impl.ExerciseImpl <em>Exercise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmark.marking.impl.ExerciseImpl
		 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getExercise()
		 * @generated
		 */
		EClass EXERCISE = eINSTANCE.getExercise();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXERCISE__MODULE = eINSTANCE.getExercise_Module();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE__PARTS = eINSTANCE.getExercise_Parts();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE__STUDENTS = eINSTANCE.getExercise_Students();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE__GROUPS = eINSTANCE.getExercise_Groups();

		/**
		 * The meta object literal for the '<em><b>Marks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE__MARKS = eINSTANCE.getExercise_Marks();

		/**
		 * The meta object literal for the '{@link ac.soton.xmark.marking.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmark.marking.impl.PartImpl
		 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getPart()
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
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__GRADE = eINSTANCE.getPart_Grade();

		/**
		 * The meta object literal for the '{@link ac.soton.xmark.marking.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmark.marking.impl.SectionImpl
		 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getSection()
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
		 * The meta object literal for the '{@link ac.soton.xmark.marking.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmark.marking.impl.QuestionImpl
		 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '{@link ac.soton.xmark.marking.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmark.marking.impl.CommentImpl
		 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getComment()
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
		 * The meta object literal for the '{@link ac.soton.xmark.marking.impl.RecipientImpl <em>Recipient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmark.marking.impl.RecipientImpl
		 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getRecipient()
		 * @generated
		 */
		EClass RECIPIENT = eINSTANCE.getRecipient();

		/**
		 * The meta object literal for the '{@link ac.soton.xmark.marking.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmark.marking.impl.StudentImpl
		 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getStudent()
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
		 * The meta object literal for the '{@link ac.soton.xmark.marking.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmark.marking.impl.GroupImpl
		 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__STUDENTS = eINSTANCE.getGroup_Students();

		/**
		 * The meta object literal for the '{@link ac.soton.xmark.marking.impl.PartGradeImpl <em>Part Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmark.marking.impl.PartGradeImpl
		 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getPartGrade()
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
		 * The meta object literal for the '{@link ac.soton.xmark.marking.impl.SectionGradeImpl <em>Section Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmark.marking.impl.SectionGradeImpl
		 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getSectionGrade()
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
		 * The meta object literal for the '{@link ac.soton.xmark.marking.impl.QuestionGradeImpl <em>Question Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmark.marking.impl.QuestionGradeImpl
		 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getQuestionGrade()
		 * @generated
		 */
		EClass QUESTION_GRADE = eINSTANCE.getQuestionGrade();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_GRADE__MARK = eINSTANCE.getQuestionGrade_Mark();

		/**
		 * The meta object literal for the '{@link ac.soton.xmark.marking.impl.MarkImpl <em>Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmark.marking.impl.MarkImpl
		 * @see ac.soton.xmark.marking.impl.MarkingPackageImpl#getMark()
		 * @generated
		 */
		EClass MARK = eINSTANCE.getMark();

		/**
		 * The meta object literal for the '<em><b>Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARK__RECIPIENT = eINSTANCE.getMark_Recipient();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARK__GRADE = eINSTANCE.getMark_Grade();

	}

} //MarkingPackage
