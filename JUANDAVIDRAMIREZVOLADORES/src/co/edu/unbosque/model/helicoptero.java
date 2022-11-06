package co.edu.unbosque.model;

public class helicoptero extends avion{
	
	private String aerodinamico;
	
	public helicoptero() {
		super.comodidad="su nivel de comonidad es aceptable";
		this.aerodinamico="es el vehiculo mas aerodinamico de todos";
		
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
	public String getAerodinamico() {
		return aerodinamico;
	}
	public void setAerodinamico(String aerodinamico) {
		this.aerodinamico = aerodinamico;
	}


	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
