package co.edu.unbosque.model;

public abstract class Avion extends Vehiculo implements Volador{
	
	protected String categoria;
	
	public abstract String activarTrenDeAterrizaje();
}
