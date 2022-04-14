/*
 * 
 */
package festFair.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class FestFairModelingAssistantProviderOfStallEditPart
		extends festFair.diagram.providers.FestFairModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((festFair.diagram.edit.parts.StallEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(festFair.diagram.edit.parts.StallEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(festFair.diagram.providers.FestFairElementTypes.GuestVisit_4001);
		types.add(festFair.diagram.providers.FestFairElementTypes.VolunteerWork_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((festFair.diagram.edit.parts.StallEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(festFair.diagram.edit.parts.StallEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == festFair.diagram.providers.FestFairElementTypes.GuestVisit_4001) {
			types.add(festFair.diagram.providers.FestFairElementTypes.Guest_2002);
		} else if (relationshipType == festFair.diagram.providers.FestFairElementTypes.VolunteerWork_4002) {
			types.add(festFair.diagram.providers.FestFairElementTypes.Volunteer_2003);
		}
		return types;
	}

}
