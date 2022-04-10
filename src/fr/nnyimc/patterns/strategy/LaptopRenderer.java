package fr.nnyimc.patterns.strategy;

public class LaptopRenderer implements ImageRenderer {
	
	@Override
	public void showImage() {
		System.out.println("Showing image on a laptop...");
	}
}
