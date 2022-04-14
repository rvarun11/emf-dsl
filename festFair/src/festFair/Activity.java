/**
 */
package festFair;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link festFair.Activity#getVolunteer <em>Volunteer</em>}</li>
 *   <li>{@link festFair.Activity#getGuests <em>Guests</em>}</li>
 * </ul>
 *
 * @see festFair.FestFairPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Volunteer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link festFair.Volunteer#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volunteer</em>' reference.
	 * @see #setVolunteer(Volunteer)
	 * @see festFair.FestFairPackage#getActivity_Volunteer()
	 * @see festFair.Volunteer#getWork
	 * @model opposite="work"
	 * @generated
	 */
	Volunteer getVolunteer();

	/**
	 * Sets the value of the '{@link festFair.Activity#getVolunteer <em>Volunteer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volunteer</em>' reference.
	 * @see #getVolunteer()
	 * @generated
	 */
	void setVolunteer(Volunteer value);

	/**
	 * Returns the value of the '<em><b>Guests</b></em>' reference list.
	 * The list contents are of type {@link festFair.Guest}.
	 * It is bidirectional and its opposite is '{@link festFair.Guest#getVisit <em>Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guests</em>' reference list.
	 * @see festFair.FestFairPackage#getActivity_Guests()
	 * @see festFair.Guest#getVisit
	 * @model opposite="visit"
	 * @generated
	 */
	EList<Guest> getGuests();

} // Activity
