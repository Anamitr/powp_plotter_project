package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements PlotterCommand {
	private int x, y;
	
	public CommandSetPosition(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void execute(IPlotter iplotter) {
		iplotter.setPosition(x, y);
	}
}
