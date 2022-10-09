package co.edu.unbosque.Model;

public class Habitantes {

	private Renk Renk;
	private Andres Andres;
	private Kira Kira;
	private Astar Astar;
	
	public Habitantes() {
		Renk = new Renk();
		Andres = new Andres();
		Kira = new Kira();
		Astar = new Astar();
	}

	public Renk getRenk() {
		return Renk;
	}

	public void setRenk(Renk renk) {
		Renk = renk;
	}

	public Andres getAndres() {
		return Andres;
	}

	public void setAndres(Andres andres) {
		Andres = andres;
	}

	public Kira getKira() {
		return Kira;
	}

	public void setKira(Kira kira) {
		Kira = kira;
	}

	public Astar getAstar() {
		return Astar;
	}

	public void setAstar(Astar astar) {
		Astar = astar;
	}


	
	

}
