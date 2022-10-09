package co.edu.unbosque.Model;

public class Voladores {

	private Superman Superman;
	private Pajaro Pajaro;
	private Helicoptero Helicoptero;
	private Hidroavion Hidroavion;
	
	public Voladores() {
		Superman = new Superman();
		Pajaro = new Pajaro();
		Helicoptero = new Helicoptero();
		Hidroavion = new Hidroavion();
	}

	public Superman getSuperman() {
		return Superman;
	}

	public void setSuperman(Superman superman) {
		Superman = superman;
	}

	public Pajaro getPajaro() {
		return Pajaro;
	}

	public void setPajaro(Pajaro pajaro) {
		Pajaro = pajaro;
	}

	public Helicoptero getHelicoptero() {
		return Helicoptero;
	}

	public void setHelicoptero(Helicoptero helicoptero) {
		Helicoptero = helicoptero;
	}

	public Hidroavion getHidroavion() {
		return Hidroavion;
	}

	public void setHidroavion(Hidroavion hidroavion) {
		Hidroavion = hidroavion;
	}




	
	

}
