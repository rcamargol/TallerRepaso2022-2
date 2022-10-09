package co.edu.unbosque.model;

public class SeaPlane extends Airplane {

	private boolean undercarriage;
	
	public SeaPlane(boolean engine) {
		super(engine);
		this.undercarriage = true;
	}
	
	public String unirMetodos() {
		return takeOff()+"\n"+land()+"\n"+fly()+"\n"+startEngine();
	}
	
	public String waterLanding(){ 
		return "Aterrizar como un barco pero volar como un pajaro";
	}

	public boolean isUndercarriage() {
		return undercarriage;
	}

	public void setUndercarriage(boolean undercarriage) {
		this.undercarriage = undercarriage;
	}
	
	
}
