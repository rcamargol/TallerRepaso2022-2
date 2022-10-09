package co.edu.unbosque.model;

import java.util.ArrayList;
import co.edu.unbosque.model.persistence.Guardar_Archivo;
import co.edu.unbosque.model.persistence.Propiedades;

public class Cancion {	
	private String[] Columna1 = {"Mami", "Bebé", "Princess", "Mami"};
	private String[] Columna2 = {"Yo quiero", "Yo puedo", "Yo vengo a", "Voy a"};
	private String[] Columna3 = {"Encenderte", "Amarte", "Ligar", "Jugar"};
	private String[] Columna4 = {"Suave", "Lento", "Rapido", "Fuerte"};
	private String[] Columna5 = {"Hasta que salga el sol", "Toda la noche", "Hasta el amanecer", "Todo el dia"};
	private String[] Columna6 = {"Sin anestesia", "Sin compromiso", "Feis to feis", "Sin miedo"};
	private Guardar_Archivo archivo = new Guardar_Archivo();
	private ArrayList cancion = new ArrayList();

	public Cancion(String[] columna1, String[] columna2, String[] columna3, String[] columna4, String[] columna5,
			String[] columna6, Guardar_Archivo archivo, ArrayList cancion) {
		Columna1 = columna1;
		Columna2 = columna2;
		Columna3 = columna3;
		Columna4 = columna4;
		Columna5 = columna5;
		Columna6 = columna6;
		this.archivo = archivo;
		this.cancion = cancion;
	}

	public Cancion() {
	}
	
	public void Crear_Cancion() {
		cancion.clear();
		for (int i = 0; i < 3; i++) {   //Estrofas
			for (int j = 0; j < 4; j++) { //Frases
				String frase ="";
				int value_frase1 = (int)(Math.random()*4+0);					
				int value_frase2 = (int)(Math.random()*4+0);
				int value_frase3 = (int)(Math.random()*4+0);
				int value_frase4 = (int)(Math.random()*4+0);
				int value_frase5 = (int)(Math.random()*4+0);
				int value_frase6 = (int)(Math.random()*4+0);
				frase+=Columna1[value_frase1]+" "+Columna2[value_frase2]+" "+Columna3[value_frase3]+" "+Columna4[value_frase4]+" "+Columna5[value_frase5]+" "+Columna6[value_frase6];	
				cancion.add(frase);
			}
		}
		
		
	}
	
	public void gestionarPropiedades() {
		Propiedades prop = new Propiedades();
		
		prop.escribirPropiedades();
		System.out.println("Se leyeron estas propiedades: "+"\n"+prop.leerPropiedades()); 
	}

	public String[] getColumna1() {
		return Columna1;
	}

	public void setColumna1(String[] columna1) {
		Columna1 = columna1;
	}

	public String[] getColumna2() {
		return Columna2;
	}

	public void setColumna2(String[] columna2) {
		Columna2 = columna2;
	}

	public String[] getColumna3() {
		return Columna3;
	}

	public void setColumna3(String[] columna3) {
		Columna3 = columna3;
	}

	public String[] getColumna4() {
		return Columna4;
	}

	public void setColumna4(String[] columna4) {
		Columna4 = columna4;
	}

	public String[] getColumna5() {
		return Columna5;
	}

	public void setColumna5(String[] columna5) {
		Columna5 = columna5;
	}

	public String[] getColumna6() {
		return Columna6;
	}

	public void setColumna6(String[] columna6) {
		Columna6 = columna6;
	}

	public ArrayList getCancion() {
		return cancion;
	}

	public void setCancion(ArrayList cancion) {
		this.cancion = cancion;
	}

	public Guardar_Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Guardar_Archivo archivo) {
		this.archivo = archivo;
	}
	
	
}
