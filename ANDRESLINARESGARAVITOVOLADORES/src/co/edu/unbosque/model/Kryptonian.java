package co.edu.unbosque.model;

public class Kryptonian extends Animal {
	
	protected String can;
	
	public String goAnotherPlanet(){
		return "Mejor me voy de kryptonian porque ya me aburri de ser normal aqui";
	}

	@Override
	public String eat() {
		return "Si como me engordo";
	}

}
