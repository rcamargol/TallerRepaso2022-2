package co.edu.unbosque.model;

public class Kira extends Heroes {
	
	private int Nplanetasrecorridos;
	private  String Velocidadvuelo;

	public Kira(int edad, double estatura, String colorOjos, boolean alma, String nombre, String genero) {
		super(edad, estatura, colorOjos, alma, nombre, genero);
		this.nombre ="Kira";
		this.alma = true;
		this.edad = 32;
		this.colorOjos = "verdes";
		this.genero = "Femenino";
		this.setNplanetasrecorridos(13);
		this.setVelocidadvuelo("100km/h");
	}

	public int getNplanetasrecorridos() {
		return Nplanetasrecorridos;
	}

	public void setNplanetasrecorridos(int nplanetasrecorridos) {
		Nplanetasrecorridos = nplanetasrecorridos;
	}

	public String getVelocidadvuelo() {
		return Velocidadvuelo;
	}

	public void setVelocidadvuelo(String velocidadvuelo) {
		Velocidadvuelo = velocidadvuelo;
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
				+ "Numero de planetas recorridos: " + Nplanetasrecorridos +"\n" 
				+ "Velocidad de vuelo : " + Velocidadvuelo;
				
				
	}
}
