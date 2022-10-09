package co.edu.unbosque.model;

public class Aereos {
	private Bird b;
	private Helicopter h;
	private SeaPlane s;
	private Superman sm;

	
	public Aereos() {
		b = new Bird();
		h = new Helicopter();
		s = new SeaPlane();
		sm = new Superman();
	}


	public Bird getB() {
		return b;
	}


	public void setB(Bird b) {
		this.b = b;
	}


	public Helicopter getH() {
		return h;
	}


	public void setH(Helicopter h) {
		this.h = h;
	}


	public SeaPlane getS() {
		return s;
	}


	public void setS(SeaPlane s) {
		this.s = s;
	}


	public Superman getSm() {
		return sm;
	}


	public void setSm(Superman sm) {
		this.sm = sm;
	}

}
