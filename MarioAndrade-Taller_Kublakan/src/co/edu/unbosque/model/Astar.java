package co.edu.unbosque.model;

public class Astar extends Heroes {
	
	public String surfuerza;
	public String telequinesis;
	
	public Astar(int edad, double estatura, String colojos, String alma) {
		// TODO Auto-generated constructor stub
		super(edad, estatura, colojos, alma);
		// TODO Auto-generated constructor stub
		this.surfuerza = surfuerza;
		this.telequinesis = telequinesis;

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
	public String teletransportación() {
		return null;
	}
	public String nadar() {
		return null;
		
	}

	public String isSurfuerza() {
		return surfuerza;
	}

	public void setSurfuerza(String surfuerza) {
		this.surfuerza = surfuerza;
	}

	public String getTelequinesis() {
		return telequinesis;
	}

	public void setTelequinesis(String telequinesis) {
		this.telequinesis = telequinesis;
	}
}
