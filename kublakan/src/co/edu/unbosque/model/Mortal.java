package co.edu.unbosque.model;

public class Mortal  extends Kublakan{

	private String nombre;

	public Mortal(String nombre,String edad, String estatura, String colordeojos, boolean alma) {
		super(edad, estatura, colordeojos, alma);
		this.alma = alma;
		this.colordeojos= colordeojos;
		this.edad= edad;
		this.estatura=estatura;
		this.nombre= nombre;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String habitar() {
		return"habitan en el este del plantea";
		
	}

	@Override
	public String sentir() {
		return "pueden sentir la presenceia de otros mortales";
		
	}
	public String obtenerconocimiento() {
		return "los mortales tienen la capacidad de obtener conocimiento";
	}
	public String formacion() {
		return"los mortales tienen la capacidad de formar una familia";
	}
	public String trabajar() {
		return "los mortales poseen la capacidad de ejerceer una profesion";
	}

	@Override
	public String toString() {
		return " tipo: Mortal \n"
				+ " Nombre =" + nombre + "\n"
				+ " Edad max =" + edad + "\n"
				+ " Estatura =" + estatura + "\n"
				+ " Color de ojos =" + colordeojos + "\n"
				+ " Alma =" + alma + "\n"
				+ " Caracteristicas :" + "\n"
				+ habitar() + "\n"
				+ sentir() + "\n"
				+ obtenerconocimiento() + "\n"
				+ formacion() + "\n"
				+ trabajar() ;
	}


	
	
	
	
}
