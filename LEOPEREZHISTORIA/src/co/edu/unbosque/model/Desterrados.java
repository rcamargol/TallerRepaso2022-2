package co.edu.unbosque.model;

public class Desterrados extends Kublakan {
	
	private String estado;
	
	
	
	public Desterrados(int edad, double estatura, String colorOjos, boolean alma, String estado) {
		super(edad, estatura, colorOjos, alma);
		this.alma = false;
		this.setEstado("Triste");
	}

	@Override
	public String habitarRegion() {
		// TODO Auto-generated method stub
		return "Habita el extremo sur del planeta" ;
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "No siente nada aparte de a el mismo";
	}
	
	public String arrastrar() {
		return "Se arrastraban de un lugara a otro";
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
