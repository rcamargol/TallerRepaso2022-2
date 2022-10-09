package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer{
	
	public String savedpeople;
	
	public Superman() {
		super();
		this.savedpeople = "a lot";
	}

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Lets save some people!";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Im here!";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Im in the way to save the world!";
	}


	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "This 'El corral' hamburguer is delicious!";
	}

	

	@Override
	public String absorbEnergy() {
		// TODO Auto-generated method stub
		return "Im full of power!";
	}
	@Override
	public String toString() {
		return "Superman has saved " + this.savedpeople + " of people, his way of breathing is " + super.wayofbreathing +"\n"+
	    "and, as a kryptonian, his adored god is: "+super.adoredgod;
	}
}
