package co.edu.unbosque.model;

public abstract class Animal {
	
	protected int aniosDeVida;
	
	public Animal() {
		this.aniosDeVida = 0;
	}

	public abstract String toEat();
}
