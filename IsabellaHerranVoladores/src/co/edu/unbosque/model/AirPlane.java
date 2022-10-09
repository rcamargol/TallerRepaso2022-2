package co.edu.unbosque.model;

public abstract class AirPlane extends Vehicle implements Flyer{
	
	protected double longitudalas;
	
	public AirPlane() {
		super.combustible = "Petroleo";
		this.longitudalas = 0.0;
	}

	@Override
	public String toTakeOff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toLand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toFly() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}