package co.edu.unbosque.model;

public class Clasificaciones {
	
	private Aves aves;
	private Helicoptero heli;
	private Hidroavion hidro;
	private Superman sup;
	
	public Clasificaciones() {
		aves = new Aves();
		heli = new Helicoptero();
		hidro = new Hidroavion();
		sup = new Superman();
		
	}

	public Aves getAves() {
		return aves;
	}

	public void setAves(Aves aves) {
		this.aves = aves;
	}

	public Helicoptero getHeli() {
		return heli;
	}

	public void setHeli(Helicoptero heli) {
		this.heli = heli;
	}

	public Hidroavion getHidro() {
		return hidro;
	}

	public void setHidro(Hidroavion hidro) {
		this.hidro = hidro;
	}

	public Superman getSup() {
		return sup;
	}

	public void setSup(Superman sup) {
		this.sup = sup;
	}
	

}
