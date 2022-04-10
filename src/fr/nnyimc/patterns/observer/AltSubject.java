package fr.nnyimc.patterns.observer;

public interface AltSubject {
	public void addObserver(AltObserver observer);
	public void removeObserver(AltObserver observer);
	public void notifyAllObservers();
}
