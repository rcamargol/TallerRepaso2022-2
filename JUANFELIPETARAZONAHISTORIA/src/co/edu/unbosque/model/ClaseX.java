package co.edu.unbosque.model;

public class ClaseX {
	
	private Kira k;
	private Astar a;
	
	private Juan j;
	
	private Renk r;
	
	public ClaseX(){
		
		k = new Kira(0, 0, null, true);
		a = new Astar(0, 0, null, true);
		j = new Juan(0, 0, null, true);
		r = new Renk(0, 0, null, false);
	}
	
	public String generarExcepcion() throws EdadMaximaException, TipoAlmaException{
		
		if(r.edad >= 1500){
				throw new EdadMaximaException();
			}	
		try {
			
			if(r.alma == false){
				throw new TipoAlmaException(); 
			}
			
		} catch (TipoAlmaException e) {
			return "Tienes alma";
		}
		
		return "ok";
	}

	public Kira getK() {
		return k;
	}

	public void setK(Kira k) {
		this.k = k;
	}

	public Astar getA() {
		return a;
	}

	public void setA(Astar a) {
		this.a = a;
	}

	public Juan getJ() {
		return j;
	}

	public void setJ(Juan j) {
		this.j = j;
	}

	public Renk getR() {
		return r;
	}

	public void setR(Renk r) {
		this.r = r;
	}
	
	

}
