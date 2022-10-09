package co.edu.unbosque.model;

public class Helicopter extends Airplane{

	private String helice;
	
	public Helicopter(String ruedas, String alas) {
		super(ruedas, alas);
		
		this.helice = helice;
	}
	
	public String iniciarhelices() {
	return " Inicia sus helices ";		
}
	@Override
	public String despegue() {
		// TODO Auto-generated method stub
		return " para prepar el despegar ";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return " y desciende suavemente antes de tocar tierra firme. ";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return " El helicoptero vuela tranquilamente mistras se droga, ";
	}

	@Override
	public String derrapar() {
		// TODO Auto-generated method stub
		return " despues de estar drogado el helicopntero derrapa en la	 pista de aterrizaje ";
	}
}