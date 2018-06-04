/**
 * Copyright (c) 2018 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.xmark.feedback;

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
 * @see ac.soton.xmark.feedback.FeedbackFactory
 * @model kind="package"
 * @generated
 */
public interface FeedbackPackage extends EPackage {
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
	String eNAME = "feedback";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xmarking.soton.ac/models/feedback/2018";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "feedback";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeedbackPackage eINSTANCE = ac.soton.xmark.feedback.impl.FeedbackPackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.soton.xmark.feedback.impl.ExerciseFeedbackImpl <em>Exercise Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmark.feedback.impl.ExerciseFeedbackImpl
	 * @see ac.soton.xmark.feedback.impl.FeedbackPackageImpl#getExerciseFeedback()
	 * @generated
	 */
	int EXERCISE_FEEDBACK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_FEEDBACK__NAME = MarkingcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Feedbacks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_FEEDBACK__FEEDBACKS = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exercise Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_FEEDBACK_FEATURE_COUNT = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exercise Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_FEEDBACK_OPERATION_COUNT = MarkingcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.xmark.feedback.impl.FeedbackImpl <em>Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.xmark.feedback.impl.FeedbackImpl
	 * @see ac.soton.xmark.feedback.impl.FeedbackPackageImpl#getFeedback()
	 * @generated
	 */
	int FEEDBACK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__NAME = MarkingcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Recipients</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__RECIPIENTS = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__TITLE = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__FEEDBACK = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = MarkingcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_OPERATION_COUNT = MarkingcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ac.soton.xmark.feedback.ExerciseFeedback <em>Exercise Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exercise Feedback</em>'.
	 * @see ac.soton.xmark.feedback.ExerciseFeedback
	 * @generated
	 */
	EClass getExerciseFeedback();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.xmark.feedback.ExerciseFeedback#getFeedbacks <em>Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feedbacks</em>'.
	 * @see ac.soton.xmark.feedback.ExerciseFeedback#getFeedbacks()
	 * @see #getExerciseFeedback()
	 * @generated
	 */
	EReference getExerciseFeedback_Feedbacks();

	/**
	 * Returns the meta object for class '{@link ac.soton.xmark.feedback.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback</em>'.
	 * @see ac.soton.xmark.feedback.Feedback
	 * @generated
	 */
	EClass getFeedback();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.xmark.feedback.Feedback#getRecipients <em>Recipients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recipients</em>'.
	 * @see ac.soton.xmark.feedback.Feedback#getRecipients()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Recipients();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.xmark.feedback.Feedback#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ac.soton.xmark.feedback.Feedback#getTitle()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Title();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.xmark.feedback.Feedback#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback</em>'.
	 * @see ac.soton.xmark.feedback.Feedback#getFeedback()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Feedback();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeedbackFactory getFeedbackFactory();

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
		 * The meta object literal for the '{@link ac.soton.xmark.feedback.impl.ExerciseFeedbackImpl <em>Exercise Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmark.feedback.impl.ExerciseFeedbackImpl
		 * @see ac.soton.xmark.feedback.impl.FeedbackPackageImpl#getExerciseFeedback()
		 * @generated
		 */
		EClass EXERCISE_FEEDBACK = eINSTANCE.getExerciseFeedback();

		/**
		 * The meta object literal for the '<em><b>Feedbacks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE_FEEDBACK__FEEDBACKS = eINSTANCE.getExerciseFeedback_Feedbacks();

		/**
		 * The meta object literal for the '{@link ac.soton.xmark.feedback.impl.FeedbackImpl <em>Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.xmark.feedback.impl.FeedbackImpl
		 * @see ac.soton.xmark.feedback.impl.FeedbackPackageImpl#getFeedback()
		 * @generated
		 */
		EClass FEEDBACK = eINSTANCE.getFeedback();

		/**
		 * The meta object literal for the '<em><b>Recipients</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__RECIPIENTS = eINSTANCE.getFeedback_Recipients();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__TITLE = eINSTANCE.getFeedback_Title();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__FEEDBACK = eINSTANCE.getFeedback_Feedback();

	}

} //FeedbackPackage
