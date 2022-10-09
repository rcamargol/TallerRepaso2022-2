package co.edu.unbosque.model;

public abstract class Vehicle {
	
	protected String ruedas;
	
	public Vehicle(String ruedas) {
		super();
		this.ruedas = ruedas;
	}
	
	public abstract String derrapar();

}
