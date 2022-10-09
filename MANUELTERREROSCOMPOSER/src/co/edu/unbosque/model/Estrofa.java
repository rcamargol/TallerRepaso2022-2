package co.edu.unbosque.model;

import java.util.Random;

public class Estrofa {
	private String estrofa;
	
	public Estrofa() {
		this. estrofa = "";
	}
	
	public String getEstrofa() {
		return estrofa;
	}


	public void setEstrofa(String estrofa) {
		this.estrofa = estrofa;
	}
	
	public String escribirEstrofa() {
		String [][] matrix = new String [4][6];
		Random rand = new Random();
		
		matrix[0][0] = "Mami ";
		matrix[1][0] = "Bebe ";
		matrix[2][0] = "Princess ";
		matrix[3][0] = "Mami ";
		
		matrix[0][1] = " yo quiero ";
		matrix[1][1] = " yo puedo ";
		matrix[2][1] = " yo vengo a ";
		matrix[3][1] = " voy a ";
		
		matrix[0][2] = " encendelte ";
		matrix[1][2] = " amalte ";
		matrix[2][2] = " ligar ";
		matrix[3][2] = " jugar ";
		
		matrix[0][3] = " suave ";
		matrix[1][3] = " lento ";
		matrix[2][3] = " rapido ";
		matrix[3][3] = " fuelte ";
		
		matrix[0][4] = " hasta que salga el sol ";
		matrix[1][4] = " toda la noche ";
		matrix[2][4] = " hasta el amanecer ";
		matrix[3][4] = " todo el dia ";
		
		matrix[0][5] = " sin anestesia ";
		matrix[1][5] = " sin complomiso ";
		matrix[2][5] = " feis to feis ";
		matrix[3][5] = " sin miedo ";
		
		for(int i = 0; i<4; i++ ) {  //i permite 
			
				estrofa += matrix[rand.nextInt(4)][0]+matrix[rand.nextInt(4)][1]+matrix[rand.nextInt(4)][2]+matrix[rand.nextInt(4)][3]+matrix[rand.nextInt(4)][4]
						+matrix[rand.nextInt(4)][5]+"\n";
				
		}
		return estrofa;
		
	}
	
	
	
	
}
