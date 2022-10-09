package co.edu.unbosque.model;

public class Cynusx1 {
	//facahda 

	private Astral h1;
	private kira h2;
	private Renk d1;
	private JuanDavid m1;
	
	public Cynusx1(){
		h1=new Astral();
		h2=new kira();
		d1=new Renk();
		m1=new JuanDavid();
	}
	public Astral getH1() {
		return h1;
	}

	public void setH1(Astral h1) {
		this.h1 = h1;
	}

	public kira getH2() {
		return h2;
	}

	public void setH2(kira h2) {
		this.h2 = h2;
	}

	public Renk getD1() {
		return d1;
	}

	public void setD1(Renk d1) {
		this.d1 = d1;
	}

	public JuanDavid getM1() {
		return m1;
	}

	public void setM1(JuanDavid m1) {
		this.m1 = m1;
	}
	
	public String probarExceptions() throws AlturaException, ColorOjosException{//no se si me quedo bien lo de color de ojos profe perdon.
		try {
			if(h2.estatura > 3.0 || h2.estatura > 3.0) {
				throw new AlturaException("Los heroes solo miden 3 metros.");
			}
		}catch(AlturaException a) {
			return "No es un héroe";
		}
		try {
			String violeta = null;
			if(m1.colorojos != violeta) {
				throw new ColorOjosException("Los mortales solo tienen color de ojos Violeta");
			}
		}catch(ColorOjosException e) {
			return "No es un mortal";
		}
		return "";
	}
	
	
	}

