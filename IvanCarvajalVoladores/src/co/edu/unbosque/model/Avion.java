package co.edu.unbosque.model;

public abstract class Avion extends Vehiculo implements Voladores{

	protected String peso;
	
	public Avion() {
		peso = "";
		super.frenos= "";
	}
	
	public abstract String motor();
}
