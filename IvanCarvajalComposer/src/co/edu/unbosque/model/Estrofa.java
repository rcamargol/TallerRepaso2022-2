package co.edu.unbosque.model;

import java.util.Random;

public class Estrofa {

	private String estrofa;
	
	public Estrofa() {
		estrofa = "";
	}
	
	public void alterarEstrofa() {
            String [][] parrafo = new String [4][6];
    		Random random = new Random ();
    		String cancion1 = "";
    		String cancion2 = "";
    		String cancion3 = "";
    		String cancion4 = "";
    		
		
		parrafo[0][0] = "Mami";
		parrafo[0][1] = "yo quiero";
		parrafo[0][2] = "encendelte";
		parrafo[0][3] = "suave";
		parrafo[0][4] = "hasta que salga el sol";
		parrafo[0][5] = "sin anestesia";
		
		parrafo[1][0] = "Bebe";
		parrafo[1][1] = "yo puedo";
		parrafo[1][2] = "amalte";
		parrafo[1][3] = "lento";
		parrafo[1][4] = "toda la noche";
		parrafo[1][5] = "sin complomiso";
		
		parrafo[2][0] = "Plincess";
		parrafo[2][1] = "yo vengo";
		parrafo[2][2] = "a ligal";
		parrafo[2][3] = "rapido";
		parrafo[2][4] = "hasta el amanecel";
		parrafo[2][5] = "feis to feis";
		
		parrafo[3][0] = "Mamasota";
		parrafo[3][1] = "voy a";
		parrafo[3][2] = "jugal";
		parrafo[3][3] = "fuelte";
		parrafo[3][4] = "todo el dia";
		parrafo[3][5] = "sin miedo";
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
			     cancion1 =  parrafo[random.nextInt(4)][0] + " " +
			                 parrafo[random.nextInt(4)][1] + " " +
			    		     parrafo[random.nextInt(4)][2] + " " +
			                 parrafo[random.nextInt(4)][3] + " " +
			                 parrafo[random.nextInt(4)][4] + " " +
					    	 parrafo[random.nextInt(4)][5] ;
			     
			     cancion2 = parrafo[random.nextInt(4)][0] + " " +
		                    parrafo[random.nextInt(4)][1] + " " +
		    		        parrafo[random.nextInt(4)][2] + " " +
		                    parrafo[random.nextInt(4)][3] + " " +
		                    parrafo[random.nextInt(4)][4] + " " +
				    	    parrafo[random.nextInt(4)][5] ;
			     
			     cancion3 = parrafo[random.nextInt(4)][0] + " " +
		                    parrafo[random.nextInt(4)][1] + " " +
		    		        parrafo[random.nextInt(4)][2] + " " +
		                    parrafo[random.nextInt(4)][3] + " " +
		                    parrafo[random.nextInt(4)][4] + " " +
				    	    parrafo[random.nextInt(4)][5] ;
			     
			     cancion4 = parrafo[random.nextInt(4)][0] + " " +
		                    parrafo[random.nextInt(4)][1] + " " +
		    		        parrafo[random.nextInt(4)][2] + " " +
		                    parrafo[random.nextInt(4)][3] + " " +
		                    parrafo[random.nextInt(4)][4] + " " +
				    	    parrafo[random.nextInt(4)][5] ;
			     
			     estrofa = cancion1 +"\n"+ cancion2 +"\n"+ cancion3 +"\n"+ cancion4;
			}
		}
	
	}

	public String getEstrofa() {
		return estrofa;
	}

	public void setEstrofa(String estrofa) {
		this.estrofa = estrofa;
	}
}
