/**
 * Copyright (c) 2018 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.xmarking.marking;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.xmarking.marking.Comment#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see ac.soton.xmarking.marking.MarkingPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 University of Southampton.\n\nAll rights reserved. This program and the accompanying materials  are made\navailable under the terms of the Eclipse Public License v1.0 which accompanies\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html";

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see ac.soton.xmarking.marking.MarkingPackage#getComment_Comment()
	 * @model required="true"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link ac.soton.xmarking.marking.Comment#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // Comment
