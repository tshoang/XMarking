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
 * A representation of the model object '<em><b>Exercise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.xmarking.marking.Exercise#getParts <em>Parts</em>}</li>
 *   <li>{@link ac.soton.xmarking.marking.Exercise#getRecipients <em>Recipients</em>}</li>
 * </ul>
 *
 * @see ac.soton.xmarking.marking.MarkingPackage#getExercise()
 * @model
 * @generated
 */
public interface Exercise extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 University of Southampton.\n\nAll rights reserved. This program and the accompanying materials  are made\navailable under the terms of the Eclipse Public License v1.0 which accompanies\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html";

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.xmarking.marking.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see ac.soton.xmarking.marking.MarkingPackage#getExercise_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Part> getParts();

	/**
	 * Returns the value of the '<em><b>Recipients</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.xmarking.marking.Recipient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipients</em>' containment reference list.
	 * @see ac.soton.xmarking.marking.MarkingPackage#getExercise_Recipients()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recipient> getRecipients();

} // Exercise
