/*
* 
*/
package festFair.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class GuestVisitItemSemanticEditPolicy
		extends festFair.diagram.edit.policies.FestFairBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GuestVisitItemSemanticEditPolicy() {
		super(festFair.diagram.providers.FestFairElementTypes.GuestVisit_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
