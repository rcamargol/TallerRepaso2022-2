package co.edu.unbosque.model;

public class Superman extends Kriptonian implements Flyer {
 
	private  String simbolo = "S";
	
	public String takeoff() {
		// TODO Auto-generated method stub
		return " superman can take off in 5 sec";
	}

	
	public String land() {
		
		return "superman usually lands in the empire state";
	}

	
	public String fly() {
		
		return "superman can fly in plane races";
	}

	
	public String stopbullet() {
		// TODO Auto-generated method stub
		return "Superman is the best at stopping bullets with your hands";
	}

	
	public String leapBuilding() {
		// TODO Auto-generated method stub
		return "superman can jump buildings with great easy";
	}

	
	public String eat() {
		// TODO Auto-generated method stub
		return "superman can eat all burgers of mcdonald's";
	}
	public String Symbol() {
		return "simbolo " + simbolo;
	}


	@Override
	public String toString() {
		return  takeoff() +"\n"
				+   land() +"\n"
				+ fly() +"\n"
				+ stopbullet() +"\n"
				+leapBuilding()+"\n"
				+Symbol()+"\n"
				+eat() ;
	}
	

}
