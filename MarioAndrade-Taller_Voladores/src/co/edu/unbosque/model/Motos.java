package co.edu.unbosque.model;

public class Motos {

	private SeaPlane sp;
	private Helicopter he;
	private Bird bi;
	private Superman su;
	
	public Motos(){
		sp = new SeaPlane(null, null);
		he  = new Helicopter(null, null);
		bi = new Bird();
		su = new Superman(null);
		
	}
	
	public String mostrarClases(){
		String m;
		
		m = "Hidroavi�n:"+sp.flotar()+sp.despegue()+"\n"+
				          sp.aterrizar()+sp.volar()+sp.derrapar()+"\n"+
				          "\n"+
		    "Helicoptero:"+he.iniciarhelices()+he.despegue()+he.aterrizar()+he.volar()+"\n"+
				           he.derrapar()+"\n"+
				          "\n"+
			"Pajaro:"+bi.despegue()+bi.aterrizar()+bi.volar()+"\n"+
					  bi.construirNido()+bi.ponerHuevos()+bi.comer()+"\n"+
						  "\n"+
		    "Superman:"+su.despegue()+su.aterrizar()+su.volar()+"\n"+
		    		    su.saltarEdificio()+su.paraBala()+su.comer()+"\n"+					  	
						su.absorber_energia_solar()+"\n";  
		return m;
	}
}


