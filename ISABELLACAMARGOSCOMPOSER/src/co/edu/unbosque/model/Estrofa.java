package co.edu.unbosque.model;

import java.util.Random;

public class Estrofa {
	
	String est;

	public Estrofa() {
		this.est = "";
		
	}
	
	public String getEst() {
		return est;
	}

	public void setEst(String est) {
		this.est = est;
	}

	public void crearEstrofa() {
		
		String [][] cancion = new String [4][6];
		
		cancion[0][0] = "Mami";
		cancion[0][1] = "yo quiero";
		cancion[0][2] = "encendelte";
		cancion[0][3] = "suave";
		cancion[0][4] = "hasta que salga el sol";
		cancion[0][5] = "sin anestesia";
		
		cancion[1][0] = "Bebé";
		cancion[1][1] = "yo puedo";
		cancion[1][2] = "amalte";
		cancion[1][3] = "lento";
		cancion[1][4] = "toda la noche";
		cancion[1][5] = "sin complomiso";
		
		cancion[2][0] = "Plincess";
		cancion[2][1] = "yo vengo";
		cancion[2][2] = "a ligal";
		cancion[2][3] = "rápido";
		cancion[2][4] = "hasta el amanecel";
		cancion[2][5] = "feis to feis";
		
		cancion[3][0] = "Mamasota";
		cancion[3][1] = "voy a";
		cancion[3][2] = "jugal";
		cancion[3][3] = "fuelte";
		cancion[3][4] = "todo el dia";
		cancion[3][5] = "sin miedo";
		
		Random random = new Random ();
		
		String frase1 = cancion[random.nextInt(3)][0] + " " + cancion[random.nextInt(3)][1] + " " + cancion[random.nextInt(3)][2] + " " + cancion[random.nextInt(3)][3] + " " + cancion[random.nextInt(3)][4] + " " + cancion[random.nextInt(3)][5];
		String frase2 = cancion[random.nextInt(3)][0] + " " + cancion[random.nextInt(3)][1] + " " + cancion[random.nextInt(3)][2] + " " + cancion[random.nextInt(3)][3] + " " + cancion[random.nextInt(3)][4] + " " + cancion[random.nextInt(3)][5];
		String frase3 = cancion[random.nextInt(3)][0] + " " + cancion[random.nextInt(3)][1] + " " + cancion[random.nextInt(3)][2] + " " + cancion[random.nextInt(3)][3] + " " + cancion[random.nextInt(3)][4] + " " + cancion[random.nextInt(3)][5];
		String frase4 = cancion[random.nextInt(3)][0] + " " + cancion[random.nextInt(3)][1] + " " + cancion[random.nextInt(3)][2] + " " + cancion[random.nextInt(3)][3] + " " + cancion[random.nextInt(3)][4] + " " + cancion[random.nextInt(3)][5];
		
		est = frase1 + "\n" + frase2 + "\n" + frase3 + "\n" + frase4 + "\n";
	
	}
	
	
	
	
	

}
