/*
 * 
 */
package festFair.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class FestFairElementTypes {

	/**
	* @generated
	*/
	private FestFairElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType FestFair_1000 = getElementType("festFair.diagram.FestFair_1000"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Guest_2002 = getElementType("festFair.diagram.Guest_2002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Volunteer_2003 = getElementType("festFair.diagram.Volunteer_2003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType FairDay_2001 = getElementType("festFair.diagram.FairDay_2001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Stall_3003 = getElementType("festFair.diagram.Stall_3003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Event_3004 = getElementType("festFair.diagram.Event_3004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType GuestVisit_4001 = getElementType("festFair.diagram.GuestVisit_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType VolunteerWork_4002 = getElementType("festFair.diagram.VolunteerWork_4002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(FestFair_1000, festFair.FestFairPackage.eINSTANCE.getFestFair());

			elements.put(Guest_2002, festFair.FestFairPackage.eINSTANCE.getGuest());

			elements.put(Volunteer_2003, festFair.FestFairPackage.eINSTANCE.getVolunteer());

			elements.put(FairDay_2001, festFair.FestFairPackage.eINSTANCE.getFairDay());

			elements.put(Stall_3003, festFair.FestFairPackage.eINSTANCE.getStall());

			elements.put(Event_3004, festFair.FestFairPackage.eINSTANCE.getEvent());

			elements.put(GuestVisit_4001, festFair.FestFairPackage.eINSTANCE.getGuest_Visit());

			elements.put(VolunteerWork_4002, festFair.FestFairPackage.eINSTANCE.getVolunteer_Work());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(FestFair_1000);
			KNOWN_ELEMENT_TYPES.add(Guest_2002);
			KNOWN_ELEMENT_TYPES.add(Volunteer_2003);
			KNOWN_ELEMENT_TYPES.add(FairDay_2001);
			KNOWN_ELEMENT_TYPES.add(Stall_3003);
			KNOWN_ELEMENT_TYPES.add(Event_3004);
			KNOWN_ELEMENT_TYPES.add(GuestVisit_4001);
			KNOWN_ELEMENT_TYPES.add(VolunteerWork_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case festFair.diagram.edit.parts.FestFairEditPart.VISUAL_ID:
			return FestFair_1000;
		case festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID:
			return Guest_2002;
		case festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID:
			return Volunteer_2003;
		case festFair.diagram.edit.parts.FairDayEditPart.VISUAL_ID:
			return FairDay_2001;
		case festFair.diagram.edit.parts.StallEditPart.VISUAL_ID:
			return Stall_3003;
		case festFair.diagram.edit.parts.EventEditPart.VISUAL_ID:
			return Event_3004;
		case festFair.diagram.edit.parts.GuestVisitEditPart.VISUAL_ID:
			return GuestVisit_4001;
		case festFair.diagram.edit.parts.VolunteerWorkEditPart.VISUAL_ID:
			return VolunteerWork_4002;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return festFair.diagram.providers.FestFairElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return festFair.diagram.providers.FestFairElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return festFair.diagram.providers.FestFairElementTypes.getElement(elementTypeAdapter);
		}
	};

}
