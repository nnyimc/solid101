package fr.nnyimc.patterns.strategy;

public class App {

	public static void main(String[] args) {
		ImageManager manager = new ImageManager();
		manager.setRenderer(new LaptopRenderer());
		manager.show();
		
		ImageManagerStrategy managerUpdated = new ImageManagerStrategy();
		managerUpdated.setRenderer(new LaptopRenderer());
		managerUpdated.show();
	}

}
