package co.edu.unbosque.model;

public abstract class Kublacan{
	
	protected String Nombre;
	protected int Edad;
	protected String Estatura;
	protected String Colorojos;
	protected String Alma;
	public Kublacan() {
		Nombre = "";
		Edad = 0;
		Estatura = "";
		Colorojos = "";
		Alma = "";
	}
	public abstract String habitar();
	
	public abstract String sentir();
}
