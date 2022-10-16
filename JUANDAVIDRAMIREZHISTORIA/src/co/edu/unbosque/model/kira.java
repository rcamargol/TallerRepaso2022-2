package co.edu.unbosque.model;

public class kira extends Héroes {
	private String rayoslaser;
	private String supersalto;

	
	public kira() {

		super.edad= 50;
		super.alma= true;
		super.colorojos= "naranja";
		super.estatura= 3.00;
		super.Liderazgo="Este h�roes tiene mucha personalidad a la hora de liderar a sus compa�eros de batalla";
		super.Sabiduria="Posee un iq muy eleveado ";
		this.rayoslaser="este h�roe posee rayos l�ser";
		this.supersalto="Este H�roe posse supersalto";
		
	}

	public String habitar() {
		
		return "Habitan en Norte del planeta";
	}

	public String getRayoslaser() {
		return rayoslaser;
	}
	public void setRayoslaser(String rayoslaser) {
		this.rayoslaser = rayoslaser;
	}
	public String getSupersalto() {
		return supersalto;
	}
	public void setSupersalto(String supersalto) {
		this.supersalto = supersalto;
	}
	@Override
	public String crearFuego() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String detenerTiempo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String Sentir() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String Habitar() {
		// TODO Auto-generated method stub
		return null;
	}
}
