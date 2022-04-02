package fr.nnyimc.interfacesgregation;

public class App {

	public static void main(String[] args) {
		
		Worker w1 = new Worker();
		w1.salary();
		
		Manager m1 = new Manager();
		m1.train();
		
		CEO ceo1 = new CEO();
		ceo1.makeDecisions();
	}

}
