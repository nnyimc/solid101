package fr.nnyimc.patterns.iterator;

public class NameRepository {
	
	private String[] names = {"Linda", "Kenneth", "Margaret", "Leon", "Yukimi", "Charles"};
	
	public Iterator getIterator() {
		return new NameIterator(names);
	}
}
