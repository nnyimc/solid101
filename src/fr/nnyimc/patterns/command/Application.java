package fr.nnyimc.patterns.command;

public class Application {

	public static void main(String[] args) {
		Switch muralSwitch = new Switch();
		Light light = new Light();
		TurnOnCommand turnOnCommand = new TurnOnCommand(light);
		TurnOffCommand turnOffCommand = new TurnOffCommand(light);
		
		muralSwitch.addCommand(turnOnCommand);
		muralSwitch.addCommand(turnOffCommand);
		muralSwitch.executeCommands();
	}

}
