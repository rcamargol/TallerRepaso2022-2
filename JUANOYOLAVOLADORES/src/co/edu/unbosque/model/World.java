package co.edu.unbosque.model;

public class World {
	
	Bird bi;
	SeaPlane sp;
	Superman sm;
	Helicopter heli;
	
	public World() {
		bi = new Bird(5);
		sp = new SeaPlane();
		sm = new Superman();
		heli = new Helicopter("aluminium");
	}
	public String showMethods() {
		return "Methods of the Bird class:"+"\n"+
	            bi.eat()+"\n"+
				bi.fly()+"\n"+
	            bi.land()+"\n"+
				bi.takeoff()+"\n"+
	           "Methods of the SeaPlane class:"+"\n"+
				sp.fly()+"\n"+
	            sp.land()+"\n"+
				sp.takeoff()+"\n"+
	            sp.throwWater()+"\n"+
				sp.turnOnEngine()+"\n"+
	           "Methods of the SuperMan class:"+"\n"+
				sm.fly()+"\n"+
	            sm.absorbEnergy()+"\n"+
	            sm.eat()+"\n"+
	            sm.fly()+"\n"+
	            sm.land()+"\n"+
	            sm.takeoff()+"\n"+
	            "Methods of the Helicopter class:"+"\n"+
	            heli.fly()+"\n"+
	            heli.land()+"\n"+
	            heli.takeoff()+"\n"+
	            heli.transportPeople()+"\n"+
	            heli.turnOnEngine()+"\n";
	}
	public String showObjects() {
		return bi.toString()+"\n"+
			   sp.toString()+"\n"+
			   sm.toString()+"\n"+
			   heli.toString();
	}
}
