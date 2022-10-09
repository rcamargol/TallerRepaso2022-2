package co.edu.unbosque.model;

public abstract class Mortales extends Kublacan {
 
	protected String Costumbres;
	protected String Comportamiento;
	
	public Mortales() {
		super();
		super.Alma= "";
		super.Colorojos = "";
		super.Edad = 0;
		super.Estatura = "";
		super.Nombre = "";
		Costumbres = "";
		Comportamiento = "";
	}
	public abstract String adquirirConocimiento();
	public abstract String ejercerProfecion();
}
