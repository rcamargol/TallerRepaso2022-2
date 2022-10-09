package co.edu.unbosque.model;

public class Mario extends Mortales {

	public String leer;
	public String escribir;
	public String vendedor;
	
	public Mario(int edad, double estatura, String colojos, String alma, String adconocimiento,String familia,String leer, String escribir, String vendedor) {
		super(edad, estatura, colojos, alma);
		// TODO Auto-generated constructor stub
		this.leer = leer;
		this.escribir = escribir;
		this.vendedor = vendedor;
			
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
	public String pensar() {
		return null;
	}
	public String negociar() {
		return null;
	}
	public String getLeer() {
		return leer;
	}
	public void setLeer(String leer) {
		this.leer = leer;
	}
	public String getEscribir() {
		return escribir;
	}
	public void setEscribir(String escribir) {
		this.escribir = escribir;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	
}