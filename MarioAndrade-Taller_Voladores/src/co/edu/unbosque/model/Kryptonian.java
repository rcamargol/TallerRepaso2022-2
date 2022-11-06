package co.edu.unbosque.model;

public abstract class Kryptonian extends Animal{
	
	protected String Humanoides;
	public Kryptonian(String Humanoides) {
		super();
		this.Humanoides = Humanoides;
	
	}
	public abstract String absorber_energia_solar();
}
