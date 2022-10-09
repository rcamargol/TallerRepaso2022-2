package co.edu.unbosque.model;

public class Heroe extends KublaKan {

	public Heroe(int edad, double estatura, String colorOjos, boolean alma) {
		super(edad, estatura, colorOjos, alma);
		// TODO Auto-generated constructor stub
	}
	
	protected boolean volar() {
		return true;
	}
	
	protected boolean crearFuego() {
		return true;
	}
	
	protected boolean detenerTiempo() {
		return true;
	}

}
