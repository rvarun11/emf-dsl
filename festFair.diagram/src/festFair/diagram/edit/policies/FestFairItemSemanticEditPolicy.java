/*
* 
*/
package festFair.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class FestFairItemSemanticEditPolicy extends festFair.diagram.edit.policies.FestFairBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FestFairItemSemanticEditPolicy() {
		super(festFair.diagram.providers.FestFairElementTypes.FestFair_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (festFair.diagram.providers.FestFairElementTypes.Guest_2002 == req.getElementType()) {
			return getGEFWrapper(new festFair.diagram.edit.commands.GuestCreateCommand(req));
		}
		if (festFair.diagram.providers.FestFairElementTypes.Volunteer_2003 == req.getElementType()) {
			return getGEFWrapper(new festFair.diagram.edit.commands.VolunteerCreateCommand(req));
		}
		if (festFair.diagram.providers.FestFairElementTypes.FairDay_2001 == req.getElementType()) {
			return getGEFWrapper(new festFair.diagram.edit.commands.FairDayCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
