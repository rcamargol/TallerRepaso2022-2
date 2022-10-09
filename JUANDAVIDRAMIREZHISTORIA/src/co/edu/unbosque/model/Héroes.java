package co.edu.unbosque.model;

public abstract class Héroes extends KublaKan {
	protected String Liderazgo ;
	protected String Sabiduria;
	
	public Héroes() {
		this.Sabiduria = "";
		this.Liderazgo  = "";
	}

	
	
	
	public abstract String crearFuego();
	public abstract String detenerTiempo();
	public abstract String volar();

	
}
