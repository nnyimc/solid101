package fr.nnyimc.patterns.template;

public class FootballGame extends Game {

	@Override
	protected void initializeGame() {
		System.out.println("initializing football game...");
		
	}

	@Override
	protected void playing() {
		System.out.println("playing football game...");
		
	}

	@Override
	protected void showResults() {
		System.out.println("showing game results...");
		
	}

}
