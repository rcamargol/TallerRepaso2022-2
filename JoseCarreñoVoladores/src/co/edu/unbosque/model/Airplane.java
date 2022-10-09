package co.edu.unbosque.model;

public class Airplane extends Vehicle implements Flyer {

	@Override
	public String takeOff() {
		return "Yo debo despegar";
	}

	@Override
	public String land() {
		return "Yo puedo aterrizar sin matarme";	
	}

	@Override
	public String fly() {
		return "Yo puedo volar";
	}
	
	public String roll() {
		return "Yo ruedo";
	}
	
	public String engine() {
		return "Yo tengo un motor";
	}
	
	public String charge() {
		return "Yo puedo cargar diferentes cosas";
	}	
	
	public String beControlled() {
		return "Debo tener alguien que me controle";
	}


}
