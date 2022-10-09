package co.edu.unbosque.model;

public class Helicopter extends AirPlane{
	private String uso;
	public Helicopter() {
		super.marca = "Petroleo";
		super.piesAltura = "vuela a mas o menos a 20 mil pies de altura";
		this.uso = "frecuentemente se usa para turismo o uso militar ";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return " el elicoptero para despegafr tiene que empezar a aumentar la velocidad de sus helices hasta que la base del helicoplreto se levante del suelo";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "para aterrizar se necesirta empezar a reducir la velocidad de las helices hasta tocar una superficie adecuada para eterrizar ";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "gracias al movimiento de las helices el helicoptero puede mantenerce en el aire y desplazarce";
	}

	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return "al inclinar la palanca para moverse hacia delante el helicoptero acelera aumentando su velocidad";
	}
	@Override
	public String transportar() {
		// TODO Auto-generated method stub
		return "los helicopteros transportan gente y a veces alimentos o agua";
	}
	public String disparar() {
		// TODO Auto-generated method stub
		return "algunos helicopteros pueden disparar balas de alto calibre si son de guerra";
	}
	public String toString() {
		return "Marca:  " + marca + "\n" +"Pies de altura: "+piesAltura+ "\n" +
				"uso: " + uso  + "\n" +
				despegar() + "\n" + 
				aterrizar() + "\n"  +
				volar() + "\n"  +
			     acelerar() + "\n"+
			     transportar() + "\n"+
			     disparar() + "\n";
	}
}