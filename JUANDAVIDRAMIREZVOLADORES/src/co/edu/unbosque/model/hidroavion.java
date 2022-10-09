package co.edu.unbosque.model;

public class hidroavion extends avion {
	
	protected String superficie;
	
	public hidroavion() {
		super.comodidad="no es muy comodo para el usuario";
		this.superficie="Flotadores";
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
	public String getSuperficie() {
		return superficie;
	}
	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
