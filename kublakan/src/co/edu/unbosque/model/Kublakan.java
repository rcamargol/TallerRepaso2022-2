package co.edu.unbosque.model;

public abstract class  Kublakan {
protected String  edad;
protected String estatura;
protected String colordeojos;
protected boolean alma;

	
	
public Kublakan(String edad, String estatura, String colordeojos, boolean alma) {
	
	this.edad = edad;
	this.estatura = estatura;
	this.colordeojos = colordeojos;
	this.alma = alma;
}
public abstract String  habitar();
public abstract String sentir();
}

