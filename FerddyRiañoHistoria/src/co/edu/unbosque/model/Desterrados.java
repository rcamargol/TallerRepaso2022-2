package co.edu.unbosque.model;

public abstract class Desterrados extends KublaKan{
	
	protected String sufrimiento;
	protected String rabia;
	
	public Desterrados() {
		super.alma = false;
		this.sufrimiento = "";
		this.rabia = "";
	}
	
	@Override
	public String habitar() {
		
		return "Habitan en el extremo sur del planeta";
	}
	
	@Override
	public String sentir() {
		
		return "Solo se sienten a si mismos";
	}
	
	public abstract void arrastrar();
	public abstract void herir();
	
}
