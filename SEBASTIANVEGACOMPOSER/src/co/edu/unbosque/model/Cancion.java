package co.edu.unbosque.model;

public class Cancion {
	
	private String[][] cuadroR = 
			{{"Mami ","yo quiero ","encendelte ","suave ","hasta que salga el sol ","sin anestesia"},
			{"Beibe ","yo puedo ","amalte ","lento ","toda la noche ", "sin compromiso"},
			{"Princess ","yo vengo a ", "ligar ", "rapido ","hasta el amanecel ","feis to feis"},
			{"Morena ","voy a ","jugar ","fuelte ","todo el dia ", "sin miedo"}, {" "," "," "," "," "}};
	
	public String crearLetra(int estrofas, int frases) {
		
		String cancion = "";
		int cont = 0;
		int lineas = 0;
		
		while (cont++ < estrofas) {
			
			lineas = 0;
			
		while (lineas++ < frases) {
			
		for (int i = 0;i<6;i++) {
			
			int rand = (int)(Math.random()*4);
			cancion += cuadroR[rand][i];
			
		}
		cancion += "\n";
		}
		cancion += "\n";
		}
		return cancion;
	}
}
