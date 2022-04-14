/*
* 
*/
package festFair.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class FestFairDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairNodeDescriptor> getSemanticChildren(View view) {
		switch (festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(view)) {
		case festFair.diagram.edit.parts.FestFairEditPart.VISUAL_ID:
			return getFestFair_1000SemanticChildren(view);
		case festFair.diagram.edit.parts.FairDayFairDayActivitiesCompartmentEditPart.VISUAL_ID:
			return getFairDayFairDayActivitiesCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairNodeDescriptor> getFestFair_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		festFair.FestFair modelElement = (festFair.FestFair) view.getElement();
		LinkedList<festFair.diagram.part.FestFairNodeDescriptor> result = new LinkedList<festFair.diagram.part.FestFairNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttendees().iterator(); it.hasNext();) {
			festFair.Person childElement = (festFair.Person) it.next();
			int visualID = festFair.diagram.part.FestFairVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID) {
				result.add(new festFair.diagram.part.FestFairNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID) {
				result.add(new festFair.diagram.part.FestFairNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFairDays().iterator(); it.hasNext();) {
			festFair.FairDay childElement = (festFair.FairDay) it.next();
			int visualID = festFair.diagram.part.FestFairVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == festFair.diagram.edit.parts.FairDayEditPart.VISUAL_ID) {
				result.add(new festFair.diagram.part.FestFairNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairNodeDescriptor> getFairDayFairDayActivitiesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		festFair.FairDay modelElement = (festFair.FairDay) containerView.getElement();
		LinkedList<festFair.diagram.part.FestFairNodeDescriptor> result = new LinkedList<festFair.diagram.part.FestFairNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActivities().iterator(); it.hasNext();) {
			festFair.Activity childElement = (festFair.Activity) it.next();
			int visualID = festFair.diagram.part.FestFairVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == festFair.diagram.edit.parts.StallEditPart.VISUAL_ID) {
				result.add(new festFair.diagram.part.FestFairNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == festFair.diagram.edit.parts.EventEditPart.VISUAL_ID) {
				result.add(new festFair.diagram.part.FestFairNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getContainedLinks(View view) {
		switch (festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(view)) {
		case festFair.diagram.edit.parts.FestFairEditPart.VISUAL_ID:
			return getFestFair_1000ContainedLinks(view);
		case festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID:
			return getGuest_2002ContainedLinks(view);
		case festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID:
			return getVolunteer_2003ContainedLinks(view);
		case festFair.diagram.edit.parts.FairDayEditPart.VISUAL_ID:
			return getFairDay_2001ContainedLinks(view);
		case festFair.diagram.edit.parts.StallEditPart.VISUAL_ID:
			return getStall_3003ContainedLinks(view);
		case festFair.diagram.edit.parts.EventEditPart.VISUAL_ID:
			return getEvent_3004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getIncomingLinks(View view) {
		switch (festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(view)) {
		case festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID:
			return getGuest_2002IncomingLinks(view);
		case festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID:
			return getVolunteer_2003IncomingLinks(view);
		case festFair.diagram.edit.parts.FairDayEditPart.VISUAL_ID:
			return getFairDay_2001IncomingLinks(view);
		case festFair.diagram.edit.parts.StallEditPart.VISUAL_ID:
			return getStall_3003IncomingLinks(view);
		case festFair.diagram.edit.parts.EventEditPart.VISUAL_ID:
			return getEvent_3004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getOutgoingLinks(View view) {
		switch (festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(view)) {
		case festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID:
			return getGuest_2002OutgoingLinks(view);
		case festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID:
			return getVolunteer_2003OutgoingLinks(view);
		case festFair.diagram.edit.parts.FairDayEditPart.VISUAL_ID:
			return getFairDay_2001OutgoingLinks(view);
		case festFair.diagram.edit.parts.StallEditPart.VISUAL_ID:
			return getStall_3003OutgoingLinks(view);
		case festFair.diagram.edit.parts.EventEditPart.VISUAL_ID:
			return getEvent_3004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getFestFair_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getGuest_2002ContainedLinks(View view) {
		festFair.Guest modelElement = (festFair.Guest) view.getElement();
		LinkedList<festFair.diagram.part.FestFairLinkDescriptor> result = new LinkedList<festFair.diagram.part.FestFairLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Guest_Visit_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getVolunteer_2003ContainedLinks(View view) {
		festFair.Volunteer modelElement = (festFair.Volunteer) view.getElement();
		LinkedList<festFair.diagram.part.FestFairLinkDescriptor> result = new LinkedList<festFair.diagram.part.FestFairLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Volunteer_Work_4002(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getFairDay_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getStall_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getEvent_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getGuest_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getVolunteer_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getFairDay_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getStall_3003IncomingLinks(View view) {
		festFair.Stall modelElement = (festFair.Stall) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<festFair.diagram.part.FestFairLinkDescriptor> result = new LinkedList<festFair.diagram.part.FestFairLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Guest_Visit_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Volunteer_Work_4002(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getEvent_3004IncomingLinks(View view) {
		festFair.Event modelElement = (festFair.Event) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<festFair.diagram.part.FestFairLinkDescriptor> result = new LinkedList<festFair.diagram.part.FestFairLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Guest_Visit_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Volunteer_Work_4002(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getGuest_2002OutgoingLinks(View view) {
		festFair.Guest modelElement = (festFair.Guest) view.getElement();
		LinkedList<festFair.diagram.part.FestFairLinkDescriptor> result = new LinkedList<festFair.diagram.part.FestFairLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Guest_Visit_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getVolunteer_2003OutgoingLinks(View view) {
		festFair.Volunteer modelElement = (festFair.Volunteer) view.getElement();
		LinkedList<festFair.diagram.part.FestFairLinkDescriptor> result = new LinkedList<festFair.diagram.part.FestFairLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Volunteer_Work_4002(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getFairDay_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getStall_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<festFair.diagram.part.FestFairLinkDescriptor> getEvent_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<festFair.diagram.part.FestFairLinkDescriptor> getIncomingFeatureModelFacetLinks_Guest_Visit_4001(
			festFair.Activity target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<festFair.diagram.part.FestFairLinkDescriptor> result = new LinkedList<festFair.diagram.part.FestFairLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == festFair.FestFairPackage.eINSTANCE.getGuest_Visit()) {
				result.add(new festFair.diagram.part.FestFairLinkDescriptor(setting.getEObject(), target,
						festFair.diagram.providers.FestFairElementTypes.GuestVisit_4001,
						festFair.diagram.edit.parts.GuestVisitEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<festFair.diagram.part.FestFairLinkDescriptor> getIncomingFeatureModelFacetLinks_Volunteer_Work_4002(
			festFair.Activity target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<festFair.diagram.part.FestFairLinkDescriptor> result = new LinkedList<festFair.diagram.part.FestFairLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == festFair.FestFairPackage.eINSTANCE.getVolunteer_Work()) {
				result.add(new festFair.diagram.part.FestFairLinkDescriptor(setting.getEObject(), target,
						festFair.diagram.providers.FestFairElementTypes.VolunteerWork_4002,
						festFair.diagram.edit.parts.VolunteerWorkEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<festFair.diagram.part.FestFairLinkDescriptor> getOutgoingFeatureModelFacetLinks_Guest_Visit_4001(
			festFair.Guest source) {
		LinkedList<festFair.diagram.part.FestFairLinkDescriptor> result = new LinkedList<festFair.diagram.part.FestFairLinkDescriptor>();
		festFair.Activity destination = source.getVisit();
		if (destination == null) {
			return result;
		}
		result.add(new festFair.diagram.part.FestFairLinkDescriptor(source, destination,
				festFair.diagram.providers.FestFairElementTypes.GuestVisit_4001,
				festFair.diagram.edit.parts.GuestVisitEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<festFair.diagram.part.FestFairLinkDescriptor> getOutgoingFeatureModelFacetLinks_Volunteer_Work_4002(
			festFair.Volunteer source) {
		LinkedList<festFair.diagram.part.FestFairLinkDescriptor> result = new LinkedList<festFair.diagram.part.FestFairLinkDescriptor>();
		festFair.Activity destination = source.getWork();
		if (destination == null) {
			return result;
		}
		result.add(new festFair.diagram.part.FestFairLinkDescriptor(source, destination,
				festFair.diagram.providers.FestFairElementTypes.VolunteerWork_4002,
				festFair.diagram.edit.parts.VolunteerWorkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<festFair.diagram.part.FestFairNodeDescriptor> getSemanticChildren(View view) {
			return FestFairDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<festFair.diagram.part.FestFairLinkDescriptor> getContainedLinks(View view) {
			return FestFairDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<festFair.diagram.part.FestFairLinkDescriptor> getIncomingLinks(View view) {
			return FestFairDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<festFair.diagram.part.FestFairLinkDescriptor> getOutgoingLinks(View view) {
			return FestFairDiagramUpdater.getOutgoingLinks(view);
		}
	};

	public static List<FestFairNodeDescriptor> getFairDay_1000SemanticChildren(View viewObject) {
		// TODO Auto-generated method stub
		return null;
	}

}
