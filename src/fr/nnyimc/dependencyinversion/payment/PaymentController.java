package fr.nnyimc.dependencyinversion.payment;

public class PaymentController {
	private Payment payment;
	
	public PaymentController(Payment payment) {
		this.payment = payment;
	}
	
	public void pay() {
		this.payment.pay();
	}
}
