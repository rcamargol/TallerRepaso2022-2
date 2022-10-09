package co.edu.unbosque.model;

public class Mortales extends Kublakan {
	
	
	protected String profesion;
	protected int Nfamiliares;

	public Mortales(int edad, double estatura,String colorOjos, boolean alma, String profesion, int Nfamiliares) {
		super(edad, estatura, colorOjos, alma);
		this.colorOjos = "violeta";
	}
	
	@Override
	public String habitarRegion() {
		// TODO Auto-generated method stub
		return "Habita en el Este del planeta";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Siente la precensia de otros mortales";
	}
	public String adquirirConocimiento() {
		return "adquirir conocimiento";
	}
	public String tenerFamilia() {
		return "tener familia";
	}
	
	public String ejercerProfesion() {
		return "ejercer profesion";
	}

	
	

	
	
}
