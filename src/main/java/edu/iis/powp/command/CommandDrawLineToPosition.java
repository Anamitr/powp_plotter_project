package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class CommandDrawLineToPosition implements PlotterCommand {
	private int x, y;
	
	public CommandDrawLineToPosition(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void execute(IPlotter iplotter) {
		iplotter.drawTo(x, y);
	}
}
