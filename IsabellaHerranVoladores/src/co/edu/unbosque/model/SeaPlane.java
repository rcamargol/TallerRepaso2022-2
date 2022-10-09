package co.edu.unbosque.model;

public class SeaPlane extends AirPlane{
	
	protected String superficie;
	
	public SeaPlane() {
		super.combustible = "Petroleo";
		super.longitudalas = 5;
		this.superficie = "Flotadores";
	}

	@Override
	public String toTakeOff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toLand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toFly() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String movilizarObjetos() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
}
