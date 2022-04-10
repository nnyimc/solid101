package fr.nnyimc.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
	
	private int pressure;
	private int temperature;
	private int humidity;
	private List<Observer> observerList;
	
	public WeatherStation() {
		this.observerList = new ArrayList<>();
	}
	
	

	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyAllObservers();
	}



	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyAllObservers();
	}



	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifyAllObservers();
	}



	@Override
	public void addObserver(Observer observer) {
		this.observerList.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notifyAllObservers() {
		for (Observer observer : observerList) {
			observer.update(pressure, temperature, humidity);
		}
		
	}

}
