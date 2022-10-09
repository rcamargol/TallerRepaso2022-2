package co.edu.unbosque.model;

public class Helicopter extends Airplane{
	
	private String helices;
	
	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return " Inician las helices para despegar, ";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "siempre aterrizan en tierra, ";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "esta diseñado para volar en lugares de dificil acceso, ";
	}
	
	@Override
	public String iniciarMotor() {
		// TODO Auto-generated method stub
		return "al encenderse, inicia el movimiento de las helices, ";
	}

	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return "para acelerar se hace uso de una palanca, ";
	}
	
	public String alineamientoFlaps(){
		return "los helicopteros usan en su mayoria usan estabilizadores.";
	}
	
}
