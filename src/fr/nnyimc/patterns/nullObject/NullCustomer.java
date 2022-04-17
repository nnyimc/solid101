package fr.nnyimc.patterns.nullObject;

public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		return "Customer not found...";
	}

}
