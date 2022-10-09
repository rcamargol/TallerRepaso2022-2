package co.edu.unbosque.model;

public abstract class Airplane extends Vehicle implements Flyer{
	
	protected double longitudAlas;
	
	public Airplane() {
		super.combustible = "Petroleo";
		this.longitudAlas = 0.0;
	}

	@Override
	public String toTakeOff() {
		
		return "Despegan lentamente";
	}

	@Override
	public String toLand() {
	
		return "Cuando aterrizan todos se enteran";
	}

	@Override
	public String toFly() {
		
		return "Hacen mucho ruido volando";
	}
}
