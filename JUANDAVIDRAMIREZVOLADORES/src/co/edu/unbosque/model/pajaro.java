package co.edu.unbosque.model;

public class pajaro extends animal implements Volador{
	
	
	private String colorplumas;
	private String Armarnido;
	private String ponerhuevos;
	

	public pajaro() {

     colorplumas="naranjas";	
     this.belleza="nivel de bellleza alto";
	}
	
	public String tenerCrias() {
		return null;
	}
	public String almentarCrias() {
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

	public String getColorplumas() {
		return colorplumas;
	}

	public void setColorplumas(String colorplumas) {
		this.colorplumas = colorplumas;
	}

	public String getArmarnido() {
		return Armarnido;
	}

	public void setArmarnido(String armarnido) {
		Armarnido = armarnido;
	}

	public String getPonerhuevos() {
		return ponerhuevos;
	}

	public void setPonerhuevos(String ponerhuevos) {
		this.ponerhuevos = ponerhuevos;
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
