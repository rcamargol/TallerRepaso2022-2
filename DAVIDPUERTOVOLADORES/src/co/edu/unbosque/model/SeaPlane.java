package co.edu.unbosque.model;

public class SeaPlane extends AirPlane {
	private int numFlotadores;

	public SeaPlane() {
		super.numWheels = 2;
		this.numFlotadores = 2;
	}

	@Override
	public String takeOff() {
		return "Puedo despegar desde tierra o desde una superficie marina\n";
	}

	@Override
	public String land() {
		return "Puedo aterrizar en tierra o en suelo marino\n";
	}

	@Override
	public String fly() {
		return "Puedo volar en un rango de hasta 4.500 kilometros\n";
	}

	@Override
	public String encenderPropulsores() {
		return "Cuando enciendo los propulsores me preparo para despegar\n";
	}

	@Override
	public String desplazarse() {
		return "Suelo desplazarme grandes distancias transportando personas o liquidos\n";
	}

	public String apagarIncendio() {
		return "Puedo ser utilizado para apagar incendios forestales\n";
	}

	public int getNumFlotadores() {
		return numFlotadores;
	}

	public void setNumFlotadores(int numFlotadores) {
		this.numFlotadores = numFlotadores;
	}
	

}
