package co.edu.unbosque.model;

public class Descendientes {
	private Kira kir;
	private Astar ast;
	private Juan yo;
	private Renk renk;
	
	public Descendientes() {
		kir  = new Kira();
		ast =  new Astar();
		yo = new Juan();
		renk = new Renk();
	}

	public String probarExceptions() throws AlturaException, EdadException {
		try {
			if(renk.edad > 1500) {
				throw new EdadException("Esa no es la edad dada por KublaKan");
			}
		}catch(EdadException e) {
			return "No es la edad";
		}
		
		
		try{
			if(kir.estatura > 3.0 || ast.estatura > 3.00) {
				throw new AlturaException("Esa no es la altura dada por KublaKan");
			}
		}catch(AlturaException e) {
			return "No es la edad";
		}
		return "";
		
	}
	public Kira getKir() {
		return kir;
	}

	public void setKir(Kira kir) {
		this.kir = kir;
	}

	public Astar getAst() {
		return ast;
	}

	public void setAst(Astar ast) {
		this.ast = ast;
	}

	public Juan getYo() {
		return yo;
	}

	public void setYo(Juan yo) {
		this.yo = yo;
	}

	public Renk getRenk() {
		return renk;
	}

	public void setRenk(Renk renk) {
		this.renk = renk;
	}
	
	
	
}
