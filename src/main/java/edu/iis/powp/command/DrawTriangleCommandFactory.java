package edu.iis.powp.command;

public class DrawTriangleCommandFactory {
	public static ComplexCommand create() {
		ComplexCommand complexCommand = new ComplexCommand();
		complexCommand.add(new CommandSetPosition(0,0));
		complexCommand.add(new CommandDrawLineToPosition(100, 100));
		complexCommand.add(new CommandDrawLineToPosition(-100, 100));
		complexCommand.add(new CommandDrawLineToPosition(0, 0));
		
		return complexCommand;
	}
}
