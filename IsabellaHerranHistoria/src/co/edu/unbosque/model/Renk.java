package co.edu.unbosque.model;

public class Renk extends Desterrados{

	private String rebeldia;
	private String ignorancia;

	public Renk() {
		super.edad = 1499;
		super.estatura = 7.4;
		super.sufrimiento = "excesivo";
		super.rabia = "odio extremo";
		super.alma = false;
		super.colordeojos = "negros";
		this.rebeldia = "mucha";
		this.ignorancia = "nula";
	}

	@Override
	public void arrastrar() {

	}

	@Override
	public void herir() {

	}

	public void desintegrar() {

	}

	public void controlarMentalmente() {

	}

	public String getReveldia() {
		return rebeldia;
	}

	public void setReveldia(String reveldia) {
		this.rebeldia = reveldia;
	}

	public String getIgnorancia() {
		return ignorancia;
	}

	public void setIgnorancia(String ignorancia) {
		this.ignorancia = ignorancia;
	}

}
