package co.edu.unbosque.model;

public class seaPlane extends Airplane{
	
	private String deslizador;
	
	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Despega desde el agua, ";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "aterriza en el agua, ";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "empieza sobre el agua, por unos cuantos metros para luego apoyarse de sus alas ";
	}
	
	@Override
	public String iniciarMotor() {
		// TODO Auto-generated method stub
		return "antes de empezar su vuelo hay que esperar unos minutos a que inicie el motor, ";
	}

	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return "mediante el uso de sus motores puede acelerar, ";
	}
	
	public String amerizaje(){
		return "el amerizaje lo realiza de manera exitosa gracias a sus deslizadores ";
	}
}
