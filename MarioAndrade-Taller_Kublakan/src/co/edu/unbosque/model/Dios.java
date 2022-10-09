package co.edu.unbosque.model;

public class Dios {

	private Kira kira;
	private Astar astar;
	private Renk renk;
	private Mario yo;
	
	public String kira(int edad, double estatura, String colojos, String alma, String magia, String luz) {
		kira = new Kira(edad, estatura, colojos, alma,magia,luz);
		return "kira es una maga que servia al palcio y al mundo"+"\n"+
				"Tiene una edad de "+edad+"\n"+
				"Su estatura es : "+estatura+"\n"+
				"Tiene ojos de color "+colojos+"\n"+
				"Podia usar "+magia+"\n"+
				"Invocaba una "+luz+"\n"+
				"Su alma es tan limpia que brilla con el sol ";
				
}
	public String astar(int edad, double estatura, String colojos, String alma, String surfuerza,String telequinesis) {
		astar = new Astar(edad,estatura,colojos,alma);
		return "Astar ayuda en las guerras o batallas que se presentan del palacio"+"\n"+	
		"Tiene una edad de "+edad+"\n"+
		"Su estatura es : "+estatura+"\n"+
		"Tiene ojos de color "+colojos+"\n"+
		"El podia usar "+surfuerza+"\n"+
		"Poseia una "+telequinesis+"\n"+
		"Su alma es tan calida como el mismo sol";
		}
	public String Renk(int edad, double estatura, String colojos, String alma, String guardian, String jefe) {
		
		renk = new Renk(edad,estatura,colojos,alma,guardian,jefe);
		return "Renk fue en algun dia de su vida la mano derecha del rey "+"\n"+
		"Tiene una edad de "+edad+"\n"+
		"Su estatura es: "+estatura+"\n"+
		"Tiene ojos de color "+colojos+"\n"+
		"El es "+guardian+"\n"+
		"Es el "+jefe+"\n"+
		"Su alma es tan oscura y fria como la noche misma ";
}
	public String mario(int edad, double estatura, String colojos, String alma, String adconocimiento,String familia,String leer, String escribir, String vendedor) {
		yo = new Mario(edad,estatura,colojos,alma,adconocimiento,familia,leer,escribir,vendedor);
		return "Mario es un escritor que narra los hechos de los heroes y sus azañas"+"\n"+
		"Tiene una edad de "+edad+"\n"+
		"Su estatura es: "+estatura+"\n"+
		"Tiene color de ojos "+colojos+"\n"+
		"Podia "+leer+"\n"+
		"Tenia la habilidad "+escribir+"\n"+
		"Tiene una "+vendedor+"\n"+
		"El alma es dulce como el arima de una rosa";
	}
}

