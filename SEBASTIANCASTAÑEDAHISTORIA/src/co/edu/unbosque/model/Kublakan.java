package co.edu.unbosque.model;

public abstract class Kublakan {
	protected int edad;
	protected double estatura;
	protected String color_ojos;
	protected boolean alma;
	
	public Kublakan(int edad, double estatura, String color_ojos, boolean alma) {
		this.edad = edad;
		this.estatura = estatura;
		this.color_ojos = color_ojos;
		this.alma = alma;
	}
	public abstract String habitar();
	public abstract String sentir();
}
