package co.edu.unbosque.model;

public class Juan extends Mortales{
	
	private boolean leer;
	private String profesion;
	
	public Juan(int edad, int estatura, String ojos, boolean alma) {
		super(edad, estatura, ojos, alma);
		// TODO Auto-generated constructor stub
		this.leer = true;
		this.profesion = "Herrero";
	}
	
	public String adConocimiento(){
		return " el tiene conocimientos sobre herreria y agricultura,";		
	}
	public String tenerFamilia(){
		return " no tiene ni esposa ni hijos,";
	}
	public String ejercerProf(){
		return " es un "+profesion+" nato,";
	}
	
	
	public String lib_leidos(){
		
		if(leer == true){
			return " ha leido muchos libros sobre herreria,";
		}
		else {
			return " No lee libros ";
		}
	}
	public String fabric_arm(){
		return " forja Espadas y Lanzas ";
	}

	public boolean isLeer() {
		return leer;
	}

	public void setLeer(boolean leer) {
		this.leer = leer;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	
}
