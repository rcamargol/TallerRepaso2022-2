package co.edu.unbosque.model;

public class SeaPlane extends Airplane {

	private boolean floats;
	

	public SeaPlane() {
		this.floats = true;
		super.flightHeight=10000;
	}

	@Override
	public String takeOff() {
		return "Salpica mucha agua al despegar";
	}

	@Override
	public String land() {
		return "Debe aterrizar en un superficie acuatica amplia";
	}

	@Override
	public String fly() {
		return "Despues de despegar vuela como cualquier otro avion";
	}

	@Override
	public String turnOnEngine() {
		return "Se encienden los motores para iniciar el funcionamiento de este";
	}

	@Override
	public String turnOffEngine() {
		return "Para mantener el hidroavion en el agua no es necesario tener los motores encendidos";
	}

	@Override
	public String transport() {
		return "No tiene mucha capacidad de carga";
	}

	public String stayInWater() {
		return "Sus flotadores permiten que se mantenga en el agua";

	}

	public boolean isFloats() {
		return floats;
	}

	public void setFloats(boolean floats) {
		this.floats = floats;
	}

}
