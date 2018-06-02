/**
 * Copyright (c) 2018 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.xmark.marking.impl;

import ac.soton.xmark.marking.Exercise;
import ac.soton.xmark.marking.Group;
import ac.soton.xmark.marking.Mark;
import ac.soton.xmark.marking.MarkingPackage;
import ac.soton.xmark.marking.Part;
import ac.soton.xmark.marking.Student;

import ac.soton.xmark.markingcore.impl.NamedElementImpl;
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
 * An implementation of the model object '<em><b>Exercise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.xmark.marking.impl.ExerciseImpl#getModule <em>Module</em>}</li>
 *   <li>{@link ac.soton.xmark.marking.impl.ExerciseImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link ac.soton.xmark.marking.impl.ExerciseImpl#getStudents <em>Students</em>}</li>
 *   <li>{@link ac.soton.xmark.marking.impl.ExerciseImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link ac.soton.xmark.marking.impl.ExerciseImpl#getMarks <em>Marks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExerciseImpl extends NamedElementImpl implements Exercise {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 University of Southampton.\n\nAll rights reserved. This program and the accompanying materials  are made\navailable under the terms of the Eclipse Public License v1.0 which accompanies\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html";

	/**
	 * The default value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected String module = MODULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> parts;

	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The cached value of the '{@link #getMarks() <em>Marks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarks()
	 * @generated
	 * @ordered
	 */
	protected EList<Mark> marks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExerciseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkingPackage.Literals.EXERCISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(String newModule) {
		String oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkingPackage.EXERCISE__MODULE, oldModule, module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<Part>(Part.class, this, MarkingPackage.EXERCISE__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectContainmentEList<Student>(Student.class, this, MarkingPackage.EXERCISE__STUDENTS);
		}
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, MarkingPackage.EXERCISE__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mark> getMarks() {
		if (marks == null) {
			marks = new EObjectContainmentEList<Mark>(Mark.class, this, MarkingPackage.EXERCISE__MARKS);
		}
		return marks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarkingPackage.EXERCISE__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case MarkingPackage.EXERCISE__STUDENTS:
				return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
			case MarkingPackage.EXERCISE__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case MarkingPackage.EXERCISE__MARKS:
				return ((InternalEList<?>)getMarks()).basicRemove(otherEnd, msgs);
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
			case MarkingPackage.EXERCISE__MODULE:
				return getModule();
			case MarkingPackage.EXERCISE__PARTS:
				return getParts();
			case MarkingPackage.EXERCISE__STUDENTS:
				return getStudents();
			case MarkingPackage.EXERCISE__GROUPS:
				return getGroups();
			case MarkingPackage.EXERCISE__MARKS:
				return getMarks();
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
			case MarkingPackage.EXERCISE__MODULE:
				setModule((String)newValue);
				return;
			case MarkingPackage.EXERCISE__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends Part>)newValue);
				return;
			case MarkingPackage.EXERCISE__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Student>)newValue);
				return;
			case MarkingPackage.EXERCISE__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case MarkingPackage.EXERCISE__MARKS:
				getMarks().clear();
				getMarks().addAll((Collection<? extends Mark>)newValue);
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
			case MarkingPackage.EXERCISE__MODULE:
				setModule(MODULE_EDEFAULT);
				return;
			case MarkingPackage.EXERCISE__PARTS:
				getParts().clear();
				return;
			case MarkingPackage.EXERCISE__STUDENTS:
				getStudents().clear();
				return;
			case MarkingPackage.EXERCISE__GROUPS:
				getGroups().clear();
				return;
			case MarkingPackage.EXERCISE__MARKS:
				getMarks().clear();
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
			case MarkingPackage.EXERCISE__MODULE:
				return MODULE_EDEFAULT == null ? module != null : !MODULE_EDEFAULT.equals(module);
			case MarkingPackage.EXERCISE__PARTS:
				return parts != null && !parts.isEmpty();
			case MarkingPackage.EXERCISE__STUDENTS:
				return students != null && !students.isEmpty();
			case MarkingPackage.EXERCISE__GROUPS:
				return groups != null && !groups.isEmpty();
			case MarkingPackage.EXERCISE__MARKS:
				return marks != null && !marks.isEmpty();
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
		result.append(" (module: ");
		result.append(module);
		result.append(')');
		return result.toString();
	}

} //ExerciseImpl
