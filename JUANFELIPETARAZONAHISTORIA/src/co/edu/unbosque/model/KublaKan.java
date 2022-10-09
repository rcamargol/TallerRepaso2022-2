package co.edu.unbosque.model;

public abstract class KublaKan {
	
	protected int edad;
	protected int estatura;
	protected String ojos;
	protected boolean alma;
	
	public KublaKan(int edad, int estatura, String ojos, boolean alma){
		
		this.edad = edad;
		this.estatura = estatura;
		this.ojos = ojos;
		this.alma = alma;
	}
	
	public String habitar(){
		return "";
	}
	
	public String sentir(){
		return "";
	}
}
