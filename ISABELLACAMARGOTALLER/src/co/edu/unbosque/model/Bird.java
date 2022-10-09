package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {

	public boolean puedeVolar;
	public String nombre;

	public Bird() {
		super();

	}

	@Override
	public void takeOff() {

	}

	@Override
	public void land() {

	}

	@Override
	public String fly() {
		return String.valueOf(this.puedeVolar);
	}

	public void buildNest() {

	}

	public void layEggs() {

	}

	public String eat() {
		return this.comida;
	}

}
