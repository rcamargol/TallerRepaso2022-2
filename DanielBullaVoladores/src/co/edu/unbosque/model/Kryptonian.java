package co.edu.unbosque.model;

public abstract class Kryptonian extends Animal{

	protected String absorberEnergia;
	
	public Kryptonian() {
		super.aniosDeVida = 2000000;
		this.absorberEnergia = "Energia solar";
	}
	
	public abstract String correrVelozmente();

}

