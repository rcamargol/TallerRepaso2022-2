package co.edu.unbosque.model;

import java.util.Random;

public class Cancion {
	public String crearEstrofa() {
		String versos[][] = { { "MAMI ", "YO QUIELO ", "ENCENDELTE ", "SUAVE ", "HASTA QUE SALGA EL SOL ", "SIN ANESTESIA " },
							  { "BEBE ", "YO PUEDO ", "AMALTE ", "LENTO ", "TODA LA NOCHE ", "SIN COMPLOMISO " },
							  { "PRINCESS ", "YO VENGO A ", "LIGAL ", "LAPIDO ", "HASTA EL AMANECEL ", "FEIS TO FEIS " },
							  { "MAMI ", "VOY A ", "JUGAL ", "FUELTE ", "TODO EL DIA ", "SIN MIEDO " } };

		Random ran = new Random();

		String verso1 = versos[ran.nextInt(4)][0] + versos[ran.nextInt(4)][1] + versos[ran.nextInt(4)][2]
				+ versos[ran.nextInt(4)][3] + versos[ran.nextInt(4)][4] + versos[ran.nextInt(4)][5];
		
		String verso2 = versos[ran.nextInt(4)][0] + versos[ran.nextInt(4)][1] + versos[ran.nextInt(4)][2]
				+ versos[ran.nextInt(4)][3] + versos[ran.nextInt(4)][4] + versos[ran.nextInt(4)][5];
		
		String verso3 = versos[ran.nextInt(4)][0] + versos[ran.nextInt(4)][1] + versos[ran.nextInt(4)][2]
				+ versos[ran.nextInt(4)][3] + versos[ran.nextInt(4)][4] + versos[ran.nextInt(4)][5];
		
		String verso4 = versos[ran.nextInt(4)][0] + versos[ran.nextInt(4)][1] + versos[ran.nextInt(4)][2]
				+ versos[ran.nextInt(4)][3] + versos[ran.nextInt(4)][4] + versos[ran.nextInt(4)][5];

		String estrofa = verso1 + "\n" + verso2 + "\n" + verso3 + "\n" + verso4 + "\n";
		
		return estrofa;
	}
	
	
}
