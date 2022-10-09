package co.edu.unbosque.model;

public class ControlTower {
	private Superman s;
	private Helicopter h;
	private Bird b;
	private SeaPlane sp;

	public ControlTower() {
		this.s = new Superman();
		this.h = new Helicopter();
		this.b = new Bird();
		this.sp = new SeaPlane();
	}

	public Superman getS() {
		return s;
	}

	public void setS(Superman s) {
		this.s = s;
	}

	public Helicopter getH() {
		return h;
	}

	public void setH(Helicopter h) {
		this.h = h;
	}

	public Bird getB() {
		return b;
	}

	public void setB(Bird b) {
		this.b = b;
	}

	public SeaPlane getSp() {
		return sp;
	}

	public void setSp(SeaPlane sp) {
		this.sp = sp;
	}

}
