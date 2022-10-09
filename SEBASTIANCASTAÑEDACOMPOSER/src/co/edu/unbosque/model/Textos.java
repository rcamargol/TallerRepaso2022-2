package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Propiedades;

public class Textos {
	private String palabra1[] = {"Mami ","Bebe ","Princess ","Mami "};
	private String palabra2[] = {"yo quielo ","yo puedo ","yo vengo a ","voy a "};
	private String palabra3[] = {"encendelte ","amalte ","ligal ","jugal "};
	private String palabra4[] = {"suave ","lento ","lapido ","fuelte "};
	private String palabra5[] = {"hasta que salga el sol ","toda la noche ","hasta el amanecel ","todo el dia"};
	private String palabra6[] = {"sin anestesia ","sin complomiso ","feis to feis ","sin miedo"};
	private Propiedades propi;
	public Textos() {
		propi = new Propiedades();
	}
	public String crearFrase() {
		String frase = palabra1[generarNumero()]+palabra2[generarNumero()]+palabra3[generarNumero()]+palabra4[generarNumero()]+palabra5[generarNumero()]+palabra6[generarNumero()];
		return frase;
	}
	public int generarNumero() {
		int numero = (int) (Math.random()*4);
		return numero;
	}
	public String generarCancion() {
		int[] propiedades = propi.leerPropiedades();
		String cancion = "";
		int frase = propiedades[0];
		int estrofa = propiedades[1];
		for(int i = 0;i<estrofa;i++) {
			for(int j = 0;j<frase;j++) {
				cancion += crearFrase() + "\n";
			}
			cancion += "\n";
		}
		return cancion;
	}
}
