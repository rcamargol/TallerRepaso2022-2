package co.edu.unbosque.model;

public class Desterrados extends KublaKan{

	public Desterrados(int edad, int estatura, String ojos, boolean alma) {
		super(edad, estatura, ojos, alma);
		// TODO Auto-generated constructor stub
		this.edad = 1000;
	}
	
	public String habitar(){
		return " viven al extremo sur";
	}
	
	public String sentir(){
		return " no sienten a nadie mas que a ellos mismos,";               
	}
	
	public String arrastrar(){
		return "";
	}

}
