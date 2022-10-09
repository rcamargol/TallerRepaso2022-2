package co.edu.unbosque.model;

public class Renk extends Desterrados{
	
	private String animal;
	private String condena;
	
	public Renk() {
		super.Edad = 639;
		super.Estatura = "2 metros";
		super.Nombre = "Renk";
		super.Alma= "su alma era falsa";
		super.Colorojos = "rojos";
		super.colordepiel = "son amarillos";
		super.vivian = "exactamente 1500 años";
		animal = "se podian convertir en cualquier animal";
		condena = "kublacan los condeno de por vida";
	}

	@Override
	public String Arrastar() {
		return "arrastrarce de un lugar a otro";
	}

	@Override
	public String ejercutarVenganza() {
		return "El dia que kublacan los condeno se prometieron vengarze de el matandolo";
	}

	@Override
	public String habitar() {
		return "habitaban el extremo sur del planeta";
	}

	@Override
	public String sentir() {
		return "no sienten a nadie más que a ellos mismos";
	}
	public String llorarPorserfalso() {
		return "lloran por que quieren que algun dia kublacan los acepte y que cambie su sufrimiento";
	}
	
	public String lucharConcriaturas() {
		return "desterrado le toca luchar con los demas para comer";
	}
	
	public String confirmarEdad() throws Edadexception {
		if (super.Edad >= 1000) {
			throw new Edadexception("el desterrado ya se esta envejeciendo");
		}
		if (super.Edad >= 500 | super.Edad<= 999) {
			throw new Edadexception("el desterrado es adulto ya casi va a envejecer");
		}
		if (super.Edad <= 500) {
			throw new Edadexception("el desterrado hasta ahora va en su plena juventud");
		}
		return "";
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
	
	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getCondena() {
		return condena;
	}

	public void setCondena(String condena) {
		this.condena = condena;
	}
}
