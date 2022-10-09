package co.edu.unbosque.model;

public class Superman extends Kryptoniano implements Volador{
	
	private double tiempoReaccion;
	
	public Superman() {
		super.alimentacion = "empanadas";
		super.energia= "energia solar";
		tiempoReaccion= 0.000000001;
	}
	
	public String saltarEdificios() {
		String msj = "Superman tiene la capacidad para saltar edificios a lo chimbo a lo perro, gracias a que en Krypton "+
	                 "la gravedad era 15 veces mas intensa que en la tierra.";
		return msj;
	}
	
	public String detenerBalas() {
		String msj1= "Superman puede detener balas e incluso esquivarlas ya que su tiempo de reacción es de "+tiempoReaccion+" segundo.";
		return msj1;
	}

	@Override
	public String despegar() {
		String msj2 = "Superman despega en un angulo de 90 grados a la horizontal y no le importa en avion que se le cruce.";
		return msj2;
	}

	@Override
	public String aterrizar() {
		String msj3 = "Superman como heroe respetable no aterriza, el deciende lenta y dramaticamente del cielo.";
		return msj3;
	}

	@Override
	public String volar() {
		String msj4 = "Para superman los trancones aereos no exiten, por lo tanto, puede ir a una velocidad de 2400 kilometros por hora";
		return msj4;
	}

	@Override
	public String adquirirPoderes() {
		String msj5 = "Superman debe mantener sus poderes pero para ello debe recargar su energia por medio de "+super.energia+".";
		return msj5;
	}
	
	@Override
	public String comer() {
		String msj6 = "Superman al tener condiciones similares a las del ser humano, perfectamente se come unas buenas "+super.alimentacion+".";
		return msj6;
	}
	
	public String generarInformacionSuperman() {
		String msj7 = "****SUPERMAN****"+"\n"+
	                  "- "+saltarEdificios()+"\n"+
	                  "- "+detenerBalas()+"\n"+
	                  "- "+despegar()+"\n"+
	                  "- "+aterrizar()+"\n"+
	                  "- "+adquirirPoderes()+"\n"+
	                  "- "+volar()+"\n"+
	                  "- "+comer();
		return msj7;
	}

	
	

}
