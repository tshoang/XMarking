/**
 * Copyright (c) 2018 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.xmark.marking;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Grade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.xmark.marking.QuestionGrade#getMark <em>Mark</em>}</li>
 * </ul>
 *
 * @see ac.soton.xmark.marking.MarkingPackage#getQuestionGrade()
 * @model
 * @generated
 */
public interface QuestionGrade extends PartGrade {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 University of Southampton.\n\nAll rights reserved. This program and the accompanying materials  are made\navailable under the terms of the Eclipse Public License v1.0 which accompanies\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html";

	/**
	 * Returns the value of the '<em><b>Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' attribute.
	 * @see #setMark(int)
	 * @see ac.soton.xmark.marking.MarkingPackage#getQuestionGrade_Mark()
	 * @model unique="false"
	 * @generated
	 */
	int getMark();

	/**
	 * Sets the value of the '{@link ac.soton.xmark.marking.QuestionGrade#getMark <em>Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark</em>' attribute.
	 * @see #getMark()
	 * @generated
	 */
	void setMark(int value);

} // QuestionGrade
