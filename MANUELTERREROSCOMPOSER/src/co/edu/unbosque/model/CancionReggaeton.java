package co.edu.unbosque.model;

import co.edu.unbosque.model.persistance.Propiedades;
import co.edu.unbosque.model.persistance.Archivos;

public class CancionReggaeton {
	private Estrofa est1;
	private Estrofa est2;
	private Estrofa est3;
	private Archivos arch;
	private Propiedades prop;
	
	public CancionReggaeton() {
		this.est1 = new Estrofa();
		this.est2 = new Estrofa();
		this.est3 = new Estrofa();
		this.arch = new Archivos();
		this.prop = new Propiedades(); 
	}

	public Propiedades getProp() {
		return prop;
	}

	public void setProp(Propiedades prop) {
		this.prop = prop;
	}

	public Estrofa getEst1() {
		return est1;
	}

	public void setEst1(Estrofa est1) {
		this.est1 = est1;
	}

	public Estrofa getEst2() {
		return est2;
	}

	public Archivos getArch() {
		return arch ;
	}

	public void setArch(Archivos arch) {
		this.arch = arch;
	}

	public void setEst2(Estrofa est2) {
		this.est2 = est2;
	}

	public Estrofa getEst3() {
		return est3;
	}

	public void setEst3(Estrofa est3) {
		this.est3 = est3;
	}
	public String enviarCancion(){
		return est1.escribirEstrofa()+ "\n" + est2.escribirEstrofa()+ "\n" +est3.escribirEstrofa() + "\n" + "No olvide usar autotune."
				+ "\n" +"PROCURE que la base sea la adecuada, el sistema requirio de mucho tiempo para que ud, estimado usuario, la embarre. ";
 		
    }
	public void gestionarLasProperties() {	
		prop.escribirPropiedades();
	}
	

}
