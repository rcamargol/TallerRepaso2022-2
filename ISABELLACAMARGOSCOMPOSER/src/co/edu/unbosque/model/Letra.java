package co.edu.unbosque.model;
import co.edu.unbosque.model.persistence.LetraFile;
import co.edu.unbosque.model.persistence.Propiedades;
public class Letra {
	

	private Estrofa e1;
	private Estrofa e2;
	private Estrofa e3;
	private LetraFile ef;
	private Propiedades pr;
	
	public Letra() {
		this.e1 = new Estrofa();
		this.e2 = new Estrofa();
		this.e3 = new Estrofa();
		this.ef = new LetraFile();
		this.pr = new Propiedades(); 
	}

	

	public Estrofa getE1() {
		return e1;
	}



	public void setE1(Estrofa e1) {
		this.e1 = e1;
	}



	public Estrofa getE2() {
		return e2;
	}



	public void setE2(Estrofa e2) {
		this.e2 = e2;
	}



	public Estrofa getE3() {
		return e3;
	}



	public void setE3(Estrofa e3) {
		this.e3 = e3;
	}



	public LetraFile getEf() {
		return ef;
	}



	public void setEf(LetraFile ef) {
		this.ef = ef;
	}



	public Propiedades getPr() {
		return pr;
	}



	public void setPr(Propiedades pr) {
		this.pr = pr;
	}



	public void generarRegueton() {
		e1.crearEstrofa();
		e2.crearEstrofa();
		e3.crearEstrofa();
	}
	
	public void gestionarProperties() {
		pr.escribirPropiedades();
	}
	
}
