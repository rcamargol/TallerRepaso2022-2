package co.edu.unbosque.model;

public class SeaPlane extends Airplane {
	
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
	
	public String seaLanding() {
		return "Yo puedo aterrizar en el agua";
	}
	
	public String extinguishSeaFire() {
		return "Me usan para apagar incendios en el mar";	
	}
}
