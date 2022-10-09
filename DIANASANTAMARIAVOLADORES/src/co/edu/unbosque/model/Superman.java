package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer {

	private String occupation;

	public Superman() {
		this.occupation = "Superheroe";
		super.numberOfPaws = 2;
	}

	@Override
	public String takeOff() {
		return "Despega con mucho impulso";
	}

	@Override
	public String land() {
		return "Aterriza con mucha fuerza";
	}

	@Override
	public String fly() {
		return "Siempre vuela con un brazo estirado hacia adelante";
	}

	@Override
	public String eat() {
		return "Le gusta la bandeja paisa";
	}

	@Override
	public String sleep() {
		return "Se acuesta a dormir a las 8pm";
	}

	public String fightingEvil() {
		return "Sus poderes le permiten luchar contra el mal";
	}

	public String leapBuilding() {
		return "No le da vertigo al saltar los edificios";
	}

	public String StopBullet() {
		return "Es inmune a las balas";
	}

	@Override
	public String seeWithXRays() {
		return "Una de sus grandes habilidades es la vision de rayos X";
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}
