package co.edu.unbosque.model;

public abstract class AirPlane extends Vehicle implements Flyer{
protected String piesAltura;
	
	public AirPlane() {
		super.marca = "";
		this.piesAltura="";
	}
	public String transportar() {
		return "";
	}
	
}
