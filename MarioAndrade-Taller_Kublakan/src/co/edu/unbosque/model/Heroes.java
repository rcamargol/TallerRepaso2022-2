package co.edu.unbosque.model;

public class Heroes extends Kublakan{
	
	private String volar;
	private String crefuego;
	private String detetiempo;
	
	public Heroes(int edad, double estatura, String colojos, String alma) {
		super(edad, estatura, colojos, alma);
		// TODO Auto-generated constructor stub
		this.volar = volar;
		this.crefuego = crefuego;
		this.detetiempo = detetiempo;
		
	}
	
	@Override
	public boolean habitar() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean sentir() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String luchar(){
		return null;
	}
	
	public String poderes() {
		return null;
}

	public String getVolar() {
		return volar;
	}

	public void setVolar(String volar) {
		this.volar = volar;
	}

	public String getCrefuego() {
		return crefuego;
	}

	public void setCrefuego(String crefuego) {
		this.crefuego = crefuego;
	}

	public String getDetetiempo() {
		return detetiempo;
	}

	public void setDetetiempo(String detetiempo) {
		this.detetiempo = detetiempo;
	}	
	
}
