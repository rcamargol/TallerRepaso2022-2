package co.edu.unbosque.model;

public class Desterrado extends KublaKan{

	protected String nombre;
	
	public Desterrado(int edad, double estatura, String color_ojos, boolean alma,String nombre) {
		super(edad, estatura, color_ojos, alma);
		this.nombre = nombre;
	}

	public String arrastrar() {
		return "Este arrantra";
	}
	
	@Override
	public String habitad() {
		return "Vive al sur del planeta";
	}

	@Override
	public String sentir() {
		return "No siente a nadie solo a el";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
