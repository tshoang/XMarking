/**
 * Copyright (c) 2018 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.xmark.marking;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.xmark.marking.Mark#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link ac.soton.xmark.marking.Mark#getGrade <em>Grade</em>}</li>
 * </ul>
 *
 * @see ac.soton.xmark.marking.MarkingPackage#getMark()
 * @model
 * @generated
 */
public interface Mark extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 University of Southampton.\n\nAll rights reserved. This program and the accompanying materials  are made\navailable under the terms of the Eclipse Public License v1.0 which accompanies\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html";

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient</em>' reference.
	 * @see #setRecipient(Recipient)
	 * @see ac.soton.xmark.marking.MarkingPackage#getMark_Recipient()
	 * @model required="true"
	 * @generated
	 */
	Recipient getRecipient();

	/**
	 * Sets the value of the '{@link ac.soton.xmark.marking.Mark#getRecipient <em>Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient</em>' reference.
	 * @see #getRecipient()
	 * @generated
	 */
	void setRecipient(Recipient value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.xmark.marking.PartGrade}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grade</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' containment reference list.
	 * @see ac.soton.xmark.marking.MarkingPackage#getMark_Grade()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PartGrade> getGrade();

} // Mark
