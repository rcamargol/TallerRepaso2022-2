package co.edu.unbosque.model;

public class MundoVolador {
	
	private Helicoptero heli;
	private Hidroavion h;
	private Pajaro p;
	private Superman s;
	
	public MundoVolador() {
		
		heli = new Helicoptero();
		h = new Hidroavion();
		p = new Pajaro();
		s = new Superman();
	}

	public Helicoptero getHeli() {
		return heli;
	}

	public void setHeli(Helicoptero heli) {
		this.heli = heli;
	}

	public Hidroavion getH() {
		return h;
	}

	public void setH(Hidroavion h) {
		this.h = h;
	}

	public Pajaro getP() {
		return p;
	}

	public void setP(Pajaro p) {
		this.p = p;
	}

	public Superman getS() {
		return s;
	}

	public void setS(Superman s) {
		this.s = s;
	}
}
