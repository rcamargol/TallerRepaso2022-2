package co.edu.unbosque.model;

public class Kira extends Heroes{
 
	private String poder;
	private String enemigos;
	
	public Kira() {
		super.Nombre = "Kira";
		super.Edad = 453;
		super.Estatura = "3 metros";
		super.Alma = "muy pura";
		super.Colorojos = " dorado";
		super.Valentia = "era muy valiente";
		super.Honestidad = "le gustaba ayudar a la gente y era muy honesta";
		poder = "super fuerza";
		enemigos = "tenia enemigos como los cazadores por que no los dejaba salir con la suya";
	    
	}
	@Override
	public String habitar() {
		return "Habitaban al norte del planeta";
	}

	@Override
	public String sentir() {
		return "sentirse a si mismos y a seres de otros mundos";
	}
	
	@Override
	public String volar() {
		return "Volaban por los aires";
	}
	@Override
	public String crearFuego() {
		return "Creaban fuego con sus manos";
	}
	@Override
	public String detenerTiempo() {
		return "detener el tiempo";
	}
	
	public String soniar() {
		return "ella sue�a que sus enemigos la lastimaran";
	}
	public String nutrirPoder() {
		return "kira por ser un heroe tiene que nutrir su poder metidando y horando a kublacan";
	}
	
	public String confirmarAlma() throws Almaexception {
		   if (super.Alma == "muy pura") {
			throw new Almaexception("Ella merece estar al lado de kublacan gobernando");
		  }
		   if (super.Alma == "su alma era falsa") {
		    throw new Almaexception("el hombre va a tener que pagar toda una vida de condena");
		}
		   if (super.Alma == "verdadera") {
			   throw new Almaexception("el pana fue premiado por kublacan bravo!!!!");
		}
			return "";
		}
	
	public String confirmarEdad() throws Edadexception {
		if (super.Edad >= 1000) {
			throw new Edadexception("la heroe ya se esta envejeciendo");
		}
		if (super.Edad >= 500 | super.Edad<= 999) {
			throw new Edadexception("la heroe es adulta ya casi va a envejecer");
		}
		if (super.Edad <= 500) {
			throw new Edadexception("la heroe hasta ahora va en su plena juventud");
		}
		return "";
	}
	
	public String getPoder() {
		return poder;
	}
	public void setPoder(String poder) {
		this.poder = poder;
	}
	public String getEnemigos() {
		return enemigos;
	}
	public void setEnemigos(String enemigos) {
		this.enemigos = enemigos;
	}
	
}
