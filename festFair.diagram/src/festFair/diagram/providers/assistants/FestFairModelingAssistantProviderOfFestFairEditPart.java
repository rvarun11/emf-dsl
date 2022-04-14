/*
 * 
 */
package festFair.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class FestFairModelingAssistantProviderOfFestFairEditPart
		extends festFair.diagram.providers.FestFairModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(festFair.diagram.providers.FestFairElementTypes.Guest_2002);
		types.add(festFair.diagram.providers.FestFairElementTypes.Volunteer_2003);
		types.add(festFair.diagram.providers.FestFairElementTypes.FairDay_2001);
		return types;
	}

}
