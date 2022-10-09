package co.edu.unbosque.model;

public abstract class Animal {
	
	protected int añosdevida;
	
	public Animal() {
		this.añosdevida = 0;
	}
	
	public abstract String toEat();

}
