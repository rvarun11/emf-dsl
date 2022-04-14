/*
 * 
 */
package festFair.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class FestFairParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser guestName_5006Parser;

	/**
	* @generated
	*/
	private IParser getGuestName_5006Parser() {
		if (guestName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { festFair.FestFairPackage.eINSTANCE.getNamedElement_Name() };
			festFair.diagram.parsers.MessageFormatParser parser = new festFair.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Guest {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Guest {0}"); //$NON-NLS-1$
			parser.setEditPattern("Guest {0}"); //$NON-NLS-1$
			guestName_5006Parser = parser;
		}
		return guestName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser volunteerName_5007Parser;

	/**
	* @generated
	*/
	private IParser getVolunteerName_5007Parser() {
		if (volunteerName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { festFair.FestFairPackage.eINSTANCE.getNamedElement_Name() };
			festFair.diagram.parsers.MessageFormatParser parser = new festFair.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Volunteer {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Volunteer {0}"); //$NON-NLS-1$
			parser.setEditPattern("Volunteer {0}"); //$NON-NLS-1$
			volunteerName_5007Parser = parser;
		}
		return volunteerName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser fairDayNameN_5001Parser;

	/**
	* @generated
	*/
	private IParser getFairDayNameN_5001Parser() {
		if (fairDayNameN_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { festFair.FestFairPackage.eINSTANCE.getNamedElement_Name(),
					festFair.FestFairPackage.eINSTANCE.getFairDay_N() };
			festFair.diagram.parsers.MessageFormatParser parser = new festFair.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Day {1}: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Day {1}: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Day {1}: {0}"); //$NON-NLS-1$
			fairDayNameN_5001Parser = parser;
		}
		return fairDayNameN_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser stallName_5004Parser;

	/**
	* @generated
	*/
	private IParser getStallName_5004Parser() {
		if (stallName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { festFair.FestFairPackage.eINSTANCE.getNamedElement_Name() };
			festFair.diagram.parsers.MessageFormatParser parser = new festFair.diagram.parsers.MessageFormatParser(
					features);
			stallName_5004Parser = parser;
		}
		return stallName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser eventNameTime_5005Parser;

	/**
	* @generated
	*/
	private IParser getEventNameTime_5005Parser() {
		if (eventNameTime_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { festFair.FestFairPackage.eINSTANCE.getNamedElement_Name(),
					festFair.FestFairPackage.eINSTANCE.getEvent_Time() };
			festFair.diagram.parsers.MessageFormatParser parser = new festFair.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			eventNameTime_5005Parser = parser;
		}
		return eventNameTime_5005Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case festFair.diagram.edit.parts.GuestNameEditPart.VISUAL_ID:
			return getGuestName_5006Parser();
		case festFair.diagram.edit.parts.VolunteerNameEditPart.VISUAL_ID:
			return getVolunteerName_5007Parser();
		case festFair.diagram.edit.parts.FairDayNameNEditPart.VISUAL_ID:
			return getFairDayNameN_5001Parser();
		case festFair.diagram.edit.parts.StallNameEditPart.VISUAL_ID:
			return getStallName_5004Parser();
		case festFair.diagram.edit.parts.EventNameTimeEditPart.VISUAL_ID:
			return getEventNameTime_5005Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (festFair.diagram.providers.FestFairElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
