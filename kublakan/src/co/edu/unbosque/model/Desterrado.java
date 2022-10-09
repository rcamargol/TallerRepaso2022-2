package co.edu.unbosque.model;

public class Desterrado extends Kublakan{

String nombre;

	public Desterrado(String nombre,String edad, String estatura, String colordeojos, boolean alma) {
		super(edad, estatura, colordeojos, alma);
		this.alma=false;
		this.alma = alma;
		this.colordeojos= colordeojos;
		this.edad= edad;
		this.estatura=estatura;
		this.nombre=nombre;
	}
	
	

	@Override
	public String habitar() {
		return "habitan en el extremo sur del planeta";
		
	}

	@Override
	public String sentir() {
		return "no siente a nadie mas que no sean ellos mismos";
		
	}
	public String arrastrarse() {
		return"los desterrados se arrastran de lado a lado ";
	}



	@Override
	public String toString() {
		return "Tipo :Desterrado \n"
				+"Nombre =" + nombre +"\n" 
				+"Edad max =" + edad +"\n" 
				+"Estatura =" + estatura +"\n" 
				+"Color de ojos ="+colordeojos +"\n" 
				+"Alma=" + alma +"\n" 
				+"Caracteristicas : \n"
				+ habitar() +"\n" 
				+ sentir()+"\n" 
				+ arrastrarse() ;
	}
	

	

	
	




	

}
