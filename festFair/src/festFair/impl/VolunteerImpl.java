/**
 */
package festFair.impl;

import festFair.Activity;
import festFair.FestFairPackage;
import festFair.Volunteer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volunteer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link festFair.impl.VolunteerImpl#getPartnerId <em>Partner Id</em>}</li>
 *   <li>{@link festFair.impl.VolunteerImpl#getWork <em>Work</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolunteerImpl extends PersonImpl implements Volunteer {
	/**
	 * The default value of the '{@link #getPartnerId() <em>Partner Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerId()
	 * @generated
	 * @ordered
	 */
	protected static final int PARTNER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPartnerId() <em>Partner Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerId()
	 * @generated
	 * @ordered
	 */
	protected int partnerId = PARTNER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWork() <em>Work</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected Activity work;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolunteerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FestFairPackage.Literals.VOLUNTEER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPartnerId() {
		return partnerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartnerId(int newPartnerId) {
		int oldPartnerId = partnerId;
		partnerId = newPartnerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FestFairPackage.VOLUNTEER__PARTNER_ID, oldPartnerId, partnerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getWork() {
		if (work != null && work.eIsProxy()) {
			InternalEObject oldWork = (InternalEObject)work;
			work = (Activity)eResolveProxy(oldWork);
			if (work != oldWork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FestFairPackage.VOLUNTEER__WORK, oldWork, work));
			}
		}
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetWork() {
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWork(Activity newWork, NotificationChain msgs) {
		Activity oldWork = work;
		work = newWork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FestFairPackage.VOLUNTEER__WORK, oldWork, newWork);
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
	public void setWork(Activity newWork) {
		if (newWork != work) {
			NotificationChain msgs = null;
			if (work != null)
				msgs = ((InternalEObject)work).eInverseRemove(this, FestFairPackage.ACTIVITY__VOLUNTEER, Activity.class, msgs);
			if (newWork != null)
				msgs = ((InternalEObject)newWork).eInverseAdd(this, FestFairPackage.ACTIVITY__VOLUNTEER, Activity.class, msgs);
			msgs = basicSetWork(newWork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FestFairPackage.VOLUNTEER__WORK, newWork, newWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FestFairPackage.VOLUNTEER__WORK:
				if (work != null)
					msgs = ((InternalEObject)work).eInverseRemove(this, FestFairPackage.ACTIVITY__VOLUNTEER, Activity.class, msgs);
				return basicSetWork((Activity)otherEnd, msgs);
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
			case FestFairPackage.VOLUNTEER__WORK:
				return basicSetWork(null, msgs);
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
			case FestFairPackage.VOLUNTEER__PARTNER_ID:
				return getPartnerId();
			case FestFairPackage.VOLUNTEER__WORK:
				if (resolve) return getWork();
				return basicGetWork();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FestFairPackage.VOLUNTEER__PARTNER_ID:
				setPartnerId((Integer)newValue);
				return;
			case FestFairPackage.VOLUNTEER__WORK:
				setWork((Activity)newValue);
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
			case FestFairPackage.VOLUNTEER__PARTNER_ID:
				setPartnerId(PARTNER_ID_EDEFAULT);
				return;
			case FestFairPackage.VOLUNTEER__WORK:
				setWork((Activity)null);
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
			case FestFairPackage.VOLUNTEER__PARTNER_ID:
				return partnerId != PARTNER_ID_EDEFAULT;
			case FestFairPackage.VOLUNTEER__WORK:
				return work != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (partnerId: ");
		result.append(partnerId);
		result.append(')');
		return result.toString();
	}

} //VolunteerImpl
