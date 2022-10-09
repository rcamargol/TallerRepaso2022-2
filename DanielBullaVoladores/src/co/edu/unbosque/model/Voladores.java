package co.edu.unbosque.model;

public class Voladores {

	private Bird bird;
	private Superman superman;
	private SeaPlane seaPlane;
	private Helicopter helicopter;
	
	public Voladores() {
		bird = new Bird();
		superman =  new Superman();
		seaPlane = new SeaPlane();
		helicopter = new Helicopter();
	}

	public Bird getBird() {
		return bird;
	}

	public void setBird(Bird bird) {
		this.bird = bird;
	}

	public Superman getSuperman() {
		return superman;
	}

	public void setSuperman(Superman superman) {
		this.superman = superman;
	}

	public SeaPlane getSeaPlane() {
		return seaPlane;
	}

	public void setSeaPlane(SeaPlane seaPlane) {
		this.seaPlane = seaPlane;
	}

	public Helicopter getHelicopter() {
		return helicopter;
	}

	public void setHelicopter(Helicopter helicopter) {
		this.helicopter = helicopter;
	}
	
	
}
