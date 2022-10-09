package co.edu.unbosque.model;

public abstract class Heroe extends Kublakan{
	
	public Heroe(int edad, double estatura, String color_ojos, boolean alma) {
		super(edad, estatura, color_ojos, alma);
	}
	public abstract String volar();
	public abstract String crearFuego();
	public abstract String detenerTiempo();
	
}
