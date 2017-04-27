package edu.iis.powp.command;

public class DrawSquareCommandFactory {
	public static ComplexCommand create(int startX, int startY, int size) {
		ComplexCommand complexCommand = new ComplexCommand();
		complexCommand.add(new CommandSetPosition(startX,startY));
		complexCommand.add(new CommandDrawLineToPosition(startX + size,startY));
		complexCommand.add(new CommandDrawLineToPosition(startX + size,startY + size));
		complexCommand.add(new CommandDrawLineToPosition(startX,startY + size));
		complexCommand.add(new CommandDrawLineToPosition(startX,startY));
		
		return complexCommand;
	}
}