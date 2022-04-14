/*
 * 
 */
package festFair.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
