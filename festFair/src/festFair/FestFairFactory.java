/**
 */
package festFair;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see festFair.FestFairPackage
 * @generated
 */
public interface FestFairFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FestFairFactory eINSTANCE = festFair.impl.FestFairFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fest Fair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fest Fair</em>'.
	 * @generated
	 */
	FestFair createFestFair();

	/**
	 * Returns a new object of class '<em>Fair Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fair Day</em>'.
	 * @generated
	 */
	FairDay createFairDay();

	/**
	 * Returns a new object of class '<em>Stall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stall</em>'.
	 * @generated
	 */
	Stall createStall();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Guest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guest</em>'.
	 * @generated
	 */
	Guest createGuest();

	/**
	 * Returns a new object of class '<em>Volunteer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volunteer</em>'.
	 * @generated
	 */
	Volunteer createVolunteer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FestFairPackage getFestFairPackage();

} //FestFairFactory
