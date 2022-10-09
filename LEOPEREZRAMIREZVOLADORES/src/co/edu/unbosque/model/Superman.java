package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer{
	
	private String affiliations;
	
	public Superman(String afiliaciones, String powers) {
		super(powers);
		this.affiliations = "Liga de la justicia";
		this.powers = "supervelocidad, invulnerabilidad, super-oído, visión telescópica y microscópica, "
				+"\n"+ "visión de rayos-x";
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "-Despegue: hace un pequeño saltito como impulso para luego usar su poder de vuelo.";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "-Aterrizaje: Como todo superheroe aterriza de una forma exagerada para que su llegada sea epica.";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "-Vuelo: durante su vuelo hace una pose inecesaria estariando su brazo derecho y encogiendo"
				+"\n"+ "el izquierdo aunque muy clave para su personaje.";
	}
	
	public String leapBuilding() {
		return "-Tiene capacidades fisicas aumentadas al maximo lo cual le hace poder saltar sobre edificios.";
	}
	
	public String stopBullet() {
		return "-Su cuerpo es inmune a cualquier tipo de arma creada por el humano como las armas.";
	}
	
	public String eat() {
		return "-Como culaquier cosa, como un humano normal.";
	}
	
	public String hideIdentity() {
		return "-Para que pueda tener una vida aparte de la de superheroe oculta su indentidad mediantes "
				+"\n"+ "unas gafas la cual dispara rayos hipnotizantes para confundir a los ciudadanos.";
	}

	public String getPowers() {
		return powers;
	}

	public void setPowers(String powers) {
		this.powers = powers;
	}

	public String getAffiliations() {
		return affiliations;
	}

	public void setAfiliaciones(String affiliations) {
		this.affiliations = affiliations;
	}

	
}
