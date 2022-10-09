package co.edu.unbosque.model;

public abstract class Heroe extends KublaKan {

	protected float velocidadDeVuelo;
	protected float tiempoConFuego; // cuanto tiempo puede durar con el fuego

	public Heroe() {
		this.velocidadDeVuelo = 0;
		this.tiempoConFuego = 0;
	}

	abstract String luchar();

	abstract String defender();

	abstract String volar();

	abstract String crearFuego();

	abstract String detenerElTiempo();
}
