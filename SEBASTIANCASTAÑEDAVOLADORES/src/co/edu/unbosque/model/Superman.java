package co.edu.unbosque.model;

public class Superman extends Kriptonian implements Flyer{
	public Superman(String strong) {
		this.strong = strong;
	}
	public String unirMetodos() {
		String a = takeOff()+"\n"+land()+"\n"+fly()+"\n"+eat()+"\n"+leapBuilding()+"\n"+stopBullet();
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
	@Override
	public String leapBuilding() {
		// TODO Auto-generated method stub
		return "Puede levantar una contruccion";
	}
	@Override
	public String stopBullet() {
		// TODO Auto-generated method stub
		return "Es inmune a las balas";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "\n" + this.strong;
	}
	
}
