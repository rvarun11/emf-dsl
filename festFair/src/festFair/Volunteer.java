/**
 */
package festFair;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volunteer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link festFair.Volunteer#getPartnerId <em>Partner Id</em>}</li>
 *   <li>{@link festFair.Volunteer#getWork <em>Work</em>}</li>
 * </ul>
 *
 * @see festFair.FestFairPackage#getVolunteer()
 * @model annotation="gmf.node label='name' label.pattern='Volunteer {0}'"
 * @generated
 */
public interface Volunteer extends Person {
	/**
	 * Returns the value of the '<em><b>Partner Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Id</em>' attribute.
	 * @see #setPartnerId(int)
	 * @see festFair.FestFairPackage#getVolunteer_PartnerId()
	 * @model
	 * @generated
	 */
	int getPartnerId();

	/**
	 * Sets the value of the '{@link festFair.Volunteer#getPartnerId <em>Partner Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Id</em>' attribute.
	 * @see #getPartnerId()
	 * @generated
	 */
	void setPartnerId(int value);

	/**
	 * Returns the value of the '<em><b>Work</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link festFair.Activity#getVolunteer <em>Volunteer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' reference.
	 * @see #setWork(Activity)
	 * @see festFair.FestFairPackage#getVolunteer_Work()
	 * @see festFair.Activity#getVolunteer
	 * @model opposite="volunteer"
	 *        annotation="gmf.link target.decoration='arrow' source.decoration='none' style='solid' width='2' color='241,194,50'"
	 * @generated
	 */
	Activity getWork();

	/**
	 * Sets the value of the '{@link festFair.Volunteer#getWork <em>Work</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' reference.
	 * @see #getWork()
	 * @generated
	 */
	void setWork(Activity value);

} // Volunteer
