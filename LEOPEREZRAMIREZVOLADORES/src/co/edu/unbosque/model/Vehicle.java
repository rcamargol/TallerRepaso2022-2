package co.edu.unbosque.model;

public abstract class Vehicle {
	
	protected String transport;

	public Vehicle(String transport) {
		super();
		this.transport = transport;
	}
	 public abstract String seePanoramic();
	 
	public String getTransport() {
		return transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
	
	 
	

}
