package fr.nnyimc.patterns.strategy;

public class TVRenderer implements ImageRenderer {
	
	@Override
	public void showImage() {
		System.out.println("Showing image on a TV screen...");
	}
}
