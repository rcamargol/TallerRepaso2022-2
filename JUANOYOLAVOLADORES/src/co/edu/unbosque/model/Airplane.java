package co.edu.unbosque.model;

public abstract class Airplane extends Vehicle implements Flyer{
	
	protected int nofwings;
	
	public Airplane() {
		super();
		this.nofwings = 2;
	}

	@Override
	public abstract String takeoff(); 

	@Override
	public abstract String land();

	@Override
	public abstract String fly();

	@Override
	public abstract String turnOnEngine(); 

}
