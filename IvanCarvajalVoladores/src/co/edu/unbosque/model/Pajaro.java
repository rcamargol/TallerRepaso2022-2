package co.edu.unbosque.model;

public class Pajaro extends Animal implements Voladores {

	private String drogarse;
	
	public Pajaro() {
		drogarse = " se drogan con mirar a las muchachas";
		super.camina = "ya que el pajaro camina en 2 patas entre los cables";
	}
	
	@Override
	public String despegar() {
		return "toman precauciones para que no los atropeyen";
	}

	@Override
	public String aterrizar() {
		return "tienen cuidado al momento de aterrizar por que siempre se tiran a la loca";
	}

	@Override
	public String volar() {
		return "vuelan de medio lado por lo drogados que quedan";
	}

	@Override
	public String comer() {
		return "come solo comida chatarra como buen pajaro :)";
	}
	public String ponerHuevos() {
		return " son victimas de las aguilas entre otros animales";
	}

	public String getDrogarse() {
		return drogarse;
	}

	public void setDrogarse(String drogarse) {
		this.drogarse = drogarse;
	}
}
