package co.edu.unbosque.model;

public class Helicoptero extends Avion implements Volador{
	
	private String puertas;
	
	public Helicoptero() {
		motor = "Tiene un motor a base de agua.";
		puertas= "No tiene puertas (se las robaron).";
		horario = "Entre las 9 am y las 6 pm.";
	}
	
	public String tomarImagenes() {
		return "El helicoptero cuenta con una camara para tomar imagenes aereas.";
	}
	
	@Override
	public String cargarComida() {
		// TODO Auto-generated method stub
		return "Solo tienen mani."; 
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "Despega de noche, de dia se quema.";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Aterrizan con las helices.";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Vuela con el aire control.";
	}

	@Override
	public String recorrerDistancia() {
		// TODO Auto-generated method stub
		return "Solamente puede ir del punto A al B, al C no.";
	}

	@Override
	public String tragarGasolina() {
		// TODO Auto-generated method stub
		return "traga 1 ml de gasolina por año.";
	}
	
	public String escribirMsgHelicoptero() {
		return " -Motor: " + motor + "\n" +  " -Puertas: " + puertas + "\n" + " -Horario: " + horario + "\n"
			  +" -Cargar comida: " + cargarComida() + "\n" +  " -Despegar: " + despegar() + "\n" + " -Aterrizar: " + aterrizar() + "\n"
			  +" -Volar: " + volar() + "\n" +  " -Recorrer distancia: " + recorrerDistancia()  + "\n" + " -Tragar gazolina: " + tragarGasolina()
			  +"\n" + " -Tomar imagenes: " + tomarImagenes();

	}
	
}
