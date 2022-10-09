package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer {
	
	private String fuerza;

	public Superman() {
		super.movimiento = " veloces.";
		super.extraterrestres = "indestructible.";
		this.fuerza = "fuerza maxima.";
	}
	public String saltarEdificios() {
		return "A la hora de saltar edificios mis genes de extraterreste se activan y elevan mi elasticidad";
	}
	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "No es un secreto que para poder volar necesito de mi capa, por eso, siempre la limpio mientras hablo con ella";
	}

	public String detenerBalas () {
		return "Cuando mi capa siente la presencia de una bala, me cubre con un chaleco de balas invisible";
	}
	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "A la hora de aterrizar lo unico que debo hacer es darle la orden a la capa para que comience a disminuir la velocidad y con la ayuda de mi puño voy dando la direecion";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Cuando estoy en volando debo estar alerta a culaquier señal de peligro, por lo tanto, llevo audifonos inalambricos que prenden una sirena";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "Antes de iniciar el dia debo comer. Mi comida favorita es el atun con arroz y platano ¡Yumi!";
	}

	@Override
	public String vencer() {
		// TODO Auto-generated method stub
		return "Mi unico objetivo es ayudar a las personas que estan en peligro, para ello debo vencer a los malignos";
	}

	public String textoSuperman() {
		return "Soy superman con una " +fuerza+ " Soy un extraterrestre " +extraterrestres+ " Tengo unos movimientos " +movimiento+ " Como se que eres mi fan #1 te vengo a contar un poco de mi dia a dia como volador" + "\n" + comer () + "\n" + despegar () + "\n" + volar () + "\n" + saltarEdificios() + "\n" + detenerBalas () + "\n" + aterrizar (); 
	}


}
