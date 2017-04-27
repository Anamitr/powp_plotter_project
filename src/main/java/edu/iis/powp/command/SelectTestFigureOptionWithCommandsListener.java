package edu.iis.powp.command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionWithCommandsListener implements ActionListener {
	ComplexCommand complexCommand;

	public SelectTestFigureOptionWithCommandsListener(ComplexCommand complexCommand) {
		super();
		this.complexCommand = complexCommand;
	}
	
	@Override
    public void actionPerformed(ActionEvent e)
    {
		complexCommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
