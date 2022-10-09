package co.edu.unbosque.model;

public abstract class AirPlane extends Vehicle implements Flyer{
	protected boolean aleron;
	
	public abstract String encenderPropulsores();
}
