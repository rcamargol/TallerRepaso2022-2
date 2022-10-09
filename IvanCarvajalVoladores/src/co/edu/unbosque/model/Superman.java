package co.edu.unbosque.model;

public class Superman extends Kryptoniano implements Voladores {

	private String novia;
	
	public Superman() {
		novia = "La novia de superman vive PM";
		super.vulneravilidad = "comer empanadas por que le da dolor de barriga";
		super.camina = "caminar con estilo libre";
	}
	
	@Override
	public String despegar() {
		return "El despega por aceleracion de la potenca del viento";
	}

	@Override
	public String aterrizar() {
		return "el se rompe las piernas cuando aterriza";
	}

	@Override
	public String volar() {
		return "el vuela hacia arriba hacia las nubes";
	}

	@Override
	public String salvarVidas() {
		return "el no salva el muere por ellas";
	}

	@Override
	public String comer() {
		return "el come una tonelada de carne";
	}
	
	public String saltarEdificios() {
		return "el tiene un super salto y es asi como lo pueden ver las personas";
	}

	public String getNovia() {
		return novia;
	}

	public void setNovia(String novia) {
		this.novia = novia;
	}

}
