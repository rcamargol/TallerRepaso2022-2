package co.edu.unbosque.model;

public class Renk extends Desterrados{

	private String rencor;
	private String venganza;
	
	public Renk() {
		super.edad = 1500;
		super.estatura = 1.90;
		super.colorDeOjos = "rojo";
		super.odio = " le tiene mucho odio a los heroes";
		super.resignacion = " acepta su condicion como desterrado";
		this.rencor = " le tiene mucho rencor a Astar, ";
		this.venganza = " se quiere vengar de Astar por aniquilar a su familia, ";
	}

	public String vengar() {
		return "Renk " + this.venganza ;
	}
	
	public String destruir() {
		return "Renk " + this.rencor + "por lo que va a destruir a todos los heroes.";
	}

	@Override
	public String arrastrar() {
		return "Renk como los demas desterrados se arrastran de un lugar a otro.";
	}

	@Override
	public String herir() {
		return "Renk como los demas deterrados, les gusta herir a los que se pongan en su camino.";
	}

	@Override
	public String sentir() {
		return super.sentir();
	}
	
	@Override
	public String habitar() {
		return super.habitar();
	}
	
	@Override
	public String toString() {
		return "Renk es un desterrado" + "\n" +
				"La edad de Renk es: " + super.edad + " años." + "\n" + 
				"La estatura de Renk es: " + super.estatura + " metros " + "\n" + 
				"El color de ojos de Renk es: " + super.colorDeOjos + "\n" + 
				"La alma de Renk es: " + super.alma + "\n" + 
				vengar() + "\n" + 
				destruir() + "\n" +
				"Renk " + super.odio + "\n" +
				"Renk " + super.resignacion + "\n" +
				"Renk como los demas desterrados, " + sentir() + "\n" +
				"Renk como los demas desterrados, " + habitar() + "\n" +
				arrastrar() + "\n" + 
				herir() ;
	}

	
	
}
