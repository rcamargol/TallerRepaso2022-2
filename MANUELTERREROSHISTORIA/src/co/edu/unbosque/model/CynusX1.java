package co.edu.unbosque.model;

public class CynusX1 {

	private Astar ast ;
	private Manuel ma ;
	private Renk rnk;
	private Kira kir;
	
	public CynusX1() {
		ast =  new Astar();	
		kir = new Kira();
		rnk = new Renk();
		ma = new Manuel();
	}
	public Astar getAst() {
		return ast;
	}

	public void setAst(Astar ast) {
		this.ast = ast;
	}

	public Manuel getMa() {
		return ma;
	}

	public void setMa(Manuel ma) {
		this.ma = ma;
	}

	public Renk getRnk() {
		return rnk;
	}

	public void setRnk(Renk rnk) {
		this.rnk = rnk;
	}

	public Kira getKir() {
		return kir;
	}

	public void setKir(Kira kir) {
		this.kir = kir;
	}
}
