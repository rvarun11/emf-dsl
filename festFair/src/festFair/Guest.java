/**
 */
package festFair;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link festFair.Guest#getVisit <em>Visit</em>}</li>
 * </ul>
 *
 * @see festFair.FestFairPackage#getGuest()
 * @model annotation="gmf.node label='name' label.pattern='Guest {0}'"
 * @generated
 */
public interface Guest extends Person {
	/**
	 * Returns the value of the '<em><b>Visit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link festFair.Activity#getGuests <em>Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit</em>' reference.
	 * @see #setVisit(Activity)
	 * @see festFair.FestFairPackage#getGuest_Visit()
	 * @see festFair.Activity#getGuests
	 * @model opposite="guests"
	 *        annotation="gmf.link target.decoration='arrow' source.decoration='none' style='dot' width='2' color='0,255,0'"
	 * @generated
	 */
	Activity getVisit();

	/**
	 * Sets the value of the '{@link festFair.Guest#getVisit <em>Visit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit</em>' reference.
	 * @see #getVisit()
	 * @generated
	 */
	void setVisit(Activity value);

} // Guest
