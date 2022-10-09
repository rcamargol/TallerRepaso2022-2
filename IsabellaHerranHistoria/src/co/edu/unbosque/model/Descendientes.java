package co.edu.unbosque.model;

public class Descendientes {
	
	private Kira k;
	private Astar a;
	private Renk r;
	private Isabella i;
	
	public Descendientes() {
		k = new Kira();
		a = new Astar();
		r = new Renk();
		i = new Isabella();
	}
	
	public String probarExceptions() throws EstaturaException, EdadExcpetion{
		try {
			if(k.estatura > 3 || a.estatura > 3) {
				throw new EstaturaException("Esta estatura no es posible en los heroes.");
			}
		}catch(EstaturaException e) {
			return "La estatura no es correcta";
		}
		
		try {
			if(r.edad > 1500) {
				throw new EdadExcpetion("Esa edad no es posible en un desterrado");
			}
		}catch(EdadExcpetion e) {
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

	public Isabella getF() {
		return i;
	}

	public void setF(Isabella f) {
		this.i = f;
	}
}
