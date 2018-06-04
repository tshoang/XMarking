/**
 * Copyright (c) 2018 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.xmark.feedback;

import ac.soton.xmark.markingcore.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exercise Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.xmark.feedback.ExerciseFeedback#getFeedbacks <em>Feedbacks</em>}</li>
 * </ul>
 *
 * @see ac.soton.xmark.feedback.FeedbackPackage#getExerciseFeedback()
 * @model
 * @generated
 */
public interface ExerciseFeedback extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 University of Southampton.\n\nAll rights reserved. This program and the accompanying materials  are made\navailable under the terms of the Eclipse Public License v1.0 which accompanies\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html";

	/**
	 * Returns the value of the '<em><b>Feedbacks</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.xmark.feedback.Feedback}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedbacks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedbacks</em>' containment reference list.
	 * @see ac.soton.xmark.feedback.FeedbackPackage#getExerciseFeedback_Feedbacks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feedback> getFeedbacks();

} // ExerciseFeedback
