package co.edu.unbosque.model;

public abstract class KublaKan {
	
	protected int edad;
	protected double estatura;
	protected String colordeojos;
	protected boolean alma;
	
	public abstract String habitar();
	public abstract String sentir();
	
	
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
	public String getColordeojos() {
		return colordeojos;
	}
	public void setColordeojos(String colordeojos) {
		this.colordeojos = colordeojos;
	}
	public boolean isAlma() {
		return alma;
	}
	public void setAlma(boolean alma) {
		this.alma = alma;
	}
	
	
}
