package co.edu.unbosque.model;

public class CynuxX1 {
	
	private Kira k;
	private Astar a;
	private Daniel d;
	private Renk r;
	
	public CynuxX1() {
		k = new Kira("", "");
		a = new Astar("", "");
		d = new Daniel("", 0);
		r = new Renk("", "");
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
	public Daniel getD() {
		return d;
	}
	public void setD(Daniel d) {
		this.d = d;
	}
	public Renk getR() {
		return r;
	}
	public void setR(Renk r) {
		this.r = r;
	}
}
