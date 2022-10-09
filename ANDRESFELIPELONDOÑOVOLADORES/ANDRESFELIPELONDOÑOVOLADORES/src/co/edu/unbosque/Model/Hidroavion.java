package co.edu.unbosque.Model;

public class Hidroavion extends VehiculoAereo{

	private String flotadores ;
	
	public Hidroavion() {
		super.color = "azul, el mejor color del mundo";
		super.motor = true;
		this.flotadores = "Tengo 2 flotadores que me permiten flotar en el agua ";
	}
	
	@Override
	public String volar() {
		return "Puedo volar, mucho mas veloz que mi primo helicoptero.";
	}
	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Puedo aterrizar en el agua de la forma mas epica posible";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "Para volar tengo que despegar aumentando la velocidad de mis motores";
	}
	@Override
	public String encender() {
		// TODO Auto-generated method stub
		return "Todos los dias antes de trabajar primero tengo que encenderme, "+"\n"
				+ "cuando estoy encendido puedo volar en mi mayor capacidad";
	}
	String flotar() {
		// TODO Auto-generated method stub
		return "Puedo flotar en el agua lo que me hace mas cool que mi primo helicoptero B) ";
	}
	
	
	public String descHidroavion() {
		return "Soy un hidroavion, soy color "+color+", muchos creen que no tengo vida pero no pueden estar mas equivocados, "+"\n"+
				"los humanos me caen bien, es divertido volar con ellos " +"\n"+ flotadores+ "\n"+
				volar()+ "\n" +
				encender() + "\n" +
				flotar() + "\n" +
				despegar() + "\n" +
				aterrizar();
}

}