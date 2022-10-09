package co.edu.unbosque.Model;
import java.util.concurrent.ThreadLocalRandom;
public class Letra {
	
 
	
	  private String letras;
	    private String Frase;
	    private String parrafo;
		private String[] frase1={"Mami ", "Bebé ", "Princess ","beibi "};
		private String[] frase2={"Yo quielo ", "Voy a por ", "Yo vengo ","Yo puedo "};
		private String[] frase3={"Encendelte ", "Amalte ", "Ligar ","Jugal "};
		private String[] frase4={"Suave ","Lento ", "lapido ", "fuelte "};
		private String[] frase5={"Hata que salga el sol ","Toa la noche ","Hasta el manecel ","to el día "};
        private String[] frase6={"Sin anestecia ","Sincompromiso ","Feis to feis ","Sin miedo al exito "};
    
	
	
	public Letra() {
		this.letras="";
		this.parrafo="";
		this.Frase="";
	}
	 public String Cancion(){
			int num1=random(0,frase1.length-1);
			int num2=random(0,frase2.length-1);
			int num3=random(0,frase3.length-1);
			int num4=random(0,frase4.length-1);
			int num5=random(0,frase5.length-1);
			int num6=random(0,frase6.length-1);
		    String palabra1=frase1[num1];
			String palabra2=frase2[num2];
			String palabra3=frase3[num3];
			String palabra4=frase4[num4];
			String palabra5=frase5[num5];
			String palabra6=frase6[num6];
			
			Frase = "";
			this.Frase = palabra1+palabra2+palabra3+palabra4+palabra5+palabra6;
				 
			return Frase;
		 
	 }
	 public static int random(int i, int j) {
			// TODO Auto-generated method stub
		 
		 return ThreadLocalRandom.current().nextInt(i,j+ 1);
		}


	 public String generarParrafo() {
			parrafo= "";
			for(int i = 1; i < 5; i ++) {
		    parrafo=parrafo + "\n" + 
		    Cancion();
			}
			return this.parrafo;
	 }
			public String generarletra() {
				for(int j = 1; j < 4; j++) {
					letras = letras + "\n" +
						  generarParrafo();
				}
				return letras;
		
	}
			public String getLetras() {
				return letras;
			}
			public void setLetras(String letras) {
				this.letras = letras;
			}
			public String getFrase() {
				return Frase;
			}
			public void setFrase(String frase) {
				Frase = frase;
			}
			public String getParrafo() {
				return parrafo;
			}
			public void setParrafo(String parrafo) {
				this.parrafo = parrafo;
			}
			public String[] getFrase1() {
				return frase1;
			}
			public void setFrase1(String[] frase1) {
				this.frase1 = frase1;
			}
			public String[] getFrase2() {
				return frase2;
			}
			public void setFrase2(String[] frase2) {
				this.frase2 = frase2;
			}
			public String[] getFrase3() {
				return frase3;
			}
			public void setFrase3(String[] frase3) {
				this.frase3 = frase3;
			}
			public String[] getFrase4() {
				return frase4;
			}
			public void setFrase4(String[] frase4) {
				this.frase4 = frase4;
			}
			public String[] getFrase5() {
				return frase5;
			}
			public void setFrase5(String[] frase5) {
				this.frase5 = frase5;
			}
			public String[] getFrase6() {
				return frase6;
			}
			public void setFrase6(String[] frase6) {
				this.frase6 = frase6;
			}
			
		
}


