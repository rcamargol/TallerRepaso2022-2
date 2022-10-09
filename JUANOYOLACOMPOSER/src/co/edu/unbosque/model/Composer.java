package co.edu.unbosque.model;

import java.io.File;
import java.util.Random;

import co.edu.unbosque.model.persistence.ArchivoCancion;
import co.edu.unbosque.model.persistence.Propiedades;

public class Composer {
	
	private String palabras[][];
	private static final int NFILAS = 4;
	private static final int NCOLUMNAS = 6;
	private ArchivoCancion ac;
	private Propiedades pro;
		
	public Composer() {
		ac = new ArchivoCancion();
		pro = new Propiedades();
	}
	public String crearCancion() {
		String cancion = "";
		String frase1 = "";
		String frase2 = "";
		String frase3 = "";
		String frase4 = "";
		String frase5 = "";
		String frase6 = "";
		String frase7 = "";
		String frase8 = "";
		String frase9 = "";
		String frase10 = "";
		String frase11 = "";
		String frase12 = "";
		String palabras[][] = new String[NFILAS][NCOLUMNAS];
		Random r = new Random();
		
		palabras[0][0] = " Mami";
		palabras[0][1] = " yo quiero";
		palabras[0][2] = " encendelte";
		palabras[0][3] = " suave";
		palabras[0][4] = " hasta que salga el sol";
		palabras[0][5] = " sin anestesia";
		palabras[1][0] = " Bebe";
		palabras[1][1] = " yo puedo";
		palabras[1][2] = " amalte";
		palabras[1][3] = " lento";
		palabras[1][4] = " toda la noche";
		palabras[1][5] = " sin complomiso";
		palabras[2][0] = " Princess";
		palabras[2][1] = " yo vengo a";
		palabras[2][2] = " ligal";
		palabras[2][3] = " rapido";
		palabras[2][4] = " hasta el amanecer";
		palabras[2][5] = " feis to feis";
		palabras[3][0] = " Mami";
		palabras[3][1] = " voy a";
		palabras[3][2] = " jugar";
		palabras[3][3] = " fuerte";
		palabras[3][4] = " todo el dia";
		palabras[3][5] = " sin miedo";
		
		frase1 = palabras[r.nextInt(NFILAS)][0] +  palabras[r.nextInt(NFILAS)][1] +  palabras[r.nextInt(NFILAS)][2]+  palabras[r.nextInt(NFILAS)][3] +  palabras[r.nextInt(NFILAS)][4] +  palabras[r.nextInt(NFILAS)][5]+"\n";
		frase2 = palabras[r.nextInt(NFILAS)][0] +  palabras[r.nextInt(NFILAS)][1] +  palabras[r.nextInt(NFILAS)][2]+  palabras[r.nextInt(NFILAS)][3] +  palabras[r.nextInt(NFILAS)][4] +  palabras[r.nextInt(NFILAS)][5]+"\n";
		frase3 = palabras[r.nextInt(NFILAS)][0] +  palabras[r.nextInt(NFILAS)][1] +  palabras[r.nextInt(NFILAS)][2]+  palabras[r.nextInt(NFILAS)][3] +  palabras[r.nextInt(NFILAS)][4] +  palabras[r.nextInt(NFILAS)][5]+"\n";
		frase4 = palabras[r.nextInt(NFILAS)][0] +  palabras[r.nextInt(NFILAS)][1] +  palabras[r.nextInt(NFILAS)][2]+  palabras[r.nextInt(NFILAS)][3] +  palabras[r.nextInt(NFILAS)][4] +  palabras[r.nextInt(NFILAS)][5]+"\n";
		String estrofa = frase1+frase2+frase3+frase4+"\n";
			
		frase5 = palabras[r.nextInt(NFILAS)][0] +  palabras[r.nextInt(NFILAS)][1] +  palabras[r.nextInt(NFILAS)][2]+  palabras[r.nextInt(NFILAS)][3] +  palabras[r.nextInt(NFILAS)][4] +  palabras[r.nextInt(NFILAS)][5]+"\n";
		frase6 = palabras[r.nextInt(NFILAS)][0] +  palabras[r.nextInt(NFILAS)][1] +  palabras[r.nextInt(NFILAS)][2]+  palabras[r.nextInt(NFILAS)][3] +  palabras[r.nextInt(NFILAS)][4] +  palabras[r.nextInt(NFILAS)][5]+"\n";
		frase7= palabras[r.nextInt(NFILAS)][0] +  palabras[r.nextInt(NFILAS)][1] +  palabras[r.nextInt(NFILAS)][2]+  palabras[r.nextInt(NFILAS)][3] +  palabras[r.nextInt(NFILAS)][4] +  palabras[r.nextInt(NFILAS)][5]+"\n";
		frase8 = palabras[r.nextInt(NFILAS)][0] +  palabras[r.nextInt(NFILAS)][1] +  palabras[r.nextInt(NFILAS)][2]+  palabras[r.nextInt(NFILAS)][3] +  palabras[r.nextInt(NFILAS)][4] +  palabras[r.nextInt(NFILAS)][5]+"\n";
		String estrofa1 = frase5+frase6+frase7+frase8+"\n";
					
		frase9 = palabras[r.nextInt(NFILAS)][0] +  palabras[r.nextInt(NFILAS)][1] +  palabras[r.nextInt(NFILAS)][2]+  palabras[r.nextInt(NFILAS)][3] +  palabras[r.nextInt(NFILAS)][4] +  palabras[r.nextInt(NFILAS)][5]+"\n";
		frase10 = palabras[r.nextInt(NFILAS)][0] +  palabras[r.nextInt(NFILAS)][1] +  palabras[r.nextInt(NFILAS)][2]+  palabras[r.nextInt(NFILAS)][3] +  palabras[r.nextInt(NFILAS)][4] +  palabras[r.nextInt(NFILAS)][5]+"\n";
		frase11 = palabras[r.nextInt(NFILAS)][0] +  palabras[r.nextInt(NFILAS)][1] +  palabras[r.nextInt(NFILAS)][2]+  palabras[r.nextInt(NFILAS)][3] +  palabras[r.nextInt(NFILAS)][4] +  palabras[r.nextInt(NFILAS)][5]+"\n";
		frase12 = palabras[r.nextInt(NFILAS)][0] +  palabras[r.nextInt(NFILAS)][1] +  palabras[r.nextInt(NFILAS)][2]+  palabras[r.nextInt(NFILAS)][3] +  palabras[r.nextInt(NFILAS)][4] +  palabras[r.nextInt(NFILAS)][5]+"\n";
		
		String estrofa2 = frase9+frase10+frase11+frase12+"\n";
			
		cancion = estrofa+estrofa1+estrofa2;
			
		return cancion;
	}
	public void imprimirCancion(String can, File f) {
		ac.escribirArchivo(can, f);
	}
	public String hacerPropiedades() {
		pro.escribirPropiedades();
		return "Se leyeron estas propiedades: " + "\n"+ pro.leerPropiedades();
	}
}
