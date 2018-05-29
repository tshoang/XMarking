/**
 * Copyright (c) 2018 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.xmarking.marking;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Grade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.xmarking.marking.PartGrade#getPart <em>Part</em>}</li>
 *   <li>{@link ac.soton.xmarking.marking.PartGrade#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see ac.soton.xmarking.marking.MarkingPackage#getPartGrade()
 * @model abstract="true"
 * @generated
 */
public interface PartGrade extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 University of Southampton.\n\nAll rights reserved. This program and the accompanying materials  are made\navailable under the terms of the Eclipse Public License v1.0 which accompanies\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html";

	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' reference.
	 * @see #setPart(Part)
	 * @see ac.soton.xmarking.marking.MarkingPackage#getPartGrade_Part()
	 * @model required="true"
	 * @generated
	 */
	Part getPart();

	/**
	 * Sets the value of the '{@link ac.soton.xmarking.marking.PartGrade#getPart <em>Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' reference.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(Part value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' reference list.
	 * The list contents are of type {@link ac.soton.xmarking.marking.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' reference list.
	 * @see ac.soton.xmarking.marking.MarkingPackage#getPartGrade_Comments()
	 * @model
	 * @generated
	 */
	EList<Comment> getComments();

} // PartGrade
