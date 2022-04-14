/*
* 
*/
package festFair.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
* @generated
*/
public class FairDayFairDayActivitiesCompartmentItemSemanticEditPolicy
		extends festFair.diagram.edit.policies.FestFairBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FairDayFairDayActivitiesCompartmentItemSemanticEditPolicy() {
		super(festFair.diagram.providers.FestFairElementTypes.FairDay_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (festFair.diagram.providers.FestFairElementTypes.Stall_3003 == req.getElementType()) {
			return getGEFWrapper(new festFair.diagram.edit.commands.StallCreateCommand(req));
		}
		if (festFair.diagram.providers.FestFairElementTypes.Event_3004 == req.getElementType()) {
			return getGEFWrapper(new festFair.diagram.edit.commands.EventCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
