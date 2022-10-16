package co.edu.unbosque.model;

public class Renk extends Desterrados{
	
	private boolean esclavo;
	private int tamaño;
	
	public Renk(int edad, int estatura, String ojos, boolean alma) {
		super(edad, estatura, ojos, alma);
		// TODO Auto-generated constructor stub
		this.esclavo = false;
		this.tamaño = 2;
		this.edad = 1500;
	}
	
	public String arrastrar(){
		return " el se arrastra por la arena, ";
	}
	
	public String tipo_trabajo(){
		
		if(esclavo == true){
			return " Recolectar especias de la arena ";
		}
		else {
			return " es un explorador ";
		}
	}
	
	public String medir_tam(){
		
		if(tamaño == 2) {
			return " tiene la altura promedio de un desterrado ";
		}
		else{
			return " Es un Mortal o Heroe ";
		}
	}

	public boolean isEsclavo() {
		return esclavo;
	}

	public void setEsclavo(boolean esclavo) {
		this.esclavo = esclavo;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
	
}
