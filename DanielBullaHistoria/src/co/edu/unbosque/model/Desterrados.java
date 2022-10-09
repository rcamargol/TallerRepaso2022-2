package co.edu.unbosque.model;

public abstract class Desterrados extends KublaKan {

	protected String odio;
	protected String resignacion;
	
	public Desterrados() {
		super.alma = false;
		this.odio = "";
		this.resignacion = "";
	}
	
	@Override
	public String sentir() {
		
		return " se pueden sentir a si mismos";
				
	}
	
	@Override
	public String habitar() {
		
		return " viven al extremo sur de Cynus X1";
	}
	
	public abstract String arrastrar();
	public abstract String herir();
	
}
