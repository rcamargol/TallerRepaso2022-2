package co.edu.unbosque.model;

public class CynusX1 {
	
	private Kira ki;
	private Astar a;
	private Renk r;
	private Andres an;	
	private int edad;
	private double estatura;
	private String color_ojos;
	private boolean alma;
	private String nombre;
	
	public Kira getKi() {
		return ki;
	}

	public void setKi(Kira ki) {
		this.ki = ki;
	}

	public Astar getA() {
		return a;
	}

	public void setA(Astar a) {
		this.a = a;
	}

	public Renk getR() {
		return r;
	}

	public void setR(Renk r) {
		this.r = r;
	}

	public Andres getAn() {
		return an;
	}

	public void setAn(Andres an) {
		this.an = an;
	}
	
	public void iniciarDatos() {
		darValoresKira();
		darValoresAstar();
		darValoresRenk();
		darValoresAndres();
	}
	
	public void crearKira( int edad, double estatura, String color_ojos, boolean alma, String nombre ) {
		ki = new Kira(edad,estatura, color_ojos, alma, nombre);
	}
	
	public void darValoresKira () {
		edad = 0;
		estatura = 3;
		color_ojos = "";
		alma = false;
		nombre = "Kira";
		crearKira(edad, estatura, color_ojos, alma, nombre);
	}
	
	public void crearAstar(int edad, double estatura, String color_ojos, boolean alma, String nombre ) {
		a = new Astar(edad,estatura, color_ojos, alma, nombre);
	}

	public void darValoresAstar () {
		edad = 0;
		estatura = 3;
		color_ojos = "";
		alma = false;
		nombre = "Aztar";
		crearAstar(edad, estatura, color_ojos, alma, nombre);
	}
	
	public void crearRenk(int edad, double estatura, String color_ojos, boolean alma, String nombre ) {
		r = new Renk(edad,estatura, color_ojos, alma, nombre);
	}

	public void darValoresRenk () {
		edad = 1500;
		estatura = 0;
		color_ojos = "";
		alma = false;
		nombre = "Renk";
		crearRenk(edad, estatura, color_ojos, alma, nombre);
	}
	
	public void crearAndres(int edad, double estatura, String color_ojos, boolean alma, String nombre ) {
		an = new Andres(edad,estatura, color_ojos, alma, nombre);
	}

	public void darValoresAndres () {
		edad = 19;
		estatura = 1.65;
		color_ojos = "Violeta";
		alma = true;
		nombre = "Andres";
		crearAndres(edad, estatura, color_ojos, alma, nombre);
	}
	
	
}
