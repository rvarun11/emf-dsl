/*
* 
*/
package festFair.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class FestFairNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public FestFairNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<festFair.diagram.navigator.FestFairNavigatorItem> result = new ArrayList<festFair.diagram.navigator.FestFairNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, festFair.diagram.edit.parts.FestFairEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof festFair.diagram.navigator.FestFairNavigatorGroup) {
			festFair.diagram.navigator.FestFairNavigatorGroup group = (festFair.diagram.navigator.FestFairNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof festFair.diagram.navigator.FestFairNavigatorItem) {
			festFair.diagram.navigator.FestFairNavigatorItem navigatorItem = (festFair.diagram.navigator.FestFairNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(view)) {

		case festFair.diagram.edit.parts.FestFairEditPart.VISUAL_ID: {
			LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem> result = new LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			festFair.diagram.navigator.FestFairNavigatorGroup links = new festFair.diagram.navigator.FestFairNavigatorGroup(
					festFair.diagram.part.Messages.NavigatorGroupName_FestFair_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), festFair.diagram.part.FestFairVisualIDRegistry
					.getType(festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), festFair.diagram.part.FestFairVisualIDRegistry
					.getType(festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), festFair.diagram.part.FestFairVisualIDRegistry
					.getType(festFair.diagram.edit.parts.FairDayEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					festFair.diagram.part.FestFairVisualIDRegistry
							.getType(festFair.diagram.edit.parts.GuestVisitEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					festFair.diagram.part.FestFairVisualIDRegistry
							.getType(festFair.diagram.edit.parts.VolunteerWorkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case festFair.diagram.edit.parts.FairDayEditPart.VISUAL_ID: {
			LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem> result = new LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), festFair.diagram.part.FestFairVisualIDRegistry
					.getType(festFair.diagram.edit.parts.FairDayFairDayActivitiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, festFair.diagram.part.FestFairVisualIDRegistry
					.getType(festFair.diagram.edit.parts.StallEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), festFair.diagram.part.FestFairVisualIDRegistry
					.getType(festFair.diagram.edit.parts.FairDayFairDayActivitiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, festFair.diagram.part.FestFairVisualIDRegistry
					.getType(festFair.diagram.edit.parts.EventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID: {
			LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem> result = new LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem>();
			Node sv = (Node) view;
			festFair.diagram.navigator.FestFairNavigatorGroup outgoinglinks = new festFair.diagram.navigator.FestFairNavigatorGroup(
					festFair.diagram.part.Messages.NavigatorGroupName_Guest_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					festFair.diagram.part.FestFairVisualIDRegistry
							.getType(festFair.diagram.edit.parts.GuestVisitEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID: {
			LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem> result = new LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem>();
			Node sv = (Node) view;
			festFair.diagram.navigator.FestFairNavigatorGroup outgoinglinks = new festFair.diagram.navigator.FestFairNavigatorGroup(
					festFair.diagram.part.Messages.NavigatorGroupName_Volunteer_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					festFair.diagram.part.FestFairVisualIDRegistry
							.getType(festFair.diagram.edit.parts.VolunteerWorkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case festFair.diagram.edit.parts.StallEditPart.VISUAL_ID: {
			LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem> result = new LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem>();
			Node sv = (Node) view;
			festFair.diagram.navigator.FestFairNavigatorGroup incominglinks = new festFair.diagram.navigator.FestFairNavigatorGroup(
					festFair.diagram.part.Messages.NavigatorGroupName_Stall_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					festFair.diagram.part.FestFairVisualIDRegistry
							.getType(festFair.diagram.edit.parts.GuestVisitEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					festFair.diagram.part.FestFairVisualIDRegistry
							.getType(festFair.diagram.edit.parts.VolunteerWorkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case festFair.diagram.edit.parts.EventEditPart.VISUAL_ID: {
			LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem> result = new LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem>();
			Node sv = (Node) view;
			festFair.diagram.navigator.FestFairNavigatorGroup incominglinks = new festFair.diagram.navigator.FestFairNavigatorGroup(
					festFair.diagram.part.Messages.NavigatorGroupName_Event_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					festFair.diagram.part.FestFairVisualIDRegistry
							.getType(festFair.diagram.edit.parts.GuestVisitEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					festFair.diagram.part.FestFairVisualIDRegistry
							.getType(festFair.diagram.edit.parts.VolunteerWorkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case festFair.diagram.edit.parts.GuestVisitEditPart.VISUAL_ID: {
			LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem> result = new LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			festFair.diagram.navigator.FestFairNavigatorGroup target = new festFair.diagram.navigator.FestFairNavigatorGroup(
					festFair.diagram.part.Messages.NavigatorGroupName_GuestVisit_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			festFair.diagram.navigator.FestFairNavigatorGroup source = new festFair.diagram.navigator.FestFairNavigatorGroup(
					festFair.diagram.part.Messages.NavigatorGroupName_GuestVisit_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					festFair.diagram.part.FestFairVisualIDRegistry
							.getType(festFair.diagram.edit.parts.StallEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					festFair.diagram.part.FestFairVisualIDRegistry
							.getType(festFair.diagram.edit.parts.EventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					festFair.diagram.part.FestFairVisualIDRegistry
							.getType(festFair.diagram.edit.parts.GuestEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case festFair.diagram.edit.parts.VolunteerWorkEditPart.VISUAL_ID: {
			LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem> result = new LinkedList<festFair.diagram.navigator.FestFairAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			festFair.diagram.navigator.FestFairNavigatorGroup target = new festFair.diagram.navigator.FestFairNavigatorGroup(
					festFair.diagram.part.Messages.NavigatorGroupName_VolunteerWork_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			festFair.diagram.navigator.FestFairNavigatorGroup source = new festFair.diagram.navigator.FestFairNavigatorGroup(
					festFair.diagram.part.Messages.NavigatorGroupName_VolunteerWork_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					festFair.diagram.part.FestFairVisualIDRegistry
							.getType(festFair.diagram.edit.parts.StallEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					festFair.diagram.part.FestFairVisualIDRegistry
							.getType(festFair.diagram.edit.parts.EventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					festFair.diagram.part.FestFairVisualIDRegistry
							.getType(festFair.diagram.edit.parts.VolunteerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return festFair.diagram.edit.parts.FestFairEditPart.MODEL_ID
				.equals(festFair.diagram.part.FestFairVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<festFair.diagram.navigator.FestFairNavigatorItem> createNavigatorItems(Collection<View> views,
			Object parent, boolean isLeafs) {
		ArrayList<festFair.diagram.navigator.FestFairNavigatorItem> result = new ArrayList<festFair.diagram.navigator.FestFairNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new festFair.diagram.navigator.FestFairNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<festFair.diagram.navigator.FestFairNavigatorItem> getForeignShortcuts(Diagram diagram,
			Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof festFair.diagram.navigator.FestFairAbstractNavigatorItem) {
			festFair.diagram.navigator.FestFairAbstractNavigatorItem abstractNavigatorItem = (festFair.diagram.navigator.FestFairAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
