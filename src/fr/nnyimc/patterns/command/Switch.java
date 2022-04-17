package fr.nnyimc.patterns.command;

import java.util.ArrayList;
import java.util.List;

// Invoker
public class Switch {
	
	public List<Command> commands;
	
	public Switch () {
		this.commands = new ArrayList<>();
	}
	
	public void addCommand( Command command) {
		this.commands.add(command);
	}
	
	public void executeCommands() {
		for (Command command: commands) {
			command.execute();
		}
	}
}
