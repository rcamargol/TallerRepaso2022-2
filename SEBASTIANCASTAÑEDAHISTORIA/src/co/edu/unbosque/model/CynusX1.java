package co.edu.unbosque.model;

public class CynusX1 {
	private Kira kira;
	private Astar astar;
	private Renk renk;
	private SebastianCastañeda sebas;
	
	public CynusX1() {
		this.kira = new Kira(34, 3, "Azules", true);
		this.astar = new Astar(52, 3, "Grises", true);
		this.renk = new Renk(1000, 1.80, "Negros", false, 1500);
		this.sebas = new SebastianCastañeda(17, 1.72, "Violeta", true);
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

	public SebastianCastañeda getSebas() {
		return sebas;
	}

	public void setSebas(SebastianCastañeda sebas) {
		this.sebas = sebas;
	}
	
}
