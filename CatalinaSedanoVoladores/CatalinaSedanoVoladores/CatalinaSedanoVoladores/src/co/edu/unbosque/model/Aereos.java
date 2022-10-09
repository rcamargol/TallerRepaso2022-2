package co.edu.unbosque.model;

public class Aereos {
	
	private Bird br;
	private Helicopter hel;
	private SeaPlane sp;
	private Superman sman;
	

	public Aereos() {
	br = new Bird ();
	hel = new Helicopter();
	sp = new SeaPlane();
	sman = new Superman();
	
	}


	public Bird getBr() {
		return br;
	}


	public void setBr(Bird br) {
		this.br = br;
	}


	public Helicopter getHel() {
		return hel;
	}


	public void setHel(Helicopter hel) {
		this.hel = hel;
	}


	public SeaPlane getSp() {
		return sp;
	}


	public void setSp(SeaPlane sp) {
		this.sp = sp;
	}


	public Superman getSman() {
		return sman;
	}


	public void setSman(Superman sman) {
		this.sman = sman;
	}
	
	
}
