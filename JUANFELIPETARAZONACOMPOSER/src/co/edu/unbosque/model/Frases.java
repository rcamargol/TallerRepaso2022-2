package co.edu.unbosque.model;

public class Frases {
	
	private String[][] matrizPalabras = new String [4][6];
	
	private String[] palabras1 = new String[4];
	private String[] palabras2 = new String[4];
	private String[] palabras3 = new String[4];
	private String[] palabras4 = new String[4];
	private String[] palabras5 = new String[4];
	private String[] palabras6 = new String[4];
	
	public Frases(){
		
		palabras1[0] = "mami";
		palabras1[1] = "bebe";
		palabras1[2] = "princess";
		palabras1[3] = "mami";
		
		palabras2[0] = "yo quiero";
		palabras2[1] = "yo puedo";
		palabras2[2] = "yo vengo a";
		palabras2[3] = "voy a";
		
		palabras3[0] = "encendelte";
		palabras3[1] = "amalte";
		palabras3[2] = "ligal";
		palabras3[3] = "jugal";
		
		palabras4[0] = "suave";
		palabras4[1] = "lento";
		palabras4[2] = "rapido";
		palabras4[3] = "fuelte";
		
		palabras5[0] = "hasta que salga el sol";
		palabras5[1] = "toda la noche";
		palabras5[2] = "hasta el amanecel";
		palabras5[3] = "todo el día";
		
		palabras6[0] = "sin anestesia";
		palabras6[1] = "sin compromiso";
		palabras6[2] = "feis to feis";
		palabras6[3] = "sin miedo";
		
		
	}
	
	public String organizarFrases(){
		
		String a = "";
		String b = "";
		String c = "";
		String d = "";
		
		for (int i = 0; i < 1; i++) {
			for(int j = 0; j < 1; j++)
				a = matrizPalabras[i][j] = palabras1[(int) (Math.random() * 4)];
		}
		for (int i = 0; i < 1; i++) {
			for(int j = 0; j < 1; j++)
				b = matrizPalabras[i][j] = palabras2[(int) (Math.random() * 4)];
		}
		for (int i = 0; i < 1; i++) {
			for(int j = 0; j < 1; j++)
				c = matrizPalabras[i][j] = palabras3[(int) (Math.random() * 4)];
		}
		for (int i = 0; i < 1; i++) {
			for(int j = 0; j < 1; j++)
				d = matrizPalabras[i][j] = palabras4[(int) (Math.random() * 4)];
		}
		for (int i = 0; i < 1; i++) {
			for(int j = 0; j < 1; j++)
				d = matrizPalabras[i][j] = palabras5[(int) (Math.random() * 4)];
		}
		for (int i = 0; i < 1; i++) {
			for(int j = 0; j < 1; j++)
				d = matrizPalabras[i][j] = palabras6[(int) (Math.random() * 4)];
		}
		
		return a+" "+b+" "+c+" "+d;
	}
	
}
