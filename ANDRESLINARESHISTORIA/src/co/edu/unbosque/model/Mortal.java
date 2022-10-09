package co.edu.unbosque.model;

public class Mortal extends KublaKan{
	
	protected String nombre;

	public Mortal(int edad, double estatura, String color_ojos, boolean alma,String nombre) {
		super(edad, estatura, color_ojos, alma);
		this.nombre = nombre;
	}
	
	public String abquirirConocimiento() {
		return "Puede obtener conocimientos";
	}
	
	public String tenerFamilia() {
		return "Puede tener familia";
	}
	
	public String ejercerProfecion() {
		return"Puede ejercer una profecion";
	}
	
	

	@Override
	public String habitad() {
		return "Vive al este del planeta";
	}

	@Override
	public String sentir() {
		return "Solo puede sentir a otros mortales";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
