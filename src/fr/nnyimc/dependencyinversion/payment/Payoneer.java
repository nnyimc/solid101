package fr.nnyimc.dependencyinversion.payment;

public class Payoneer implements Payment {

	@Override
	public void pay() {
		System.out.println("Pying with Payoneer...");
	}

}
