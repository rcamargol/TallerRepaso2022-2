package co.edu.unbosque.model;

import java.util.Random;

public class TablaRegueton {

	private String[][] tabla;
	private String estrofa;
	private String union;
	private int numEstrofa;
	private int numFrase;
	
	
	public TablaRegueton() {
		tabla = new String [4][6];
	}
	
	public String generarLetra() {
		Random r = new Random();
		estrofa = "";
		union = "";
		
		tabla[0][0]= " mami ";
		tabla[1][0]= " bebe ";
		tabla[2][0]= " princess ";
		tabla[3][0]= " mami ";
		
		tabla[0][1]= " yo quiero ";
		tabla[1][1]= " yo puedo ";
		tabla[2][1]= " yo vengo a ";
		tabla[3][1]= " voy a ";
		
		tabla[0][2]= " encenderte ";
		tabla[1][2]= " amarte ";
		tabla[2][2]= " ligar ";
		tabla[3][2]= " jugar ";
		
		tabla[0][3]= " suave ";
		tabla[1][3]= " lento ";
		tabla[2][3]= " rapido ";
		tabla[3][3]= " fuerte ";
		
		tabla[0][4]= " hasta que salga el sol ";
		tabla[1][4]= " toda la noche ";
		tabla[2][4]= " hasta el amanecer ";
		tabla[3][4]= " todo el dia ";
		
		tabla[0][5]= " sin anestesia ";
		tabla[1][5]= " sin compromiso ";
		tabla[2][5]= " feis to feis ";
		tabla[3][5]= " sin miedo ";
		
		
		for(int i = 0; i<numEstrofa; i++) {
			for (int j = 0; j<numFrase; j++) {
			union += tabla[r.nextInt(4)][0]+
					 tabla[r.nextInt(4)][1]+
					 tabla[r.nextInt(4)][2]+
					 tabla[r.nextInt(4)][3]+
					 tabla[r.nextInt(4)][4]+
					 tabla[r.nextInt(4)][5]+"\n";
			
			}
			estrofa += union+"\n"; 
			union="";
		}	
		return estrofa;
	}

	public int getNumEstrofa() {
		return numEstrofa;
	}

	public void setNumEstrofa(int numEstrofa) {
		this.numEstrofa = numEstrofa;
	}

	public int getNumFrase() {
		return numFrase;
	}

	public void setNumFrase(int numFrase) {
		this.numFrase = numFrase;
	}

	
	
}
