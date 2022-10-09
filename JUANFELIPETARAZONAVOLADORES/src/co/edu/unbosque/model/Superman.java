package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer{
	
	private String fuerza;
	
	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return " Despega en cualquier parte de la ciudad, ";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "aterriza en cualquier parte del mundo, ";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "vuela incluso fuera del planeta tierra, ";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "come cualquier comida como cualquier ser humano, ";
	}
	
	@Override
	public String rayosLaser() {
		// TODO Auto-generated method stub
		return "kal el gracias a el sol puede lanzar rayos laser para defenderse, ";
	}
	
	public String leapBuilding(){
		return "puede caer de edificios, y no le pasara nada, ";
	}
	
	public String stopBullet(){
		return "para las balas cuando es disparado con armas de fuego. ";
	}
	
}
