package co.edu.unbosque.model;

public class Voladores {

	private SeaPlane sp;
	private Helicopter h;
	private Bird b;
	private Superman s;
	
	public Voladores() {
		sp = new SeaPlane(true);
		h = new Helicopter(true);
		b = new Bird();
		s = new Superman(null);
	}

	public SeaPlane getSp() {
		return sp;
	}

	public void setSp(SeaPlane sp) {
		this.sp = sp;
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

	public Superman getS() {
		return s;
	}

	public void setS(Superman s) {
		this.s = s;
	}
	
}
