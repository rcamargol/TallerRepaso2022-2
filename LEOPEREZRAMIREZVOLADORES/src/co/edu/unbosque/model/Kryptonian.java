package co.edu.unbosque.model;

public class Kryptonian extends Animal {
	
	protected String powers;

	public Kryptonian(String powers) {
		this.powers = powers;
	}


	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String hideInentity() {
		return null;
	}


	public String getPowers() {
		return powers;
	}


	public void setPowers(String powers) {
		this.powers = powers;
	}

	
}
