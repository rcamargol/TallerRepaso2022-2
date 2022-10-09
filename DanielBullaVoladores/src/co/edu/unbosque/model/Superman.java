package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer {

	private String colorVisionDeCalor;
	
	public Superman() {
		super.aniosDeVida = 30;
		super.absorberEnergia = "energia solar";
		this.colorVisionDeCalor = "rojo";
	}
	
	public String leapBuilding() {
		return "Le encanta saltar de edificios";
	}
	
	public String stopBullet() {
		return "puede detener balas con las manos.";
	}

	@Override
	public String toTakeOff() {
		// TODO Auto-generated method stub
		return "para despegar levanta un brazo";
	}

	@Override
	public String toLand() {
		// TODO Auto-generated method stub
		return " al aterrizar levanta muchisimo polvo.";
	}

	@Override
	public String toFly() {
		// TODO Auto-generated method stub
		return "para volar tiene una velocidad supersonica.";
	}

	@Override
	public String toEat() {
		// TODO Auto-generated method stub
		return "la deliciosa comida que prepara Lois Lane.";
	}

	@Override
	public String correrVelozmente() {
		// TODO Auto-generated method stub
		return "va de vacaciones a Colombia con su supervelocidad.";
	}
	
	@Override
	public String toString() {
		return "Superman mas conocido como el superheroe mas fuerte,"
				+ " o simplemente el reportero Clark Kent."+"\n"
				+ "Es un heroe tristemente alergico a la kriptonita y a batman."+"\n"
				+ "Tiene "+super.aniosDeVida+" anios"+" de los 2000000 anios que viven su raza."+"\n"
				+ "Los kriptonianos al ser expuestos a la "+super.absorberEnergia+"\n"+
				"la absorven para hacerse mas fuertes y efectivamente, "+"\n"+
				"superman es muy fuerte por estar pegado al sol y absorver mucha "+super.absorberEnergia+"."+"\n"
				+ "Uno de los poderes regalados de superman es la vision calorifica que casualmente es de color "+colorVisionDeCalor+"."+"\n"+
				leapBuilding()+" y como algunos los superheroes, "+stopBullet()+"\n"+
				"Superman "+toTakeOff()+" sin razon alguna y"+toLand()+"\n"+
				"Pero hay que admirar que "+toFly()+"\n"+
				"Su dieta o lo que come todos los dias es "+toEat()+"\n"+
				"Por ultimo superman "+correrVelozmente();
	}

	public String getColorVisionDeCalor() {
		return colorVisionDeCalor;
	}
	public void setColorVisionDeCalor(String colorVisionDeCalor) {
		this.colorVisionDeCalor = colorVisionDeCalor;
	}
	
}
