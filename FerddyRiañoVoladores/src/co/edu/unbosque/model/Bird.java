package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer{
	
	private String colorPlumas;
	
	public Bird() {
		super.añosDeVida = 5;
		this.colorPlumas = "Amarillas";
	}

	
	public String toBuildNest() {
		
		return "Construyen nidos como campeones.";
	}
	
	public String toLayEggs() {
		
		return "Ponen huevos como locos.";
	}


	@Override
	public String toTakeOff() {
	
		return "Los despegues parecen magia.";
	}



	@Override
	public String toLand() {
		
		return "Aterrizan con mucha clase.";
	}



	@Override
	public String toFly() {
		
		return "Vuelan con un flow inigualable.";
	}


	@Override
	public String toEat() {
		
		return "Comen lo mas horrible de la vida.";
	}
	
	@Override
	public String toString() {
		
		return "Los pajaros como todos los animales pueden comer y tambien como todos los voladores" + "\n"
			 + "pueden despegar, volar y aterrizar, pero ademas de esto pueden construir sus propios nidos" + "\n"
			 + "y poner huevos para reproducirse. Se caracterizan por tener en promedio 5 años de vida y plumas amarillas.";
	}


	public String getColorPlumas() {
		return colorPlumas;
	}


	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}


	
}
