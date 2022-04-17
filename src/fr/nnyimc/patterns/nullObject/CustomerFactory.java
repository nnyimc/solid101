package fr.nnyimc.patterns.nullObject;

public class CustomerFactory {
	
	private Database database;
	public CustomerFactory() {
		this.database = new Database();
	}
	
	public AbstractCustomer getCustomer(String name) {
		if ( check(name) ) {
			return new RealCustomer(name);
		}
		
		return new NullCustomer();
	}

	private boolean check(String name) {
		
		if (database.isRegistered(name)) {
			return true;
		}
		
		return false;
	}
	
	
}
