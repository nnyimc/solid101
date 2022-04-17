package fr.nnyimc.patterns.nullObject;

public class App {

	public static void main(String[] args) {
		
		CustomerFactory customerFactory = new CustomerFactory();
		String requestedName = customerFactory.getCustomer("Nicole").getName();
		System.out.println(requestedName);
		
		requestedName = customerFactory.getCustomer("Droxine").getName();
		System.out.println(requestedName);
	}

}
