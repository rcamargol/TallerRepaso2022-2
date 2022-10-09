package co.edu.unbosque.model;

public class Airplane extends Vehicle implements Flyer {

	public Airplane(boolean engine) {
		this.engine = true;
	}
	
	@Override
	public String takeOff() {
		return "Puedo aterrisar en cualquier lugar";
	}

	@Override
	public String land() {
		return "No me tengo que preocupar por los trancones si voy en avion";
	}

	@Override
	public String fly() {
		return "Estar en las nuebes es mi pasion";
	}

	@Override
	public String startEngine() {
		return "El motor un vhiculo es como un corazon hacen la misma funcion";
	}

}
