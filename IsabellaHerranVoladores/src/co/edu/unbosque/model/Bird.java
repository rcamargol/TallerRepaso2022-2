package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer{
	
	private String colorplumas;
	
	public Bird() {
		super.añosdevida = 5;
		this.colorplumas = "Amarillas";
	}

	
	public String toBuildNest() {
		
		return null;
	}
	
	public String toLayEggs() {
		
		return null;
	}


	@Override
	public String toTakeOff() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String toLand() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String toFly() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toEat() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getColorplumas() {
		return colorplumas;
	}


	public void setColorplumas(String colorplumas) {
		this.colorplumas = colorplumas;
	}
}