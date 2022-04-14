
/*
 * 
 */
package festFair.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class FestFairPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(festFair.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createEvent1CreationTool());
		paletteContainer.add(createFairDay2CreationTool());
		paletteContainer.add(createGuest3CreationTool());
		paletteContainer.add(createStall4CreationTool());
		paletteContainer.add(createVolunteer5CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(festFair.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createVisit1CreationTool());
		paletteContainer.add(createWork2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createEvent1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(festFair.diagram.part.Messages.Event1CreationTool_title,
				festFair.diagram.part.Messages.Event1CreationTool_desc,
				Collections.singletonList(festFair.diagram.providers.FestFairElementTypes.Event_3004));
		entry.setId("createEvent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(festFair.diagram.providers.FestFairElementTypes
				.getImageDescriptor(festFair.diagram.providers.FestFairElementTypes.Event_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFairDay2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(festFair.diagram.part.Messages.FairDay2CreationTool_title,
				festFair.diagram.part.Messages.FairDay2CreationTool_desc,
				Collections.singletonList(festFair.diagram.providers.FestFairElementTypes.FairDay_2001));
		entry.setId("createFairDay2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(festFair.diagram.providers.FestFairElementTypes
				.getImageDescriptor(festFair.diagram.providers.FestFairElementTypes.FairDay_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGuest3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(festFair.diagram.part.Messages.Guest3CreationTool_title,
				festFair.diagram.part.Messages.Guest3CreationTool_desc,
				Collections.singletonList(festFair.diagram.providers.FestFairElementTypes.Guest_2002));
		entry.setId("createGuest3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(festFair.diagram.providers.FestFairElementTypes
				.getImageDescriptor(festFair.diagram.providers.FestFairElementTypes.Guest_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStall4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(festFair.diagram.part.Messages.Stall4CreationTool_title,
				festFair.diagram.part.Messages.Stall4CreationTool_desc,
				Collections.singletonList(festFair.diagram.providers.FestFairElementTypes.Stall_3003));
		entry.setId("createStall4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(festFair.diagram.providers.FestFairElementTypes
				.getImageDescriptor(festFair.diagram.providers.FestFairElementTypes.Stall_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVolunteer5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				festFair.diagram.part.Messages.Volunteer5CreationTool_title,
				festFair.diagram.part.Messages.Volunteer5CreationTool_desc,
				Collections.singletonList(festFair.diagram.providers.FestFairElementTypes.Volunteer_2003));
		entry.setId("createVolunteer5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(festFair.diagram.providers.FestFairElementTypes
				.getImageDescriptor(festFair.diagram.providers.FestFairElementTypes.Volunteer_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVisit1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(festFair.diagram.part.Messages.Visit1CreationTool_title,
				festFair.diagram.part.Messages.Visit1CreationTool_desc,
				Collections.singletonList(festFair.diagram.providers.FestFairElementTypes.GuestVisit_4001));
		entry.setId("createVisit1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(festFair.diagram.providers.FestFairElementTypes
				.getImageDescriptor(festFair.diagram.providers.FestFairElementTypes.GuestVisit_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWork2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(festFair.diagram.part.Messages.Work2CreationTool_title,
				festFair.diagram.part.Messages.Work2CreationTool_desc,
				Collections.singletonList(festFair.diagram.providers.FestFairElementTypes.VolunteerWork_4002));
		entry.setId("createWork2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(festFair.diagram.providers.FestFairElementTypes
				.getImageDescriptor(festFair.diagram.providers.FestFairElementTypes.VolunteerWork_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
