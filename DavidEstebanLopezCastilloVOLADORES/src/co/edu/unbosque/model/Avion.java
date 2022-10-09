package co.edu.unbosque.model;

public abstract class Avion extends Vehiculo implements Volador{

	protected int tiempoVueloMax;
	
	public abstract String analizarTiempoVuelo();
}
