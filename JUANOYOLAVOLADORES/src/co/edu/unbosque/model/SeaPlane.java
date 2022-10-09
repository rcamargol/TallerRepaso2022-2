package co.edu.unbosque.model;

public class SeaPlane extends Airplane{
	
	private int noffloats;
		
	public SeaPlane() {
		super();	
		this.noffloats = 2;
		super.nofwheels = 2;
	}


	public String throwWater() {
		return "*Sounds of water fallind down*";
	}


	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Ladies and gentlemen, we are going to take off";
	}


	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "We arrived to our destiny, *sounds of water*";
	}


	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "tukutukutuku splash, tukutukutuku *sounds of the propellers*";
	}


	@Override
	public String turnOnEngine() {
		// TODO Auto-generated method stub
		return "ON/off";
	}


	@Override
	public String toString() {
		return "This seaplane has " + this.noffloats + " floats "+"and it has " + super.nofwheels + " wheels";
	}
	
}
