package fr.nnyimc.patterns.observer;

public class SellStockObserver implements  AltObserver {

	@Override
	public void checkPrice(float price) {
		if (price >= 102.0) {
			System.out.println("Selling stock");
		}
	}

}
