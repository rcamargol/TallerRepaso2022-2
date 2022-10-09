package co.edu.unbosque.model;

public class Descendientes {
	
	private Kira k;
	private Astar a;
	private Renk r;
	private Ferddy f;
	
	public Descendientes() {
		k = new Kira();
		a = new Astar();
		r = new Renk();
		f = new Ferddy();
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

	public Ferddy getF() {
		return f;
	}

	public void setF(Ferddy f) {
		this.f = f;
	}
}
