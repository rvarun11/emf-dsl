/*
* 
*/
package festFair.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
* @generated
*/
public class FairDayFairDayAttendeesCompartmentItemSemanticEditPolicy
		extends festFair.diagram.edit.policies.FestFairBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FairDayFairDayAttendeesCompartmentItemSemanticEditPolicy() {
		super(festFair.diagram.providers.FestFairElementTypes.FairDay_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (festFair.diagram.providers.FestFairElementTypes.Guest_3001 == req.getElementType()) {
			return getGEFWrapper(new festFair.diagram.edit.commands.GuestCreateCommand(req));
		}
		if (festFair.diagram.providers.FestFairElementTypes.Volunteer_3002 == req.getElementType()) {
			return getGEFWrapper(new festFair.diagram.edit.commands.VolunteerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
