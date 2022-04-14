/*
* 
*/
package festFair.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class FestFairNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof festFair.diagram.navigator.FestFairNavigatorItem) {
			festFair.diagram.navigator.FestFairNavigatorItem item = (festFair.diagram.navigator.FestFairNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return festFair.diagram.part.FestFairVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
