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
		super.profesion= "Ingeniero de sistemas";
		this.alergia= "Ninguna";
		this.hobby= "ver competencias automovilisticas";
	}

	@Override
	public String adquirirConocimientos() {
		String msj = "David para poder aprender sobre su profesion tuvo que especializarse en el conocimiento matematico y desarrollar su l�gica";
		return msj;
	}

	@Override
	public String tenerUnaFamilia() {
		String msj = "David tiene una familia de "+super.integrantesFamilia+" integrantes, una esposa y dos hijos";
		return msj;
	}

	@Override
	public String ejercerUnaProfesion() {
	    String msj = "David a sus 17 a�os decidio que su profesion estaba en ser "+super.profesion;
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
		String msj = "David a pesar de haber escogido su profesion, tiene otro tipo de intereses como "+this.hobby+" debido a que su sue�o frustrado era ser piloto profesional";
		return msj;
	}
	
	public String generarInformacionDavid() {
		String inf = "*****DAVID*****"+"\n"+"\n"+
                     "Acerca de David: "+"\n"+
			         "-- Estatura: "+super.estatura+" metros. \n"+
                     "-- Edad: "+super.edad+" a�os. \n"+
			         "-- Color de ojos: "+super.colorOjos+".\n"+
			         "-- Tipo de alma: "+super.alma+".\n"+
			         "-- Familia: "+tenerUnaFamilia()+".\n"+
			         "-- Habitad: "+habitar()+".\n"+
			         "-- Profesion: "+ejercerUnaProfesion()+".\n"+
			         "-- Alegias: "+this.alergia+".\n"+
			         "-- Gustos: "+tenerGustos()+".\n"+
			         "-- Conocimientos: "+adquirirConocimientos()+".\n"+"\n"+
			         "capacidades: "+ "\n"+
			         "\t-- "+sentir();
		return inf;
	}
	

}
