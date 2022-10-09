package co.edu.unbosque.model;

public class Kira extends Heroes{
	
	private boolean magia;
	private int mortales_salvados;

	public Kira(int edad, int estatura, String ojos, boolean alma) {
		super(edad, estatura, ojos, alma);
		// TODO Auto-generated constructor stub
		this.magia = true;
		this.mortales_salvados = 14;
	}
	
	public String volar(){
		return ", ella vuela mucho en CynusX1,";
	}
	public String crearFuego(){
		return " crea fuego frecuentemente, ";
		
	}
	public String detenerTiem(){
		return " no le gusta detener el tiempo,";
	}
	
	
	public String hab_magicas(){
		if(magia == true){
			return " conoce sobre magia de destruccion y de curacion,";
		}
		else{
			return "No es maga";
		}
	}
	public String salvar(){
		return " ha salvado a "+mortales_salvados+" Mortales";
	}

	public boolean isMagia() {
		return magia;
	}

	public void setMagia(boolean magia) {
		this.magia = magia;
	}

	public int getMortales_salvados() {
		return mortales_salvados;
	}

	public void setMortales_salvados(int mortales_salvados) {
		this.mortales_salvados = mortales_salvados;
	}
	
	

}
