package co.edu.unbosque.model;

public class Helicopter extends AirPlane{
	
	private double medida;
	
	public Helicopter() {
		super.combustible = "Petroleo";
		super.longitudalas = 3;
		this.medida = 15;
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

	public double getMedida() {
		return medida;
	}

	public void setMedida(double medida) {
		this.medida = medida;
	}
}