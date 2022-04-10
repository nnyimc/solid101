package fr.nnyimc.patterns.observer;

public class BuyStockObserver implements AltObserver{

	@Override
	public void checkPrice(float price) {
		if (price < 98.0) {
			System.out.println("Buy stock");
		}
	}

}
