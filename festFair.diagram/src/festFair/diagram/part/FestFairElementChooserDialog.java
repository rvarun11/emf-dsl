/*
 * 
 */
package festFair.diagram.part;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.part.DefaultElementChooserDialog;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;

/**
 * @generated
 */
public class FestFairElementChooserDialog extends DefaultElementChooserDialog {

	/**
	* @generated
	*/
	public FestFairElementChooserDialog(Shell parentShell, View view) {
		this(parentShell, view, false);
	}

	/**
	* @generated
	*/
	public FestFairElementChooserDialog(Shell parentShell, View view, boolean allowMultiSelection) {
		super(parentShell, view, new FestFairElementChooserDialogContextImpl(allowMultiSelection));
	}

	/**
	* @generated
	*/
	private static class FestFairElementChooserDialogContextImpl implements DefaultElementChooserDialog.Context {

		/**
		* @generated
		*/
		private static final String[] FILE_EXTENSIONS = new String[] { "festFair" };

		/**
		* @generated
		*/
		private final boolean myAllowMultiSelection;

		/**
		* @generated
		*/
		private FestFairElementChooserDialogContextImpl(boolean allowMultiSelection) {
			myAllowMultiSelection = allowMultiSelection;
		}

		/**
		* @generated
		*/
		@Override

		public AdapterFactory getAdapterFactory() {
			return festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory();
		}

		/**
		* @generated
		*/
		@Override

		public PreferencesHint getPreferenceHint() {
			return festFair.diagram.part.FestFairDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
		}

		/**
		* @generated
		*/
		@Override

		public String[] getFileExtesions() {
			return FILE_EXTENSIONS.clone();
		}

		/**
		* @generated
		*/
		@Override

		public String getDialogTitle() {
			return festFair.diagram.part.Messages.FestFairElementChooserDialog_SelectModelElementTitle;
		}

		/**
		* @generated
		*/
		@Override
		public ITreeContentProvider getTreeContentProvider() {
			return new BaseWorkbenchContentProvider();
		}

		/**
		* @generated
		*/
		public boolean allowMultiSelection() {
			return myAllowMultiSelection;
		}

	}

}
