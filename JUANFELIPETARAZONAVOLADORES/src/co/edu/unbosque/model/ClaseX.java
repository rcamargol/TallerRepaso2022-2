package co.edu.unbosque.model;

public class ClaseX {
	
	private seaPlane sp;
	private Helicopter hl;
	private Bird b;
	private Superman s; 
	
	public ClaseX(){
		
		sp = new seaPlane();
		hl = new Helicopter();
		b = new Bird();
		s = new Superman();
		
	}
	
	public String unir() {
		
		String m;
		
		m = "Superman: "+s.takeoff()+s.land()+"\n"+
		    "                       "+s.fly()+s.eat()+"\n"+
			"                       "+s.rayosLaser()+s.leapBuilding()+"\n"+
		    "                       "+s.stopBullet()+"\n"+	
		                                             "\n"+
		    "Pajaro:"+b.takeoff()+b.land()+b.fly()+"\n"+
		    "               "+b.eat()+b.buildNest()+"\n"+
		    "               "+b.layEggs()+"\n"+
		                                  "\n"+
			"Helicoptero: "+hl.takeoff()+hl.land()+"\n"+
		    "                        "+hl.fly()+hl.iniciarMotor()+"\n"+
			"                        "+hl.acelerar()+hl.alineamientoFlaps()+"\n"+
			                                                                "\n"+
			
		    "Hidroavión: "+sp.takeoff()+sp.land()+sp.fly()+"\n"+
		    "                      "+sp.iniciarMotor()+"\n"+
		    "                      "+sp.acelerar()+sp.amerizaje()+"\n";
		
		return m;
	}
	
}
