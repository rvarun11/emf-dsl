/**
 */
package festFair;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see festFair.FestFairFactory
 * @model kind="package"
 * @generated
 */
public interface FestFairPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "festFair";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "vr/festFair";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "festFair";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FestFairPackage eINSTANCE = festFair.impl.FestFairPackageImpl.init();

	/**
	 * The meta object id for the '{@link festFair.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see festFair.impl.NamedElementImpl
	 * @see festFair.impl.FestFairPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link festFair.impl.FestFairImpl <em>Fest Fair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see festFair.impl.FestFairImpl
	 * @see festFair.impl.FestFairPackageImpl#getFestFair()
	 * @generated
	 */
	int FEST_FAIR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEST_FAIR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fair Days</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEST_FAIR__FAIR_DAYS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attendees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEST_FAIR__ATTENDEES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fest Fair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEST_FAIR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link festFair.impl.FairDayImpl <em>Fair Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see festFair.impl.FairDayImpl
	 * @see festFair.impl.FestFairPackageImpl#getFairDay()
	 * @generated
	 */
	int FAIR_DAY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_DAY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_DAY__N = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_DAY__ACTIVITIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fair Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_DAY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link festFair.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see festFair.impl.ActivityImpl
	 * @see festFair.impl.FestFairPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Volunteer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VOLUNTEER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__GUESTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link festFair.impl.StallImpl <em>Stall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see festFair.impl.StallImpl
	 * @see festFair.impl.FestFairPackageImpl#getStall()
	 * @generated
	 */
	int STALL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STALL__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Volunteer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STALL__VOLUNTEER = ACTIVITY__VOLUNTEER;

	/**
	 * The feature id for the '<em><b>Guests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STALL__GUESTS = ACTIVITY__GUESTS;

	/**
	 * The feature id for the '<em><b>Available Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STALL__AVAILABLE_SPACE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STALL_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link festFair.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see festFair.impl.EventImpl
	 * @see festFair.impl.FestFairPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Volunteer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VOLUNTEER = ACTIVITY__VOLUNTEER;

	/**
	 * The feature id for the '<em><b>Guests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__GUESTS = ACTIVITY__GUESTS;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIME = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link festFair.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see festFair.impl.PersonImpl
	 * @see festFair.impl.FestFairPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link festFair.impl.GuestImpl <em>Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see festFair.impl.GuestImpl
	 * @see festFair.impl.FestFairPackageImpl#getGuest()
	 * @generated
	 */
	int GUEST = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__EMAIL = PERSON__EMAIL;

	/**
	 * The feature id for the '<em><b>Visit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__VISIT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link festFair.impl.VolunteerImpl <em>Volunteer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see festFair.impl.VolunteerImpl
	 * @see festFair.impl.FestFairPackageImpl#getVolunteer()
	 * @generated
	 */
	int VOLUNTEER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__EMAIL = PERSON__EMAIL;

	/**
	 * The feature id for the '<em><b>Partner Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__PARTNER_ID = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__WORK = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Volunteer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link festFair.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see festFair.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link festFair.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see festFair.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link festFair.FestFair <em>Fest Fair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fest Fair</em>'.
	 * @see festFair.FestFair
	 * @generated
	 */
	EClass getFestFair();

	/**
	 * Returns the meta object for the containment reference list '{@link festFair.FestFair#getFairDays <em>Fair Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fair Days</em>'.
	 * @see festFair.FestFair#getFairDays()
	 * @see #getFestFair()
	 * @generated
	 */
	EReference getFestFair_FairDays();

	/**
	 * Returns the meta object for the containment reference list '{@link festFair.FestFair#getAttendees <em>Attendees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attendees</em>'.
	 * @see festFair.FestFair#getAttendees()
	 * @see #getFestFair()
	 * @generated
	 */
	EReference getFestFair_Attendees();

	/**
	 * Returns the meta object for class '{@link festFair.FairDay <em>Fair Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fair Day</em>'.
	 * @see festFair.FairDay
	 * @generated
	 */
	EClass getFairDay();

	/**
	 * Returns the meta object for the attribute '{@link festFair.FairDay#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>N</em>'.
	 * @see festFair.FairDay#getN()
	 * @see #getFairDay()
	 * @generated
	 */
	EAttribute getFairDay_N();

	/**
	 * Returns the meta object for the containment reference list '{@link festFair.FairDay#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see festFair.FairDay#getActivities()
	 * @see #getFairDay()
	 * @generated
	 */
	EReference getFairDay_Activities();

	/**
	 * Returns the meta object for class '{@link festFair.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see festFair.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the reference '{@link festFair.Activity#getVolunteer <em>Volunteer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Volunteer</em>'.
	 * @see festFair.Activity#getVolunteer()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Volunteer();

	/**
	 * Returns the meta object for the reference list '{@link festFair.Activity#getGuests <em>Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guests</em>'.
	 * @see festFair.Activity#getGuests()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Guests();

	/**
	 * Returns the meta object for class '{@link festFair.Stall <em>Stall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stall</em>'.
	 * @see festFair.Stall
	 * @generated
	 */
	EClass getStall();

	/**
	 * Returns the meta object for the attribute '{@link festFair.Stall#getAvailableSpace <em>Available Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Space</em>'.
	 * @see festFair.Stall#getAvailableSpace()
	 * @see #getStall()
	 * @generated
	 */
	EAttribute getStall_AvailableSpace();

	/**
	 * Returns the meta object for class '{@link festFair.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see festFair.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link festFair.Event#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see festFair.Event#getTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Time();

	/**
	 * Returns the meta object for class '{@link festFair.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see festFair.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link festFair.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see festFair.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for the attribute '{@link festFair.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see festFair.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for class '{@link festFair.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest</em>'.
	 * @see festFair.Guest
	 * @generated
	 */
	EClass getGuest();

	/**
	 * Returns the meta object for the reference '{@link festFair.Guest#getVisit <em>Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visit</em>'.
	 * @see festFair.Guest#getVisit()
	 * @see #getGuest()
	 * @generated
	 */
	EReference getGuest_Visit();

	/**
	 * Returns the meta object for class '{@link festFair.Volunteer <em>Volunteer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volunteer</em>'.
	 * @see festFair.Volunteer
	 * @generated
	 */
	EClass getVolunteer();

	/**
	 * Returns the meta object for the attribute '{@link festFair.Volunteer#getPartnerId <em>Partner Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Id</em>'.
	 * @see festFair.Volunteer#getPartnerId()
	 * @see #getVolunteer()
	 * @generated
	 */
	EAttribute getVolunteer_PartnerId();

	/**
	 * Returns the meta object for the reference '{@link festFair.Volunteer#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work</em>'.
	 * @see festFair.Volunteer#getWork()
	 * @see #getVolunteer()
	 * @generated
	 */
	EReference getVolunteer_Work();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FestFairFactory getFestFairFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link festFair.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see festFair.impl.NamedElementImpl
		 * @see festFair.impl.FestFairPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link festFair.impl.FestFairImpl <em>Fest Fair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see festFair.impl.FestFairImpl
		 * @see festFair.impl.FestFairPackageImpl#getFestFair()
		 * @generated
		 */
		EClass FEST_FAIR = eINSTANCE.getFestFair();

		/**
		 * The meta object literal for the '<em><b>Fair Days</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEST_FAIR__FAIR_DAYS = eINSTANCE.getFestFair_FairDays();

		/**
		 * The meta object literal for the '<em><b>Attendees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEST_FAIR__ATTENDEES = eINSTANCE.getFestFair_Attendees();

		/**
		 * The meta object literal for the '{@link festFair.impl.FairDayImpl <em>Fair Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see festFair.impl.FairDayImpl
		 * @see festFair.impl.FestFairPackageImpl#getFairDay()
		 * @generated
		 */
		EClass FAIR_DAY = eINSTANCE.getFairDay();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAIR_DAY__N = eINSTANCE.getFairDay_N();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAIR_DAY__ACTIVITIES = eINSTANCE.getFairDay_Activities();

		/**
		 * The meta object literal for the '{@link festFair.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see festFair.impl.ActivityImpl
		 * @see festFair.impl.FestFairPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Volunteer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__VOLUNTEER = eINSTANCE.getActivity_Volunteer();

		/**
		 * The meta object literal for the '<em><b>Guests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__GUESTS = eINSTANCE.getActivity_Guests();

		/**
		 * The meta object literal for the '{@link festFair.impl.StallImpl <em>Stall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see festFair.impl.StallImpl
		 * @see festFair.impl.FestFairPackageImpl#getStall()
		 * @generated
		 */
		EClass STALL = eINSTANCE.getStall();

		/**
		 * The meta object literal for the '<em><b>Available Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STALL__AVAILABLE_SPACE = eINSTANCE.getStall_AvailableSpace();

		/**
		 * The meta object literal for the '{@link festFair.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see festFair.impl.EventImpl
		 * @see festFair.impl.FestFairPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIME = eINSTANCE.getEvent_Time();

		/**
		 * The meta object literal for the '{@link festFair.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see festFair.impl.PersonImpl
		 * @see festFair.impl.FestFairPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '{@link festFair.impl.GuestImpl <em>Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see festFair.impl.GuestImpl
		 * @see festFair.impl.FestFairPackageImpl#getGuest()
		 * @generated
		 */
		EClass GUEST = eINSTANCE.getGuest();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUEST__VISIT = eINSTANCE.getGuest_Visit();

		/**
		 * The meta object literal for the '{@link festFair.impl.VolunteerImpl <em>Volunteer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see festFair.impl.VolunteerImpl
		 * @see festFair.impl.FestFairPackageImpl#getVolunteer()
		 * @generated
		 */
		EClass VOLUNTEER = eINSTANCE.getVolunteer();

		/**
		 * The meta object literal for the '<em><b>Partner Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUNTEER__PARTNER_ID = eINSTANCE.getVolunteer_PartnerId();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUNTEER__WORK = eINSTANCE.getVolunteer_Work();

	}

} //FestFairPackage
