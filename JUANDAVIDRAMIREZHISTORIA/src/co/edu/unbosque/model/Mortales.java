package co.edu.unbosque.model;

public abstract class Mortales extends KublaKan {
	protected String Liderazgo ;
	protected String cariñoso;
	
	public Mortales() {
		this.cariñoso = "";
		this.Liderazgo  = "";
	}

	
	
	public abstract String tenerunafamilia();
	public abstract String adquirirconocimientos();
	public abstract String ejercerprofesion();
}
