/**
 */
package festFair.impl;

import festFair.Activity;
import festFair.FairDay;
import festFair.FestFair;
import festFair.FestFairPackage;

import festFair.Person;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fest Fair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link festFair.impl.FestFairImpl#getFairDays <em>Fair Days</em>}</li>
 *   <li>{@link festFair.impl.FestFairImpl#getAttendees <em>Attendees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FestFairImpl extends NamedElementImpl implements FestFair {
	/**
	 * The cached value of the '{@link #getFairDays() <em>Fair Days</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFairDays()
	 * @generated
	 * @ordered
	 */
	protected EList<FairDay> fairDays;

	/**
	 * The cached value of the '{@link #getAttendees() <em>Attendees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttendees()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> attendees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FestFairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FestFairPackage.Literals.FEST_FAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FairDay> getFairDays() {
		if (fairDays == null) {
			fairDays = new EObjectContainmentEList<FairDay>(FairDay.class, this, FestFairPackage.FEST_FAIR__FAIR_DAYS);
		}
		return fairDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getAttendees() {
		if (attendees == null) {
			attendees = new EObjectContainmentEList<Person>(Person.class, this, FestFairPackage.FEST_FAIR__ATTENDEES);
		}
		return attendees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FestFairPackage.FEST_FAIR__FAIR_DAYS:
				return ((InternalEList<?>)getFairDays()).basicRemove(otherEnd, msgs);
			case FestFairPackage.FEST_FAIR__ATTENDEES:
				return ((InternalEList<?>)getAttendees()).basicRemove(otherEnd, msgs);
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
			case FestFairPackage.FEST_FAIR__FAIR_DAYS:
				return getFairDays();
			case FestFairPackage.FEST_FAIR__ATTENDEES:
				return getAttendees();
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
			case FestFairPackage.FEST_FAIR__FAIR_DAYS:
				getFairDays().clear();
				getFairDays().addAll((Collection<? extends FairDay>)newValue);
				return;
			case FestFairPackage.FEST_FAIR__ATTENDEES:
				getAttendees().clear();
				getAttendees().addAll((Collection<? extends Person>)newValue);
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
			case FestFairPackage.FEST_FAIR__FAIR_DAYS:
				getFairDays().clear();
				return;
			case FestFairPackage.FEST_FAIR__ATTENDEES:
				getAttendees().clear();
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
			case FestFairPackage.FEST_FAIR__FAIR_DAYS:
				return fairDays != null && !fairDays.isEmpty();
			case FestFairPackage.FEST_FAIR__ATTENDEES:
				return attendees != null && !attendees.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FestFairImpl
