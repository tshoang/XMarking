/**
 * Copyright (c) 2018 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.xmark.marking.impl;

import ac.soton.xmark.marking.Mark;
import ac.soton.xmark.marking.MarkingPackage;
import ac.soton.xmark.marking.PartGrade;
import ac.soton.xmark.marking.Recipient;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.xmark.marking.impl.MarkImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link ac.soton.xmark.marking.impl.MarkImpl#getGrade <em>Grade</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkImpl extends MinimalEObjectImpl.Container implements Mark {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 University of Southampton.\n\nAll rights reserved. This program and the accompanying materials  are made\navailable under the terms of the Eclipse Public License v1.0 which accompanies\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html";

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected Recipient recipient;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected EList<PartGrade> grade;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkingPackage.Literals.MARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipient getRecipient() {
		if (recipient != null && recipient.eIsProxy()) {
			InternalEObject oldRecipient = (InternalEObject)recipient;
			recipient = (Recipient)eResolveProxy(oldRecipient);
			if (recipient != oldRecipient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkingPackage.MARK__RECIPIENT, oldRecipient, recipient));
			}
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipient basicGetRecipient() {
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipient(Recipient newRecipient) {
		Recipient oldRecipient = recipient;
		recipient = newRecipient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkingPackage.MARK__RECIPIENT, oldRecipient, recipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartGrade> getGrade() {
		if (grade == null) {
			grade = new EObjectContainmentEList<PartGrade>(PartGrade.class, this, MarkingPackage.MARK__GRADE);
		}
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkingPackage.MARK__GRADE:
				return ((InternalEList<?>)getGrade()).basicRemove(otherEnd, msgs);
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
			case MarkingPackage.MARK__RECIPIENT:
				if (resolve) return getRecipient();
				return basicGetRecipient();
			case MarkingPackage.MARK__GRADE:
				return getGrade();
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
			case MarkingPackage.MARK__RECIPIENT:
				setRecipient((Recipient)newValue);
				return;
			case MarkingPackage.MARK__GRADE:
				getGrade().clear();
				getGrade().addAll((Collection<? extends PartGrade>)newValue);
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
			case MarkingPackage.MARK__RECIPIENT:
				setRecipient((Recipient)null);
				return;
			case MarkingPackage.MARK__GRADE:
				getGrade().clear();
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
			case MarkingPackage.MARK__RECIPIENT:
				return recipient != null;
			case MarkingPackage.MARK__GRADE:
				return grade != null && !grade.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MarkImpl
