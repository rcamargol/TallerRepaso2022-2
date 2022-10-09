package co.edu.unbosque.model;

public class Aves extends Animales implements Volador{
	
	private String color;
	
	public Aves() {
		color = "Depende del grado de daltonismo que tenga, casi siempre son azules, pero las ven verdes.";	
		pelaje = "Tiene plumas.";
	}
	
	public String contruirNido() {
		return"Solamente con varitas magicas de oro.";
	}
	public String ponerHuevos() {
		return"Pone huevos de 5 metros de alto.";
	}
	public String migrar() {
		return "Cada año.";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "Despegan cuando van a volar.";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Atrrizan cuando se caen.";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Vuelan por el piso.";
	}

	@Override
	public String recorrerDistancia() {
		// TODO Auto-generated method stub
		return "Le pueden dar la vuelta al mundo en 80 dias.";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "Comen plantas voladoras.";
	}

	@Override
	public String dormir() {
		// TODO Auto-generated method stub
		return "Duermen con los ojos cerrados.";
	}

	public String escribirMensajeAves() {
		return " -Color: " + color + "\n" +  " -Pelaje: " + pelaje + "\n" + " -Construir nido: " + contruirNido() + "\n"
			  +" -Poner huevos: " + ponerHuevos() + "\n" +  " -Despegar: " + despegar() + "\n" + " -Aterrizar: " + aterrizar() + "\n"
			  +" -Volar: " + volar() + "\n" +  " -Recorrer distancia: " + recorrerDistancia()  + "\n" + " -Comer: " + comer() + "\n"
			  +" -Dormir: " + dormir() + "\n" + " -Migran: " + migrar();

	}

}
