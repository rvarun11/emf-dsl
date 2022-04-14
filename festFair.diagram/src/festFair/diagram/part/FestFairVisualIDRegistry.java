/*
* 
*/
package festFair.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class FestFairVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "festFair.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (festFair.diagram.edit.parts.FestFairEditPart.MODEL_ID.equals(view.getType())) {
				return festFair.diagram.edit.parts.FestFairEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (festFair.FestFairPackage.eINSTANCE.getFestFair().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((festFair.FestFair) domainElement)) {
			return festFair.diagram.edit.parts.FestFairEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = festFair.diagram.part.FestFairVisualIDRegistry.getModelID(containerView);
		if (!festFair.diagram.edit.parts.FestFairEditPart.MODEL_ID.equals(containerModelID)
				&& !"festFair".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (festFair.diagram.edit.parts.FestFairEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = festFair.diagram.edit.parts.FestFairEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case festFair.diagram.edit.parts.FestFairEditPart.VISUAL_ID:
			if (festFair.FestFairPackage.eINSTANCE.getGuest().isSuperTypeOf(domainElement.eClass())) {
				return festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID;
			}
			if (festFair.FestFairPackage.eINSTANCE.getVolunteer().isSuperTypeOf(domainElement.eClass())) {
				return festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID;
			}
			if (festFair.FestFairPackage.eINSTANCE.getFairDay().isSuperTypeOf(domainElement.eClass())) {
				return festFair.diagram.edit.parts.FairDayEditPart.VISUAL_ID;
			}
			break;
		case festFair.diagram.edit.parts.FairDayFairDayActivitiesCompartmentEditPart.VISUAL_ID:
			if (festFair.FestFairPackage.eINSTANCE.getStall().isSuperTypeOf(domainElement.eClass())) {
				return festFair.diagram.edit.parts.StallEditPart.VISUAL_ID;
			}
			if (festFair.FestFairPackage.eINSTANCE.getEvent().isSuperTypeOf(domainElement.eClass())) {
				return festFair.diagram.edit.parts.EventEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = festFair.diagram.part.FestFairVisualIDRegistry.getModelID(containerView);
		if (!festFair.diagram.edit.parts.FestFairEditPart.MODEL_ID.equals(containerModelID)
				&& !"festFair".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (festFair.diagram.edit.parts.FestFairEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = festFair.diagram.edit.parts.FestFairEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case festFair.diagram.edit.parts.FestFairEditPart.VISUAL_ID:
			if (festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (festFair.diagram.edit.parts.FairDayEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID:
			if (festFair.diagram.edit.parts.GuestNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID:
			if (festFair.diagram.edit.parts.VolunteerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case festFair.diagram.edit.parts.FairDayEditPart.VISUAL_ID:
			if (festFair.diagram.edit.parts.FairDayNameNEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (festFair.diagram.edit.parts.FairDayFairDayActivitiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case festFair.diagram.edit.parts.StallEditPart.VISUAL_ID:
			if (festFair.diagram.edit.parts.StallNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case festFair.diagram.edit.parts.EventEditPart.VISUAL_ID:
			if (festFair.diagram.edit.parts.EventNameTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case festFair.diagram.edit.parts.FairDayFairDayActivitiesCompartmentEditPart.VISUAL_ID:
			if (festFair.diagram.edit.parts.StallEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (festFair.diagram.edit.parts.EventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case festFair.diagram.edit.parts.GuestVisitEditPart.VISUAL_ID:
			if (festFair.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case festFair.diagram.edit.parts.VolunteerWorkEditPart.VISUAL_ID:
			if (festFair.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(festFair.FestFair element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case festFair.diagram.edit.parts.FairDayFairDayActivitiesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case festFair.diagram.edit.parts.FestFairEditPart.VISUAL_ID:
			return false;
		case festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID:
		case festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID:
		case festFair.diagram.edit.parts.StallEditPart.VISUAL_ID:
		case festFair.diagram.edit.parts.EventEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return festFair.diagram.part.FestFairVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return festFair.diagram.part.FestFairVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return festFair.diagram.part.FestFairVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return festFair.diagram.part.FestFairVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return festFair.diagram.part.FestFairVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
