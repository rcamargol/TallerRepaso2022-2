package co.edu.unbosque.model;

public class Superman  extends Kryptonian implements Flyer {
	
	public Superman(String can) {
		this.can = can;
		
	}
	
	public String unirMetodos() {
		return goAnotherPlanet()+"\n"+eat();
	}
	
	public String lwapBuilding() {
		return "Tengo una casita humilde";
	}
	
	public String stopBullet() {
		return "Detener una bala es un ejercicio normal";
	}
	
	@Override
	public String takeOff() {
		return "Nadie despega tan cool como yo";
	}

	@Override
	public String land() {
		return "La unica parte que consegui para vivir";
	}

	@Override
	public String fly() {
		return "Volar me sirve para no tener carro";
	}
	
	

}
