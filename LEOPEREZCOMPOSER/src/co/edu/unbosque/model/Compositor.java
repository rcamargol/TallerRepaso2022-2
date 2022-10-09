package co.edu.unbosque.model;

import java.io.File;

import javax.swing.JFileChooser;

import co.edu.unbosque.model.persistence.Files;
import co.edu.unbosque.model.persistence.Propiedades;

public class Compositor {
	
	private Files fi;
	private Propiedades pro;
	
	
	public Compositor() {
		fi = new Files();
		pro = new Propiedades();
	}

	final int FILAS = 4, COLUMNAS = 6;
	String[][] palabras = new String[FILAS][COLUMNAS];{
	palabras[0][0] = "MAMI ";
	palabras[0][1] = "YO QUIERO ";
	palabras[0][2] = "ENCENDELTE ";
	palabras[0][3] = "SUAVE ";
	palabras[0][4] = "HASTA QUE SALGA EL SOL ";
	palabras[0][5] = "SIN ANESTESIA ";
	palabras[1][0] = "BEBE ";
	palabras[1][1] = "YO PUEDO ";
	palabras[1][2] = "AMALTE ";
	palabras[1][3] = "LENTO ";
	palabras[1][4] = "TODA LA NOCHE ";
	palabras[1][5] = "SIN COMPROMISO ";
	palabras[2][0] = "PRINCESS ";
	palabras[2][1] = "YO VENGO A ";
	palabras[2][2] = "LIGAL ";
	palabras[2][3] = "RAPIDO ";
	palabras[2][4] = "HASTA EL AMANECER ";
	palabras[2][5] = "FEIS TO FEIS ";
	palabras[3][0] = "MAMI ";
	palabras[3][1] = "VOY A ";
	palabras[3][2] = "JUGAL ";
	palabras[3][3] = "FUELTE ";
	palabras[3][4] = "TODO EL DIA ";
	palabras[3][5] = "SIN MIEDO ";
	}
	
	public String hacerEstrofa1(int frases) {
		String can = "";
		int numero = 0;
		int linea = 0;
		
		while (linea < frases) {
			linea ++;
			
				for(int i = 0; i<6; i++) {
		        numero = (int)(Math.random()*4);
		        can += palabras[numero][i]; 
				}
			can += "\n";
		} 
		return can;
	}
	public void escribirEstrofa1(String can1, File f) {
		fi.escribirArchivo(can1, f);
	}
	
	public String hacerEstrofa2(int frases) {
		String can2 = "";
		int numero = 0;
		int linea = 0;
		
		while (linea < frases) {
			linea ++;
			
				for(int i = 0; i<6; i++) {
		        numero = (int)(Math.random()*4);
		        can2 += palabras[numero][i]; 
				}
			can2 += "\n";
		} 
		return can2;
	}
	public void escribirEstrofa2(String can2, File f) {
		fi.escribirArchivo(can2, f);
	}
	public String hacerEstrofa3(int frases) {
		String can3 = "";
		int numero = 0;
		int linea = 0;
		
		while (linea < frases) {
			linea ++;
			
				for(int i = 0; i<6; i++) {
		        numero = (int)(Math.random()*4);
		        can3 += palabras[numero][i]; 
				}
			can3 += "\n";
		} 
		return can3;
	}
	public void escribirEstrofa3(String can3, File f) {
		fi.escribirArchivo(can3, f);
	}

	public String gestionarPropiedades() {
		pro.escribirPropiedades();
		return "Se leyeron estas propiedades : " + "\n" + pro.leerPropiedades();
	}

}
