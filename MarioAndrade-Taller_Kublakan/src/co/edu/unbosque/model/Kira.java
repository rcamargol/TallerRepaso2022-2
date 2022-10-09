package co.edu.unbosque.model;

public class Kira extends Heroes {

	public String magia;
	public String luz;
	
	public Kira(int edad, double estatura, String colojos, String alma, String magia, String luz) {
		super(edad, estatura, colojos, alma);
		// TODO Auto-generated constructor stub
		this.magia = magia;
		this.luz = luz;
	
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
	
	public String crerayos() {
		return null;
	}
	public String invotormentas() {
		return null;
}
	public String getMagia() {
		return magia;
	}
	public void setMagia(String magia) {
		this.magia = magia;
	}
	public String getLuz() {
		return luz;
	}
	public void setLuz(String luz) {
		this.luz = luz;
	}
}
