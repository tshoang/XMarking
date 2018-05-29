/**
 * Copyright (c) 2018 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.xmarking.marking;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Grade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.xmarking.marking.SectionGrade#getSubgrades <em>Subgrades</em>}</li>
 *   <li>{@link ac.soton.xmarking.marking.SectionGrade#getMark <em>Mark</em>}</li>
 * </ul>
 *
 * @see ac.soton.xmarking.marking.MarkingPackage#getSectionGrade()
 * @model
 * @generated
 */
public interface SectionGrade extends PartGrade {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 University of Southampton.\n\nAll rights reserved. This program and the accompanying materials  are made\navailable under the terms of the Eclipse Public License v1.0 which accompanies\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html";

	/**
	 * Returns the value of the '<em><b>Subgrades</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.xmarking.marking.PartGrade}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgrades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgrades</em>' containment reference list.
	 * @see ac.soton.xmarking.marking.MarkingPackage#getSectionGrade_Subgrades()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PartGrade> getSubgrades();

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
	 * @see ac.soton.xmarking.marking.MarkingPackage#getSectionGrade_Mark()
	 * @model unique="false"
	 * @generated
	 */
	int getMark();

	/**
	 * Sets the value of the '{@link ac.soton.xmarking.marking.SectionGrade#getMark <em>Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark</em>' attribute.
	 * @see #getMark()
	 * @generated
	 */
	void setMark(int value);

} // SectionGrade
