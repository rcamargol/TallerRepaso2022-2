package co.edu.unbosque.model;

public class CynusX1 {

	private Kira kira;
	private Astar astar;
	private Renk renk;
	private David david;
	
	public CynusX1() {
		kira = new Kira();
		astar = new Astar();
		renk = new Renk();
		david = new David();
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

	public Renk getRenk() {
		return renk;
	}

	public void setRenk(Renk renk) {
		this.renk = renk;
	}

	public David getDavid() {
		return david;
	}

	public void setDavid(David david) {
		this.david = david;
	}
	
	
}
