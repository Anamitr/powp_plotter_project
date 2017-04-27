package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.command.CommandSetPosition;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;


/**
 * Plotter adapter to drawer with several bugs. 
 */
public class LineAdapter implements IPlotter
{ 
	private int startX = 0, startY = 0;
	private DrawPanelController controller;
	
	public LineAdapter(DrawPanelController controller) {
		super();
		this.controller = controller;
	}
    
	@Override
    public void setPosition(int x, int y)
    {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y)
    {
        ILine line = LineFactory.getBasicLine();
    	line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);        
        
        controller.drawLine(line);
        
//        CommandSetPosition commandSetPosition = new CommandSetPosition(x, y);
//        commandSetPosition.execute(this);
		setPosition(x,y);
    }

    @Override
    public String toString()
    {
        return "LineAdapter";
    }
}

//3.2.2 Przetestowane - rysuje w odpowiednim oknie koperte