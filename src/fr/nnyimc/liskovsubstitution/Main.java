package fr.nnyimc.liskovsubstitution;

public class Main {

	public static void main(String[] args) {
		Vehicle v = new PetrolCar("Ford", 14);
		v.speedUp();
		v.slowDown();
		v.fuel();
		
		Vehicle t = new ElectricCar("Tesla", 0);
		t.speedUp();
		t.slowDown();
		t.fuel();

	}

}
