package fr.nnyimc.patterns.template;

public abstract class Game {
	
	protected abstract void initializeGame();
	protected abstract void playing();
	protected abstract void showResults();
	
	public final void launch() {
		initializeGame();
		playing();
		showResults();
	}
}
