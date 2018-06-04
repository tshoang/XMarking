/**
 * Copyright (c) 2018 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.xmark.feedback;

import ac.soton.xmark.markingcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.xmark.feedback.Feedback#getRecipients <em>Recipients</em>}</li>
 *   <li>{@link ac.soton.xmark.feedback.Feedback#getTitle <em>Title</em>}</li>
 *   <li>{@link ac.soton.xmark.feedback.Feedback#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @see ac.soton.xmark.feedback.FeedbackPackage#getFeedback()
 * @model
 * @generated
 */
public interface Feedback extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 University of Southampton.\n\nAll rights reserved. This program and the accompanying materials  are made\navailable under the terms of the Eclipse Public License v1.0 which accompanies\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html";

	/**
	 * Returns the value of the '<em><b>Recipients</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipients</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipients</em>' attribute.
	 * @see #setRecipients(String)
	 * @see ac.soton.xmark.feedback.FeedbackPackage#getFeedback_Recipients()
	 * @model required="true"
	 * @generated
	 */
	String getRecipients();

	/**
	 * Sets the value of the '{@link ac.soton.xmark.feedback.Feedback#getRecipients <em>Recipients</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipients</em>' attribute.
	 * @see #getRecipients()
	 * @generated
	 */
	void setRecipients(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see ac.soton.xmark.feedback.FeedbackPackage#getFeedback_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link ac.soton.xmark.feedback.Feedback#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' attribute.
	 * @see #setFeedback(String)
	 * @see ac.soton.xmark.feedback.FeedbackPackage#getFeedback_Feedback()
	 * @model required="true"
	 * @generated
	 */
	String getFeedback();

	/**
	 * Sets the value of the '{@link ac.soton.xmark.feedback.Feedback#getFeedback <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback</em>' attribute.
	 * @see #getFeedback()
	 * @generated
	 */
	void setFeedback(String value);

} // Feedback
