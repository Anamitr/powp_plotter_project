package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.Context;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;


/**
 * Plotter adapter to drawer with several bugs. 
 */
public class LinePlotterAdapter implements IPlotter
{ 
	private int startX = 0, startY = 0;
	private DrawPanelController controller;
	private ILine line;
    
	public LinePlotterAdapter(DrawPanelController controller, ILine iLine) {
		super();
		this.controller = controller;
		this.line = iLine;
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
    	line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);        
        
        controller.drawLine(line);		
		setPosition(x,y);
    }

    @Override
    public String toString()
    {
        return "LinePlotterAdapter";
    }
}

//3.2.2 Przetestowane - rysuje w odpowiednim oknie koperte