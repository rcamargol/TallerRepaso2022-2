package co.edu.unbosque.model;

public abstract class Vehicle {

	protected String gasolina;
	
	public Vehicle() {
		this.gasolina = "";
	}
	
	public abstract String movilizarCargamento();
}
