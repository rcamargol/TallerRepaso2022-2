package co.edu.unbosque.model;

public abstract class Héroe extends KublaKan {

	protected int intervaloTiempo;
	protected int tiempoVuelo;
	

	public abstract String volar();
	
	public abstract String crearFuego();
	
	public abstract String detenerTiempo();
	
}
