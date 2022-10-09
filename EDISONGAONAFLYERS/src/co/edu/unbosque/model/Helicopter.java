package co.edu.unbosque.model;

public class Helicopter extends  Airplane{
 private int passengers =6;
	@Override
	public String takeoff() {
		
		return "when helicopters take off it is very dangerous to approach";
	}

	@Override
	public String land() {
		
		return  "helicopters can land on buildings";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "helicopters fly thanks to their propellers";
	}

	@Override
	public String transport() {
		// TODO Auto-generated method stub
		return "helicopters can carry "+ passengers +" people through the air";
	}
	public String service() {
		return "helicopters service the news";
	}
	public String toString () {
		return takeoff()+"\n"
				+land()+"\n"
				+fly()+"\n"
				+transport()+"\n"
				+service();
	}
}
	
	


