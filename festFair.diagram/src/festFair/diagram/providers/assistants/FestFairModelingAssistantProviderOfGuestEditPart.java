/*
 * 
 */
package festFair.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class FestFairModelingAssistantProviderOfGuestEditPart
		extends festFair.diagram.providers.FestFairModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((festFair.diagram.edit.parts.GuestEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(festFair.diagram.edit.parts.GuestEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(festFair.diagram.providers.FestFairElementTypes.GuestVisit_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((festFair.diagram.edit.parts.GuestEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(festFair.diagram.edit.parts.GuestEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof festFair.diagram.edit.parts.StallEditPart) {
			types.add(festFair.diagram.providers.FestFairElementTypes.GuestVisit_4001);
		}
		if (targetEditPart instanceof festFair.diagram.edit.parts.EventEditPart) {
			types.add(festFair.diagram.providers.FestFairElementTypes.GuestVisit_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((festFair.diagram.edit.parts.GuestEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(festFair.diagram.edit.parts.GuestEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == festFair.diagram.providers.FestFairElementTypes.GuestVisit_4001) {
			types.add(festFair.diagram.providers.FestFairElementTypes.Stall_3003);
			types.add(festFair.diagram.providers.FestFairElementTypes.Event_3004);
		}
		return types;
	}

}
