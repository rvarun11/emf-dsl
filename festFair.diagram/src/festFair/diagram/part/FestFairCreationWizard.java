/*
 * 
 */
package festFair.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class FestFairCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected festFair.diagram.part.FestFairCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected festFair.diagram.part.FestFairCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(festFair.diagram.part.Messages.FestFairCreationWizardTitle);
		setDefaultPageImageDescriptor(festFair.diagram.part.FestFairDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewFestFairWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new festFair.diagram.part.FestFairCreationWizardPage("DiagramModelFile", getSelection(), //$NON-NLS-1$
				"festFair_diagram"); //$NON-NLS-1$
		diagramModelFilePage.setTitle(festFair.diagram.part.Messages.FestFairCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(festFair.diagram.part.Messages.FestFairCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new festFair.diagram.part.FestFairCreationWizardPage("DomainModelFile", getSelection(), //$NON-NLS-1$
				"festFair") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".festFair_diagram".length()); //$NON-NLS-1$
					setFileName(festFair.diagram.part.FestFairDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "festFair")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(festFair.diagram.part.Messages.FestFairCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(festFair.diagram.part.Messages.FestFairCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = festFair.diagram.part.FestFairDiagramEditorUtil.createDiagram(diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						festFair.diagram.part.FestFairDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								festFair.diagram.part.Messages.FestFairCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						festFair.diagram.part.Messages.FestFairCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				festFair.diagram.part.FestFairDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
