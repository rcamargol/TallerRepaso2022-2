package co.edu.unbosque.model;

public abstract class Kublakan {

	protected int edad; 
	protected double estatura; 
	protected String colojos; 
	protected String alma;
	
	public Kublakan(int edad, double estatura, String colojos, String alma) {
		super();
		this.edad = edad;
		this.estatura = estatura;
		this.colojos = colojos;
		this.alma = alma;
		
	}
	
	public abstract boolean habitar();
	public abstract	boolean sentir();

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public String getColojos() {
		return colojos;
	}

	public void setColojos(String colojos) {
		this.colojos = colojos;
	}

	public String isAlma() {
		return alma;
	}

	public void setAlma(String alma) {
		this.alma = alma;
	}
	
}
