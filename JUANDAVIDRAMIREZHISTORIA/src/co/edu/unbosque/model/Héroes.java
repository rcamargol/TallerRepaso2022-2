package co.edu.unbosque.model;

public abstract class H�roes extends KublaKan {
	protected String Liderazgo ;
	protected String Sabiduria;
	
	public H�roes() {
		this.Sabiduria = "";
		this.Liderazgo  = "";
	}

	
	
	
	public abstract String crearFuego();
	public abstract String detenerTiempo();
	public abstract String volar();

	
}
