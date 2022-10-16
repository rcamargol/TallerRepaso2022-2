package co.edu.unbosque.model;

public abstract class Heroe extends KublaKan {

	protected int intervaloTiempo;
	protected int tiempoVuelo;
	

	public abstract String volar();
	
	public abstract String crearFuego();
	
	public abstract String detenerTiempo();
	
}
