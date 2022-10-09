package co.edu.unbosque.model;

public class Renk extends Desterrados {
	
	private String Veloarrastre;
	private String habitat;
	
	public Renk(int edad, double estatura, String colorOjos, boolean alma, String estado, String Velarrastre, String habitat) {
		super(edad, estatura, colorOjos, alma, estado);
		this.edad = 856;
		this.estatura = 2.12;
		this.colorOjos = "gris";
		this.setVelarrastre("10km/h");
		this.setHabitat("basureros");
	
		
	}
	public String listarRenk() throws Edadexcep  {
		 if (edad > 1500){
		throw new Edadexcep("uy ¿Que carajos paso aqui");
		}
		 return "";
	}
		  
	public String getVelarrastre() {
		return Veloarrastre;
	}

	public void setVelarrastre(String veloarrastre) {
		Veloarrastre = veloarrastre;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	@Override
	public String toString() {
		return "Nombre: Renk" +"\n"
				+ "edad: " + edad +"\n"
				+ "estatura: " + estatura +"\n"
				+ "color de ojos: " + colorOjos +"\n"
				+ "alma: " + alma +"\n"
				+ "Ubicacion: " + habitarRegion()+ " mas especificamente en: " +"\n"
				+ habitat +"\n"
				+ "Dato: " + sentir() +"\n"
				+ "Acciones establecidas: " +"\n"
				+ arrastrar();
				
				
				
	}

}
 