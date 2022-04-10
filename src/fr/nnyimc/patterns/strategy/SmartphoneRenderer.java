package fr.nnyimc.patterns.strategy;

public class SmartphoneRenderer implements ImageRenderer {
	
	@Override
	public void showImage() {
		System.out.println("Showing image on a smartphone...");
	}
}
