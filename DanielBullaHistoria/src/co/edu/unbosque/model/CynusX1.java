package co.edu.unbosque.model;

public class CynusX1 {

	private Kira kira;
	private Astar astar;
	private Daniel daniel;
	private Renk renk;
	
	public CynusX1() {
		kira = new Kira();
		astar = new Astar();
		daniel = new Daniel();
		renk = new Renk();
	}
	
	public String probarExceptions() throws EstaturaException, EdadException{
		try {
			if(kira.estatura > 3 || astar.estatura > 3) {
				throw new EstaturaException("Estatura incorrecta para un heroe");
			}
		}catch(EstaturaException e) {
			return "La estatura es incorrecta";
		}
		
		try {
			if(renk.edad > 1500) {
				throw new EdadException("Edad incorrecta para un desterrado");
			}
		}catch(EdadException e) {
			return "La edad es incorrecta";
		}
		return "";
	}


	public Kira getKira() {
		return kira;
	}

	public void setKira(Kira kira) {
		this.kira = kira;
	}

	public Astar getAstar() {
		return astar;
	}

	public void setAstar(Astar astar) {
		this.astar = astar;
	}

	public Daniel getDaniel() {
		return daniel;
	}

	public void setDaniel(Daniel daniel) {
		this.daniel = daniel;
	}

	public Renk getRenk() {
		return renk;
	}

	public void setRenk(Renk renk) {
		this.renk = renk;
	}
	
}
