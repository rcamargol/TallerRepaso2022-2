package co.edu.unbosque.model;

public abstract class Heroes extends KublaKan{
	
	protected String valentia;
	protected String honestidad;
	
	public Heroes() {
		super.estatura = 3;
		this.valentia = "";
		this.honestidad = "";
	}
	
	@Override
	public String habitar() {
		
		return "Habitan al norte del planeta";
	}
	
	@Override
	public String sentir() {
		
		return "Se sienten a si mismos y a seres de otros mundos";
	}
	
	public abstract void volar();
	public abstract void crearFuego();
	public abstract void detenerTiempo();

}
