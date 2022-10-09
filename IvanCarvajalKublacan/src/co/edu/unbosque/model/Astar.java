package co.edu.unbosque.model;

public class Astar extends Heroes{

	private String interes;
	private String confiados;
	
	public Astar() {
		super.Nombre= "Astar";
		super.Edad = 926;
		super.Estatura = "3 metros";
		super.Alma = "poco pura";
		super.Colorojos = "dorado";
		super.Valentia = "esta perdiendo su valentia";
		super.Honestidad = "se a vuelto desonesto";
		interes = "solo ayuda a las personas por interes";
		confiados = "es muy confiado cuando lucha contra un enemigo";
	}

	@Override
	public String volar() {
		return "Volar por los aires";
	}

	@Override
	public String crearFuego() {
		return "Crear fuego con sus manos";
	}

	@Override
	public String detenerTiempo() {
		return "detener el tiempo";
	}

	@Override
	public String habitar() {
		return "Habitaban al norte del planeta";
	}

	@Override
	public String sentir() {
		return "sentirse a si mismos y a seres de otros mundos";
	}
	
	public String seguirSalvando() {
		return "ya no sigo ayudando a las personas";
	}
	
	public String construirVinculos() {
		return "ya no e podido volver a construir vinculos con las personas";
	}

	public String confirmarAlma() throws Almaexception {
		   if (super.Alma == "muy pura") {
			throw new Almaexception("El pana merece estar al lado de kublacan gobernando");
		  }
		   if (super.Alma == "su alma era falsa") {
		    throw new Almaexception("el hombre va a tener que pagar toda una vida de condena");
		}
		   if (super.Alma == "verdadera") {
			   throw new Almaexception("el pana fue premiado por kublacan bravo!!!!");
		}
		   if (super.Alma == "poco pura") {
			   throw new Almaexception("el pana no desea estar al lado de kublacan");
		}
			return "";
		}
	
	public String confirmarEdad() throws Edadexception {
		if (super.Edad >= 1000) {
			throw new Edadexception("el heroe ya se esta envejeciendo");
		}
		if (super.Edad >= 500 | super.Edad<= 999) {
			throw new Edadexception("el heroe es adulto ya casi va a envejecer");
		}
		if (super.Edad <= 500) {
			throw new Edadexception("el heroe hasta ahora va en su plena juventud");
		}
		return "";
	}
	
	public String getInteres() {
		return interes;
	}

	public void setInteres(String interes) {
		this.interes = interes;
	}

	public String getConfiados() {
		return confiados;
	}

	public void setConfiados(String confiados) {
		this.confiados = confiados;
	}
}
