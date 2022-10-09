package co.edu.unbosque.model;

public class Voladores {
	
	private Bird b;
	private Helicopter h;
	private SeaPlane s;
	private Superman sp;

	
	public Voladores() {
		b = new Bird();
		h = new Helicopter();
		s = new SeaPlane();
		sp = new Superman();
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


	public Superman getSp() {
		return sp;
	}


	public void setSp(Superman sp) {
		this.sp = sp;
	}
}