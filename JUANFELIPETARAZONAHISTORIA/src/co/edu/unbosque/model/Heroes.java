package co.edu.unbosque.model;

public class Heroes extends KublaKan{
	
	public Heroes(int edad, int estatura, String ojos, boolean alma) {
		super(edad, estatura, ojos, alma);
		// TODO Auto-generated constructor stub
		this.estatura = 3;
	}
	
	public String habitar(){
		return "viven al norte ";
	}
	
	public String sentir(){
		return "se sienten a si mismos y a otros seres";                  
	}
	
	
	
	public String volar(){
		return "";
	}
	public String crearFuego(){
		return "";
	}
	public String detenerTiem(){
		return "";
	}
}
