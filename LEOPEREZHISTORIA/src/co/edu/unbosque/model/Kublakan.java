package co.edu.unbosque.model;

public abstract class Kublakan {
	
	protected int edad;
	protected double estatura;
	protected String colorOjos;
	protected boolean alma;
	
	public Kublakan(int edad, double estatura, String colorOjos, boolean alma) {
		super();
		this.edad = edad;
		this.estatura = estatura;
		this.colorOjos = colorOjos;
		this.alma = alma;
	}
	
	public abstract String habitarRegion();
	
	public abstract String sentir();

		 
	
}
