package co.edu.unbosque.model;

public class Helicopter extends AirPlane {
	private int numHelices;
	
	public Helicopter() {
		super.numWheels = 3;
		this.numHelices = 2;
	}

	@Override
	public String takeOff() {
		return "Puedo despegar dejando mucho ruido a mi paso\n";
	}

	@Override
	public String land() {
		return "Puedo aterrizar en superficies planas\n";
	}

	@Override
	public String fly() {
		return "Puedo volar haciendo busquedas, rescates o transportando cargas\n";
	}

	@Override
	public String encenderPropulsores() {
		return "Al encender los propulsores adquiero mas velocidad\n";
	}

	@Override
	public String desplazarse() {
		return "Puedo desplazarme hacia casi cualquier lugarlugares aislados o congestionados\n";
	}

	public String realizarVueloEstacionario() {
		return "Puedo volar verticalmente sin avanzar ni transladarme hacia los lados\n";
	}

	public int getNumHelices() {
		return numHelices;
	}

	public void setNumHelices(int numHelices) {
		this.numHelices = numHelices;
	}
}
