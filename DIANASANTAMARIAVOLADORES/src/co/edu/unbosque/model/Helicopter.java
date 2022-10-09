package co.edu.unbosque.model;

public class Helicopter extends Airplane {

	private int numberOfHelixes;

	public Helicopter() {
		this.numberOfHelixes = 2;
		super.flightHeight = 30000;
	}

	@Override
	public String takeOff() {
		return "Prepara los motores para despegar";
	}

	@Override
	public String land() {
		return "Debe tener un amplio espacio para aterrizar";
	}

	@Override
	public String fly() {
		return "Necesita un gran piloto para poder volar seguro";
	}

	@Override
	public String turnOnEngine() {
		return "Encender los motores es primordial para iniciar el vuelo";
	}

	@Override
	public String turnOffEngine() {
		return "Se apagan los motores cuando ya no se va a usar";
	}

	@Override
	public String transport() {
		return "Puede transportar una peque�a cantidad de personas";
	}

	public String flyVertically() {
		return "Puede moverse hacia arriba y abajo solamente";
	}

	public int getNumberOfHelixes() {
		return numberOfHelixes;
	}

	public void setNumberOfHelixes(int numberOfHelixes) {
		this.numberOfHelixes = numberOfHelixes;
	}

}
