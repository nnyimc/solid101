package fr.nnyimc.dependencyinversion.payment;

public class Skrill implements Payment {

	@Override
	public void pay() {
		System.out.println("Paying with Skrill...");
		
	}

}
