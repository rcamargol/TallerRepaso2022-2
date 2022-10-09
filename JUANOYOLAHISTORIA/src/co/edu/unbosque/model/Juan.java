package co.edu.unbosque.model;

public class Juan extends Mortal{
	
	private String nombre;
	private String profesion;
	private int ndehijos;
	
	public Juan() {
		super();
		this.nombre = "Juan";
		this.profesion = "Campesino";
		this.ndehijos = 2;
		super.edad = 17;
		super.estatura = 1.74;
	}
	
	public String dormir() {
		return "zzZZZzZZzZZ";
	}
	public String estudiar() {
		return "'Póngame 5 profe'";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public int getNdehijos() {
		return ndehijos;
	}

	public void setNdehijos(int ndehijos) {
		this.ndehijos = ndehijos;
	}
	
}
