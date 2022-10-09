package co.edu.unbosque.model;

public class Mundovolador {
	
	private Superman su;
	private Helicopter he;
	private SeaPlane sea;
	private Bird bi;
	
	public Mundovolador() {
		su = new Superman(null, null);
		he = new Helicopter(null, 0);
		sea = new SeaPlane(null, 0);
		bi = new Bird();
		
		
	}

	public Superman getSu() {
		return su;
	}

	public void setSu(Superman su) {
		this.su = su;
	}

	public Helicopter getHe() {
		return he;
	}

	public void setHe(Helicopter he) {
		this.he = he;
	}

	public SeaPlane getSea() {
		return sea;
	}

	public void setSea(SeaPlane sea) {
		this.sea = sea;
	}

	public Bird getBi() {
		return bi;
	}

	public void setBi(Bird bi) {
		this.bi = bi;
	}
	
	

}
