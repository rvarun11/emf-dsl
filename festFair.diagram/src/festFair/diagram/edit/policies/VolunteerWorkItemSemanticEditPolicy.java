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
public class VolunteerWorkItemSemanticEditPolicy
		extends festFair.diagram.edit.policies.FestFairBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public VolunteerWorkItemSemanticEditPolicy() {
		super(festFair.diagram.providers.FestFairElementTypes.VolunteerWork_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
