package co.edu.unbosque.model;

public class Ivancarvajal extends Mortales {

	private String pueblo;
	private String habiidades;
	
	public Ivancarvajal() {
		super.Alma= "verdadera";
		super.Colorojos = "ojos es violeta";
		super.Comportamiento = "Solitarios";
		super.Costumbres = "son siempre honrar a kublacan para ganarnos un lugar en el valhalla";
		super.Edad = 18;
		super.Estatura = "1.79";
		super.Nombre = "ivan";
		this.pueblo = "habita en el pueblo de los elegidos";
		this.habiidades = "tiene habilidades de carpintero";
	}
	public String robarRiquezas() {
		return "los mortales son codisiosos por eso se roban unos a otros";
	}
	
	public String vestir() {
		return "Ellos se visten de manera libre por lo que no son dignos";
	}

	@Override
	public String adquirirConocimiento() {
		return "El aprendia muy rapido cualquier oficio";
	}

	@Override
	public String ejercerProfecion() {
		return "El era un carpintero muy bueno";
	}

	@Override
	public String habitar() {
		return "Los mortales habitaban en el este del planeta";
	}

	@Override
	public String sentir() {
		return "Ellos podian sentir la presencia de otros mortales";
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
			return "";
		}
	
	public String confirmarEdad() throws Edadexception {
		if (super.Edad >= 60) {
			throw new Edadexception("el man ya se esta envejeciendo");
		}
		if (super.Edad >= 30 | super.Edad<= 50) {
			throw new Edadexception("el pana es adulto ya casi va a envejecer");
		}
		if (super.Edad <= 29) {
			throw new Edadexception("el bacan hasta ahora va en su plena juventud");
		}
		return "";
	}
	
	public String getPueblo() {
		return pueblo;
	}

	public void setPueblo(String pueblo) {
		this.pueblo = pueblo;
	}

	public String getHabiidades() {
		return habiidades;
	}

	public void setHabiidades(String habiidades) {
		this.habiidades = habiidades;
	}
	
	
}
