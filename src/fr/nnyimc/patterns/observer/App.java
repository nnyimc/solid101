package fr.nnyimc.patterns.observer;

public class App {

	public static void main(String[] args) {

		WeatherStation weatherStation = new WeatherStation();
		WeatherObserver weatherObserver = new WeatherObserver(weatherStation);
		
		weatherStation.setHumidity(210);
		weatherStation.setPressure(1200);
		weatherStation.setTemperature(60);
		
		weatherObserver.showData();
		
		StockExchange stockExchange = new StockExchange();
		stockExchange.addObserver(new BuyStockObserver());
		stockExchange.addObserver(new SellStockObserver());
		stockExchange.start();
	}

}
