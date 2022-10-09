package co.edu.unbosque.model;

public class Bizarro extends Superman{
	
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
	
	public String eat() {
		return "Yo debo comer";
	}
	
	public String walk() {
		return "Yo puedo caminar";
	}
	
	public String weakness() {
		return "Soy debil a la kriptonita";
	}
	
	public String laserBean() {
		return "Mi mirada mata";
	}
	
	public String leapBuilding() {
		return "No se que sea esto pero creo que salto edificios";
	}
	
	public String stopBullet() {
		return "No me afectan tus municiones";
	}
	
	public String superStrenght() {
		return "Soy super fuerte";
	}
	
	public String freezerBreath() {
		return "Te soplo y te quedas frio";
	}
	
	public String reverseSupermanPowers() {
		return "Tengo los poderes de superman pero invertidos";
	}
	
	public String beAClone() {
		return "Me clonaron de superman";
	}
}
