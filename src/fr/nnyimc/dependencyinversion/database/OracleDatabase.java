package fr.nnyimc.dependencyinversion.database;

public class OracleDatabase implements Database {
	@Override
	public void connect() {
		System.out.println("Connecting to the database...");
	}
	
	@Override
	public void disconnect() {
		System.out.println("Disconnecting from the database...");
	}
}
