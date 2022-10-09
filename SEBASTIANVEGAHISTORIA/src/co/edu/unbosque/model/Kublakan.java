package co.edu.unbosque.model;

public abstract class Kublakan {
	
	protected int edad;
	protected double estatura;
	protected String colorO;
	protected String alma;
	public Kublakan(int edad, double estatura, String colorO, String alma) {

		this.edad = edad;
		this.estatura = estatura;
		this.colorO = colorO;
		this.alma = alma;
		
	}
	
	public abstract int getEdad();
	public abstract double getEstatura();
	public abstract String getColorO();
	public abstract String getAlma();
	public abstract String habitar();
	public abstract String sentir();

}
