package co.edu.unbosque.model;

public class Helicoptero extends Avion {
	
	private int numTurbina;
	
	public Helicoptero() {
		super.velocidadMax = 278;
		super.tiempoVueloMax = 3;
		numTurbina = 2;
	}
	
	public String desplegarPotencia() {
		String msj = "Este helicoptero tiene gran agilidad, gracias a que tiene "+numTurbina+" turbinas, tendria mas de no ser por lo tacaño que es su dueño.";
		return msj;
	}

	@Override
	public String despegar() {
		String msj1 = "Todo helicoptero debe despegar a 90 grados de su posicion incial, pero el piloto es rebelde y le puso ABS (a veces si a veces no).";
		return msj1;
	}

	@Override
	public String aterrizar() {
		String msj2 = "Todo helicoptero debe aterrizar a el mismo angulo de despegue, o eso le tuvieron que decir al piloto antes de la tragedia.";
		return msj2;
	}

	@Override
	public String volar() {
		String msj3 = "Este helicoptero puede volar se supone.";
		return msj3;
	}

	@Override
	public String analizarTiempoVuelo() {
		String msj4 = "Este helicoptero puede mantenerse en el aire por "+super.tiempoVueloMax+" horas maximo, ya despues se cae :( .";
		return msj4;
	}

	@Override
	public String subirVelocidad() {
		String msj5 = "Este helicoptero tiene la capacidad de volar a una velocidad de "+super.velocidadMax+" kilometros por hora, pero si se le pone redbull aumenta 50% mas.";
		return msj5;
	}
	
	public String generarInformacionHelicoptero() {
		String msj6 = "****HELICOPTERO****"+"\n"+
	                  "- "+desplegarPotencia()+"\n"+
				      "- "+volar()+"\n"+
	                  "- "+analizarTiempoVuelo()+"\n"+
				      "- "+subirVelocidad()+"\n"+
	                  "- "+despegar()+"\n"+
				      "- "+aterrizar();
		return msj6;
	}

}
