package fr.nnyimc.patterns.nullObject;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private List<String> customerNames;
	
	public Database() {
		this.customerNames = new ArrayList<>();
		this.customerNames.add("Paula");
		this.customerNames.add("Droxine");
		this.customerNames.add("Tiberius");
		this.customerNames.add("Lyle");
	}
	
	public boolean isRegistered(String name) {
		boolean check = false;
		
		for (String registeredName: customerNames) {
			if ( registeredName.equals(name)) {
				check = true;
			}
		}
		
		return check;
	}
}
