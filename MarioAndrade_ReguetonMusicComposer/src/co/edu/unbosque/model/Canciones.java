package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.ArchivoCanciones;
import co.edu.unbosque.model.persistence.Propiedades;

public class Canciones {

private String[] frasescancion = new String[24];
private String frases;
	
	public Canciones(){
		frasescancion[0] = " Mami ";
		frasescancion[1] = " Yo quiero ";
		frasescancion[2] = " Encendelte ";
		frasescancion[3] = " Suave ";
		frasescancion[4] = " Hasta que salga el sol ";
		frasescancion[5] = " Sin anestesia ";
		frasescancion[6] = " Bebe ";
		frasescancion[7] = " Yo puedo ";
		frasescancion[8] = " Amalte ";
		frasescancion[9] = " Lento ";
		frasescancion[10] = " Toda la noche ";
		frasescancion[11] = " Sin compromiso ";
		frasescancion[12] = " Princess ";
		frasescancion[13] = " Yo vengo a ";
		frasescancion[14] = " Ligal ";
		frasescancion[15] = " Rapido ";
		frasescancion[16] = " Hasta el amanecer ";
		frasescancion[17] = " Feis to feis ";
		frasescancion[18] = " Mami ";
		frasescancion[19] = " Voy a ";
		frasescancion[20] = " Jugar ";
		frasescancion[21] = " Fuerte ";
		frasescancion[22] = " Todo el dia ";
		frasescancion[23] = " Sin miedo ";
		frases="";
	}	
		public String leerfrases() {
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < 4; i++) {			
			int numero = (int)(Math.random()*3); 
			int numero2 = (int)(Math.random()*(7-3)+7);
			int numero3 = (int)(Math.random()*(11-7)+11);
			int numero4 = (int)(Math.random()*(15-11)+15); 
			int numero5 = (int)(Math.random()*(19-15)+19); 
			int numero6 = (int)(Math.random()*(22-20)+22);
			
			frases = frasescancion[numero]+" "; 
			frases += frasescancion[numero2]+" "; 
			frases += frasescancion[numero3]+" ";
			frases += frasescancion[numero4]+" "; 
			frases += frasescancion[numero5]+" "; 
			frases += frasescancion[numero6]+"\n"; 
			sb.append(frases);
		 }	
		return sb.toString();
		
	}
		public void insertarCancion(String cancion, File archivoLetras) {
			
			ArchivoCanciones letras = new ArchivoCanciones();
			letras.escribirArchivo(cancion, archivoLetras);
		}
		
		public String gestionarPropiedades() {
			Propiedades prop = new Propiedades();
			
			prop.escribirProperties();
			return "Se leyeron estas propiedades: "+"\n"+prop.leerPropiedades();
			}
	}



