package fr.nnyimc.patterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements AltSubject {
	
	private float price = 100;
	private Random random;
	private List<AltObserver> altObserverList;
	
	public StockExchange() {
		random = new Random();
		altObserverList = new ArrayList<>();
	}
	
	public void start() {
		int counter = 0;
		do {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			price = price + 2 * random.nextFloat() -1;
			System.out.println(price);
			notifyAllObservers();
			counter++;
		} while (counter  < 60);
	}

	@Override
	public void addObserver(AltObserver observer) {
		altObserverList.add(observer);
		
	}

	@Override
	public void removeObserver(AltObserver observer) {
		altObserverList.remove(observer);
		
	}

	@Override
	public void notifyAllObservers() {
		for (AltObserver altObserver: altObserverList) {
			altObserver.checkPrice(price);
		}
		
	}
	
}
