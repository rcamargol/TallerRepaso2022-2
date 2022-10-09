package co.edu.unbosque.model;

public class Heroe extends KublaKan {
	
	protected String nombre;

	public Heroe(int edad, double estatura, String color_ojos, boolean alma,String nombre) {
		super(edad, estatura, color_ojos, alma);
		this.nombre = nombre;
	}
	
	public String volar() {
		return "Puede volar";
	}
	
	public String crearFuego() {
		return "Puede crear fuego";
	}
	
	public String detenerTiempo() {
		return "Puede detener el tiempo";
	}

	@Override
	public String habitad() {
		return "Viven al norte";
	}

	@Override
	public String sentir() {
		return "Pueden senitr a otros seres del mundo y a si mismos";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
