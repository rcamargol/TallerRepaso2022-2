package co.edu.unbosque.model;

public class helicoptero extends avion{
	
	private String aerodinámico;
	
	public helicoptero() {
		super.comodidad="su nivel de comonidad es aceptable";
		this.aerodinámico="es el vehiculo mas aerodinamico de todos";
		
	}
	
	
	public String compensacionVuelo() {
		return null;
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
	public String getAerodinámico() {
		return aerodinámico;
	}
	public void setAerodinámico(String aerodinámico) {
		this.aerodinámico = aerodinámico;
	}


	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
