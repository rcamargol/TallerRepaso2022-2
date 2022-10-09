package co.edu.unbosque.model;

public class Conector {
	private Seaplane seaplane;
	private Helicopter helicopter;
	private Bird bird;
	private Superman superman;
	
	public Conector() {
		seaplane = new Seaplane("Consume gasolina","\nPuede flotar");
		helicopter = new Helicopter("Tiene dos helices","\nFunciona con rotores");
		bird = new Bird();
		superman = new Superman("Tiene super fuerza");
	}

	public Seaplane getSeaplane() {
		return seaplane;
	}

	public void setSeaplane(Seaplane seaplane) {
		this.seaplane = seaplane;
	}

	public Helicopter getHelicopter() {
		return helicopter;
	}

	public void setHelicopter(Helicopter helicopter) {
		this.helicopter = helicopter;
	}

	public Bird getBird() {
		return bird;
	}

	public void setBird(Bird bird) {
		this.bird = bird;
	}

	public Superman getSuperman() {
		return superman;
	}

	public void setSuperman(Superman superman) {
		this.superman = superman;
	}
	
}
