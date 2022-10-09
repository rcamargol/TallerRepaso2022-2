package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer{
	public String unirMetodos() {
		String a = takeOff()+"\n"+land()+"\n"+fly()+"\n"+eat()+"\n"+layEggs()+"\n"+buildNest();
		return a;
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
	public String eat() {
		// TODO Auto-generated method stub
		return "Puede comer";
	}
	public String buildNest() {
		return "Puede construir nidos";
	}
	public String layEggs() {
		return "Puede poner huevos";
	}
	
	
}
