/*
 * 
 */
package festFair.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		festFair.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		festFair.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		festFair.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		festFair.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		festFair.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
