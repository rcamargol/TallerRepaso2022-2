package co.edu.unbosque.model;

public class Helicopter extends Airplane {
	
	protected String material;
	
	public Helicopter(String material) {
		super();
		this.material = material;
		super.nofwheels = 0;
	}

	public String transportPeople() {
		return "We are helping a lot of people with this right now";
	}

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Ladies and gentlemen, we are going to take off";
	}

	

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Ladies and gentlemen, we are going to arrive to our destiny";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Tukutukutukutuku *sounds of propellers* ";
	}

	@Override
	public String turnOnEngine() {
		// TODO Auto-generated method stub
		return "ON/off";
	}
	@Override
	public String toString() {
		return "The material of this helicopter is " + this.material + " and it has " + super.nofwheels +" wheels";
	}
}
