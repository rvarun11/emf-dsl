/**
 */
package festFair.impl;

import festFair.Activity;
import festFair.FairDay;
import festFair.FestFairPackage;
import festFair.Guest;
import festFair.Volunteer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link festFair.impl.ActivityImpl#getVolunteer <em>Volunteer</em>}</li>
 *   <li>{@link festFair.impl.ActivityImpl#getGuests <em>Guests</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityImpl extends NamedElementImpl implements Activity {
	/**
	 * The cached value of the '{@link #getVolunteer() <em>Volunteer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolunteer()
	 * @generated
	 * @ordered
	 */
	protected Volunteer volunteer;

	/**
	 * The cached value of the '{@link #getGuests() <em>Guests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuests()
	 * @generated
	 * @ordered
	 */
	protected EList<Guest> guests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FestFairPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Volunteer getVolunteer() {
		if (volunteer != null && volunteer.eIsProxy()) {
			InternalEObject oldVolunteer = (InternalEObject)volunteer;
			volunteer = (Volunteer)eResolveProxy(oldVolunteer);
			if (volunteer != oldVolunteer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FestFairPackage.ACTIVITY__VOLUNTEER, oldVolunteer, volunteer));
			}
		}
		return volunteer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volunteer basicGetVolunteer() {
		return volunteer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolunteer(Volunteer newVolunteer, NotificationChain msgs) {
		Volunteer oldVolunteer = volunteer;
		volunteer = newVolunteer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FestFairPackage.ACTIVITY__VOLUNTEER, oldVolunteer, newVolunteer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolunteer(Volunteer newVolunteer) {
		if (newVolunteer != volunteer) {
			NotificationChain msgs = null;
			if (volunteer != null)
				msgs = ((InternalEObject)volunteer).eInverseRemove(this, FestFairPackage.VOLUNTEER__WORK, Volunteer.class, msgs);
			if (newVolunteer != null)
				msgs = ((InternalEObject)newVolunteer).eInverseAdd(this, FestFairPackage.VOLUNTEER__WORK, Volunteer.class, msgs);
			msgs = basicSetVolunteer(newVolunteer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FestFairPackage.ACTIVITY__VOLUNTEER, newVolunteer, newVolunteer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Guest> getGuests() {
		if (guests == null) {
			guests = new EObjectWithInverseResolvingEList<Guest>(Guest.class, this, FestFairPackage.ACTIVITY__GUESTS, FestFairPackage.GUEST__VISIT);
		}
		return guests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FestFairPackage.ACTIVITY__VOLUNTEER:
				if (volunteer != null)
					msgs = ((InternalEObject)volunteer).eInverseRemove(this, FestFairPackage.VOLUNTEER__WORK, Volunteer.class, msgs);
				return basicSetVolunteer((Volunteer)otherEnd, msgs);
			case FestFairPackage.ACTIVITY__GUESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGuests()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FestFairPackage.ACTIVITY__VOLUNTEER:
				return basicSetVolunteer(null, msgs);
			case FestFairPackage.ACTIVITY__GUESTS:
				return ((InternalEList<?>)getGuests()).basicRemove(otherEnd, msgs);
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
			case FestFairPackage.ACTIVITY__VOLUNTEER:
				if (resolve) return getVolunteer();
				return basicGetVolunteer();
			case FestFairPackage.ACTIVITY__GUESTS:
				return getGuests();
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
			case FestFairPackage.ACTIVITY__VOLUNTEER:
				setVolunteer((Volunteer)newValue);
				return;
			case FestFairPackage.ACTIVITY__GUESTS:
				getGuests().clear();
				getGuests().addAll((Collection<? extends Guest>)newValue);
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
			case FestFairPackage.ACTIVITY__VOLUNTEER:
				setVolunteer((Volunteer)null);
				return;
			case FestFairPackage.ACTIVITY__GUESTS:
				getGuests().clear();
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
			case FestFairPackage.ACTIVITY__VOLUNTEER:
				return volunteer != null;
			case FestFairPackage.ACTIVITY__GUESTS:
				return guests != null && !guests.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
