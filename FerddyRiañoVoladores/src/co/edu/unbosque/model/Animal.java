package co.edu.unbosque.model;

public abstract class Animal {
	
	protected int anosDeVida;
	
	public Animal() {
		this.anosDeVida = 0;
	}
	
	public abstract String toEat();

}
