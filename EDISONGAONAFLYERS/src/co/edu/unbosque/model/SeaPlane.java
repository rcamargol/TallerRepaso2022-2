package co.edu.unbosque.model;

public class SeaPlane extends Airplane {
 private int capacity= 6000;
	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "seaplanes taking off from lakes";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "the seaplane can land on the water";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "the seaplane usually flies over the docks and seas";
		
			
		}
	public String work() {
		return "the seaplane has the load capacity "+ capacity;
	}
	@Override
	public String transport() {
		// TODO Auto-generated method stub
		return "seaplanes can be transported by air and water";
	}
	public String toString () {
		return fly()+"\n"
				+ land()+"\n"
				+takeoff()+"\n"
				+work()+"\n"
				+transport();
				
		
	}

	

}
