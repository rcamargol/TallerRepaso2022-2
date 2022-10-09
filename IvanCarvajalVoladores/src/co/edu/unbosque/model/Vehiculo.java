package co.edu.unbosque.model;

public abstract class Vehiculo {

	protected String frenos;
	
	public Vehiculo() {
		frenos = "";
	}
	
	public abstract String transladar();
}
