package co.edu.unbosque.model;

public class Astar extends Heroes{
	
	private String fuerza;
	private String inteligencia;
	
	public Astar() {
		super.edad = 50;
		super.estatura = 1.75;
		super.valentia = "cobarde";
		super.honestidad = "honesto";
		super.alma = true;
		super.colordeojos = "rojos";
		this.fuerza = "extremadamente fuerte";
		this.inteligencia = "tonto";
	}

	@Override
	public void volar() {
		
	}

	@Override
	public void crearFuego() {
		
	}

	@Override
	public void detenerTiempo() {
		
	}
	
	public void aplastar() {
		
	}
	
	public void desaparecer() {
		
	}

	public String getFuerza() {
		return fuerza;
	}

	public void setFuerza(String fuerza) {
		this.fuerza = fuerza;
	}

	public String getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(String inteligencia) {
		this.inteligencia = inteligencia;
	}
}