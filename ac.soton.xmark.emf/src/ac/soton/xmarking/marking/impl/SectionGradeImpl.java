/**
 * Copyright (c) 2018 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.xmarking.marking.impl;

import ac.soton.xmarking.marking.MarkingPackage;
import ac.soton.xmarking.marking.PartGrade;
import ac.soton.xmarking.marking.SectionGrade;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section Grade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.xmarking.marking.impl.SectionGradeImpl#getSubgrades <em>Subgrades</em>}</li>
 *   <li>{@link ac.soton.xmarking.marking.impl.SectionGradeImpl#getMark <em>Mark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionGradeImpl extends PartGradeImpl implements SectionGrade {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 University of Southampton.\n\nAll rights reserved. This program and the accompanying materials  are made\navailable under the terms of the Eclipse Public License v1.0 which accompanies\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html";

	/**
	 * The cached value of the '{@link #getSubgrades() <em>Subgrades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgrades()
	 * @generated
	 * @ordered
	 */
	protected EList<PartGrade> subgrades;

	/**
	 * The default value of the '{@link #getMark() <em>Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMark()
	 * @generated
	 * @ordered
	 */
	protected static final int MARK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMark() <em>Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMark()
	 * @generated
	 * @ordered
	 */
	protected int mark = MARK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionGradeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkingPackage.Literals.SECTION_GRADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartGrade> getSubgrades() {
		if (subgrades == null) {
			subgrades = new EObjectContainmentEList<PartGrade>(PartGrade.class, this, MarkingPackage.SECTION_GRADE__SUBGRADES);
		}
		return subgrades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMark() {
		return mark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMark(int newMark) {
		int oldMark = mark;
		mark = newMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkingPackage.SECTION_GRADE__MARK, oldMark, mark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkingPackage.SECTION_GRADE__SUBGRADES:
				return ((InternalEList<?>)getSubgrades()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarkingPackage.SECTION_GRADE__SUBGRADES:
				return getSubgrades();
			case MarkingPackage.SECTION_GRADE__MARK:
				return getMark();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MarkingPackage.SECTION_GRADE__SUBGRADES:
				getSubgrades().clear();
				getSubgrades().addAll((Collection<? extends PartGrade>)newValue);
				return;
			case MarkingPackage.SECTION_GRADE__MARK:
				setMark((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MarkingPackage.SECTION_GRADE__SUBGRADES:
				getSubgrades().clear();
				return;
			case MarkingPackage.SECTION_GRADE__MARK:
				setMark(MARK_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MarkingPackage.SECTION_GRADE__SUBGRADES:
				return subgrades != null && !subgrades.isEmpty();
			case MarkingPackage.SECTION_GRADE__MARK:
				return mark != MARK_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mark: ");
		result.append(mark);
		result.append(')');
		return result.toString();
	}

} //SectionGradeImpl
