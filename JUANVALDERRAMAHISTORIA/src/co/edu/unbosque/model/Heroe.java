package co.edu.unbosque.model;

public class Heroe extends Descendiente{
	
	private int alturadevuelo;
	private String intesidaddelfuego;
	private int tiempodetenido;
	
	public Heroe() {
		this.alturadevuelo = 0;
		this.intesidaddelfuego = "";
		this.tiempodetenido = 0;
	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Habito en el norte";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Me siento a mi mismo(a) y a otros seres";
	}

	public int getAlturadevuelo() {
		return alturadevuelo;
	}

	public void setAlturadevuelo(int alturadevuelo) {
		this.alturadevuelo = alturadevuelo;
	}

	public String getIntesidaddelfuego() {
		return intesidaddelfuego;
	}

	public void setIntesidaddelfuego(String intesidaddelfuego) {
		this.intesidaddelfuego = intesidaddelfuego;
	}

	public int getTiempodetenido() {
		return tiempodetenido;
	}

	public void setTiempodetenido(int tiempodetenido) {
		this.tiempodetenido = tiempodetenido;
	}

	@Override
	public String toString() {
		return "Mi estatura es " + estatura + " metros";
	}
	
	public void determinarAltura() {
		MenorAlturaException e = new MenorAlturaException(null);
		if (this.estatura > 3) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	

}
