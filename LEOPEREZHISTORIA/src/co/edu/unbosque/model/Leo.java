package co.edu.unbosque.model;

public class Leo extends Mortales {
	
	private String apellido;
	private int Ntitulos; 

	public Leo(int edad, double estatura, String colorOjos, boolean alma, String profesion, int Nfamiliares) {
		super(edad, estatura, colorOjos, alma, profesion, Nfamiliares);
		this.profesion ="Ninguna";
		this.alma = true;
		this.edad = 17;
		this.estatura = 1.75;
		this.Nfamiliares = 4;
		this.setApellido("Perez");
		this.setNtitulos(0);
	
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNtitulos() {
		return Ntitulos;
	}

	public void setNtitulos(int ntitulos) {
		Ntitulos = ntitulos;
	}

	@Override
	public String toString() {
		return "Nombre: Leo" +"\n"
				+ "Profesion: " + profesion +"\n" 
				+ "Numero de titulos: " + Ntitulos +"\n"
				+ "edad: " + edad +"\n"
				+ "estatura: " + estatura +"\n"
				+ "color de ojos: " + colorOjos +"\n"
				+ "alma: " + alma +"\n"
				+ "Ubicacion: " + habitarRegion() +"\n"
				+ "Dato: " + sentir() +"\n"
				+ "Acciones establecidas: " +"\n"
				+ ejercerProfesion() +"\n"
				+ adquirirConocimiento() +"\n"
				+ tenerFamilia();
				
				
				
	}
	
}
