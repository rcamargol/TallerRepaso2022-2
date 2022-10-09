package co.edu.unbosque.model;

public class Helicoptero extends Avion {

	private String lugar;
	
	public Helicoptero() {
		lugar = " aterrizar donde se le plasca";
		super.frenos = " quedarse sin frenos por que van demasiado rapido";
		super.peso = "no pesan mucho lo podria levantar un bebe";
	}
	@Override
	public String despegar() {
		return "despega al prender el motor y mover sus elizes";
	}

	@Override
	public String aterrizar() {
		return "no aterrizan, ellos se estrellan";
	}

	@Override
	public String volar() {
		return " vuelan como pajaros sin miedo al exito";
	}

	@Override
	public String motor() {
		return " es pequeño como una pieza de lego";
	}

	@Override
	public String transladar() {
		return "usualmente estos son utilizados para cargar personas";
	}
	
	public String girarElises() {
		return "Por lo general lo que los diferencia de un avion es que estos tienen elises que "
				+ "giran para que lo pueda elevar o aterrizar";
	}
	
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
}
