package co.edu.unbosque.model;

public class CynusX1 {
	
	private Leo L;
	private Kira K;
	private Astar As;
	private Renk Re;
	
	public CynusX1() {
		super();
		L = new Leo(0, 0, null, false, null, 0);
		K = new Kira(0, 0, null, false, null, null);
		As = new Astar(0, 0, null, false, null, null);
		Re = new Renk(0, 0, null, false, null, null, null);
	}

	public Leo getL() {
		return L;
	}

	public void setL(Leo l) {
		L = l;
	}

	public Kira getK() {
		return K;
	}

	public void setK(Kira k) {
		K = k;
	}

	public Astar getAs() {
		return As;
	}

	public void setAs(Astar as) {
		As = as;
	}

	public Renk getRe() {
		return Re;
	}

	public void setRe(Renk re) {
		Re = re;
	}
	
	
	

}
