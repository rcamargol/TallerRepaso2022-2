package co.edu.unbosque.model;

public class Mortales extends KublaKan{

	public Mortales(int edad, int estatura, String ojos, boolean alma) {
		super(edad, estatura, ojos, alma);
		// TODO Auto-generated constructor stub
		this.ojos = "violeta";
	}
	
	public String habitar(){
		return " viven al oeste ";
	}
	
	public String sentir(){
		return "sienten a otros mortales,";                  
	}
	
	
	public String adConocimiento(){
		return "";
	}
	public String tenerFamilia(){
		return "";
	}
	public String ejercerProf(){
		return "";
	}
	
	
}
