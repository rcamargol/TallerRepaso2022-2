package co.edu.unbosque.model;

import java.util.concurrent.ThreadLocalRandom;

public class CreadorCanciones {

		
		private String palabras1[] = {"Princess ", "Mami ", "Bebe ", "chula "} ;
		private String palabras2[] = {"yo quiero ", "voy a ", "yo puedo ", "yo vengo a "} ;
		private String palabras3[] = {"encendelte ", "amalte ", "ligal ", "jugal "} ;
		private String palabras4[] = {"suave ", "lento ", "rapido ", "fuelte "} ;
		private String palabras5[] = {"hasta que salga el sol ", "toda la noche ", "hasta el amanecel ", "todo el dia "} ;
		private String palabras6[] = {"sin anestesia.", "sin complomiso.", "feis to feis.", "sin miedo."} ;
		private String frase;
		private String estrofa;
		private String cancion;
		
		public CreadorCanciones() {
			this.frase = "";
			this.estrofa = "";
			this.cancion = "";
		}
		
		public String crearFrase() {
			this.frase = "";
			int num1 = numAleatorio(0, palabras1.length - 1);
			int num2 = numAleatorio(0, palabras2.length - 1);
			int num3 = numAleatorio(0, palabras3.length - 1);
			int num4 = numAleatorio(0, palabras4.length - 1);
			int num5 = numAleatorio(0, palabras5.length - 1);
			int num6 = numAleatorio(0, palabras6.length - 1);

			String palabraAleatoria = palabras1[num1];
			String palabraAleatoria2 = palabras2[num2];
			String palabraAleatoria3 = palabras3[num3];
			String palabraAleatoria4 = palabras4[num4];
			String palabraAleatoria5 = palabras5[num5];
			String palabraAleatoria6 = palabras6[num6];
			
			this.frase = palabraAleatoria + palabraAleatoria2 + palabraAleatoria3 + palabraAleatoria4 + palabraAleatoria5 + palabraAleatoria6;

			return this.frase;
			}

			public static int numAleatorio(int minimo, int maximo) {
			
			return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
			}
		
		public String crearEstrofa() {
			this.estrofa = "";
			for(int i = 1; i <= 4; i ++) {
				this.estrofa = this.estrofa + "\n" + 
						  crearFrase();
			}
			return this.estrofa;
		}
		
		public String crearCancion() {
			for(int j = 1; j <= 3; j++) {
			this.cancion = this.cancion + "\n" +
					 crearEstrofa();
			}
			return this.cancion;
		}

		public String[] getPalabras1() {
			return palabras1;
		}

		public void setPalabras1(String[] palabras1) {
			this.palabras1 = palabras1;
		}

		public String[] getPalabras2() {
			return palabras2;
		}

		public void setPalabras2(String[] palabras2) {
			this.palabras2 = palabras2;
		}

		public String[] getPalabras3() {
			return palabras3;
		}

		public void setPalabras3(String[] palabras3) {
			this.palabras3 = palabras3;
		}

		public String[] getPalabras4() {
			return palabras4;
		}

		public void setPalabras4(String[] palabras4) {
			this.palabras4 = palabras4;
		}

		public String[] getPalabras5() {
			return palabras5;
		}

		public void setPalabras5(String[] palabras5) {
			this.palabras5 = palabras5;
		}

		public String[] getPalabras6() {
			return palabras6;
		}

		public void setPalabras6(String[] palabras6) {
			this.palabras6 = palabras6;
		}

		public String getFrase() {
			return frase;
		}

		public void setFrase(String frase) {
			this.frase = frase;
		}

		public String getEstrofa() {
			return estrofa;
		}

		public void setEstrofa(String estrofa) {
			this.estrofa = estrofa;
		}

		public String getCancion() {
			return cancion;
		}

		public void setCancion(String cancion) {
			this.cancion = cancion;
		}
}

	



	
