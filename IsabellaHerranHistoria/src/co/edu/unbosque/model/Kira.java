package co.edu.unbosque.model;

public class Kira extends Heroes{
	
	private String belleza;
	private String justicia;
	
	public Kira() {
		super.edad = 17;
		super.estatura = 2;
		super.valentia = "muy valiente";
		super.honestidad = "mentirosa";
		super.alma = true;
		super.colordeojos = "caramelo";
		this.belleza = "gran belleza";
		this.justicia = "dura justicia";
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
	
	public void encantar() {
		
	}
	
	public void curar() {
		
	}

	public String getBelleza() {
		return belleza;
	}

	public void setBelleza(String belleza) {
		this.belleza = belleza;
	}

	public String getJusticia() {
		return justicia;
	}

	public void setJusticia(String justicia) {
		this.justicia = justicia;
	}
	
	
}
