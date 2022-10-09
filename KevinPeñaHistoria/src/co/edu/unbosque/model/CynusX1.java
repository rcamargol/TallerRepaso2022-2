package co.edu.unbosque.model;

public class CynusX1 {
	private Kira kira;
	private Astar astar;
	private Kevin kevin;
	private Renk renk;
	
	public CynusX1() {
		kira = new Kira();
		astar = new Astar();
		try {
			kevin = new Kevin();
		} catch (ExceptionPorAlgo e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			renk = new Renk();
		} catch (ExceptionNoseQuePaso e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public Kevin getKevin() {
		return kevin;
	}

	public void setKevin(Kevin kevin) {
		this.kevin = kevin;
	}

	public Renk getRenk() {
		return renk;
	}

	public void setRenk(Renk renk) {
		this.renk = renk;
	}
}
