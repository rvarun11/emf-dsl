/*
* 
*/
package festFair.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class FestFairNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof festFair.diagram.navigator.FestFairNavigatorItem
				&& !isOwnView(((festFair.diagram.navigator.FestFairNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof festFair.diagram.navigator.FestFairNavigatorGroup) {
			festFair.diagram.navigator.FestFairNavigatorGroup group = (festFair.diagram.navigator.FestFairNavigatorGroup) element;
			return festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof festFair.diagram.navigator.FestFairNavigatorItem) {
			festFair.diagram.navigator.FestFairNavigatorItem navigatorItem = (festFair.diagram.navigator.FestFairNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(view)) {
		case festFair.diagram.edit.parts.FestFairEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?vr/festFair?FestFair", //$NON-NLS-1$
					festFair.diagram.providers.FestFairElementTypes.FestFair_1000);
		case festFair.diagram.edit.parts.FairDayEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?vr/festFair?FairDay", //$NON-NLS-1$
					festFair.diagram.providers.FestFairElementTypes.FairDay_2001);
		case festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?vr/festFair?Guest", //$NON-NLS-1$
					festFair.diagram.providers.FestFairElementTypes.Guest_2002);
		case festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?vr/festFair?Volunteer", //$NON-NLS-1$
					festFair.diagram.providers.FestFairElementTypes.Volunteer_2003);
		case festFair.diagram.edit.parts.StallEditPart.VISUAL_ID:
			return getImage("Navigator?Node?vr/festFair?Stall", //$NON-NLS-1$
					festFair.diagram.providers.FestFairElementTypes.Stall_3003);
		case festFair.diagram.edit.parts.EventEditPart.VISUAL_ID:
			return getImage("Navigator?Node?vr/festFair?Event", //$NON-NLS-1$
					festFair.diagram.providers.FestFairElementTypes.Event_3004);
		case festFair.diagram.edit.parts.GuestVisitEditPart.VISUAL_ID:
			return getImage("Navigator?Link?vr/festFair?Guest?visit", //$NON-NLS-1$
					festFair.diagram.providers.FestFairElementTypes.GuestVisit_4001);
		case festFair.diagram.edit.parts.VolunteerWorkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?vr/festFair?Volunteer?work", //$NON-NLS-1$
					festFair.diagram.providers.FestFairElementTypes.VolunteerWork_4002);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& festFair.diagram.providers.FestFairElementTypes.isKnownElementType(elementType)) {
			image = festFair.diagram.providers.FestFairElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof festFair.diagram.navigator.FestFairNavigatorGroup) {
			festFair.diagram.navigator.FestFairNavigatorGroup group = (festFair.diagram.navigator.FestFairNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof festFair.diagram.navigator.FestFairNavigatorItem) {
			festFair.diagram.navigator.FestFairNavigatorItem navigatorItem = (festFair.diagram.navigator.FestFairNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(view)) {
		case festFair.diagram.edit.parts.FestFairEditPart.VISUAL_ID:
			return getFestFair_1000Text(view);
		case festFair.diagram.edit.parts.FairDayEditPart.VISUAL_ID:
			return getFairDay_2001Text(view);
		case festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID:
			return getGuest_2002Text(view);
		case festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID:
			return getVolunteer_2003Text(view);
		case festFair.diagram.edit.parts.StallEditPart.VISUAL_ID:
			return getStall_3003Text(view);
		case festFair.diagram.edit.parts.EventEditPart.VISUAL_ID:
			return getEvent_3004Text(view);
		case festFair.diagram.edit.parts.GuestVisitEditPart.VISUAL_ID:
			return getGuestVisit_4001Text(view);
		case festFair.diagram.edit.parts.VolunteerWorkEditPart.VISUAL_ID:
			return getVolunteerWork_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getFestFair_1000Text(View view) {
		festFair.FestFair domainModelElement = (festFair.FestFair) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFairDay_2001Text(View view) {
		IParser parser = festFair.diagram.providers.FestFairParserProvider.getParser(
				festFair.diagram.providers.FestFairElementTypes.FairDay_2001,
				view.getElement() != null ? view.getElement() : view, festFair.diagram.part.FestFairVisualIDRegistry
						.getType(festFair.diagram.edit.parts.FairDayNameNEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGuest_2002Text(View view) {
		IParser parser = festFair.diagram.providers.FestFairParserProvider.getParser(
				festFair.diagram.providers.FestFairElementTypes.Guest_2002,
				view.getElement() != null ? view.getElement() : view, festFair.diagram.part.FestFairVisualIDRegistry
						.getType(festFair.diagram.edit.parts.GuestNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVolunteer_2003Text(View view) {
		IParser parser = festFair.diagram.providers.FestFairParserProvider.getParser(
				festFair.diagram.providers.FestFairElementTypes.Volunteer_2003,
				view.getElement() != null ? view.getElement() : view, festFair.diagram.part.FestFairVisualIDRegistry
						.getType(festFair.diagram.edit.parts.VolunteerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStall_3003Text(View view) {
		IParser parser = festFair.diagram.providers.FestFairParserProvider.getParser(
				festFair.diagram.providers.FestFairElementTypes.Stall_3003,
				view.getElement() != null ? view.getElement() : view, festFair.diagram.part.FestFairVisualIDRegistry
						.getType(festFair.diagram.edit.parts.StallNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEvent_3004Text(View view) {
		IParser parser = festFair.diagram.providers.FestFairParserProvider.getParser(
				festFair.diagram.providers.FestFairElementTypes.Event_3004,
				view.getElement() != null ? view.getElement() : view, festFair.diagram.part.FestFairVisualIDRegistry
						.getType(festFair.diagram.edit.parts.EventNameTimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGuestVisit_4001Text(View view) {
		IParser parser = festFair.diagram.providers.FestFairParserProvider.getParser(
				festFair.diagram.providers.FestFairElementTypes.GuestVisit_4001,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVolunteerWork_4002Text(View view) {
		IParser parser = festFair.diagram.providers.FestFairParserProvider.getParser(
				festFair.diagram.providers.FestFairElementTypes.VolunteerWork_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return festFair.diagram.edit.parts.FestFairEditPart.MODEL_ID
				.equals(festFair.diagram.part.FestFairVisualIDRegistry.getModelID(view));
	}

}
