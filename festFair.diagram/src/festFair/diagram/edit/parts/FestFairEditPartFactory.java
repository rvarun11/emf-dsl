/*
 * 
 */
package festFair.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class FestFairEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(view)) {

			case festFair.diagram.edit.parts.FestFairEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.FestFairEditPart(view);

			case festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.GuestEditPart(view);

			case festFair.diagram.edit.parts.GuestNameEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.GuestNameEditPart(view);

			case festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.VolunteerEditPart(view);

			case festFair.diagram.edit.parts.VolunteerNameEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.VolunteerNameEditPart(view);

			case festFair.diagram.edit.parts.FairDayEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.FairDayEditPart(view);

			case festFair.diagram.edit.parts.FairDayNameNEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.FairDayNameNEditPart(view);

			case festFair.diagram.edit.parts.StallEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.StallEditPart(view);

			case festFair.diagram.edit.parts.StallNameEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.StallNameEditPart(view);

			case festFair.diagram.edit.parts.EventEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.EventEditPart(view);

			case festFair.diagram.edit.parts.EventNameTimeEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.EventNameTimeEditPart(view);

			case festFair.diagram.edit.parts.FairDayFairDayActivitiesCompartmentEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.FairDayFairDayActivitiesCompartmentEditPart(view);

			case festFair.diagram.edit.parts.GuestVisitEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.GuestVisitEditPart(view);

			case festFair.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.WrappingLabelEditPart(view);

			case festFair.diagram.edit.parts.VolunteerWorkEditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.VolunteerWorkEditPart(view);

			case festFair.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new festFair.diagram.edit.parts.WrappingLabel2EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
