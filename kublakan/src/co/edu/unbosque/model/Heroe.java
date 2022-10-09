package co.edu.unbosque.model;

public class Heroe extends Kublakan {
	private String nombre;

	public Heroe(String nombre,String edad, String estatura, String colordeojos, boolean alma) {
		super(edad, estatura, colordeojos, alma);
		this.alma = alma;
		this.colordeojos= colordeojos;
		this.edad= edad;
		this.estatura= estatura;
		this.nombre=nombre;
	
	}

	@Override
	public String habitar() {
		return "habitan en el norte del planeta";
	}
	@Override
	public String sentir() {
		return "sienten a ellos mismo y a seres de otros mundos";
		
	}
	public String volar() {
		return "tiene la habilidad de volar por los aires";
	}
	public String creacion() {
		return "pueden crear fuego  con sus manos";
	}
	public String detener() {
		return "pueden detener el tiempo";
	}

	@Override
	public String toString() {

	return " tipo: Heroe \n"
	+ " Nombre =" + nombre + "\n"
	+ " Edad max=" + edad + "\n"
	+ " Estatura =" + estatura + "\n"
	+ " Color de ojos =" + colordeojos + "\n"
	+ " Alma =" + alma + "\n"
	+ " Caracteristicas :" + "\n"
	+ habitar() + "\n"
	+ sentir() + "\n"
	+ volar() + "\n"
	+ creacion() + "\n"
	+ detener()  ;
	
	}
	
	

}
