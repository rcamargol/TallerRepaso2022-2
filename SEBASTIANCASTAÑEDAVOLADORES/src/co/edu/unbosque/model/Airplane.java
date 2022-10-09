package co.edu.unbosque.model;

public class Airplane extends Vehicle implements Flyer{
	public Airplane(String gasolina) {
		this.gasolina = gasolina;
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "Puede despegar";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Puede aterrizar";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Puede volar";
	}

	@Override
	public String transport() {
		// TODO Auto-generated method stub
		return "Puede transportarse";
	}

	@Override
	public String movement() {
		// TODO Auto-generated method stub
		return "Puede moverse";
	}
	
	
}
