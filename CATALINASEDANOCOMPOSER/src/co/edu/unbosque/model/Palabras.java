package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Propiedades;

public class Palabras {

	private String [] palabra = {"Mami ","Bebe ","Princess ","Mami "};
	private String [] conector1 = {"Yo Quielo ", "Yo Puedo ", "Yo vengo a ", "Voy a "};
	private String [] palabra1 = {"Encendelte ","Amalte ","Ligal ","Jugal "};
    private String [] conector2 = {"Suave ","Lento ","Rapido ","Fuerte "};	
    private String [] palabra2 = {"Hasta que salga el sol ", "Toda la noche ","Hasta el amanecer ","Todo el dia "};
    private String [] conector3 = {"Sin anestesia ","Sin compromiso ", "Feis to Feis ","Sin miedo "};	
	
	public Palabras() {
	}
	public String generarFrase() {
		String frase = palabra[generarRandom()]
				+conector1[generarRandom()]
				+palabra1[generarRandom()]
				+conector2[generarRandom()]
				+palabra2[generarRandom()]
				+conector3[generarRandom()];
		return frase;
	}
	public int generarRandom() {
		int numero = (int) (Math.random()*4);
		return numero;
	}
	public String generarCancion() {
		String cancion = "";
		Propiedades p = new Propiedades();
		int[] propiedades = p.leerPropiedades();
		int frase = propiedades[0];
		int estrofa = propiedades[1];
		
		for(int i = 0;i<estrofa;i++) {
			for(int j = 0;j<frase;j++) {
				cancion += generarFrase() + "\n";
			}
			cancion += "\n";
		}
		return cancion;
	}
}