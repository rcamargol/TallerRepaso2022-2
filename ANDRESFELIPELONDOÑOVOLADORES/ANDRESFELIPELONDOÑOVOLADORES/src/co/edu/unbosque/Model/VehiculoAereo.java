package co.edu.unbosque.Model;

public abstract class VehiculoAereo extends Vehiculo{

	String color = "";
	
	public VehiculoAereo() {
		super.motor = true;
		
	}
	
	
	public abstract String encender();
	public abstract String aterrizar();
	public abstract String despegar();
	public abstract String volar();
	

}