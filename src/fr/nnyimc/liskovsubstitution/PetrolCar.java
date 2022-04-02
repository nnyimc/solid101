package fr.nnyimc.liskovsubstitution;

public class PetrolCar extends Vehicle {

	public PetrolCar(String type, int age) {
		super(type, age);
	}
	
	@Override
	protected void speedUp() {
		System.out.println("Petrol car is speeding up...");
	}
	
	@Override
	protected void slowDown() {
		System.out.println("Petrol car is slowing down...");
	} 
	
	@Override
	protected void fuel() {
		System.out.println("Petrol car is being refueled...");
	}

}
