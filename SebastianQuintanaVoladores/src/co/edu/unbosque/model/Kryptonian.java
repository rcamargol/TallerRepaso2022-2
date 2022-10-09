package co.edu.unbosque.model;

public abstract class Kryptonian extends Animal {
protected String puntoDebil;
	
	public Kryptonian() {
		super.fuerza = "";
		this.puntoDebil = "kriptonita";
	}
	
	public abstract String lanzarLaser();

}
