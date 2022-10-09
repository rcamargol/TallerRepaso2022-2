package co.edu.unbosque.model;

public class Mortal extends Descendiente {
	
	private int numfamiliares;
	private String especializacion;
	private String profesion;
	
	public Mortal() {
		this.numfamiliares = 0;
		this.especializacion = "";
		this.profesion = "";
	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Habito en el este del planeta";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Siento la presencia de otros mortales";
	}

	public int getNumfamiliares() {
		return numfamiliares;
	}

	public void setNumfamiliares(int numfamiliares) {
		this.numfamiliares = numfamiliares;
	}

	public String getEspecializacion() {
		return especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	@Override
	public String toString() {
		return "Mi color de ojos es " + colordeojos;
	}
	
	
	
	
	
	
	
	

}
