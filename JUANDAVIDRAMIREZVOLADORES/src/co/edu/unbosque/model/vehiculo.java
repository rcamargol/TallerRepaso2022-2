package co.edu.unbosque.model;

public abstract class vehiculo {
	
	protected String comodidad;
	
	public vehiculo(){
		this.comodidad= "";
		
	}

	public abstract String movilizar();
}
