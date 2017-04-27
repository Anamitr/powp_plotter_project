package edu.iis.powp.command;

import java.util.ArrayList;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand extends ArrayList<PlotterCommand> {
	private static final long serialVersionUID = 1L;

	public void executeAll(IPlotter iplotter) {
		for(PlotterCommand plotterCommand : this) {
			plotterCommand.execute(iplotter);
		}
	}
	
	public void executeNr(IPlotter iplotter, int i) {
		try {
			this.get(i).execute(iplotter);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}		
	}
}
