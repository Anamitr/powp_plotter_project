package edu.iis.powp.command;

public class DrawSquareCommandFactory {
	public static ComplexCommand create() {
		ComplexCommand complexCommand = new ComplexCommand();
		complexCommand.add(new CommandSetPosition(0,0));
		complexCommand.add(new CommandDrawLineToPosition(30,0));
		complexCommand.add(new CommandDrawLineToPosition(30,30));
		complexCommand.add(new CommandDrawLineToPosition(0,30));
		complexCommand.add(new CommandDrawLineToPosition(0,0));
		
		return complexCommand;
	}
}