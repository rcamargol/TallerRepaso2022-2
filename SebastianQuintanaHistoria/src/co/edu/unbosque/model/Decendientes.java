package co.edu.unbosque.model;

public class Decendientes {
	private Kira k;
	private Astar a;
	private Renk r;
	private Sebastian s;
	
	public Decendientes() {
		k = new Kira();
		a = new Astar();
		r = new Renk();
		s = new Sebastian();
	}
	
	public String probarExceptions() throws EstaturaException, EdadException{
		try {
			if(k.estatura > 3 || a.estatura > 3) {
				throw new EstaturaException("Esta estatura no es posible en los heroes.");
			}
		}catch(EstaturaException e) {
			return "La estatura no es correcta";
		}
		
		try {
			if(r.edad > 1500) {
				throw new EdadException("Esa edad no es posible en un desterrado");
			}
		}catch(EdadException e) {
			return "La edad no es correcta";
		}
		return "";
	
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

	public Renk getR() {
		return r;
	}

	public void setR(Renk r) {
		this.r = r;
	}

	public Sebastian getS() {
		return s;
	}

	public void setS(Sebastian s) {
		this.s = s;
	}
	
}

