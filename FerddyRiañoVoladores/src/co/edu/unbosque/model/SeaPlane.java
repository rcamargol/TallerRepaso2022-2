package co.edu.unbosque.model;

public class SeaPlane extends Airplane{
	
	protected String superficie;
	
	public SeaPlane() {
		super.combustible = "Petroleo";
		super.longitudAlas = 5;
		this.superficie = "Flotadores";
	}

	@Override
	public String toTakeOff() {
		
		return "Despegan mientras se hunden.";
	}

	@Override
	public String toLand() {
		
		return "Aterrizan dando botes.";
	}

	@Override
	public String toFly() {
		
		return "Vuelan a duras penas.";
	}

	@Override
	public String movilizarObjetos() {
		
		return "Se caen si se les mete cualquier cosa.";
	}
	@Override
	public String toString() {
		
		return "Los hidroaviones como todos los vehiculos pueden transportar objetos y tambien como todos los voladores" + "\n"
			  + "pueden despegar, volar y aterrizar, pero ademas de esto, como todos los aviones su combustible es el petroleo" + "\n"
			  + "y en su caso particular, sus alas suelen medir 5 metros, y la superficie suele estar conformada de flotadores.";
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
}
