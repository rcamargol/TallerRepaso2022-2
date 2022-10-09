package co.edu.unbosque.model;

public abstract class Airplane extends Vehicle{
	
	protected String alas;
	
	public Airplane(String ruedas, String alas) {
	    super(ruedas);	
		this.alas = alas;
	}
	public abstract String despegue();
	public abstract String aterrizar();
	public abstract String volar();
}

