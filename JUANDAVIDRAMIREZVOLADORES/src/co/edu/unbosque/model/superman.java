package co.edu.unbosque.model;

public class superman extends Kryptoniano implements Volador{
	private String saltarEdificios;
	private String detenerbalas;	
	private String valiente;
	
	public superman() {
		super.belleza = "nivel de belleza alto";
		super.superFuerza= "posee la fur";
		this.valiente = "Posee un nivel de valentia elevado";
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


	public String getValiente() {
		return valiente;
	}


	public void setValiente(String valiente) {
		this.valiente = valiente;
	}


	public String getSaltarEdificios() {
		return saltarEdificios;
	}

	public void setSaltarEdificios(String saltarEdificios) {
		this.saltarEdificios = saltarEdificios;
	}

	public String getDetenerbalas() {
		return detenerbalas;
	}

	public void setDetenerbalas(String detenerbalas) {
		this.detenerbalas = detenerbalas;
	}

	@Override
	public String respirarenelespacio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return null;
	}


}
