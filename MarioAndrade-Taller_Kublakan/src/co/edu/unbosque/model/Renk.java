package co.edu.unbosque.model;

public class Renk extends Desterrados  {
	
	public String guardian;
	public String jefe;
	
	public Renk(int edad, double estatura, String colojos, String alma, String guardian, String jefe) {
		super(edad, estatura, colojos, alma); 
		// TODO Auto-generated constructor stub
		this.guardian = guardian;
		this.jefe = jefe;

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
	public String gobernar() {
		return null;
	}
	public Object sabio() {
		return null;
	}
	public String getGuardian() {
		return guardian;
	}
	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	public String isOjosverdes() {
		return jefe;
	}
	public void setOjosverdes(String ojosverdes) {
		this.jefe = ojosverdes;
	}
}

