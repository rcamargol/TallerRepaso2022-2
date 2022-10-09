package co.edu.unbosque.model;

public abstract class Airplane extends Vehicle implements Flyer {
	
	protected int numElices;
	
	public Airplane(String transporte, int numElices) {
		super(transporte);
		this.numElices = numElices;
		this.transport = "aereo";
	}

	@Override
	public String takeOff() {	
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNumElices() {
		return numElices;
	}

	public void setNumElices(int numElices) {
		this.numElices = numElices;
	}

	
}
