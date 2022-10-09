package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {

	private String at ="feathers";
	
	public String layeggs() {
		return"female birds can lay eggs";
	}
	public String buildNeat() {
		return"birds build their nests with small branches";
	}
	@Override
	public String takeoff() {
		
		return "birds usually take off from anywhere";
	}

	@Override
	public String land() {
		
		return "some birds land in wetlands";
	}

	@Override
	public String fly() {
		
		return "birds usually fly in groups";
	}

	
	public String eat() {
		// TODO Auto-generated method stub
		return "the birds  eat worms in morning";
	}
	public String alas() {
		return " the wings of birds are"+at;
	}
	@Override
	public String toString() {
		return  takeoff() +"\n"
				+   land() +"\n"
				+ fly() +"\n"
				+ alas() +"\n"
				+ layeggs()+"\n"
				+ buildNeat()+"\n"
				+eat() ;
	}
	

}
