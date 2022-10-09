package co.edu.unbosque.model;

public class Astar extends Heroes {
	
	private int enemigosDerrotados;
	private int personasRescatadas;

	public Astar(int edad, double estatura, String colorOjos, boolean alma, String nombre, String genero) {
		super(edad, estatura, colorOjos, alma, nombre, genero);
		this.nombre ="Astar";
		this.alma = true;
		this.edad = 32;
		this.colorOjos = "azules";
		this.genero = "Masculino";
		this.setEnemigosDerrotados(24);
		this.setPersonasRescatadas(1500);
	}

	public int getEnemigosDerrotados() {
		return enemigosDerrotados;
	}

	public void setEnemigosDerrotados(int enemigosDerrotados) {
		this.enemigosDerrotados = enemigosDerrotados;
	}

	public int getPersonasRescatadas() {
		return personasRescatadas;
	}

	public void setPersonasRescatadas(int personasRescatadas) {
		this.personasRescatadas = personasRescatadas;
	}

	@Override
	public String toString() {
		return "nombre: " + nombre +"\n" 
				+ "genero: " + genero +"\n"
				+ "edad: " + edad +"\n"
				+ "estatura: " + estatura +"\n"
				+ "color de ojos: " + colorOjos +"\n"
				+ "alma: " + alma +"\n"
				+ "Ubicacion: " + habitarRegion() +"\n"
				+ "Dato: " + sentir() +"\n"
				+ "Habilidades: " +"\n"
				+ volar() +"\n"
				+ crearFuego() +"\n"
				+ detenerTiempo() +"\n"
				+ "Enemigos Derrotados: " + enemigosDerrotados +"\n" 
				+ "Personas Rescatadas: " + personasRescatadas;
				
				
	}

}
