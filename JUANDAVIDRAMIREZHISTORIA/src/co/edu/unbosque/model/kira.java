package co.edu.unbosque.model;

public class kira extends Héroes {
	private String rayosláser;
	private String supersalto;

	
	public kira() {

		super.edad= 50;
		super.alma= true;
		super.colorojos= "naranja";
		super.estatura= 3.00;
		super.Liderazgo="Este héroes tiene mucha personalidad a la hora de liderar a sus compañeros de batalla";
		super.Sabiduria="Posee un iq muy eleveado ";
		this.rayosláser="este héroe posee rayos láser";
		this.supersalto="Este Héroe posse supersalto";
		
	}

	public String habitar() {
		
		return "Habitan en Norte del planeta";
	}

	public String getRayosláser() {
		return rayosláser;
	}
	public void setRayosláser(String rayosláser) {
		this.rayosláser = rayosláser;
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
