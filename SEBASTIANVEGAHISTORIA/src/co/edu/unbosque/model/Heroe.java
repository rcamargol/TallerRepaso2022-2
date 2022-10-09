package co.edu.unbosque.model;

public class Heroe extends Kublakan {

	protected String fuerza;
	
	public Heroe(int edad, double estatura, String colorO, String alma, String fuerza) {
		super(edad, estatura, colorO, alma);
		this.estatura = 3;
		this.fuerza = fuerza;
		
	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Habita en el norte del planeta";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Puede sentrise a si mismo y a otros";
	}
	
	public String volar() {
		
		return "Puede volar";
		
	}
	
	public String crearF() {
		
		return "Puede crear " + fuerza + " fuego"; 
		
	}
	
	public String detenerF(){
		
		return "Capacida de detener el tiempo: " + fuerza;
		
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
