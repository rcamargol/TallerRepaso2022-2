package co.edu.unbosque.model;

public class CynusX1 {
	private Astar astar;
	private Kira kira;
	private Renk renk;
	private DavidPuerto david;

	public CynusX1() {
		astar = new Astar();
		kira = new Kira();
		renk = new Renk();
		david = new DavidPuerto();
	}

	public Astar getAstar() {
		return astar;
	}

	public void setAstar(Astar astar) {
		this.astar = astar;
	}

	public Kira getKira() {
		return kira;
	}

	public void setKira(Kira kira) {
		this.kira = kira;
	}

	public Renk getRenk() {
		return renk;
	}

	public void setRenk(Renk renk) {
		this.renk = renk;
	}

	public DavidPuerto getDavid() {
		return david;
	}

	public void setDavid(DavidPuerto david) {
		this.david = david;
	}

}
