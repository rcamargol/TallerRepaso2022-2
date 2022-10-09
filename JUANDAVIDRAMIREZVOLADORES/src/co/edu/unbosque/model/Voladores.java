package co.edu.unbosque.model;

public class Voladores {
	//fachada
	
	private pajaro p;
	private avion a;
	private helicoptero h;
    private superman s;
    private hidroavion ha;
    
    public Voladores() {
    	
    	p = new pajaro();
    	//a = new avion();
    	h = new helicoptero();
    	s = new superman();
    	ha = new hidroavion();
    	
    	
    }

	public pajaro getP() {
		return p;
	}

	public void setP(pajaro p) {
		this.p = p;
	}

	public avion getA() {
		return a;
	}

	public void setA(avion a) {
		this.a = a;
	}

	public helicoptero getH() {
		return h;
	}

	public void setH(helicoptero h) {
		this.h = h;
	}

	public superman getS() {
		return s;
	}

	public void setS(superman s) {
		this.s = s;
	}

	public hidroavion getHa() {
		return ha;
	}

	public void setHa(hidroavion ha) {
		this.ha = ha;
	}

}
