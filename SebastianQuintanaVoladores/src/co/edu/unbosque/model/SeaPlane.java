package co.edu.unbosque.model;

public class SeaPlane extends AirPlane {
	protected String zonaVuelo;
	public SeaPlane() {
		super.marca = "Boeing 737";
		super.piesAltura ="los aviones de agua tienden a volar casi siempre al nivel del mar, o a unos cuantos pies de altura, no muy alto " ;
		this.zonaVuelo ="tiende a volar en zonas costeras" ;
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "se desliza por el mar hasta lograr despegar sus flotadores del mar ";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "al queres aterrizar, revisa que haya una zona con mar para decender del cielo y aterrizar sobre sus flotadores en el mar" ;
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Al volar utiliza sus alas para saber hacia que direccion ir y poder planear";
	}

	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return "al estar en el aire , puede aumentar su velocidad en el aire acelerando el motor";
	}
	@Override
	public String transportar() {
		// TODO Auto-generated method stub
		return "los helicopteros transportan generalmente turistas";
	}
	public String deslizar() {
		// TODO Auto-generated method stub
		return "los aviones pueden deslizarce sobre el agua , llegando a chapotear un poco dependiendo de la velocidad";
	}
	public String toString() {
		return "Marca:  " + marca + "\n" +"Pies de altura: "+piesAltura+ "\n" +
				"Zona de Vuelo: " + zonaVuelo  + "\n" +
				despegar() + "\n" + 
				aterrizar() + "\n"  +
				volar() + "\n"  +
			     acelerar() + "\n"+
			     transportar()+"\n"+
			     deslizar()+"\n";
	}
}
