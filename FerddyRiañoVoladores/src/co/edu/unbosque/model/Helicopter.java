package co.edu.unbosque.model;

public class Helicopter extends Airplane{
	
	private double medida;
	
	public Helicopter() {
		super.combustible = "Petroleo";
		super.longitudAlas = 3;
		this.medida = 15;
	}
	
	@Override
	public String toTakeOff() {
		
		return "Despegan de una manera lamentable.";
	}

	@Override
	public String toLand() {
		
		return "Aterrizan como guaches.";
	}

	@Override
	public String toFly() {
		
		return "Vuelan como si se fueran a caer.";
	}

	@Override
	public String movilizarObjetos() {
		
		return "Se les puede meter de todo.";
	}
	@Override
	public String toString() {
		
		return "Los helicopteros como todos los vehiculos pueden transportar objetos y tambien como todos los voladores" + "\n"
			 + "pueden despegar, volar y aterrizar, pero ademas de esto, como todos los aviones su combustible es el petroleo" + "\n"
			 + "y en su caso particular, sus alas suelen medir 3 metros, y su longitud promedio es de unos 15 metros.";
	}

	public double getMedida() {
		return medida;
	}

	public void setMedida(double medida) {
		this.medida = medida;
	}
}
