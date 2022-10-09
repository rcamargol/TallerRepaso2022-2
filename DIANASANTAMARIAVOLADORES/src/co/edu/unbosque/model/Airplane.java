package co.edu.unbosque.model;

public abstract class Airplane extends Vehicle implements Flyer {

	protected double flightHeight;

	public abstract String turnOnEngine();

	public abstract String turnOffEngine();
}
