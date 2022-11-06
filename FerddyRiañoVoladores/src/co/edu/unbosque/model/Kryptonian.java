package co.edu.unbosque.model;

public abstract class Kryptonian extends Animal{
	
	protected String ropa;
	
	public Kryptonian() {
		super.anosDeVida = 500000;
		this.ropa = "Resistente";
	}
	
	public abstract String viajarInterestelarmente();

}
