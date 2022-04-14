/**
 */
package festFair;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fest Fair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link festFair.FestFair#getFairDays <em>Fair Days</em>}</li>
 *   <li>{@link festFair.FestFair#getAttendees <em>Attendees</em>}</li>
 * </ul>
 *
 * @see festFair.FestFairPackage#getFestFair()
 * @model annotation="gmf.diagram model.extension='festFair'"
 * @generated
 */
public interface FestFair extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Fair Days</b></em>' containment reference list.
	 * The list contents are of type {@link festFair.FairDay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fair Days</em>' containment reference list.
	 * @see festFair.FestFairPackage#getFestFair_FairDays()
	 * @model containment="true"
	 * @generated
	 */
	EList<FairDay> getFairDays();

	/**
	 * Returns the value of the '<em><b>Attendees</b></em>' containment reference list.
	 * The list contents are of type {@link festFair.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attendees</em>' containment reference list.
	 * @see festFair.FestFairPackage#getFestFair_Attendees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getAttendees();

} // FestFair
