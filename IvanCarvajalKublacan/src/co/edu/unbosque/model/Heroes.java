package co.edu.unbosque.model;

public abstract class Heroes extends Kublacan{

	protected String Valentia;
	protected String Honestidad;
	
	public Heroes() {
		super.Nombre = "";
		super.Edad = 0;
		super.Estatura = "";
		super.Colorojos = "";
		super.Alma = "";
		Valentia = "";
		Honestidad = "";
	}
	public abstract String volar(); 
	public abstract String crearFuego();
	public abstract String detenerTiempo();

}
