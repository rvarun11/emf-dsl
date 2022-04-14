/**
 */
package festFair.impl;

import festFair.FestFairPackage;
import festFair.Stall;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link festFair.impl.StallImpl#getAvailableSpace <em>Available Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StallImpl extends ActivityImpl implements Stall {
	/**
	 * The default value of the '{@link #getAvailableSpace() <em>Available Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSpace()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_SPACE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableSpace() <em>Available Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSpace()
	 * @generated
	 * @ordered
	 */
	protected int availableSpace = AVAILABLE_SPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FestFairPackage.Literals.STALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAvailableSpace() {
		return availableSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableSpace(int newAvailableSpace) {
		int oldAvailableSpace = availableSpace;
		availableSpace = newAvailableSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FestFairPackage.STALL__AVAILABLE_SPACE, oldAvailableSpace, availableSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FestFairPackage.STALL__AVAILABLE_SPACE:
				return getAvailableSpace();
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
			case FestFairPackage.STALL__AVAILABLE_SPACE:
				setAvailableSpace((Integer)newValue);
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
			case FestFairPackage.STALL__AVAILABLE_SPACE:
				setAvailableSpace(AVAILABLE_SPACE_EDEFAULT);
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
			case FestFairPackage.STALL__AVAILABLE_SPACE:
				return availableSpace != AVAILABLE_SPACE_EDEFAULT;
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
		result.append(" (availableSpace: ");
		result.append(availableSpace);
		result.append(')');
		return result.toString();
	}

} //StallImpl
