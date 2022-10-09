package co.edu.unbosque.model;

public class Astar extends Heroes{
	
	private int enem_derrotados;
	private int lugares_conq;

	public Astar(int edad, int estatura, String ojos, boolean alma) {
		super(edad, estatura, ojos, alma);
		// TODO Auto-generated constructor stub
		this.enem_derrotados = 30;
		this.lugares_conq = 61;
	}
	
	public String volar(){
		return ", vuela frecuentemente en CynusX1,";
	}
	public String crearFuego(){
		return " crea fuego muy pocas veces,";
		
	}
	public String detenerTiem(){
		return " detiene el tiempo como estrategia,";
	}
	
	public String luchar(){
		return " ha luchado con mas de "+enem_derrotados+" enemigos,";
	}
	public String explorar(){
		return " ha conquistado "+ lugares_conq+" asentamientos y colonias";
	}

	public int getEnem_derrotados() {
		return enem_derrotados;
	}

	public void setEnem_derrotados(int enem_derrotados) {
		this.enem_derrotados = enem_derrotados;
	}

	public int getLugares_conq() {
		return lugares_conq;
	}

	public void setLugares_conq(int lugares_conq) {
		this.lugares_conq = lugares_conq;
	}
	
	
}
