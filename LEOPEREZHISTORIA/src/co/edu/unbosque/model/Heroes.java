package co.edu.unbosque.model;

public class Heroes extends Kublakan {
	
	
	protected String nombre;
	protected String genero;

	public Heroes(int edad, double estatura, String colorOjos, boolean alma, String nombre, String genero) {
		super(edad, estatura, colorOjos, alma);
		this.estatura = 3;
		
	}
	 
	public String volar() {
		 return "Volar";
	 }
	
	 public String crearFuego() {
		 return "Crear fuego";
	 }
	 
	 public String detenerTiempo() {
		 return "Detener el tiempo ";
	 }
	 public String getNombre() {
			return nombre;
	 }
	 public void setNombre(String nombre) {
			this.nombre = nombre;
		
	 }

	@Override
	public String habitarRegion() {
		return "Norte";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "sienten a sí mismos y a seres de otros mundos.";
	}
	 
	 
}
