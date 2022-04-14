/**
 */
package festFair.impl;

import festFair.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FestFairFactoryImpl extends EFactoryImpl implements FestFairFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FestFairFactory init() {
		try {
			FestFairFactory theFestFairFactory = (FestFairFactory)EPackage.Registry.INSTANCE.getEFactory(FestFairPackage.eNS_URI);
			if (theFestFairFactory != null) {
				return theFestFairFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FestFairFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FestFairFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FestFairPackage.FEST_FAIR: return createFestFair();
			case FestFairPackage.FAIR_DAY: return createFairDay();
			case FestFairPackage.STALL: return createStall();
			case FestFairPackage.EVENT: return createEvent();
			case FestFairPackage.GUEST: return createGuest();
			case FestFairPackage.VOLUNTEER: return createVolunteer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FestFair createFestFair() {
		FestFairImpl festFair = new FestFairImpl();
		return festFair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FairDay createFairDay() {
		FairDayImpl fairDay = new FairDayImpl();
		return fairDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stall createStall() {
		StallImpl stall = new StallImpl();
		return stall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Guest createGuest() {
		GuestImpl guest = new GuestImpl();
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Volunteer createVolunteer() {
		VolunteerImpl volunteer = new VolunteerImpl();
		return volunteer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FestFairPackage getFestFairPackage() {
		return (FestFairPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FestFairPackage getPackage() {
		return FestFairPackage.eINSTANCE;
	}

} //FestFairFactoryImpl
