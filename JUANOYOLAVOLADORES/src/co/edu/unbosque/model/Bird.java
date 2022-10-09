package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer{
	private int nofnestscreated;
	
	public Bird(int nofnestscreated) {
		super();
		this.nofnestscreated = nofnestscreated;
	}

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Im taking off, i mean 'pio pio'";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "*lands*";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "*flies*";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "*sounds of seeds being eaten*";
	}

	@Override
	public String toString() {
		return "Number of nests created: " + this.nofnestscreated + " and the way of breathing of the birds is: " + super.wayofbreathing;
	}

	
	
}
