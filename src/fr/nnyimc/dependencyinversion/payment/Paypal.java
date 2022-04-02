package fr.nnyimc.dependencyinversion.payment;

public class Paypal implements Payment{

	@Override
	public void pay() {
		System.out.println("Paying with Paypal...");
	}

}
