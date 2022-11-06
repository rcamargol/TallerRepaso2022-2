package co.edu.unbosque.model;

public abstract class Animal {
	
	protected int anosdevida;
	
	public Animal() {
		this.anosdevida = 0;
	}
	
	public abstract String toEat();

}
