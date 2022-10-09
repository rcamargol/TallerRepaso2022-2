package co.edu.unbosque.model;

public class David extends Mortal{
	
	private String alergia;
	private String hobby;
	
	public David() {
		super.edad= 24;
		super.estatura= 1.76;
		super.colorOjos= "Violeta";
		super.alma= "Justa";
		super.integrantesFamilia= 4;
		super.profesión= "Ingeniero de sistemas";
		this.alergia= "Ninguna";
		this.hobby= "ver competencias automovilisticas";
	}

	@Override
	public String adquirirConocimientos() {
		String msj = "David para poder aprender sobre su profesion tuvo que especializarse en el conocimiento matematico y desarrollar su lógica";
		return msj;
	}

	@Override
	public String tenerUnaFamilia() {
		String msj = "David tiene una familia de "+super.integrantesFamilia+" integrantes, una esposa y dos hijos";
		return msj;
	}

	@Override
	public String ejercerUnaProfesión() {
	    String msj = "David a sus 17 años decidio que su profesion estaba en ser "+super.profesión;
		return msj;
	}

	@Override
	public String habitar() {
		String msj = "David al ser clasificado y nacido como MORTAL, tiene su hogar en el este del planeta";
		return msj;
	}

	@Override
	public String sentir() {
		String msj = "David tiene la capacidad de sentir la presencia de otros MORTALES.";
		return msj;
	}
	
	public String tenerGustos() {
		String msj = "David a pesar de haber escogido su profesion, tiene otro tipo de intereses como "+this.hobby+" debido a que su sueño frustrado era ser piloto profesional";
		return msj;
	}
	
	public String generarInformacionDavid() {
		String inf = "*****DAVID*****"+"\n"+"\n"+
                     "Acerca de David: "+"\n"+
			         "-- Estatura: "+super.estatura+" metros. \n"+
                     "-- Edad: "+super.edad+" años. \n"+
			         "-- Color de ojos: "+super.colorOjos+".\n"+
			         "-- Tipo de alma: "+super.alma+".\n"+
			         "-- Familia: "+tenerUnaFamilia()+".\n"+
			         "-- Habitad: "+habitar()+".\n"+
			         "-- Profesion: "+ejercerUnaProfesión()+".\n"+
			         "-- Alegias: "+this.alergia+".\n"+
			         "-- Gustos: "+tenerGustos()+".\n"+
			         "-- Conocimientos: "+adquirirConocimientos()+".\n"+"\n"+
			         "capacidades: "+ "\n"+
			         "\t-- "+sentir();
		return inf;
	}
	

}
