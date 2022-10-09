package co.edu.unbosque.model;

public abstract class Vehicle {
	
	protected String combustible;
	
	public Vehicle() {
		this.combustible = "";
	}
	
	public abstract String movilizarObjetos();

}
