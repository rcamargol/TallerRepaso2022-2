package co.edu.unbosque.model;

public class Helicopter extends Airplane{

	private boolean propellers;
	
	public Helicopter(boolean engine) {
		super(engine);
		this.propellers = true;
	}

	public String unirMetodos() {
		return takeOff()+"\n"+land()+"\n"+fly()+"\n"+startEngine();
	}
	
	public String helipadLanding() {
		return "Aterizar en un helipuerto es llegar como un rico";
	}

	public boolean isPropellers() {
		return propellers;
	}

	public void setPropellers(boolean propellers) {
		this.propellers = propellers;
	}
	
	
	
}
