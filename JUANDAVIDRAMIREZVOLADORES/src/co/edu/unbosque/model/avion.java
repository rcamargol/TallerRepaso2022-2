package co.edu.unbosque.model;

public abstract class avion extends vehiculo implements Volador {
	
	private String Costoso;
	
	public avion() {
		this.Costoso="muy costoso";
		super.comodidad="muy comodo";
	}

	public String getCostoso() {
		return Costoso;
	}

	public void setCostoso(String costoso) {
		Costoso = costoso;
	}

	@Override
	public String Volador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Volar() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getComodidad() {
		return comodidad;
	}

	public void setComodidad(String comodidad) {
		this.comodidad = comodidad;
	}

	@Override
	public String movilizar() {
		// TODO Auto-generated method stub
		return null;
	}

}
