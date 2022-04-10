package fr.nnyimc.patterns.observer;

public interface Subject {
	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyAllObservers();
}
