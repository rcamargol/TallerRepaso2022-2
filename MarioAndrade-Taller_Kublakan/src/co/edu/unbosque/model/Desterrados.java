package co.edu.unbosque.model;

public class Desterrados extends Kublakan{

	public String comer;
    public String cazar;
	
	public Desterrados(int edad, double estatura, String colojos, String alma) {
		super(edad, estatura, colojos, alma);
		// TODO Auto-generated constructor stub
		this.edad = 1500;
		this.comer = comer;
		this.cazar = cazar;
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
	
	public String corrian() {
		return null;
	}
	
	public String arrastraban() {
		return null;
		
	}

	public String getComer() {
		return comer;
	}

	public void setComer(String comer) {
		this.comer = comer;
	}

	public String getCazar() {
		return cazar;
	}

	public void setCazar(String cazar) {
		this.cazar = cazar;
	}
}
	

