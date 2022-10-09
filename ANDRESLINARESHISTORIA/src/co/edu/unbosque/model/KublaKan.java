package co.edu.unbosque.model;

public abstract class KublaKan {

	protected int edad;
	protected double estatura;
	protected String color_ojos;
	protected boolean alma;
	
	public KublaKan(int edad, double estatura, String color_ojos, boolean alma) {
		this.edad = edad;
		this.estatura = estatura;
		this.color_ojos = color_ojos;
		this.alma = alma;
	}
	
	public abstract String habitad();
	
	public abstract String sentir();
	
}
