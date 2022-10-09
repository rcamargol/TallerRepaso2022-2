package co.edu.unbosque.model;

public class Mortal extends Kublakan {
	
	protected String profesion, familia;

	public Mortal(int edad, double estatura, String colorO, String alma, String profesion, String familia) {
		super(edad, estatura, colorO, alma);
		this.colorO = "Violeta";
		this.profesion = profesion;
		this.familia = familia;
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Habita en el norte del planeta";
				
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Solo siente a los demás mortales";
	}
	
	public String adquirirC() {
		
		return "Puede aprender";
		
	}
	
	public String tenerF() {
		
		return familia;
		
	}
	
	public String ejercerp() {
		
		return profesion;
		
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return this.edad;
	}

	@Override
	public double getEstatura() {
		// TODO Auto-generated method stub
		return this.estatura;
	}

	@Override
	public String getColorO() {
		// TODO Auto-generated method stub
		return this.colorO;
	}

	@Override
	public String getAlma() {
		// TODO Auto-generated method stub
		return this.alma;
	}
			

}
