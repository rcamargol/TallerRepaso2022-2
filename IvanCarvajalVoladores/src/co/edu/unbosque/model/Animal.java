package co.edu.unbosque.model;

public abstract class Animal {
	
	protected String camina;
	
	public Animal() {
		camina = "";
	}
	
	public abstract String comer();
}
