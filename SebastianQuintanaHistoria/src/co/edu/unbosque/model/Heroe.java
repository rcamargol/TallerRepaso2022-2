package co.edu.unbosque.model;

public abstract class Heroe extends Kublakan{
	protected String bondad;
	protected String nivelPoder;


public String Habitar() {
		
		return "Habitan al norte del planeta";
	}
public String Sentir() {
		
		return "Se sienten a si mismos y a seres de otros mundos";
	}



public abstract String crearFuego();
public abstract String detenerTiempo();
public abstract  String Volar();

	
}
