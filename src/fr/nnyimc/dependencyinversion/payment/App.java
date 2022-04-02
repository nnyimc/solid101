package fr.nnyimc.dependencyinversion.payment;

public class App {
	public static void main(String...args) {
		PaymentController paymentController = new PaymentController(new Paypal());
		paymentController.pay();
	}
}
