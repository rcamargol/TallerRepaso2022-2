package co.edu.unbosque.model;

public abstract class Kryptoniano  extends animal {
	
	protected String superFuerza;
	public abstract String respirarenelespacio();
	
	public Kryptoniano() {
		super.belleza= "niveldebellezaalto";
		this.superFuerza = "posee mas fuerza que los demas humanos";
	}
}
