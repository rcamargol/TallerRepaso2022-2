package co.edu.unbosque.model;

public class Pajaro extends Animal implements Volador{

	private int numHuevos;
	private String especie;
	
	public Pajaro() {
		super.alimentacion = "semillas";
		especie = "carpintero";
		numHuevos = 2;
	}
	
	
	public String construirNido() {
		String msj = "El pajaro "+especie+" excava su propio nido en el tallo de los arboles, a puesto ese se hace los mejores muebles.";
		return msj;
	}
	
	public String ponerHuevos() {
		String msj2 = "El pajaro "+especie+" puede poner una nidada de "+numHuevos+" huevos, de malas con la cuota alimentaria.";
		return msj2;
	}
	
	@Override
	public String despegar() {
		String msj3 = "El pajaro "+especie+" despega en cualquier direccion de manera muy agil, ese no le pone problema a nada.";
		return msj3;
	}

	@Override
	public String aterrizar() {
		String msj4 = "El pajaro "+especie+" aterriza de manera expontanea de cualquier direccion sin problema, ese bicho le sabe a todo.";
		return msj4;
	}

	@Override
	public String volar() {
		String msj5 = "El pajaro "+especie+" puede volar a una altura de 1000 metros como maximo, o eso decian en las caricaturas.";
		return msj5;
	}

	@Override
	public String comer() {
		String msj6 = "El pajaro "+especie+" puede comer variedad de "+super.alimentacion+", ese parcero esta modo fitness.";
		return msj6;
	}
	
	public String generarInformacionPajaro() {
		String msj6 = "****PAJARO****"+"\n"+
                "- "+construirNido()+"\n"+
			    "- "+volar()+"\n"+
                "- "+ponerHuevos()+"\n"+
                "- "+despegar()+"\n"+
			    "- "+aterrizar()+"\n"+
                "- "+comer();
	   return msj6;
	}

}
