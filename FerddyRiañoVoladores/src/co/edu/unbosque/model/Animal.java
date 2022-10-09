package co.edu.unbosque.model;

public abstract class Animal {
	
	protected int añosDeVida;
	
	public Animal() {
		this.añosDeVida = 0;
	}
	
	public abstract String toEat();

}
