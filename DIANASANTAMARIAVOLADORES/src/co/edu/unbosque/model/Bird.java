package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {

	private String featherColor;

	public Bird() {
		super();
		this.featherColor = "Amarillo";
		super.numberOfPaws = 2;
	}

	@Override
	public String takeOff() {
		return "Necesita tomar impulso para despegar";
	}

	@Override
	public String land() {
		return "Planea muy bien su aterrizaje";
	}

	@Override
	public String fly() {
		return "Puede volar tan alto y rapido como quiera";
	}

	@Override
	public String eat() {
		return "Generalmente come lombrices";
	}

	@Override
	public String sleep() {
		return "Duerme arrunchado con sus crias";
	}

	public String buildNest() {
		return "Construye su nido con ramas y saliva";
	}

	public String layEggs() {
		return "Ponen sus huevos y los incuban";
	}

	public String getFeatherColor() {
		return featherColor;
	}

	public void setFeatherColor(String featherColor) {
		this.featherColor = featherColor;
	}

}
