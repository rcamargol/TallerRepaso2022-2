package co.edu.unbosque.model;

public abstract class KublaKan {
	
	protected int edad;
	protected double estatura;
	protected String colordeojos;
	protected boolean alma;
	
	public KublaKan() {
		this.edad = 0;
		this.estatura = 0.0;
		this.colordeojos = "";
		this.alma = true;
	}
	
	public abstract String habitar();
	public abstract String sentir();

}
