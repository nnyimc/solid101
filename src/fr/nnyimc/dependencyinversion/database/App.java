package fr.nnyimc.dependencyinversion.database;

public class App {

	public static void main(String[] args) {
		DatabaseController databaseController = new DatabaseController(new OracleDatabase());
		databaseController.connect();
		databaseController.disconnect();
	}

}
