package co.edu.unbosque.model;

public abstract class Heroes extends KublaKan {

	protected String nobleza;
	protected String liderazgo;
	
	public Heroes() {
		super.estatura = 3;
		this.nobleza = "";
		this.liderazgo = "";
	}
	
	@Override
	public String sentir() {
		
		return " se pueden sentir a si mismos, "
				+ "ademas de tambien porder sentir a otros seres de otros mundos.";
	}
	
	@Override
	public String habitar() {
		
		return " viven al norte de Cynus X1";
	}
	
	public abstract String crearFuego();
	public abstract String detenerTiempo();
	public abstract String volar();
	
}
