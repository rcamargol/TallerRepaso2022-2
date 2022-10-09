package co.edu.unbosque.model;

public class SeaPlane extends Airplane{


	private String anfivio;
	public SeaPlane(String ruedas, String alas) {
		super(ruedas, alas);
		this.anfivio = anfivio;
	}

	public String flotar() {
	return " Este avion tiene la capacidad de flotar en superficies de agua, ";
	
}

	@Override
	public String despegue() {
		// TODO Auto-generated method stub
		return " el despegue comienza cuando este planea en una superfice de agua o terrestre antes de tomar vuelo. ";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return " Tiene la capacidad de aterrizar tanto en tierra como en agua, es decir que es un anfivio, ";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return " vuela como si se hubiera drogado 10gr de heroina ";
	}

	@Override
	public String derrapar() {
		// TODO Auto-generated method stub
		return " y el derrape se produce cuando este toca la superficie ya sea terrestre o acuatica ";
	}
}
