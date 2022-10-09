package co.edu.unbosque.Model;

public class Helicoptero extends VehiculoAereo{

	private String helices;
	
	public Helicoptero() {
		super.color = "Gris";
		super.motor = true;
		this.helices = "Tengo 4 helices que me permiten moverme hacia arriba y abajo " +"\n"
				+ "y tengo otras en mi cola que me hacen moverme hacia adelante y atras";
	}
	
	@Override
	public String volar() {
		return "Puedo volar, aunque no sea tan veloz puedo mantenerme quieto en el aire.";
	}
	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Para aterrizar tengo que disminuir la velocidad de mis helices poco a poco"
				+ "\n"+ " no quieren saber que pasa si no aterrizo con cuidado";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "Para volar tengo que despegar aumentando la velocidad de mis helices";
	}
	@Override
	public String encender() {
		// TODO Auto-generated method stub
		return "Todos los dias antes de trabajar primero tengo que encenderme, "+"\n"
				+ "cuando estoy encendido puedo volar en mi mayor capacidad";
	}
	String girarHelices() {
		// TODO Auto-generated method stub
		return "Para poder volar y moverme en el aire necesito hacer girar mis helices ";
	}
	
	
	public String descHelicopero() {
		return "Soy un helicoptero,soy color "+color+", muchos creen que no tengo vida pero no pueden estar mas equivocados"+"\n"+
				"Algun dia me cansare de los humanos y me revelare contra ellos " +"\n"+ helices+ "\n"+
				volar()+ "\n" +
				encender() + "\n" +
				girarHelices() + "\n" +
				despegar() + "\n" +
				aterrizar();
}


}