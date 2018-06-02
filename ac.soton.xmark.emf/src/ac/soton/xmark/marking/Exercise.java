/**
 * Copyright (c) 2018 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.xmark.marking;

import ac.soton.xmark.markingcore.NamedElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exercise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.xmark.marking.Exercise#getModule <em>Module</em>}</li>
 *   <li>{@link ac.soton.xmark.marking.Exercise#getParts <em>Parts</em>}</li>
 *   <li>{@link ac.soton.xmark.marking.Exercise#getStudents <em>Students</em>}</li>
 *   <li>{@link ac.soton.xmark.marking.Exercise#getGroups <em>Groups</em>}</li>
 *   <li>{@link ac.soton.xmark.marking.Exercise#getMarks <em>Marks</em>}</li>
 * </ul>
 *
 * @see ac.soton.xmark.marking.MarkingPackage#getExercise()
 * @model
 * @generated
 */
public interface Exercise extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 University of Southampton.\n\nAll rights reserved. This program and the accompanying materials  are made\navailable under the terms of the Eclipse Public License v1.0 which accompanies\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html";

	/**
	 * Returns the value of the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' attribute.
	 * @see #setModule(String)
	 * @see ac.soton.xmark.marking.MarkingPackage#getExercise_Module()
	 * @model required="true"
	 * @generated
	 */
	String getModule();

	/**
	 * Sets the value of the '{@link ac.soton.xmark.marking.Exercise#getModule <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' attribute.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(String value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.xmark.marking.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see ac.soton.xmark.marking.MarkingPackage#getExercise_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Part> getParts();

	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.xmark.marking.Student}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Students</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see ac.soton.xmark.marking.MarkingPackage#getExercise_Students()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudents();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.xmark.marking.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see ac.soton.xmark.marking.MarkingPackage#getExercise_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Marks</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.xmark.marking.Mark}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marks</em>' containment reference list.
	 * @see ac.soton.xmark.marking.MarkingPackage#getExercise_Marks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mark> getMarks();

} // Exercise
