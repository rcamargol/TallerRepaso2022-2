package co.edu.unbosque.model;

public  abstract class Kublakan{

	protected int edad;
	protected double estatura;
	protected String colordeojos;
	protected boolean alma;
	
	public Kublakan() {
		this.edad = 0;
		this.estatura = 0.0;
		this.colordeojos = "";
		this.alma = true;
	}
	
	public abstract String habitar();
	public abstract String sentir();

}




